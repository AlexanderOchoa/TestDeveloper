package test.developer.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import test.developer.entity.Article;
import test.developer.response.ExternalResponse;
import test.developer.service.ExternalService;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExternalServiceImpl implements ExternalService {

    private Logger LOGGER = LoggerFactory.getLogger(ExternalServiceImpl.class);

    private RestTemplate restTemplate;

    @Value("${external.url}")
    private String externalUrl;

    @Autowired
    public ExternalServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Article> getData() {
        try {
            String url = externalUrl;

            LOGGER.info("Get comunication (hn.algolia.com): url: {}", url);

            HttpHeaders headers = new HttpHeaders();
            headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
            HttpEntity entity = new HttpEntity<>(headers);

            ResponseEntity<ExternalResponse> responseEntity = restTemplate.exchange(url, HttpMethod.GET, entity, ExternalResponse.class);
            ExternalResponse response = responseEntity.getBody();

            LOGGER.info("Response comunication (hn.algolia.com): {}", response);

            return response.getHits();
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return new ArrayList<>();
        }
    }

}
