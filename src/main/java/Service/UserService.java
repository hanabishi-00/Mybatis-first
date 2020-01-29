package Service;

import Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pojo.User;

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
}
