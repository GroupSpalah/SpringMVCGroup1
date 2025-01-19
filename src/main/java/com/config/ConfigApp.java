package com.config;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.TransactionManager;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


import javax.sql.DataSource;

@Configuration
@EnableWebMvc// activation MVC pattern
@ComponentScan(basePackages = {
        "com.controller",
        "com.service",
        "com.homeworks.hw_29_12_24.task2.laptop.controller",
        "com.homeworks.hw_29_12_24.task1.controller"/*"com.handlers_exceptions"*/})
@EnableJpaRepositories(basePackages = "com.repository")
public class ConfigApp implements WebMvcConfigurer {

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver =
                new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
//        resolver.setSuffix(".jsp");
        resolver.setSuffix(".html");
        resolver.setExposeContextBeansAsAttributes(true);//This will make all such beans accessible in plain ${...}
        // expressions in a JSP 2.0 page
        return resolver;
    }

    @Bean
    public TransactionManager transactionManager(EntityManagerFactory factory) {
        JpaTransactionManager manager = new JpaTransactionManager();

        manager.setEntityManagerFactory(factory);
        manager.setDataSource(dataSource());

        return manager;
    }

    //ошибка подключения к sql // ++
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUsername("root");
//        dataSource.setPassword("af66s60dk29l97j;");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/LearnJPA?serverTimezone=Europe/Kiev");
        dataSource.setPassword("Suntour123");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring-mvc-group1?serverTimezone=UTC");
        return dataSource;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabase(Database.MYSQL);
        adapter.setShowSql(true);
        adapter.setDatabasePlatform("org.hibernate.dialect.MySQL8Dialect");
        adapter.setGenerateDdl(true);
        return adapter;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean emfb = new LocalContainerEntityManagerFactoryBean();

        emfb.setDataSource(dataSource());
        emfb.setJpaVendorAdapter(jpaVendorAdapter());
        emfb.setPackagesToScan("com.domain");

        return emfb;
    }
}
