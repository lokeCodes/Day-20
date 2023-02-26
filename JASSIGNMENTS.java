// https://www.codechef.com/problems/JASSIGNMENTS
// Question Link^^^

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
		    String res = (x+3)<=10 ? "Yes" : "No";
		    System.out.println(res);
		}
	}
}
