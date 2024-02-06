// DemoController6で使用
package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "f_kojin" , schema = "dlgmain")
public class DemoEntityf_kojin6 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long kojin_no;
    
    //それ以外
    private String shimei;

    public Long getKojin_no() {
        return kojin_no;
    }

    public void setKojin_no(Long kojin_no) {
        this.kojin_no = kojin_no;
    }

    public String getShimei() {
        return shimei;
    }

    public void setShimei(String shimei) {
        this.shimei = shimei;
    }
}