import java.util.Random;
public class inRange3{
    public static int[] randomArray(int size){
        Random random = new Random();
        int[]a = new int[size];
           for (int i = 0; i <a.length;i++){
               a[i]=random.nextInt(100);
           }
        return a;
    }
 public static int inRange3(int[]a,int low,int high){
      int count = 0;
        for (int i=0; i<a.length;i++){
            if(a[i]>=low&& a[i]<high){
             count++;
             }
        }
         return count;
        }
    public static void main(String[]args){
        int[] scores = new int[100];
        int[] counts = new int[100];
        for(int i=0; i<counts.length;i++){
            counts[i] = inRange3(scores,i,i+1);
        System.out.println(i);
     } 
    }
}