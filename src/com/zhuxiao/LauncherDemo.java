package com.zhuxiao;

import java.lang.reflect.Proxy;

public class LauncherDemo {

	public static void main(String[] args) {
		MyRealClass myRealClass = new MyRealClass();
		DynamicHanlder dynamicHanlder = new DynamicHanlder(myRealClass);
		NeedInterface proxyInstance = (NeedInterface) Proxy
				.newProxyInstance(dynamicHanlder.getClass().getClassLoader(),myRealClass.getClass().getInterfaces() , dynamicHanlder);
		System.out.println("proxyInstance:"+proxyInstance.getClass());
		proxyInstance.addLoveByName("love1");
		proxyInstance.addLoveByName("love2");
		int findLoveByName = proxyInstance.findLoveByName("love2");
		System.out.println(" findLoveByName :"+findLoveByName);
		proxyInstance.deleteLoveByName("love2");
	    findLoveByName = proxyInstance.findLoveByName("love2");
		System.out.println(" findLoveByName :"+findLoveByName);
	}

}
