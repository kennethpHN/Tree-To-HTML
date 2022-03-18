package is310;

/**
 * Implementacion concreta de un nodo para una estructura de arbol.
 * @author kennethp Kenneth Pineda #20201002741
 *
 * @param <E>
 */
public class Node<E> {
	private E value;
	private Node<E> next;
	private LinkedList<E> children;
	
	public Node (E value) {
		this.value = value;
		this.next = null;
		this.children = new LinkedList<E>();
	}
	
	public String toString() {
		return String.format("%s(children: '%s')", this.value, this.children);
	}

	/**
	 * @return the value
	 */
	public E getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(E value) {
		this.value = value;
	}

	/**
	 * @return the next
	 */
	public Node<E> getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(Node<E> next) {
		this.next = next;
	}

	/**
	 * @return the children
	 */
	public LinkedList<E> getChildren() {
		return children;
	}

	/**
	 * @param children the children to set
	 */
	public void setChildren(LinkedList<E> children) {
		this.children = children;
	}
}
