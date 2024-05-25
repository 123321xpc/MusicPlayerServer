package cn.practice.musicplayer.service;

import cn.practice.musicplayer.utils.Category;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

@Component
public class ResourceLoaderService {

    private final ResourceLoader resourceLoader;

    public ResourceLoaderService(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public Resource loadMusicOrLyric(String dir, String name) {
        String path = dir + "/" + name;
        if(dir.equals(Category.LYRIC)) path += ".lrc";
        else path += ".mp3";
        return resourceLoader.getResource("classpath:/static/" + path);
    }

}

