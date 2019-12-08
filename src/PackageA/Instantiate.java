package PackageA;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Instantiate {
	
	public void populate() {
		List<String> comments = new ArrayList();
		
		
		SeriesBean seres1 = new SeriesBean();
		
		seres1.setName("Oragane is the new Black");
		seres1.setRatings("3*-Rate ");
		seres1.setNominateDate(Calendar.getInstance().getTime());
		comments.add("Waiting for next Season");
		comments.add("not somthing that was expected");
		seres1.setReviews(comments);
		
		SeriesBean seres2 = new SeriesBean();
		
		seres2.setName("Alexa & Kattie");
		seres2.setRatings("5*-Rate ");
		seres2.setNominateDate(Calendar.getInstance().getTime());
		comments = new ArrayList();
		comments.add("Alexa Watching it for you");
		comments.add("Season 3 ???");
		seres2.setReviews(comments);
		
		SeriesBean seres3 = new SeriesBean();
		seres3.setName("Lassica Jones SO3");
		seres3.setRatings("3*-Rate ");
		seres3.setNominateDate(Calendar.getInstance().getTime());
		comments = new ArrayList();
		comments.add("jona is back");
		comments.add("is this based on Marwel?");
		seres3.setReviews(comments);
		
		SeriesBean seres4 = new SeriesBean();
		seres4.setName("Stranger things So2");
		seres4.setRatings("3*-Rate ");
		seres4.setNominateDate(Calendar.getInstance().getTime());
		comments = new ArrayList();
		comments.add("jona is back");
		comments.add("is this based on Marwel?");
		seres4.setReviews(comments);
		
		SeriesBean seres5 = new SeriesBean();
		seres5.setName("House Of Cards");
		seres5.setRatings("3*-Rate ");
		seres5.setNominateDate(Calendar.getInstance().getTime());
		comments = new ArrayList();
		comments.add("House of what?");
		comments.add("boring");
		seres5.setReviews(comments);
		
		SeriesBean seres6 = new SeriesBean();
		
		seres6.setName("Jessica jones sO2");
		seres6.setRatings("3*-Rate ");
		seres6.setNominateDate(Calendar.getInstance().getTime());
		comments = new ArrayList();
		comments.add("House of what?");
		comments.add("boring");
		seres6.setReviews(comments);
		
		SeriesBean seres7 = new SeriesBean();
		
		seres7.setName("Scared games");
		seres7.setRatings("3*-Rate ");
		seres7.setNominateDate(Calendar.getInstance().getTime());
		comments = new ArrayList();
		comments.add("House of What??");
		comments.add("boring");
		seres7.setReviews(comments);
				
		Abstaract.series.add(seres1);
		Abstaract.series.add(seres2);
		Abstaract.series.add(seres3);
		Abstaract.series.add(seres4);
		Abstaract.series.add(seres5);
		Abstaract.series.add(seres6);
		Abstaract.series.add(seres7);
		
	}

}
