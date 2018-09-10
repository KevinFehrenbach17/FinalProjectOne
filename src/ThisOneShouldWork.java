import java.util.Scanner;

public class ThisOneShouldWork {
	public static void main(String[] args) {
		{
			Scanner input = new Scanner(System.in);

			// input variables

			// output variables

			System.out.println("What is your first name?");
			String nameF = input.nextLine();
			System.out.println("What is your Last name?");
			String nameL = input.nextLine();
			System.out.println("What is your age?");
			int userAge = input.nextInt();
			System.out.println("What is your birth month?");
			int month = input.nextInt();
			System.out.println("What is your favorite ROYGBIV color? type 'help' if you don't know what ROYGBIV is");
			String roy = input.next();
			if (roy.equals("help"))
				System.out.print("red, orange, yellow, green, blue, indigo, violet");
			System.out.println("How many sibilings do you have?");
			int sib = input.nextInt();

			String time;
			if (userAge % 2 == 0)
				time = "17 years";
			else
				time = "20 years";

			String place;
			if (sib == 1)
				place = " Playa del Carmen, Mexico";
			if (sib == 2)
				place = " Andelucia, Spain";
			if (sib == 3)
				place = " Middle of nowhere, Alabama";
			if (sib == 0)
				place = "Malibu, California";
			if (sib > 3)
				place = "Parents house, Sadvile";

			switch (roy) {
			case "red":
				roy = "Lambo";
				break;
			case "orange":
				roy = "Ferari";
				break;
			case "yellow":
				roy = "Maserati";
				break;
			case "green":
				roy = "BMW";
				break;
			case "blue":
				roy = "Mercedes Benz";
				break;
			case "indigo":
				roy = "Honda Civic";
				break;
			case "violet":
				roy = "Range Rover";
				break;
			}
			String bankAccount;
			switch (month) {
			case 1:
			case 2:
			case 3:
				bankAccount = "$150,000";
				break;
			case 4:
			case 5:
			case 6:
				bankAccount = "$2,550,000";
				break;
			case 7:
			case 8:
			case 9:
				bankAccount = "$7,000,000,000";
				break;
			case 10:
			case 11:
			case 12:
				bankAccount = "$20,000";
				break;
			default:
				bankAccount = "$0.05";

			}
			System.out.println(nameF + nameL + " will retire in " + time + " with " + bankAccount
					+ " in the bank, a vacation home in " + sib + " and travel by " + roy + ".");

		}

	}

}