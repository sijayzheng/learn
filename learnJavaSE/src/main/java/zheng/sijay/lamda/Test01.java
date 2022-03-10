package zheng.sijay.lamda;

/**
 * @author 郑世杰
 */
public class Test01 {
    public static void main(String[] args) {
        IHello hello = new Hello();
        hello.lamda();
        hello = new Hello2();
        hello.lamda();
        //4、局部内部类
        class Hello3 implements IHello {
            @Override
            public void lamda() {
                System.out.println("hello lamda 333333");
            }
        }
        hello = new Hello3();
        hello.lamda();

        //5、匿名内部类
        hello = new IHello() {
            @Override
            public void lamda() {
                System.out.println("hello lamda 44444444");
            }
        };
        hello.lamda();
        //6、lamda表达式
        hello = () -> System.out.println("hello lamda 5555");
        hello.lamda();

    }

    //3、静态内部类
    static class Hello2 implements IHello {
        @Override
        public void lamda() {
            System.out.println("hello lamda 22222");
        }
    }
}

//1、接口
interface IHello {
    void lamda();
}

//2、实现类
class Hello implements IHello {
    @Override
    public void lamda() {
        System.out.println("hello lamda");
    }
}