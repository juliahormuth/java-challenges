import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
                //key   //value
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("England", "London");

        System.out.println(capitalCities);

        System.out.println(capitalCities.get("England"));

        capitalCities.remove("England");
        
        System.out.println(capitalCities);

        //remove all data
        capitalCities.clear();
        System.out.println(capitalCities);
    }
}
