import java.util.*;
import java.io.*;

class DuplicateCharacters
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		char array[]=s.toCharArray();
		HashMap<Character, Integer>  charMap= new HashMap<Character, Integer>();
		for(Character ch : array)
		{
			if(charMap.containsKey(ch))
			{
				charMap.put(ch,charMap.get(ch)+ 1);
			}
			else
			{
				charMap.put(ch,1);
			}
		}

	//iterate through hashmap to print all duplicate characters
	Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
	for(Map.Entry<Character, Integer> entry : entrySet)
	{
		if(entry.getValue()>1)
		System.out.printf("%s", entry.getKey());
	}
}
}
