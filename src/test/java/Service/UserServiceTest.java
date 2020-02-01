package Service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pojo.*;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserServiceTest {
@Autowired
    UserService userService;
@Autowired
    OrderService orderService;
@Test
public void findUser() {
//      UserQueryVo userQueryVo=new UserQueryVo();
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
//    UserCustom userCustom=new UserCustom();
//    userCustom.setSex(1);
//    userCustom.setUsername("张三丰");
//    userQueryVo.setUserCustom(userCustom);
//    List<UserCustom> list = userService.findUserList(userQueryVo);
//    System.out.println(list);
//    List<Orders> list1;
//    list1= orderService.findOrderDetails();
//    System.out.println(list1);
    List<User> list=userService.findUserAndItemsResultMap();
    System.out.println(list);


}}