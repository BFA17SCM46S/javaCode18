package ArrayPractice;



import java.util.Arrays;
import java.util.jar.*;

import javax.print.CancelablePrintJob;
import javax.print.attribute.standard.PresentationDirection;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;
public class LinkedListpra<E> {
	
	
	
	
	
	private Node headnode;
	private int size;
	
	
	

	private void NewLinkedList() {
		headnode = null;
		size = 0;
	}
	
	// add new node
	public void add(int index, E e) {
		if(index < 0 || index > size) {
			throw new IllegalArgumentException("add failed");
		}
		if(size == 0) {
			headnode = new Node(e);
			size++;
			return;	
		}else {
			//add the node to the first node
			if(index == 0) {
				Node currentNode = new Node(e);	
				currentNode.next = headnode;
				size++;
				return;
		}else {
			Node preNode = headnode;
			Node currentNode = headnode;
			for (int i= 0; i<= index; i++) {
				preNode = currentNode;
				currentNode = currentNode.next;
				
			}
			
			if(index == size) {
				currentNode = null;	
			}
			Node NewNode = new Node(e);	
			preNode.next=NewNode;
			NewNode.next = currentNode;
		
		}
			size++;
		
	}
		
	}
	private void addFirst(E e) {
		add(0, e);
		
	}
	private void addLast(E e) {
		add(size, e);
		
	}
	
	public E get(int index) {
		if(index < 0 || index > size) {
			throw new IllegalArgumentException("get failed");
		}
		if(index == 0) {
			return headnode.e;
			
		}else {
			Node currentNode = headnode;
			for (int i = 0; i < index; i++) {
				currentNode = currentNode.next;
			}
			return currentNode.e;
			
		}
		
	}

	public E getFirst() {
        return get(0);
    }

    public E getLast() {
        return get(size - 1);
    }
    
    public void set(int index,E e) {
    	if (index < 0 || index >= size) {
            throw new IllegalArgumentException("set failed. Index is illegal.");
        }
    	
    	  Node currentnode = headnode;
    	  for (int i = 0; i < index; i++) {
    		  currentnode = currentnode.next;
    		 		
		}
    	  currentnode.e = e;
 	
	}
    
    public void remove(int index, E e) {
    	if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Remove failed. Index is illegal.");
        }
    	if(size == 0) {
    		size--;
    		headnode = null;
    		return;
    	}
    	if(index ==0) {
    		headnode = headnode.next;
    		size--;
    	}else {
    		Node prenode = headnode;
			
		}    	
    	
	}
    
    class Node {
        public E e;
        public Node next;

        public Node(E e) {
            this.e = e;
        }
    
	

}
   
    
    
    
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

   
      
      
     
      
      
      
      
      
      
      
      
      

