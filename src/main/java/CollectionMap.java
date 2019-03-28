import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class CollectionMap implements TestMethod {

    public long startAt = 0;
    public long endAt = 0;
    public long howTime = 0;

    @Override
    public void TestSpeed() {

        Random random = new Random();
        Map<String, String> stringHashMap = new HashMap<String, String>();
        Map<String, String> stringLinkedHashMap = new LinkedHashMap<String, String>();

        System.out.println("============================================================");
        startAt = System.currentTimeMillis();
        for(int i = 0 ; i < ROLLING_COUNT ; i++){
            stringHashMap.put(String.valueOf(i) , String.valueOf(random.nextInt(50)+i));
        }
        endAt = System.currentTimeMillis();
        howTime = endAt - startAt;
        System.out.println("CollectionMap stringHashMap="+howTime);

        startAt = System.currentTimeMillis();
        for(int i = 0 ; i < ROLLING_COUNT ; i++){
            stringLinkedHashMap.put(String.valueOf(i) , String.valueOf(random.nextInt(50)+i));
        }
        endAt = System.currentTimeMillis();
        howTime = endAt - startAt;
        System.out.println("CollectionMap stringLinkedHashMap="+howTime);
        System.out.println("============================================================");
    }
}
