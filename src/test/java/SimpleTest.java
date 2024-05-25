import cn.practice.musicplayer.MusicPlayerApplication;
import cn.practice.musicplayer.bean.Music;
import cn.practice.musicplayer.mapper.MusicMapper;
import cn.practice.musicplayer.utils.Category;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = MusicPlayerApplication.class)
public class SimpleTest {

    @Autowired
    private MusicMapper musicMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<Music> userList = musicMapper.selectList(null);
        userList.forEach(System.out::println);
    }

    @Test
    public void testInsert() {
        System.out.println(("----- insert method test ------"));
        Music music = new Music();
        music.setFullname("半城烟沙-许嵩");
        music.setCategory(Category.RISE);
        music.setName("半城烟沙");
        music.setSinger("许嵩");
        musicMapper.insert(music);

        music = new Music();
        music.setFullname("惊鸿一面-许嵩");
        music.setCategory(Category.RISE);
        music.setName("惊鸿一面");
        music.setSinger("许嵩,黄龄");
        musicMapper.insert(music);

    }
}
