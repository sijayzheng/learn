package zheng.sijay.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author 郑世杰
 */
public class MyBatisUtils {
    private static SqlSessionFactory sqlSessionFactory;

    // 获取SqlSessionFactory
    static {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            Properties properties = new Properties();
            properties.put("","");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream,properties);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }
}
