class MinMax2{
public static void main(String args[]){
int nums[]={2,3,4,5,6};
int min,max;
int size;
size=5;
min = max = nums[0];
for(int i = 1; i<size ; i=i++){
if(nums[i] < min) min=nums[i];
if(nums[i] > max) max=nums[i];
}
System.out.println("min and max:" + min +" "+ max);
}
}