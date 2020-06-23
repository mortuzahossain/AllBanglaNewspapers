package io.github.mortuzahossain.allbanglanewspapers.adapter;
/*
 * Created by mortuza on 23/6/20 | 11:55 AM for All Bangla Newspapers
 * Junior Programmer
 * Flora Systems
 * Email : mortuzahossain1997@gmail.com
 * Phone : +8801719200957
 * */


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import java.util.List;

import io.github.mortuzahossain.allbanglanewspapers.R;
import io.github.mortuzahossain.allbanglanewspapers.model.NewspaperModel;
import io.github.mortuzahossain.allbanglanewspapers.views.DetailsActivity;

public class NewspaperAdapter extends RecyclerView.Adapter<NewspaperAdapter.NewspaperViewHolder> {

    Context context;
    List<NewspaperModel> newspaperList;

    public NewspaperAdapter(Context context, List<NewspaperModel> newspaperModelList) {
        this.context = context;
        this.newspaperList = newspaperModelList;
    }

    @NonNull
    @Override
    public NewspaperViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NewspaperViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.single_newspaper, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NewspaperViewHolder holder, int position) {
        NewspaperModel newspaperModel = newspaperList.get(position);
        holder.newspaperLogo.setImageResource(newspaperModel.getImageId());

        holder.singleNewsCard.setOnClickListener(v -> {

            Toast.makeText(context, newspaperModel.getTitle(), Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(context, DetailsActivity.class);
            intent.putExtra(DetailsActivity.LOAD_URL, newspaperModel.getUrl());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return newspaperList.size();
    }

    static class NewspaperViewHolder extends RecyclerView.ViewHolder {
        CardView singleNewsCard;
        ImageView newspaperLogo;

        public NewspaperViewHolder(@NonNull View itemView) {
            super(itemView);
            singleNewsCard = itemView.findViewById(R.id.singleNewsCard);
            newspaperLogo = itemView.findViewById(R.id.newspaperLogo);
        }
    }
}
