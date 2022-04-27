package com.codegeneration.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.codegeneration.model.User;
import com.codegeneration.service.UserService;
import com.codegeneration.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    Result<JSONObject> login(HttpServletRequest httpServletRequest, @RequestBody User user) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("token", "123456");
        return Result.success(jsonObject);
    }

    @PostMapping("/register")
    Result<User> register(@RequestBody User user) {
        log.error("user = {}", JSON.toJSONString(user));
        return userService.register(user);
    }

    @PostMapping("/logout")
    Result<Object> logout(HttpServletRequest httpServletRequest) {
        // 销毁回话
        httpServletRequest.getSession().invalidate();
        return new Result<>(true, "退出成功");
    }

    @GetMapping("/info")
    Result<JSONObject> info(HttpServletRequest httpServletRequest) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("roles", new String[]{"ADMIN"});
        jsonObject.put("name", "美男子");
        return Result.success(jsonObject);
    }

    @PutMapping("/update")
    Result<User> update(HttpServletRequest httpServletRequest, @RequestBody User user) {
        User sessionUser = (User) httpServletRequest.getSession().getAttribute("loginUser");
        User updatedUser = userService.update(user);
        httpServletRequest.getSession().setAttribute("loginUser", updatedUser);
        return new Result<>(true, "", updatedUser);
    }

    @RequestMapping(value = "/controller-generate", produces = "text/plain;charset=UTF-8")
    public ModelAndView login() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("packageName", "demo");
        mv.addObject("modelName", "User");
        mv.addObject("firstLetterLowercaseModelName", "user");
        mv.setViewName("mapperConfig.txt");
        return mv;
    }
}
