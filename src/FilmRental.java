/**
 * FilmRental class will set the tittle,duration,category and status of DVD
 * It will set the availability of dvd based on the function call 
 */
public class FilmRental {
	
	private String film_title=null;
	private double film_duration=0.0;
	private String film_category=null;
	private String DVD_STATUS=null;
	
	//Constructors
	/**
	 * Default constuctor is used to initialise the variables to default values
	 */
	public FilmRental()
	{
		film_title="";
		film_duration=0.0;
		film_category="";
		DVD_STATUS="";
	}
	/**
	 * constuctor is used to set the tittle,duration,category and status
	 * 
	 * @param film tittle this parameter is used to set tittle of film.
	 * @param film duration this parameter is used to set duration of film.
	 * @param film category this parameter is used to set category of film.
	 * @param DVD STATUS this parameter is used to set status of film.
	 */
	public FilmRental(String film_title,double film_duration,String film_category,String DVD_STATUS )
	{
		this.film_title=film_title;
		this.film_duration=film_duration;
		this.film_category=film_category;
		this.DVD_STATUS=DVD_STATUS;
	}
	
	//returns the film tittle
	public String getfilm_title() 
	{
		return film_title;
	}
	
	/** Sets the dvd availability status based upon the parameter
	 * @param Status this parameter is used to set availability of film.
	 */
	public void setDVD_STATUS(String Status) 
	{
		this.DVD_STATUS=Status;
	}
	//returns the dvd availability
	public String getDVD_STATUS() 
	{
		return DVD_STATUS;
	}
	public String toString() 
	{	
			return  "Film Tittle=" + film_title + ", Film Duration=" + film_duration + ", Film category="+film_category +", DVD Status	="+DVD_STATUS;
	}

}
