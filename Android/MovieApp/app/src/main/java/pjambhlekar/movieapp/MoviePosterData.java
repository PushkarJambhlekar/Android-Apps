package pjambhlekar.movieapp;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by pujamb on 10/9/2016.
 */
public class MoviePosterData implements Comparable<MoviePosterData>
{
    public Drawable image;
    public String title;
    public String rating;
    String overview;
    String date;


    public MoviePosterData()
    {
        Random rand = new Random(System.currentTimeMillis());
        title = "Title";
        rating = rand.nextInt(10)+"";
        overview = rand.nextInt(50)+"";
    }

    @Override
    public int compareTo(MoviePosterData another) {
        int  thisVal = Integer.parseInt(this.rating);
        int anotherVal = Integer.parseInt(another.rating);

        if (thisVal == anotherVal) return 0;
        if (thisVal > anotherVal)  return 1;
        return -1;
    }
}
