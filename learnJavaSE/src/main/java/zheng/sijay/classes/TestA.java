package zheng.sijay.classes;

/**
 * @author 郑世杰
 */
public class TestA {
    public static void main(String[] args) throws Exception {
        Class<User> clazz = User.class;
        User user = clazz.getDeclaredConstructor(int.class, String.class)
                         .newInstance(100, "username");
        // Method getName = clazz.getDeclaredMethod("getName");
        // Object invoke = getName.invoke(user);
        // System.out.println("invoke=" + invoke);
        // Method setName = clazz.getDeclaredMethod("setName", String.class);
        // Object newUserName = setName.invoke(user, "newUserName");
        // System.out.println("newUserName=" + newUserName);
        clazz.getDeclaredMethod("print")
             .setAccessible(true);
        // clazz.getConstructors()
    }
}

class User {
    private int id;
    private String name;

    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void print() {
        System.out.println("haahaaa");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}