package org.sang.entity;

import javax.persistence.*;
@Entity
public class Teachers {
    @Id
    @GeneratedValue
    private Integer ID;
    private String cardNO;
    private String name;
    private char sex;
    private String status;
    private String remark;
    @ManyToOne(targetEntity = Sections.class,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "sectionID",referencedColumnName = "ID")
    private Sections Sections;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getCardNO() {
        return cardNO;
    }

    public void setCardNO(String cardNO) {
        this.cardNO = cardNO;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public org.sang.entity.Sections getSections() {
        return Sections;
    }

    public void setSections(org.sang.entity.Sections sections) {
        Sections = sections;
    }
}
