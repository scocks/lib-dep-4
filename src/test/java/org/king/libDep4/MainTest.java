package org.king.libdep4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {    
    @Test
    void testGreet() {
        Library library = new Library();
        String result = library.greet("lib-dep-4");
        assertEquals("greet from libdep4, lib-dep-4!", result);
    }
    @Test
    void testGreet1() {
        Library library = new Library();
        String result = library.greet1("lib-dep-4");
        assertEquals("greet1 from libdep4, lib-dep-4!", result);
    }
    @Test
    void testGreet2() {
        Library library = new Library();
        String result = library.greet2("lib-dep-4");
        assertEquals("greet2 from libdep4, lib-dep-4!", result);
    }
}
