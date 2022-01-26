package test.developer.response;

import lombok.Getter;
import lombok.Setter;
import test.developer.entity.Article;

import java.util.List;

@Getter
@Setter
public class ExternalResponse {

    private List<Article> hits;
}
