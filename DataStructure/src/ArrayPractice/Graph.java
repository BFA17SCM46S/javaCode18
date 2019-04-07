package ArrayPractice;

public class Graph {
	private static final int MAX_WEIGHT = 1000;
	private int VertexSize;
	private int[] vertex;
	private int[][] matrix;
	private boolean[] isvisited;
	
	public static void main(String[] args) {
		Graph graph = new Graph(4);
        int[] a0 = {0, MAX_WEIGHT, MAX_WEIGHT, 1};
        int[] a1 = {30, 0, MAX_WEIGHT, MAX_WEIGHT};
        int[] a2 = {4, 15, 0, 5};
        int[] a3 = {MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, 0};
        int[][] matrix = graph.getMatrix();
        matrix[0]=a0;
        matrix[1]=a1;
        matrix[2]=a2;
        matrix[3]=a3;
        


	}
	
	public Graph(int VertexSize) {
		this.VertexSize = VertexSize;
		matrix = new int[VertexSize][VertexSize];
		vertex = new int[VertexSize];
		for (int i = 0; i < VertexSize; i++) {
			vertex[i] = i;
		}
		isvisited = new boolean[VertexSize];
	}
	//求出度
	public int getoutDegree(int index) {
		int degree = 0;
		for (int i = 0; i < matrix[index].length; i++) {
			int weight = matrix[index][i];
			if (weight!=0||weight!=MAX_WEIGHT) {
				degree++;
			}
		}
		
		return degree;
	}
	//求入度
	public int getDegree(int index) {
		int degree = 0;
		for (int i = 0; i < matrix[index].length; i++) {
			int weight = matrix[i][index];
			if (weight!=0||weight!=MAX_WEIGHT) {
				degree++;
			}
		}
		
		return degree;
	}
	//求权值
	public int getWeight(int v1, int v2) {
		
		return matrix[v1][v2] == 0 ? 0 : (matrix[v1][v2] == MAX_WEIGHT ? -1 : matrix[v1][v2] );
		
	}
	
	 public int[][] getMatrix() {
	        return matrix;
	    }
	
}



