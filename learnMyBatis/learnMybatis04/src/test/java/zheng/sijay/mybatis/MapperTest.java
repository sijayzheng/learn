package zheng.sijay.mybatis;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import zheng.sijay.mybatis.mapper.SelectMapper;
import zheng.sijay.mybatis.utils.MyBatisUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author 郑世杰
 * @date 2022/2/8 17:54
 */
public class MapperTest {
    @Test
    public void listAll() {
        // 从 SqlSessionFactory 中获取 SqlSession
        try (SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory()
                                                 .openSession()) {
            // 获取接口
            SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
            List<HashMap<String, Object>> list = mapper.listAll("m_user", "all", "p3");
            for (HashMap<String, Object> hashMap : list) {
                System.out.println(JSON.toJSONString(hashMap, SerializerFeature.WriteMapNullValue));
                System.out.println(hashMap.values()
                                          .stream()
                                          .map(value -> Optional.ofNullable(value)
                                                                .map(Object::toString)
                                                                .orElse(""))
                                          .collect(Collectors.joining("+++")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}