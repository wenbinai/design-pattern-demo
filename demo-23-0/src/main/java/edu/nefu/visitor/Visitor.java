package edu.nefu.visitor;

import edu.nefu.user.impl.Student;
import edu.nefu.user.impl.Teacher;

public interface Visitor {
    // 访问学生信息
    void visit(Student student);

    // 访问老师信息
    void visit(Teacher teacher);
}
