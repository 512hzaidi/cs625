class NestedSwitch{
public static void main(String args[]){
char ch1='B',ch2='A';
switch(ch1){
case 'A':
System.out.println("A is Outer Switch");
switch(ch2){
case 'A':
System.out.println("A is Inner Switch");
break;
case 'B':
}
case 'B':
System.out.println("B is Outer Switch");
}
}
}