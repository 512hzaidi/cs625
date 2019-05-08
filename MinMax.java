class MinMax{
public static void main(String args[]){
int nums[]=new int[5];
int min,max;
nums[0] = 99;
nums[1] = 15;
nums[2] = 30;
nums[3] = 100;
nums[4] = 29;
min = max = nums[0];
for(int i = 1; i<5 ; i++){
if(nums[i]<min) min =nums[i];
if(nums[i]>max) max= nums[i];
}
System.out.println("min and max:" + min +" "+ max);
}
}