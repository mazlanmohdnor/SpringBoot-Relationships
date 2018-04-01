package com.mazlan.relationship.demo.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer postId;
    private String title;
    private Date postDate;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "post_part_id")
    private PostPart postPart;

    public Post() {
    }

    public Post(String title, Date postDate) {
        this.title = title;
        this.postDate = postDate;
    }

    public Post(String title, Date postDate, PostPart postPart) {
        this.title = title;
        this.postDate = postDate;
        this.postPart = postPart;
    }


    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public PostPart getPostPart() {
        return postPart;
    }

    public void setPostPart(PostPart postPart) {
        this.postPart = postPart;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", title='" + title + '\'' +
                ", postDate=" + postDate +
                ", postPart=" + postPart +
                '}';
    }
}
