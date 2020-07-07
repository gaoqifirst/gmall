package com.example.gmall.pms.service.impl;

import com.example.gmall.pms.entity.Comment;
import com.example.gmall.pms.mapper.CommentMapper;
import com.example.gmall.pms.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品评价表 服务实现类
 * </p>
 *
 * @author gaoqi
 * @since 2020-07-05
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
