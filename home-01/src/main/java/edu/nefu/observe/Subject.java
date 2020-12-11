package edu.nefu.observe;

import java.util.ArrayList;
import java.util.List;

// 消息源
public class Subject {
    private List<Observer> observers;
    private String desc;

    public Subject(List<Observer> observers, String desc) {
        this.observers = observers;
        this.desc = desc;
    }

    // 增加观察者
    public Subject addObserver(Observer obj) {
        observers.add(obj);
        return this;
    }

    // 删除观察者
    public Subject deleteObserver(Observer obj) {
        observers.remove(obj);
        return this;
    }

    // 通知观察者
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.react(desc);
        }
    }
}
