package zheng.sijay.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import zheng.sijay.mybatis.mapper.MUserMapper;
import zheng.sijay.mybatis.pojo.MUserPO;
import zheng.sijay.mybatis.utils.MyBatisUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author 郑世杰
 */
public class MUserMapperTest {
    @Test
    public void listUser() {
        // 从 SqlSessionFactory 中获取 SqlSession
        try (SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession()) {
            // 获取接口
            MUserMapper mapper = sqlSession.getMapper(MUserMapper.class);
            // 执行SQL
            // 旧写法，存在类型强制转换
            sqlSession.selectList("zheng.sijay.mybatis.mapper.MUserMapper.listUser").forEach(System.out::println);
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
            MUserMapper mapper = sqlSession.getMapper(MUserMapper.class);
            // 执行SQL
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
            MUserMapper mapper = sqlSession.getMapper(MUserMapper.class);
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
            MUserMapper mapper = sqlSession.getMapper(MUserMapper.class);
            MUserPO po = new MUserPO("testUser", "123456");
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
            List<MUserPO> userList = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
                                           .map(e -> new MUserPO("user" + e)).collect(Collectors.toList());
            // 获取接口
            MUserMapper mapper = sqlSession.getMapper(MUserMapper.class);
            // 执行SQL
            int i = mapper.addUsers(userList);
            System.out.println(i);
            for (MUserPO po : userList) {
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
            MUserMapper mapper = sqlSession.getMapper(MUserMapper.class);
            MUserPO po = new MUserPO(10, "tom L", "654321");
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
            MUserMapper mapper = sqlSession.getMapper(MUserMapper.class);
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
            MUserMapper mapper = sqlSession.getMapper(MUserMapper.class);
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

    @Test
    public void listPage() {
        // 从 SqlSessionFactory 中获取 SqlSession
        try (SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession()) {
            // 获取接口
            MUserMapper mapper = sqlSession.getMapper(MUserMapper.class);
            Map<String, Integer> map = new HashMap<>();
            map.put("start", 2);
            map.put("size", 2);
            // 执行SQL
            System.out.println(mapper.pageList(map));
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}