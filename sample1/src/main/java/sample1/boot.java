package sample1;

public class boot {
	public static void main(String args[] ) {
	System.out.println("hello");
show();
}
	
	public static void show() {
		int[] arr= {1,2,3,4,5};
		int sum=0;
		for(int n:arr)
		{  sum+=n;
			System.out.println(n);
		}
		System.out.println("hello 2");
	}
}
