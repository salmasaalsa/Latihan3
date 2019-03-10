package com.example.latihan3.ForRecycleSample;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.latihan3.R;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder> {
    private List<Movie> movieList;

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView title, year, genre;
        public RelativeLayout itemlist;

        public MyViewHolder(View view){
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            genre = (TextView) view.findViewById(R.id.g);
            year = (TextView) view.findViewById(R.id.year);
            itemlist = (RelativeLayout) view.findViewById(R.id.itemlist);
        }
    }

    public MovieAdapter(List<Movie> movieList){ this.movieList = movieList; }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.row_list_movie, viewGroup, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        Movie movie = movieList.get(i);
        myViewHolder.title.setText(movie.getTitle());
        myViewHolder.genre.setText(movie.getGenre());
        myViewHolder.year.setText(movie.getYear());
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }
}
