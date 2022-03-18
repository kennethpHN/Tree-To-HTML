package is310;

import java.util.Iterator;

/**
 * Implementacion concreta de la lista enlazada
 * @author kennethp Kenneth Pineda #20201002741
 *
 * @param <E>
 */

public class LinkedList<E> implements Iterable<Node<E>>{

	
	private Node<E> first = null;
	
	public boolean isEmpty() {
		
		if (this.first == null) {
			return true;
		}
		return false;
	}
	
	public boolean addLast(E value) {
		
		if (this.isEmpty()) {
			
			this.first = new Node<>(value);
			return true;
		}
		
		/** Para agregar a alguien al final de las lista, se debe recorrer la lista
		 * para encontrar al ultimo. El nuevo elemento sera el siguiente del ultimo. */
		Node<E> current = this.first;//walk
		
		while(current.getNext() != null) {
			current = current.getNext();
		}
		
		/** una vez encontrado el ultimo */
		current.setNext(new Node<>(value));
		return true;
	}
	
	public boolean addFirst(E value) {
		
		if (this.isEmpty()) {
			
			this.first = new Node<>(value);
			return true;
		}
		
		/** Para agregar a alguien en la primer posicion, se debe guardar la lista actual
		 * bajo un puntero, crear un nuevo elemento (nuevo primero), y el siguiente del nuevo primero sera
		 * la lista guardada.*/
		 
		Node<E> list = this.first;
		this.first = new Node<E>(value);
		this.first.setNext(list);
		return true;
	}
	
	public Node<E> removeFirst(){
		if (this.isEmpty()) {
			
			return null;
		}
		
		Node<E> current = this.first;
		this.first = this.first.getNext();
		
		return current;
	}
	
	/**
	 * Permite imprimir una version texto de la lista enlazada, con formato 1 -> 2 -> 3 -> 4
	 * @return [String] Version texto de la lista enlzada, con formato 1 -> 2 -> 3 -> 4
	 */
	public String toString() {
		
		if (this.isEmpty()) {
			
			return "";
		}
		
		StringBuilder result = new StringBuilder(""); // 1 -> 2 -> 3 -> 4
		
		Node<E> current = this.first;//walk
		
		while(current != null) {
			result.append(String.format("%s", current.getValue())); //sprintf, printf
			
			if (current.getNext() != null) {
				result.append(" -> ");
			}
			current = current.getNext();
		}
		
		return result.toString();
	}
	
	/**********************************/
	/**********************************/
	/**********************************/
	/***Funcionalidades adicionales****/
	/**********************************/
	/**********************************/
	/**********************************/
	
	/**
	 * Equivalente a this.addLast();
	 */
	
	public boolean push(E value) {
		return this.addLast(value);
	}
	
	/**
	 * Funcionalidad de busqueda de elementos dentro de una lista enlazada.
	 * Recorrer los elementos de la lista en busqueda de un match.
	 * 
	 */
	public boolean search(E value) {
		
		Node<E> current = this.first;
		
		while(current != null) {
			if (current.getValue() == value) {
				return true;
			}
			current = current.getNext();
		}
		
		return false;
	}
	
	/**
	 * Equivalente a this.search();
	 */
	public boolean existInList(E value) {
		return this.search(value);
	}
	
	/**
	 * Busca y retorna el nodo que coincide con la busqueda segun el value.
	 * 
	 */
	public Node<E> getElement(E value) {
		
		Node<E> current = this.first;
		
		while(current != null) {
			if (current.getValue() == value) {
				return current;
			}
			current = current.getNext();
		}
		
		return null;
	}
	
	/**
	 * Retorna el nodo que coincide con la posicion en la lista
	 */
	public Node<E> getElementAtPosition(int pos){
		
		//Cuando la posicion es negativa, se aplica el reemplazo de la primer posicion con pos = 0
		pos = pos < 0 ? 0 : pos;
		
		int currentPos = 0;
		Node<E> current = this.first;
		
		while(current!= null) {
			if(currentPos == pos) {
				return current;
			}
			current= current.getNext();
			currentPos++;
		}
		
		return null;
	}
	
	/**
	 * Establece un elemento en la posicion de la lista. Si la posicion no existe,
	 * agrega el elemento al final
	 */
	public boolean setElementAtPosition(int pos, E value){
		
		/**Cuando se reemplaza el primer elemento de la lista*/
		if(this.isEmpty() || pos<=0) {
			return this.addFirst(value);
		}
		
		/**Cuando se reemplaza del segundo elemento en adelante*/
		int currentPos = 1;
		Node<E> prev = this.first;
		Node<E> current = prev.getNext();
		
		// 1 ->   -> 2 -> 3 -> null
		while(current != null) {
			if (currentPos == pos) {
				Node<E> list = current;
				prev.setNext(new Node<E>(value));
				prev.getNext().setNext(list);
				return true;
			}
			prev = current;
			current = prev.getNext();
			currentPos++;
		}
		
		return this.addLast(value);
	}

	@Override
	public Iterator<Node<E>> iterator() {
		return new NodeIterator();
	}
	
	private class NodeIterator implements Iterator<Node<E>>{
		private Node<E> current;
		
		@Override
		public boolean hasNext() {
			if (current == null) {
				current = first;
				return current != null;
			}else {
				current = current.getNext();
				return current != null;
			}
		}

		@Override
		public Node<E> next() {
			return current;
		}
		
	}
}
