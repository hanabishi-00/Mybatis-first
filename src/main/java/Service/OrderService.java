package Service;

import Mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.OrdersCustom;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderMapper orderMapper;
    public List<OrdersCustom> findOrdersUser(){
        return orderMapper.findOrdersUser();
    }
}
