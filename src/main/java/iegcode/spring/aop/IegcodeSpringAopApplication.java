package iegcode.spring.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class IegcodeSpringAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(IegcodeSpringAopApplication.class, args);
	}

}
