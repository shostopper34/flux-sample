package com.ss.flux.data.api.dto;

import java.util.List;

/**
 * Article dto used in the data layer.
 */
public class Article {

    String rendered_body;

    String body;

    boolean coediting;

    String created_at;

    String group;

    String id;
    
    List<Tag> tags;

    String title;

    String updated_at;

    String url;

    User user;

}
