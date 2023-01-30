package Controlstatement;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=-1;
		for(int i=1;i<=5;i++){
			if(i<=3) count=count+2;
			else count=count-2;
			for(int j=1;j<=count;j++)
				System.out.print("*");
			System.out.println();
		}

	}

}
