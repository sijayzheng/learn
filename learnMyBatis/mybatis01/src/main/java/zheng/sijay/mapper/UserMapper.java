package zheng.sijay.mapper;

import zheng.sijay.pojo.UserPO;

import java.util.List;

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
}