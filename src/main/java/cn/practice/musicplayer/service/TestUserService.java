package cn.practice.musicplayer.service;

import cn.practice.musicplayer.bean.Result;
import cn.practice.musicplayer.bean.TestUser;
import org.springframework.stereotype.Service;

@Service
public class TestUserService {
    public TestUser login(String username, String password) {
        if(username.equals("admin") && password.equals("admin")){
            return new TestUser("admin", "admin");
        }else{
            return null;
        }
    }
}
