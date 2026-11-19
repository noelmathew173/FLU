package edu.sdmesa.cisc191;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Lead Author(s):
 * @author Noel Mathew
 *
 * Responsibilities of interface:
 * - Define methods for loading flu case records.
 * - Define methods for saving flu case records.
 */
public interface DataStorage 
{
	
	
	// Load flu cases from a file
	public ArrayList<FluCase> loadCases() throws IOException;

	// Save flu cases to a file
	public void saveCases(ArrayList<FluCase> cases) throws IOException;
	
}
