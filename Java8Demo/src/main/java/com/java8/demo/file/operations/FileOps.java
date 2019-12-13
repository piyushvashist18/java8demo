package com.java8.demo.file.operations;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileOps {

	public void fileRead() {

		Path filePath = Paths.get("c:/tmp", "data.txt");
		try (Stream<String> lines = Files.lines(filePath)) {
			lines.forEach(l -> System.out.println(l));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
