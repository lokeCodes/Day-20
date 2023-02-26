// https://www.codechef.com/problems/SUBSCRIBE_
// Question link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int x = s.nextInt();
		    int y = s.nextInt();
		    int res = x/6;
		    if(x>6){
		        if(x%6!=0){
		            System.out.println((1+res)*y);
		        }else{
		            System.out.println(res*y);
		        }
		    }else{
		        System.out.println(y);
		    }
		}
	}
}
