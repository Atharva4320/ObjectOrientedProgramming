import java.lang.Math;

/**Class DataBT
 * This class handles empty Binary Tree data calls and implements the IBinTree interface
 */
public class MtBT implements IBinTree {
    MtBT(){}

    // returns false since empty tree has no elements
    public boolean hasElt(int e) {
        return false;
    }

    // returns 0 since enpty tree has no elements
    public int size() {
        return 0;
    }

    // returns 0 since empty tree has no branches
    public int height() {
        return 0;
    }

    /**Method returnData returns integer zero
     *
     * @return int 0
     */
    @Override
    public int returnData() {
        return 0;
    }

    /**Method validHeap returns a boolean value if the given heap is valid
     *
     * @return boolean
     */
    @Override
    public boolean validHeap() {
        return true;
    }

    /**Method leftTree returns a new MtBT object representing an empty MtBT object
     *
     * @return MtBT
     */
    @Override
    public MtBT leftTree() {
        return (new MtBT());
    }

    /**Method rightTree returns a new MtBT object representing an empty MtBT object
     *
     * @return MtBT
     */
    @Override
    public MtBT rightTree() {
        return (new MtBT());
    }

    /**Method allOldEltInHeap takes in an IBinTree object and returns a boolean
     * The boolean returns true if the updated/new IBinTree object has all the old data from the given IBinTree object
     * @param aBT IBinTree
     * @return boolean
     */
    @Override
    public boolean allOldEltInHeap(IBinTree aBT) {
        if (aBT.size() == 0) {
            return true;
        }
        else {
            return false;
        }
    }

}