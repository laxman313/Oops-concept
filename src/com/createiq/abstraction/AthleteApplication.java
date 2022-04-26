package com.createiq.abstraction;

import java.sql.Date;

public class AthleteApplication{
	
	

	public static void main(String[] args) {
		CricketPlayer Dhoni=new CricketPlayer("dhoni", "captin cool", new Date(1978,8,15), "india", 425, 30, 68, 147, 44.78f);
//	 Dhoni.getBiodata();
//	 Dhoni.compititions();
//	 Dhoni.bodytype();
//	
	CricketPlayer ganguly = new CricketPlayer("sarouv ganguly", " Dada ", new Date(1969, 12, 8), "India ", 320, 45,
			125, 3200, 27);
//	ganguly.getBiodata();
//	ganguly.compititions();
//	ganguly.bodytype();
	CricketPlayer [] cricketers=new CricketPlayer[2];
	cricketers[0]=Dhoni;
	cricketers[1]=ganguly;
	for(CricketPlayer cricket:cricketers){
		cricket.getBiodata();
		cricket.compititions();
		cricket.bodytype();
		
		
	}
	System.out.println("===========================");
	Football messi=new Football("messi riano", "messi", new Date(1978,8,4),"brezil", 98, 15, 12, "Barsilona");
//	       messi.getBiodata();
//	       messi.compititions();
//	       messi.bodytype();
	       Football uday=new Football("uday", "nani",new Date(1991,9,19),"hydrabad", 85, 8, 9, "chennai");
//	       uday.getBiodata();
//	       uday.compititions();
//	       uday.bodytype();
	       Football[] football=new Football[2];
	       football[0]=messi;
	       football[1]=uday;
	       for(Football ball:football) {
	    	   ball.getBiodata();
	    	   ball.compititions();
	    	   ball.bodytype();
	    	   
	       }
	       
	
	}

}
 