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

import java.util.Hashtable;

import org.eclipse.gemini.dbaccess.h2.service.H2ServiceProperties;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.jdbc.DataSourceFactory;

public class Activator implements BundleActivator {

	private ServiceRegistration service;

	public void start(BundleContext context) throws Exception {
		System.out.println("Gemini DBAccess - H2 JDBC starting");
		Hashtable<String, String> props = new Hashtable<String, String>();
		props.put(DataSourceFactory.OSGI_JDBC_DRIVER_NAME,
				H2ServiceProperties.H2_DRIVER_NAME);

		// Register the embedded driver
		props.put(DataSourceFactory.OSGI_JDBC_DRIVER_CLASS,
				H2ServiceProperties.H2_DRIVER_CLASS);
		service = context.registerService(DataSourceFactory.class.getName(),
				new H2DataSourceFactory(), props);

	}

	public void stop(BundleContext context) throws Exception {
		if (service != null) {
			service.unregister();
		}
	}

}
