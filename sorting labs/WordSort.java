//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class WordSort
{
	private String[] wordRay;

	public WordSort(String line)
	{
	   wordRay = line.split(" ");
	}

	public void setList(String line)
	{
		wordRay = line.split(" ");
	}

	public void sort()
	{
		 for(int i=0;i<wordRay.length;i++){
			int min=i;
			for(int x=i+1;x<wordRay.length;x++){
				if(wordRay[min].compareTo(wordRay[x])>0){
					min=x;
				}
			}
			String temp= wordRay[min];
			wordRay[min]=wordRay[i];
			wordRay[i]=temp;
		 }
	}

	public String toString( )
	{
		String output="";
		for(int i=0; i<wordRay.length;i++)
		{
			System.out.println("word "+i+" : " +wordRay[i]);
		}
		return output+"\n\n";
	}
}