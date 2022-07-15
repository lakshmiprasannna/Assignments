package Assigments;

public class primenumber {

		public static void main(String[]args) {
			int num=13;
			int i;
			boolean flag = flase;
			for (i=2;i<=(num/2);i++) {
				if (num % i==0) {
				flag=true;
				break;
				}
		}
			if (flag==flase) {
				System.out.println(num +" is a prime number");

			}
			else {
				System.out.println(num +" is not a prime number");

			}

}
