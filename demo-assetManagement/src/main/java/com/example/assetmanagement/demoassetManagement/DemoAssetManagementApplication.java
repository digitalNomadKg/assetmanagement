package com.example.assetmanagement.demoassetManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoAssetManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAssetManagementApplication.class, args);

		System.out.println("----------------------------------------");
		System.out.println("App is running on local host: 8001");
	}

}
