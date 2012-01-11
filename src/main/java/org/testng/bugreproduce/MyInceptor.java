package org.testng.bugreproduce;

import java.util.List;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;

public class MyInceptor implements IMethodInterceptor{
	private static int num = 0;
	
	public List<IMethodInstance> intercept(List<IMethodInstance> methods,
			ITestContext context) {
		System.out.println("I was called " + ++num + " times");
		System.out.println("-------------STACK TRACE-------------");
		StackTraceElement[] traces = Thread.currentThread().getStackTrace();
		for(StackTraceElement trace :  traces){
			System.err.println(trace);
					}
		return methods;
	}
}
