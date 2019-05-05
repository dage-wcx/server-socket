package com.serversocket.serviceTest;

import com.serversocket.entity.Userinfo;
import com.serversocket.service.IUserinfoService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

/**
 * @ClassName UserinfoTest
 * @Description
 * @Author wcx
 * @Date 2019/05/05 10:43
 * @Version
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserinfoTest {

    @Autowired
    private IUserinfoService userinfoServiceImpl;

    @Test
    public void addUserinfo(){
        Userinfo user = new Userinfo();
        user.setUserAccount(2338007484L);
        user.setUsername("站右边讲话");
        user.setPassword("dage1998");
        user.setPhone(17673647854L);
        user.setSex("男");
        user.setTag(1);
        boolean b = userinfoServiceImpl.insertUserinfo(user);
        System.out.println(b);
    }

    @Test
    public void queryUserinfoById(){
        Userinfo u = userinfoServiceImpl.selectUserinfoById(1l);
        System.out.println(u);
    }

    @Test
    public void queryAllUserinfo(){
        List<Userinfo> list = userinfoServiceImpl.selectAllUserinfo();
        System.out.println(list);
    }

    @Test
    public void updateUserinfo(){
        Userinfo user = new Userinfo();
        user.setUserId(1l);
        user.setModifyTime(new Date());
        boolean b = userinfoServiceImpl.updateUserinfo(user);
        System.out.println(b);
    }

    @Test
    public void deleteUserinfo(){
        boolean b = userinfoServiceImpl.deleteUserinfo(6l);
        System.out.println(b);
    }
}
