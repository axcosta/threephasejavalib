package org.threephasejavalib;

/**
 * Created by axcos on 04/02/2017.
 */
public class Simulation {
    private String state = "idle";
    public void run() {
        this.state = "running";
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
