//Add Number.java code from lab 4
import java.util.ArrayList;

//write the Number class
//use the handout and
//sample runner code
//to guide you

//header for Number class
public class Number
{
  //private instance variable (must be an Integer)
  private int num;  
  //constructor
  public Number()
  {
    num = 0;
  }
  public Number(int initNum)
  {
    num = initNum;
  }
  //getter method
  public int getNum()
  {
    return num;
  }
  //setter method
  public void setNum(int newNum)
  {
    num = newNum;
  }
  //isOdd method
  //first method header for isOdd, returns a boolean
  public boolean isOdd()
  {
    //if statement - if the number%2 = 1
    if(num % 2 == 1)
    {
      //return true
      return true;
    }
    //return false
    return false;
  }
  //isPerfect method
  //second method header for isPerfect, return a boolean
  public boolean isPerfect()
  {
    //create an array list containing ints named perfect
    ArrayList<Integer> perfect = new ArrayList<Integer>();
    //make an int called sum
    int sum = 0;
    //use a for loop - set the control var to 1; while the control var is less than the number; increment the control var
    for(int i = 1; i < num; i++)
    {
      //if statement - if the number%control var = 0
      if(num % i == 0)
      {
        //add the control var to odd to sum
        sum += i;
      }
    }
    //if statement - if the number = sum
    if(num == sum)
    {
      //return true
      return true;
    }
    //return false
    return false;
  }
  //toString
  public String toString()
  {
    return ("number: " + num);
  }
}