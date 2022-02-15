package zheng.sijay.mybatis.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

/**
 * @author 郑世杰
 * @date 2022/2/8 15:39
 */
public interface SelectMapper {
    /**
     * 查询所有
     *
     * @param tableName
     * @return
     */
    List<HashMap<String, Object>> listAll(@Param("tableName") String tableName, @Param("p1") String p1, @Param("p2") String p2);
}