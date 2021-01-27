package com.miniproject.healthcaree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Vector;


public class FirstAidTips extends AppCompatActivity {
    RecyclerView recyclerView;
    Vector<youtubevideos> youtubeVideos = new Vector<youtubevideos>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_aid_tips);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager( new LinearLayoutManager(this));

        youtubeVideos.add( new youtubevideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ozzZVQQTvo4\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new youtubevideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/erd53zePPco\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new youtubevideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/GX4mkE0lVC8\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new youtubevideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/r1iqunl4HSo\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new youtubevideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/aK9xrsK7vPg\" frameborder=\"0\" allowfullscreen></iframe>") );

        VideoAdapter videoAdapter = new VideoAdapter(youtubeVideos);

        recyclerView.setAdapter(videoAdapter);
       /* VideoView videoView1 = findViewById(R.id.vi1);
        String videoPath1 = "android.resource://" + getPackageName() + "/" + R.raw.vi;
        Uri uri1 = Uri.parse(videoPath1);
        videoView1.setVideoURI(uri1);
        MediaController mediaController1 = new MediaController(this);
        videoView1.setMediaController(mediaController1);
        mediaController1.setAnchorView(videoView1);

        VideoView videoView2 = findViewById(R.id.vi2);
        String videoPath2 = "android.resource://" + getPackageName() + "/" + R.raw.via;
        Uri uri2 = Uri.parse(videoPath2);
        videoView2.setVideoURI(uri2);
        MediaController mediaController2 = new MediaController(this);
        videoView2.setMediaController(mediaController2);
        mediaController2.setAnchorView(videoView2);

        VideoView videoView3 = findViewById(R.id.vi3);
        String videoPath3 = "android.resource://" + getPackageName() + "/" + R.raw.vib;
        Uri uri3 = Uri.parse(videoPath3);
        videoView3.setVideoURI(uri3);
        MediaController mediaController3 = new MediaController(this);
        videoView3.setMediaController(mediaController3);
        mediaController3.setAnchorView(videoView3);

        VideoView videoView4 = findViewById(R.id.vi4);
        String videoPath4 = "android.resource://" + getPackageName() + "/" + R.raw.vic;
        Uri uri4 = Uri.parse(videoPath4);
        videoView4.setVideoURI(uri4);
        MediaController mediaController4 = new MediaController(this);
        videoView4.setMediaController(mediaController4);
        mediaController4.setAnchorView(videoView4);

        VideoView videoView5 = findViewById(R.id.vi5);
        String videoPath5 = "android.resource://" + getPackageName() + "/" + R.raw.vid;
        Uri uri5 = Uri.parse(videoPath5);
        videoView5.setVideoURI(uri5);
        MediaController mediaController5 = new MediaController(this);
        videoView5.setMediaController(mediaController5);
        mediaController5.setAnchorView(videoView5);
*/

    }
}