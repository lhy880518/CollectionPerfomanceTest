import java.util.*;

public class CollectionSet implements TestMethod{

    public long startAt = 0;
    public long endAt = 0;
    public long howTime = 0;

    @Override
    public void TestSpeed() {

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
