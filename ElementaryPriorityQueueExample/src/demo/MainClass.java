package demo;

import java.util.Random;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		UnorderedMaxPQ priorityQueue = new UnorderedMaxPQ();
		String userChoice = null;
		Random random = new Random();
		
		do{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Choice: Insert / Max / Exit");
			userChoice = scanner.nextLine();
			if(userChoice.equalsIgnoreCase("Insert")){
				int randomValue = random.nextInt(100);
				System.out.println("Random Value: "+randomValue);
				priorityQueue.insert(randomValue);
			}
			else if(userChoice.equalsIgnoreCase("Max")){
				if(!priorityQueue.isEmpty()){
					System.out.println("Max Value: "+priorityQueue.delMax());
				}
				else{
					System.out.println("No values are present");
				}
			}
			else if(userChoice.equalsIgnoreCase("Exit")){
				scanner.close();
				break;
			}
			else{
				System.out.println("Please enter a valid choice");
			}
		}while(true);
		System.out.println("Thank You!");
	}

}
