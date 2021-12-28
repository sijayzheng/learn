package zheng.sijay;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import zheng.sijay.mapper.UserMapper;
import zheng.sijay.pojo.UserPO;
import zheng.sijay.utils.MyBatisUtils;

import java.util.List;

/**
 * @author 郑世杰
 */
public class UserMapperTest {
    @Test
    public void test(){
        //获取SqlSession
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        // 执行SQL
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<UserPO> list = mapper.listUser();
        list.forEach(System.out::println);
        //关闭SqlSession
        sqlSession.close();

    }
}
