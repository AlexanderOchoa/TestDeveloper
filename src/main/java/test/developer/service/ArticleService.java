package test.developer.service;

import test.developer.entity.Article;

import java.util.List;

public interface ArticleService {
    List<Article> list();
    List<Article> get(String author);
}
