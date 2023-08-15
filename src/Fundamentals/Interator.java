import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Interator {

    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);

        Iterator<Integer> it = numbers.iterator();

        while (it.hasNext()) {
            System.out.println(it.next().getClass());
        }
        };
}

