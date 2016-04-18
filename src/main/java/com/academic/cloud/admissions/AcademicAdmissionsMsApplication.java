package com.academic.cloud.admissions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AcademicAdmissionsMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcademicAdmissionsMsApplication.class, args);
	}
}
