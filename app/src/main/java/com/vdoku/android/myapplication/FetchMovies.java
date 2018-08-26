package com.vdoku.android.myapplication;
import android.os.AsyncTask;
import android.view.View;
import java.util.ArrayList;
import android.widget.ProgressBar;


public class FetchMovies extends AsyncTask<Void, Void, Void> {


    @butterknife.BindView(R.id.indeterminateBar)
    ProgressBar mProgressBar;

    String popularMoviesURL;
    String topRatedMoviesURL;

    ArrayList<Movie> mPopularList;
    ArrayList<Movie> mTopTopRatedList;



    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        mProgressBar.setVisibility(View.VISIBLE);
    }

    @Override
    protected Void doInBackground(Void... voids) {

        String popularMoviesURL = "http://api.themoviedb.org/3/discover/movie?sort_by=popularity.desc&api_key=086f2af3a2ce0976d2c4532df4efcbe9";

        String topRatedMoviesURL = "http://api.themoviedb.org/3/discover/movie?sort_by=vote_average.desc&api_key=086f2af3a2ce0976d2c4532df4efcbe9";

        mPopularList = new ArrayList<>();
        mTopTopRatedList = new ArrayList<>();

        try {
                mPopularList = NetworkUtils.fetchData(popularMoviesURL); //Get popular movies
                mTopTopRatedList = NetworkUtils.fetchData(topRatedMoviesURL); //Get top rated movies

        } catch (java.io.IOException e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPostExecute (Void  s) {
        super.onPostExecute(s);
        mProgressBar.setVisibility(View.INVISIBLE);
    }
}
