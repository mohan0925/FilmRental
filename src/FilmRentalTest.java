import java.util.*;

/**
 * Film Rental Test class is used to test all the use cases
 * Arraylist is used to store data and methods are applied on the arraylist
 * to perform operations
 */
public class FilmRentalTest {

	public static void main(String[] args) 
	{
		//variable used to store the name of dvd rented
		String film_rent= null;
		//variable used to store the status of dvd rented
		String status = null;
		//variable used to store the index.
		int index=0;
		int desired_index=0;
		//boolean to check dvd exist.
		boolean exists = false;	
		
		//Scanner class used to take the inputs from the system.
		Scanner sc = new Scanner(System.in);
		//default constructor to set the default values to the variables.
		FilmRental FilmRental_obj= new FilmRental();
		//Arraylist is used to store the data of dvd
		ArrayList<FilmRental> DVD_arraylist = new ArrayList<FilmRental>();
	
		//Adding values into the arraylist
		DVD_arraylist.add(new FilmRental("Harry potter",2.30,"fantasy"," available"));
		DVD_arraylist.add(new FilmRental("Spiderman",2.00,"fantasy"," available"));
		DVD_arraylist.add(new FilmRental("Space",2.50,"Scifi"," available"));
		
		//printing all elements in arraylist
		System.out.println("Available DVD's to be rented..........!");		
		for(FilmRental film_row:DVD_arraylist)
		{
			System.out.println(film_row);			
		}		
		
		//Renting the user choice dvd 
		System.out.println("Which DVD you want to rent?");
		System.out.println("Enter Film Tittle from list");
		film_rent=sc.nextLine();
		for(FilmRental film_row:DVD_arraylist)
		{	
			// checking if dvd tittle and user response are equal
			if (film_row.getfilm_title().equalsIgnoreCase(film_rent)) 
			{
				// if dvd exist, it sets to true
				exists = true;
				// dvd availability status 
				status=film_row.getDVD_STATUS();
				desired_index=index;
				// sets availability status to rented
				DVD_arraylist.get(desired_index).setDVD_STATUS("Rented");			
			}
			// increments the index by 1
			index++;
		}

		//if exist is true
		if (exists) 
		{			
			if(status.equalsIgnoreCase("available"))
			{
				System.out.println("DVD rented is	"+film_rent);				
			}
			System.out.println("Available DVD's........!");
			for(FilmRental film_row:DVD_arraylist)
			{
				System.out.println(film_row);
			}			
		} 
		else 
		{
			System.out.println("There is no DVD with the film tittle");
		}
		
		//User response to return dvd
		System.out.println("Do you want to return the DVD : "+film_rent);
		System.out.println("type yes or no....!");
		String response=sc.nextLine();
		// if reponse to rent is yes  
		if(response.equalsIgnoreCase("yes"))
		{
			System.out.println("DVD returned........!");
			// set rented dvd status to available 
			DVD_arraylist.get(desired_index).setDVD_STATUS("available");		
			
			for(FilmRental film_row:DVD_arraylist)
			{
				System.out.println(film_row);
			}
		}
		else if(response.equalsIgnoreCase("no"))
		{
			System.out.println("Enjoy your movie........!");
		}	
	}
}

