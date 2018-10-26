package com.example.laura.musicplayer_v20;

import android.os.Parcel;
import android.os.Parcelable;

public class Song implements Parcelable {
    private long id;
    private String title = "";
    private String artist = "";

    public Song(long songID, String songTitle, String songArtist) {
        id = songID;
        title = songTitle;
        artist = songArtist;

    }

    public Song() {

    }
    @Override
    public int describeContents() {
        return 0;
    }


    public long getID() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(artist);
        dest.writeLong(id);
    }

    public static final Parcelable.Creator<Song> CREATOR = new Parcelable.Creator<Song>() {
        public Song createFromParcel(Parcel in) {
            Song song = new Song();
            song.title = in.readString();
            song.artist = in.readString();
            song.id = in.readLong();
            return song;
        }

        public Song[] newArray(int size) {
            return new Song[size];
        }
    };
}
