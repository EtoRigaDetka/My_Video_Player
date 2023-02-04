package com.example.my_video_player

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.VideoView
import android.net.Uri.*
import android.widget.MediaController
import com.example.my_video_player.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
private lateinit var bindingView:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingView= ActivityMainBinding.inflate(layoutInflater)
        val view=bindingView.root
        setContentView(view)
        val videoView = findViewById<VideoView>(bindingView.videoView.id)
        //Creating MediaControler
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        //Location of media file
        val uri = parse(
            "android.resource://" + packageName + "/raw/sample"
        )
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()

    }

}