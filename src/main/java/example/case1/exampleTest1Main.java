package example.case1;

import example.case1.testClasses.ArrayClass;
import example.case1.testClasses.ListClass;
import example.case1.testClasses.MapClass;
import example.case1.testClasses.SetClass;

public class exampleTest1Main {
	public static void main(String[] args) {
		ArrayClass arrayClass = new ArrayClass();
		SetClass setClass = new SetClass();
		ListClass listClass = new ListClass();
		MapClass mapClass = new MapClass();
		
		arrayClass.checkaddTime();
		arrayClass.checkGetTime();
		listClass.checkaddTime();
		listClass.checkGetTime();
		setClass.checkaddTime();
		setClass.checkGetTime();
		mapClass.checkaddTime();
		mapClass.checkGetTime();
		
	}
}
