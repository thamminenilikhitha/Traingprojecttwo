package Javaprogram;

public class Greaterless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] kill= {1,9,5,6,2,3};
		int  large=kill[0];
		int small=kill[0];
		{
			
			for(int i=1;i<kill.length;i++)
			{
				
				if(kill[i]>large) 
				{
				large=kill[i];
				}
				if(kill[i]<small)
				{
					small=kill[i];
				}
				
				//System.out.println("display the large number:" +kill);
				
				
		}
			System.out.println("display the large number:" +large);
			System.out.println("display the large number:" +small);
		}
	}

}

