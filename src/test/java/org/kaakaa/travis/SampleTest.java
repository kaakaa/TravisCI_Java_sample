package org.kaakaa.travis;

import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class SampleTest {
	@Test
	public void Test(){
		// setup
		Sample target = new Sample();

		// when
		String actual = target.hello();

		// then
		assertThat(actual, is("Hello Travis!"));
	}
}
