package edu.nefu;

import edu.nefu.observe.Subject;
import edu.nefu.observe.factory.SubjectFactory;
import org.junit.Test;

public class SubjectFactoryTest {
    @Test
    public void test_buildQualitySubject() {
        Subject subject = new SubjectFactory().buildQualitySubject();
        subject.notifyObserver();
    }

    @Test
    public void test_buildUnsafeSubject() {
        Subject subject = new SubjectFactory().buildUnsafeSubject();
        subject.notifyObserver();
    }
}
