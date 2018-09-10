package com.infogain.mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class JobObjectHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Job> hashMapObject=new HashMap<String,Job>();
		hashMapObject.put("SA_REP", new Job("Sales Representative", 10000, 100000));
		hashMapObject.put("FI_ACCOUNT", new Job("Accountant", 5000, 50000));
		hashMapObject.put("SA_MAN", new Job("Sales Manager", 15000, 150000));
		hashMapObject.put("IT_PROG", new Job("Programmer", 18000, 120000));
		hashMapObject.put("FI_MGR", new Job("Finance Manager", 20000, 200000));
		
		Set<String> setObject=hashMapObject.keySet();
		Iterator<String> iteratorObject=setObject.iterator();
		while(iteratorObject.hasNext()){
			String key=iteratorObject.next();
			System.out.println("Key:"+key+"\t::\t"+hashMapObject.get(key));
		}
	}

}
