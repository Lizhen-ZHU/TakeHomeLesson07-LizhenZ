package com.example.andriod.takehomelesson07_lizhenz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class FilmsAdapter extends RecyclerView.Adapter<FilmViewHolder> {
    private List<Film> films;
    private Context context;

    public FilmsAdapter(List<Film> films, Context context) {
        this.films = films;
        this.context = context;
    }


    @Override
    public FilmViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        return new FilmViewHolder(view, context);
    }


    @Override
    public void onBindViewHolder(FilmViewHolder holder, int position) {
        Film wand = films.get(position);
        holder.getWandNameView().setText(wand.getName());
        holder.getWandInfoView().setText(wand.getInfo());
        holder.getWandImageView().setImageResource(wand.getImageId());
    }

    @Override
    public int getItemCount() {
        return films.size();
    }

}

