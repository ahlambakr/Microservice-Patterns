package org.example.service1.Controller;

import org.example.service1.Service.PostService;
import org.example.service1.model.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class PostController {
    PostService postService;

    public PostController(PostService thePostService) {
   postService = thePostService;
    }

     @GetMapping("/posts")
    public List<Post> getPosts() {
         return  postService.getallPosts();
    }

}