package practice;

import common.Movie;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author knyghtspup
 */
public class StudentPractice {
    public static void main(String[] args) {
        
        //make four movies, with at least two duplicates
        Movie m1 = new Movie("2", "Rogue One: A Star Wars Story", "Gareth Edwards");
        Movie m2 = new Movie("4", "Pacific Rim", "Guillermo del Toro");
        Movie m3 = new Movie("1", "Battleship", "Peter Berg");
        Movie m4 = new Movie("3", "Rogue One: A Star Wars Story", "Gareth Edwards");
        Movie m5 = new Movie("10", "Battleship", "Peter Berg");
        Movie m6 = new Movie("5", "Star Wars: A New Hope", "George Lucas");
        Movie m7 = new Movie("9", "Star Trek: The Motion Picture", "Robert Wise");
        Movie m8 = new Movie("6", "Spaceballs", "Mel Brooks");
        Movie m9 = new Movie("8", "Down Periscope", "David S. Ward");
        Movie m10 = new Movie("7", "WarGames", "John Badham");
        
        //create map to hold movies
        Map movieMap = new HashMap();
        movieMap.put(m1.getMovieId(), m1);
        movieMap.put(m2.getMovieId(), m2);
        movieMap.put(m3.getMovieId(), m3);
        movieMap.put(m4.getMovieId(), m4);
        movieMap.put(m5.getMovieId(), m5);
        movieMap.put(m6.getMovieId(), m6);
        movieMap.put(m7.getMovieId(), m7);
        movieMap.put(m8.getMovieId(), m8);
        movieMap.put(m9.getMovieId(), m9);
        movieMap.put(m10.getMovieId(), m10);
        
        Movie m = (Movie)movieMap.get("9");
        System.out.println(m);
        
        System.out.println("\nUsing a keyset, get the movies...");
        Set keys = movieMap.keySet();
        for(Object key : keys) {
            Movie found = (Movie)movieMap.get(key);
            System.out.println(found.toString());
        }
        
    }
}
