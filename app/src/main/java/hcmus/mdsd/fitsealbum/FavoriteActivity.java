package hcmus.mdsd.fitsealbum;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FavoriteActivity extends Fragment{
    View favorite;

    public static FavoriteActivity newInstance() {
        FavoriteActivity fragment = new FavoriteActivity();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        favorite =(View) inflater.inflate(R.layout.activity_favorite,container, false);

        return favorite;
    }
}

