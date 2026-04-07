<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryRef" :inline="true" @submit.native.prevent>
      <el-form-item prop="typeInt">
        <el-input v-model="queryParams.typeInt" placeholder="type_int" clearable style="width: 120px" @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item prop="typeBigint">
        <el-input v-model="queryParams.typeBigint" placeholder="type_bigint" clearable style="width: 120px" @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item prop="typeBinary">
        <el-input v-model="queryParams.typeBinary" placeholder="type_binary" clearable style="width: 120px" @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item prop="typeBit">
        <el-input v-model="queryParams.typeBit" placeholder="type_bit" clearable style="width: 120px" @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item prop="typeBlob">
        <el-input v-model="queryParams.typeBlob" placeholder="type_blob" clearable style="width: 120px" @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item prop="typeChar">
        <el-input v-model="queryParams.typeChar" placeholder="type_char" clearable style="width: 120px" @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item prop="typeDate">
        <el-input v-model="queryParams.typeDate" placeholder="type_date" clearable style="width: 120px" @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item prop="typeDatetime">
        <el-input v-model="queryParams.typeDatetime" placeholder="type_datetime" clearable style="width: 120px" @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item prop="typeDecimal">
        <el-input v-model="queryParams.typeDecimal" placeholder="type_decimal" clearable style="width: 120px" @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item prop="typeDouble">
        <el-input v-model="queryParams.typeDouble" placeholder="type_double" clearable style="width: 120px" @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item prop="typeFloat">
        <el-input v-model="queryParams.typeFloat" placeholder="type_float" clearable style="width: 120px" @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item prop="typeGeometry">
        <el-input v-model="queryParams.typeGeometry" placeholder="type_geometry" clearable style="width: 120px" @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item prop="typeInteger">
        <el-input v-model="queryParams.typeInteger" placeholder="type_integer" clearable style="width: 120px" @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item prop="typeLinestring">
        <el-input v-model="queryParams.typeLinestring" placeholder="type_linestring" clearable style="width: 120px" @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item prop="typeLongblob">
        <el-input v-model="queryParams.typeLongblob" placeholder="type_longblob" clearable style="width: 120px" @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item prop="typeMediumblob">
        <el-input v-model="queryParams.typeMediumblob" placeholder="type_mediumblob" clearable style="width: 120px" @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item prop="typeMediumint">
        <el-input v-model="queryParams.typeMediumint" placeholder="type_mediumint" clearable style="width: 120px" @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item prop="typeMultilinestring">
        <el-input v-model="queryParams.typeMultilinestring" placeholder="type_multilinestring" clearable style="width: 120px" @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item prop="typeMultipoint">
        <el-input v-model="queryParams.typeMultipoint" placeholder="type_multipoint" clearable style="width: 120px" @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item prop="typeMultipolygon">
        <el-input v-model="queryParams.typeMultipolygon" placeholder="type_multipolygon" clearable style="width: 120px" @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item prop="typeNumeric">
        <el-input v-model="queryParams.typeNumeric" placeholder="type_numeric" clearable style="width: 120px" @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item prop="typePoint">
        <el-input v-model="queryParams.typePoint" placeholder="type_point" clearable style="width: 120px" @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item prop="typePolygon">
        <el-input v-model="queryParams.typePolygon" placeholder="type_polygon" clearable style="width: 120px" @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item prop="typeReal">
        <el-input v-model="queryParams.typeReal" placeholder="type_real" clearable style="width: 120px" @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item prop="typeTime">
        <el-input v-model="queryParams.typeTime" placeholder="type_time" clearable style="width: 120px" @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item prop="typeTimestamp">
        <el-input v-model="queryParams.typeTimestamp" placeholder="type_timestamp" clearable style="width: 120px" @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item prop="typeTinyblob">
        <el-input v-model="queryParams.typeTinyblob" placeholder="type_tinyblob" clearable style="width: 120px" @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item prop="typeTinyint">
        <el-input v-model="queryParams.typeTinyint" placeholder="type_tinyint" clearable style="width: 120px" @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item prop="typeVarbinary">
        <el-input v-model="queryParams.typeVarbinary" placeholder="type_varbinary" clearable style="width: 120px" @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item prop="typeVarchar">
        <el-input v-model="queryParams.typeVarchar" placeholder="type_varchar" clearable style="width: 120px" @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item prop="typeYear">
        <el-input v-model="queryParams.typeYear" placeholder="type_year" clearable style="width: 120px" @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item label="是否" prop="userDefine">
        <el-select v-model="queryParams.userDefine" placeholder="是否" clearable filterable style="width: 120px" @change="handleQuery">
          <el-option v-for="item in BOOLEAN" :key="item.value" :label="item.label" :value="item.value" />
        </el-select>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="Search" @click="handleQuery">搜索</el-button>
        <el-button icon="Refresh" @click="resetQuery">重置</el-button>
      </el-form-item>
      <el-form-item style="float: right;">
        <el-button type="primary" plain icon="Plus" @click="handleAdd">新增</el-button>
      </el-form-item>
    </el-form>
    <el-table v-loading="loading" :data="dataList">
      <el-table-column label="ID" prop="id" width="80" v-if="columns.id.visible"/>
      <el-table-column label="type_int" prop="typeInt" min-width="120"/>
      <el-table-column label="type_bigint" prop="typeBigint" min-width="120"/>
      <el-table-column label="type_binary" prop="typeBinary" min-width="120"/>
      <el-table-column label="type_bit" prop="typeBit" min-width="120"/>
      <el-table-column label="type_blob" prop="typeBlob" min-width="120"/>
      <el-table-column label="type_char" prop="typeChar" min-width="120"/>
      <el-table-column label="type_date" prop="typeDate" width="160">
        <template #default="{row}">{{ parseTime(row.typeDate) }}</template>
      </el-table-column>
      <el-table-column label="type_datetime" prop="typeDatetime" width="160">
        <template #default="{row}">{{ parseTime(row.typeDatetime) }}</template>
      </el-table-column>
      <el-table-column label="type_decimal" prop="typeDecimal" min-width="120"/>
      <el-table-column label="type_double" prop="typeDouble" min-width="120"/>
      <el-table-column label="type_float" prop="typeFloat" min-width="120"/>
      <el-table-column label="type_geometry" prop="typeGeometry" min-width="120"/>
      <el-table-column label="type_integer" prop="typeInteger" min-width="120"/>
      <el-table-column label="type_linestring" prop="typeLinestring" min-width="120"/>
      <el-table-column label="type_longblob" prop="typeLongblob" min-width="120"/>
      <el-table-column label="type_mediumblob" prop="typeMediumblob" min-width="120"/>
      <el-table-column label="type_mediumint" prop="typeMediumint" min-width="120"/>
      <el-table-column label="type_multilinestring" prop="typeMultilinestring" min-width="120"/>
      <el-table-column label="type_multipoint" prop="typeMultipoint" min-width="120"/>
      <el-table-column label="type_multipolygon" prop="typeMultipolygon" min-width="120"/>
      <el-table-column label="type_numeric" prop="typeNumeric" min-width="120"/>
      <el-table-column label="type_point" prop="typePoint" min-width="120"/>
      <el-table-column label="type_polygon" prop="typePolygon" min-width="120"/>
      <el-table-column label="type_real" prop="typeReal" min-width="120"/>
      <el-table-column label="type_time" prop="typeTime" width="160">
        <template #default="{row}">{{ parseTime(row.typeTime) }}</template>
      </el-table-column>
      <el-table-column label="type_timestamp" prop="typeTimestamp" width="160">
        <template #default="{row}">{{ parseTime(row.typeTimestamp) }}</template>
      </el-table-column>
      <el-table-column label="type_tinyblob" prop="typeTinyblob" min-width="120"/>
      <el-table-column label="type_tinyint" prop="typeTinyint" min-width="120"/>
      <el-table-column label="type_varbinary" prop="typeVarbinary" min-width="120"/>
      <el-table-column label="type_varchar" prop="typeVarchar" min-width="120"/>
      <el-table-column label="type_year" prop="typeYear" width="160">
        <template #default="{row}">{{ parseTime(row.typeYear) }}</template>
      </el-table-column>
      <el-table-column label="创建时间" prop="createTime" width="160">
        <template #default="{row}">{{ parseTime(row.createTime) }}</template>
      </el-table-column>
      <el-table-column label="创建人" prop="createBy" min-width="120"/>
      <el-table-column label="更新时间" prop="updateTime" width="160">
        <template #default="{row}">{{ parseTime(row.updateTime) }}</template>
      </el-table-column>
      <el-table-column label="更新人" prop="updateBy" min-width="120"/>
      <el-table-column label="版本号" prop="version" min-width="120"/>
      <el-table-column label="备注" prop="remark" min-width="120" v-if="columns.remark.visible"/>
      <el-table-column label="排序" prop="sort" width="80" v-if="columns.sort.visible"/>
      <el-table-column label="创建时间" prop="createTime" width="160" v-if="columns.createTime.visible">
        <template #default="{row}">{{ parseTime(row.createTime) }}</template>
      </el-table-column>
      <el-table-column label="创建人" prop="createBy" width="120" v-if="columns.createBy.visible"/>
      <el-table-column label="更新时间" prop="updateTime" width="160" v-if="columns.updateTime.visible">
        <template #default="{row}">{{ parseTime(row.updateTime) }}</template>
      </el-table-column>
      <el-table-column label="更新人" prop="updateBy" width="120" v-if="columns.updateBy.visible"/>
      <el-table-column fixed="right" width="98">
        <template #header><table-setting v-model:columns="columns"/></template>
        <template #default="{row}">
          <el-button link type="primary" icon="Edit" @click="handleUpdate(row)" title="编辑"/>
          <el-popconfirm :title="'确认删除:' + row.id + '?'" placement="top-end" @confirm="handleDelete(row)">
            <template #reference><el-button link type="danger" icon="Delete" title="删除"/></template>
          </el-popconfirm>
        </template>
      </el-table-column>
    </el-table>
    
    <pagination
        v-show="total > 0"
        :total="total"
        v-model:page="queryParams.current"
        v-model:limit="queryParams.size"
        @pagination="getList"
    />
    <edit ref="editRef" @change="getList"/>
  </div>
</template>

<script setup name="DemoTypes">
import { demoTypesPage, demoTypesRemove} from "@/api/demoTypes";
import Edit from "./components/edit"

const { proxy } = getCurrentInstance();

const { BOOLEAN } = proxy.useDict("BOOLEAN");
const dataList = ref([]);
const loading = ref(false);
const total = ref(0);

const columns = ref({
  id: {label: "ID", visible: false},
  sort: {label: "排序", visible: true},
  remark: {label: "备注", visible: true},
  updateBy: {label: "修改人", visible: false},
  updateTime: {label: "修改时间", visible: false},
  createBy: {label: "创建人", visible: false},
  createTime: {label: "创建时间", visible: false},
})

const queryParams = ref({
  current: 1,
  size: 20,
  typeInt: undefined,
  typeBigint: undefined,
  typeBinary: undefined,
  typeBit: undefined,
  typeBlob: undefined,
  typeChar: undefined,
  typeDate: undefined,
  typeDatetime: undefined,
  typeDecimal: undefined,
  typeDouble: undefined,
  typeFloat: undefined,
  typeGeometry: undefined,
  typeInteger: undefined,
  typeLinestring: undefined,
  typeLongblob: undefined,
  typeMediumblob: undefined,
  typeMediumint: undefined,
  typeMultilinestring: undefined,
  typeMultipoint: undefined,
  typeMultipolygon: undefined,
  typeNumeric: undefined,
  typePoint: undefined,
  typePolygon: undefined,
  typeReal: undefined,
  typeTime: undefined,
  typeTimestamp: undefined,
  typeTinyblob: undefined,
  typeTinyint: undefined,
  typeVarbinary: undefined,
  typeVarchar: undefined,
  typeYear: undefined,
});

function init() {
  getList();
}

/** 查询参数列表 */
function getList() {
  loading.value = true;
  demoTypesPage(queryParams.value).then(res => {
    const data = res.data;
    dataList.value = data.records;
    total.value = data.total;
  }).finally(() => {
    loading.value = false;
  });
}

/** 搜索按钮操作 */
function handleQuery() {
  queryParams.value.current = 1;
  getList();
}

/** 重置按钮操作 */
function resetQuery() {
  proxy.resetForm("queryRef");
  handleQuery();
}

function handleAdd() {
  proxy.$refs["editRef"].init();
}
function handleUpdate(row) {
  proxy.$refs["editRef"].init(row);
}

/** 删除按钮操作 */
function handleDelete(row) {
  demoTypesRemove({id: row.id}).then(res => {
    getList();
    proxy.$modal.msgSuccess("删除成功");
  })
}

init();
</script>

