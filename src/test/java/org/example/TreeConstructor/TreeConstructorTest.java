package org.example.TreeConstructor;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class TreeConstructorTest {

    @InjectMocks
    TreeConstructor treeConstructor;

    @Test
    void test() {
        String[] astrArdd ={"(2,3)", "(1,2)", "(4,9)", "(9,3)", "(12,9)", "(6,4)"};
        String result = treeConstructor.TreeConstructor(astrArdd);
        assertEquals("true",result);
        /*
                  3
                 / \
                2   9
               /   / \
              1   4   12
                 /
                6
        * */
    }

    @Test
    void test2() {
        String[] astrArdd ={"(1,2)", "(2,4)", "(7,4)"};
        String result = treeConstructor.TreeConstructor(astrArdd);
        assertEquals("true",result);
         /*
                  4
                 / \
                2   7
               /
              1
        * */
    }

    @Test
    void test3() {
        String[] astrArdd ={"(5,6)", "(6,3)", "(2,3)", "(12,5)"};
        String result = treeConstructor.TreeConstructor(astrArdd);
        assertEquals("true",result);
           /*
                  3
                 / \
                6   2
               /
              5
             /
           12
        * */
    }
}