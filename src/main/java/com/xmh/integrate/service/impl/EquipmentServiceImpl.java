package com.xmh.integrate.service.impl;

import com.alibaba.fastjson.JSON;
import com.xmh.integrate.entity.Equipment;
import com.xmh.integrate.service.EquipmentService;
import org.springframework.stereotype.Service;

/**
 * 描述：
 *
 * @author xuminghao
 * @date 2020/12/25 17:13
 */
@Service
public class EquipmentServiceImpl implements EquipmentService {

    @Override
    public String getById(Long id) {
        return JSON.toJSONString(new Equipment());
    }

}
