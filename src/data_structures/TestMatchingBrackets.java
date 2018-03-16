package data_structures;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i<b.length(); i++) {
			
			stack.push(b.charAt(i));
		}
		int i = 0;
		int j = 0;
		for(int l = 0; l<stack.size(); l++) {
			if(stack.get(l) ==('{')) {
				i+=1;
				if(l == stack.size()-1) {
					return false;
				}
				else {
					for(int m = l+1; m<stack.size(); m++)
					if(stack.get(m) == ('}')) {
						j+=1;
						stack.remove(m);
						m = stack.size();
					}
				}
			}
		}
		
		if(i==j) {
			return true;
		}
		return false;
	}

}