public class StringListTest {

    public static List<String> generateStringList(Integer IntegerCopy) {

        List<String> stringList = new List<String>();

        for (Integer nCopy = 0; nCopy < IntegerCopy; nCopy++) {
            stringList.add('Test ' + nCopy);
        }

        return stringList;
    }
}