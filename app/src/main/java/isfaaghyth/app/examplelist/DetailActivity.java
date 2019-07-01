package isfaaghyth.app.examplelist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import isfaaghyth.app.examplelist.model.Movie;

public class DetailActivity extends AppCompatActivity {

    private ImageView imgBanner;
    private TextView txtMovieName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //casting view
        imgBanner = findViewById(R.id.imgBanner);
        txtMovieName = findViewById(R.id.txtMovieName);

        Movie movie = getIntent().getParcelableExtra("MOVIE_DETAIL");

        Picasso.get().load(movie.getBanner()).into(imgBanner);
        txtMovieName.setText(movie.getName());
    }

}
