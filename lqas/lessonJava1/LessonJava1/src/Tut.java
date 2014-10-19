import java.util.*;




public class Tut {

	
	public static void main(String [] args){	

		//System.out.println(getIJSumOfMatrix(3));
		printMatrix(fillMatrix(3));
		
		
		List<String> list1 = new ArrayList<String>();
		list1.add("asd");
		list1.add("asd2");
		list1.add("asd34");
		list1.add("asd2");
		list1.add("asd2");
		list1.add("asd511");
	/*	
		Iterator<String> iter = list1.iterator();
		
		while(iter.hasNext()){
			System.out.println(iter.next().contains("sd5"));
		}
		
	*/
		
		Set<String> set = new HashSet<String>(list1);
		Iterator<String> iter2 = set.iterator();
		
		while(iter2.hasNext()){
			System.out.println(iter2.next().contains("asd2"));
		}
		
	}
	
	public static int[][] fillMatrix(int size){
		int matrix[][] = new int[size][size];
		
		for (int i=0; i<size; i++){
			for (int j=0; j<size; j++){
				matrix[i][j] = i + j; 
			}
		}
		
		return matrix;
	}
	
	public static void printMatrix(int[][] matrix){
		for (int i=0; i<matrix.length; i++){
			for (int j=0; j<matrix[i].length; j++){
					System.out.print(matrix[i][j] + " ");
				}
			System.out.print("\n");
			}
	}
	
}
