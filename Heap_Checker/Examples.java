import static org.junit.Assert.*;

import org.junit.Test;

// Brandon Snapperman, Atharva Dikshit

public class Examples {
    // HeapChecker Objects:-
    HeapChecker checker = new HeapChecker();

    // MtHeap Objects:-
    MtHeap leftMtHeap = new MtHeap();
    MtHeap rightMtHeap = new MtHeap();

    // TestHeap Objects :-
    TestHeap THeap1 = new TestHeap(23, leftMtHeap, rightMtHeap); // Heap with no children
    TestHeap THeap2 = new TestHeap(22, leftMtHeap, rightMtHeap); // Heap with no children
    TestHeap THeap3 = new TestHeap(21, leftMtHeap, rightMtHeap); // Heap with no children
    TestHeap THeap4 = new TestHeap(20, leftMtHeap, rightMtHeap);// Heap with no children
    TestHeap THeap5 = new TestHeap(18, THeap1, THeap2);
    TestHeap THeap6 = new TestHeap(15, THeap3, THeap4);
    TestHeap THeap7 = new TestHeap(13, THeap5, THeap6);

    // TestHeap2 Objects:-
    TestHeap2 THeap2_1 = new TestHeap2(38, leftMtHeap, rightMtHeap); // Heap with no children
    TestHeap2 THeap2_2 = new TestHeap2(35, leftMtHeap, rightMtHeap); // Heap with no children
    TestHeap2 THeap2_3 = new TestHeap2(30, leftMtHeap, rightMtHeap); // Heap with no children
    TestHeap2 THeap2_4 = new TestHeap2(28, leftMtHeap, rightMtHeap);// Heap with no children
    TestHeap2 THeap2_5 = new TestHeap2(25, THeap1, THeap2);
    TestHeap2 THeap2_6 = new TestHeap2(19, THeap3, THeap4);
    TestHeap2 THeap2_7 = new TestHeap2(16, THeap5, THeap6);
    TestHeap2 THeap2_8 = new TestHeap2(23, THeap2_1, rightMtHeap);
    TestHeap2 THeap2_9 = new TestHeap2(25, leftMtHeap, THeap2_2);


    // TestHeap3 Objects:-
    TestHeap3 THeap3_1 = new TestHeap3(40, leftMtHeap, rightMtHeap); // Heap with no children
    TestHeap3 THeap3_2 = new TestHeap3(32, leftMtHeap, rightMtHeap); // Heap with no children
    TestHeap3 THeap3_3 = new TestHeap3(29, leftMtHeap, rightMtHeap); // Heap with no children
    TestHeap3 THeap3_4 = new TestHeap3(26, leftMtHeap, rightMtHeap);// Heap with no children
    TestHeap3 THeap3_5 = new TestHeap3(12, THeap1, THeap2);
    TestHeap3 THeap3_6 = new TestHeap3(8, THeap3, THeap4);
    TestHeap3 THeap3_7 = new TestHeap3(5, THeap5, THeap6);

    // TestHeap4 Objects:-
    TestHeap4 THeap4_1 = new TestHeap4(12, leftMtHeap, rightMtHeap); // Heap with no children
    TestHeap4 THeap4_2 = new TestHeap4(11, leftMtHeap, rightMtHeap); // Heap with no children
    TestHeap4 THeap4_3 = new TestHeap4(10, leftMtHeap, rightMtHeap); // Heap with no children
    TestHeap4 THeap4_4 = new TestHeap4(9, leftMtHeap, rightMtHeap);// Heap with no children
    TestHeap4 THeap4_5 = new TestHeap4(8, THeap1, THeap2);
    TestHeap4 THeap4_6 = new TestHeap4(7, THeap3, THeap4);
    TestHeap4 THeap4_7 = new TestHeap4(1, THeap5, THeap6);

    // TestHeap5 Objects:-
    TestHeap5 THeap5_1 = new TestHeap5(6, leftMtHeap, rightMtHeap); // Heap with no children
    TestHeap5 THeap5_2 = new TestHeap5(5, leftMtHeap, rightMtHeap); // Heap with no children
    TestHeap5 THeap5_3 = new TestHeap5(4, leftMtHeap, rightMtHeap); // Heap with no children
    TestHeap5 THeap5_4 = new TestHeap5(3, leftMtHeap, rightMtHeap);// Heap with no children
    TestHeap5 THeap5_5 = new TestHeap5(2, THeap1, THeap2);
    TestHeap5 THeap5_6 = new TestHeap5(1, THeap3, THeap4);
    TestHeap5 THeap5_7 = new TestHeap5(0, THeap5, THeap6);
//----------------------------------------------------------------------------------------------------------------------

    // DataHeap Objects:-

    /* Heap with left and right child empty; height = 1 */
    DataHeap dataHeap1 = new DataHeap(31, leftMtHeap, rightMtHeap);
    DataHeap dataHeap2 = new DataHeap(32, leftMtHeap, rightMtHeap);
    DataHeap dataHeap3 = new DataHeap(33, leftMtHeap, rightMtHeap);
    DataHeap dataHeap4 = new DataHeap(34, leftMtHeap, rightMtHeap);
    DataHeap dataHeap5 = new DataHeap(35, leftMtHeap, rightMtHeap);
    DataHeap dataHeap6 = new DataHeap(36, leftMtHeap, rightMtHeap);

    /* Heap with left child empty; height = 2 */
    DataHeap dataHeap7 = new DataHeap(28, leftMtHeap, dataHeap1);
    DataHeap dataHeap8 = new DataHeap(29, leftMtHeap, dataHeap2);
    DataHeap dataHeap9 = new DataHeap(30, leftMtHeap, dataHeap3);
    DataHeap dataHeap10 = new DataHeap(31, leftMtHeap, dataHeap4);
    DataHeap dataHeap11 = new DataHeap(32, leftMtHeap, dataHeap5);
    DataHeap dataHeap12 = new DataHeap(33, leftMtHeap, dataHeap6);

    /* Heap with right child empty; height = 2 */
    DataHeap dataHeap13 = new DataHeap(21, dataHeap1, rightMtHeap);
    DataHeap dataHeap14 = new DataHeap(22, dataHeap2, rightMtHeap);
    DataHeap dataHeap15 = new DataHeap(23, dataHeap3, rightMtHeap);
    DataHeap dataHeap16 = new DataHeap(24, dataHeap4, rightMtHeap);
    DataHeap dataHeap17 = new DataHeap(25, dataHeap5, rightMtHeap);
    DataHeap dataHeap18 = new DataHeap(26, dataHeap6, rightMtHeap);
    DataHeap dataHeap19 = new DataHeap(27, dataHeap7, rightMtHeap);

    /* Heap with both children; height = 2 */
    DataHeap dataHeap20 = new DataHeap(25, dataHeap1, dataHeap2);
    DataHeap dataHeap21 = new DataHeap(20, dataHeap3, dataHeap4);
    DataHeap dataHeap22 = new DataHeap(18, dataHeap5, dataHeap6);

    /* Heap with height 3 */
    DataHeap dataHeap23 = new DataHeap(12, dataHeap20, dataHeap21);
//----------------------------------------------------------------------------------------------------------------------

    // MtBT Objects:-
    MtBT leftMtBT = new MtBT();
    MtBT rightMtBT = new MtBT();
//----------------------------------------------------------------------------------------------------------------------

    // DataBT Objects:-

    /* BT with both child empty; height = 1 */
    DataBT BT1 = new DataBT(4, leftMtBT, rightMtBT);
    DataBT BT2 = new DataBT(7, leftMtBT, rightMtBT);
    DataBT BT3 = new DataBT(3, leftMtBT, rightMtBT);
    DataBT BT4 = new DataBT(8, leftMtBT, rightMtBT);

    /* BT with both children; height = 2 */
    DataBT BT5 = new DataBT(9, BT1, BT2);
    DataBT BT6 = new DataBT(2, BT3, BT4);


    /* BT with height 3 */
    DataBT BT7 = new DataBT(1, BT5, BT6);

//======================================================================================================================


    // TestHeap Tests:-

    @Test
    public void TestHeapTest1() {
        assertFalse(checker.addEltTester(THeap1, 1, THeap1.addElt(1)));
    }

    @Test
    public void TestHeapTest2() {
        assertFalse(checker.addEltTester(THeap2, 5, THeap2.addElt(5)));
    }

    @Test
    public void TestHeapTest3() {
        assertFalse(checker.addEltTester(THeap3, 54, THeap3.addElt(54)));
    }

    @Test
    public void TestHeapTest4() {
        assertFalse(checker.addEltTester(THeap4, 76, THeap4.addElt(76)));
    }

    @Test
    public void TestHeapTest5() {
        assertFalse(checker.addEltTester(THeap5, 69, THeap5.addElt(69)));
    }

    @Test
    public void TestHeapTest6() {
        assertFalse(checker.addEltTester(THeap6, 56, THeap1.addElt(56)));
    }

    @Test
    public void TestHeapTest7() {
        assertFalse(checker.addEltTester(THeap7, 89, THeap7.addElt(89)));
    }
//----------------------------------------------------------------------------------------------------------------------

    // TestHeap2 Tests:-

    @Test
    public void TestHelp2_1() {
        assertTrue(checker.remMinEltTester(THeap2_1, THeap2_1.remMinElt()));
    }

    @Test
    public void TestHelp2_2() {
        assertTrue(checker.remMinEltTester(THeap2_2, THeap2_2.remMinElt()));
    }

    @Test
    public void TestHelp2_3() {
        assertTrue(checker.remMinEltTester(THeap2_3, THeap2_3.remMinElt()));
    }

    @Test
    public void TestHelp2_4() {
        assertTrue(checker.remMinEltTester(THeap2_4, THeap2_4.remMinElt()));
    }

    @Test
    public void TestHeap2_5() {
        assertFalse(checker.remMinEltTester(THeap2_5, THeap2_5.remMinElt()));
    }

    @Test
    public void TestHeap2_6() {
        assertFalse(checker.remMinEltTester(THeap2_6, THeap2_6.remMinElt()));
    }

    @Test
    public void TestHeap2_7() {
        assertFalse(checker.remMinEltTester(THeap2_7, THeap2_7.remMinElt()));
    }

    @Test
    public void TestHeap2_8() {
        assertTrue(checker.remMinEltTester(THeap2_8, THeap2_8.remMinElt()));
    }

    @Test
    public void TestHeap2_9() {
        assertTrue(checker.remMinEltTester(THeap2_9, THeap2_9.remMinElt()));
    }

//----------------------------------------------------------------------------------------------------------------------

    // TestHeap3 Tests:-

    @Test
    public void TestHeap3_1() {
        assertFalse(checker.addEltTester(THeap3_1, 4, THeap3_1.addElt(4)));
    }

    @Test
    public void TestHeap3_2() {
        assertFalse(checker.addEltTester(THeap3_2, 56, THeap3_2.addElt(56)));
    }

    @Test
    public void TestHeap3_3() {
        assertFalse(checker.addEltTester(THeap3_3, 34, THeap3_3.addElt(34)));
    }

    @Test
    public void TestHeap3_4() {
        assertFalse(checker.addEltTester(THeap3_4, 78, THeap3_4.addElt(78)));
    }

    @Test
    public void TestHeap3_5() {
        assertFalse(checker.addEltTester(THeap3_5, 67, THeap3_5.addElt(67)));
    }

    @Test
    public void TestHeap3_6() {
        assertFalse(checker.addEltTester(THeap3_6, 39, THeap3_6.addElt(39)));
    }

    @Test
    public void TestHeap3_7() {
        assertFalse(checker.addEltTester(THeap3_7, 96, THeap3_7.addElt(96)));
    }
//----------------------------------------------------------------------------------------------------------------------

    // TestHeap4 Tests:-
    @Test
    public void TestHeap4_1() {
        assertFalse(checker.remMinEltTester(THeap4_1, THeap4_1.remMinElt()));
    }

    @Test
    public void TestHeap4_2() {
        assertFalse(checker.remMinEltTester(THeap4_2, THeap4_2.remMinElt()));
    }

    @Test
    public void TestHeap4_3() {
        assertFalse(checker.remMinEltTester(THeap4_3, THeap4_3.remMinElt()));
    }

    @Test
    public void TestHeap4_4() {
        assertFalse(checker.remMinEltTester(THeap4_4, THeap4_4.remMinElt()));
    }

    @Test
    public void TestHeap4_5() {
        assertFalse(checker.remMinEltTester(THeap4_5, THeap4_5.remMinElt()));
    }

    @Test
    public void TestHeap4_6() {
        assertFalse(checker.remMinEltTester(THeap4_6, THeap4_6.remMinElt()));
    }

    @Test
    public void TestHeap4_7() {
        assertFalse(checker.remMinEltTester(THeap4_7, THeap4_7.remMinElt()));
    }
//----------------------------------------------------------------------------------------------------------------------

    // TestHeap5 Tests:-
    @Test
    public void TestHeap5_1() {
        assertFalse(checker.addEltTester(THeap5_1, 3, THeap5_1.addElt(3)));
    }

    @Test
    public void TestHeap5_2() {
        assertFalse(checker.addEltTester(THeap5_2, 3, THeap5_2.addElt(3)));
    }

    @Test
    public void TestHeap5_3() {
        assertFalse(checker.addEltTester(THeap5_3, 3, THeap5_3.addElt(3)));
    }

    @Test
    public void TestHeap5_4() {
        assertFalse(checker.addEltTester(THeap5_4, 3, THeap5_4.addElt(3)));
    }

    @Test
    public void TestHeap5_5() {
        assertFalse(checker.addEltTester(THeap5_5, 3, THeap5_5.addElt(3)));
    }

    @Test
    public void TestHeap5_6() {
        assertFalse(checker.addEltTester(THeap5_6, 3, THeap5_6.addElt(3)));
    }

    @Test
    public void TestHeap5_7() {
        assertFalse(checker.addEltTester(THeap5_7, 3, THeap5_7.addElt(3)));
    }
//----------------------------------------------------------------------------------------------------------------------

    // Test for validHeap() :-

    @Test
    public void validHeapTest1() {
        assertTrue(BT1.validHeap());
    }

    @Test
    public void validHeapTest2() {
        assertTrue(BT2.validHeap());
    }

    @Test
    public void validHeapTest3() {
        assertTrue(BT3.validHeap());
    }

    @Test
    public void validHeapTest4() {
        assertTrue(BT4.validHeap());
    }

    @Test
    public void validHeapTest5() {
        assertFalse(BT5.validHeap());
    }

    @Test
    public void validHeapTest6() {
        assertTrue(BT6.validHeap());
    }

    @Test
    public void validHeapTest7() {
        assertFalse(BT7.validHeap());
    }
//----------------------------------------------------------------------------------------------------------------------

    // Test for addEltTester :-

    @Test
    public void addEltTester_Test1() {
        assertTrue(checker.addEltTester(dataHeap1, 3, dataHeap1.addElt(3)));
    }

    @Test
    public void addEltTester_Test2() {
        assertTrue(checker.addEltTester(dataHeap9, 35, dataHeap9.addElt(35)));
    }

    @Test
    public void addEltTester_Test3() {
        assertTrue(checker.addEltTester(dataHeap17, 1, dataHeap17.addElt(1)));
    }

    @Test
    public void addEltTester_Test4() {
        assertTrue(checker.addEltTester(dataHeap21, 8, dataHeap21.addElt(8)));
    }

    @Test
    public void addEltTester_Test5() {
        assertTrue(checker.addEltTester(dataHeap23, 24, dataHeap23.addElt(24)));
    }
    //----------------------------------------------------------------------------------------------------------------------
    // Test of remMinEltTester :-
    @Test
    public void remMinEltTester_Test1(){
        assertTrue(checker.remMinEltTester(dataHeap4,dataHeap4.remMinElt()));
    }
    @Test
    public void remMinEltTester_Test2(){
        assertTrue(checker.remMinEltTester(dataHeap10,dataHeap10.remMinElt()));
    }
    @Test
    public void remMinEltTester_Test3(){
        assertTrue(checker.remMinEltTester(dataHeap18,dataHeap18.remMinElt()));
    }
    @Test
    public void remMinEltTester_Test4(){
        assertTrue(checker.remMinEltTester(dataHeap22,dataHeap22.remMinElt()));
    }
    @Test
    public void remMinEltTester_Test5(){
        assertTrue(checker.remMinEltTester(dataHeap23,dataHeap23.remMinElt()));
    }



    MtHeap mtheap = new MtHeap();
    MtBT mtbt = new MtBT();
    HeapChecker check = new HeapChecker();

    // Bt
    DataBT bt0 = new DataBT(0, mtbt, mtbt);
    // Bt height 1
    DataBT bt11 = new DataBT(7, mtbt, mtbt);
    DataBT bt12 = new DataBT(9, mtbt, mtbt);
    DataBT bt13 = new DataBT(13, mtbt, mtbt);
    DataBT bt14 = new DataBT(11, mtbt, mtbt);
    DataBT bt15 = new DataBT(2, mtbt, mtbt);
    DataBT bt16 = new DataBT(3, mtbt, mtbt);
    // Bt height 2
    DataBT bt21 = new DataBT(4, bt11, bt12);
    DataBT bt22 = new DataBT(3, bt13, bt14);
    DataBT bt23 = new DataBT(5, mtbt, bt11); // left empty
    DataBT bt24 = new DataBT(20, mtbt, bt11); // left empty invalid heap
    DataBT bt25 = new DataBT(6, bt12, mtbt); // right empty
    DataBT bt26 = new DataBT(20, bt12, mtbt); // right empty invalid heap
    DataBT bt27 = new DataBT(20, bt13, bt14); // invalid heap
    DataBT bt28 = new DataBT(1, bt15, bt16); // tricky heap when addElt(3) or addElt(2)
    // Bt height 3
    DataBT bt31 = new DataBT(1, bt21, bt22);
    DataBT bt32 = new DataBT(20, bt21, bt22); // invalid heap
    DataBT bt33 = new DataBT(1, bt27, bt22); // invalid heap
    DataBT bt34 = new DataBT(1, bt21, bt27); // invalid heap
    DataBT bt35 = new DataBT(1, bt21, bt23); //
    DataBT bt36 = new DataBT(1, bt23, bt25); //

//----------------------------------------------------------------------------------------------------------------

    // Heap
    DataHeap heap0 = new DataHeap(0, mtheap, mtheap);
    // Bt height 1
    DataHeap heap11 = new DataHeap(7, mtheap, mtheap);
    DataHeap heap12 = new DataHeap(9, mtheap, mtheap);
    DataHeap heap13 = new DataHeap(13, mtheap, mtheap);
    DataHeap heap14 = new DataHeap(11, mtheap, mtheap);
    DataHeap heap15 = new DataHeap(2, mtheap, mtheap);
    DataHeap heap16 = new DataHeap(3, mtheap, mtheap);
    // Bt height 2
    DataHeap heap21 = new DataHeap(4, heap11, heap12);
    DataHeap heap22 = new DataHeap(3, heap13, heap14);
    DataHeap heap23 = new DataHeap(5, mtheap, heap11); // left empty
    DataHeap heap24 = new DataHeap(20, mtheap, heap11); // left empty invalid heap
    DataHeap heap25 = new DataHeap(6, heap12, mtheap); // right empty
    DataHeap heap26 = new DataHeap(20, heap12, mtheap); // right empty invalid heap
    DataHeap heap27 = new DataHeap(20, heap13, heap14); // invalid heap
    DataHeap heap28 = new DataHeap(1, heap15, heap16); // tricky heap when addElt(3) or addElt(2)
    // Bt height 3
    DataHeap heap31 = new DataHeap(1, heap21, heap22);
    DataHeap heap32 = new DataHeap(20, heap21, heap22); // invalid heap
    DataHeap heap33 = new DataHeap(1, heap27, heap22); // invalid heap
    DataHeap heap34 = new DataHeap(1, heap21, heap27); // invalid heap
    DataHeap heap35 = new DataHeap(1, heap21, heap23); //
    DataHeap heap36 = new DataHeap(1, heap23, heap25); //
    DataHeap heap37 = new DataHeap(1, heap21, heap21); //

    MtHeap heapMT = new MtHeap();

    TestHeap tHeap1 = new TestHeap(7, mtheap, mtheap);
    TestHeap tHeap2 = new TestHeap(13, mtheap, mtheap);
    TestHeap tHeap3 = new TestHeap(5, tHeap1, tHeap2);
    TestHeap tHeap4 = new TestHeap(4, tHeap1, mtheap);
    TestHeap tHeap5 = new TestHeap(4, mtheap, tHeap2);

    TestHeap2 tHeap21 = new TestHeap2(7, mtheap, mtheap);
    TestHeap2 tHeap22 = new TestHeap2(13, mtheap, mtheap);
    TestHeap2 tHeap23 = new TestHeap2(5, tHeap21, tHeap22);
    TestHeap2 tHeap24 = new TestHeap2(4, tHeap21, mtheap);
    TestHeap2 tHeap25 = new TestHeap2(4, mtheap, tHeap22);

    TestHeap3 tHeap31 = new TestHeap3(7, mtheap, mtheap);
    TestHeap3 tHeap32 = new TestHeap3(13, mtheap, mtheap);
    TestHeap3 tHeap33 = new TestHeap3(5, tHeap31, tHeap32);
    TestHeap3 tHeap34 = new TestHeap3(4, tHeap31, mtheap);
    TestHeap3 tHeap35 = new TestHeap3(4, mtheap, tHeap32);

    TestHeap4 tHeap41 = new TestHeap4(7, mtheap, mtheap);
    TestHeap4 tHeap42 = new TestHeap4(13, mtheap, mtheap);
    TestHeap4 tHeap43 = new TestHeap4(5, tHeap41, tHeap42);
    TestHeap4 tHeap44 = new TestHeap4(0, mtheap, mtheap);
    TestHeap4 tHeap45 = new TestHeap4(4, tHeap41, mtheap);
    TestHeap4 tHeap46 = new TestHeap4(4, mtheap, tHeap42);

    TestHeap5 tHeap51 = new TestHeap5(7, mtheap, mtheap);
    TestHeap5 tHeap52 = new TestHeap5(13, mtheap, mtheap);
    TestHeap5 tHeap53 = new TestHeap5(5, tHeap51, tHeap52);
    TestHeap5 tHeap54 = new TestHeap5(4, tHeap51, mtheap);
    TestHeap5 tHeap55 = new TestHeap5(4, mtheap, tHeap52);

    //Testing TestHeap
    @Test
    public void TestingTestHeap_1() {
        assertFalse(check.addEltTester(tHeap3, 4, tHeap3.addElt(4)));}
    @Test
    public void TestingTestHeap_2() {
        assertFalse(check.addEltTester(tHeap1, 4, tHeap1.addElt(4)));}
    @Test
    public void TestingTestHeap_3() {
        assertFalse(check.addEltTester(tHeap4, 4, tHeap4.addElt(4)));}
    @Test
    public void TestingTestHeap_4() {
        assertFalse(check.addEltTester(tHeap5, 4, tHeap5.addElt(4)));}
    @Test
    public void TestingTestHeap_5() {
        assertTrue(check.addEltTester(mtheap, 4, mtheap.addElt(4)));}

    //Testing TestHeap2
    @Test
    public void TestingTestHeap2_1() {
        assertFalse(check.remMinEltTester(tHeap23, tHeap23.remMinElt()));}
    @Test
    public void TestingTestHeap2_2() {
        assertTrue(check.remMinEltTester(tHeap21, tHeap21.remMinElt()));}
    @Test
    public void TestingTestHeap2_3() {
        assertTrue(check.remMinEltTester(tHeap24, tHeap24.remMinElt()));}
    @Test
    public void TestingTestHeap2_4() {
        assertTrue(check.remMinEltTester(tHeap25, tHeap25.remMinElt()));}
    @Test
    public void TestingTestHeap2_5() {
        assertTrue(check.remMinEltTester(mtheap, tHeap21.remMinElt()));}

    //Testing TestHeap3
    @Test
    public void TestingTestHeap3_1() {
        assertFalse(check.addEltTester(tHeap33, 4, tHeap33.addElt(4)));}
    @Test
    public void TestingTestHeap3_2() {
        assertFalse(check.addEltTester(tHeap31, 4, tHeap31.addElt(4)));}
    @Test
    public void TestingTestHeap3_3() {
        assertFalse(check.addEltTester(tHeap34, 4, tHeap34.addElt(4)));}
    @Test
    public void TestingTestHeap3_4() {
        assertFalse(check.addEltTester(tHeap35, 4, tHeap35.addElt(4)));}
    @Test
    public void TestingTestHeap3_5() {
        assertTrue(check.addEltTester(mtheap, 4, mtheap.addElt(4)));}

    //Testing TestHeap4
    @Test
    public void TestingTestHeap4_1() {
        assertFalse(check.remMinEltTester(tHeap43, tHeap43.remMinElt()));}
    @Test
    public void TestingTestHeap4_2() {
        assertFalse(check.remMinEltTester(tHeap41, tHeap41.remMinElt()));}
    @Test
    public void TestingTestHeap4_3() {
        assertFalse(check.remMinEltTester(tHeap45, tHeap45.remMinElt()));}
    @Test
    public void TestingTestHeap4_4() {
        assertFalse(check.remMinEltTester(tHeap46, tHeap46.remMinElt()));}
    @Test
    public void TestingTestHeap4_5() {
        assertFalse(check.remMinEltTester(tHeap44, tHeap44.remMinElt()));}
    @Test
    public void TestingTestHeap4_6() {
        assertTrue(check.remMinEltTester(mtheap, mtheap.remMinElt()));}

    //Testing TestHeap5
    @Test
    public void TestingTestHeap5_1() {
        assertFalse(check.addEltTester(tHeap53, 4, tHeap53.addElt(4)));}
    @Test
    public void TestingTestHeap5_2() {
        assertFalse(check.addEltTester(tHeap51, 4, tHeap51.addElt(4)));}
    @Test
    public void TestingTestHeap5_3() {
        assertFalse(check.addEltTester(tHeap54, 4, tHeap54.addElt(4)));}
    @Test
    public void TestingTestHeap5_4() {
        assertFalse(check.addEltTester(tHeap55, 4, tHeap55.addElt(4)));}
    @Test
    public void TestingTestHeap5_5() {
        assertTrue(check.addEltTester(mtheap, 4, mtheap.addElt(4)));}

    //Testing validHeap
    @Test
    public void TestingValidHeap_1() {
        assertTrue(mtheap.validHeap());}
    @Test
    public void TestingValidHeap_2() {
        assertTrue(bt23.validHeap());}
    @Test
    public void TestingValidHeap_3() {
        assertFalse(bt24.validHeap());}
    @Test
    public void TestingValidHeap_4() {
        assertTrue(bt25.validHeap());}
    @Test
    public void TestingValidHeap_5() {
        assertFalse(bt26.validHeap());}
    @Test
    public void TestingValidHeap_6() {
        assertTrue(bt22.validHeap());}
    @Test
    public void TestingValidHeap_7() {
        assertFalse(bt27.validHeap());}
    @Test
    public void TestingValidHeap_8() {
        assertTrue(bt31.validHeap());}
    @Test
    public void TestingValidHeap_9() {
        assertFalse(bt32.validHeap());}
    @Test
    public void TestingValidHeap_10() {
        assertFalse(bt33.validHeap());}
    @Test
    public void TestingValidHeap_11() {
        assertFalse(bt34.validHeap());}

    //Testing allOldEltInHeap
    @Test
    public void TestForAllOldEltInHeap_1() {
        assertTrue(bt22.allOldEltInHeap(bt22));}
    @Test
    public void TestForAllOldEltInHeap_2() {
        assertTrue(bt31.allOldEltInHeap(bt22));}
    @Test
    public void TestForAllOldEltInHeap_3() {
        assertFalse(bt22.allOldEltInHeap(bt31));}

    // Testing the addEltTester
    @Test
    public void TestForaddEltTester1() {
        assertTrue(check.addEltTester(heap23, 7, heap23.addElt(4)));}
    @Test
    public void TestForaddEltTester2() {
        boolean act = false;
        if (heap25.addElt(7).validHeap()) {
            act = true;
        }
        assertEquals(check.addEltTester(heap25, 7, heap25.addElt(7)), act);}
    @Test
    public void TestForaddEltTester3() {
        assertFalse(check.addEltTester(heap27, 5, heap27.addElt(8)));}
    @Test
    public void TestForaddEltTester4() {
        boolean act = false;
        if (heap26.addElt(3).validHeap()) {
            act = true;
        }
        assertEquals(check.addEltTester(heap26, 3, heap26.addElt(3)), act);}
    @Test
    public void TestForaddEltTester5() {
        assertTrue(check.addEltTester(heap31, 20, heap31.addElt(20)));}
    @Test
    public void TestForaddEltTester6() {
        assertFalse(check.addEltTester(heap34, 27, heap34.addElt(27)));}
    @Test
    public void TestForaddEltTester7() {
        assertTrue(check.addEltTester(heap35, 100, heap35.addElt(100)));}
    @Test
    public void TestForaddEltTester8() {
        boolean act = false;
        if (heap36.addElt(30).validHeap()) {
            act = true;
        }
        assertEquals(check.addEltTester(heap36, 30, heap36.addElt(30)), act);}

    // Testing the remMinEltTester
    @Test
    public void TestForRemMinEltTester1() {
        assertTrue(check.remMinEltTester(heap37, heap37.remMinElt()));}//change made
    @Test
    public void TestForRemMinEltTester2() {
        assertTrue(check.remMinEltTester(heap22, heap22.remMinElt()));}
    @Test
    public void TestForRemMinEltTester3() {
        assertTrue(check.remMinEltTester(heap23, heap23.remMinElt()));}
    @Test
    public void TestForRemMinEltTester4() {
        assertTrue(check.remMinEltTester(heap25, heap25.remMinElt()));}
    @Test
    public void TestForRemMinEltTester5() {
        assertFalse(check.remMinEltTester(heap27, heap27.remMinElt()));}
    @Test
    public void TestForRemMinEltTester6() {
        assertTrue(check.remMinEltTester(heap31, heap31.remMinElt()));}
    @Test
    public void TestForRemMinEltTester7() {
        assertFalse(check.remMinEltTester(heap32, heap32.remMinElt()));}
    @Test
    public void TestForRemMinEltTester8() {
        assertTrue(check.remMinEltTester(heap35, heap35.remMinElt()));}
    @Test
    public void TestForRemMinEltTester9() {
        assertTrue(check.remMinEltTester(heap36, heap36.remMinElt()));}
}

