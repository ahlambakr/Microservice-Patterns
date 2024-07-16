package org.example.service1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "post")
public class Post {
    @Id
    @Column (name="id")
   private int id;
    @Column (name="user_id")
    private int user_id;
 @Column (name="title")
    private String title ;
 @Column (name="body")
    private String body;
    @Column(name="version")
    private int version;
  public Post () {

  }

    public Post(int id, int user_id, String title, String body, int version) {
        this.id = id;
        this.user_id = user_id;
        this.title = title;
        this.body = body;
        this.version = version;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
    @Override


    public String toString() {
        return "Post{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", version=" + version +
                '}';
    }
}
