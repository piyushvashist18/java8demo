package com.java8.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.java8.demo.file.operations.FileOps;
import com.java8.demo.streams.StreamOperations;

@SpringBootApplication
public class Java8DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Java8DemoApplication.class, args);
		StreamOperations so = new StreamOperations();
		FileOps ops = new FileOps();
		so.forEachDemo();
		so.mapDemo();
		so.ops();
		ops.fileRead();
	}

}
