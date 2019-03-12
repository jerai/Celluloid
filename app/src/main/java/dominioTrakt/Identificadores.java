package dominioTrakt;

public class Identificadores {

	/*
	"ids": {
        "trakt": 14701,
        "slug": "the-avengers-2012",
        "imdb": "tt0848228",
        "tmdb": 24428
    }
	*/
	
	private int trakt;
	private String slug;
	private String imdb;
	private int tmdb;
	
	public int getTrakt() {
		return trakt;
	}
	public void setTrakt(int trakt) {
		this.trakt = trakt;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	public String getImdb() {
		return imdb;
	}
	public void setImdb(String imdb) {
		this.imdb = imdb;
	}
	public int getTmdb() {
		return tmdb;
	}
	public void setTmdb(int tmdb) {
		this.tmdb = tmdb;
	}
	
	@Override
	public String toString() {
		return "Trakt: " + trakt + ", Slug: " + slug + ", Imdb: " + imdb + ", Tmdb: " + tmdb;
	}
	
}
