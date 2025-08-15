package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository repo;
    @Autowired
    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public Student getStudentById(int id) {
        return repo.findById(id).orElse(null);
    }

    public Student addStudent(Student student) {
        Optional<Student> exisiting= repo.findByEmail(student.getEmail());

        if(exisiting.isPresent()){

        }
        return repo.save(student);
    }

    @Transactional
    public Student updateStudent(int id, Student updatedStudent) {
        Optional<Student> update= repo.findById(id);

        if(update.isPresent()){
            Student updateS=update.get();
            boolean isUpdateName=!updateS.getName().equals(updatedStudent.getName());
            boolean isUpdateEmail=!updateS.getEmail().equals(updatedStudent.getEmail());

            if(isUpdateEmail || isUpdateName){
                updateS.setEmail(updatedStudent.getEmail());
                updateS.setName(updatedStudent.getName());
                return repo.save(updateS);
            }

        }
        return null;
    }

    public boolean deleteStudent(int id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return true;
        }
        return false;
    }
}
