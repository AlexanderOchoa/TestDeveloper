package test.developer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.developer.entity.Article;
import test.developer.service.ArticleService;
import test.developer.service.impl.ExternalServiceImpl;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/articles")
public class ArticleController {

    private Logger LOGGER = LoggerFactory.getLogger(ArticleController.class);

    private ArticleService articleService;

    @Autowired
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping
    public ResponseEntity<List<Article>> list() {
        LOGGER.info("Start to list");
        List<Article> response = articleService.list();
        LOGGER.info("End to list");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping(value = "/{author}")
    public ResponseEntity<List<Article>> get(@PathVariable String author) {
        LOGGER.info("Start to get: author: {}", author);
        List<Article> response = articleService.get(author);
        LOGGER.info("End to get");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}