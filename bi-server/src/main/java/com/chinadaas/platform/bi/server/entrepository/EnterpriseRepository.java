package com.chinadaas.platform.bi.server.entrepository;


import com.chinadaas.platform.bi.model.domain.JobQuery;

import java.util.List;
import java.util.Map;

/**
 * Created by xie on 16/8/5.
 */
public interface EnterpriseRepository {

    Map<String,List> queryEntList(JobQuery job);

}
