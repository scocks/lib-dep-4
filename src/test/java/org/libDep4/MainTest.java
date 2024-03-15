package org.libDep4;

import org.junit.jupiter.api.Test;
import org.libDep4.Library;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    void testCount() {
        Library library = new Library();
        String[] result = library.count(10);
        assertEquals(10, result.length);
        for (int i = 0; i < 10; i++) {
            assertEquals("i = " + i, result[i]);
        }
    }
    @Test
    void testGreet() {
        Library library = new Library();
        String result = library.greet("lib-dep-4");
        assertEquals("Hej, lib-dep-4!", result);
    }
}
