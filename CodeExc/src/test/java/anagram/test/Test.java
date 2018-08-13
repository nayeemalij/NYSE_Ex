package anagram.test;

import anagram.util.Anagrams;
import distinctPairs.utils.Distinct_Pairs;

public class Test extends Anagrams{
	
	

	public static void main (String[] args) throws java.lang.Exception {
	// 1)	====  //
		
				// === TestAnagram excepts a String with words separated by any special characters ===  //
			   //     or many different spaces and will give you the output of anagrams of each other  //
				  
		System.out.println(" ===================== Test 1 Start =================  ");
		
				TestAnagram(" lhgg/glfd,hglg-gglh"); 
			 
				
		System.out.println("================== End of test 1 ======================");  	
		   
		   
		// ==== optional : If needed to create Anagrams of a single word === //
	   //          getAnagramsOfaWord("Love");                              // 
      // ================================================================= //

		
    // ==================================================================================== //
		System.out.println();
				
				System.out.println();

				
System.out.println(" ======================== Test 2 Start ==============================");				
	//2) === //
				   
		   // === The getDistinctPair function excepts an array of integers                == // 
		  //	   and the sum which you want to calculate and get the distinct pairs for.   //
				   Distinct_Pairs distinctPairs=new Distinct_Pairs();
				   distinctPairs.getDistinctPairs(new int[] {8,1,5,43,3,4,5,6,232,1,4,5,3,2}  ,   7 );
		//=================================================================================//		   
				   
System.out.println("===================== End Of Test 2 ============================= ");
    }


}
