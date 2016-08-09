package com.zhuxiao;
/**
 * 动态代理需要的接口 
 * @author zhuxiao
 */
public interface NeedInterface {
	public int findLoveByName(String name);
	public boolean deleteLoveByName(String name);
	public boolean addLoveByName(String name);
}
