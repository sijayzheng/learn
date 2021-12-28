package zheng.sijay.mapper;

import zheng.sijay.pojo.UserPO;

import java.util.List;

/**
 * @author 郑世杰
 */
public interface UserMapper {
    /**
     * 获取所以用户
     * @return
     */
    List<UserPO> listUser();
}
