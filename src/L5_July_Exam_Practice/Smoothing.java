/*
 * Some code:
 * By Gordon Fleming
 */
package L5_July_Exam_Practice;

/**
 *
 * @author gordonfleming
 */
public class Smoothing {
    
    public static void main(String[] args) {
        int [] pixels = {0, 0, 1, 2, 5, 20, 25, 16, 8, 3,0, 0};
        int [] smooth = new int [12];
        
            for(int i = 2;i<pixels.length-1;i++){
                smooth[i] = (pixels[i-1]+pixels[i+1])/2;
                System.out.print(" {"+smooth[i]+"} ");
        }
            
    }
    
}
