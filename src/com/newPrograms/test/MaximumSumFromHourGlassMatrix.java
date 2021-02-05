package com.newPrograms.test;

public class MaximumSumFromHourGlassMatrix {
	
	static int row = 6;
	static int col = 6;
	
	
	
public static int calculateMaxSum(int[][] mat) {
	
	if(row<3 || col<3) {
		return -1;
	}
	int max_sum = Integer.MIN_VALUE;
	
	for(int i=0;i<row-2;i++) {
		for(int j=0;j<col-2;j++) {
			int sum = (mat[i][j] + mat[i][j+1] + mat[i][j+2]) + 
					 ( mat[i+1][j+1]) +
					  (mat[i+2][j] + mat[i+2][j+1] + mat[i+2][j+2]);
			max_sum = Math.max(max_sum, sum);
		}
	}
	return max_sum;
}

	public static void main(String[] args) {
		
		int [][]mat = {{1, 2, 3, 0, 0, 4}, 
                       {0, 0, 0, 0, 0, 3}, 
                       {2, 1, 4, 0, 0, 1}, 
                       {0, 0, 0, 5, 0, 2}, 
                       {1, 1, 0, 1, 1, 0},
                       {2, 3, 1, 5, 0, 4}}; 
 int res = calculateMaxSum(mat); 
 if (res == -1) 
     System.out.println("Not possible"); 
 else
     System.out.println("Maximum sum of hour glass = "+ res); 
		

	}

}
