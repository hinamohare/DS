package test;

import java.util.HashMap;
import java.util.Scanner;

public class anagrams {

	public static void main(String[] args) {
	    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
		// TODO Auto-generated method stub
	static boolean isAnagram(String s1, String s2) {   
		s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
	        int i;
	        int L1 = s1.length();
	        int L2 = s2.length();
	        char c;
	        if (L1!= L2)
	            return false;
	        
	        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	       
	        for(i =0; i< L1 ; i++)
	       {
	            c = s1.charAt(i);
	            if( map.containsKey(c))
	                map.put(c, map.get(c)+1);
	            else
	                map.put(c, 1);
	            
	        }
	        for(i =0; i< L2 ; i++)
	        {
	            c = s2.charAt(i);
	            if(map.containsKey(c))
	                if(map.get(c)>=1)
	                    map.put(c, map.get(c)-1);
	                else
	                    return false;      
	            else 
	                return false;
	        }
	        return true;
	             
	    }
	}


