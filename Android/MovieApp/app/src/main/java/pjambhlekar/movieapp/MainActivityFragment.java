package pjambhlekar.movieapp;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    static ImageAdapter mImageAdapter = null;
    static GridView mGridView = null;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_main, container, false);


        if(mImageAdapter == null)
        {
            mImageAdapter = new ImageAdapter(getActivity());
        }

       // if(mGridView == null)
        {
            mGridView = (GridView) rootView.findViewById(R.id.movie_list_main_fragment);
        }

        mImageAdapter.notifyDataSetChanged();
        mGridView.invalidateViews();
        mGridView.setAdapter(mImageAdapter);
        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MoviePosterData p = mImageAdapter.getItem(position);
                Toast.makeText(getActivity(), p.title, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), DetailedActivity.class)
                                    .putExtra(Intent.EXTRA_TEXT, position+"");
                startActivity(intent);
            }
        });
        return rootView;
    }
}
