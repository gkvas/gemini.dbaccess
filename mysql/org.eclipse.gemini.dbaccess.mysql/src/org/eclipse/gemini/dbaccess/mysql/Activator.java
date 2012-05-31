package org.eclipse.gemini.dbaccess.mysql;

import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import org.osgi.service.jdbc.DataSourceFactory;

import org.eclipse.gemini.dbaccess.mysql.service.MySqlServiceProperties;

/**
 * Creates a {@link DataSourceFactory} for MySQL JDBC driver.
 */
public class Activator implements BundleActivator {
    
    private ServiceRegistration dsfService;	
	
    public void start(BundleContext context) throws Exception {
        Hashtable<String,String> props = new Hashtable<String,String>();
        props.put(DataSourceFactory.OSGI_JDBC_DRIVER_NAME, 
                  MySqlServiceProperties.MYSQL_DRIVER_NAME);    
        props.put(DataSourceFactory.OSGI_JDBC_DRIVER_CLASS,
        		MySqlServiceProperties.MYSQL_DRIVER_CLASS);        
        dsfService = context.registerService( 
                DataSourceFactory.class.getName(),
                new ClientDataSourceFactory(),
                props);

    }

    public void stop(BundleContext context) throws Exception {
        if (dsfService != null) {
            dsfService.unregister();
        }
    }
}
