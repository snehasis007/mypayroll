package org.sn.mypayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("org.sn.mypayroll.*")
public class MypayrollApplication {

	public static void main(String[] args) {
		SpringApplication.run(MypayrollApplication.class, args);
	}

}
