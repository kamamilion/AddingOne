package myProject;

import java.util.ArrayList;

public class AddingNumber {
	 int number;
	 
	void setNumber(int n) {
			number = n;
		}
	void IncreaseEachDigit() {
		ArrayList<Integer> digits = new ArrayList<Integer>();
		while (number != 0) {
			digits.add(number % 10);
			number = number / 10; 
			}
		int i = digits.size() - 1;
		while (i >= 0) {
			System.out.print(digits.get(i) + 1);
			i--;
		}	
}
	public static void main(String[] args) {
		AddingNumber test = new AddingNumber();
		test.setNumber(84398);
		test.IncreaseEachDigit();
	}
}
