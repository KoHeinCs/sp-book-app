package com.zawmoehtike.spbookstoreapp.config;

import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.SerializationFeature;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		//WebMvcConfigurer.super.configureMessageConverters(converters);

		Optional<HttpMessageConverter<?>> foudConverter = converters.stream()
				.filter(a -> a instanceof AbstractJackson2HttpMessageConverter).findFirst();
		if (foudConverter.isPresent()) {
			AbstractJackson2HttpMessageConverter converter = (AbstractJackson2HttpMessageConverter) foudConverter.get();
			converter.getObjectMapper().disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
			 converter.getObjectMapper().addMixIn(Object.class,RemoveJsonProperties.class);

		}
	}
}


  @JsonIgnoreProperties({"hibernateLazyInitializer","{}"}) abstract class
  RemoveJsonProperties{};

