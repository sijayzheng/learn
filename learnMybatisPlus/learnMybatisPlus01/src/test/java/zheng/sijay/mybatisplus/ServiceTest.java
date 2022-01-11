package zheng.sijay.mybatisplus;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import zheng.sijay.mybatisplus.domain.User;
import zheng.sijay.mybatisplus.service.IUserService;

import java.util.List;

/**
 * @author 郑世杰
 */
public class ServiceTest {
    @Autowired
    private IUserService userService;

    @Test
    public void listUser(){
        List<User> list = userService.list();
        System.out.println(list);
    }

    @Test
    public void getById(){
        System.out.println(userService.getById(3));
    }
}
