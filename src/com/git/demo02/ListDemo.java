package com.git.demo02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import org.junit.Test;

public class ListDemo {
	@Test
	public void demo01(){
		List<String> list = Arrays.asList("a","b","c","d","e");
		for (String string : list) {
			System.out.println(string);
		}
	}
	
	
	@Test
	public void demo02(){
		List<String> list = Arrays.asList("a","b","c","d","e");
		list.forEach(n->System.out.println(n));
	}
}
