import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class teste_final {
 
     static Integer getHigherConsecutive(String num) {
        
    	ArrayList<String> newList = new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<>();
		
		boolean alreadyExecuted = false;
		int last = Character.getNumericValue(num.charAt(num.length()-1));
		int first = Character.getNumericValue(num.charAt(0));
		
		for (int i = 1; i < num.length()-1; i++) {
			
			int current = Character.getNumericValue(num.charAt(i));
			int next = Character.getNumericValue(num.charAt(i + 1));
			int previous = Character.getNumericValue(num.charAt(i - 1));

			if (!alreadyExecuted) {
				if (current - first == 1 || current - first == -9) {
					newList.add(Integer.toString(first));
					alreadyExecuted = true;
				} 
			}
			
			if (current - previous == 1 || next - current == 1) {
				newList.add(Integer.toString(current));
			} 

			else if (current == 9 && next == 0) {
				newList.add(Integer.toString(current));
				newList.add(Integer.toString(next));
			} 
			
			else if (i == num.length()-2) {
				if (last - current == 1) {
					newList.add(Integer.toString(last));
				} 
			}
			
			else { 
				newList.add("x");
			}
		}
		
		String str="";
		for (String v : newList) {
			str+= v+"";
		}
		
		String[] parts = str.split("x");
		
		for(int j = 0; j < parts.length; j++) { 
			String k = parts[j];
			
			if(k.isBlank()) { 
				continue;
			}
			int n = Integer.parseInt(k);
			list.add(n);
		}
		return Collections.max(list);
    }
 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		String num = sc.next();
		
		Integer result = getHigherConsecutive(num);
		System.out.println(result);
		
		sc.close();
    }
}

//test cases
//53590
//674030098567819		
//9012364509789	
