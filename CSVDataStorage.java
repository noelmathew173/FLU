package edu.sdmesa.cisc191;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;

public class CSVDataStorage implements DataStorage
{
    private String fileName;

    // Constructor
    public CSVDataStorage(String fileName)
    {
        this.fileName = fileName;
    }

    // Load flu cases from the CSV file
    @Override
    public ArrayList<FluCase> loadCases() throws IOException
    {
        ArrayList<FluCase> cases = new ArrayList<FluCase>();

        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        // Skip the header
        if (scanner.hasNextLine())
        {
            scanner.nextLine();
        }

        // Read each flu case
        while (scanner.hasNextLine())
        {
            String line = scanner.nextLine();

            if (!line.trim().isEmpty())
            {
                String[] data = line.split(",");

                int caseId = Integer.parseInt(data[0]);
                String patientName = data[1];
                String dateReported = data[2];
                String fluType = data[3];
                String severity = data[4];
                String zipCode = data[5];

                FluCase fluCase = new FluCase(
                    caseId, patientName, dateReported,
                    fluType, severity, zipCode
                );

                cases.add(fluCase);
            }
        }

        scanner.close();

        return cases;
    }

    // Save flu cases 
    @Override
    public void saveCases(ArrayList<FluCase> cases) throws IOException
    {
    	 try (PrintWriter writer = new PrintWriter(fileName))
    	    {
    	        writer.println("caseId,patientName,dateReported,fluType,severity,zipCode");

    	        for (FluCase fluCase : cases)
    	        {
    	            writer.println(
    	                fluCase.getCaseId() + "," +
    	                fluCase.getPatientName() + "," +
    	                fluCase.getDateReported() + "," +
    	                fluCase.getFluType() + "," +
    	                fluCase.getSeverity() + "," +
    	                fluCase.getZipCode()
    	            );
    	        }

    	        if (writer.checkError())
    	        {
    	            throw new IOException("Error saving flu cases.");
    	        }
    	    }
    }
}

