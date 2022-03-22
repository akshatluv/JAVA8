import com.sun.org.apache.xpath.internal.objects.XNumber;

interface Basics {
   // void statement();

    //void input(int number);

    int substract(int n1, int n2);
}

public class PracticeJava{
    public static void main(String[] args) {

//        Basics basics =() -> System.out.println("Hello");
//        basics.statement();

//        Basics basics = (number) -> System.out.println("Print:" + number);
//        basics.input(10);

        Basics basics =(n1,n2) -> {
            if (n2>n1){
                return  n2 - n1;
            }
            else{
               throw new RuntimeException("invalid");
            }
        };
        System.out.println(basics.substract(6,5));

    }
}
