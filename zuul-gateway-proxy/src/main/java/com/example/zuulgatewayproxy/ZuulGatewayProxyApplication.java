package com.example.zuulgatewayproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.example.zuulgatewayproxy.filters.ErrorFilter;
import com.example.zuulgatewayproxy.filters.PostFilter;
import com.example.zuulgatewayproxy.filters.PreFilter;
import com.example.zuulgatewayproxy.filters.RouteFilter;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableZuulProxy
@EnableSwagger2
public class ZuulGatewayProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulGatewayProxyApplication.class, args);
	}
	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}

}
