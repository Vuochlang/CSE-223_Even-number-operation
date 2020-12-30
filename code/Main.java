// Sample test code for CSE 223 PA1 Spring 2020
// Nick Macias, April 2020
// Construct some Even objects and test the methods
// Also do some string concatenation to exercise toString

class Main{
  public static void main(String[] args) // no arguments processed
  {
    Even a,b,c,d; // some Even objects to play with
    a=new Even(-10); // -10
    b=new Even(15); // should round up to 16
    c=a.add(b); // expecting result of 6
    d=b.div(a); // 15/(-10) would be -1.5 which, as an int, is -1
    System.out.println("a="+a+" b="+b+" c="+c+" d="+d); // e.g. a=negative one zero
    c=new Even(2); // c is a running product
    d=new Even(2); // d is our multiplier
    for (int i=2;i<12;i++){
      c=c.mul(d); // keep doubling c
      System.out.println("2^"+i+"="+c); // and print it out in words
    }
  }
}
