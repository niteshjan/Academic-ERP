package com.example.academicerp.controller;

import com.example.academicerp.bean.Students;
import com.example.academicerp.utils.SessionUtil;
import org.hibernate.Session;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("students")
public class StudentsController {
    Students student;

    @POST

    @Path("/retrieve")

    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public Response getStudent(@FormParam("studentId") String studentId){
        Session session = SessionUtil.getSession();
        session.beginTransaction();
        student = session.get(Students.class, studentId);
        return Response.ok().entity(student).build();
    }


}
