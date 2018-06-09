import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestReverseString {

	@Test
	void test() {
		System.out.println("Testing Reverse String");
		
		assertEquals("dcba",new ReverseString().reverse("abcd"));
		assertEquals("dcba ",new ReverseString().reverse(" abcd"));
	}

}
