package com.skyline.collegecompare.controller;

import com.skyline.collegecompare.service.ICollegeInfoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * [FEATURE INFO]<br/>
 * college info controller
 *
 * @author Skyline
 * @create 2022/7/2 16:17
 * @since 1.0.0
 */
@Api
@RestController
public class CollegeInfoController {

    private ICollegeInfoService collegeInfoService;

    @Autowired
    public void setCollegeInfoService(ICollegeInfoService collegeInfoService) {
        this.collegeInfoService = collegeInfoService;
    }
}
