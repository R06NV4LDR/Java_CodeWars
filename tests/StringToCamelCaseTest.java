import RankUp._01_StringToCamelCase.MySolution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringToCamelCaseTest {

    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "the_Stealth_Warrior";
        System.out.println("input: " + input);
        assertEquals("theStealthWarrior", MySolution.toCamelCase(input));
    }

    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        System.out.println("input: " + input);
        assertEquals("theStealthWarrior", MySolution.toCamelCase(input));
    }
}