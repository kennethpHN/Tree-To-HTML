package is310;

import java.util.Iterator;

/**
 * Implementacion concreta de un arbol generico
 * @author kennethp Kenneth Mauricio Pineda Bautista #20201002741
 * @param <E>
 */
public class Tree<E> {

	private Node<E> root;
	
	@SuppressWarnings("unchecked")
	public Tree() {
		this.root = (Node<E>) new Node<String>("/");
	}
	
	public String toString() {
		return this.recursiveTreeAsString(this.getRoot(),"");
	}
	
	private String recursiveTreeAsString(Node<E> current, String tab) {
		StringBuilder result = new StringBuilder();
		
		LinkedList<E> list = current.getChildren();
		Iterator<Node<E>> iterable = list.iterator();
		
		/*
		 * 1/
		 * 2/
		 * 3/
		 * 		5/
		 * 			/7
		 * 		6/
		 * 4/
		 * 
		 */
		
		while(iterable.hasNext()) {
			Node<E> element = iterable.next();
			result.append(
					String.format(
						"%s%s\n%s",
						tab,
						element.getValue(),
						this.recursiveTreeAsString(
							element,
							String.format("%s\t", tab)	 
						)
					)
			);
		}
		
		return result.toString();
	}
	
	public Node<E> getRoot(){
		return this.root;
	}
	
	public boolean setElement(E value){
		return this.setElement(value, this.getRoot());
	}
	
	public boolean setElement(E value, Node<E> current){
		return current.getChildren().push(value);
		}
	
	public boolean push(E value){
		return this.setElement(value);
	}
	
	public boolean push(E value, Node<E> current){
		return this.setElement(value,current);
	}
	
	public Node<E> getElement(E value){
		return this.getElement(value, this.getRoot());
	}
	
	public Node<E> getElement(E value, Node<E> current){
		return current.getChildren().getElement(value);
	}
}
