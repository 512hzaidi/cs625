class RelLogOps{
public static void main(String args[]){
int i=-10,j=-11;
boolean b1,b2;
if(i < j) System.out.println("i < j");
if(i <= j) System.out.println("i <= j");
if(i != j) System.out.println("i != j");
if(i == j) System.out.println("This Wont Execute");
if(i >= j) System.out.println("This Wont Execute");
if(i > j) System.out.println("This Wont Execute");

b1 = true;
b2 = false;
if(b1 & b2) System.out.println("This Wont Execute");
if(!(b1 & b2)) System.out.println("!(b1 & b2) is True");
if(b1 | b2) System.out.println("b1 | b2 is True");
if(b1 ^ b2) System.out.println("b1 ^ b2 is True");

}

}