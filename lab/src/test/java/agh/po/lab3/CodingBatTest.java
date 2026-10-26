package agh.po.lab3;

import static org.junit.Assert.*;
import org.junit.Test;

public class CodingBatTest {

    private final CodingBat cb = new CodingBat();

    @Test
    public void sum13() {
        assertEquals(6, cb.sum13(new int[]{1, 2, 3}));
        assertEquals(3, cb.sum13(new int[]{1, 2, 13}));
        assertEquals(4, cb.sum13(new int[]{1, 2, 13, 2, 1, 13}));
        assertEquals(0, cb.sum13(new int[]{}));
        assertEquals(0, cb.sum13(new int[]{13}));
    }

    @Test
    public void array123() {
        assertTrue(cb.array123(new int[]{1, 1, 2, 3, 1}));
        assertFalse(cb.array123(new int[]{1, 1, 2, 4, 1}));
        assertFalse(cb.array123(new int[]{1, 2}));
        assertFalse(cb.array123(new int[]{}));
        assertTrue(cb.array123(new int[]{1, 1, 2, 3, 1, 4, 5, 6,7}));
        assertFalse(cb.array123(new int[]{1, 1, 2, 4, 1, 7, 8, 9, 12}));
        assertFalse(cb.array123(new int[]{1, 2, 7, 12, 67}));
    }


    @Test
    public void has271() {
        assertTrue(cb.has271(new int[]{1, 2, 7, 1}));
        assertFalse(cb.has271(new int[]{1, 2, 8, 1}));
        assertTrue(cb.has271(new int[]{2, 7, 1}));
        assertTrue(cb.has271(new int[]{3, 8, 2}));
        assertTrue(cb.has271(new int[]{2, 7, 3}));
        assertFalse(cb.has271(new int[]{2, 7, 4}));
        assertTrue(cb.has271(new int[]{2, 7, -1}));
        assertFalse(cb.has271(new int[]{2, 7, -2}));
        assertTrue(cb.has271(new int[]{4, 5, 3, 8, 0}));
        assertTrue(cb.has271(new int[]{2, 7, 5, 10, 4}));
        assertTrue(cb.has271(new int[]{2, 7, -2, 4, 9, 3}));
        assertTrue(cb.has271(new int[]{1, 1, 4, 9, 4, 9, 2}));
        assertFalse(cb.has271(new int[]{}));
        assertFalse(cb.has271(new int[]{2, 7}));
    }

    @Test
    public void helloName() {
        assertEquals("Hello Bob!", cb.helloName("Bob"));
        assertEquals("Hello Alice!", cb.helloName("Alice"));
        assertEquals("Hello X!", cb.helloName("X"));
        assertEquals("Hello !", cb.helloName(""));
        assertEquals("Hello Andrzej!", cb.helloName("Andrzej"));
        assertEquals("Hello Wojciech!", cb.helloName("Wojciech"));
        assertEquals("Hello Jakub!", cb.helloName("Jakub"));
        assertEquals("Hello Kuba!", cb.helloName("Kuba"));
    }

    @Test
    public void firstHalf() {
        assertEquals("Woo", cb.firstHalf("WooHoo"));
        assertEquals("Hello", cb.firstHalf("HelloThere"));
        assertEquals("abc", cb.firstHalf("abcdef"));
        assertEquals("", cb.firstHalf(""));
        assertEquals("a", cb.firstHalf("ab"));
        assertEquals("hey", cb.firstHalf("heyhey"));
        assertEquals("general", cb.firstHalf("generalkenobii"));
        assertEquals("ohCaptain", cb.firstHalf("ohCaptainohCaptain"));
        assertEquals("MyCaptain", cb.firstHalf("MyCaptainMyCaptain"));
        assertEquals("aaaa", cb.firstHalf("aaaaaaaa"));
    }
}