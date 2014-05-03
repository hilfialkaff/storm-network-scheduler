package jvm.storm;

import java.util.List;

import sun.awt.image.ImageWatched.Link;

public class Node {
    private List<Link> links;
    private String name;
    
    public Node(String name) {
        this.setName(name);
    }
    
    public void addLink(Link link) {
        links.add(link);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
