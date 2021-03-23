package com.amulya;
import java.util.*;
public class StringCounter
{
    static int getCount(String[] input,String s)
    {
        int wordCount = 0;
        for(String i : input)
        {
            if(i.equalsIgnoreCase(s))
                wordCount++;
        }
        return wordCount;
    }
    public static void main(String[] args) {
        System.out.println("Enter the string....");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        //System.out.println("Entered String : "+input);
        String lowerInput = input.toLowerCase();
        //System.out.println("Lower Case Input String : "+lowerInput);
        String[] inputWords = lowerInput.split(" ");
        //for(String i: inputWords)
        //    System.out.print(i+",");
        ArrayList<String> uniqueWords = new ArrayList<String>();
        for(String i: inputWords)
        {
            if(!uniqueWords.contains(i))
            {
                uniqueWords.add(i);
            }
        }
        //System.out.println("\n"+uniqueWords);
        for(String word: uniqueWords)
        {
            System.out.println(word+" --> "+getCount(inputWords,word));
        }
    }

}
