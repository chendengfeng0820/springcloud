package com.asiainfo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author: cdf
 * @create: 2020-05-31 15:40
 **/
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class DeptConsumer_80 {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer_80.class,args);
	}
}
