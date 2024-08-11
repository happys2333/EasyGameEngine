package org.happys.engine.model;

public abstract class EGBehaviour {
    /**
     * EG Life cycle
     * Create -> Awake ->       BeforeUpdate
     *                       ↓              ↑
     *                     Update   ->  AfterUpdate -> Remove -> Destroy
     * */

    public boolean create(){
        return true;
    }

    public void awake(){

    }

    public void beforeUpdate(){

    }

    public abstract void update();

    public void afterUpdate(){

    }

    public void remove(){

    }

    public boolean destroy(){
        return true;
    }

}
