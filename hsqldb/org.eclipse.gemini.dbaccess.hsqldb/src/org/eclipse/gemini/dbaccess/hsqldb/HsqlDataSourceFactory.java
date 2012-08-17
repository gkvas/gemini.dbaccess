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

package org.eclipse.gemini.dbaccess.hsqldb;

import java.sql.Driver;
import java.sql.SQLException;

import javax.sql.ConnectionPoolDataSource;
import javax.sql.DataSource;
import javax.sql.XADataSource;

import org.eclipse.gemini.dbaccess.AbstractDataSourceFactory;
import org.hsqldb.jdbc.JDBCDataSource;
import org.hsqldb.jdbc.pool.JDBCPooledDataSource;
import org.hsqldb.jdbc.pool.JDBCXADataSource;

/**
 * A factory for creating HSQLDB data sources that connect to a HSQLDB database
 * either in file, memory or server mode. The properties specified in the create
 * methods determine how the created object is configured.
 * 
 * Sample code for obtaining a HSQLDB server data source:
 * 
 * This service supports a URL-based data source. The following 3 properties
 * need to provided.
 * 
 * props.put(DataSourceFactory.JDBC_URL, "jdbc:hsqldb:hsql://localhost/enrolments");
 * props.put(DataSourceFactory.JDBC_USER, "user");
 * props.put(DataSourceFactory.JDBC_PASSWORD, "password");
 * 
 */
public class HsqlDataSourceFactory extends AbstractDataSourceFactory {

	public HsqlDataSourceFactory() {
	}

	@Override
	public Driver newJdbcDriver() throws SQLException {
		return new org.hsqldb.jdbc.JDBCDriver();
	}

	@Override
	public DataSource newDataSource() throws SQLException {
		return new JDBCDataSource();
	}

	@Override
	public ConnectionPoolDataSource newConnectionPoolDataSource()
			throws SQLException {
		return new JDBCPooledDataSource();

	}

	@Override
	public XADataSource newXADataSource() throws SQLException {
		return new JDBCXADataSource();
	}
}
