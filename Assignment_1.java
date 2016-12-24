package Session1;

public class Assignment_1 {
	public static void main(String args[])
	{
		Assignment_1 a= new Assignment_1();
		System.out.println(a.add(10, 12));
		
		
	}
	
	public int add(int x, int y)
	{
		while(y!=0){
			int c=x&y;
			x=x^y;
			y=c<<1;
		}
		return x;
		
	}

}
