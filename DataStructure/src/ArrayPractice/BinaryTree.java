package ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ArrayPractice.BinaryTree.TreeNode;
import ArrayPractice.LinkedListpra.Node;

public class BinaryTree {
	
	
	public static void main(String[] args) {
		BinaryTree binaryTree =new BinaryTree();
		String data[] = {"A","B","C","D","E","#","F"};
		ArrayList<String> datas = new ArrayList(Arrays.asList(data));
		binaryTree.createBinaryTree(datas.size(), datas);
		binaryTree.preOrder(binaryTree.root);
		
	}
	
	 TreeNode root = null;
	 
	 public BinaryTree() {
	        root = new TreeNode(0, "A");
	    }
	 
	 public void createBinaryTree() {
	        TreeNode nodeB = new TreeNode(2, "B");
	        TreeNode nodeC = new TreeNode(3, "C");
	        TreeNode nodeD = new TreeNode(4, "D");
	        TreeNode nodeE = new TreeNode(5, "E");
	        TreeNode nodeF = new TreeNode(6, "F");
	        root.leftChild = nodeB;
	        root.rightChild = nodeC;
	        nodeB.leftChild = nodeD;
	        nodeB.rightChild = nodeE;
	        nodeC.rightChild = nodeF;
	    }

	


	    public TreeNode createBinaryTree(int size, List<String> datas) {
	       TreeNode node = null;
	       if (datas.size()==0) {
	    	   return null;
			
		}
	        
	       
	       String data = datas.get(0);
	       if ("#".equals(data)) {
			datas.remove(0);
			return node;
		}
	       int index = size - datas.size();
	       
	       node = new TreeNode(index, data);
	       if(index==0) {
	    	     root = node;
	       }
	       
	       datas.remove(0);
	       node.leftChild = createBinaryTree(size, datas);
	       node.rightChild = createBinaryTree(size, datas);
	       
	       
		 return node;
	    
	    }    
	    
	    //前序遍历
	    private void preOrder(TreeNode node) {
			if (node == null) {
				return;
			}
			System.out.println("preoder data" + node.data);
			preOrder(node.leftChild);
			preOrder(node.rightChild);

		}
	  //中序遍历
	    private void midOrder(TreeNode node) {
			if (node == null) {
				return;
			}
			
			preOrder(node.leftChild);
			System.out.println("preoder data" + node.data);
			preOrder(node.rightChild);

		}
	    
	  //后序遍历
	    private void postOrder(TreeNode node) {
			if (node == null) {
				return;
			}
			
			preOrder(node.leftChild);
			preOrder(node.rightChild);
			System.out.println("preoder data" + node.data);

		}
	     
	    
	    
	    class TreeNode {
	        private int index;
	        private String data;
	        private TreeNode leftChild;
	        private TreeNode rightChild;

	        public TreeNode(int index, String data) {
	            this.index = index;
	            this.data = data;
	        }

	        public TreeNode getLeftChild() {
	            return leftChild;
	        }

	        public void setLeftChild(TreeNode leftChild) {
	            this.leftChild = leftChild;
	        }

	        public TreeNode getRightChild() {
	            return rightChild;
	        }

	        public void setRightChild(TreeNode rightChild) {
	            this.rightChild = rightChild;
	        }

	        public int getIndex() {
	            return index;
	        }

	        public void setIndex(int index) {
	            this.index = index;
	        }

	        public String getData() {
	            return data;
	        }

	        public void setData(String data) {
	            this.data = data;
	        }
	    }

	   
}
