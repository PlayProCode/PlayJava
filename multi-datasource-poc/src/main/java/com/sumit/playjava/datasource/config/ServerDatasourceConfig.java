package com.sumit.playjava.datasource.config;

import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import com.sumit.playjava.server.Server;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.sumit.playjava.server", entityManagerFactoryRef = "serverEntityManagerFactory", transactionManagerRef = "serverTransactionManager")
public class ServerDatasourceConfig {

	@Bean
	@ConfigurationProperties("spring.datasource.server")
	public DataSourceProperties serverDataSourceProperties() {
		return new DataSourceProperties();
	}

	@Bean
	@ConfigurationProperties("spring.datasource.server.configuration")
	public DataSource serverDataSource() {
		return serverDataSourceProperties().initializeDataSourceBuilder().type(HikariDataSource.class).build();
	}

	@Bean(name = "serverEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean serverEntityManagerfactory(EntityManagerFactoryBuilder builder) {
		return builder.dataSource(serverDataSource()).packages(Server.class).build();
	}

	@Bean(name = "serverTransactionManager")
	public PlatformTransactionManager serverTransactionManager(
			final @Qualifier("serverEntityManagerFactory") LocalContainerEntityManagerFactoryBean serverEntityManagerFactory) {
		return new JpaTransactionManager(serverEntityManagerFactory.getObject());
	}

}
