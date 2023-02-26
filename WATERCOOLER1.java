// https://www.codechef.com/problems/WATERCOOLER1
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
		    int y = s.nextInt();
		    int z = s.nextInt();
		    String res = (x*z)<y ? "YES" : "NO";
		    System.out.println(res);
		}
	}
}
