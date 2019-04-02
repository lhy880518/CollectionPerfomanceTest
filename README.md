# CollectionPerfomanceTest(Set, List, Map)

1. CollectionTestMain 
  check Add Time 
  
2. exampleTest1Main
1) int arraySize = 1000;
```java
ArrayClass checkaddTime
	ArrayClass stringSet=0
	ArrayClass checkGetTime
	ArrayClass checkGetTime=0
	ListClass checkaddTime
	ListClass stringSet=1
	ListClass checkGetTime
	ListClass checkGetTime list.get(i)=0
	ListClass checkGetTime iterator.next()=1
	SetClass checkaddTime
	SetClass stringSet=0
	SetClass checkGetTime
	SetClass checkGetTime=1
	MapClass checkaddTime
	MapClass stringSet=0
	MapClass checkGetTime
	MapClass checkGetTime=0
```
 
  2) int arraySize = 1000000;
	ArrayClass checkaddTime
	ArrayClass stringSet=58
	ArrayClass checkGetTime
	ArrayClass checkGetTime=165
	ListClass checkaddTime
	ListClass stringSet=93
	ListClass checkGetTime
	ListClass checkGetTime list.get(i)=160
	ListClass checkGetTime iterator.next()=150
	SetClass checkaddTime
	SetClass stringSet=202
	SetClass checkGetTime
	SetClass checkGetTime=113
	MapClass checkaddTime
	MapClass stringSet=376
	MapClass checkGetTime
	MapClass checkGetTime=107
