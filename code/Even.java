//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Name: Vuochlang Chang                                                                                                            //
// Class: CSE223        Spring 2020                                                                                                 //
// Date: 04/24/2020                                                                                                                 //
// Assignment: PA1 - Even number operation                                                                                          //
// This code will impliment Math Operations over Even numbers and return the result in the English words per digit                  //
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.Math;
import java.lang.invoke.SwitchPoint;
import java.lang.Character;
import java.lang.String;

public class Even{
  private int num;

  //this will convert any odd number that called Even into Even number by increment itself by 1
  public Even(int a){
    if(a%2!=0)
    {       a=a+1;
    }
    num=a;
  }

  //this will add both Even numbers and return result as in Even
  public Even add(Even a){
    int result=num+a.toInt();
    Even b=new Even(result);
    return (b);
  }

  //this will take the first Even number and deduct by the second Even number
  public Even sub(Even a){
    int result=num-a.toInt();
    Even b=new Even(result);
    return (b);
  }

  //this will multiply both Eevn number and return in Even
  public Even mul(Even a){
    int result=num*a.toInt();
    Even b=new Even(result);
    return (b);
  }

  //this will divide the first Even number by the second Even number
  public Even div(Even a){
    float result=num/a.toInt();
    int newNum=Math.round(result);//this will convert the result if it's decimal into integer by rounding down the result
    Even b=new Even(newNum);
    return (b);
  }

  //this will get the value of the number
  public int toInt(){
    return(num);
  }

/*      public String toString(){
                String news=String.valueOf(num);
                return(news);
        }*/

  //this will change the original toString and turn the result into English words
  public String toString()
  {       boolean flag=false;
    String result=String.valueOf(num);//this will copy the value of num into a new string named "result"
    String words="";//initilaized a new string, this will be the result of the value of the whole string
    for(int i=0; i<result.length(); i++)//a loop to go through the string-length
    {       if(flag==true)//this will add a space between words
    {       words=words+" ";
    }
      char j=result.charAt(i);//get the character in that index[i] of the string
      int k=Character.digit(j, 10);//get the numerical value of that character
      switch(k){//this is a switch to copy any value into the string "words"
        case 0 : words=words+"zero";  flag=true; break;
        case 1 : words=words+"one";   flag=true; break;
        case 2 : words=words+"two";   flag=true; break;
        case 3 : words=words+"three"; flag=true; break;
        case 4 : words=words+"four";  flag=true; break;
        case 5 : words=words+"five" ; flag=true; break;
        case 6 : words=words+"six";   flag=true; break;
        case 7 : words=words+"seven"; flag=true; break;
        case 8 : words=words+"eight"; flag=true; break;
        case 9 : words=words+"nine";  flag=true; break;
        case -1 : words=words+"negative";   flag=true; break;
        default: break;
      }
    }
    return (words);
  }
}
