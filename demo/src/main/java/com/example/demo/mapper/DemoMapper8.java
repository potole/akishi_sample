package com.example.demo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.example.demo.entity.DemoEntityf_kojin8;

@Mapper
public interface DemoMapper8 {
    List<DemoEntityf_kojin8> getfkojinById(@Param("kojin_no") String kojin_no);
}