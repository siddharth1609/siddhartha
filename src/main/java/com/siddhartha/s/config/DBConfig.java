/*
 * package com.siddhartha.s.config;
 * 
 * import java.util.Properties;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.core.env.Environment; import
 * org.springframework.jdbc.datasource.DriverManagerDataSource; import
 * org.springframework.orm.hibernate5.HibernateTransactionManager; import
 * org.springframework.orm.hibernate5.LocalSessionFactoryBean; import
 * org.springframework.transaction.annotation.EnableTransactionManagement;
 * 
 * @EnableAutoConfiguration(exclude = { // DataSourceAutoConfiguration.class, //
 * DataSourceTransactionManagerAutoConfiguration.class, //
 * HibernateJpaAutoConfiguration.class })
 * 
 * @Configuration
 * 
 * @EnableTransactionManagement public class DBConfig {
 * 
 * @Autowired private Environment env;
 * 
 * //
 * 
 * // @Autowired
 * 
 * // @Bean(name = "dataSource") // @Autowired
 * 
 * @Bean // (name = "dataSource") public javax.sql.DataSource getDataSource() {
 * DriverManagerDataSource dataSource = new DriverManagerDataSource();
 * dataSource.setDriverClassName(env.getProperty(
 * "spring.datasource.driver.class"));
 * dataSource.setUrl(env.getProperty("spring.datasource.url"));
 * dataSource.setUsername(env.getProperty("sys"));
 * dataSource.setPassword(env.getProperty("sys"));
 * 
 * System.out.println("## getDataSource: " + dataSource); return dataSource;
 * 
 * }
 * 
 * // @Autowired
 * 
 * // @Bean(name = "sessionFactory") // @Autowired
 * 
 * @Bean // (name = "sessionFactory") public org.hibernate.SessionFactory
 * getSessionFactory(javax.sql.DataSource dataSource) throws Exception {
 * 
 * Properties properties = new Properties(); properties.put("hibernate.dialect",
 * env.getProperty("spring.jpa.properties.hibernate.dialect"));
 * properties.put("hibernate.show_sql", env.getProperty("spring.jpa.show-sql"));
 * properties.put("current_session_context_class", env.getProperty(
 * "spring.jpa.properties.hibernate.current_session_context_class"));
 * 
 * LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean(); // //
 * factoryBean.setPackagesToScan(new String[] { "com.siddhartha" });
 * factoryBean.setPackagesToScan("com.siddhartha.s.config");
 * factoryBean.setDataSource(dataSource);
 * factoryBean.setHibernateProperties(properties);
 * factoryBean.afterPropertiesSet();
 * 
 * org.hibernate.SessionFactory sf = factoryBean.getObject();
 * System.out.println("## getSessionFactory: " + sf);
 * 
 * return sf;
 * 
 * }
 * 
 * // @Autowired // @Autowired
 * 
 * @Bean // (name = "transactionManager") // (name = "transactionManager")
 * public HibernateTransactionManager
 * hibernateTransactionManager(org.hibernate.SessionFactory sessionFactory) {
 * 
 * HibernateTransactionManager hibernateTransactionManager = new
 * HibernateTransactionManager(sessionFactory);
 * 
 * return hibernateTransactionManager;
 * 
 * }
 * 
 * }
 */