/*******************************************************************************
 * Copyright (c) 2011 Gernot Kvas
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gernot Kvas - initial API and implementation and/or initial documentation
 *******************************************************************************/

package org.eclipse.gemini.dbaccess.h2;

import java.sql.Driver;
import java.sql.SQLException;

import javax.sql.ConnectionPoolDataSource;
import javax.sql.DataSource;
import javax.sql.XADataSource;

import org.eclipse.gemini.dbaccess.AbstractDataSourceFactory;
import org.h2.jdbcx.JdbcDataSource;

/**
 * A factory for creating H2 data sources that connect to a H2 database either
 * in file, memory or server mode. The properties specified in the create
 * methods determine how the created object is configured.
 * 
 * Sample code for obtaining a H2 server data source:
 * 
 * This service supports a URL-based data source. The following 3 properties
 * need to provided.
 * 
 * props.put(DataSourceFactory.JDBC_URL, "jdbc:h2:tcp://dbserv:8084/sample");
 * props.put(DataSourceFactory.JDBC_USER, "mike");
 * props.put(DataSourceFactory.JDBC_PASSWORD, "password");
 * 
 */
public class H2DataSourceFactory extends AbstractDataSourceFactory {

	public H2DataSourceFactory() {
	}

	@Override
	public Driver newJdbcDriver() throws SQLException {
		return new org.h2.Driver();
	}

	@Override
	public DataSource newDataSource() throws SQLException {
		return new JdbcDataSource();
	}

	@Override
	public ConnectionPoolDataSource newConnectionPoolDataSource()
			throws SQLException {
		return new JdbcDataSource();

	}

	@Override
	public XADataSource newXADataSource() throws SQLException {
		return new JdbcDataSource();
	}
}