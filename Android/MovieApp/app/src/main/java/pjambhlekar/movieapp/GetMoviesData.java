package pjambhlekar.movieapp;

import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by pujamb on 10/9/2016.
 */
public class GetMoviesData extends AsyncTask<ImageAdapter, Void, Void> {

    public boolean isCompleted;
    GetMoviesData()
    {
        isCompleted = false;
    }
    ImageAdapter img;

    @Override
    protected Void doInBackground(ImageAdapter... params) {

        ArrayList<MoviePosterData> images = ((ImageAdapter)params[0]).posterDatas;
        img = params[0];
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);
        populateImageArray("https://www.gstatic.com/webp/gallery3/1.png",images);

        return null;
    }

    public String GetJSON(String url)
    {
        HttpURLConnection c = null;
        try {
            URL u = new URL(url);
            c = (HttpURLConnection) u.openConnection();
            c.connect();
            int status = c.getResponseCode();
            switch (status) {
                case 200:
                case 201:
                    BufferedReader br = new BufferedReader(new InputStreamReader(c.getInputStream()));
                    StringBuilder sb = new StringBuilder();
                    String line;
                    while ((line = br.readLine()) != null) {
                        sb.append(line+"\n");
                    }
                    br.close();
                    Log.v("AsynTask", "Data is "+sb.toString());
                    return sb.toString();
            }

        } catch (Exception ex) {
            return ex.toString();
        } finally {
            if (c != null) {
                try {
                    c.disconnect();
                } catch (Exception ex) {
                    //disconnect error
                }
            }
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        img.notifyDataSetChanged();
        super.onPostExecute(aVoid);
    }

    void populateImageArray(String url, ArrayList<MoviePosterData> images)
    {
        try {
            //= "https://www.gstatic.com/webp/gallery3/1.png";
            InputStream is = (InputStream) new URL(url).getContent();
            Drawable d = Drawable.createFromStream(is, "src name");
            Log.v("deadbeef", "Adding into image " + d.toString());
            MoviePosterData p = new MoviePosterData();
            p.image = d;
            images.add(p);

            return ;
        } catch (Exception e) {
            Log.v("deadbeef", "Error in image " + e.toString());
            return ;
        }
    }
}
