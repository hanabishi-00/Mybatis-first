package Service;


import Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pojo.User;
import pojo.UserCustom;
import pojo.UserQueryVo;

import java.util.List;

@Service
@Component
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User findUserById(int id){
        User user=userMapper.findUserById(id);
        return user;
    }
    public List<User> findUserByName(String name){
        List<User> list = userMapper.findUserByName(name);
        return list;
    }
    public Integer insertUser(User user){
        return userMapper.insertUser(user);
    }
    public void deleteUserById(int id){
         userMapper.deleteUserById(id);
    }
    public void updateUser(User user){
        userMapper.updateUserById(user);
    }
    public List<UserCustom> findUserList(UserQueryVo userQueryVo){
        return userMapper.findUserList(userQueryVo);
    }
    public User findUserIdByResultMap(int id){
        User user=userMapper.findUserIdByResultMap(id);
        return user;
    }
    public List<UserCustom> findUserList1(UserQueryVo userQueryVo){
        return this.userMapper.findUserList1(userQueryVo);
    }
    public List<User> findUserAndItemsResultMap(){
        return userMapper.findUserAndItemsResultMap();
    }

}
