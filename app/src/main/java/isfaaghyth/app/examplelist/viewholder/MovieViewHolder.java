package isfaaghyth.app.examplelist.viewholder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import isfaaghyth.app.examplelist.R;
import isfaaghyth.app.examplelist.model.Movie;

public class MovieViewHolder extends RecyclerView.ViewHolder {

    private ImageView imgBanner;
    private TextView txtMovieName;
    private TextView txtRating;

    public MovieViewHolder(@NonNull View itemView) {
        super(itemView);
        imgBanner = itemView.findViewById(R.id.imgBanner);
        txtMovieName = itemView.findViewById(R.id.txtMovieName);
        txtRating = itemView.findViewById(R.id.txtRating);
    }

    public void setMovieData(Movie movie) {
        Picasso.get().load(movie.getBanner()).into(imgBanner);
        txtMovieName.setText(movie.getName());
        txtRating.setText(String.valueOf(movie.getRating()));
    }

}
