
public class Fourweek1 {

	public static void main(String[] args) {
		double A[][]= {{1,0,2},{-1,3,1}};
		double B[][]= {{3,1},{2,1},{1,0}};
		
		double[][] C= new double [2][2];
		
		for (int i=0;i<A.length;i++) {
			for(int j=0;j<B[0].length;j++) {
				for (int k=0;k<B.length;k++) {
					C[i][j] +=A[i][k]*B[k][j];
					
				}
			}
		}
//	 C[0][0]=  A[0][0]* B[0][0]+ A[0][1]* B[1][0]+ A[0][2]* B[2][0];
//	 C[0][1]= A[0][0]*B[0][1]+A[0][1]*B[1][1]+A[0][2]*B[2][1];
//	 C[1][0]=  A[1][0]* B[0][0]+ A[1][1]* B[1][0]+ A[1][2]* B[2][0];
//	 C[1][1]= A[1][0]*B[0][1]+A[1][1]*B[1][1]+A[1][2]*B[2][1];
//	 
		System.out.println("Multiplication of two matrices is: ");
		for (double[] row:C) {
			for (double column:row) {
				System.out.print(column+"  ");
			}
			System.out.println();
		}
    
	 
		
			
		
		
		
		
		
		
		
		

	}

	
	}


