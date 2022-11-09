package Questions;

public class pascal_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int row = 0;
		int star = 1;
		while(row<n) {
			// star
			int i = 0;
			int ncr = 1;
			while (i<star) {
				System.out.print(ncr+"\t");
				ncr = (ncr*(row-i))/(i+1);
				i++;
			}
			// next row 
			System.out.println();
			row++;
			star++;
		}

	}

}
