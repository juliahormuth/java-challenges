import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        System.out.println(cars);
        var verify = cars.contains("Volvo");
        System.out.println(verify);
        cars.add("Volvo");
        cars.add("Volvo");
        System.out.println(cars);
        System.out.println(cars.size());

        for (String i : cars) {
            System.out.println(i);
        }

        cars.remove("Volvo");
        System.out.println(cars);

        cars.clear();
        System.out.println(cars);
    }
}
