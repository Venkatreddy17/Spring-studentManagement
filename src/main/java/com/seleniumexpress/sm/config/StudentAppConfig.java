package com.seleniumexpress.sm.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.seleniumexpress"})
public class StudentAppConfig {
   
	@Bean
	public InternalResourceViewResolver viewResolver() {
		
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource());
		
		return jdbcTemplate;
	}
	@Bean
	public DataSource dataSource(){
		
		 DriverManagerDataSource dataSource=new DriverManagerDataSource();
		 
		 //set the db info the datasource object
		 dataSource.setUsername("root");
		 dataSource.setPassword("Venkat@2409");
		 dataSource.setUrl("jdbc:mysql://localhost:3306/seleniumexpress?useSSL=false");
		 dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		 return dataSource;
	}
}
