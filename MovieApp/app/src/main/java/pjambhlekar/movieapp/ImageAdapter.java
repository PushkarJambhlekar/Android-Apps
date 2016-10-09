package pjambhlekar.movieapp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by pujamb on 10/9/2016.
 */
public class ImageAdapter extends BaseAdapter
{
    private Context mContext;
    private static LayoutInflater inflater=null;
    public ImageAdapter()
    {
    }
    GetMoviesData moviesData;
    // Constructor
    public ImageAdapter(Context c) {
        Log.v("deadbeef", "in constructor");
        mContext = c;
        moviesData = new GetMoviesData();
        moviesData.execute(this);
        posterDatas = new ArrayList<MoviePosterData>();
        inflater = ( LayoutInflater )c.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        /*ImageView imageView;
        TextView textView;
        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        }
        else
        {
            imageView = (ImageView) convertView;
        }

        imageView.setImageDrawable(images.get(position));

        return imageView;*/

        View rootView;
        ImageView imageView;
        TextView title;
        TextView rating;
        TextView popular;

        rootView = inflater.inflate(R.layout.movie_poster,null);
        if (convertView == null) {
            title = (TextView) rootView.findViewById(R.id.movie_poster_title);
            rating = (TextView) rootView.findViewById(R.id.movie_poster_rating);
            popular = (TextView) rootView.findViewById(R.id.movie_poster_release_date);
            imageView = (ImageView) rootView.findViewById(R.id.movie_poster_img);

            title.setText(posterDatas.get(position).title);
            rating.setText(posterDatas.get(position).rating);
            popular.setText(posterDatas.get(position).overview);
            imageView.setImageDrawable(posterDatas.get(position).image);
        }
        else
        {
            rootView = convertView;
        }
        return rootView;

    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();

    }

    static ArrayList<MoviePosterData> posterDatas;




    public int getCount() {
        int size =  posterDatas.size();
        Log.v("bad123", "Size is " + size);
        return size;
    }

    @Override
    public MoviePosterData getItem(int position) {
        return posterDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public void sortList(String field)
    {
        Log.v("deadbeef", "Soring list");
        Collections.sort(posterDatas);
        notifyDataSetChanged();

    }
}
