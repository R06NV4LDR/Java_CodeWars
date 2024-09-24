import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import RankUp._03_JadenCase.MySolution;
import _03_JadenCase.*;

import org.junit.Assert;
import org.junit.Test;


public class JadenCaseTest {


    MySolution jadenCase = new MySolution();

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

