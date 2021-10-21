package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PostService {
    public ArrayList<Post> listAllPosts(){
        ArrayList<Post> posts = new ArrayList<Post>();
        posts.add(new Post("Первый пост"));
        posts.add(new Post("Второй пост"));
        posts.add(new Post("Третий пост"));
        return posts;
    }
}
