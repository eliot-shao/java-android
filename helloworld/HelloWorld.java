package helloworld;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HelloWorld {
	
	public static void main (String []args) 
	{
		
		System.out.println("start hello world!");
		
		//try catch 是java的一种异常处理机制，防止程序运行出错
		try {
			//代码区
			System.out.println("input data1:\n");
			//从 标准输入(system.in)获得数据 转换成 float 类型 并打印到标准输出（system.out）
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String string1 = in.readLine();
			System.out.println("input data1 is :"+string1+"\n");
			System.out.println("input data2:\n");
			String string2 = in.readLine();
			System.out.println("input data2 is :"+string2+"\n");
		}catch(Exception e) {
			//异常处理
			
		}
		//一个简单的类调用，这个类属于HelloWorld所在的包
		function1 test = new function1();
		test.temp = "fuck off!";
		test.Test();
		
		
	}
} 
