package com.cis.demosrping.mapper;

import com.cis.demosrping.model.OpinionTask;
import com.cis.demosrping.model.OpinionTaskHospitalResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface OpinionTaskMapper {

    OpinionTaskHospitalResult selectOpinionTask(String id);

    List<OpinionTaskHospitalResult> selectOpinionAll();

    void InsertOpinionTask(OpinionTaskHospitalResult task);

    List<OpinionTaskHospitalResult> GetOpinionTaskHospitals(@Param("hospitalIds")List<String> hospitalIds, @Param("month")String month, @Param("regionMode")boolean regionMode);

}
