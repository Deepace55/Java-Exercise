
/**
 * クラス ex2 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class ex2
     {
       public static void main(String[]args){
             int[]number={1,2,3,4,5};
             System.out.print("{ ");
                for ( int i =0; i<=4;i++) {
                    if (i==0){
                    System.out.print(number[i]);
                }else{
                    System.out.print(" ,"+number[i]);   
                 }
    }
       System.out.print("}");
    

}
}
