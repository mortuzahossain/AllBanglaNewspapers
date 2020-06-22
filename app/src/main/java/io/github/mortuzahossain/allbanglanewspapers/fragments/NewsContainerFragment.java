package io.github.mortuzahossain.allbanglanewspapers.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.mortuzahossain.allbanglanewspapers.R;
import io.github.mortuzahossain.allbanglanewspapers.utils.Constants;

public class NewsContainerFragment extends Fragment {

    Constants.NewsCategory newsCategory;

    public NewsContainerFragment(Constants.NewsCategory newsCategory) {
        this.newsCategory = newsCategory;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_news_container, container, false);
    }
}