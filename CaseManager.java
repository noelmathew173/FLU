
package edu.sdmesa.cisc191;
import java.util.ArrayList;
import java.io.IOException;
/**
 * Lead Author(s):
 * @author Noel Mathew
 *
 * Responsibilities of class:
 * - Store and manage flu cases using an ArrayList.
 * - Add, search, and count flu cases.
 */

public class CaseManager 
{
	// ArrayList to store flu cases
    private ArrayList<FluCase> cases;
    private DataStorage storage;
    // Constructor
    public CaseManager(DataStorage storage)
    {
        cases = new ArrayList<FluCase>();
        this.storage = storage;
    }

    // Add a flu case
    public void addCase(FluCase fluCase)
    {
        cases.add(fluCase);
    }

    // Search for a flu case by its ID
    public FluCase searchById(int caseId)
    {
        for (FluCase fluCase : cases)
        {
            if (fluCase.getCaseId() == caseId)
            {
                return fluCase;
            }
        }

        return null;
    }

    // Search for flu cases by patient name
    public ArrayList<FluCase> searchByName(String name)
    {
        ArrayList<FluCase> results = new ArrayList<FluCase>();

        for (FluCase fluCase : cases)
        {
            if (fluCase.getPatientName().equalsIgnoreCase(name))
            {
                results.add(fluCase);
            }
        }

        return results;
    }

    // Return all flu cases
    public ArrayList<FluCase> getAllCases()
    {
        return new ArrayList<FluCase>(cases);
    }
    
  // Load flu cases from the CSV file into the ArrayList
    public void loadCases() throws IOException
    {
        cases = storage.loadCases();
    }
 // Save all flu cases from the ArrayList into the CSV file
    public void saveCases() throws IOException
    {
        storage.saveCases(cases);
    }

    // Count flu cases in a ZIP code
    public int countCasesByZip(String zipCode)
    {
        int count = 0;

        for (FluCase fluCase : cases)
        {
            if (fluCase.getZipCode().equals(zipCode))
            {
                count++;
            }
        }

        return count;
    }
}
