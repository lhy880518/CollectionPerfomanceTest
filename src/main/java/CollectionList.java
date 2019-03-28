import java.util.*;

public class CollectionList implements TestMethod{

    public long startAt = 0;
    public long endAt = 0;
    public long howTime = 0;

    @Override
    public void TestSpeed() {

        Random random = new Random();
        List<String> stringArrayList = new ArrayList<String>();
        List<String> stringLinkedList = new LinkedList<String>();
        List<String> stringVector = new Vector<String>();

        System.out.println("============================================================");
        startAt = System.currentTimeMillis();
        for(int i = 0 ; i < ROLLING_COUNT ; i++){
            stringArrayList.add(String.valueOf(random.nextInt(50)+i));
        }
        endAt = System.currentTimeMillis();
        howTime = endAt - startAt;
        System.out.println("CollectionList stringArrayList="+howTime);

        startAt = System.currentTimeMillis();
        for(int i = 0 ; i < ROLLING_COUNT ; i++){
            stringLinkedList.add(String.valueOf(random.nextInt(50)+i));
        }
        endAt = System.currentTimeMillis();
        howTime = endAt - startAt;
        System.out.println("CollectionList stringLinkedList="+howTime);

        startAt = System.currentTimeMillis();
        for(int i = 0 ; i < ROLLING_COUNT ; i++){
            stringVector.add(String.valueOf(random.nextInt(50)+i));
        }
        endAt = System.currentTimeMillis();
        howTime = endAt - startAt;
        System.out.println("CollectionList stringVector="+howTime);
        System.out.println("============================================================");
    }
}
