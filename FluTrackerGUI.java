package edu.sdmesa.cisc191;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Font;

/**
 * Lead Author(s):
 * @author Noel Mathew
 *Date:
 *11/11/2026
 * Responsibilities of class:
 * - Create the main menu for the Flu Case Tracking Application.
 * - Display buttons for the main features.
 */
public class FluTrackerGUI extends JFrame 
{
	 public FluTrackerGUI()
	    {
	        // Set up the window
	        setTitle("Flu Case Tracker");
	        setSize(500, 400);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);

	        // Create the title
	        JLabel title = new JLabel(
	            "<html><center>Main Menu<br>"
	            + "Flu Case Tracker<br>"
	            + "San Diego, California</center></html>",
	            SwingConstants.CENTER
	        );

	        title.setFont(new Font("Arial", Font.BOLD, 20));

	        // Create the four buttons
	        JButton addButton = new JButton("Add Case");
	        JButton viewButton = new JButton("View Cases");
	        JButton searchButton = new JButton("Search Cases");
	        JButton statisticsButton = new JButton("Statistics");

	        // Create a panel with 2 rows and 2 columns
	        JPanel buttonPanel = new JPanel();
	        buttonPanel.setLayout(new GridLayout(2, 2, 20, 20));

	        buttonPanel.add(addButton);
	        buttonPanel.add(viewButton);
	        buttonPanel.add(searchButton);
	        buttonPanel.add(statisticsButton);

	        // Organize the window
	        setLayout(new BorderLayout(20, 20));

	        add(title, BorderLayout.NORTH);
	        add(buttonPanel, BorderLayout.CENTER);

	        // Display the GUI
	        setVisible(true);
	    }

	    public static void main(String[] args)
	    {
	        javax.swing.SwingUtilities.invokeLater(() -> {
	            new FluTrackerGUI();
	        });
	    
	    }

}
