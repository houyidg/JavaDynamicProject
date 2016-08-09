package com.zhuxiao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicHanlder implements InvocationHandler{
	private Object mSubject;
	public DynamicHanlder(Object subject){
		mSubject = subject;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("invoke proxy obj method "+method.getName()+" execute before");
		 Object invoke = method.invoke(mSubject, args);
		System.out.println("invoke proxy obj method "+method.getName()+" execute after");
		return invoke;
	}

}
