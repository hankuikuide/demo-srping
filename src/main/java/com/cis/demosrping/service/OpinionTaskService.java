package com.cis.demosrping.service;

import com.cis.demosrping.mapper.OpinionTaskMapper;
import com.cis.demosrping.model.OpinionTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpinionTaskService {

    @Autowired
    private OpinionTaskMapper taskMapper;

    public OpinionTask selectOpinionTask(String id){

        return taskMapper.selectOpinionTask(id);
    }

    public List<OpinionTask> selectAllOpinionTask(){

        return taskMapper.selectOpinionAll();
    }

    public void InserOpinionTask(OpinionTask task)
    {
        taskMapper.InsertOpinionTask(task);
    }
}


