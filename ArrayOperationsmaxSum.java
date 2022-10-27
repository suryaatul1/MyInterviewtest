/*
 There is an array A consisting of N integers. What is the maximum sum of two integers from A that share their first and
 last digits? For example, 1007 and 167 share their first (1) and last (7) digit, whereas 2002 and 55 do not.
 
 Write a function:
 
       class solution { public Int solution(	Int[] A); )
 
that given an array A consisting of N integers, returns the maximum sum of two integers that share their first and last
digits. If there are no two integers that share their first and last digits, that function should return -1

Examples:

1. Given A =[130,191,200,10] the function should return 140.The only integers in A that share first and last digits are 
130 and 10.

 2.Given A=[405,45,300,300] the function should return 600. There are two pairs of integers that share first and last digits:
 (405,45)and (300,300). The sum of two 300s is bigger than the sum of 405 and 45.
 
 3. Given A=[50,222,49,52,25],the function should return -1. There are no two integers that share their first and last
digits.

4. Given A=[30,909,3190,99,3990,9009], The function should return 9918.

Write an efficlent algorithm for the following assumptions:

      
 
*/


public class ArrayOperationsmaxSum {

	public static void main(String[] args) {
		
		//int[] A = {130,191,200,10};
		//int[] A = {405,45,300,300};
		int[] A = {50,222,49,52,25};
		//int[] A = {30,909,3190,99,3990,9009};
		
		System.out.println(solution(A));

	}

	
	public static int solution(int[] A) {
		
		int j = A.length -1;
		int sum =0 , max=0;
		
		for (int i=0 ; i < A.length ; i++) {
			if(String.valueOf(A[i]).charAt(0) == String.valueOf(A[j]).charAt(0) && A[i] % 10 == A[j] % 10 && i!=j ) {
				sum=A[j] + A[i];
				max = Math.max(max , sum);
				if (A[j] < A[i]) {
					j--;
				}
			}
		}
			
		if (max > 0) {
			return max;
		}else
			return -1;
	}
	
}
