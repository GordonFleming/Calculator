
package LVairplanesparestest;

 
  import java.util.*;
public class TestPlaneSpares
{
 

   public TestPlaneSpares ()
    {


	char ch = menu ();
	while (ch != 'Q')
	{
	    doOptions (ch);
	    ch = menu ();
	}
	System.out.println ("\nClick close to end.");
    }


   char menu ()
    {
            Scanner sc1 = new Scanner (System.in);
            System.out.println("\n\n");
            System.out.println("    Menu");
            System.out.println("");
            System.out.println("A - Display spares ");
            System.out.println("B - Sort ");
            System.out.println("C - Purchase");
            System.out.println("Q - QUIT");
            System.out.println("");
            System.out.print("Your Choice? :");
	char opt = sc1.nextLine ().charAt (0);
	return opt;
    }


    void doOptions (char ch2)
    {
	    switch (ch2)
		{
		    case 'A':
		
			break;
		    case 'B':
		
			break;
	            case 'C':
                      
                        break;

                    default :
                     {
                     System.out.println("Incorrect Choice");
                     break;
                     }

                     case 'Q':
                     {
                       System.exit(0);
                     }
            }

        }


    public static void main (String[] args)
    {
		new TestPlaneSpares ();
    } // main method
}