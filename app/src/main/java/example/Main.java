package example;

import example.model.LinkBuilder;
import example.model.Video;
import example.model.VideoBuilder;
import example.model.VideoCodec;
import io.avaje.jsonb.Jsonb;

import java.net.URI;

public class Main {

    static final Jsonb JSONB;

    static {
        JSONB = Jsonb.builder().build();
    }

    public static void main(String[] args) {
        var video = VideoBuilder.builder()
            .name("一个视频.mp4")
            .width(800)
            .height(600)
            .videoCodec(VideoCodec.H264)
            .addLinks(LinkBuilder.builder().uri(URI.create("http://localhost:3333/link/1")).token("token-123").build())
            .addLinks(LinkBuilder.builder().uri(URI.create("http://localhost:3333/link/2")).build())
            .build();

        System.out.println("video = " + video);

        var json = JSONB.toJsonPretty(video);
        System.out.println("json = " + json);

        var video1 = JSONB.type(Video.class).fromJson(json);
        System.out.println("video1 = " + video1);
    }
}
