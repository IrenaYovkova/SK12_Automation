public class PineTree {
    public static void main(String[] args) {
        int treeHeight = 7;

        for (int i = 0; i < treeHeight; i++) {
            // Print spaces before the asterisks
            for (int j = 0; j < treeHeight - i - 1; j++) {
                System.out.print(" ");
            }

            // Print asterisks for the tree
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        // Print the trunk of the tree
        for (int i = 0; i < treeHeight - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }
}


