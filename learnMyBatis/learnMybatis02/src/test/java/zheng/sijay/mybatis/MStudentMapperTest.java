package zheng.sijay.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import zheng.sijay.mybatis.mapper.MStudentMapper;
import zheng.sijay.mybatis.utils.MyBatisUtils;

/**
 * @author 郑世杰
 * @date 2022/2/8 17:54
 */
public class MStudentMapperTest {
    @Test
    public void listStudent() {
        // 从 SqlSessionFactory 中获取 SqlSession
        try (SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession()) {
            // 获取接口
            MStudentMapper mapper = sqlSession.getMapper(MStudentMapper.class);
            // 执行SQL
            mapper.listStudent().forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
