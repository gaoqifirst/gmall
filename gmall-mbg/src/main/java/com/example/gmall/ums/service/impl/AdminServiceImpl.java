package com.example.gmall.ums.service.impl;

import com.example.gmall.ums.entity.Admin;
import com.example.gmall.ums.mapper.AdminMapper;
import com.example.gmall.ums.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author gaoqi
 * @since 2020-07-05
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

}
