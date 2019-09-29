package org.sang.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class ConsumeLogs {
    @Id
    @GeneratedValue
    private Integer Id;
    private String cardNO;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date inTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date outTime;
    private Integer status;
    @ManyToOne(targetEntity = ReadRooms.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "readRoomId",referencedColumnName = "Id")
    private ReadRooms readRooms;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getCardNO() {
        return cardNO;
    }

    public void setCardNO(String cardNO) {
        this.cardNO = cardNO;
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ReadRooms getReadRooms() {
        return readRooms;
    }

    public void setReadRooms(ReadRooms readRooms) {
        this.readRooms = readRooms;
    }
}
