
/**
 * クラス abcd の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */

import java.util.Arrays;
public class abcd{
    public static void main (String[]args){
double[]grades = {98.2,22.9,30.0};
double[]scores = Arrays.copyOf(grades,4);
System.out.println(Arrays.toString(scores));
}
}