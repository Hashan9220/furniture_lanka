package com.furniture_lanka.controller;

import com.furniture_lanka.dto.BedDTO;
import com.furniture_lanka.service.BedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Hashan Saminda <hashansaminda21@gmail.com> (Rdxhashan.tk/)
 */
@RestController
@RequestMapping("/api/v1/bed")
@CrossOrigin("*")
public class BedController {

    @Autowired
    private BedService bedService;

    @PostMapping("/add")
    public String saveBed(@RequestBody BedDTO dto) {


        System.out.println();
        System.out.println();
        System.out.println("Bed DTO : "+ dto);
        System.out.println();
        System.out.println();

        boolean b = bedService.saveBed(dto);
        return "true";
    }

}
