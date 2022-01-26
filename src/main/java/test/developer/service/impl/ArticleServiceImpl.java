package test.developer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.developer.entity.Article;
import test.developer.service.ArticleService;
import test.developer.service.ExternalService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArticleServiceImpl implements ArticleService {

    private ExternalService externalService;

    @Autowired
    public ArticleServiceImpl(ExternalService externalService) {
        this.externalService = externalService;
    }

    @Override
    public List<Article> list() {
        return externalService.getData();
    }

    @Override
    public List<Article> get(String author) {
        List<Article> list = list();

        return list.stream()
                .filter(a -> a.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }

}
