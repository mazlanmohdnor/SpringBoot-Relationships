package com.mazlan.relationship.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "Post_part")
public class PostPart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer postPartId;
    private String body;

    @OneToOne(mappedBy = "postPart")
    private Post post;

    public PostPart() {
    }

    public PostPart(String body) {
        this.body = body;
    }

    public PostPart(String body, Post post) {
        this.body = body;
        this.post = post;
    }

    public Integer getPostPartId() {
        return postPartId;
    }

    public void setPostPartId(Integer postPartId) {
        this.postPartId = postPartId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }


}
