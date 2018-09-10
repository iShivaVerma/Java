package com.infogain.mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class JobHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap<KEY,VALUE>
		HashMap<String, String> hashMapObject=new HashMap<String,String>();
		hashMapObject.put("SA_REP", "Sales Representative");
		hashMapObject.put("FI_ACCOUNT", "Accountant");
		hashMapObject.put("SA_MAN", "Sales Manager");
		hashMapObject.put("IT_PROG", "Programmer");
		hashMapObject.put(null, "Finance Manager");
		
		String jobTitle=hashMapObject.get("FI_ACCOUNT");
		System.out.println("Value at FI_ACCOUNT is:"+jobTitle);
		
		for (String key : hashMapObject.keySet()) {
			System.out.println(key+"::"+hashMapObject.get(key));
		}
		
		System.out.println("Using Iterator");
		Set<String> setObject=hashMapObject.keySet();
		Iterator<String> iteratorObject=setObject.iterator();
		
		while(iteratorObject.hasNext()){
		String key=iteratorObject.next();
		System.out.println("Key:"+key+"\t::\t"+"Value:"+hashMapObject.get(key));
		}
	}

}
