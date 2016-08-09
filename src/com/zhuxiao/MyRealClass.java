package com.zhuxiao;

import java.util.ArrayList;
import java.util.List;

public class MyRealClass implements NeedInterface{
	public List<String> loveList = new ArrayList<String>();
	public int findLoveByName(String name) {
		System.out.println("findLoveByName: name:"+name);
		int indexOf = loveList.indexOf(name);
		return indexOf;
	}

	public boolean deleteLoveByName(String name) {
		System.out.println("deleteLoveByName:name:"+name);
		return loveList.remove(name);
	}

	public boolean addLoveByName(String name) {
		System.out.println("addLoveByName:name:"+name);
		return loveList.add(name);
	}

}
