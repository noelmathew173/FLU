package edu.sdmesa.cisc191;

/**
 * Lead Author(s):
 * @author Noel Mathew
 * date: 
 * 11/11/202
 * Responsibilities of class:
 * - Store information about an individual flu case.
 * - Inherit basic case information from CaseRecord.
 */
public class FluCase extends CaseRecord 
{
	// Instance variables
    private String fluType;
    private String severity;
    private String zipCode;

    // Constructor
    public FluCase(int caseId, String patientName,
                   String dateReported, String fluType,
                   String severity, String zipCode)
    {
        super(caseId, patientName, dateReported);

        this.fluType = fluType;
        this.severity = severity;
        this.zipCode = zipCode;
    }

    // Return the flu type
    public String getFluType()
    {
        return fluType;
    }

    // Return the severity
    public String getSeverity()
    {
        return severity;
    }

    // Return the ZIP code
    public String getZipCode()
    {
        return zipCode;
    }

    // Display flu case information
    @Override
    public String toString()
    {
        return "Case ID: " + getCaseId()
            + "\nPatient Name: " + getPatientName()
            + "\nDate Reported: " + getDateReported()
            + "\nFlu Type: " + fluType
            + "\nSeverity: " + severity
            + "\nZIP Code: " + zipCode;
    }
	
}

