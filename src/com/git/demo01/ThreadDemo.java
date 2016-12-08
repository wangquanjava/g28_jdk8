package com.git.demo01;

import org.junit.Test;

/**
 * 1.这里使用()->{System.out.println("lambda线程执行");}来替换匿名内部类，是因为jdk能判断种类需要的参数是Runable接口的实现类
 * 2.而且Runable接口只有一个抽象方法,所以这里可以直接写
 * 3.(实现方法的参数列表)->{方法内容}
 */
public class ThreadDemo {
	@Test
	public void demo01(){
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("一个线程执行！");
			}
		}).start();
	}
	
	@Test
	public void demo02(){
		new Thread(() -> {System.out.println("lambda线程执行");}).start();;
	}
}
