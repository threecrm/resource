package org.sang.entity;

import javax.persistence.*;

@Entity
public class Statistics {
    @Id
    @GeneratedValue
    private Integer Id;
    private Integer peopleNums;
    private String year;
    private String month;
    private String day;
    @ManyToOne(targetEntity = ReadRooms.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "readRoomId",referencedColumnName = "Id")
    private ReadRooms readRooms;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getPeopleNums() {
        return peopleNums;
    }

    public void setPeopleNums(Integer peopleNums) {
        this.peopleNums = peopleNums;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public ReadRooms getReadRooms() {
        return readRooms;
    }

    public void setReadRooms(ReadRooms readRooms) {
        this.readRooms = readRooms;
    }
}
