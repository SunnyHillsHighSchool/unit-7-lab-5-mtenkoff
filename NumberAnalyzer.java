//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Mel Tenkoff

import java.util.ArrayList;

public class NumberAnalyzer
{
	private ArrayList<Number> list;

	//write a constructor
  public NumberAnalyzer(int[]n)
  {
    for(int a: n)
    {
      list.add(new Number(a));
    }
  }
	//write count odds
  //method header: returns an int, called countOdds
  public int countOdds()
  {
    //create an int called numOdds
    int numOdds = 0;
    //for loop: control variable i=0, while it is less than the size of list, increment i
    for (int i = 0; i < list.size(); i++)
    {
      //if statement: is i.isOdd = true
      if (list.get(i).isOdd() == true) 
      {
        numOdds++;
      }
    }
    return numOdds;
  }

	//write count evens
  //method header: returns an int, called countEvens
  public int countEvens()
  {
    //create an int called numEvens
    int numEvens = 0;
    //for loop: control variable i=0, while it is less than the size of list, increment i
    for (int i = 0; i < list.size(); i++)
    {
      //if statement: is i.isOdd = false
      if (list.get(i).isOdd() == false) 
      {
        numEvens++;
      }
    }
    return numEvens;
  }

	//write count perfects
  //method header: returns an int, called countPerfects
  public int countPerfects()
  {
    //create an int called numPerfects
    int numPerfects = 0;
    //for loop: control variable i=0, while it is less than the size of list, increment i
    for (int i = 0; i < list.size(); i++)
    {
      //if statement: is i.isPerfect = true
      if (list.get(i).isPerfect() == true) 
      {
        numPerfects++;
      }
    }
    return numPerfects;
  }
	
	//write a toString
  public String toString()
  {
    return "ArrayList: " + list;
  }
}