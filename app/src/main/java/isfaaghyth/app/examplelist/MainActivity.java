package isfaaghyth.app.examplelist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import isfaaghyth.app.examplelist.adapter.MovieAdapter;
import isfaaghyth.app.examplelist.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Movie> movies;
    private MovieAdapter adapter;

    private RecyclerView lstMovie;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstMovie = findViewById(R.id.lstMovie);

        //1. menyiapkan data yang akan ditampilkan kedalam recyclerview
        movieExampleData();

        //2. layout manager.
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        lstMovie.setLayoutManager(linearLayoutManager);

        //3. mendefinisikan adapter
        adapter = new MovieAdapter(movies);

        //4. tampilkan data
        lstMovie.setAdapter(adapter);
    }

    private void movieExampleData() {
        movies = new ArrayList<>();
        movies.add(new Movie("Fast and Furious", R.drawable.img_naruto, 9.0f));
        movies.add(new Movie("Power Rangers", R.drawable.img_naruto, 4.5f));
        movies.add(new Movie("Upin Ipin The Movie", R.drawable.img_naruto, 5.5f));
        movies.add(new Movie("Aladdin", R.drawable.img_naruto, 6.5f));
        movies.add(new Movie("Doraemon", R.drawable.img_naruto, 7f));
    }

}
