package com.example.laura.musicplayer_v20;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import java.util.ArrayList;

public class MusicService extends Service implements MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener,
        MediaPlayer.OnCompletionListener {

//media player
private MediaPlayer player;
//song list
private ArrayList<Song> songs;
//current position
private int songPosn;


@Override
public IBinder onBind(Intent arg0) {
        // TODO Auto-generated method stub
        return null;
        }

@Override
public void onCompletion(MediaPlayer mp) {

        }

@Override
public boolean onError(MediaPlayer mp, int what, int extra) {
        return false;
        }

@Override
public void onPrepared(MediaPlayer mp) {

        }
        }