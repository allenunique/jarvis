package com.allen.jarvis.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class LocationInfo {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    /**
     * latitude:[double]         //纬度
     * longitude:[double]      //经度
     * accuracy:[float]           //精度
     * altitude:[double]        //海拔
     * speed:[float]           //速度
     * //getBearing            //方向角
     * country:[String]            //国家
     * province:[String]           //省
     * city:[String]               //城市
     * district:[String]           //城区
     * street:[String]             //街道
     * streetNum:[String]          //街道门牌号
     * buildingId:[String]     //获取当前室内定位的建筑物Id
     * floor:[String]         //获取当前室内定位的楼层
     * address:[String]         //地址描述
     * cityCode:[String]        //城市编码
     * adCode:[String]          //地区编码
     * aoiName:[String]        //获取当前定位点的AOI信息
     * gpsStatus:[int]      //获取GPS的当前状态
     * time:[long]            //定位时间
     * locationType:[int]      //定位类型
     * locationDetail:[String] //定位信息描述
     */
    @Column(nullable = false)
    private Double latitude;
    @Column(nullable = false)
    private Double longitude;
    @Column(nullable = false)
    private Float accuracy;
    private Double altitude;
    private Float speed;
    private String country;
    private String province;
    private String city;
    private String district;
    private String street;
    private String streetNum;
    private String buildingId;
    private String floor;
    private String address;
    private String cityCode;
    private String adCode;
    private String aoiName;
    private Integer gpsStatus;
    private Long time;
    private Integer LocationType;
    private String locationDetail;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="uid")
    private Users users;

    public LocationInfo() {
    }

    public LocationInfo(Double latitude, Double longitude, Float accuracy, Double altitude,
                        Float speed, String country, String province, String city,
                        String district, String street, String streetNum, String buildingId,
                        String floor, String address, String cityCode, String adCode,
                        String aoiName, Integer gpsStatus, Long time, Integer locationType,
                        String locationDetail) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.accuracy = accuracy;
        this.altitude = altitude;
        this.speed = speed;
        this.country = country;
        this.province = province;
        this.city = city;
        this.district = district;
        this.street = street;
        this.streetNum = streetNum;
        this.buildingId = buildingId;
        this.floor = floor;
        this.address = address;
        this.cityCode = cityCode;
        this.adCode = adCode;
        this.aoiName = aoiName;
        this.gpsStatus = gpsStatus;
        this.time = time;
        LocationType = locationType;
        this.locationDetail = locationDetail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Float getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Float accuracy) {
        this.accuracy = accuracy;
    }

    public Double getAltitude() {
        return altitude;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    public Float getSpeed() {
        return speed;
    }

    public void setSpeed(Float speed) {
        this.speed = speed;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNum() {
        return streetNum;
    }

    public void setStreetNum(String streetNum) {
        this.streetNum = streetNum;
    }

    public String getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(String buildingId) {
        this.buildingId = buildingId;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getAdCode() {
        return adCode;
    }

    public void setAdCode(String adCode) {
        this.adCode = adCode;
    }

    public String getAoiName() {
        return aoiName;
    }

    public void setAoiName(String aoiName) {
        this.aoiName = aoiName;
    }

    public Integer getGpsStatus() {
        return gpsStatus;
    }

    public void setGpsStatus(Integer gpsStatus) {
        this.gpsStatus = gpsStatus;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Integer getLocationType() {
        return LocationType;
    }

    public void setLocationType(Integer locationType) {
        LocationType = locationType;
    }

    public String getLocationDetail() {
        return locationDetail;
    }

    public void setLocationDetail(String locationDetail) {
        this.locationDetail = locationDetail;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
