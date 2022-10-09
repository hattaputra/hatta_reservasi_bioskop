package org.binar.kampusmerdeka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class FileController {

    @GetMapping("/generatePdf")
    public void generatePdf(HttpServletResponse response,
                            @RequestParam(value = "filename") String filename){

    }
}
