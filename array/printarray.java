
/**
 * クラス printarray の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
import java.util.Arrays;
public class printarray{
public static void printArray(int[]a){
System.out.println(Arrays.toString(a));
 }
public static void main(String[]args){
int[]numbers = {1,2,3,4,5};
printArray(numbers);
}
}