package org.hsqldb.jdbc.pool;

import java.io.PrintWriter;
import java.sql.SQLException;

import javax.sql.XAConnection;
import javax.sql.XADataSource;

public class JDBCXADataSource implements XADataSource {

	@Override
	public PrintWriter getLogWriter() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getLoginTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setLogWriter(PrintWriter arg0) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setLoginTimeout(int arg0) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public XAConnection getXAConnection() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XAConnection getXAConnection(String arg0, String arg1)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
