package com.udacity.gradle.builditbigger.paid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

//import com.ekosp.androlib.JokePresenter;
import com.ekosp.androlib.JokePresenter;
import com.udacity.gradle.builditbigger.R;
import com.udacity.gradle.builditbigger.paid.EndpointAsyncTask;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    ProgressBar progressBar = null;
    public String fetchJoke = null;
    public boolean isTested = false;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        // Set onClickListener for the button
        Button button = (Button) root.findViewById(R.id.btn_joke);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                getJoke();
            }
        });

        progressBar = (ProgressBar) root.findViewById(R.id.joke_progressbar);
        progressBar.setVisibility(View.GONE);



        return root;
    }

    public void getJoke(){
        new EndpointAsyncTask().execute(this);
    }

    public void launchDisplayJokeActivity(){
        if (!isTested) {
            Context context = getActivity();
            Intent intent = new Intent(context, JokePresenter.class);
            intent.putExtra(JokePresenter.JOKES_EXTRA, fetchJoke);
            context.startActivity(intent);
            progressBar.setVisibility(View.GONE);
        }
    }
}
