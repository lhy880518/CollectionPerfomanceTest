package example.case1.testClasses;

import example.case1.CommonInterface;

public class ArrayClass implements CommonInterface{
	
	Integer[] array = new Integer[arraySize];
	
	@Override
	public void checkaddTime() {
		// TODO Auto-generated method stub
		System.out.println("ArrayClass checkaddTime");
		long startAt = System.currentTimeMillis();
		
        
		for(int i =0 ; i < arraySize ; i++){
			array[i] = i;
		}
		
		long endAt = System.currentTimeMillis();
		long howTime = endAt - startAt;
        System.out.println("ArrayClass stringSet="+howTime);
	}

	@Override
	public void checkGetTime() {
		// TODO Auto-generated method stub
		System.out.println("ArrayClass checkGetTime");
		long startAt = System.currentTimeMillis();
		StringBuilder stringBuilder = new StringBuilder();
		for(int i =0 ; i < arraySize ; i++){
			stringBuilder.append(array[i]);
		}
		
		long endAt = System.currentTimeMillis();
		long howTime = endAt - startAt;
        System.out.println("ArrayClass checkGetTime="+howTime);
	}

}
