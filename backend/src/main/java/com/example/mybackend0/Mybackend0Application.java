package com.example.mybackend0;

import com.example.mybackend0.FileUpload.FileStorageProperties;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableConfigurationProperties({
		FileStorageProperties.class
})
public class Mybackend0Application {

	public static void main(String[] args) {
		SpringApplication.run(Mybackend0Application.class, args);
	}

	@Bean
	public ModelMapper modelmapper(){
		return new ModelMapper();
	}
}
