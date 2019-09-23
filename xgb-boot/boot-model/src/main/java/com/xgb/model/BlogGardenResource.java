package com.xgb.model;

public class BlogGardenResource {
    private String id;

    private String blogGardenId;

    private String content;

    public BlogGardenResource(String id, String blogGardenId, String content) {
        this.id = id;
        this.blogGardenId = blogGardenId;
        this.content = content;
    }

    public BlogGardenResource() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBlogGardenId() {
        return blogGardenId;
    }

    public void setBlogGardenId(String blogGardenId) {
        this.blogGardenId = blogGardenId == null ? null : blogGardenId.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}