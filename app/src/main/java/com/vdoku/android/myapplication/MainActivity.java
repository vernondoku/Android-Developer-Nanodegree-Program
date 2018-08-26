package com.vdoku.android.myapplication;

import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import java.util.ArrayList;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    String popularMovies;
    String topRatedMovies;

    ArrayList<Movie>mPopularList;
    ArrayList<Movie>mTopTopRatedList;

    @BindView(R.id.indeterminateBar)
    ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mProgressBar.setVisibility(View.INVISIBLE); //Hide Progressbar by Default

    }
}






