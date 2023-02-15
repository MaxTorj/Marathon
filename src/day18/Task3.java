package day18;

public class Task3 {
    public static void main(String[] args) {
        Node mainRoot = new Node(20);

        int[] numbers = {14, 23, 11, 16, 22, 27, 5, 15, 18, 24, 150, 8};
        for (int number : numbers) {
            addNode(number, mainRoot);
        }

        dfs(mainRoot);
    }

    private static void dfs(Node node) {
        if (node == null)
            return;

        dfs(node.getLeftChild());
        System.out.print(node.getValue() + " ");
        dfs(node.getRightChild());
    }

    private static void addNode(int currentValue, Node root) {
        if (root == null)
            throw new IllegalArgumentException("Корневой узел null");

        Node newNode = root;
        Node currentNode = null;

        while (newNode != null) {
            currentNode = newNode;

            if (currentValue < currentNode.getValue()) {
                newNode = currentNode.getLeftChild();
            } else {
                newNode = currentNode.getRightChild();
            }
        }

        if (currentValue < currentNode.getValue()) {
            currentNode.setLeftChild(new Node(currentValue));
        } else {
            currentNode.setRightChild(new Node(currentValue));
        }
    }
}
