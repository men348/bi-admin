package com.chinadaas.platform.bi.client;

import com.chinadaas.platform.bi.model.domain.JobQuery;
import com.chinadaas.platform.product.model.provider.ColumnGroup;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by xie on 16/8/3.
 */
@FeignClient("Bi-Server")
public interface BiClient {

    @RequestMapping(value = "/bi/metadata", method = RequestMethod.GET)
    ColumnGroup getMetaData(@RequestParam(value = "columnIds", required = false)String columnIds);


}
