package zheng.sijay.mybatis.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import zheng.sijay.mybatis.pojo.MUserPO;

import java.util.List;
import java.util.Map;

/**
 * @author 郑世杰
 */
@Mapper
public interface MUserMapper {
    /**
     * 获取所有用户
     *
     * @return 用户列表
     */
    List<MUserPO> listUser();

    /**
     * 根据id查询用户信息
     *
     * @param id 用户id
     * @return 用户
     */
    MUserPO getUserById(int id);

    List<MUserPO> listUserByName(String name);

    /**
     * 添加
     *
     * @param user
     * @return
     */
    int addUser(MUserPO user);

    /**
     * 添加一个
     *
     * @param map
     * @return
     */
    int addOneUser(Map<String, Object> map);

    /**
     * 批量添加
     *
     * @param list
     * @return
     */
    int addUsers(List<MUserPO> list);

    /**
     * 修改
     *
     * @param user
     * @return
     */
    int updateUser(MUserPO user);

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @Delete("delete from user where id=#{id}")
    int deleteUser(int id);

    List<MUserPO> pageList(Map<String, Integer> map);

}