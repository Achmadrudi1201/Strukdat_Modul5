package Latihan_Modul5;

/**
 *
 * @author Rudi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinaryTree pohon = new BinaryTree();

        pohon.NewNode(20);
        pohon.NewNode(2);
        pohon.NewNode(25);
        pohon.NewNode(37);
        pohon.NewNode(16);

        System.out.println("\npreOrder  : ");
        pohon.preOrder(pohon.root);
        System.out.println("\ninOrder   : ");
        pohon.inOrder(pohon.root);
        System.out.println("\npostOrder : ");
        pohon.postOrder(pohon.root);

    }
}
