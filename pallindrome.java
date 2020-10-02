public class Pallindrome
{
    public static void main(String arg[]) 
    { 	
	String str = arg[0];
	int i = 0,flag=0, j =(str.length() - 1); 	
	while (i < j) 
	{ 
	if (str.charAt(i) != str.charAt(j)) 
                flag=1; 
	i++; 
	j--; 
	} 
	if (flag==0) 
	System.out.print("Palindrome"); 
	else
	System.out.print("Not Palindrome"); 
	} 
