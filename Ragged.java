class Ragged{
public static void main(String args[]){
int rider[][]=new int[5][];
rider[0]=new int[10];
rider[1]=new int[10];
rider[2]=new int[10];
rider[3]=new int[2];
rider[4]=new int[2];
int i,j;
for(i=0; i<3; i++)
 for(j=0;j<10;j++)
rider[i][j]=i+j+10;
for(i=3;i<5;i++)
 for(j=0; j<2;j++)
rider[i][j]=i+j+10;
System.out.println("Riders Per Trip During The First 3 Days: ");
for(i=0;i<3;i++){
 for(j=0; j<10;j++)
System.out.print(rider[i][j] + " ");
System.out.println();}
System.out.println();
System.out.println("Riders Per Trip During Last 2 Days: ");
for(i=3;i<5;i++){
 for(j=0; j<2;j++)
System.out.print(rider[i][j] + " ");
System.out.println();}

}}