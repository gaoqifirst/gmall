package com.example.gmall.oms.service.impl;

import com.example.gmall.oms.entity.Order;
import com.example.gmall.oms.mapper.OrderMapper;
import com.example.gmall.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author gaoqi
 * @since 2020-07-05
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
