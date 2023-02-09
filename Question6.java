public class Question6{
public static void main(String[] args) {
		
		    int[][] matrix = {{3,4,5}, {1, 2, 6}, {7, 2, 3}};
		    rotate(matrix);
		    for (int i = 0; i < matrix.length; i++) {
		        for (int j = 0; j < matrix[i].length; j++) {
		            System.out.print(matrix[i][j] + " ");
		        }
		        System.out.println();
		    }
		}

		public static void rotate(int[][] matrix) {
		    int n = matrix.length;
		    for (int i = 0; i < 3; i++) {
		        for (int layer = 0; layer < n / 2; layer++) {
		            int first = layer;
		            int last = n - 1 - layer;
		            for (int j = first; j < last; j++) {
		                int offset = j - first;
		                int top = matrix[first][j];

		               
		                matrix[first][j] = matrix[last - offset][first];

		              
		                matrix[last - offset][first] = matrix[last][last - offset];

		               
		                matrix[last][last - offset] = matrix[j][last];

		                
		                matrix[j][last] = top;
		            }
		        }
		    }
		}
	}