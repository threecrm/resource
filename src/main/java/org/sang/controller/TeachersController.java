package org.sang.controller;

import org.sang.dao.SectionsDao;
import org.sang.dao.TeachersDao;
import org.sang.entity.Sections;
import org.sang.entity.Teachers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class TeachersController {
    private TeachersDao teachersDao;
    @Autowired
    private SectionsDao sectionsDao;
    @GetMapping("/getTeachers")
    public List<Teachers> getTeachers(){
       List<Teachers> getTeachers =  teachersDao.findAll();
        return getTeachers;
    }

    @GetMapping("/getSections")
    public List<Sections> getSections(){
        List<Sections> Sections =  sectionsDao.findAll();
        return Sections;
    }
}
