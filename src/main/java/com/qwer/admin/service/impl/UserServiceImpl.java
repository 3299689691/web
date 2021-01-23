package com.qwer.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qwer.admin.mapper.UserMapper;
import com.qwer.admin.service.UserService;
import org.springframework.stereotype.Service;
import com.qwer.admin.bean.User;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {
}
