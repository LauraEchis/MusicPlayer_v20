package com.example.laura.musicplayer_v20;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MusicAdapter extends BaseAdapter {
    private ArrayList<Song> songs;
    private LayoutInflater songInf;
    private Context mContext;

    @Override
    public int getCount() {
        return songs.size();
    }

    public MusicAdapter(Context c, ArrayList<Song> theSongs) {
        songs = theSongs;
        songInf = LayoutInflater.from(c);
    }

    @Override
    public Object getItem(int arg0) {
        return null;
    }

    @Override
    public long getItemId(int arg0) {
        return 0;
    }

    static class ViewHolder {
        TextView songtitle;
        TextView songartist;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //map to song layout
//        LinearLayout songLay = (LinearLayout)songInf.inflate
//                (R.layout.song, parent, false);
//        //get title and artist views
//        TextView songView = (TextView)songLay.findViewById(R.id.song_title);
//        TextView artistView = (TextView)songLay.findViewById(R.id.song_artist);
//        //get song using position
//        Song currSong = songs.get(position);
//        //get title and artist strings
//        songView.setText(currSong.getTitle());
//        artistView.setText(currSong.getArtist());
//        //set position as tag
//        songLay.setTag(position);
//        return songLay;
        ViewHolder mViewHolder;
        Song song = null;

        if (convertView == null) {

            song = new Song();
            mViewHolder = new ViewHolder();

            LayoutInflater inflater = LayoutInflater.from(parent.getContext());

            convertView = inflater.inflate(R.layout.song, parent, false);
            mViewHolder.songartist = (TextView) convertView.findViewById(R.id.song_artist);
            mViewHolder.songtitle = (TextView) convertView.findViewById(R.id.song_title);
            convertView.setTag(mViewHolder);

        } else {

            mViewHolder = (ViewHolder) convertView.getTag();

        }


        mViewHolder.songtitle.setText(song.getTitle());
        mViewHolder.songartist.setText(song.getArtist());

        return convertView;
    }
}
