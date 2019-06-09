package com.starter.runner;

import java.security.acl.NotOwnerException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Set<String> optNames = args.getOptionNames();
		System.out.println("Optional Arguments:");
		System.out.println(optNames);
		List<String> optValues = args.getOptionValues("profiles");
		System.out.println("Optional Values:");
		System.out.println(optValues);
		System.out.println("Non Optional Arguments:");
		List<String> nonOptArgs = args.getNonOptionArgs();
		System.out.println(nonOptArgs);
		String[] lst = args.getSourceArgs();
		System.out.println("Source Arguments:");
		System.out.println(Arrays.asList(lst));
		
	}

}
