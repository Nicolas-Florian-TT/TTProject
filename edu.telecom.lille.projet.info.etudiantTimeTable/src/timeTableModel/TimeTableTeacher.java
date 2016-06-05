/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package timeTableModel;
import java.util.*;
import timeTableModel.TimeTable;
// Start of user code (user defined imports)

// End of user code

/**
 * Cette classe est une classe fille de TimeTable. Elle poss�de les m�mes attributs et les m�mes m�thodes
 * 
 * @author FlorianNicolas
 */
public class TimeTableTeacher extends TimeTable {

	private String TimeTableId;
	
	// End of user code

	/**
	 *Le constructeur.
	 *Cette classe est une classe fille de TimeTable, qu'on appelle avec la m�thode "super()"
	 *On fixe ensuite des valeurs dans TimeTableId 
	 *et bookings, qui est une collection de reservation pour un TimeTable particulier
	 * @param TimeTableId 
	 */
	public TimeTableTeacher(Integer TimeTableId) {
		super(TimeTableId);
		
		String TimeTableIdString;
		TimeTableIdString = "" + TimeTableId;
		this.TimeTableId=TimeTableIdString;
		
		this.bookings = new HashSet<Booking>();
	}
		

	
}
