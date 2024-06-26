package cn.practice.musicplayer.controller;

import cn.practice.musicplayer.bean.Result;
import cn.practice.musicplayer.bean.User;
import cn.practice.musicplayer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    @ResponseBody
    public Result login(@RequestBody User user ) {
        System.out.println(user);
        Result result = new Result();
        result.setData(null);
        try {
            User testUser = userService.login(user.getUsername(), user.getPassword());

            // 访问数据库成功且用户名密码正确
            if (testUser!= null) {
                result.setCode(200);
                result.setMsg("登录成功");
                result.setData(testUser);
            }else{  // 用户名密码错误
                result.setCode(201);
                result.setMsg("用户名或密码错误");
            }

        }catch (Exception e){  // 访问数据库失败
            result.setCode(400);
            result.setMsg("请求异常，请重试！");
        }finally {
            return result;
        }
    }
}
