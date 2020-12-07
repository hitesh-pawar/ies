package com.ashokit.ies.generators;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CaseNoGenerator implements IdentifierGenerator {

	private final String SQL_GET_CASE_NO_SEQUENCE = "select next value for hibernate_sequence";
	private final String PREFIX = "100";
	String suffix = null;

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		try {
			Connection connection = session.connection();
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(SQL_GET_CASE_NO_SEQUENCE);
			if (rs.next()) {
				long caseNo = rs.getInt(1);
				suffix = String.valueOf(caseNo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return PREFIX + suffix;
	}

}
