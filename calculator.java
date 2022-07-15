package Assigments;

public class calculator {
	public void add(int num1,int num2,int num3) {
		System.out.println(num1+num2+num3);
	}
	public void sub (int num1,int num2) {
		System.out.println (num1-num2);
	}
	public void mul (double num1,double num2){
		System.out.println(num1*num2);
	}
	public void div(float num1,float num2){
		System.out.println(num1/num2);
	}
 public static void main(String[]args) {
      calculator call=new calculator();
      call.add(5,4,2);
      call.sub(8,2);
      call.mul(16d,4d);
      call.div(12.2f,12.2f);
 }
	}