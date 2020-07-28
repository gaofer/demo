package com.example.demo.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName ElasticsearchConfig
 * @Description //TODO
 * @Author Ray
 * @Date 2020/7/24 16:22
 * @Version 1.0
 **/
@Configuration
public class ElasticSearchClientConfig {
    @Bean
    public RestClient restClient() {
        RestClient restClient = RestClient.builder(new HttpHost("localhost", 9200, "http")).build();
        return restClient;
    }
}
