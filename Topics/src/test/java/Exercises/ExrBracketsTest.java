package Exercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExrBracketsTest {

    @Test
    public void parNegativeTest() {
        String line = "[{}]]";
        assertFalse(ExrBrackets.par(line));
    }

    @Test
    public void parPostiveTest(){
        String line = " ";
        assertTrue(ExrBrackets.par(line));
    }
    @Test
    public void parNegativeOpenBrackTest(){
        String line = "{{";
        assertFalse(ExrBrackets.par(line));
    }
    @Test
    public void parNegativeCloseBrackTest(){
        String line = "}}";
        assertFalse(ExrBrackets.par(line));
    }
    @Test
    public void parNegativeDiferentOpenBrackTest(){
        String line = "({";
        assertFalse(ExrBrackets.par(line));
    }
    @Test
    public void parNegDifBracketsTest(){
        String line = "(({{)";
        assertFalse(ExrBrackets.par(line));
    }
    @Test
    public void parPosetiveTest(){
        String line = "[{}]";
        assertTrue(ExrBrackets.par(line));
    }
    @Test
    public void parPosetiveTwoBrackTest(){
        String line = "()[]";
        assertTrue(ExrBrackets.par(line));
    }
}