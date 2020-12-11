package edu.nefu.observe;

public interface Observer {
    // 收到消息做出的反应
    void react(String desc);
}
