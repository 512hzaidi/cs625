class Bubble{
public static void main(String arg[]){
int nums[] = {1 , 19, 16 , 4, 12};
int a,b,t;
int size;
size=5;
System.out.print("Orignal Array:");
for(int i=0;i<size;i++)
System.out.print(" " + nums[i]);
System.out.println();
for(a=1; a<size; a++)
 for(b=size-1; b>=a; b--){
if(nums[b-1]>nums[b]){
t=nums[b-1];
nums[b-1]=nums[b];
nums[b]=t;
}
}
System.out.print("Sorted Array:");
for(int i=0;i<size;i++)
System.out.print(" " + nums[i]);
System.out.println();
}
}