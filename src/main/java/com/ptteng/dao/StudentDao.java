package com.ptteng.dao;

import com.ptteng.entity.Student;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by maweijiang on 2017/3/2.
 */
@Component
public interface StudentDao {
    public List<Student> getAllStudents();//查询所有学生

    public Student findStudentById(int id);//根据ID查询学生

    public List<Student> findAllGoodStudent();//查询所有优秀学生

    public int deleteStudentById();//根据ID删除学生

    public int addStudent(Student stu);//添加学生

    public int updateStudent(Student stu);//更新学生资料
}
