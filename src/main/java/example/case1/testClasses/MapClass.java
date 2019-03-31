package example.case1.testClasses;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import example.case1.CommonInterface;

public class MapClass implements CommonInterface {
    
	Map<Integer, Integer> map = new HashMap<Integer, Integer>(arraySize);
	
	@Override
	public void checkaddTime() {
		// TODO Auto-generated method stub
		System.out.println("MapClass checkaddTime");
		long startAt = System.currentTimeMillis();
	
		for(int i =0 ; i < arraySize ; i++){
			map.put(i, i);
		}
		
		long endAt = System.currentTimeMillis();
		long howTime = endAt - startAt;
        System.out.println("MapClass stringSet="+howTime);
	}

	@Override
	public void checkGetTime() {
		// TODO Auto-generated method stub
		System.out.println("MapClass checkGetTime");
		long startAt = System.currentTimeMillis();
	
		StringBuilder stringBuilder = new StringBuilder();
		
		for(int i =0 ; i < arraySize ; i++){
			stringBuilder.append(map.get(i));
		}
		
		long endAt = System.currentTimeMillis();
		long howTime = endAt - startAt;
        System.out.println("MapClass checkGetTime="+howTime);
	}

}
