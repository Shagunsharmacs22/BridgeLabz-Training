package OceanFleet;
import java.util.*;

public class VesselUtil {
	 private List<Vessel> vesselList = new ArrayList<>();

	    public List<Vessel> getVesselList() {
	        return vesselList;
	    }
	    public void setVesselList(List<Vessel> vesselList) {
	        this.vesselList = vesselList;
	    }
	    // Requirement 1: Add vessel
	    public void addVesselPerformance(Vessel vessel) {
	        vesselList.add(vessel);
	    }
	 // Requirement 2: Get vessel by ID
	    public Vessel getVesselById(String vesselId) {
	        for (Vessel v : vesselList) {
	            if (v.getVesselId().equals(vesselId)) {
	                return v;
	            }
	        }
	        return null;
	    }
	    // Requirement 3: Get High Performance Vessels
	    public List<Vessel> getHighPerformanceVessels() {

	        List<Vessel> result = new ArrayList<>();

	        if (vesselList.isEmpty()) {
	            return result;
	        }
	        double maxSpeed = vesselList.get(0).getAverageSpeed();

	        for (Vessel v : vesselList) {
	            if (v.getAverageSpeed() > maxSpeed) {
	                maxSpeed = v.getAverageSpeed();
	            }
	        }
	        // Step 2: Add vessels having max speed
	        for (Vessel v : vesselList) {
	            if (v.getAverageSpeed() == maxSpeed) {
	                result.add(v);
	            }
	        }
	        return result;
	    }

}
