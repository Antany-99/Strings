package Strings;

import java.sql.Date;
public class TwoDates {

public static void main(String[] args) {
		Date date1 = new Date(2000, 2, 1);
		Date date2 = new Date(2000, 3, 1);
		long date1InMs = date1.getTime();
		long date2InMs = date2.getTime();
		long timeDiff = Math.abs(date1InMs-date2InMs);
		int daysDiff = (int) (timeDiff / (1000 * 60 * 60* 24));
		System.out.println("No of days diff is : "+daysDiff);
		
	}

}
