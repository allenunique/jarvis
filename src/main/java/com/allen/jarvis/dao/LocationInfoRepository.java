package com.allen.jarvis.dao;

import com.allen.jarvis.entity.LocationInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationInfoRepository extends JpaRepository<LocationInfo,String> {

//    void save(LocationInfo locationInfo);
}
