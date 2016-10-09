package pjambhlekar.movieapp;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class DetailedActivityFragment extends Fragment {

    public DetailedActivityFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_main,menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_refresh)
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_detailed, container, false);


        Intent intent = getActivity().getIntent();

        if(intent != null && intent.hasExtra(Intent.EXTRA_TEXT))
        {
            String p = intent.getStringExtra(Intent.EXTRA_TEXT);
            Integer pos = Integer.parseInt(p);
            ((TextView)rootView.findViewById(R.id.detailed_activity_text))
                    .setText(ImageAdapter.posterDatas.get(pos).overview);
            ((ImageView)rootView.findViewById(R.id.detailed_fragment_image))
                    .setImageDrawable(ImageAdapter.posterDatas.get(pos).image);
           // Log.v("bad333","Image is "+p.image.toString());
        }
        return rootView;
    }
}
