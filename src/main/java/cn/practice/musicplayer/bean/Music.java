package cn.practice.musicplayer.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Music {
    private String id;
    private String name;
    private String singer;
    private String fullname;
    private String category;
}
