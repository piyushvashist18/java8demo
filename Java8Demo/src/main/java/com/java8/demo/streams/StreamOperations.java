package com.java8.demo.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class StreamOperations {

	public void forEachDemo(){
		List<Test> list = new ArrayList<>();
		
		Test t = new Test();
		t.setId(1);
		t.setData("test data1");
		
		Test t1 = new Test();
		t1.setId(2);
		t1.setData("test data2");
		
		list.add(t);
		list.add(t1);
		
		list.forEach(d -> 
			System.out.println(d.getData())
		);
		
		list.forEach(d -> d.setData(d.getData()+1));
		list.forEach(d -> 
		System.out.println(d.getData())
	);
		
	}
	
	public void mapDemo(){
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,12,13,55,5,4,3,2);
		List<Integer> l = numbers.stream().map(i->i+i).collect(Collectors.toList());
		System.out.println(l);
		List<Integer> distinct = l.stream().distinct().collect(Collectors.toList());
		System.out.println(distinct);
		List<Integer> filterData = l.stream().filter(i -> i>10).collect(Collectors.toList());
		System.out.println(filterData);
		Optional<Integer> i = l.stream().findFirst();
		if(i.isPresent()){
			System.out.println(i);
		}
	}
}
