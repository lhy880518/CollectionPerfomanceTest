package example.case1.testClasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import example.case1.CommonInterface;

public class ListClass implements CommonInterface{
	
	List<Integer> list = new ArrayList<Integer>();
	
	@Override
	public void checkaddTime() {
		// TODO Auto-generated method stub
		System.out.println("ListClass checkaddTime");
		long startAt = System.currentTimeMillis();
		
        
		for(int i =0 ; i < arraySize ; i++){
			list.add(i);
		}
		
		long endAt = System.currentTimeMillis();
		long howTime = endAt - startAt;
        System.out.println("ListClass stringSet="+howTime);
	}

	@Override
	public void checkGetTime() {
		// TODO Auto-generated method stub
		System.out.println("ListClass checkGetTime");
		long startAt = System.currentTimeMillis();
		StringBuilder stringBuilder = new StringBuilder();
		for(int i =0 ; i < arraySize ; i++){
			stringBuilder.append(list.get(i));
		}
		
		long endAt = System.currentTimeMillis();
		long howTime = endAt - startAt;
        System.out.println("ListClass checkGetTime list.get(i)="+howTime);
        
        Iterator<Integer> iterator = list.iterator();
        
        startAt = System.currentTimeMillis();
		while (iterator.hasNext()) {
			stringBuilder.append(iterator.next());
		}
		endAt = System.currentTimeMillis();
		howTime = endAt - startAt;
        System.out.println("ListClass checkGetTime iterator.next()="+howTime);
	}

}
