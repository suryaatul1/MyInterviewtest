import com.sun.tools.javac.launcher.Main;

/*
 
 A string S made of uppercase English letters is given.In one move, six letters from the word 'BANANA' (ONE 'B', three 
 'A's and two 'N's) can be deleted from S. What is the maximum number times such a move can be applied to s?
 
 Write a function :
       
       class solution {public Int solution (string S): }
       
 that,given a string S of length N, returns the maximum numbers of moves that can be applied.
 
 Examples:
 
 1. Given S='NAABXXAN', the function should return 1.
  
  
    NAABXXAN ---> XX
  
 2. Given S='NAANAAXNABABYNNBZ', the function should return 2.
 
 
    NAANAAXNABABYNNBZ ---> NAAXNABYNBZ ---> XBYNZ
    
 3.Given S= 'QABAAAWOBL ', the function should return 0.
 
          QABAAAWOBL
 
 
 */




public class StringManipulation {
	
	public static void main(String[] args) {
		
		//String S = "NAABXXAN";
		//String S = "NAANAAXNABABYNNBZ";
		String S = "QABAAAWOBL";
		
		System.out.println(solution(S));
		
	}
	
	
	public static int solution(String S) {
		
		int pass=0;
		
		while (S.length() > "BANANA".length()) {
			StringBuffer sb = new StringBuffer();
			int A =0;
			int B=0;
			int N=0;
			
			for (int i=0; i<S.length() ; i++) {
				
				if(S.charAt(i)=='A' && A< 3) {
					A++;
				}else if (S.charAt(i)=='B' && B < 1) {
					B++;
				}else if (S.charAt(i)=='N' && N < 2) {
					N++;
				}else {
					sb.append(S.charAt(i));
				}
			}
			
			if (A==3 && B==1 && N==2) {
				pass++;
			}
			
			S = new String(sb);
		}
		
		return pass;
	}
	

}
