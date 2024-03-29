package com.ge.exercise4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GE9x {
	
	 private static final Logger logger = LogManager.getLogger(GE9x.class);

	    private static final String ENGINE_MODEL = GE9x.class.getSimpleName();
	    private final String serialNumber;

	    public final int maxNumRebuilds = 5;
	    public final double flightHoursBeforeRebuild = 30000;
	    public final double dryWeight = 15505;
	    public final double wetWeight = 15900;
	    public final double takeoffThrust = 100000;

	    private double flightHours;
	    private int numRebuilds;

	    public GE9x(String serialNumber, double flightHours, int numRebuilds) {
	        this.serialNumber = serialNumber;
	        this.flightHours = flightHours;
	        this.numRebuilds = numRebuilds;
	    }

	    public GE9x(String serialNumber, double flightHours) {
	        this(serialNumber, flightHours, 0);
	    }

	    public GE9x(String serialNumber) {
	        this(serialNumber, 0.0);
	    }

	    public double getFlightHours() {
	        return flightHours;
	    }

	    public void setFlightHours(double flightHours) {
	        this.flightHours = flightHours;
	    }

	    public double thrustToWeightRatio() {
	        return takeoffThrust / dryWeight;
	    }
	    
	    public double getNoOfHoursBeforeRebuild() {
	    	
	    	return flightHoursBeforeRebuild-flightHours;
	    	
	    }
	    
	    public int getNumRebuilds() {
			return numRebuilds;
		}

		public void setNumRebuilds(int numRebuilds) {
			this.numRebuilds = numRebuilds;
		}

		public double getServiceLifeLeftInHours() {
	    	
	    	return ((maxNumRebuilds*flightHoursBeforeRebuild)-((numRebuilds*flightHoursBeforeRebuild)+flightHours));
	    	
	    }

	    public String toString() {
	        return ENGINE_MODEL + " SN: " + serialNumber;
	    }

}
