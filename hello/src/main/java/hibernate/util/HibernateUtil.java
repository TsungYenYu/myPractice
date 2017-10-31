/*
 * This class not only produces the global org.hibernate.SessionFactory reference in its static initializer;
 * it also hides the fact that it uses a static singleton
*/

package hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory;

    
    static {
        try {
            
            Configuration configuration = new Configuration();

            
            configuration.setProperty("hibernate.connection.driver_class","oracle.jdbc.driver.OracleDriver");
            configuration.setProperty("hibernate.connection.url", "jdbc:oracle:thin:@localhost:1521:XE");                                
            configuration.setProperty("hibernate.connection.username", "BT_TEC");     
            configuration.setProperty("hibernate.connection.password", "123456");
            
//            configuration.setProperty("hibernate.connection.provider_class", "org.hibernate.connection.C3P0ConnectionProvider");
//            configuration.setProperty("hibernate.c3p0.min_size", "5");
//            configuration.setProperty("hibernate.c3p0.max_size", "20");
//            configuration.setProperty("hibernate.c3p0.timeout", "1800");
//            configuration.setProperty("hibernate.c3p0.max_statements", "50");
            
          
            configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.OracleDialect");
            configuration.setProperty("hibernate.show_sql", "true");
            configuration.setProperty("hibernate.cache.provider_class", "org.hibernate.cache.NoCacheProvider");
            configuration.setProperty("hibernate.transaction.factory_class", "org.hibernate.transaction.JDBCTransactionFactory");
            configuration.setProperty("hibernate.current_session_context_class", "thread");
            
            configuration.addAnnotatedClass (com.practice.vo.DataPracticeVO.class);
            configuration.addAnnotatedClass (com.practice.vo.TestTableVO.class);
            
            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
            sessionFactory = configuration.buildSessionFactory(builder.build());
            
        } catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
   

    

}