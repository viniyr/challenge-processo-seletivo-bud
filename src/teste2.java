import java.util.ArrayList;
import java.util.Scanner;

public class teste2 {
	public static void main(String[] args) {
	

		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		ArrayList<Object> newList = new ArrayList<>();
		boolean alreadyExecuted = false;
	
		int last = Character.getNumericValue(num.charAt(num.length()-1));

		int first = Character.getNumericValue(num.charAt(0));
		
		for (int i = 1; i < num.length()-1; i++) {
			

			int current = Character.getNumericValue(num.charAt(i));

			int next = Character.getNumericValue(num.charAt(i + 1));

			int previous = Character.getNumericValue(num.charAt(i - 1));

			if (!alreadyExecuted) {
				if (current - first == 1 || current - first == -9) {
					newList.add(first);
					alreadyExecuted = true;
				}
			}

			if (current - previous == 1 || next - current == 1) {
				newList.add(current);
			}

			if (current == 9 && next == 0) {
				newList.add(current);
				newList.add(next);
			}
			
			
			if (i == num.length()-2) {
				if (last - current == 1) {
					newList.add(last);
				}
			}

//			|| current - previous == -9
//			53590
//			674030098567819		
//			9012364509789			

			

		}
		
		System.out.println(newList);
		sc.close();
		
	}
}