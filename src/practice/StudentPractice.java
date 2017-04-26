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
        movieMap.put("2", m1);
        movieMap.put("4", m2);
        movieMap.put("1", m3);
        movieMap.put("3", m4);
        movieMap.put("10", m5);
        movieMap.put("5", m6);
        movieMap.put("9", m7);
        movieMap.put("6", m8);
        movieMap.put("8", m9);
        movieMap.put("7", m10);
        
        Movie m = (Movie)movieMap.get("9");
        System.out.println("The movie information with the ID of 9 is: " + m);
        
        System.out.println("\nUsing a keyset, get the movies...");
        Set keys = movieMap.keySet();
        for(Object key : keys) {
            Movie found = (Movie)movieMap.get(key);
            System.out.println(found.toString());
        }
        
    }
}
