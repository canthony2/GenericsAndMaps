package common;

import java.util.Objects;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 * For practice, add the required equals, hashCode and toString methods. Then
 * add a Comparable interface for the "natural" default sort order. Remember,
 * consider what makes these objects unique? Also consider that only one
 * field can be used for sorting. What will you do?
 * 
 */
public class Movie  {
    
    private String movieId;
    private String title;
    private String director;

    public Movie() {
    }
    
    public Movie(String movieId, String title, String director) {
        this.movieId = movieId;
        this.title = title;
        this.director = director;
    }

    @Override
    public String toString() {
        return "The movie " + title + " is directed by " + director + ".";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.movieId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Movie other = (Movie) obj;
        if (!Objects.equals(this.movieId, other.movieId)) {
            return false;
        }
        return true;
    }

    public String getMovieId() {
        return movieId;
    }
    
    public void setMovieId(String movieId) throws IllegalArgumentException {
        if(movieId == null || movieId.isEmpty()) {
            throw new IllegalArgumentException("No Movie ID found: Please enter a valid ID");
        } else {
            this.movieId = movieId;
        }
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws IllegalArgumentException {
        if(title == null || title.isEmpty()) {
            throw new IllegalArgumentException("No title found: Please enter a valid movie title");
        } else {
            this.title = title;
        }
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) throws IllegalArgumentException {
        if(director == null || director.isEmpty()) {
            throw new IllegalArgumentException("No director found: Please enter a valid director name");
        } else {
            this.director = director;
        }
    }
    
    public int compareTo(Object other) {
        
        Movie o = (Movie)other;
        
        // Using a utility from Apache Commons
        return new CompareToBuilder()
               .append(this.movieId, o.movieId)
               .toComparison();
    }
    
}
