package com.wkclz.demo.rest.demo;

import com.wkclz.core.base.PageData;
import com.wkclz.core.base.R;
import com.wkclz.core.enums.ResultCode;
import com.wkclz.demo.pojo.entity.DemoTypes;
import com.wkclz.demo.service.DemoTypesService;
import jakarta.annotation.Resource;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Description Create by sh-generator
 * @author shrimp
 * @table demo_types (demo-全类型) 示例rest 接口，代码重新生成会覆盖
 */
// @RestController
public class DemoTypesRest {

    @Resource
    private DemoTypesService demoTypesService;

    /**
     * @api {get} /demo/types/page 1. demo-全类型-获取分页
     * @apiGroup DEMO_TYPES
     *
     * @apiVersion 0.0.1
     * @apiDescription demo-全类型-获取分页
     *
     * @apiParam {Integer} [typeInt] <code>param</code>type_int
     * @apiParam {Long} [typeBigint] <code>param</code>type_bigint
     * @apiParam {byte[]} [typeBinary] <code>param</code>type_binary
     * @apiParam {Boolean} [typeBit] <code>param</code>type_bit
     * @apiParam {byte[]} [typeBlob] <code>param</code>type_blob
     * @apiParam {String} [typeChar] <code>param</code>type_char
     * @apiParam {LocalDateTime} [typeDate] <code>param</code>type_date
     * @apiParam {LocalDateTime} [typeDatetime] <code>param</code>type_datetime
     * @apiParam {BigDecimal} [typeDecimal] <code>param</code>type_decimal
     * @apiParam {Double} [typeDouble] <code>param</code>type_double
     * @apiParam {Float} [typeFloat] <code>param</code>type_float
     * @apiParam {byte[]} [typeGeometry] <code>param</code>type_geometry
     * @apiParam {Integer} [typeInteger] <code>param</code>type_integer
     * @apiParam {Object} [typeLinestring] <code>param</code>type_linestring
     * @apiParam {byte[]} [typeLongblob] <code>param</code>type_longblob
     * @apiParam {byte[]} [typeMediumblob] <code>param</code>type_mediumblob
     * @apiParam {Integer} [typeMediumint] <code>param</code>type_mediumint
     * @apiParam {Object} [typeMultilinestring] <code>param</code>type_multilinestring
     * @apiParam {Object} [typeMultipoint] <code>param</code>type_multipoint
     * @apiParam {Object} [typeMultipolygon] <code>param</code>type_multipolygon
     * @apiParam {BigDecimal} [typeNumeric] <code>param</code>type_numeric
     * @apiParam {Object} [typePoint] <code>param</code>type_point
     * @apiParam {Object} [typePolygon] <code>param</code>type_polygon
     * @apiParam {Double} [typeReal] <code>param</code>type_real
     * @apiParam {LocalDateTime} [typeTime] <code>param</code>type_time
     * @apiParam {LocalDateTime} [typeTimestamp] <code>param</code>type_timestamp
     * @apiParam {byte[]} [typeTinyblob] <code>param</code>type_tinyblob
     * @apiParam {Integer} [typeTinyint] <code>param</code>type_tinyint
     * @apiParam {byte[]} [typeVarbinary] <code>param</code>type_varbinary
     * @apiParam {String} [typeVarchar] <code>param</code>type_varchar
     * @apiParam {LocalDateTime} [typeYear] <code>param</code>type_year
     *
     * @apiParamExample {param} 请求样例:
     * ?id=1
     *
     * @apiSuccess {Long} [id] ID
     * @apiSuccess {Integer} [typeInt] type_int
     * @apiSuccess {Long} [typeBigint] type_bigint
     * @apiSuccess {byte[]} [typeBinary] type_binary
     * @apiSuccess {Boolean} [typeBit] type_bit
     * @apiSuccess {byte[]} [typeBlob] type_blob
     * @apiSuccess {String} [typeChar] type_char
     * @apiSuccess {LocalDateTime} [typeDate] type_date
     * @apiSuccess {LocalDateTime} [typeDatetime] type_datetime
     * @apiSuccess {BigDecimal} [typeDecimal] type_decimal
     * @apiSuccess {Double} [typeDouble] type_double
     * @apiSuccess {Float} [typeFloat] type_float
     * @apiSuccess {byte[]} [typeGeometry] type_geometry
     * @apiSuccess {Integer} [typeInteger] type_integer
     * @apiSuccess {Object} [typeLinestring] type_linestring
     * @apiSuccess {byte[]} [typeLongblob] type_longblob
     * @apiSuccess {byte[]} [typeMediumblob] type_mediumblob
     * @apiSuccess {Integer} [typeMediumint] type_mediumint
     * @apiSuccess {Object} [typeMultilinestring] type_multilinestring
     * @apiSuccess {Object} [typeMultipoint] type_multipoint
     * @apiSuccess {Object} [typeMultipolygon] type_multipolygon
     * @apiSuccess {BigDecimal} [typeNumeric] type_numeric
     * @apiSuccess {Object} [typePoint] type_point
     * @apiSuccess {Object} [typePolygon] type_polygon
     * @apiSuccess {Double} [typeReal] type_real
     * @apiSuccess {LocalDateTime} [typeTime] type_time
     * @apiSuccess {LocalDateTime} [typeTimestamp] type_timestamp
     * @apiSuccess {byte[]} [typeTinyblob] type_tinyblob
     * @apiSuccess {Integer} [typeTinyint] type_tinyint
     * @apiSuccess {byte[]} [typeVarbinary] type_varbinary
     * @apiSuccess {String} [typeVarchar] type_varchar
     * @apiSuccess {LocalDateTime} [typeYear] type_year
     * @apiSuccess {Integer} [sort] 排序
     * @apiSuccess {LocalDateTime} [createTime] 创建时间
     * @apiSuccess {String} [createBy] 创建人
     * @apiSuccess {LocalDateTime} [updateTime] 更新时间
     * @apiSuccess {String} [updateBy] 更新人
     * @apiSuccess {String} [remark] 备注
     * @apiSuccess {Integer} [version] 版本号
     *
     * @apiSuccessExample {json} 返回样例:
     * {
     *     "code": 1,
     *     "data": {
     *         "rows": [
     *             {
     *                 "id": "id",
     *                 "typeInt": "typeInt",
     *                 "typeBigint": "typeBigint",
     *                 "typeBinary": "typeBinary",
     *                 "typeBit": "typeBit",
     *                 "typeBlob": "typeBlob",
     *                 "typeChar": "typeChar",
     *                 "typeDate": "typeDate",
     *                 "typeDatetime": "typeDatetime",
     *                 "typeDecimal": "typeDecimal",
     *                 "typeDouble": "typeDouble",
     *                 "typeFloat": "typeFloat",
     *                 "typeGeometry": "typeGeometry",
     *                 "typeInteger": "typeInteger",
     *                 "typeLinestring": "typeLinestring",
     *                 "typeLongblob": "typeLongblob",
     *                 "typeMediumblob": "typeMediumblob",
     *                 "typeMediumint": "typeMediumint",
     *                 "typeMultilinestring": "typeMultilinestring",
     *                 "typeMultipoint": "typeMultipoint",
     *                 "typeMultipolygon": "typeMultipolygon",
     *                 "typeNumeric": "typeNumeric",
     *                 "typePoint": "typePoint",
     *                 "typePolygon": "typePolygon",
     *                 "typeReal": "typeReal",
     *                 "typeTime": "typeTime",
     *                 "typeTimestamp": "typeTimestamp",
     *                 "typeTinyblob": "typeTinyblob",
     *                 "typeTinyint": "typeTinyint",
     *                 "typeVarbinary": "typeVarbinary",
     *                 "typeVarchar": "typeVarchar",
     *                 "typeYear": "typeYear",
     *                 "sort": "sort",
     *                 "createTime": "createTime",
     *                 "createBy": "createBy",
     *                 "updateTime": "updateTime",
     *                 "updateBy": "updateBy",
     *                 "remark": "remark",
     *                 "version": "version",
     *             },
     *             ...
     *         ],
     *         "current": 1,
     *         "size": 10,
     *         "total": 1,
     *         "page": 1,
     *     }
     * }
     *
     */
    @GetMapping("/demo/types/page")
    public R demoTypesServicePage(DemoTypes entity) {
        PageData<DemoTypes> page = demoTypesService.selectPage(entity);
        return R.ok(page);
    }

    /**
     * @api {get} /demo/types/info 2. demo-全类型-获取详情
     * @apiGroup DEMO_TYPES
     *
     * @apiVersion 0.0.1
     * @apiDescription demo-全类型-获取详情
     *
     * @apiParam {Long} id <code>param</code>数据id
     *
     * @apiParamExample {param} 请求样例:
     * ?id=1
     *
     * @apiSuccess {Long} [id] ID
     * @apiSuccess {Integer} [typeInt] type_int
     * @apiSuccess {Long} [typeBigint] type_bigint
     * @apiSuccess {byte[]} [typeBinary] type_binary
     * @apiSuccess {Boolean} [typeBit] type_bit
     * @apiSuccess {byte[]} [typeBlob] type_blob
     * @apiSuccess {String} [typeChar] type_char
     * @apiSuccess {LocalDateTime} [typeDate] type_date
     * @apiSuccess {LocalDateTime} [typeDatetime] type_datetime
     * @apiSuccess {BigDecimal} [typeDecimal] type_decimal
     * @apiSuccess {Double} [typeDouble] type_double
     * @apiSuccess {Float} [typeFloat] type_float
     * @apiSuccess {byte[]} [typeGeometry] type_geometry
     * @apiSuccess {String} [typeGeometrycollection] type_geometrycollection
     * @apiSuccess {Integer} [typeInteger] type_integer
     * @apiSuccess {String} [typeJson] type_json [MBG不支持JSON]
     * @apiSuccess {Object} [typeLinestring] type_linestring
     * @apiSuccess {byte[]} [typeLongblob] type_longblob
     * @apiSuccess {String} [typeLongtext] type_longtext
     * @apiSuccess {byte[]} [typeMediumblob] type_mediumblob
     * @apiSuccess {Integer} [typeMediumint] type_mediumint
     * @apiSuccess {String} [typeMediumtext] type_mediumtext
     * @apiSuccess {Object} [typeMultilinestring] type_multilinestring
     * @apiSuccess {Object} [typeMultipoint] type_multipoint
     * @apiSuccess {Object} [typeMultipolygon] type_multipolygon
     * @apiSuccess {BigDecimal} [typeNumeric] type_numeric
     * @apiSuccess {Object} [typePoint] type_point
     * @apiSuccess {Object} [typePolygon] type_polygon
     * @apiSuccess {Double} [typeReal] type_real
     * @apiSuccess {String} [typeText] type_text
     * @apiSuccess {LocalDateTime} [typeTime] type_time
     * @apiSuccess {LocalDateTime} [typeTimestamp] type_timestamp
     * @apiSuccess {byte[]} [typeTinyblob] type_tinyblob
     * @apiSuccess {Integer} [typeTinyint] type_tinyint
     * @apiSuccess {String} [typeTinytext] type_tinytext
     * @apiSuccess {byte[]} [typeVarbinary] type_varbinary
     * @apiSuccess {String} [typeVarchar] type_varchar
     * @apiSuccess {LocalDateTime} [typeYear] type_year
     * @apiSuccess {Integer} [sort] 排序
     * @apiSuccess {LocalDateTime} [createTime] 创建时间
     * @apiSuccess {String} [createBy] 创建人
     * @apiSuccess {LocalDateTime} [updateTime] 更新时间
     * @apiSuccess {String} [updateBy] 更新人
     * @apiSuccess {String} [remark] 备注
     * @apiSuccess {Integer} [version] 版本号
     *
     * @apiSuccessExample {json} 返回样例:
     * {
     *     "code": 1,
     *     "data": {
     *          "id": "id",
     *          "typeInt": "typeInt",
     *          "typeBigint": "typeBigint",
     *          "typeBinary": "typeBinary",
     *          "typeBit": "typeBit",
     *          "typeBlob": "typeBlob",
     *          "typeChar": "typeChar",
     *          "typeDate": "typeDate",
     *          "typeDatetime": "typeDatetime",
     *          "typeDecimal": "typeDecimal",
     *          "typeDouble": "typeDouble",
     *          "typeFloat": "typeFloat",
     *          "typeGeometry": "typeGeometry",
     *          "typeGeometrycollection": "typeGeometrycollection",
     *          "typeInteger": "typeInteger",
     *          "typeJson": "typeJson",
     *          "typeLinestring": "typeLinestring",
     *          "typeLongblob": "typeLongblob",
     *          "typeLongtext": "typeLongtext",
     *          "typeMediumblob": "typeMediumblob",
     *          "typeMediumint": "typeMediumint",
     *          "typeMediumtext": "typeMediumtext",
     *          "typeMultilinestring": "typeMultilinestring",
     *          "typeMultipoint": "typeMultipoint",
     *          "typeMultipolygon": "typeMultipolygon",
     *          "typeNumeric": "typeNumeric",
     *          "typePoint": "typePoint",
     *          "typePolygon": "typePolygon",
     *          "typeReal": "typeReal",
     *          "typeText": "typeText",
     *          "typeTime": "typeTime",
     *          "typeTimestamp": "typeTimestamp",
     *          "typeTinyblob": "typeTinyblob",
     *          "typeTinyint": "typeTinyint",
     *          "typeTinytext": "typeTinytext",
     *          "typeVarbinary": "typeVarbinary",
     *          "typeVarchar": "typeVarchar",
     *          "typeYear": "typeYear",
     *          "sort": "sort",
     *          "createTime": "createTime",
     *          "createBy": "createBy",
     *          "updateTime": "updateTime",
     *          "updateBy": "updateBy",
     *          "remark": "remark",
     *          "version": "version",
     *     }
     * }
     *
     */
    @GetMapping("/demo/types/info")
    public R demoTypesServiceInfo(DemoTypes entity) {
        Assert.notNull(entity.getId(), ResultCode.PARAM_NO_ID.getMessage());
        entity = demoTypesService.selectById(entity.getId());
        return R.ok(entity);
    }

    /**
     * @api {post} /demo/types/create 3. demo-全类型-创建
     * @apiGroup DEMO_TYPES
     *
     * @apiVersion 0.0.1
     * @apiDescription demo-全类型-新增信息
     *
     * @apiParam {Integer} [typeInt] <code>body</code>type_int
     * @apiParam {Long} [typeBigint] <code>body</code>type_bigint
     * @apiParam {byte[]} [typeBinary] <code>body</code>type_binary
     * @apiParam {Boolean} [typeBit] <code>body</code>type_bit
     * @apiParam {byte[]} [typeBlob] <code>body</code>type_blob
     * @apiParam {String} [typeChar] <code>body</code>type_char
     * @apiParam {LocalDateTime} [typeDate] <code>body</code>type_date
     * @apiParam {LocalDateTime} [typeDatetime] <code>body</code>type_datetime
     * @apiParam {BigDecimal} [typeDecimal] <code>body</code>type_decimal
     * @apiParam {Double} [typeDouble] <code>body</code>type_double
     * @apiParam {Float} [typeFloat] <code>body</code>type_float
     * @apiParam {byte[]} [typeGeometry] <code>body</code>type_geometry
     * @apiParam {String} [typeGeometrycollection] <code>body</code>type_geometrycollection
     * @apiParam {Integer} [typeInteger] <code>body</code>type_integer
     * @apiParam {String} [typeJson] <code>body</code>type_json [MBG不支持JSON]
     * @apiParam {Object} [typeLinestring] <code>body</code>type_linestring
     * @apiParam {byte[]} [typeLongblob] <code>body</code>type_longblob
     * @apiParam {String} [typeLongtext] <code>body</code>type_longtext
     * @apiParam {byte[]} [typeMediumblob] <code>body</code>type_mediumblob
     * @apiParam {Integer} [typeMediumint] <code>body</code>type_mediumint
     * @apiParam {String} [typeMediumtext] <code>body</code>type_mediumtext
     * @apiParam {Object} [typeMultilinestring] <code>body</code>type_multilinestring
     * @apiParam {Object} [typeMultipoint] <code>body</code>type_multipoint
     * @apiParam {Object} [typeMultipolygon] <code>body</code>type_multipolygon
     * @apiParam {BigDecimal} [typeNumeric] <code>body</code>type_numeric
     * @apiParam {Object} [typePoint] <code>body</code>type_point
     * @apiParam {Object} [typePolygon] <code>body</code>type_polygon
     * @apiParam {Double} [typeReal] <code>body</code>type_real
     * @apiParam {String} [typeText] <code>body</code>type_text
     * @apiParam {LocalDateTime} [typeTime] <code>body</code>type_time
     * @apiParam {LocalDateTime} [typeTimestamp] <code>body</code>type_timestamp
     * @apiParam {byte[]} [typeTinyblob] <code>body</code>type_tinyblob
     * @apiParam {Integer} [typeTinyint] <code>body</code>type_tinyint
     * @apiParam {String} [typeTinytext] <code>body</code>type_tinytext
     * @apiParam {byte[]} [typeVarbinary] <code>body</code>type_varbinary
     * @apiParam {String} [typeVarchar] <code>body</code>type_varchar
     * @apiParam {LocalDateTime} [typeYear] <code>body</code>type_year
     * @apiParam {Integer} [sort] <code>body</code>排序
     * @apiParam {String} [remark] <code>body</code>备注
     *
     * @apiParamExample {json} 请求样例:
     * {
     *      "typeInt": "typeInt",
     *      "typeBigint": "typeBigint",
     *      "typeBinary": "typeBinary",
     *      "typeBit": "typeBit",
     *      "typeBlob": "typeBlob",
     *      "typeChar": "typeChar",
     *      "typeDate": "typeDate",
     *      "typeDatetime": "typeDatetime",
     *      "typeDecimal": "typeDecimal",
     *      "typeDouble": "typeDouble",
     *      "typeFloat": "typeFloat",
     *      "typeGeometry": "typeGeometry",
     *      "typeGeometrycollection": "typeGeometrycollection",
     *      "typeInteger": "typeInteger",
     *      "typeJson": "typeJson",
     *      "typeLinestring": "typeLinestring",
     *      "typeLongblob": "typeLongblob",
     *      "typeLongtext": "typeLongtext",
     *      "typeMediumblob": "typeMediumblob",
     *      "typeMediumint": "typeMediumint",
     *      "typeMediumtext": "typeMediumtext",
     *      "typeMultilinestring": "typeMultilinestring",
     *      "typeMultipoint": "typeMultipoint",
     *      "typeMultipolygon": "typeMultipolygon",
     *      "typeNumeric": "typeNumeric",
     *      "typePoint": "typePoint",
     *      "typePolygon": "typePolygon",
     *      "typeReal": "typeReal",
     *      "typeText": "typeText",
     *      "typeTime": "typeTime",
     *      "typeTimestamp": "typeTimestamp",
     *      "typeTinyblob": "typeTinyblob",
     *      "typeTinyint": "typeTinyint",
     *      "typeTinytext": "typeTinytext",
     *      "typeVarbinary": "typeVarbinary",
     *      "typeVarchar": "typeVarchar",
     *      "typeYear": "typeYear",
     *      "sort": "sort",
     *      "remark": "remark",
     * }
     *
     * @apiSuccessExample {json} 返回样例:
     * {
     *     "code": 1,
     *     "data": ObjectEntity
     * }
     *
     */
    @PostMapping("/demo/types/create")
    public R demoTypesServiceCreate(@RequestBody DemoTypes entity) {
        entity = demoTypesService.create(entity);
        return R.ok(entity);
    }

    /**
     * @api {post} /demo/types/update 4. demo-全类型-更新
     * @apiGroup DEMO_TYPES
     *
     * @apiVersion 0.0.1
     * @apiDescription demo-全类型-更新信息
     *
     * @apiParam {Integer} typeInt <code>body</code>type_int
     * @apiParam {Integer} [typeInt] <code>body</code>type_int
     * @apiParam {Long} typeBigint <code>body</code>type_bigint
     * @apiParam {Long} [typeBigint] <code>body</code>type_bigint
     * @apiParam {byte[]} typeBinary <code>body</code>type_binary
     * @apiParam {byte[]} [typeBinary] <code>body</code>type_binary
     * @apiParam {Boolean} typeBit <code>body</code>type_bit
     * @apiParam {Boolean} [typeBit] <code>body</code>type_bit
     * @apiParam {byte[]} typeBlob <code>body</code>type_blob
     * @apiParam {byte[]} [typeBlob] <code>body</code>type_blob
     * @apiParam {String} typeChar <code>body</code>type_char
     * @apiParam {String} [typeChar] <code>body</code>type_char
     * @apiParam {LocalDateTime} typeDate <code>body</code>type_date
     * @apiParam {LocalDateTime} [typeDate] <code>body</code>type_date
     * @apiParam {LocalDateTime} typeDatetime <code>body</code>type_datetime
     * @apiParam {LocalDateTime} [typeDatetime] <code>body</code>type_datetime
     * @apiParam {BigDecimal} typeDecimal <code>body</code>type_decimal
     * @apiParam {BigDecimal} [typeDecimal] <code>body</code>type_decimal
     * @apiParam {Double} typeDouble <code>body</code>type_double
     * @apiParam {Double} [typeDouble] <code>body</code>type_double
     * @apiParam {Float} typeFloat <code>body</code>type_float
     * @apiParam {Float} [typeFloat] <code>body</code>type_float
     * @apiParam {byte[]} typeGeometry <code>body</code>type_geometry
     * @apiParam {byte[]} [typeGeometry] <code>body</code>type_geometry
     * @apiParam {String} typeGeometrycollection <code>body</code>type_geometrycollection
     * @apiParam {String} [typeGeometrycollection] <code>body</code>type_geometrycollection
     * @apiParam {Integer} typeInteger <code>body</code>type_integer
     * @apiParam {Integer} [typeInteger] <code>body</code>type_integer
     * @apiParam {String} typeJson <code>body</code>type_json [MBG不支持JSON]
     * @apiParam {String} [typeJson] <code>body</code>type_json [MBG不支持JSON]
     * @apiParam {Object} typeLinestring <code>body</code>type_linestring
     * @apiParam {Object} [typeLinestring] <code>body</code>type_linestring
     * @apiParam {byte[]} typeLongblob <code>body</code>type_longblob
     * @apiParam {byte[]} [typeLongblob] <code>body</code>type_longblob
     * @apiParam {String} typeLongtext <code>body</code>type_longtext
     * @apiParam {String} [typeLongtext] <code>body</code>type_longtext
     * @apiParam {byte[]} typeMediumblob <code>body</code>type_mediumblob
     * @apiParam {byte[]} [typeMediumblob] <code>body</code>type_mediumblob
     * @apiParam {Integer} typeMediumint <code>body</code>type_mediumint
     * @apiParam {Integer} [typeMediumint] <code>body</code>type_mediumint
     * @apiParam {String} typeMediumtext <code>body</code>type_mediumtext
     * @apiParam {String} [typeMediumtext] <code>body</code>type_mediumtext
     * @apiParam {Object} typeMultilinestring <code>body</code>type_multilinestring
     * @apiParam {Object} [typeMultilinestring] <code>body</code>type_multilinestring
     * @apiParam {Object} typeMultipoint <code>body</code>type_multipoint
     * @apiParam {Object} [typeMultipoint] <code>body</code>type_multipoint
     * @apiParam {Object} typeMultipolygon <code>body</code>type_multipolygon
     * @apiParam {Object} [typeMultipolygon] <code>body</code>type_multipolygon
     * @apiParam {BigDecimal} typeNumeric <code>body</code>type_numeric
     * @apiParam {BigDecimal} [typeNumeric] <code>body</code>type_numeric
     * @apiParam {Object} typePoint <code>body</code>type_point
     * @apiParam {Object} [typePoint] <code>body</code>type_point
     * @apiParam {Object} typePolygon <code>body</code>type_polygon
     * @apiParam {Object} [typePolygon] <code>body</code>type_polygon
     * @apiParam {Double} typeReal <code>body</code>type_real
     * @apiParam {Double} [typeReal] <code>body</code>type_real
     * @apiParam {String} typeText <code>body</code>type_text
     * @apiParam {String} [typeText] <code>body</code>type_text
     * @apiParam {LocalDateTime} typeTime <code>body</code>type_time
     * @apiParam {LocalDateTime} [typeTime] <code>body</code>type_time
     * @apiParam {LocalDateTime} typeTimestamp <code>body</code>type_timestamp
     * @apiParam {LocalDateTime} [typeTimestamp] <code>body</code>type_timestamp
     * @apiParam {byte[]} typeTinyblob <code>body</code>type_tinyblob
     * @apiParam {byte[]} [typeTinyblob] <code>body</code>type_tinyblob
     * @apiParam {Integer} typeTinyint <code>body</code>type_tinyint
     * @apiParam {Integer} [typeTinyint] <code>body</code>type_tinyint
     * @apiParam {String} typeTinytext <code>body</code>type_tinytext
     * @apiParam {String} [typeTinytext] <code>body</code>type_tinytext
     * @apiParam {byte[]} typeVarbinary <code>body</code>type_varbinary
     * @apiParam {byte[]} [typeVarbinary] <code>body</code>type_varbinary
     * @apiParam {String} typeVarchar <code>body</code>type_varchar
     * @apiParam {String} [typeVarchar] <code>body</code>type_varchar
     * @apiParam {LocalDateTime} typeYear <code>body</code>type_year
     * @apiParam {LocalDateTime} [typeYear] <code>body</code>type_year
     * @apiParam {Integer} sort <code>body</code>排序
     * @apiParam {Integer} [sort] <code>body</code>排序
     * @apiParam {String} updateBy <code>body</code>更新人
     * @apiParam {String} [updateBy] <code>body</code>更新人
     * @apiParam {String} remark <code>body</code>备注
     * @apiParam {String} [remark] <code>body</code>备注
     *
     * @apiParamExample {json} 请求样例:
     * {
     *      "typeInt": "typeInt",
     *      "typeBigint": "typeBigint",
     *      "typeBinary": "typeBinary",
     *      "typeBit": "typeBit",
     *      "typeBlob": "typeBlob",
     *      "typeChar": "typeChar",
     *      "typeDate": "typeDate",
     *      "typeDatetime": "typeDatetime",
     *      "typeDecimal": "typeDecimal",
     *      "typeDouble": "typeDouble",
     *      "typeFloat": "typeFloat",
     *      "typeGeometry": "typeGeometry",
     *      "typeGeometrycollection": "typeGeometrycollection",
     *      "typeInteger": "typeInteger",
     *      "typeJson": "typeJson",
     *      "typeLinestring": "typeLinestring",
     *      "typeLongblob": "typeLongblob",
     *      "typeLongtext": "typeLongtext",
     *      "typeMediumblob": "typeMediumblob",
     *      "typeMediumint": "typeMediumint",
     *      "typeMediumtext": "typeMediumtext",
     *      "typeMultilinestring": "typeMultilinestring",
     *      "typeMultipoint": "typeMultipoint",
     *      "typeMultipolygon": "typeMultipolygon",
     *      "typeNumeric": "typeNumeric",
     *      "typePoint": "typePoint",
     *      "typePolygon": "typePolygon",
     *      "typeReal": "typeReal",
     *      "typeText": "typeText",
     *      "typeTime": "typeTime",
     *      "typeTimestamp": "typeTimestamp",
     *      "typeTinyblob": "typeTinyblob",
     *      "typeTinyint": "typeTinyint",
     *      "typeTinytext": "typeTinytext",
     *      "typeVarbinary": "typeVarbinary",
     *      "typeVarchar": "typeVarchar",
     *      "typeYear": "typeYear",
     *      "sort": "sort",
     *      "updateBy": "updateBy",
     *      "remark": "remark",
     * }
     *
     * @apiSuccessExample {json} 返回样例:
     * {
     *     "code": 1,
     *     "data": ObjectEntity
     * }
     *
     */
    @PostMapping("/demo/types/update")
    public R demoTypesServiceUpdate(@RequestBody DemoTypes entity) {
        Assert.notNull(entity.getId(), ResultCode.PARAM_NO_ID.getMessage());
        Assert.notNull(entity.getVersion(), ResultCode.UPDATE_NO_VERSION.getMessage());
        entity = demoTypesService.update(entity);
        return R.ok(entity);
    }


    /**
     * @api {post} /demo/types/save 5. demo-全类型-保存信息
     * @apiGroup DEMO_TYPES
     *
     * @apiVersion 0.0.1
     * @apiDescription demo-全类型-保存信息
     *
     * @apiParam {Long} id <code>body</code>ID【存在即更新,不存在即创建,更新时version必传】
     * @apiParam {Integer} [typeInt] <code>body</code>type_int
     * @apiParam {Long} [typeBigint] <code>body</code>type_bigint
     * @apiParam {byte[]} [typeBinary] <code>body</code>type_binary
     * @apiParam {Boolean} [typeBit] <code>body</code>type_bit
     * @apiParam {byte[]} [typeBlob] <code>body</code>type_blob
     * @apiParam {String} [typeChar] <code>body</code>type_char
     * @apiParam {LocalDateTime} [typeDate] <code>body</code>type_date
     * @apiParam {LocalDateTime} [typeDatetime] <code>body</code>type_datetime
     * @apiParam {BigDecimal} [typeDecimal] <code>body</code>type_decimal
     * @apiParam {Double} [typeDouble] <code>body</code>type_double
     * @apiParam {Float} [typeFloat] <code>body</code>type_float
     * @apiParam {byte[]} [typeGeometry] <code>body</code>type_geometry
     * @apiParam {String} [typeGeometrycollection] <code>body</code>type_geometrycollection
     * @apiParam {Integer} [typeInteger] <code>body</code>type_integer
     * @apiParam {String} [typeJson] <code>body</code>type_json [MBG不支持JSON]
     * @apiParam {Object} [typeLinestring] <code>body</code>type_linestring
     * @apiParam {byte[]} [typeLongblob] <code>body</code>type_longblob
     * @apiParam {String} [typeLongtext] <code>body</code>type_longtext
     * @apiParam {byte[]} [typeMediumblob] <code>body</code>type_mediumblob
     * @apiParam {Integer} [typeMediumint] <code>body</code>type_mediumint
     * @apiParam {String} [typeMediumtext] <code>body</code>type_mediumtext
     * @apiParam {Object} [typeMultilinestring] <code>body</code>type_multilinestring
     * @apiParam {Object} [typeMultipoint] <code>body</code>type_multipoint
     * @apiParam {Object} [typeMultipolygon] <code>body</code>type_multipolygon
     * @apiParam {BigDecimal} [typeNumeric] <code>body</code>type_numeric
     * @apiParam {Object} [typePoint] <code>body</code>type_point
     * @apiParam {Object} [typePolygon] <code>body</code>type_polygon
     * @apiParam {Double} [typeReal] <code>body</code>type_real
     * @apiParam {String} [typeText] <code>body</code>type_text
     * @apiParam {LocalDateTime} [typeTime] <code>body</code>type_time
     * @apiParam {LocalDateTime} [typeTimestamp] <code>body</code>type_timestamp
     * @apiParam {byte[]} [typeTinyblob] <code>body</code>type_tinyblob
     * @apiParam {Integer} [typeTinyint] <code>body</code>type_tinyint
     * @apiParam {String} [typeTinytext] <code>body</code>type_tinytext
     * @apiParam {byte[]} [typeVarbinary] <code>body</code>type_varbinary
     * @apiParam {String} [typeVarchar] <code>body</code>type_varchar
     * @apiParam {LocalDateTime} [typeYear] <code>body</code>type_year
     * @apiParam {Integer} [sort] <code>body</code>排序
     * @apiParam {LocalDateTime} [createTime] <code>body</code>创建时间
     * @apiParam {String} [createBy] <code>body</code>创建人
     * @apiParam {LocalDateTime} [updateTime] <code>body</code>更新时间
     * @apiParam {String} [updateBy] <code>body</code>更新人
     * @apiParam {String} [remark] <code>body</code>备注
     * @apiParam {Integer} [version] <code>body</code>版本号
     *
     * @apiParamExample {json} 请求样例:
     * {
     *      "typeInt": "typeInt",
     *      "typeBigint": "typeBigint",
     *      "typeBinary": "typeBinary",
     *      "typeBit": "typeBit",
     *      "typeBlob": "typeBlob",
     *      "typeChar": "typeChar",
     *      "typeDate": "typeDate",
     *      "typeDatetime": "typeDatetime",
     *      "typeDecimal": "typeDecimal",
     *      "typeDouble": "typeDouble",
     *      "typeFloat": "typeFloat",
     *      "typeGeometry": "typeGeometry",
     *      "typeGeometrycollection": "typeGeometrycollection",
     *      "typeInteger": "typeInteger",
     *      "typeJson": "typeJson",
     *      "typeLinestring": "typeLinestring",
     *      "typeLongblob": "typeLongblob",
     *      "typeLongtext": "typeLongtext",
     *      "typeMediumblob": "typeMediumblob",
     *      "typeMediumint": "typeMediumint",
     *      "typeMediumtext": "typeMediumtext",
     *      "typeMultilinestring": "typeMultilinestring",
     *      "typeMultipoint": "typeMultipoint",
     *      "typeMultipolygon": "typeMultipolygon",
     *      "typeNumeric": "typeNumeric",
     *      "typePoint": "typePoint",
     *      "typePolygon": "typePolygon",
     *      "typeReal": "typeReal",
     *      "typeText": "typeText",
     *      "typeTime": "typeTime",
     *      "typeTimestamp": "typeTimestamp",
     *      "typeTinyblob": "typeTinyblob",
     *      "typeTinyint": "typeTinyint",
     *      "typeTinytext": "typeTinytext",
     *      "typeVarbinary": "typeVarbinary",
     *      "typeVarchar": "typeVarchar",
     *      "typeYear": "typeYear",
     *      "sort": "sort",
     *      "updateBy": "updateBy",
     *      "remark": "remark",
     * }
     *
     * @apiSuccessExample {json} 返回样例:
     * {
     *     "code": 1,
     *     "data": ObjectEntity
     * }
     *
     */
    @PostMapping("/demo/types/save")
    public R demoTypesServiceSave(@RequestBody DemoTypes entity) {
        entity = demoTypesService.save(entity);
        return R.ok(entity);
    }

    /**
     * @api {post} /demo/types/remove 6. demo-全类型-删除
     * @apiGroup DEMO_TYPES
     *
     * @apiVersion 0.0.1
     * @apiDescription demo-全类型-删除
     *
     * @apiParam {Long} [id] <code>body</code>数据id
     * @apiParam {Long[]} [ids] <code>body</code>数据ids(当支持批量删除时)
     *
     * @apiParamExample {json} 请求样例:
     * {
     *     "id": 1,
     *     "ids": [1]
     * }
     *
     * @apiSuccessExample {json} 返回样例:
     * {
     *     "code": 1,
     *     "data": 1
     * }
     *
     */
    @PostMapping("/demo/types/remove")
    public R demoTypesServiceRemove(@RequestBody DemoTypes entity) {
        Assert.notNull(entity.getId(), ResultCode.PARAM_NO_ID.getMessage());
        demoTypesService.deleteById(entity);
        return R.ok(1);
    }

}

