package com.jtspringproject.JtSpringProject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JtSpringProjectApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
        @DisplayName("Should be true")
        void shouldBeTrue() {
            assertTrue(true);
        }

}
