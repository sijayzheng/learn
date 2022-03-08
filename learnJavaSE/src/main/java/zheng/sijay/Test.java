package zheng.sijay;

/**
 * @author 郑世杰
 */
public class Test {
    public static void main(String[] args) throws Exception {
        User user = new User();
        System.out.println(user.getClass().hashCode());
        System.out.println(User.class.hashCode());
        System.out.println(Class.forName("zheng.sijay.User").hashCode());
    }


}

class User {
    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}