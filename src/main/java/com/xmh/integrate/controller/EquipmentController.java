package com.xmh.integrate.controller;

import com.xmh.integrate.service.EquipmentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：设备信息controller
 *
 * @author xmh
 * @date 2020/12/25 16:56
 */
@RestController("/equipments")
@Api("设备信息Controller")
public class EquipmentController {

    @Autowired
    private EquipmentService equipmentService;

    @ApiOperation("通过id获取设备信息")
    @GetMapping("/{id}")
    public String get(Long id) {
        return this.equipmentService.getById(id);
    }
}
