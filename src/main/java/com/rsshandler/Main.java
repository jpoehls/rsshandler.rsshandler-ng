package com.rsshandler;

public class Main {

  public static void main(String[] args) throws Exception {
    PodcastServer server = new PodcastServerImpl();
    Gui gui = new Gui();
    gui.setServer(server);
    gui.createGui();
    gui.startServer();
  }
}