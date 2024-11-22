package javaDataStructures7BSTSilme;

public class Uygulama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST agac=new BST();
		agac.root=agac.insert(agac.root, 10);
		agac.root=agac.insert(agac.root, 5);
		agac.root=agac.insert(agac.root, 15);
		agac.root=agac.insert(agac.root, 20);
		agac.root=agac.insert(agac.root, 4);
		agac.root=agac.insert(agac.root, 8);
		agac.root=agac.insert(agac.root, 12);
		/*
		 
		 					10
		 			5				15
		 		4		8		12			20
		 */
		agac.inOrder(agac.root);
		System.out.println();
		agac.root=agac.delete(agac.root, 4);	
		agac.root=agac.delete(agac.root, 10);
		agac.inOrder(agac.root);
		System.out.println();
		System.out.println(agac.root.data);System.out.println(agac.root.left.data);
		
	}

}
