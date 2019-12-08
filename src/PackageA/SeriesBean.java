package PackageA;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SeriesBean {
	
	private String name;
	private String ratings;
	private Date nominateDate;
	private List<String> reviews;
	
	public SeriesBean() {
		
		reviews =new ArrayList<String>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRatings() {
		return ratings;
	}

	public void setRatings(String ratings) {
		this.ratings = ratings;
	}

	public Date getNominateDate() {
		return nominateDate;
	}

	public void setNominateDate(Date nominateDate) {
		this.nominateDate = nominateDate;
	}

	public List<String> getReviews() {
		return reviews;
	}

	public void setReviews(List<String> reviews) {
		this.reviews = reviews;
	}
	
	
	
}
