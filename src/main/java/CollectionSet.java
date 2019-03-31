import java.util.*;

public class CollectionSet implements TestMethod{

    public long startAt = 0;
    public long endAt = 0;
    public long howTime = 0;

    @Override
    public void TestSpeed() {

    	// HashSet<String> stringSet = new HashSet<String>();
    	// 위와같이 선언할 수 있는데 아래처럼 선언하는 이유는 뭘까?
    	// Collection 인터페이스는 Set, List, Queue의 상위 인터페이스 이다.
    	// Set 아래의 구현체에 HashSet, LinkedHashSet, TreeSetd이 존재하므로 가장 상위 책체로 선언하여 구현하기위하여 아래와 같이 선언한다.
    	// 사실 Collection으로 객체선언해도 상관없다 선언만 Collection 으로하고 구현은 그다음에 new를 통하여서 하기때문에
        Random random = new Random();
        Set<String> stringSet = new HashSet<String>();
        Set<String> stringLinkedHashSet = new LinkedHashSet<String>();
        Set<String> stringTreeSet = new TreeSet<String>();

        System.out.println("============================================================");
        startAt = System.currentTimeMillis();
        for(int i = 0 ; i < ROLLING_COUNT ; i++){
            stringSet.add(String.valueOf(random.nextInt(50)+i));
        }
        endAt = System.currentTimeMillis();
        howTime = endAt - startAt;
        System.out.println("CollectionSet stringSet="+howTime);

        startAt = System.currentTimeMillis();
        for(int i = 0 ; i < ROLLING_COUNT ; i++){
            stringLinkedHashSet.add(String.valueOf(random.nextInt(50)+i));
        }
        endAt = System.currentTimeMillis();
        howTime = endAt - startAt;
        System.out.println("CollectionSet stringLinkedHashSet="+howTime);

        startAt = System.currentTimeMillis();
        for(int i = 0 ; i < ROLLING_COUNT ; i++){
            stringTreeSet.add(String.valueOf(random.nextInt(50)+i));
        }
        endAt = System.currentTimeMillis();
        howTime = endAt - startAt;
        System.out.println("CollectionSet stringTreeSet="+howTime);
        System.out.println("============================================================");
    }
}
