package com.mazlan.relationship.demo;

import com.mazlan.relationship.demo.entities.*;
import com.mazlan.relationship.demo.repositories.PostRepository;
import com.mazlan.relationship.demo.repositories.UserRepository;
import com.mazlan.relationship.demo.repositories.WifeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Optional;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class PostTest {

    @Autowired
    PostRepository postRepository;
    @Autowired
    WifeRepository wifeRepository;
    @Autowired
    UserRepository userRepository;

    @Test
    public void testPost() {

        PostPart postPart = new PostPart();
        postPart.setBody("PostPart body 2");

        Post post = new Post();
        post.setTitle("Post Title");
        post.setPostDate(new Date());
        post.setPostPart(postPart);

        Wife wife = new Wife("afiqah", new Husband("mazlan"));

        User user = new User("mazlan", new Vehicle("bbb","moto","kriss"), new Phone("pixel"));

        postRepository.save(post);
        wifeRepository.save(wife);
        userRepository.save(user);

        Optional<Post> dbPost = postRepository.findById(post.getPostId());
        Optional<Wife> wifeDb = wifeRepository.findById(wife.getId());
        Optional<User> userDb = userRepository.findById(user.getUserId());
        assertNotNull(wifeDb);
        assertNotNull(dbPost);
        assertNotNull(userDb);

        System.out.println(dbPost.toString());
        System.out.println(wifeDb.toString());
        System.out.println(userDb.toString());
    }


}
