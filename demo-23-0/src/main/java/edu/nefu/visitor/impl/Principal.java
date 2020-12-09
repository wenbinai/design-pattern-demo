package edu.nefu.visitor.impl;

import edu.nefu.user.impl.Student;
import edu.nefu.user.impl.Teacher;
import edu.nefu.visitor.Visitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Principal implements Visitor {
    private Logger logger = LoggerFactory.getLogger(Principal.class);

    @Override
    public void visit(Student student) {
        logger.info("学生信息 姓名：{} 班级：{}", student.name, student.clazz);

    }

    @Override
    public void visit(Teacher teacher) {
        logger.info("学生信息 姓名：{} 班级：{} 升学率：{}", teacher.name, teacher.clazz, teacher.entranceRatio());

    }
}
