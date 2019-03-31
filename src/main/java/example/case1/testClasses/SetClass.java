package example.case1.testClasses;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import example.case1.CommonInterface;

public class SetClass implements CommonInterface {
    
	Set<Integer> set = new HashSet<Integer>(arraySize);
	
	@Override
	public void checkaddTime() {
		// TODO Auto-generated method stub
		System.out.println("SetClass checkaddTime");
		long startAt = System.currentTimeMillis();
	
		for(int i =0 ; i < arraySize ; i++){
			set.add(i);
		}
		
		long endAt = System.currentTimeMillis();
		long howTime = endAt - startAt;
        System.out.println("SetClass stringSet="+howTime);
	}

	@Override
	public void checkGetTime() {
		// TODO Auto-generated method stub
		System.out.println("SetClass checkGetTime");
		long startAt = System.currentTimeMillis();
	
		StringBuilder stringBuilder = new StringBuilder();
		Iterator<Integer> iterator = set.iterator();
		
		while (iterator.hasNext()) {
			stringBuilder.append(iterator.next());
		}
		
		long endAt = System.currentTimeMillis();
		long howTime = endAt - startAt;
        System.out.println("SetClass checkGetTime="+howTime);
	}

}
