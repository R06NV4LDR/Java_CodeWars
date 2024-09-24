import RankUp._02_WhoLikesIt.BestPractice;
import RankUp._02_WhoLikesIt.MySolution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WhoLikesItTest {

    @Test
    public void staticTests() {
        assertEquals("no one likes this", MySolution.whoLikesIt());
        assertEquals("Peter likes this", MySolution.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", MySolution.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", MySolution.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", MySolution.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
        assertEquals("no one likes this", BestPractice.whoLikesIt());
        assertEquals("Peter likes this", BestPractice.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", BestPractice.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", BestPractice.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", BestPractice.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}
