package cn.practice.musicplayer.service;

import cn.practice.musicplayer.bean.User;
import cn.practice.musicplayer.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User login(String username, String password) {
            Map<String, Object> map = new HashMap<>();
            map.put("username", username);
            map.put("password", password);
            List<User> users = userMapper.selectByMap(map);
            if (users != null && users.size() > 0) return users.get(0);
            return null;
    }
}
