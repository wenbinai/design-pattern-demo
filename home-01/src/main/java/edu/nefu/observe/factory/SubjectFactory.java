package edu.nefu.observe.factory;

import edu.nefu.observe.Observer;
import edu.nefu.observe.Subject;
import edu.nefu.observe.impl.Superviser;
import edu.nefu.observe.impl.Worker;

import java.util.ArrayList;
import java.util.List;

/**
 * 消息源封装工厂
 */
public class SubjectFactory {
    private List<Observer> observers = new ArrayList<>();

    /**
     * 出现质量问题消息源
     */
    public Subject buildQualitySubject() {
        return new Subject(new ArrayList<>(), "质量问题")
                .addObserver(new Worker())
                .addObserver(new Superviser());
    }

    /**
     * 出现安全问题的消息源
     */
    public Subject buildUnsafeSubject() {
        return new Subject(new ArrayList<>(), "安全问题")
                .addObserver(new Worker())
                .addObserver(new Superviser());
    }
}
