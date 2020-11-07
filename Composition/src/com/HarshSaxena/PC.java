package com.HarshSaxena;

public class PC {
    private Motherboard motherboard;
    private Monitor monitor;
    private Case theCase;

    public PC(Motherboard motherboard, Monitor monitor, Case theCase) {
        this.motherboard = motherboard;
        this.monitor = monitor;
        this.theCase = theCase;
    }

    public void powerUp(){
       theCase.pressPowerbutton();
        drawLogo();
    }
    public void drawLogo(){
        monitor.drawPixelAt(1200, 750, "Green");
    }

}
