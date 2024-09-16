import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import _03_JadenCase.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class JadenCaseTest {


    _03_JadenCase.MySolution jadenCase = new _03_JadenCase.MySolution();

    @Test
    public void test() {
        Assert.assertEquals("toJadenCase doesn't return a valide JadenCase String! try again please :)", "Most Trees Are Blue", MySolution.toJadenCase("most trees are blue"));
    }

    @Test
    public void testNullArg() {
        assertNull(null);
    }

    @Test
    public void testEmptyArg() {
        assertNull("Must return null when the arg is empty string", MySolution.toJadenCase(""));
    }

}

