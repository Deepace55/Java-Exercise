


import java.util.Random;
public class inRange{
       public static int[] randomArray(int size){
           Random random = new Random();
            int[]a = new int[size];
             for (int i = 0; i <a.length;i++){
                  a[i]=random.nextInt(100);
             }
            return a;
    }
    public static int inRange(int[]a,int low,int high){
         int count = 0;
              for (int i=0; i<a.length;i++){
                  if(a[i]>=low&& a[i]<high){
                   count++;
                 }
             }
         return count;
    }
    public static void main(String[]args){
        int[] scores = randomArray (20);
        int a=inRange(scores,90,100);
        System.out.print(a);
     } 
}