package com.cis.demosrping.mapper;

import com.cis.demosrping.model.OpinionTask;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OpinionTaskMapper {

    OpinionTask selectOpinionTask(String id);

    List<OpinionTask> selectOpinionAll();
}
