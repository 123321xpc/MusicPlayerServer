package cn.practice.musicplayer.service;


import cn.practice.musicplayer.bean.Music;
import cn.practice.musicplayer.mapper.MusicMapper;
import cn.practice.musicplayer.utils.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MusicService {

    @Autowired
    private MusicMapper musicMapper;

    public List<Music> getMusicInfoById(String id) {
        List<String> idList = new ArrayList<>();
        idList.add(String.valueOf(id));
        return musicMapper.selectBatchIds(idList);
    }

    public List<Music> getAllMusic() {
        return musicMapper.selectList(null);
    }

    public void insertMusic(ArrayList<Music> list){
        list.forEach(music -> musicMapper.insert(music));
    }

    public List<Music> getNetMusicByCategory(String category) {
        Map<String, Object> map = new HashMap<>();
        System.out.println(category);
        map.put("category", category);
        return musicMapper.selectByMap(map);
    }
}
