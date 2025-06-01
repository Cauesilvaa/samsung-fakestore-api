package com.example.samsung_fakestore_api.config;

import com.example.samsung_fakestore_api.client.CartClient;
import com.example.samsung_fakestore_api.client.UserClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class ConfigWebClient {

    @Bean
    public HttpServiceProxyFactory httpServiceProxyFactory(){
        WebClient webClient = WebClient.builder().baseUrl("https://fakestoreapi.com").build();
        return HttpServiceProxyFactory.builderFor(WebClientAdapter.create(webClient)).build();
    }

    @Bean
    public UserClient userClient(HttpServiceProxyFactory factory) {
        return factory.createClient(UserClient.class);
    }

    @Bean
    public CartClient cartsClient (HttpServiceProxyFactory factory) {
        return factory.createClient(CartClient.class);
    }

}
