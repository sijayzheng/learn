package zheng.sijay.reflection;

/**
 * @author 郑世杰
 */
public class Test01 {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("zheng.sijay.reflection.User");
            System.out.println(clazz);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}