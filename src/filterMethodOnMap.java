import java.util.HashMap;

public class filterMethodOnMap {
    public static void main(String args[]) {
        HashMap<Integer, String> mp = new HashMap<>();
        mp.put(1, "a");
        mp.put(2, "b");
        mp.put(3, "c");
        mp.put(4, "d");
        //forEach accepts arguments as consumer functional interface
        //mp.forEach((key,value) -> System.out.println(key+": "+value));

        mp.entrySet().stream().filter(k -> k.getKey() % 2 == 0).forEach(obj -> System.out.println(obj));
    }
}
