import java.io.IOException;
import java.util.Scanner;

public class MainProgram {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select option to run program: "
				+ "\n 1. Abstract Data Type Solution"
				+ "\n 2. Pipes and Filter Type Solution");

		int optionChosen = sc.nextInt();

		if (optionChosen == 1) {
			AbstractData AD = new AbstractData();
			AD.executeProgram();
		} else if (optionChosen == 2) {
			PipesAndFilter PF = new PipesAndFilter();
			PF.runForInput();
		} else {
			System.out.println("Invalid input! Enter 1 or 2 !");
		}
		sc.close();
	}

}
