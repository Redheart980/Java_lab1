package com.example.demo;

import com.example.demoweb.model.Post;
import com.example.demoweb.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class PostsViewController {

    //@Autowired
    public PostService postsService;

    @ResponseBody
    @RequestMapping(path = "/post/{id}", method = RequestMethod.GET)
    public String single(@PathVariable("id") Long id) {
        return "Здесь будет страница поста №" + id;

    }

    @ResponseBody
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String list(Model model) {
        //ArrayList<Post> posts = postsService.listAllPosts();
        model.addAttribute("appName", "Сентябрь горит");
        //model.addAttribute("Пост номер один", posts.get(0));
        //model.addAttribute("Пост номер два", posts.get(1));
        //model.addAttribute("Пост номер три", posts.get(2));
        return "Моё супер приложение";
    }

}
