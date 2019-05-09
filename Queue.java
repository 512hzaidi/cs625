class Queue{
public static void main(String args[]){
char q[];
int putloc , getloc;
Queue(int size){
q= new char[size];
putloc = getloc =0;
}
void put(char ch){
if(putloc==q.length){
System.out.println(" __Queue Is Full...");
return;
}
q[putloc++]=ch;
}
char get(){
if(getloc==putloc){
System.out.println(" __Queue Is Empty...");
return (char) 0;
}

return q[getloc++];
}
}}