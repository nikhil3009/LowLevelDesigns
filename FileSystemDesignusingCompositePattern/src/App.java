public class App {
    public static void main(String[] args) {

        Directory movies = new Directory("topMovies");
        File bahubali = new File("Bahubali");
        movies.add(bahubali);
        Directory latestMovies = new Directory("LatestTopMovies");
        File obj1 = new File("LuckyBhaskar");
        File obj2 = new File("Pushpa");
        latestMovies.add(obj1);
        latestMovies.add(obj2);
        movies.add(latestMovies);

        movies.ls();
    }
}