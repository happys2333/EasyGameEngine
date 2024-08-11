package org.happys.engine.model;

public class Camera {
    private EGVector position;
    private int viewWidth;
    private int viewHeight;

    // p-w, p+w  p-h, p+h
    private int[][] viewRange;

    public Camera(EGVector position, int viewWidth, int viewHeight) {
        this.position = position;
        this.viewWidth = viewWidth;
        this.viewHeight = viewHeight;
        viewRange = new int[2][2];
        updateRange();
    }

    private void updateRange(){
        viewRange[0][0] = position.getX() - viewWidth;
        viewRange[0][1] = position.getX() + viewWidth;
        viewRange[1][0] = position.getY() - viewHeight;
        viewRange[1][1] = position.getY() + viewHeight;
    }

    public int[][] getViewRange() {
        return viewRange;
    }

    public void transform(EGVector newPos){
        position = newPos;
        updateRange();
    }
}
