package PrototypeAndRegistry;

import java.util.HashMap;

public class StudentRegistry {

    private HashMap<String,Prototype<Student>> registry;

    public StudentRegistry() {
        this.registry = new HashMap<>();
    }

    public Prototype<Student> set(String prototypeName, Prototype<Student> prototype){
        registry.put(prototypeName,prototype);
        return prototype;
    }

    public Prototype<Student> get(String prototypeName){
        return registry.get(prototypeName);
    }

}
