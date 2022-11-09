package pattern;
import java.util.*;

import javax.swing.RowFilter;
import javax.xml.stream.events.Namespace;
public class pattern1 {
	
//	Ques 1:
//		n = 5
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
	public static void pattern_1(int n) {
		int star = n;
		int row = 1;
		while (row<=n) {
			// star
			int i=1;
			while (i<=star) {
				System.out.print("*"+ " ");
				i++;
			}
			// next row preparation
			System.out.println();
			row++;
		}
	}
//	Ques 2:
//		n = 5 
//		*
//		* *
//		* * *
//		* * * *
//		* * * * *
	
	public static void pattern_2(int n) {
		int star = 1;
		int row = 1;
		while (row<=n) {
			// star
			int i=1;
			while (i<=star) {
				System.out.print("*"+ " ");
				i++;
			}
			// next row preparation
			System.out.println();
			row++;
			star++;
		}
	}
	
//	Ques 3:
//		n = 5 
//		* * * * *
//		* * * *
//		* * *
//		* *
//		*
	
	public static void pattern_3(int n) {
		int star = 5;
		int row = 1;
		while (row<=n) {
			// star
			int i=1;
			while (i<=star) {
				System.out.print("*"+ " ");
				i++;
			}
			// next row preparation
			System.out.println();
			row++;
			star--;
		}
	}
	
//	Ques 4:
//		n = 5
//		        *
//		      * *
//		    * * *
//		  * * * *
//		* * * * *
	
	public static void pattern_4(int n) {
		int star = 1;
		int row = 1;
		int space = n-1;
		while (row<=n) {
			// space
			int j=1;
			while (j<=space) {
				System.out.print("  ");
				j++;
			}
			// star
			int i=1;
			while (i<=star) {
				System.out.print("*"+ " ");
				i++;
			}
			// next row preparation
			System.out.println();
			row++;
			star++;
			space--;
		}
	}
	
//	Ques 5:
//		n = 5
//		* * * * *
//		  * * * *
//		    * * *
//		      * *
//		        *
	
	public static void pattern_5(int n) {
		int star = n;
		int row = 1;
		int space = 0;
		while (row<=n) {
			// space
			int j=1;
			while (j<=space) {
				System.out.print("  ");
				j++;
			}
			
			// star
			int i=1;
			while (i<=star) {
				System.out.print("*"+ " ");
				i++;
			}
			
			
			// next row preparation
			System.out.println();
			row++;
			star--;
			space++;
		}
	}
	
//	Ques 6:
//		n = 5
//		* * * * *
//			* * * *
//				* * *
//					* *
//						*
	
	public static void pattern_6(int n) {
		int star = n;
		int row = 1;
		int space = 0;
		while (row<=n) {
			// space
			int j=1;
			while (j<=space) {
				System.out.print("  ");
				j++;
			}
			
			// star
			int i=1;
			while (i<=star) {
				System.out.print("*"+ " ");
				i++;
			}
			
			
			// next row preparation
			System.out.println();
			row++;
			star--;
			space +=2;
		}
	}

	
//	Ques 7:
//		n = 5
//		* * * * *
//		* 		*
//		* 		*
//		* 		*
//		* * * * *	
	
	public static void pattern_7(int n) {
		int star = n;
		int row = 1;
		int space = n-2;
		while (row<=n) {

			
			
			if(row == 1 || row == n) {
				// star
				int i=1;
				while (i<=star) {
					System.out.print("*"+ " ");
					i++;
				}
			}
			else {
				System.out.print("*"+ " ");
				// space
				int j=1;
				while (j<=space) {
					System.out.print("  ");
					j++;
				}
				System.out.print("*"+ " ");
			}
			
			
			
			// next row preparation
			System.out.println();
			row++;
		}
	}

	
//	Ques 8:
//		n = 5
//		*		*
//		  *   *
//		    *
//		  *   *
//		*       *	
	
	public static void pattern_8(int n) {
		int star = n;
		int row = 1;
		int space1 = n-2;
		int space2 = 0;
		while (row<=n) {
			// space
			int k=1;
			while (k<=space2) {
				System.out.print("  ");
				k++;
			}
			System.out.print("*"+ " ");
			// space
			int j=1;
			while (j<=space1) {
				System.out.print("  ");
				j++;
			}
			if(space1!=-1)
				System.out.print("*"+ " ");
			
			
			
			// next row preparation
			System.out.println();
			if(row<n/2+1) {
				space2 ++;
				space1 -=2;
			}else {
				space2 --;
				space1 +=2;
			}
			row++;
		}
	}

	
//	Ques 9:
//		n = 5
//		 		*
//			  * * *
//		    * * * * *
//		  * * * * * * *
//		* * * * * * * * *	

	public static void pattern_9(int n) {
		int star = 1;
		int row = 1;
		int space = n-1;
		while (row<=n) {
			// space
			int j=1;
			while (j<=space) {
				System.out.print("  ");
				j++;
			}
			// star
			int i=1;
			while (i<=star) {
				System.out.print("*"+ " ");
				i++;
			}
			// next row preparation
			System.out.println();
			row++;
			star+=2;
			space--;
		}
	}
	
	
//	Ques 10:
//		n = 5
//		* * * * * * * * *
//		  * * * * * * *
//		    * * * * *
//		      * * *
//		        *	
	

	public static void pattern_10(int n) {
		int star = 2*n-1;
		int row = 1;
		int space = 0;
		while (row<=n) {
			// space
			int j=1;
			while (j<=space) {
				System.out.print("  ");
				j++;
			}
			// star
			int i=1;
			while (i<=star) {
				System.out.print("*"+ " ");
				i++;
			}
			// next row preparation
			System.out.println();
			row++;
			star-=2;
			space++;
		}
	}
	
//	Ques 11:
//	n = 5
//	 		*
//		  *   *
//	    *   *   *
//	  *   *   *   *
//	*   *   *   *   *	
	

	public static void pattern_11(int n) {
		int star = 1;
		int row = 1;
		int space = n-1;
		while (row<=n) {
			// space
			int j=1;
			while (j<=space) {
				System.out.print("  ");
				j++;
			}
			// star
			int i=1;
			while (i<=star) {
				if(i%2!=0)
					System.out.print("*"+ " ");
				else 
					System.out.print("  ");
				
				i++;
			}
			// next row preparation
			System.out.println();
			row++;
			star+=2;
			space--;
		}
	}
	
//	Ques 12:
//	n = 5
//	 		*
//		  * ! *
//	    * ! * ! *
//	  * ! * ! * ! *
//	* ! * ! * ! * ! *	
	
	public static void pattern_12(int n) {
		int star = 1;
		int row = 1;
		int space = n-1;
		while (row<=n) {
			// space
			int j=1;
			while (j<=space) {
				System.out.print("  ");
				j++;
			}
			// star
			int i=1;
			while (i<=star) {
				if(i%2!=0)
					System.out.print("*"+ " ");
				else 
					System.out.print("!"+" ");
				
				i++;
			}
			// next row preparation
			System.out.println();
			row++;
			star+=2;
			space--;
		}
	}
	
//	Ques 13:
//		n = 5
//		*
//		* *
//		* * *
//		* * * *
//		* * * * *
//		* * * *
//		* * *
//		* *
//		*
		
	public static void pattern_13(int n) {
		int star = 1;
		int row = 1;
		while (row<=2*n-1) {
			// star
			int i=1;
			while (i<=star) {
				System.out.print("*"+ " ");
				i++;
			}
			// next row preparation
			System.out.println();
			row++;
			if(row<=n)
				star++;
			else {
				star--;
			}
		}
	}
	
//	Ques 14:
//		n = 5 
//		 		*
//		 	  * *
//			* * *
//		  * * * *
//		* * * * *
//		  * * * *
//			* * *
//			  * *
//		        *
	
	public static void pattern_14(int n) {
		int star = 1;
		int row = 1;
		int space = n-1;
		while (row<=2*n-1) {
			// space
			int j=1;
			while (j<=space) {
				System.out.print("  ");
				j++;
			}
			// star
			int i=1;
			while (i<=star) {
				System.out.print("*"+ " ");
				i++;
			}
			// next row preparation
			System.out.println();
			row++;
			if(row<=n){
				star++;
				space--;
			}
			else {
				star--;
				space++;
			}
		}
	}
	
//	Ques 15:
//		n = 5
//		* * * * *
//			* * * *
//				* * *
//					* *
//						*
//					* *
//				* * *
//			* * * *
//		* * * * *
	
	
	public static void pattern_15(int n) {
		int star = n;
		int row = 1;
		int space = 0;
		while (row<=2*n-1) {
			// space
			int j=1;
			while (j<=space) {
				System.out.print("  ");
				j++;
			}
			
			// star
			int i=1;
			while (i<=star) {
				System.out.print("*"+ " ");
				i++;
			}
			
			
			// next row preparation
			System.out.println();
			row++;
			if(row<=n) {
				star--;
				space +=2;
			}
			else {
				star++;
				space -=2;
			}
			
		}
	}

//	Ques 16:
//		n = 5
//		    	* * * * *
//			  * * * *
//			* * *
//		  * *
//		*
//		  * *
//			* * *
//			  * * * *
//				* * * * *
	public static void pattern_16(int n) {
		int star = n;
		int row = 1;
		int space = n-1;
		while (row<=2*n-1) {
			// space
			int j=1;
			while (j<=space) {
				System.out.print("  ");
				j++;
			}
			
			// star
			int i=1;
			while (i<=star) {
				System.out.print("*"+ " ");
				i++;
			}
			
			
			// next row preparation
			System.out.println();
			row++;
			if(row<=n) {
				star--;
				space --;
			}
			else {
				star++;
				space ++;
			}
			
		}
	}
	
//	Ques 17:
//		n = 7
//				* * * 	* * *
//				* *		  * *
//				* 			*
//	
//				* 			*
//				* * 	  * *
//				* * *   * * *
	
	public static void pattern_17(int n) {
		int star = n/2;
		int row = 1;
		int space = 1;
		while (row<=n) {
			//space
			
			// star
			int i=1;
			while (i<=star) {
				System.out.print("*"+ " ");
				i++;
			}
			// space
			int k=1;
			while (k<=space) {
				System.out.print("  ");
				k++;
			}
			// star
			int j=1;
			while (j<=star) {
				System.out.print("*"+ " ");
				j++;
			}
			
			// next row preparation
			System.out.println();
			row++;
			if(row<=n/2+1) {
				star--;
				space+=2;
			}
			else {
				star++;
				space-=2;
			}
		}
	}
	
//	Ques 18:
//		n = 7
//		 		*
//			  * * *
//			* * * * *
//		  * * * * * * *
//			* * * * *
//		 	  * * *
//		        *

	public static void pattern_18(int n) {
		int star = 1;
		int row = 1;
		int space = n/2;
		while (row<=n) {
			//space
			int k=1;
			while (k<=space) {
				System.out.print("  ");
				k++;
			}
			
			// star
			int i=1;
			while (i<=star) {
				System.out.print("*"+ " ");
				i++;
			}
			
			// next row preparation
			System.out.println();
			row++;
			if(row<=n/2+1) {
				star+=2;
				space--;
			}
			else {
				star-=2;
				space++;
			}
		}
	}
	
//	Ques 19:
//		n = 7
//		* * * * * * *
//		* * *   * * *
//		* *       * *
//		*           *
//		* *       * *
//		* * *   * * *
//		* * * * * * *
	
	public static void pattern_19(int n) {
		int star = n/2+1;
		int row = 1;
		int space = -1;
		while (row<=n) {
			// star
			int i=1;
			while (i<=star) {
				System.out.print("*"+ " ");
				i++;
			}
			// space
			int k=1;
			while (k<=space) {
				System.out.print("  ");
				k++;
			}
			int j = 1;
			while (j<=star) {
				if((row==1 && j==1) || (row == n && j ==n/2+1) ) {
					j++;
					continue;
				}
				System.out.print("*"+" ");
				j++;
			}
			
			
			// next row preparation
			System.out.println();
			row++;
			if(row<=n/2+1) {
				star--;
				space +=2;
			}
			else {
				star++;
				space-=2;
			}
		}
	}
	
//	Ques 20:
//		n = 7
//		      *
//		    *   *
//		  *       *
//		*           *
//		  *       *
//		    *   *
//		      *
	
	public static void pattern_20(int n) {
		int star = 1;
		int row = 1;
		int space1 = n/2;
		int space2  = -1;
		while (row<=n) {
			// space 1
			int k=1;
			while (k<=space1) {
				System.out.print("  ");
				k++;
			}
			// star
			System.out.print("*"+" ");
			// space 2
			int i=1;
			while (i<=space2) {
				System.out.print("  ");
				i++;
			}
			// star
			if(row!=1 && row != n)
				System.out.print("*"+" ");
			
			
			
			// next row preparation
			System.out.println();
			row++;
			if(row<=n/2+1) {
				space1--;
				space2 +=2;
			}
			else {
				space1++;
				space2-=2;
			}
		}
	}
	
//	Ques 21:
//		n = 5
//		* 				*
//		* * 		  * *
//		* * * 	    * * *
//		* * * *   * * * *
//		* * * * * * * * *
	
	public static void pattern_21(int n) {
		int star = 1;
		int space = 2*n-1-2;
		int row = 1;
		while(row<=n) {
			// star
			int i =1;
			while(i<=star) {
				System.out.print("*"+" ");
				i++;
			}
			//space
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			// star
			int k=1;
			while(k<=star) {
				if(row==n && k==1) {
					k++;
					continue;
				}
				System.out.print("*" + " ");
				k++;
			}
			// next row preparation
			System.out.println();
			row++;
			star++;
			space-=2;
		}
	}
	
//	Ques 22:
//		n = 5
//		* * * * * * * * *
//		* * * *   * * * *
//		* * *       * * *
//		* *           * *
//		*               *
	
	public static void pattern_22(int n) {
		int star = n;
		int space = -1;
		int row = 1;
		while(row<=n) {
			// star
			int i =1;
			while(i<=star) {
				System.out.print("*"+" ");
				i++;
			}
			//space
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			// star
			int k=1;
			while(k<=star) {
				if(row==1 && k==1) {
					k++;
					continue;
				}
				System.out.print("*" + " ");
				k++;
			}
			// next row preparation
			System.out.println();
			row++;
			star--;
			space+=2;
		}
	}
	
//	Ques 23:
//		n = 5
//		 	    1
//		      1 1 1
//		    1 1 1 1 1
//		  1 1 1 1 1 1 1
//		1 1 1 1 1 1 1 1 1


	public static void pattern_23(int n) {
		int star = 1;
		int row = 1;
		int space = n-1;
		while (row<=n) {
			// space
			int j=1;
			while (j<=space) {
				System.out.print("  ");
				j++;
			}
			// star
			int i=1;
			while (i<=star) {
				System.out.print("1"+ " ");
				i++;
			}
			// next row preparation
			System.out.println();
			row++;
			star+=2;
			space--;
		}
	}
	
//	Ques 24:
//		n = 5
//		        1
//		      2 2 2
//		    3 3 3 3 3
//		  4 4 4 4 4 4 4
//		5 5 5 5 5 5 5 5 5

	public static void pattern_24(int n) {
		int star = 1;
		int row = 1;
		int space = n-1;
		while (row<=n) {
			// space
			int j=1;
			while (j<=space) {
				System.out.print("  ");
				j++;
			}
			// star
			int i=1;
			while (i<=star) {
				System.out.print(row+ " ");
				i++;
			}
			// next row preparation
			System.out.println();
			row++;
			star+=2;
			space--;
		}
	}
	
//	Ques 25:
//		n = 5
//		          1
//		         2  3  4
//		      5  6  7  8  9
//		   10 11 12 13 14 15 16
//		17 18 19 20 21 22 23 24 25
	
	public static void pattern_25(int n) {
		int star = 1;
		int row = 1;
		int space = n-1;
		int val=1;
		while (row<=n) {
			
			// space
			int j=1;
			while (j<=space) {
				System.out.print("\t");
				j++;
			}
			// star
			int i=1;
			while (i<=star) {
				System.out.print(val+ "\t");
				i++;
				val++;
			}
			// next row preparation
			System.out.println();
			row++;
			star+=2;
			space--;
		}
	}
	
//	
//	Ques 26:
//		n = 5
//		        1
//		      1 2 3
//		    1 2 3 4 5
//		  1 2 3 4 5 6 7
//		1 2 3 4 5 6 7 8 9

	
	public static void pattern_26(int n) {
		int star = 1;
		int row = 1;
		int space = n-1;
		while (row<=n) {
			
			// space
			int j=1;
			while (j<=space) {
				System.out.print("  ");
				j++;
			}
			// star
			int val =1;
			int i=1;
			while (i<=star) {
				System.out.print(val+ " ");
				i++;
				val++;
			}
			// next row preparation
			System.out.println();
			row++;
			star+=2;
			space--;
		}
	}
	
//	Ques 27:
//		n = 5
//		        1
//		      1 2 1
//		    1 2 3 2 1
//		  1 2 3 4 3 2 1
//		1 2 3 4 5 4 3 2 1
	
	public static void pattern_27(int n) {
		int star = 1;
		int row = 1;
		int space = n-1;
		while (row<=n) {
			
			// space
			int j=1;
			while (j<=space) {
				System.out.print("  ");
				j++;
			}
			// star
			int val =1;
			int i=1;
			while (i<=star) {
				System.out.print(val+ " ");
				i++;
				if(i<=row)
					val++;
				else {
					val--;
				}
			}
			// next row preparation
			System.out.println();
			row++;
			star+=2;
			space--;
		}
	}
	
//	Ques 28:
//		n = 5
//		        1
//		      2 3 2
//		    3 4 5 4 3
//		  4 5 6 7 6 5 4
//		5 6 7 8 9 8 7 6 5
	public static void pattern_28(int n) {
		int star = 1;
		int row = 1;
		int space = n-1;
		while (row<=n) {
			
			// space
			int j=1;
			while (j<=space) {
				System.out.print("  ");
				j++;
			}
			// star
			int val = row;
			int i=1;
			while (i<=star) {
				System.out.print(val+ " ");
				
				if(i<row)
					val++;
				else 
					val--;
				i++;
			}
			// next row preparation
			System.out.println();
			row++;
			star+=2;
			space--;
		}
	}
//	Ques 29:
//		n = 5
//				1
//			  2 0 2
//			3 0 0 0 3
//		  4 0 0 0 0 0 4
//		5 0 0 0 0 0 0 0 5
	public static void pattern_29(int n) {
		int star = 1;
		int row = 1;
		int space = n-1;
		while (row<=n) {
			
			// space
			int j=1;
			while (j<=space) {
				System.out.print("  ");
				j++;
			}
			// star
			int i=1;
			while (i<=star) {
				if(i==1 || i ==star)
					System.out.print(n+ " ");
				else {
					System.out.print(0+ " ");
				}
				i++;
			}
			// next row preparation
			System.out.println();
			row++;
			star+=2;
			space--;
		}
	}
	
//	Ques 30:
//		n = 5
//		5 4 3 2 1
//		5 4 3 2 1
//		5 4 3 2 1
//		5 4 3 2 1
//		5 4 3 2 1
	public static void pattern_30(int n) {
		int star = n;
		int row = 1;
		while (row<=n) {
			// star
			int i=1;
			int val = n;
			while (i<=star) {
				System.out.print(val+ " ");
				i++;
				val--;
			}
			// next row preparation
			System.out.println();
			row++;
		}
	}
	
//	Ques 31:
//		n = 5
//		5 4 3 2 *
//		5 4 3 * 1
//		5 4 * 2 1
//		5 * 3 2 1
//		* 4 3 2 1
	
	public static void pattern_31(int n) {
		int star = n;
		int row = 1;
		int starpos = n;
		while (row<=n) {
			// star
			int i=1;
			int val = n;
			while (i<=star) {
				if(i==starpos)
					System.out.print("*"+" ");
				else
					System.out.print(val+ " ");
				i++;
				val--;
				
			}
			// next row preparation
			System.out.println();
			row++;
			starpos--;
		}
	}
	
//	Ques 32:
//		n = 5
//		1
//		2 * 2
//		3 * 3 * 3
//		4 * 4 * 4 * 4
//		5 * 5 * 5 * 5 * 5
//		4 * 4 * 4 * 4
//		3 * 3 * 3
//		2 * 2
//		1

	
	public static void pattern_32(int n) {
		int star = 1;
		int row = 1;
		int val = 1;
		while (row<=2*n-1) {
			// star
			int i=1;
			while (i<=star) {
				System.out.print(val+ " ");
				i++;
			}
			// next row preparation
			System.out.println();
			row++;
			if(row<=n)
				star++;
			else {
				star--;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = sc.nextInt();
		pattern_28(n);
		
	}

}
