import java.lang.Math;

/**Interface IBinTree has the method signatures needed to process binary trees
 *
 */
public interface IBinTree {
    // determines whether element is in the tree
    boolean hasElt(int e);
    // returns number of nodes in the tree; counts duplicate elements as separate items
    int size();
    // returns depth of longest branch in the tree
    int height();

    int returnData();

    boolean validHeap();

    IBinTree leftTree();

    IBinTree rightTree();

    boolean allOldEltInHeap(IBinTree aBT);

}