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
package org.eclipse.gemini.dbaccess.h2.service;

public class H2ServiceProperties {
	// Register a service under each of the following driver class names
	public static final String H2_DRIVER_CLASS = "org.h2.Driver";

	// All H2 DataSourceFactory services will have their
	// DataSourceFactory.OSGI_JDBC_DRIVER_NAME property set to this driver name
	public static final String H2_DRIVER_NAME = "H2";
}
