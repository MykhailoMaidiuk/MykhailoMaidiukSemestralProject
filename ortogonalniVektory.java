package ortogonalni;
import java.util.Scanner;
/** 29) Zapište program, který bude testovat, 
 * zda zadaný systém n vektorů o n 
 * složkách je ortogonální.
 * Pokud ano nechť program 
 * dále provede převod vektorů na normovaný tvar.
 * 
 * @author Mykhailo Maidiuk.
 * @version 11/12/22
 * Date 11.12.2022(14:49)
 * */

public class ortogonalniVektory {
	public static Scanner sc = new Scanner(System.in);
	static int Msize;
	
	public static void main(String[] args) {		
	/** we will make a menu for 
	 * the user with a choice*/
		boolean end = false;
		 do {
		        System.out.println("Please select your option: ");
		        System.out.println("Tap \"1\" for vektor.");
		        System.out.println("Tap \"2\" for Star.");
		        System.out.println("Tap \"0\" to exit.");
		        
		        switch (sc.nextInt()) {
		            case 1 -> vektor();   
		            case 2 -> Mykhailo_Maidiuk.start();
		            case 0 -> end = true;
		            default -> System.out.println("Incorrect value ");
		        }
		    } while(!end);
	
	}		
		public static void vektor() {
		        // Read the number of vectors
			System.out.println();
			
		        System.out.println("Vector count(if you want to exit tap any negative number or 0))");
		        Msize = sc.nextInt();
		        
		        

		        // Continue processing vectors until a negative or zero n is given
		        while ( Msize >= 2) {
		            // Read the vectors
		        	System.out.println();
		            System.out.println("Enter the vectors");
		            double[][] vectors = new double[Msize][Msize];
		            for (int i = 0; i < vectors.length; i++) {
		                for (int j = 0; j < vectors[i].length; j++) {
		                    vectors[i][j] = sc.nextDouble();
		                }
		            }

		            // Test whether the system of vectors is orthogonal
		            boolean isOrthogonal = true;
		            for (int i = 0; i < vectors.length-1; i++) {
		                for (int j = i + 1; j < vectors.length; j++) {
		                    double dotProduct = 0;
		                    for (int k = 0; k < vectors[i].length; k++) {
		                        dotProduct += vectors[i][k] * vectors[j][k];
		                       }
		                    if (dotProduct != 0) {
		                        isOrthogonal = false;
		                        break;
		                    }
		                }
		                if(isOrthogonal == false) {
		                	
		                	break;
		                	
		                }
		            }
		            
		            // Print the result of the orthogonality test
		            if (isOrthogonal) {
		                System.out.println("The system is orthogonal");


		                // Print the standardized vectors
		                System.out.println("Standardized system");
		                for (int i = 0; i < vectors.length; i++) {
		                    for (int j = 0; j < vectors[i].length; j++) {
		                       System.out.print((int)standVek(vectors)[i][j] + " ");
		                    }
		                    System.out.println();
		                }
		            } else {
		                System.out.println("The system is not orthogonal");
		            }
		            // Read the number of vectors for the next iteration
		            System.out.println();
		            System.out.println("Vector count");
		            Msize = sc.nextInt();
		        }
		        	}
		        
		    
		
	 // Convert the vectors to a standardized form
		public static double[][] standVek(double[][] a) {
			
	double[][] standardizedVectors = new double[Msize][Msize];
	for (int i = 0; i < a.length; i++) {
		double length = 0;
	    for (int j = 0; j < a[i].length; j++) {
	        length += a[i][j] * a[i][j];
	    }
	    length = Math.sqrt(length);
	    for (int j = 0; j < a[i].length; j++) {
	        standardizedVectors[i][j] = a[i][j] / length;
	       
	    }
	}
		return standardizedVectors;
		}
		
		
		
		
		
		
		
		
		
		
		}
		
