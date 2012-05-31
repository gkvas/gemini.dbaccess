
Gemini DBAccess 1.1 Milestone M1 - July 26, 2012

This milestone provides you with database access to the server Derby database version 10.8.2.2 
To access other versions of Derby you may need to replace the derby.jar and derbyclient.jar 
driver jars inside the org.apache.derby bundle with the version that you require.

For an example of how to access a database connection from an OSGi program run the sample program.
To do this, simply install and start the following bundles that are included in this distribution:

Derby:
org.apache.derby
osgi.enterprise
org.eclipse.gemini.dbaccess.derby
org.eclipse.gemini.dbaccess.util
org.eclipse.gemini.dbaccess.samples


MySQL:
osgi.enterprise
org.eclipse.gemini.dbaccess.mysql
org.eclipse.gemini.dbaccess.util
org.eclipse.gemini.dbaccess.samples
mysql-connector-java-5.1.20-bin.jar (not included, please download here: http://www.mysql.com/downloads/connector/j/)





