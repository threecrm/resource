package org.sang.entity;

import javax.persistence.*;

@Entity
public class Students {
    @Id
    @GeneratedValue
    private Integer Id;
    private String cardNo;
    private String name;
    private char sex;
    private String status;
    private String stuNO;
    private String remark;
    @ManyToOne(targetEntity = Memberships.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "membershipId",referencedColumnName = "ID")
    private Memberships memberships;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStuNO() {
        return stuNO;
    }

    public void setStuNO(String stuNO) {
        this.stuNO = stuNO;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Memberships getMemberships() {
        return memberships;
    }

    public void setMemberships(Memberships memberships) {
        this.memberships = memberships;
    }
}
