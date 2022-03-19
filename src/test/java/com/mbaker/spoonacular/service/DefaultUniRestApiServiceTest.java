package com.mbaker.spoonacular.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.mbaker.spoonacular.service.impl.DefaultUniRestApiService;

@SpringBootTest
public class DefaultUniRestApiServiceTest {

	@Mock
	private ApiService apiService = new DefaultUniRestApiService();

	//@Test
	public void testHttpGetWithInvalidUrl() throws Exception {
		
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			getApiService().httpGet(null, null);
		});

		assertEquals("url is empty", exception.getMessage());
	}

	protected ApiService getApiService() {
		return apiService;
	}

}
