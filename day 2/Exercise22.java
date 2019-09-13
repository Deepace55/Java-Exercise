public class Exercise22{
    public static void main(String[]args){
        int a = 1;
           for (int i=1; i<=5; i++){                
           for (int j=1; j <=5; j++){
                   if(i+j == 6 || i ==j){
                   System.out.print(a);
                   a = a+1;
               }else{
                   System.out.print(" ");           
               }            
          }
              System.out.print("\n");            
       }
    }
}