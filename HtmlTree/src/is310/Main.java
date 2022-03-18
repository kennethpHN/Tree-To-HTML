package is310;
/**
 * 
 * @author kennethp Kenneth Mauricio Pineda Bautista #20201002741
 *
 */
public class Main {

	public void impresionEnHTML() {
		
		
		Tree<String> tree = new Tree<>();
		TreeToHTML<String> treeHTML = new TreeToHTML<String>(tree);
		
		tree.push("1");
		tree.push("2");
		tree.push("3");
		tree.push("4");
		
		
		//			1/1  1/2  1/3
		tree.push("1",tree.getElement("1"));
		tree.push("2",tree.getElement("1"));
		tree.push("3",tree.getElement("1"));
		//			1/1/1  1/1/2  1/2/1  1/2/2  1/3/1  1/3/2
		tree.push("1",tree.getElement("1",tree.getElement("1")));
		tree.push("2",tree.getElement("1",tree.getElement("1")));
		tree.push("1",tree.getElement("2",tree.getElement("1")));
		tree.push("2",tree.getElement("2",tree.getElement("1")));
		tree.push("1",tree.getElement("3",tree.getElement("1")));
		tree.push("2",tree.getElement("3",tree.getElement("1")));
		//			1/1/1/1  1/1/2/1  1/2/1/1  1/2/2/1  1/3/1/1  1/3/2/1
		tree.push("1",tree.getElement("1",tree.getElement("1",tree.getElement("1"))));
		tree.push("1",tree.getElement("2",tree.getElement("1",tree.getElement("1"))));
		tree.push("1",tree.getElement("1",tree.getElement("2",tree.getElement("1"))));
		tree.push("1",tree.getElement("2",tree.getElement("2",tree.getElement("1"))));
		tree.push("1",tree.getElement("1",tree.getElement("3",tree.getElement("1"))));
		tree.push("1",tree.getElement("2",tree.getElement("3",tree.getElement("1"))));
		
		
		//			2/1  2/2  2/3
		tree.push("1",tree.getElement("2"));
		tree.push("2",tree.getElement("2"));
		tree.push("3",tree.getElement("2"));
		//			2/1/1  2/1/2  2/2/1  2/2/2  2/3/1  2/3/2
		tree.push("1",tree.getElement("1",tree.getElement("2")));
		tree.push("2",tree.getElement("1",tree.getElement("2")));
		tree.push("1",tree.getElement("2",tree.getElement("2")));
		tree.push("2",tree.getElement("2",tree.getElement("2")));
		tree.push("1",tree.getElement("3",tree.getElement("2")));
		tree.push("2",tree.getElement("3",tree.getElement("2")));
		//			2/1/1/1  2/1/2/1  2/2/1/1  2/2/2/1  2/3/1/1  2/3/2/1
		tree.push("1",tree.getElement("1",tree.getElement("1",tree.getElement("2"))));
		tree.push("1",tree.getElement("2",tree.getElement("1",tree.getElement("2"))));
		tree.push("1",tree.getElement("1",tree.getElement("2",tree.getElement("2"))));
		tree.push("1",tree.getElement("2",tree.getElement("2",tree.getElement("2"))));
		tree.push("1",tree.getElement("1",tree.getElement("3",tree.getElement("2"))));
		tree.push("1",tree.getElement("2",tree.getElement("3",tree.getElement("2"))));
		
		
		
		//			3/1  3/2  3/3
		tree.push("1",tree.getElement("3"));
		tree.push("2",tree.getElement("3"));
		tree.push("3",tree.getElement("3"));
		//			3/1/1  3/1/2  3/2/1  3/2/2  3/3/1  3/3/2
		tree.push("1",tree.getElement("1",tree.getElement("3")));
		tree.push("2",tree.getElement("1",tree.getElement("3")));
		tree.push("1",tree.getElement("2",tree.getElement("3")));
		tree.push("2",tree.getElement("2",tree.getElement("3")));
		tree.push("1",tree.getElement("3",tree.getElement("3")));
		tree.push("2",tree.getElement("3",tree.getElement("3")));
		//			3/1/1/1  3/1/2/1  3/2/1/1  3/2/2/1  3/3/1/1  3/3/2/1
		tree.push("1",tree.getElement("1",tree.getElement("1",tree.getElement("3"))));
		tree.push("1",tree.getElement("2",tree.getElement("1",tree.getElement("3"))));
		tree.push("1",tree.getElement("1",tree.getElement("2",tree.getElement("3"))));
		tree.push("1",tree.getElement("2",tree.getElement("2",tree.getElement("3"))));
		tree.push("1",tree.getElement("1",tree.getElement("3",tree.getElement("3"))));
		tree.push("1",tree.getElement("2",tree.getElement("3",tree.getElement("3"))));
		
		
		
		//			4/1  4/2  4/3
		tree.push("1",tree.getElement("4"));
		tree.push("2",tree.getElement("4"));
		tree.push("3",tree.getElement("4"));
		//			4/1/1  4/1/2  4/2/1  4/2/2  4/3/1  4/3/2
		tree.push("1",tree.getElement("1",tree.getElement("4")));
		tree.push("2",tree.getElement("1",tree.getElement("4")));
		tree.push("1",tree.getElement("2",tree.getElement("4")));
		tree.push("2",tree.getElement("2",tree.getElement("4")));
		tree.push("1",tree.getElement("3",tree.getElement("4")));
		tree.push("2",tree.getElement("3",tree.getElement("4")));
		//			4/1/1/1  4/1/2/1  4/2/1/1  4/2/2/1  4/3/1/1  4/3/2/1
		tree.push("1",tree.getElement("1",tree.getElement("1",tree.getElement("4"))));
		tree.push("1",tree.getElement("2",tree.getElement("1",tree.getElement("4"))));
		tree.push("1",tree.getElement("1",tree.getElement("2",tree.getElement("4"))));
		tree.push("1",tree.getElement("2",tree.getElement("2",tree.getElement("4"))));
		tree.push("1",tree.getElement("1",tree.getElement("3",tree.getElement("4"))));
		tree.push("1",tree.getElement("2",tree.getElement("3",tree.getElement("4"))));
		
		
		System.out.print("Se ha convertido su tree en HTML: \n \n"+treeHTML.convert(tree.getRoot()));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main ejecutar = new Main();
		ejecutar.impresionEnHTML();

	}

}
