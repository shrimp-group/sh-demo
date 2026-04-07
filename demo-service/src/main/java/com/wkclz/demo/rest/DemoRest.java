package com.wkclz.demo.rest;

import com.wkclz.core.base.PageData;
import com.wkclz.core.base.R;
import com.wkclz.demo.Route;
import com.wkclz.demo.pojo.entity.DemoTypes;
import com.wkclz.demo.service.DemoTypesService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(Route.PREFIX)
@RestController
public class DemoRest {


    @Resource
    private DemoTypesService demoTypesService;

    @GetMapping("/types/page")
    public R typesPage(DemoTypes entity) {
        PageData<DemoTypes> page = demoTypesService.selectPage(entity);
        return R.ok(page);
    }

}
