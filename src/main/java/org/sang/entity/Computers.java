package org.sang.entity;

import sun.dc.pr.PRError;

import javax.persistence.*;

@Entity
public class Computers {
    @Id
    @GeneratedValue
    private Integer Id;
    private String name;
    private String IP;
    private String remark;
    @ManyToOne(targetEntity = ReadRooms.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "readRoomId",referencedColumnName = "Id")
    private ReadRooms readRooms;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public ReadRooms getReadRooms() {
        return readRooms;
    }

    public void setReadRooms(ReadRooms readRooms) {
        this.readRooms = readRooms;
    }
}
