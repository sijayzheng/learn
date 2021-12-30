package zheng.sijay.mapper;

import org.apache.ibatis.annotations.Delete;
import zheng.sijay.pojo.UserPO;

import java.util.List;
import java.util.Map;

/**
 * @author 郑世杰
 */
public interface UserMapper {
    /**
     * 获取所有用户
     *
     * @return 用户列表
     */
    List<UserPO> listUser();

    /**
     * 根据id查询用户信息
     *
     * @param id 用户id
     * @return 用户
     */
    UserPO getUserById(int id);

    List<UserPO> listUserByName(String name);

    /**
     * 添加
     *
     * @param user
     * @return
     */
    int addUser(UserPO user);

    int addOneUser(Map<String, Object> map);

    /**
     * 修改
     *
     * @param user
     * @return
     */
    int updateUser(UserPO user);

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @Delete("delete from user where id=#{id}")
    int deleteUser(int id);
}