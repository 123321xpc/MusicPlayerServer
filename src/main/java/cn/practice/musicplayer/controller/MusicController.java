package cn.practice.musicplayer.controller;

import cn.practice.musicplayer.bean.Music;
import cn.practice.musicplayer.service.MusicService;
import cn.practice.musicplayer.service.ResourceLoaderService;
import cn.practice.musicplayer.utils.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/music")
public class MusicController {

    @Autowired
    private MusicService musicService;

    private final ResourceLoaderService resourceLoaderService;

    @Autowired
    public MusicController(ResourceLoaderService resourceLoaderService) {
        this.resourceLoaderService = resourceLoaderService;
    }


    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity<Resource> DownloadMusicById(@PathVariable("id") String id) {
        System.out.println("下载音乐");
        List<Music> musicInfo = musicService.getMusicInfoById(id);
        if(musicInfo.size() == 0) return ResponseEntity.notFound().build();

        Music music = musicInfo.get(0);

        Resource resource = resourceLoaderService.loadMusicOrLyric(music.getCategory(), music.getFullname());

        if (resource.exists()) {
            return ResponseEntity.ok(resource);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/allmusic")
    @ResponseBody
    public List<Music> getAllMusic() {
        return musicService.getAllMusic();
    }

    @GetMapping("/lyric/{id}")
    @ResponseBody
    public ResponseEntity<Resource> DownloadLyricById(@PathVariable("id") String id) {

        System.out.println("下载歌词");
        List<Music> musicInfo = musicService.getMusicInfoById(id);
        if(musicInfo.size() == 0) return ResponseEntity.notFound().build();

        Music music = musicInfo.get(0);

        Resource resource = resourceLoaderService.loadMusicOrLyric(Category.LYRIC,music.getFullname());

        if (resource.exists()) {
            System.out.println("返回歌词");
            return ResponseEntity.ok(resource);
        } else {
            System.out.println("null");
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/{category}")
    @ResponseBody
    public List<Music> getAllMusic(@PathVariable("category") String category) {
        return musicService.getNetMusicByCategory(category);
    }


}
