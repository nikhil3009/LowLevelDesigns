public class Cinemark {
    MovieController movieController;
    TheatreController theatreController;

    public Cinemark() {
        movieController = new MovieController();
        theatreController = new TheatreController();
    }
    public static void main(String[] args)
    {
       Cinemark cinemark = new Cinemark();

    }
}