package com.ashokit.ies.generators;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.stereotype.Component;

@Component
public class AppRegNoGenerator implements IdentifierGenerator {

	private final String SQL_GET_APP_REG_SEQUENCE = "select next value for app_reg_sequence";
	private final String PREFIX = "AR";
	String suffix = null;

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {

		try {
			Connection connection = session.connection();
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(SQL_GET_APP_REG_SEQUENCE);
			if (rs.next()) {
				long appRegNO = rs.getInt(1);
				suffix = String.valueOf(appRegNO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return PREFIX + suffix;
	}

}
