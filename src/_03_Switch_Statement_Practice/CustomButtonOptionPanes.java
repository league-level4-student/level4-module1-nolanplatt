package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		
		switch(choice) {
		case "Sunday":
			System.out.println("sunday");
			break;
		case "Monday":
			System.out.println("monday");
			break;
		case "Tuesday":
			System.out.println("tuesday");
			break;
		case "Wednesday":
			System.out.println("wednesday");
			break;
		case "Thursday":
			System.out.println("thursday");
			break;
		case "Friday":
			System.out.println("friday");
			break;
		case "Saturday":
			System.out.println("saturday");
			break;
		default:
			System.out.println("N/A");
			break;
			
		
		}
		
	}
}
