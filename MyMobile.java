package Assigments;

public class MyMobile {
	public void makecall() {
		System.out.println("makecall");
	}
	public void sendmsg() {
		System.out.println("sendmsg");
	}
     private void paybills() {
    	 System.out.println("paybills");
    }
     public static void main (String[]args) {
    	 MyMobile MM = new MyMobile();
    	 System.out.println("MyMobile");
    	 MM.makecall();
    	 MM.sendmsg();
    	 MM.paybills();
     }
}
