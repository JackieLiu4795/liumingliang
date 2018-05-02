package com.chatRobot.service.impl;

import com.chatRobot.dao.IUserDao;
import org.springframework.stereotype.Service;
import com.chatRobot.model.User;
import com.chatRobot.service.IUserService;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService{

    @Resource
    private IUserDao userDao;

    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }
}
