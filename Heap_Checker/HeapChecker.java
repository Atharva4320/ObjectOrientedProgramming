/** Class HeapChecker
 * This class handles two methods - addEltTester and remMinEltTester
 */
public class HeapChecker {

    HeapChecker() {
    }

    /**Method addEltTester() takes in: an IHeap object, an integer, and an IBinTree object; and it produces a boolean if
     * the addELt() method, defined in the DataHeap Class produces a correctly modified heap.
     * @param hOrig an IHeap data structure of the original heap.
     * @param elt an integer value which will be added to the original heap.
     * @param hAdded an IBinTree data structure of the new binary tree after the integer is added.
     * @return a boolean value to check whether the addition of the integer is appropriate.
     */
    boolean addEltTester(IHeap hOrig, int elt, IBinTree hAdded) {
        if (hAdded.validHeap() && hAdded.size() == (hOrig.size() + 1)) {
            if (hAdded.hasElt(elt) && hAdded.allOldEltInHeap(hOrig)) {
                return true;
            }
        }
        return false;
    }

    /**Method remMinEltTester () takes in: an IHeap object and IBinTree object, and it produces a boolean if
     * the remMinElt() method, defined in the DataHeap Class produces a correctly modified heap.
     * @param hOrig an IHeap data structure of the original heap
     * @param hRemoved an IBinTree data structure of the new binary tree after the element is removed.
     * @return a boolena value to check whether the  original heap and the heap after the element is removed is appropriate.
     */
    boolean remMinEltTester(IHeap hOrig, IBinTree hRemoved) {
        if (hRemoved.validHeap() && hOrig.validHeap()) {
            if (hOrig.size() == 0 || hRemoved.size() == 0){
                return true;
            }
            else if (hRemoved.size() == (hOrig.size() - 1)) {
                if (hOrig.returnData() != hRemoved.returnData()) {
                    return true;
                }
            }
        }
        return false;
    }


}