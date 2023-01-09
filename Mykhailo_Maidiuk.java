package ortogonalni;
import java.util.Scanner;

public class Mykhailo_Maidiuk {
	
	static int color;
	static int n;
	static String closeColor = "\u001B[37m";
	static Scanner sc = new Scanner (System.in);

			public static void start() {
				boolean end = false;
				int choice;
				
				do {
					dismenu();
					choice = sc.nextInt();
				switch(choice) {
				case 1: star();
				break;
				
				case 0: end = true;
			

				break;
				default: System.out.println("Inncorect value ");
				
				}
				}while(!end); 
			
			}
					
				 private static void dismenu() {
				        System.out.println("Make a choice : ");
				        System.out.println("1. Draw a New Year star");
				        System.out.println("0. Finish");
				    }
				 
				 private static void star() {
					 starsize();
					 starcolor();
					 Iscolor();
					 String guestcolor = Iscolor();
					 thestar(n, guestcolor);
				 }
				 
				 private static void starsize() {
					 System.out.println("Choose a size (5-25): ");
					  n = sc.nextInt();		 
				 }
				 
				 private static void starcolor() {
					 System.out.println("Choose color : ");
				        System.out.println("1. \u001B[34mBlue\u001B[37m");
				        System.out.println("2. \u001B[33mYellow\u001B[37m");
				        System.out.println("3. \u001B[35mPurple\u001B[37m");
				      		        color = sc.nextInt(); 
				 }
				 
				 private static String Iscolor() {
				        String Scolor = "";
				        switch (color) {
				            case 1:
				                Scolor = "\u001B[34m";
				                break;
				            case 2:
				                Scolor = "\u001B[33m";
				                break;
				            case 3:
				                Scolor = "\u001B[35m";
				                break;
				            default:
				            	 System.out.print(" Incorrect value ");
				            	
				        }
				        return Scolor;
				    }
				 
				 
				 public static void thestar(int n, String guestcolor){
				   n= n/2 + 1;
				      int i=0;
				    
				      for(i=0;i<n;i++)
				      {
				          for(int k=i;k<n;k++)
				          System.out.print("  ");
				          
				          for(int j=0;j<=2*i;j++)
				          {
				           
				            System.out.print(guestcolor +"* " + closeColor);
				          }
				 
				          System.out.println();
				      }

				      n=i;  
				 
				      for(i=n-1;i>0;i--)
				      {
				          
				          for(int k=i;k<n+1;k++)
				          System.out.print("  ");
				          
				          	for(int j=2*i;j>1;j--)
				          {
				          
				            System.out.print(guestcolor +"* " + closeColor);
				          }
				 
				          System.out.println();
				      }
				 
				  }
				 
			


	}


