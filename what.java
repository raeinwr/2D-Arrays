package wong;
public class what {

	public static void main(String[] args) {
		int num[][] = { 
				{ 120, 250, 789, 7 }, 
				{ 58, 79, 31, 87 }, 
				{ 8, 1, 2, 3 }, 
				{ 99, 98, 97, 96 }
				};

		System.out.println("First Array:");
		System.out.println();
		
		for (int i = 0; i < num.length; i++) {
			for (int a = 0; a < num[i].length; a++) {
				System.out.print(num[i][a] + "\t");
			}
			System.out.println();
		}

		for (int i = 0; i < num.length; i++) {
			for (int a = 0; a < num[i].length; a++) {
				if (num[i][a] == 1) {
					System.out.println("\nNumber 1 is found at indices: [" + i + "][" + a + "]");

					num[i][a] = 50;
				}
			}
		}

		System.out.println("\nNumber 1 is now changed to Number 50.");
		System.out.println("\nUpdated Array: \n");
		
		for (int i = 0; i < num.length; i++) {
			for (int a = 0; a < num[i].length; a++) {
				System.out.print(num[i][a] + "\t");
			}
			System.out.println();
		}
		for (int a = 0; a < num[1].length; a++) {
			num[1][a] = 0;
		}

		System.out.println("\nRow 2 elements are now changed to 0's");
		System.out.println("\nUpdated Array: \n");
		for (int i = 0; i < num.length; i++) {
			for (int a = 0; a < num[i].length; a++) {
				System.out.print(num[i][a] + "\t");
			}
			System.out.println();
		}
	}

}
