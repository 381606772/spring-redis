package com.springredis;

import com.baizhi.BaizhiApplication;
import com.baizhi.mybatiscache.entity.User;
import com.baizhi.mybatiscache.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.DigestUtils;

import java.util.List;

@SpringBootTest(classes = BaizhiApplication.class)
@RunWith(SpringRunner.class)
public class TestUserService {

    @Autowired
    private IUserService userService;

    @Test
    public void testFindAll() {
        List<User> userList = userService.findAll();
        userList.forEach(System.out::println);

        System.out.println("==============================");

        List<User> userList2 = userService.findAll();
        userList2.forEach(System.out::println);
    }

    @Test
    public void testFindOne() {
        User user = userService.findById("1");
        System.out.println("user = " + user);

        System.out.println("==============================");

        User user1 = userService.findById("1");
        System.out.println("user1 = " + user1);
    }

    @Test
    public void testDeleteById() {
        userService.deleteById("1");
    }

    /**
     * md5:
     * 特点：
     *  1. 一切文件经过md5加密处理后，都会生成32位16进制字符串
     *  2. 不同内容经过md5加密后，加密结果一定不一致.
     *  3. 相同内容文件多次加密后结果一定一致。
     *  引申: 经典面试题：如果判断两个文件是否一致，就可以对两个文件进行加密，加密结果一致，则文件内容，否则文件内容不同
     *
     */
    @Test
    public void testMD5() {
        String str = "abasdfsadfdfas";
        String md5Str = DigestUtils.md5DigestAsHex(str.getBytes());
        System.out.println("md5Str = " + md5Str);
    }
}
