package test.developer.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Article {

    private String created_at;
    private String title;
    private String url;
    private String author;
    private String points;
    private String story_text;
    private String comment_text;
    private String num_comments;
    private Long story_id;
    private String story_title;
    private String story_url;
    private Long parent_id;
    private Long created_at_i;
    private List<String> _tags;
    private String objectID;
    private Object _highlightResult;
}