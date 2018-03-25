package com.example.demo.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	@Bean
	public FilterRegistrationBean characterEncodingFilterRegistration() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		// 注入过滤器
		registration.setFilter(characterEncodingFilter());
		// 拦截规则
		registration.addUrlPatterns("/*");
		// 过滤器名称
		registration.setName("CharacterEncodingFilter");
		// 过滤器顺序
		registration.setOrder(1);
		return registration;
	}

	@Bean
	public CharacterEncodingFilter characterEncodingFilter() {
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding("UTF-8");
		characterEncodingFilter.setForceEncoding(true);
		return characterEncodingFilter;
	}
}
