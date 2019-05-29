package eu.sig.training.ch03.binarytree;

public class BinaryTreeSearch {

    // tag::calculateDepth[]
    public static int calculateDepth(BinaryTreeNode<Integer> node, int nodeValue) {
        int depth = 0;
        if (node.getValue() == nodeValue) return depth;
        if (nodeValue < node.getValue() && node.getLeft() != null) {
            return 1 + calculateDepth(left, nodeValue);
        }
        if(nodeValue > node.getValue() && node.getRight() != null){
            return 1 + calculateDepth(right, nodeValue);
        } else {
            throw new TreeException("Value not found in tree!");
        }
    }
}
    // end::calculateDepth[]