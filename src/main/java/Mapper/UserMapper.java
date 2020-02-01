package Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import pojo.User;
import pojo.UserCustom;
import pojo.UserQueryVo;
import java.util.List;

@Mapper
@Component
public interface UserMapper {
    User findUserById(int id);
    List<User> findUserByName(String name);
    Integer insertUser(User user);
    void deleteUserById(int id);
    void updateUserById(User user);
    List<UserCustom> findUserList(UserQueryVo userQueryVo);
    User findUserIdByResultMap(int id);
    List<UserCustom> findUserList1(UserQueryVo userQueryVo);
    List<User> findUserAndItemsResultMap();
}
