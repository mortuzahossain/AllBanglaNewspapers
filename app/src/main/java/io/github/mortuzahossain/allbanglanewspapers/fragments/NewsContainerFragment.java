package io.github.mortuzahossain.allbanglanewspapers.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.github.mortuzahossain.allbanglanewspapers.R;
import io.github.mortuzahossain.allbanglanewspapers.adapter.NewspaperAdapter;
import io.github.mortuzahossain.allbanglanewspapers.model.NewspaperModel;
import io.github.mortuzahossain.allbanglanewspapers.utils.Constants;

public class NewsContainerFragment extends Fragment {

    Constants.NewsCategory newsCategory;

    public NewsContainerFragment() {
    }

    public NewsContainerFragment(Constants.NewsCategory newsCategory) {
        this.newsCategory = newsCategory;
    }

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_news_container, container, false);
        ButterKnife.bind(this, rootView);

        List<NewspaperModel> newspaperModels = new ArrayList<>();

        if (newsCategory.equals(Constants.NewsCategory.BANGLA)) {
            newspaperModels = Constants.getBanglaNewspapers();
        } else if (newsCategory.equals(Constants.NewsCategory.ENGLISH)) {
            newspaperModels = Constants.getEnglishNewspapers();
        } else if (newsCategory.equals(Constants.NewsCategory.INTERNATIONAL)) {
            newspaperModels = Constants.getInternationalNewspapers();
        }

        NewspaperAdapter newspaperAdapter = new NewspaperAdapter(getContext(), newspaperModels);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getContext(), 2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(newspaperAdapter);

        return rootView;
    }
}