package org.example.service1.DAO;

import org.example.service1.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post,Integer>{


}
