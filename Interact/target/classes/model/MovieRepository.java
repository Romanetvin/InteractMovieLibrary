
import java.util.List;

public interface MovieRepository {
	
	
	List<Movie> getMovies();
	
	void add(Movie movie);
	
	void update(Movie movie);
	
	void delete(Movie movie);

}
