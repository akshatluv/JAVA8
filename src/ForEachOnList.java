import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

public class ForEachOnList {
    public static void main(String args[]){
        List<String> ls = new ArrayList<>();
        ls.add("akshat");
        ls.add("akshay");
        ls.add("Mukesh");
        ls.add("vikash");
        for(String s:ls){
            System.out.println(s);
        }
        ls.stream().forEach((t)-> System.out.println(t));

        //internal working of forEach
        Consumer consumer = (t) -> System.out.println(t);
        for(String s:ls){
            consumer.accept(s);
        }
    }
}
