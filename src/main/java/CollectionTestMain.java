public class CollectionTestMain {

    public static void main(String[] args) {

        CollectionList collectionList = new CollectionList();
        CollectionSet collectionSet = new CollectionSet();
        CollectionMap collectionMap = new CollectionMap();

        collectionList.TestSpeed();
        collectionSet.TestSpeed();
        collectionMap.TestSpeed();
    }
}
