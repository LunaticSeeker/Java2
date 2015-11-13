package com.jmk.facade;

public class DvdPlayer {

	private String description;
    private Amplifier amplifier;
    private String movie;
	
    public DvdPlayer(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }
    
    public void on() {
        System.out.println(description + " on");
    }
    
    public void off() {
        System.out.println(description + " off");
    }
    
    public void eject() {
        movie = null;
        System.out.println(description + " eject");
    }
    
    public void play(String movie) {
        this.movie = movie;
        System.out.println(description + " playing \"" + movie + "\"");
    }
    
    public void stop() {
        System.out.println(description + " stopped \"" + movie + "\"");
    }
    
    public String toString() {
        return description;
    }
    
}
