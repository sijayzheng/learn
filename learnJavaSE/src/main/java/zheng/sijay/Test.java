package zheng.sijay;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author 郑世杰
 */
public class Test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(10);
        Optional.ofNullable(list)
                .ifPresent(e -> {
                    System.out.println("e");
                    System.out.println(e);
                });
    }

}