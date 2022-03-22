import java.util.ArrayList;
import java.util.List;

public class filterMethodOnList {
    public static void main(String args[]){
        List<String> ls = new ArrayList<>();
        ls.add("akshat");
        ls.add("akshay");
        ls.add("Mukesh");
        ls.add("vikash");
        for(String s:ls){
            if(s.startsWith("a"))
            System.out.println(s);
        }

        //using filter and stream
        ls.stream().filter(t->t.startsWith("a")).forEach(x-> System.out.println(x));
}
}
