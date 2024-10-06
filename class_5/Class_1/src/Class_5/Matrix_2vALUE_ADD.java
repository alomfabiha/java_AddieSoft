package Class_5;

public class Matrix_2vALUE_ADD {

	public static void main(String[] args) {
		int x[][]= {
				{1,1,1},
				{2,2,2},
				{3,3,3}
		};
		int y[][]= {
				{3,3,3},
				{2,2,2},
				{1,1,1}
		};
		
		int [][] result= new int [3][3];
		
		for (int i=0;i<x.length;i++)
		{
			for (int j=0;j<x[i].length;j++)
			{
				result[i][j]=x[i][j]+y[i][j];		
			    System.out.print(result[i][j]+ " ");	
			}
			System.out.println("  ");
		}
		
		}

	}


