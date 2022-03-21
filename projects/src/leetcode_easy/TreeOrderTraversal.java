/*
Given the root of an n-ary tree, return the preorder traversal of its nodes' values.

Nary-Tree input serialization is represented in their level order traversal.
Each group of children is separated by the null value 
*/

import java.util.ArrayList;
import java.util.List;


// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

public class TreeOrderTraversal {
    List<Integer> ans = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if (root == null) return ans;
        ans.add(root.val);
        for (Node child : root.children)
            preorder(child);
        return ans;
    } 
}

/*
Idea:
Preorder traversal is a type of depth-first search (DFS) approach,
and DFS problems are generally best solved with a recursive function.
In this case, we can even make the main function its own recursive function,
rather than having to define a separate recursive helper. In order to accomplish this,
we'll need to create a new default argument for the function to hold our answer array (ans),
which should default to an empty array.

In a preorder DFS traversal, a node is processed before moving on to its children,
and then the children are processed from left to right.
Our recursive function should then process the current node (root) by pushing its value to ans,
and then we should iterate through root.children and call our recursive function on each.

For all but the main function call, the return value will be unused,
but ans should be finished by the time the main function returns it.

Java doesn't support default arguments, but we can make ans an instance variable instead.
*/