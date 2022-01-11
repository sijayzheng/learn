package zheng.sijay.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import zheng.sijay.mybatis.mapper.UserMapper;
import zheng.sijay.mybatis.pojo.UserPO;
import zheng.sijay.mybatis.utils.MyBatisUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
            sqlSession.selectList("zheng.sijay.mybatis.mapper.UserMapper.listUser").forEach(System.out::println);
            // 新写法
            mapper.listUser().forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void listUserByName() {
        // 从 SqlSessionFactory 中获取 SqlSession
        try (SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession()) {
            // 获取接口
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            // 执行SQL
            // 新写法
            mapper.listUserByName("%u%").forEach(System.out::println);
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

    @Test
    public void addUser() {
        // 从 SqlSessionFactory 中获取 SqlSession
        try (SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession()) {
            // 获取接口
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            UserPO po = new UserPO("testttt", "123456");
            // 执行SQL
            System.out.println(mapper.addUser(po));
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void addUsers() {
        // 从 SqlSessionFactory 中获取 SqlSession
        try (SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession()) {
            List<UserPO> userList = Stream.of(1, 2, 3, 4, 5, 6)
                                          .map(e -> new UserPO("user" + e)).collect(Collectors.toList());
            // 获取接口
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            // 执行SQL
            int i = mapper.addUsers(userList);
            System.out.println(i);
            for (UserPO po : userList) {
                System.out.println(po.getId());

            }
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void updateUser() {
        // 从 SqlSessionFactory 中获取 SqlSession
        try (SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession()) {
            // 获取接口
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            UserPO po = new UserPO(10, "tom L", "654321");
            // 执行SQL
            System.out.println(mapper.updateUser(po));
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void deleteUser() {
        // 从 SqlSessionFactory 中获取 SqlSession
        try (SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession()) {
            // 获取接口
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            // 执行SQL
            System.out.println(mapper.deleteUser(3));
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void addOneUser() {
        // 从 SqlSessionFactory 中获取 SqlSession
        try (SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession()) {
            // 获取接口
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            Map<String, Object> map = new HashMap<>();
            map.put("userId", 13);
            map.put("user_name", "usernames");
            // 执行SQL
            System.out.println(mapper.addOneUser(map));
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
