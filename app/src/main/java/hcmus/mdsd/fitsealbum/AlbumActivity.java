package hcmus.mdsd.fitsealbum;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AlbumActivity extends Fragment{
    View album;

    public static AlbumActivity newInstance() {
        AlbumActivity fragment = new AlbumActivity();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        album = (View) inflater.inflate(R.layout.activity_album,container,false);

        return album;
    }
}
