package io.github.mortuzahossain.allbanglanewspapers.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.github.mortuzahossain.allbanglanewspapers.R;
import io.github.mortuzahossain.allbanglanewspapers.utils.Constants;

public class NewsContainerFragment extends Fragment {

    Constants.NewsCategory newsCategory;

    public NewsContainerFragment(Constants.NewsCategory newsCategory) {
        this.newsCategory = newsCategory;
    }

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    private View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_news_container, container, false);
        ButterKnife.bind(this, rootView);
        return rootView;
    }
}