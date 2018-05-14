import java.util.Random;

import javax.swing.JOptionPane;

public class SkillWS {
	public static void main(String[] args) {
		SkillWS skills = new SkillWS();
		skills.skill1();
		skills.skill2();
		skills.skill3();
		skills.skill4();
		skills.skill5();
	}

	void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
		String Dimes = JOptionPane.showInputDialog("How many dimes do you have?");
		int n = Integer.parseInt(Dimes);
		JOptionPane.showMessageDialog(null, "you have " + n * 10 + " cents");

		// Tell them how many cents they have (hint multiply by 10)

		// Ask the user how tall they are (inches)

		String Inches = JOptionPane.showInputDialog("How tall are you (Inches)");
		int l = Integer.parseInt(Inches);
		if (l < 36) {
			JOptionPane.showMessageDialog(null, "eat your wheats");
		} else {
			JOptionPane.showMessageDialog(null, "nice");
		}

		// If they are shorter than 36 inches, tell them to eat their Wheaties

	}

	void skill2() { // Write a loop to print every third number between 1 and 30 to the console

		for (int i = 0; i < 31; i += 3) {
			System.out.println(i);
			System.out.print("\n");
		}

	}

	void skill3() { // Get a random number that is less than 20 and print it to the console
		Random gen = new Random();
		int num = gen.nextInt(20);
		System.out.println(num);
		int i = gen.nextInt(10);
		System.out.println(i);
		System.out.println(num - i);

		// Get another random number that is less than 10 and print it to the console

		// Using a pop-up, tell the user the difference between the numbers // Hint: use
		// subtraction

	}

	void skill4() { // In a pop-up, ask the user for the city they live in

		String City = JOptionPane.showInputDialog("what city do you live in?");

		if (City.equals("San Diego")) {
			JOptionPane.showMessageDialog(null, "You're living in America's Finest City!");
		} else {
			JOptionPane.showMessageDialog(null, "MOVE TO SAN DIEGO!!!!!!!!");
		}

		// If they answered "San Diego", tell them they live in Americ's Finest City

		// Otherwise, tell them to move to San Diego

		// Create a variable - cars - and initialize it to the number of cars your
		// family has. // If there are 0 cars, use a pop-up to display, "I bet you use
		// public transportation."

		String cars = JOptionPane.showInputDialog("how many cars do you have in your family?");
		int i = Integer.parseInt(cars);
		if (i == 0) {
			JOptionPane.showMessageDialog(null, "I bet you use public transportation");
		} else if (i == 1) {
			JOptionPane.showMessageDialog(null, "the model of the car is 2018 Mazda 3");
		}
		// If there is 1 car, use a pop-up to display the make/model of the car
		else if (i > 1) {
			JOptionPane.showMessageDialog(null, "you're family has " + i * 4 + " wheels in total!");
		}
		// If there is more than 1 car, use a pop-up to display how many wheels the //
		// cars have between them.

	}

	void skill5() { // In a pop-up, ask the user for the name of their school

		String School = JOptionPane.showInputDialog("what school do you go to?");
		JOptionPane.showMessageDialog(null, School + " is a fantastic school");

		// In another pop-up, tell the user, that their school is a fantastic school. //
		// You must include the name of the school in the message.

	}
}