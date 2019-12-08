package PackageA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class ExendedAbstarct  extends Abstaract{
	
	
//	public static List<SeriesBean> series;

	@Override
	SeriesBean getNominaion(String name) throws Exception {
		SeriesBean seriesActual = null;
		int occuranceCounter = 0, seriesVerifyFlag = 0, seriesCount = Abstaract.series.size();
		for(int i = 0; i<seriesCount;i++) {
			if(Abstaract.series.get(i).getName().toUpperCase().replace(" ", "").contains(name.toUpperCase().trim().replace(" ", ""))) {
				 occuranceCounter++;
				 seriesVerifyFlag ++;
			}
		}
		if(UserInteface.userchoice==2)
		{
		 if(occuranceCounter>1||seriesVerifyFlag==0)
			 throw new Exception("Match Not Found. Please Check spelling");
		}
		else if(UserInteface.userchoice==3)
		{
			if(occuranceCounter>1||seriesVerifyFlag==0)
				 throw new Exception("Match Not Found. Comments not added");
		}
		for(int i = 0; i<seriesCount;i++) {
			if(Abstaract.series.get(i).getName().toUpperCase().replace(" ", "").contains(name.toUpperCase().trim().replace(" ", ""))) {
				 seriesActual = Abstaract.series.get(i); 
			}
		}
		return seriesActual;
	}
	
	
	@Override
	public void getAllNominations() {
		series.forEach(x ->{
			System.out.println("Name of the series :" +x.getName());
			System.out.println("Ratings :" +x.getRatings());		
			System.out.println("*********************************************");
		});
	}
	

	@Override
	public SeriesBean addComments(String... comments) throws Exception {

		SeriesBean nominationResult = this.getNominaion(comments[0]);
		List<String> reviewsResult = nominationResult.getReviews();
			reviewsResult.add(comments[1]);
			nominationResult.setReviews(reviewsResult);
		return nominationResult;
	}
	
	

}
