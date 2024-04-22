public interface EventListener {
    public void performEvent();
}

 interface MouseListener extends EventListener {
    public void mouseClicked();
    public void mousePressed();
    public void mouseReleased();
    public void mouseMoved();
    public void mouseDragged();
}

 interface KeyListener extends EventListener {
    public void keyPressed();
    public void keyReleased();
}

 class EventDemo implements MouseListener, KeyListener {
    public void performEvent() {
        System.out.println("Performing event...");
    }

    public void mouseClicked() {
        System.out.println("Mouse clicked.");
    }

    public void mousePressed() {
        System.out.println("Mouse pressed.");
    }

    public void mouseReleased() {
        System.out.println("Mouse released.");
    }

    public void mouseMoved() {
        System.out.println("Mouse moved.");
    }

    public void mouseDragged() {
        System.out.println("Mouse dragged.");
    }

    public void keyPressed() {
        System.out.println("Key pressed.");
    }

    public void keyReleased() {
        System.out.println("Key released.");
    }

    public static void main(String[] args) {
        EventDemo demo = new EventDemo();
        demo.performEvent();
        demo.mouseClicked();
        demo.mousePressed();
        demo.mouseReleased();
        demo.mouseMoved();
        demo.mouseDragged();
        demo.keyPressed();
        demo.keyReleased();
    }
}