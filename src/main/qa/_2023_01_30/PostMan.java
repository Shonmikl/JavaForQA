package main.qa._2023_01_30;

import java.awt.*;
import java.net.URL;

public class PostMan {
    final static Region region = new Region("1");


    public Post givePost(Post post) {
        print(post);
        return post;
    }

    private static void print(Post post) {
        System.out.println("Post address is: " + post.address);
    }
}

class Post {
    String address;

    public Post(String address) {
        this.address = address;
    }
}

class Main {
    public static void main(String[] args) {
        Post post = new Post("AD");
        PostMan postMan = new PostMan();
        postMan.givePost(post);

        System.out.println(post.address);
    }
}

class Region {
    String region;

    public Region(String region) {
        this.region = region;
    }
}