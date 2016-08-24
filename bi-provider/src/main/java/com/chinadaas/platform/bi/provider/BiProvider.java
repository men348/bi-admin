package com.chinadaas.platform.bi.provider;

import com.chinadaas.platform.bi.client.BiClient;
import com.chinadaas.platform.bi.model.util.EnterpriseUtil;
import com.chinadaas.platform.product.model.provider.ColumnGroup;
import com.chinadaas.platform.product.model.provider.DataProvider;
import com.chinadaas.platform.product.model.provider.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by xie on 16/8/3.
 */

@Component
public class BiProvider implements DataProvider{
    @Autowired
    private BiClient client;

    @Override
    public Product getMetaData() {
        Product product = new Product();
        product.setName(EnterpriseUtil.PRODUCT_NAME);
        product.setCode(EnterpriseUtil.PRODUCT_CODE);
        ColumnGroup group = client.getMetaData(null);
        product.setGroups(group.getSubGroups());
        return product;
    }

    @Override
    public Product getMetaData(List<String> columnIds) {
        Product product = new Product();
        product.setName(EnterpriseUtil.PRODUCT_NAME);
        product.setCode(EnterpriseUtil.PRODUCT_CODE);
        ColumnGroup group = client.getMetaData(columnIds.stream().collect(Collectors.joining(",")));
        product.setGroups(group.getSubGroups());
        return product;
    }

}
