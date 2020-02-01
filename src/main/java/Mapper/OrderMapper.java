package Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import pojo.OrderDetails;
import pojo.Orders;
import pojo.OrdersCustom;

import java.util.List;

@Mapper
@Component
public interface OrderMapper {
    List<OrdersCustom> findOrdersUser();
    List<OrdersCustom> findOrdersUserResultMap();
    List<Orders> findOrderDetails();
}
