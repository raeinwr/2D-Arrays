package wong;
import java.util.*;
public class Hotel_Reserve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int [][] hotel = new int[7][5];
		
		while(true) {
			System.out.println("\n--- Hotel Reservation System ---\n");
			System.out.println("1. View Rooms");
			System.out.println("2. Check In");
			System.out.println("3. Check Out");
			System.out.println("4. Exit Program");
			System.out.println("\nEnter Choice:");
			int opt = sc.nextInt();
			
			switch(opt) {
			case 1: 
				System.out.println("\nRoom Status");
				for (int i = 6; i >= 0; i--) {
					System.out.println("\nFloor " + (i + 1) + ": ");
					for(int a = 0; a < 5; a++) {
						System.out.print("[ " + hotel [i][a] + " ]" );
					}
					System.out.println("");
				}
				break;
			
			case 2:
				System.out.println("Enter Floor [1-7]:");
				int floor = sc.nextInt();
				System.out.println("Enter Room [1-5]:");
				int room = sc.nextInt();
					if (floor >= 1 && floor <= 7 && room >= 1 && room <= 5) {
					if (hotel[floor - 1][room - 1] == 0) {
                        hotel[floor - 1][room - 1] = 1;
                        System.out.println("You have Checked In successfully");
                    } else {
                        System.out.println("Room is already occupied. Please choose another room.");
                    }
                } else {
                    System.out.println("Invalid floor or room number. Please choose Floor [1-7] and Room [1-5].");
				}
					break;
			case 3:
				System.out.println("Enter Floor [1-7]:");
				int floorz = sc.nextInt();
				System.out.println("Enter Room [1-5]:");
				int roomz = sc.nextInt();
				
				if (floorz >= 1 && floorz <= 7 && roomz >= 1 && roomz >= 5) {
					if (hotel [floorz - 1] [roomz - 1] == 1) {
						hotel [floorz - 1] [roomz - 1] = 0;
						System.out.println("You have Checked Out successfully.");
					} else {
						System.out.println("Room is already empty.");
					}
				} else {
					System.out.println("Invalid Floor or Room Number. Please choose Floor [1-7] and Room [1-5].");
					
				}
				break;
			case 4:
				System.out.println("Exiting the program. Thank you !");
				return;
			
			default:
				System.out.println("INVALID");
				
			}
			
		}
		
	}

}
