public class TestClass {
    public static List<String> getStrings(Integer value) {
        List<String> result = new List<String>();

        for (Integer i = 0; i < value; i++) {
            result.add('Test ' + i);
        }

        return result;
    }
}