package com.fit2cloud.controller;

import com.fit2cloud.commons.server.base.domain.User;
import com.fit2cloud.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("anonymous/impersonateLogin")
public class UserController {

//    @Resource
//    private UserService userService;
//
//    @PostMapping("/getUserkeysByuserId")
//    @ApiOperation("移动端用户查看密钥对")
//    public Object impersonateLogin (@RequestBody User user) throws Exception{
//        try {
//            Object o = userService.getKey(user.getId(), user.getPassword());
//            return o;
//        }catch (Exception e){
//            return e.getMessage();
//        }
//    }
}
