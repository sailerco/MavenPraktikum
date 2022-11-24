package de.hfu;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type your text:");
		Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        sc.close();
        System.out.println(line.toUpperCase());
	}

}
