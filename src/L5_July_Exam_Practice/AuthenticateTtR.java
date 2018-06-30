/*
 * Some code:
 * By Gordon Fleming
 */
package L5_July_Exam_Practice;
import java.util.Scanner;

/**
 *
 * @author gordonfleming
 */
public class AuthenticateTtR {
    
    String team;                            //Team name
    int one, two, three, four, six, eight;  //Number of trains...
    int Prescore, Players;                  //Calc
    int sum = 0, count=0, avg;              //Winner...
    
    public AuthenticateTtR(int Pla, String t, int o, int tw, int th, int f, int s, int e, int Pre){
        Players = Pla;
        team = t;
        one = o;
        two = tw;
        three = th;
        four = f;
        six = s;
        eight = e;
        Prescore = Pre;
    }
    
    public int Postscore(){
        return (one*1)+(two*2)+(three*4)+(four*7)+(six*15)+(eight*21);
    }
    
    public int Tunnels(){
        return 12;
    }
    
    public int Longest(){
        return 10;
    }
    
    public int runningAvg(){        
        int temp = Postscore();
            sum += temp;
            count = count + 1;
            avg = sum / count;       
        return avg;
    }
    
    @Override
    public String toString(){
        return "\nTeam name: " + team + "\n\nOne's "+one+" ,Two's "+two+" ,Three's "+three+","+
               "\nFours "+four+" ,Six's "+six+" ,Eight's "+eight + "\n\nPrescore of " + Prescore
                + " and Postscore of " + Postscore() + "\nThe running 'Score' average: " + runningAvg();
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number of teams / players: ");
        int Pla = input.nextInt();
        
            for(int i = 0;i<Pla;i++){
            
                System.out.println("\nEnter the Team name: ");
                String t = input.next();
                System.out.println("Enter the number of one's: ");
                int o = input.nextInt();
                System.out.println("Enter the number of two's: ");
                int tw = input.nextInt();
                System.out.println("Enter the number of three's: ");
                int th = input.nextInt();
                System.out.println("Enter the number of four's: "); 
                int f = input.nextInt();
                System.out.println("Enter the number of six's: ");
                int s = input.nextInt();
                System.out.println("Enter the number of eight's: ");
                int e = input.nextInt();
                System.out.println("Enter the score displayed on the board: ");
                int Pre = input.nextInt();
                
                // Ekstra
        /**       
                System.out.println("How many tunnels were left:     0 - 3? ");
                int tun = input.nextInt();
                System.out.println("Longest tunnel?     Yes or No");
                String l = input.next();
            if( "Yes".equals(l)){
                Postscore() += 10;
            }else if("No".equals(l)){
                System.out.println("O'well");
            }
        */       
                AuthenticateTtR p1 = new AuthenticateTtR(Pla,t,o,tw,th,f,s,e,Pre);
                System.out.println(p1 + "\n");
            if(p1.Postscore()==Pre){
                System.out.println("Well-done you counted correctly! " + Pre + " = " + p1.Postscore());
            }else
                System.out.println("Darn! Incorrect, your count should have been " + p1.Postscore() + " Not " + Pre);        
        }  
    }
}
