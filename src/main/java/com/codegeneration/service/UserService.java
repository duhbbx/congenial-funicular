package com.codegeneration.service;

import com.codegeneration.exception.CommonException;
import com.codegeneration.mapper.UserMapper;
import com.codegeneration.model.User;
import com.codegeneration.utils.Result;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public Result<User> login(String email, String password) {

        User user = userMapper.findByEmail(email);

        if (user == null) {
            return new Result<>(false, "该邮箱尚未注册");
        }

        if (!user.getPassword().equals(password)) {
            return new Result<>(false, "密码错误");
        }

        return new Result<>(true, "登录成功", user);
    }


    public Result<User> register(User user) {

        User existUser = userMapper.findByEmail(user.getEmail());

        if (existUser != null) {
            return new Result<>(false, "邮箱已经被注册");
        }

        user.setCreateTime(new Date());

        userMapper.insert(user);

        return new Result<>(true, "注册成功", user);
    }

    public User update(User user) {
        if (StringUtils.isBlank(user.getEmail())) {
            throw new CommonException("用户的邮箱为空");
        }

        if (StringUtils.isBlank(user.getUsername())) {
            throw new CommonException("用户名不能为空");
        }

        User userInDb = userMapper.findByEmail(user.getEmail());
        if (!userInDb.getPassword().equals(user.getOriginalPassword())) {
            throw new CommonException("原密码不正确");
        }

        userInDb.setPassword(user.getPassword());
        userInDb.setUsername(user.getUsername());

        userMapper.update(userInDb);

        return userInDb;
    }
}
