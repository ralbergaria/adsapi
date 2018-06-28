package org.ac.ads.adsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="org.ac.ads.adsapi")
@SpringBootApplication
public class AdsapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdsapiApplication.class, args);
	}
}
