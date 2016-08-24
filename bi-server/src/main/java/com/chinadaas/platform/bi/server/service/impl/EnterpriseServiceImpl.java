package com.chinadaas.platform.bi.server.service.impl;

import com.chinadaas.platform.bi.model.domain.JobQuery;
import com.chinadaas.platform.bi.server.entrepository.EnterpriseRepository;
import com.chinadaas.platform.bi.server.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by xie on 16/8/5.
 */
@Service
public class EnterpriseServiceImpl implements EnterpriseService {
    @Autowired
    private EnterpriseRepository repository;

    @Override
    public Map<String,List> queryEntList(JobQuery job) {
        return repository.queryEntList(job);
    }


}
