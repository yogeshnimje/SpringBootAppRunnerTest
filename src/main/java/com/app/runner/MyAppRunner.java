package com.app.runner;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class MyAppRunner implements ApplicationRunner {

	public void run(ApplicationArguments args) throws Exception {
		System.out.println(args);
		System.out.println(Arrays.asList(args));
	}

}
