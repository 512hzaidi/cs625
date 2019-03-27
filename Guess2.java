class Guess2 {
public static void main(String args[])
throws java.io.IOException{
char ch, answer = 'K';
System.out.println("I 'm Thinking of a Letter between A and Z.");
System.out.print("Can U Guess it.");
ch = (char) System.in.read();
if(ch==answer) System.out.println("** RIGHT **"); 
else System.out.println("...SORRY U ENTERD Wrong Word");
}
}