package edu.sdmesa.cisc191;
/**
 * Lead Author(s):
 * @author Noel Mathew
 * date: 
 * 11/11/2026
 * Responsibilities of class:
 * - Store basic information about a case.
 * - Provide methods to access case information.
 */
public abstract class CaseRecord 
{
	// Instance variables
    private int caseId;
    private String patientName;
    private String dateReported;
    
    // Constructor
    public CaseRecord(int caseId, String patientName,
                      String dateReported)
    {
        this.caseId = caseId;
        this.patientName = patientName;
        this.dateReported = dateReported;
    }

    // Return the case ID
    public int getCaseId()
    {
        return caseId;
    }

    // Return the patient name
    public String getPatientName()
    {
        return patientName;
    }

    // Return the date reported
    public String getDateReported()
    {
        return dateReported;
    }

}
