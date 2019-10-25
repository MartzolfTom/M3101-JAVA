
package structures;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class HeapSortTest {
	
	@Test
	public void Test() {
		
		Double[] array = {1.0, 8.0, 5.0,18.0,0.0};
		Double[] res = {0.0,1.0, 5.0, 8.0,18.0};
		
		assertArrayEquals(HeapSort.sort(array),res);
		
	}

}
