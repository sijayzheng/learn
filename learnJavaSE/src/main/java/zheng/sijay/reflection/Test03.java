package zheng.sijay.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;

/**
 * @author 郑世杰
 * @date 2022/3/9 0:45
 */
public class Test03 {
    public static void main(String[] args) throws Exception {
        Method method = Test03.class.getDeclaredMethod("test", HashMap.class, List.class);
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Type[] genericExceptionTypes = method.getGenericExceptionTypes();
        Type genericReturnType = method.getGenericReturnType();
        for (Type genericParameterType : genericParameterTypes) {
            System.out.println(genericParameterType);
            if (genericParameterType instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) genericParameterType;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (Type actualTypeArgument : actualTypeArguments) {
                    System.out.println(actualTypeArgument);
                }
            }
        }
        for (Type genericExceptionType : genericExceptionTypes) {
            System.out.println(genericExceptionType);
        }
        System.out.println(genericReturnType);

    }

    public static void test(HashMap<String, User> map, List<User> list) {
    }
}
