package tree;

/*
 * Timothy Hosia
 * 5025211098
*/

/** Binary trees with nodes labelled by integers */
public class Tree {
	private int root;
	private Tree left, right;

	/** Creates a new instance of Tree: a branch */
	public Tree(int root, Tree left, Tree right) {
		this.root = root;
		this.left = left;
		this.right = right;
	}

	/**
	 * Creates a new instance of Tree: a leaf (a special case
	 * of the above) */
	public Tree(int root) {
		this.root = root;
		this.left = null;
		this.right = null;
	}

	/** Sample method: Mirror myself */
	public void mirror() {
		if (left != null) { // Left branch, please mirror yourself
			left.mirror();  // This works by delegation
		}
		if (right != null) { // Right branch, please mirror yourself
			right.mirror();  // This works by delegation
		}
		Tree originalLeft = left; // Swap the branches, mirror myself
		left = right;
		right = originalLeft;
	}
	
	/**
	 * Converts a tree to an expression-tree string representation
	 */
	@Override
	public String toString() {
		String sleft, sright;

		// Convert the left and right branches to strings,
		// delegating the task to them if they exist.
		if (left == null) {
			sleft = "empty";
		} else {
			sleft = left.toString(); // Please do your job, Mr. Left Subtree.
		}
		if (right == null) {
			sright = "empty";
		} else {
			sright = right.toString(); // Please do your job, Mrs. Right Subtree.
		}
		// Now I do my own job:
		String s = "branch(" + root + "," + sleft + "," + sright + ")";
		return s;
	}

	/**
	 * Converts a tree to an expression-tree string representation (advanced)
	 */
	public String toStringAdv() {
		return this.toStringFrom(0);
	}
	public String toStringFrom(int depth) {
		int step = 4; // Depth step (number of spaces printed)

		// Delegate task to Mr. Left Subtree, if necessary:
		String sleft;
		if (left != null) {
			sleft = left.toStringFrom(depth + step);
		} else {
			sleft = "";
		}
		// Delegate task to Mrs. Right Subtree, if necessary:
		String sright;
		if (right != null) {
			sright = right.toStringFrom(depth + step);
		} else {
			sright = "";
		}
		// My own task now:
		String s = sright + spaces(depth) + root + "\n" + sleft;
		return s;
	}
	private String spaces(int n) {
		String s = "";
		for (int i = 0; i < n; i++) {
			s = s + " ";
		}
		return s;
	}
	
	// 2
	// This will multiply the data by 3
	public void triple() {
	    root = root * 3;
	    if (left != null)
	    	left.triple();        
	    if (right != null) 
	        right.triple(); 
	}
	
	// 3
	// It has the same function as no.2 but instead of multiply the data by 3,
	// 		it will print the data of each node
	public void printDepthFirst() {
        System.out.print(root +" ");
        if (left != null)      
            left.printDepthFirst();       
        if (right != null)  
            right.printDepthFirst(); 
	}

	// 4
	// This will return a fresh copy of a tree
	public Tree createFreshCopy() {
//		if(this == null) return null;
		Tree treeCopy = new Tree(this.root);
		if(this.left != null)
		treeCopy.left = this.left.createFreshCopy();
		if(this.right != null)
		treeCopy.right = this.right.createFreshCopy();
		return treeCopy;
	}

	// 5
	// Store the value of tree into the selected array, Starting at beginning.
	public int saveDepthFirst(int a[], int whereToStart) {
		a[whereToStart] = root;
        if(left != null) whereToStart = left.saveDepthFirst(a, whereToStart + 1);
        if(right != null) whereToStart = right.saveDepthFirst(a, whereToStart + 1);
        return whereToStart;
	}
	
	// 6
	// This will return the sub-tree/tree containing the value of n, It will return null if we failed to
	// find n inside the tree
	public Tree find(int n) {
		// Your code is in here
		if(root == n) return this;
		if(root != n) {
			if(root < n) {
				return right.find(n);
			}
			if(root > n) {
				return left.find(n);
			}
		} return null;
	}
	
	// 7 
	// This will create a new node in the appropriate place if we failed to find n
	public Tree insert(int n) {
		this.insertRecursive(this, n);
		return this;
	}
	Tree insertRecursive(Tree node, int n) {
		if (node == null) {
			node = new Tree(n);
		}
		if(n<node.root) {
			node.left = insertRecursive(node.left,n);
		}else if(n>node.root) {
			node.right = insertRecursive(node.right,n);
		}return node;
	}
}
