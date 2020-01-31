package Service;

import ch.qos.logback.classic.Level;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import pojo.User;
import pojo.UserCustom;
import pojo.UserQueryVo;
import sun.util.calendar.BaseCalendar;

import javax.xml.crypto.Data;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserServiceTest {
@Autowired
    UserService userService;
@Test
public void findUser() {
      UserQueryVo userQueryVo=new UserQueryVo();
//    UserCustom userCustom=new UserCustom();
//    userCustom.setId(36);
//    userCustom.setUsername("小明");
//    userCustom.setBirthday(new Date(1970-1-2));
//    userCustom.setAddress("河南");
//    userCustom.setSex(1);
//    userQueryVo.setUserCustom(userCustom);
//    List<Integer> ids=new ArrayList<Integer>();
//
//    userQueryVo.setIds(ids);
    UserCustom userCustom=new UserCustom();
    userCustom.setSex(1);
    userCustom.setUsername("张三丰");
    userQueryVo.setUserCustom(userCustom);
    List<UserCustom> list = userService.findUserList(userQueryVo);
    System.out.println(list);


}}