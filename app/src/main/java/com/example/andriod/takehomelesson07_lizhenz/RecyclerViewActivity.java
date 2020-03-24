package com.example.andriod.takehomelesson07_lizhenz;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    private List<Film> films;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        initialData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new FilmsAdapter(films, this));


    }

    private void initialData() {
        films = new ArrayList<>();
        films.add(new Film("Joker", "Joaquin Phoenix, Robert De Niro", R.drawable.joker));
        films.add(new Film("Avengers- End Game", "Robert Downey, Jr. Chris Evans, Mark Ruffalo, Chris Hemsworth", R.drawable.avengers));
        films.add(new Film("I am Legend", "Will Smith, Alice Braga, Dash Mihok", R.drawable.legend));
        films.add(new Film("The Wolf of Wall Street", "Leonardo DiCaprio, Jonah Hill", R.drawable.wolf));
    }

//    public void addRandomWand(View view) {
//        films.add(getRandomWand());
//        adapter.notifyDataSetChanged();
//    }
//
//    private Film getRandomWand() {
//        int num = (int) (Math.random() * 4);
//        if (num == 0)
//            return new Film("Joker", "Joaquin Phoenix, Robert De Niro", R.drawable.joker);
//        else if (num == 1)
//            return new Film("Joker", "Joaquin Phoenix, Robert De Niro", R.drawable.avengers);
//        else if (num == 2)
//            return new Film("I am Legend", "Will Smith, Alice Braga, Dash Mihok", R.drawable.legend);
//        else
//            return new Film("The Wolf of Wall Street", "Leonardo DiCaprio, Jonah Hill", R.drawable.wolf);
//    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
}




