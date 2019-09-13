
import java.util.Random;
public class inRange2{
    public static int[] randomArray(int size){
        Random random = new Random();
        int[]a = new int[size];
           for (int i = 0; i <a.length;i++){
               a[i]=random.nextInt(100);
           }
        return a;
    }
 public static int inRange2(int[]a,int low,int high){
      int count = 0;
        for (int i=0; i<a.length;i++){
            if(a[i]>=low&& a[i]<high){
             count++;
             }
        }
         return count;
        }
    public static void main(String[]args){
        int[] scores = randomArray (30);
        int a=inRange2(scores,0,1);
         int b=inRange2(scores,1,2);
          int c=inRange2(scores,3,4);
           int d=inRange2(scores,5,6);
        System.out.print(a);
     } 
}