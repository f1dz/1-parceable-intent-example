package isfaaghyth.app.examplelist.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {
    private String name;
    private int banner;
    private float rating;

    public Movie(String name, int banner, float rating) {
        this.name = name;
        this.banner = banner;
        this.rating = rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBanner(int banner) {
        this.banner = banner;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    protected Movie(Parcel in) {
        name = in.readString();
        banner = in.readInt();
        rating = in.readFloat();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    public String getName() {
        return name;
    }

    public int getBanner() {
        return banner;
    }

    public float getRating() {
        return rating;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(banner);
        dest.writeFloat(rating);
    }
}
