package com.cis.demosrping.service;

import com.cis.demosrping.mapper.OpinionTaskMapper;
import com.cis.demosrping.model.OpinionTask;
import com.cis.demosrping.model.OpinionTaskHospitalResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class OpinionTaskService {

    @Autowired
    private OpinionTaskMapper taskMapper;

    public OpinionTaskHospitalResult selectOpinionTask(String id){

        return taskMapper.selectOpinionTask(id);
    }

    public List<OpinionTaskHospitalResult> selectAllOpinionTask(){

        return taskMapper.selectOpinionAll();
    }

    public void InserOpinionTask(OpinionTaskHospitalResult task)
    {
        taskMapper.InsertOpinionTask(task);
    }

    public List<OpinionTaskHospitalResult> GetOpinionTaskHospitals(Date month){
        List<String> hospitalIds = new ArrayList<String>();
        hospitalIds.add("1001");
        hospitalIds.add("1002");
        hospitalIds.add("1101");
        hospitalIds.add("1102");

        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMM");

        List<OpinionTaskHospitalResult> result = taskMapper.GetOpinionTaskHospitals(hospitalIds, formatter.format(month), true);

        return result;
    }
}


