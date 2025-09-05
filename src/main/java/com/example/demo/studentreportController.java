//package com.example.demo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//@Controller
//public class StudentReportController {
//    int sum = 0;
//
//    @GetMapping("/insert")
//    public String insert() {
//        return "studentreportlist";
//    }
//
//    @Autowired
//    StudentReportRepository studentReportRepository;
//
//    public int add(int a, int b, int c, int d, int e, int f) {
//        sum = a + b + c + d + e + f;
//        return sum;
//    }
//
//    public int percent() {
//        return sum / 6;
//    }
//
//    public String grade(int percent) {
//        if (percent >= 33)
//            return "Pass";
//        else
//            return "Fail";
//    }
//
//    @PostMapping("/save")
//    public String saveReport(int id, String name, int hindi, int
//            english, int maths, int science, int arts, int computer) {
//        StudentReport studentReport = new StudentReport();
//        studentReport.setId(id);
//        studentReport.setName(name);
//        studentReport.setHindi(hindi);
//        studentReport.setEnglish(english);
//        studentReport.setMaths(maths);
//        studentReport.setScience(science);
//        studentReport.setArts(arts);
//        studentReport.setComputer(computer);
//
//        studentReport.setTotal(add(hindi, english, maths, science, arts, computer));
//        studentReport.setPercentage(percent());
//        studentReport.setResult(grade(percent()));
//        studentReportRepository.save(studentReport);
//        return "confirmation";
//    }
//}