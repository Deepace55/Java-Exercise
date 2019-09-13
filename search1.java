public class search1{
   public static void main(String[]args){
    int[]numbers ={1,2,3,4,5};
    int num =5;
    search(numbers,num);
}
public static int search(int[]a,int number){
    for (int i = 0; i < a.length;i++){
    if(a[i] == number){
        System.out.println("Found the value"+a[i]);
    }
}
return-1;
}
}