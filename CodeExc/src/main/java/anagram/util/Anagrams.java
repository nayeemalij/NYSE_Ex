package anagram.util;

import java.awt.List;
import java.util.*;

public class Anagrams {

	public static void TestAnagram(String blockOfText) {

		HashSet<String>set=new HashSet<String>();
		blockOfText = blockOfText.replaceAll("[^\\p{L}\\p{Z}]","");
		blockOfText = blockOfText.trim().replaceAll(" +", " ");
		System.out.println("Input : " + blockOfText);
		
		
		String words[]=blockOfText.split(" ");
       
       
	       for(int i=0;i<words.length;i++) {
	    	   for(int y=0;y<words.length; y++) {
	    		 
	    		   
	    		   boolean result = isAnagram(words[i],words[y]);
	    		   if(result) {
	    			   set.add(words[y]);
	    			  // System.out.println(words[i] +"---- >"+ words[y]);
	    			  
	    		   }else{
	    			   set.remove(words[y]);
	    		   }
	    		   
	    	   }
	       }
	      
	       
		
		
	       System.out.println("OutPut : "+ set );
		
    
	}
	
	//===============================================================================//


    public static char[] charArray;

    public static void getAnagramsOfaWord(String word) {
        charArray = word.toCharArray();
        doAnagram(charArray.length);
    }

    public static void changeOrder(int newsize) {
        int j;
        int pointAt = charArray.length - newsize;
        char temp = charArray[pointAt];

        for (j = pointAt + 1; j < charArray.length; j++) {
            charArray[j - 1] = charArray[j];
        }

        charArray[j - 1] = temp;

    }

    public static void doAnagram(int newsize) {
        if (newsize == 1) {
            return;
        }
        for (int i = 0; i < newsize; i++) {
            doAnagram(newsize - 1);
            if (newsize == 2) {
                display();
            }
            changeOrder(newsize);
        }
    }

    public static void display() {
    	
    	HashSet<String>setOfWords=new HashSet<String>();
    	
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i]);
        }
        System.out.println();
    }

    
	//==============================================================================//
	
	
	
	
    public static boolean isAnagram(String first, String second)
    {
       
        first  = first.replaceAll("\\s", "").toLowerCase();
        second = second.replaceAll("\\s", "").toLowerCase();

       
        if (first.length() != second.length())
        return false;

 
        char[] firstArray = first.toCharArray();
        char[] secondArray = second.toCharArray();

       
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        return Arrays.equals(firstArray,secondArray);
    }

	

}
