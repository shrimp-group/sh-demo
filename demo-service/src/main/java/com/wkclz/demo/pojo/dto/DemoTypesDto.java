package com.wkclz.demo.pojo.dto;

import com.wkclz.demo.pojo.entity.DemoTypes;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Description Create by sh-generator
 * @author shrimp
 * @table DemoTypes () 数据库实例扩展，代码重新生成不覆盖
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class DemoTypesDto extends DemoTypes {




    /**
     * entity 转 Dto
     * @param source
     * @return
     */
    public static DemoTypesDto copy(DemoTypes source) {
        DemoTypesDto target = new DemoTypesDto();
        DemoTypes.copy(source, target);
        return target;
    }
}

