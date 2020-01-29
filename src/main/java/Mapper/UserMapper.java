package Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import pojo.User;

import java.util.List;

@Mapper
@Component
public interface UserMapper {
    User findUserById(int id);
    List<User> findUserByName(String name);

}
