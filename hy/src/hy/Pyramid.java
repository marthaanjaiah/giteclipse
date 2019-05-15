package hy;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int i, j, k;
		 for(i=5;i>=1;i--)
		 {
		 for(j=5;j>i;j--)
		 {
		 System.out.print(" ");
		 }
		 for(k=1;k<(i*2);k++)
		 {
		 System.out.print(k);
		 }
		 System.out.println();
		 System.out.println(i);
		 System.out.println(j);
		 System.out.println(k);
		 }
		 }
	}


