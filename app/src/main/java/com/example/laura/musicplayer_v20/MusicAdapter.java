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
//        // holder of the views to be reused.
//        ViewHolder viewHolder;
//
//        // get data based on the position
//        Song song = songs.get(position);
//
//        // if no previous views found
//        if (convertView == null) {
//            // create the container ViewHolder
//            viewHolder = new ViewHolder();
//
//
//            // inflate the views from layout for the new row
//            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
//            convertView = inflater.inflate(R.layout.song, parent, false);
//
//            // set the view to the ViewHolder.
//            viewHolder.songartist = convertView.findViewById(R.id.song_artist);
//            viewHolder.songtitle = convertView.findViewById(R.id.song_list);
//
//            // save the viewHolder to be reused later.
//            convertView.setTag(viewHolder);
//        } else {
//            // there is already ViewHolder, reuse it.
//            viewHolder = (ViewHolder) convertView.getTag();
//        }
//
//        // now we can set populate the data via the ViewHolder into views
//        viewHolder.songtitle.setText(song.getTitle());
//        viewHolder.songartist.setText(song.getArtist());
//        return convertView;

        //map to song layout
        LinearLayout songLay = (LinearLayout)songInf.inflate
                (R.layout.song, parent, false);
        //get title and artist views
        TextView songView = (TextView)songLay.findViewById(R.id.song_title);
        TextView artistView = (TextView)songLay.findViewById(R.id.song_artist);
        //get song using position
        Song currSong = songs.get(position);
        //get title and artist strings
        songView.setText(currSong.getTitle());
        artistView.setText(currSong.getArtist());
        //set position as tag
        songLay.setTag(position);
        return songLay;
    }
}
