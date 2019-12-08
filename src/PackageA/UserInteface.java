package PackageA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInteface {	
	
	public static void display(){
		
		System.out.println("\n Enter your Choice \n 1.Viewall Naminations \n 2.view a Nominations \n 3.Add comment {Type 3}");
		
	}
	
	static String nameOfSeries;
	static BufferedReader reader;
	static int userchoice;
	static Abstaract abs;
	static int occuranceCounter;
	static int seriesVerifyFlag;
	
	public static void main(String[] args) throws Exception {
		display();
		reader = new BufferedReader(new InputStreamReader(System.in));
		userchoice =Integer.parseInt(reader.readLine());
		abs = new ExendedAbstarct();
			if (userchoice==1) {
				abs.getAllNominations();
					}
			else if (userchoice==2) {	
				System.out.println("Enter thename of the series");
				nameOfSeries = reader.readLine();
			
			SeriesBean nominationResult = abs.getNominaion(nameOfSeries);
			
				System.out.println("Name of the series :" +nominationResult.getName());
				System.out.println("Pulished Data :" +nominationResult.getNominateDate());
				System.out.println("Ratings :" +nominationResult.getRatings());
				System.out.println("Public Comments :" );
				
				nominationResult.getReviews().forEach(y ->{
					System.out.println(y);
				});			
		}
		else if (userchoice==3) {
			System.out.println("Enter the name of the Series");
			nameOfSeries = reader.readLine();
			System.out.println("Enter your comments");
			String comments = reader.readLine();
			
			SeriesBean seriesresult =abs.addComments(nameOfSeries,comments);
			
			System.out.println("Name of the series :" +seriesresult.getName());
			System.out.println("Pulished Data :" +seriesresult.getNominateDate());
			System.out.println("Ratings :" +seriesresult.getRatings());
			System.out.println("Public Comments :" );
			
			System.out.println(seriesresult.getReviews());
					
		}
		
		
		
		
	}

}
