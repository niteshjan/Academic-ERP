package com.example.academicerp.controller;

import com.example.academicerp.bean.Students;
import com.example.academicerp.utils.SessionUtil;
import org.hibernate.Session;

public class HibernateTest {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Students student = new Students();
        student.setStudentId(1);
        student.setEmail("niteshjain9977@gmail.com");
        student.setFirstName("Nitesh");
        student.setGraduationYear(2020);
        student.setLastName("Jain");
        student.setRollNumber("MT2020118");
        Session session = SessionUtil.getSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
    }
}
