package com.ovsyanka.springbootreactaws;

import com.ovsyanka.springbootreactaws.student.Student;
import com.ovsyanka.springbootreactaws.student.StudentRepository;
import jakarta.servlet.ServletContext;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.ServletContextAware;

import java.util.List;

@AllArgsConstructor
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public void addStudent(Student student) {
        // check if email is taken
        studentRepository.save(student);
    }

    public void deleteStudent(Long studentId) {
        // check if student exists
        studentRepository.deleteById(studentId);
    }

}
