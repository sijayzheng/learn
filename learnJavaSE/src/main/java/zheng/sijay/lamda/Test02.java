package zheng.sijay.lamda;

interface Print {
    void print(String arg);
}

/**
 * @author 郑世杰
 */
public class Test02 {
    public static void main(String[] args) {
        Print print = (String s) -> {
            System.out.println(s);
        };
        print.print("11111");
        print = (s) -> {
            System.out.println(s);
        };
        print.print("2222222");
        print = s -> {
            System.out.println(s);
        };
        print.print("3333333");
        print = s -> System.out.println(s);
        print.print("444444444");

    }
}