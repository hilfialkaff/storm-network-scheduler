package jvm.storm;

import java.util.List;

public class Link {
    private float delay;
    private float bandwidth;
    private float lossRate;
    private List<Node> nodes;
    
    public Link(float delay, float bandwidth, float lossRate) {
        this.setDelay(delay);
        this.setBandwidth(bandwidth);
        this.setLossRate(lossRate);
    }

    public void addNode(Node node) {
        nodes.add(node);
    }
    
    public float getLossRate() {
        return lossRate;
    }

    public void setLossRate(float lossRate) {
        this.lossRate = lossRate;
    }

    public float getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(float bandwidth) {
        this.bandwidth = bandwidth;
    }

    public float getDelay() {
        return delay;
    }

    public void setDelay(float delay) {
        this.delay = delay;
    }
}
