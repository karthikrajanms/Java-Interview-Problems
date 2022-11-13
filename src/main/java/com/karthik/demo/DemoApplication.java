package com.karthik.demo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

		int a = 5;
		int size = 65;
		for (int i = 0; i <a ; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2*(a-i)-1; k++) {
				System.out.print((char)(size+k)+" ");
			}
			System.out.println();

		}

    }

}
