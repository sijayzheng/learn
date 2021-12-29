package zheng.sijay;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import zheng.sijay.mapper.UserMapper;
import zheng.sijay.utils.MyBatisUtils;

/**
 * @author 郑世杰
 */
public class UserMapperTest {
    @Test
    public void listUser() {
        // 从 SqlSessionFactory 中获取 SqlSession
        try (SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession()) {
            // 获取接口
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            // 执行SQL
            // 旧写法，存在类型强制转换
            sqlSession.selectList("zheng.sijay.mapper.UserMapper.listUser").forEach(System.out::println);
            // 新写法
            mapper.listUser().forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getUserById() {
        // 从 SqlSessionFactory 中获取 SqlSession
        try (SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession()) {
            // 获取接口
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            // 执行SQL
            System.out.println(mapper.getUserById(2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}