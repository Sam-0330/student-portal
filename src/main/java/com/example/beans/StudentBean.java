package com.example.beans;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.example.dao.StudentDAO;
import com.example.model.Student;

@ManagedBean(name = "studentBean")
@SessionScoped
public class StudentBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private Student student = new Student();
    private List<Student> students; // store table data

    private final StudentDAO dao = new StudentDAO();

    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }


    public List<Student> getStudents() {
        if (students == null) {
            students = dao.getAllStudents();
        }
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }


    public String save() {
        dao.saveStudent(student);
        students = null;
        return "confirmation.xhtml?faces-redirect=true";
    }

    public String proceedToDashboard() {
        student = new Student(); 
        students = null;      
        return "dashboard.xhtml?faces-redirect=true";
    }

    public String update(Student s) {
        dao.update(s);
        students = dao.getAllStudents(); 
        return "dashboard.xhtml?faces-redirect=true";
    }

    public String delete(Student s) {
        dao.deleteStudent(s.getId());
        students = dao.getAllStudents(); 
        return "dashboard.xhtml?faces-redirect=true";
    }
}
