import java.lang.Math;

/**Class DataBT
 * This class handles Binary Tree data calls and as a super class it has methods pertaining to Heaps
 * and it implements the IBinTree interface
 */
public class DataBT implements IBinTree {
    int data;
    IBinTree left;
    IBinTree right;

    DataBT(int data, IBinTree left, IBinTree right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    // an alternate constructor for when both subtrees are empty
    DataBT(int data) {
        this.data = data;
        this.left = new MtBT();
        this.right = new MtBT();
    }

    // determines whether this node or node in subtree has given element
    public boolean hasElt(int e) {
        return this.data == e || this.left.hasElt(e) || this.right.hasElt(e);
    }

    // adds 1 to the number of nodes in the left and right subtrees
    public int size() {
        return 1 + this.left.size() + this.right.size();
    }

    // adds 1 to the height of the taller subtree
    public int height() {
        return 1 + Math.max(this.left.height(), this.right.height());
    }

    /**Method returnData returns an integer which is the data value of the given BT object
     *
     * @return integer
     */
    public int returnData() {
        return this.data;
    }

    /**Method leftTree returns a IBinTree object which is the left subtree
     *
     * @return IBinTree
     */
    public IBinTree leftTree() {
        return this.left;
    }

    /**Method rightTree returns a IBinTree object which is the right subtree
     *
     * @return IBinTree
     */
    public IBinTree rightTree() {
        return this.right;
    }

    /**Method validHeap returns a boolean if the given object is a valid heap
     *
     * @return boolean
     */
    public boolean validHeap() {
        if (left.size() == 0 && right.size() == 0) {
            return true;
        } else if (left.size() != 0 && right.size() == 0) {
            if (this.data <= this.left.returnData() && this.left.validHeap()) {
                return true;
            }
        } else if (left.size() == 0 && right.size() != 0) {
            if (this.data <= this.right.returnData() && this.right.validHeap()) {
                return true;
            }
        } else if (left.size() != 0 && right.size() != 0) {
            if (this.data <= this.left.returnData() && this.data <= this.right.returnData()
                    && this.left.validHeap() && this.right.validHeap()) {
                return true;
            }
        }
        return false;
    }

    /**Method allOldEltInHeap takes in an IBinTree object and returns a boolean if the updated/new IBinTree object
     * has all the old data from the given IBinTree object
     * @param oldBT IBinTree
     * @return boolean
     */
    public boolean allOldEltInHeap(IBinTree oldBT) {
        if (oldBT.size() == 0) {
            return true;
        } else if (oldBT.leftTree().size() == 0 && oldBT.rightTree().size() == 0) {
            return (this.hasElt(oldBT.returnData()));
        } else if (oldBT.leftTree().size() != 0 && oldBT.rightTree().size() == 0) {
            return (this.hasElt(oldBT.returnData()) && this.allOldEltInHeap(oldBT.leftTree()));
        } else if (oldBT.leftTree().size() == 0 && oldBT.rightTree().size() != 0) {
            return (this.hasElt(oldBT.returnData())) && this.allOldEltInHeap(oldBT.rightTree());
        } else if (oldBT.leftTree().size() != 0 && oldBT.rightTree().size() != 0) {
            return (this.hasElt(oldBT.returnData()) && this.allOldEltInHeap(oldBT.leftTree()) && this.allOldEltInHeap(oldBT.rightTree()));
        } else {
            return false;
        }
    }

}