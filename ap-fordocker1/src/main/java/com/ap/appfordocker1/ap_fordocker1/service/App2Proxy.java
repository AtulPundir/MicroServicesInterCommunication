package com.ap.appfordocker1.ap_fordocker1.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class App2Proxy {

    private final WebClient webClient;

    public App2Proxy(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://localhost:8082").build();
    }

    public String callAPP2() {
        return webClient.get()
                .uri("/app2/getApp2")
                .retrieve()
                .bodyToMono(String.class)
                .block(); // Blocking call for synchronous execution
    }

   /*

    private final WebClient webClient = WebClient.create();
     private final WebClient webClient;
    
    public String callOtherService() {
        return webClient.get()
                .uri("http://localhost:8081/api/other-endpoint")
                .retrieve()
                .bodyToMono(String.class)
                .block(); // Blocking call, use `block()` only for synchronous execution
    }*/

}
