package Assigments;

public class Convertanegativenumbertopositivenumber {
private static int positiveNumber;

public static void main(String[]args) {
	int a=-40;
	int Positivenumber;
	if(a<0) {
		System.out.println(a +"is a negative");
	}
	if(a>0) {
		System.out.println(a +"is a positive");
	}
	if(a<0) {
		positiveNumber =a*(-1);
		System.out.println("positive number:"  + positiveNumber);
		
	}
}
}
 