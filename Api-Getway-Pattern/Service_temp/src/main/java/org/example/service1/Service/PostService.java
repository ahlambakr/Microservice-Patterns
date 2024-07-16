package org.example.service1.Service;

import org.example.service1.DAO.PostRepo;
import org.example.service1.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private PostRepo postRepo ;
@Autowired
   public PostService (PostRepo thePostRepo){
       postRepo = thePostRepo ;
   }
   public List<Post> getallPosts(){
    return postRepo.findAll() ;
   }
   public Optional<Post> getPost (int id){
    return postRepo.findById(id);}
   public void savePost (Post thePost){
    postRepo.save(thePost);
   }


}
