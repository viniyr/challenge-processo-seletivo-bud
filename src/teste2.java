import java.util.ArrayList;
import java.util.Scanner;

public class teste2 {
	public static void main(String[] args) {
	

		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		ArrayList<Object> newList = new ArrayList<>();

		for (int i = 0; i < num.length()-1; i++) {
			

			int current = Character.getNumericValue(num.charAt(i));
			int next = Character.getNumericValue(num.charAt(i + 1));
			int previous;
			 
			
			if (next - current == 1) {
				newList.add(current);
			}
			
			if (next - current != 1) { 
				previous = Character.getNumericValue(num.charAt(i - 1));
					if (current - previous == 1) { 
						newList.add(current);
					}
			}
			
				
			
			
//			674030098567819
			

		}
		
		System.out.println(newList);
		sc.close();
		
	}
}
