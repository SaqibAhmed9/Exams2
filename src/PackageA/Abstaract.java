package PackageA;

import java.util.ArrayList;
import java.util.List;

public abstract class Abstaract {
	
	public static List<SeriesBean> series;
	
	public Abstaract () {
		new Instantiate().populate();
	}

	
	static {
		series = new ArrayList<SeriesBean>();
	}
	
	
	public void getAllNominations() {
		series.forEach(x ->{
			System.out.println("Name of the series :" +x.getName());
			System.out.println("published Date :" +x.getNominateDate());
			System.out.println("Ratings :" +x.getRatings());
			System.out.println("Public comment :");
			x.getReviews().forEach(y -> {
				System.out.println(y);
			});
			
		
			
			System.out.println("..................");
		});
	}
	
	abstract SeriesBean getNominaion(String name) throws Exception;
	
	public abstract SeriesBean addComments(String...comments)  throws Exception;
}
