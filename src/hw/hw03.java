package hw;

/*
 * Date: 2016/12/12
 * Author: 105021***  ???
 */
import java.util.Scanner;

public class hw03 {
	private static BinTree bTree;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char contChar = 'Y';
		float v1 = 0;
		boolean flag = true;
		while (contChar == 'Y' || contChar == 'y') {
			flag = true;
			System.out.print("Number");
			v1 = scn.nextFloat();
			if (bTree == null) {
				bTree = new BinTree(v1);
			} else {
				bTree.addNode(v1);
			}
			bTree.inOrder(bTree.root);
			scn.nextLine().charAt(0);
		}

	}
}