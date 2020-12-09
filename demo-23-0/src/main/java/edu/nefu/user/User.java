package edu.nefu.user;

import edu.nefu.visitor.Visitor;

public abstract class User {
    public String name;
    public String identify;
    public String clazz;

    public User(String name, String identify, String clazz) {
        this.name = name;
        this.identify = identify;
        this.clazz = clazz;
    }

    public abstract void accept(Visitor visitor);
}
