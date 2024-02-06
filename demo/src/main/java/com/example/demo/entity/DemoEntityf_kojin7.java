// DemoController7で使用
package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "f_kojin" , schema = "dlgmain")
public class DemoEntityf_kojin7 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kojin_no")
    public String kojinNo;
    public String shimei;

}