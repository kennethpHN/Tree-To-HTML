package is310;

import java.util.Iterator;
/**
 * 
 * @author kennethp Kenneth Mauricio Pineda Bautista #20201002741
 *
 * @param <E>
 */
public class TreeToHTML<E> {

	private Tree<E> tree;
	
	public TreeToHTML(Tree<E> tree) {
		this.tree = tree;
	}

	/**
	 * @return the tree
	 */
	public Tree<E> getTree() {
		return tree;
	}

	/**
	 * @param tree the tree to set
	 */
	public void setTree(Tree<E> tree) {
		this.tree = tree;
	}
	
	public String toString() {
		return this.convert(tree.getRoot());
	}
	
	
	public String convert(Node<E> current) {
		StringBuilder result = new StringBuilder();
		LinkedList<E> list = current.getChildren();
		Iterator<Node<E>> iterable = list.iterator();		
		while(iterable.hasNext()) {
			Node<E> element = iterable.next();
			result.append(String.format("<ul><li>%s</li>\n%s</ul>",element.getValue(),
										this.convert(element)
										)
						);
		}
		
		return result.toString();
	}
	
	
}
