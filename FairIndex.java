/*
 You are given two arrays A and B consisting of N integers each.
 
 Index K is named fair if the four sums (A [0]+...+ A[K]+...+A[N-1]),(B[0]+...B[K-1])and (B[K]+...
 + B[N-1] are all equal. In other words, K is the index where the two arrays, A and B can be split (into two non-
 empty arrays each) in such a way that the sums of all the resulting arrays' elements are equal.
 
 
 For example given arrays A = [0,4,-1,0,3] and B =[0,-2,5,0,m3] index K=3 is fair
 
 
     0    1    2   | 3    4
-------------------|----------                   
 A   0    4   -1   | 0    3
                   | 
 B   0   -2    5   | 0    3

The sum of the four subarrays are all equal:0 + 4 + (-1)=3; 0 +3=3; 0+(-2) +5 =3 and 0 + 3 = 3.On the 
other hand index K = 2 is not fair ,the sum of the sbarrays are : 0 + 4 + =4; (-1) + 0 + 3 =2; 0+(-2) =2 and 5 + 
0 + 3 = 8.

Write a function:

      class solution { public int solution (int[] A, int [] B);}
      
which given two arrays of integers A and B returns the total number of fair indexes.

       
Examples:

1. Given A= [0,4,-1,0,3] and B= [0,-2,5,0,3] your function should return 2. The fair indexes are 3 and 4. In 
both cases, the sums of elements of subarrays are equal to 3.

2. Given A= [2,-2,-3,3] and B = [0,0,4,-4], your function should return 1.The only fair index is 2. Index 4 is
not fair as the subarrays containing indexes from K to N -1 would be empty. 
 */


public class FairIndex {
	
	public static void main(String[] args) {
		
		int[] A = {2,-2,-3,3};
		int[] B = {0,0,4,-4};
		
		System.out.println(solution(A,B));
	}
	
	public static int solution(int[] A , int[] B) {
		
		int sumA=0;
		int sumB=0;
		
		for (int i=0 ; i<A.length ; i++) {
			sumA += A[i];
			sumB += B[i];
		}
		
		int count =0;
		int tempA = A[0];
		int tempB = B[0];
		
		for (int i =1 ; i <A.length  ; i++) {
			if (i != 1 && tempA == tempB &&  2*tempA == sumA && 2*tempB == sumB ) {
				count++;
			}
			
			tempA += A[i];
			tempB += B[i];
		}
		
		return count;
	}

}
