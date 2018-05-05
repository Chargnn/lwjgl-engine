package com.chargnn.entityObject;

import com.chargnn.modelObject.Model;
import org.joml.Vector3f;

public class Entity {

    private Vector3f position;
    private Vector3f rotation;
    private Vector3f scale;

    private Model model;

    public Entity(Model model, Vector3f position, Vector3f rotation, Vector3f scale){
        this.model = model;
        this.position = position;
        this.rotation = rotation;
        this.scale = scale;
    }

    public Model getModel(){
        return model;
    }

    public Vector3f getPosition() {
        return position;
    }

    public Vector3f getRotation() {
        return rotation;
    }

    public Vector3f getScale() {
        return scale;
    }
}
