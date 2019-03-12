package dominioTrakt;

public class Movie {
/*
{
  "title": "Avatar",
  "year": 2009,
  "ids": {
    "trakt": 12269,
    "slug": "avatar-2009",
    "imdb": "tt0499549",
    "tmdb": 19995
  },
  "tagline": "Enter the World of Pandora.",
  "overview": "In the 22nd century, a paraplegic Marine is dispatched to the moon Pandora on a unique mission, but becomes torn between following orders and protecting an alien civilization.",
  "released": "2009-12-18",
  "runtime": 162,
  "country": "us",
  "trailer": "http://youtube.com/watch?v=5PSNL1qE6VY",
  "homepage": "http://www.avatarmovie.com/",
  "rating": 7.83649,
  "votes": 39887,
  "comment_count": 111,
  "updated_at": "2019-02-21T09:03:31.000Z",
  "language": "en",
  "available_translations": [
    "ar",
    "bg",
...
    "zh"
  ],
  "genres": [
    "action",
    "adventure",
    "fantasy",
    "science-fiction"
  ],
  "certification": "PG-13"
}
 */
	private String title;
	private int year;
	private Identificadores ids;
	private String tagline;
	private String overview;
	private String released;
	private String runtime;
	private String country;
	private String trailer;
	private String homepage;
	private String rating;
	private String[] genres;
	private String certification;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Identificadores getIds() {
		return ids;
	}
	public void setIds(Identificadores ids) {
		this.ids = ids;
	}
	public String getTagline() {
		return tagline;
	}
	public void setTagline(String tagline) {
		this.tagline = tagline;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public String getReleased() {
		return released;
	}
	public void setReleased(String released) {
		this.released = released;
	}
	public String getRuntime() {
		return runtime;
	}
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getTrailer() {
		return trailer;
	}
	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String[] getGenres() {
		return genres;
	}
	public void setGenres(String[] genres) {
		this.genres = genres;
	}
	public String getCertification() {
		return certification;
	}
	public void setCertification(String certification) {
		this.certification = certification;
	}
	
	
	//----------------
	@Override
	public String toString() {
		return "\nTitulo: " + title + ", Ano: " + year + ids;
	}
}
