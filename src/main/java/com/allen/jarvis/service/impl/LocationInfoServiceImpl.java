package com.allen.jarvis.service.impl;

import com.allen.jarvis.dao.LocationInfoRepository;
import com.allen.jarvis.entity.LocationInfo;
import com.allen.jarvis.service.LocationInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationInfoServiceImpl implements LocationInfoService{

    @Autowired
    LocationInfoRepository locationInfoRepository;

    @Override
    public LocationInfo save(LocationInfo locationInfo) {
        return locationInfoRepository.save(locationInfo);
    }

//    @Override
//    public List<LocationInfo> getLocationInfoByUserId(String userId) {
//        return locationInfoRepository.(userId);
//    }
}
