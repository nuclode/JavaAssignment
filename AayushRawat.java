import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		int q = sc.nextInt();
		ArrayList<Integer> res = new ArrayList<>();
		sc.nextLine();
		while(q-- > 0) {
			String pat = sc.nextLine();
			for(int i=0; i<text.length(); i++) {
				int j, k = i;
				for(j=0; j<pat.length() && k < text.length(); j++) {
					if(text.charAt(k) == pat.charAt(j))
						k++;
					else
						break;
				}
				if(j == pat.length())
					res.add(i);
			}
		}
		Collections.sort(res);
		for(Integer i : res)
			System.out.print(i + " ");
	}
	
}
