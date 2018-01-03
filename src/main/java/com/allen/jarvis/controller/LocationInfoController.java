package com.allen.jarvis.controller;

import com.allen.jarvis.entity.LocationInfo;
import com.allen.jarvis.service.LocationInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/locationInfo")
public class LocationInfoController {

    @Autowired
    LocationInfoService locationInfoService;

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public LocationInfo save(@RequestBody LocationInfo locationInfo) {
        return locationInfoService.save(locationInfo);
    }

}
