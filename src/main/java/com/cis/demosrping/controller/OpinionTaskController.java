package com.cis.demosrping.controller;

import com.cis.demosrping.model.OpinionTask;
import com.cis.demosrping.model.OpinionTaskHospitalResult;
import com.cis.demosrping.service.OpinionTaskService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class OpinionTaskController {
    @Autowired
    private OpinionTaskService service;

    private static final Logger logger = LogManager.getLogger(OpinionTaskController.class);

    @RequestMapping(value = "/selectOpinionTask/{id}",method = RequestMethod.GET)
    public  String selectOpinionTask(@PathVariable String id){
        logger.debug("获取指定opinion：id:" + id);

        return service.selectOpinionTask(id).toString();
    }

    @RequestMapping(value = "/selectOpinionAll", method = RequestMethod.GET)
    public  List<OpinionTaskHospitalResult> selectOpinionAll(){

        logger.debug("获取前十条opinion");
        List<OpinionTaskHospitalResult> tasks = service.selectAllOpinionTask();

        String result ="" ;
        for (OpinionTaskHospitalResult t:tasks) {
            result += t.toString() + "\n";
        }

        System.out.println(result);
        return tasks;
    }
    @RequestMapping(value = "/InsertOpinionTask", method = RequestMethod.POST)
    public void InsertOpinionTask(OpinionTaskHospitalResult task){
        logger.debug("获取指定opinion" + task.toString());

        service.InserOpinionTask(task);
    }

    @RequestMapping(value = "/GetOpinionTaskHospitals", method = RequestMethod.POST)
    public List<OpinionTaskHospitalResult> GetOpinionTaskHospitals(@RequestParam("month")Date month){

        System.out.println("month:" + month);
        List<OpinionTaskHospitalResult> result = service.GetOpinionTaskHospitals(month);

        return  result;
    }
}
