<template>
  <el-dialog :title="title" v-model="open" width="1080px">
    <el-form ref="editRef" :model="form" :rules="rules" label-width="80px">
      <el-form-item label="type_int" prop="typeInt">
        <el-input v-model="form.typeInt" type="number" placeholder="请输入type_int" />
      </el-form-item>
      <el-form-item label="type_bigint" prop="typeBigint">
        <el-input v-model="form.typeBigint" type="number" placeholder="请输入type_bigint" />
      </el-form-item>
      <el-form-item label="type_binary" prop="typeBinary">
        <el-input v-model="form.typeBinary" placeholder="请输入type_binary" />
      </el-form-item>
      <el-form-item label="type_bit" prop="typeBit">
        <el-input v-model="form.typeBit" placeholder="请输入type_bit" />
      </el-form-item>
      <el-form-item label="type_blob" prop="typeBlob">
        <el-input v-model="form.typeBlob" placeholder="请输入type_blob" />
      </el-form-item>
      <el-form-item label="type_char" prop="typeChar">
        <el-input v-model="form.typeChar" placeholder="请输入type_char" />
      </el-form-item>
      <el-form-item label="type_date" prop="typeDate">
        <el-date-picker v-model="form.typeDate" type="datetime" placeholder="请输入type_date" />
      </el-form-item>
      <el-form-item label="type_datetime" prop="typeDatetime">
        <el-date-picker v-model="form.typeDatetime" type="datetime" placeholder="请输入type_datetime" />
      </el-form-item>
      <el-form-item label="type_decimal" prop="typeDecimal">
        <el-input v-model="form.typeDecimal" placeholder="请输入type_decimal" />
      </el-form-item>
      <el-form-item label="type_double" prop="typeDouble">
        <el-input v-model="form.typeDouble" placeholder="请输入type_double" />
      </el-form-item>
      <el-form-item label="type_float" prop="typeFloat">
        <el-input v-model="form.typeFloat" placeholder="请输入type_float" />
      </el-form-item>
      <el-form-item label="type_geometry" prop="typeGeometry">
        <el-input v-model="form.typeGeometry" placeholder="请输入type_geometry" />
      </el-form-item>
      <el-form-item label="type_geometrycollection" prop="typeGeometrycollection">
        <el-input v-model="form.typeGeometrycollection" placeholder="请输入type_geometrycollection" />
      </el-form-item>
      <el-form-item label="type_integer" prop="typeInteger">
        <el-input v-model="form.typeInteger" type="number" placeholder="请输入type_integer" />
      </el-form-item>
      <el-form-item label="type_json [MBG不支持JSON]" prop="typeJson">
        <el-input v-model="form.typeJson" placeholder="请输入type_json [MBG不支持JSON]" />
      </el-form-item>
      <el-form-item label="type_linestring" prop="typeLinestring">
        <el-input v-model="form.typeLinestring" placeholder="请输入type_linestring" />
      </el-form-item>
      <el-form-item label="type_longblob" prop="typeLongblob">
        <el-input v-model="form.typeLongblob" placeholder="请输入type_longblob" />
      </el-form-item>
      <el-form-item label="type_longtext" prop="typeLongtext">
        <el-input v-model="form.typeLongtext" placeholder="请输入type_longtext" />
      </el-form-item>
      <el-form-item label="type_mediumblob" prop="typeMediumblob">
        <el-input v-model="form.typeMediumblob" placeholder="请输入type_mediumblob" />
      </el-form-item>
      <el-form-item label="type_mediumint" prop="typeMediumint">
        <el-input v-model="form.typeMediumint" type="number" placeholder="请输入type_mediumint" />
      </el-form-item>
      <el-form-item label="type_mediumtext" prop="typeMediumtext">
        <el-input v-model="form.typeMediumtext" placeholder="请输入type_mediumtext" />
      </el-form-item>
      <el-form-item label="type_multilinestring" prop="typeMultilinestring">
        <el-input v-model="form.typeMultilinestring" placeholder="请输入type_multilinestring" />
      </el-form-item>
      <el-form-item label="type_multipoint" prop="typeMultipoint">
        <el-input v-model="form.typeMultipoint" placeholder="请输入type_multipoint" />
      </el-form-item>
      <el-form-item label="type_multipolygon" prop="typeMultipolygon">
        <el-input v-model="form.typeMultipolygon" placeholder="请输入type_multipolygon" />
      </el-form-item>
      <el-form-item label="type_numeric" prop="typeNumeric">
        <el-input v-model="form.typeNumeric" placeholder="请输入type_numeric" />
      </el-form-item>
      <el-form-item label="type_point" prop="typePoint">
        <el-input v-model="form.typePoint" placeholder="请输入type_point" />
      </el-form-item>
      <el-form-item label="type_polygon" prop="typePolygon">
        <el-input v-model="form.typePolygon" placeholder="请输入type_polygon" />
      </el-form-item>
      <el-form-item label="type_real" prop="typeReal">
        <el-input v-model="form.typeReal" placeholder="请输入type_real" />
      </el-form-item>
      <el-form-item label="type_text" prop="typeText">
        <el-input v-model="form.typeText" placeholder="请输入type_text" />
      </el-form-item>
      <el-form-item label="type_time" prop="typeTime">
        <el-date-picker v-model="form.typeTime" type="datetime" placeholder="请输入type_time" />
      </el-form-item>
      <el-form-item label="type_timestamp" prop="typeTimestamp">
        <el-date-picker v-model="form.typeTimestamp" type="datetime" placeholder="请输入type_timestamp" />
      </el-form-item>
      <el-form-item label="type_tinyblob" prop="typeTinyblob">
        <el-input v-model="form.typeTinyblob" placeholder="请输入type_tinyblob" />
      </el-form-item>
      <el-form-item label="type_tinyint" prop="typeTinyint">
        <el-input v-model="form.typeTinyint" type="number" placeholder="请输入type_tinyint" />
      </el-form-item>
      <el-form-item label="type_tinytext" prop="typeTinytext">
        <el-input v-model="form.typeTinytext" placeholder="请输入type_tinytext" />
      </el-form-item>
      <el-form-item label="type_varbinary" prop="typeVarbinary">
        <el-input v-model="form.typeVarbinary" placeholder="请输入type_varbinary" />
      </el-form-item>
      <el-form-item label="type_varchar" prop="typeVarchar">
        <el-input v-model="form.typeVarchar" placeholder="请输入type_varchar" />
      </el-form-item>
      <el-form-item label="type_year" prop="typeYear">
        <el-date-picker v-model="form.typeYear" type="datetime" placeholder="请输入type_year" />
      </el-form-item>
      <el-form-item label="排序" prop="sort">
        <el-input v-model="form.sort" type="number" placeholder="请输入排序" />
      </el-form-item>
      <el-form-item label="备注" prop="remark">
        <el-input v-model="form.remark" placeholder="请输入备注" />
      </el-form-item>
      <el-form-item label="是否" prop="userDefine">
        <el-select v-model="form.userDefine" placeholder="是否" clearable filterable style="width: 120px">
          <el-option v-for="item in BOOLEAN" :key="item.value" :label="item.label" :value="item.value" />
        </el-select>
      </el-form-item>
    </el-form>
    <template #footer>
      <div class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </template>
  </el-dialog>
</template>

<script setup name="DemoTypesEdit">
import {demoTypesInfo, demoTypesCreate, demoTypesUpdate} from "@/api/demoTypes";

defineExpose({init});
const emit = defineEmits(["change"]);
const { proxy } = getCurrentInstance();
const { BOOLEAN } = proxy.useDict("BOOLEAN");
const open = ref(false);
const title = ref("");
const form = ref({});
const rules = ref({
  typeInt: [{ required: true, message: "type_int 不能为空", trigger: "blur"}],
  typeBigint: [{ required: true, message: "type_bigint 不能为空", trigger: "blur"}],
  typeBinary: [{ required: true, message: "type_binary 不能为空", trigger: "blur"}],
  typeBit: [{ required: true, message: "type_bit 不能为空", trigger: "blur"}],
  typeBlob: [{ required: true, message: "type_blob 不能为空", trigger: "blur"}],
  typeChar: [{ required: true, message: "type_char 不能为空", trigger: "blur"}],
  typeDate: [{ required: true, message: "type_date 不能为空", trigger: "blur"}],
  typeDatetime: [{ required: true, message: "type_datetime 不能为空", trigger: "blur"}],
  typeDecimal: [{ required: true, message: "type_decimal 不能为空", trigger: "blur"}],
  typeDouble: [{ required: true, message: "type_double 不能为空", trigger: "blur"}],
  typeFloat: [{ required: true, message: "type_float 不能为空", trigger: "blur"}],
  typeGeometry: [{ required: true, message: "type_geometry 不能为空", trigger: "blur"}],
  typeGeometrycollection: [{ required: true, message: "type_geometrycollection 不能为空", trigger: "blur"}],
  typeInteger: [{ required: true, message: "type_integer 不能为空", trigger: "blur"}],
  typeJson: [{ required: true, message: "type_json [MBG不支持JSON] 不能为空", trigger: "blur"}],
  typeLinestring: [{ required: true, message: "type_linestring 不能为空", trigger: "blur"}],
  typeLongblob: [{ required: true, message: "type_longblob 不能为空", trigger: "blur"}],
  typeLongtext: [{ required: true, message: "type_longtext 不能为空", trigger: "blur"}],
  typeMediumblob: [{ required: true, message: "type_mediumblob 不能为空", trigger: "blur"}],
  typeMediumint: [{ required: true, message: "type_mediumint 不能为空", trigger: "blur"}],
  typeMediumtext: [{ required: true, message: "type_mediumtext 不能为空", trigger: "blur"}],
  typeMultilinestring: [{ required: true, message: "type_multilinestring 不能为空", trigger: "blur"}],
  typeMultipoint: [{ required: true, message: "type_multipoint 不能为空", trigger: "blur"}],
  typeMultipolygon: [{ required: true, message: "type_multipolygon 不能为空", trigger: "blur"}],
  typeNumeric: [{ required: true, message: "type_numeric 不能为空", trigger: "blur"}],
  typePoint: [{ required: true, message: "type_point 不能为空", trigger: "blur"}],
  typePolygon: [{ required: true, message: "type_polygon 不能为空", trigger: "blur"}],
  typeReal: [{ required: true, message: "type_real 不能为空", trigger: "blur"}],
  typeText: [{ required: true, message: "type_text 不能为空", trigger: "blur"}],
  typeTime: [{ required: true, message: "type_time 不能为空", trigger: "blur"}],
  typeTimestamp: [{ required: true, message: "type_timestamp 不能为空", trigger: "blur"}],
  typeTinyblob: [{ required: true, message: "type_tinyblob 不能为空", trigger: "blur"}],
  typeTinyint: [{ required: true, message: "type_tinyint 不能为空", trigger: "blur"}],
  typeTinytext: [{ required: true, message: "type_tinytext 不能为空", trigger: "blur"}],
  typeVarbinary: [{ required: true, message: "type_varbinary 不能为空", trigger: "blur"}],
  typeVarchar: [{ required: true, message: "type_varchar 不能为空", trigger: "blur"}],
  typeYear: [{ required: true, message: "type_year 不能为空", trigger: "blur"}],
  sort: [{ required: true, message: "排序 不能为空", trigger: "blur"}],
  remark: [{ required: true, message: "备注 不能为空", trigger: "blur"}],
})

/** 表单重置 */
function reset() {
  form.value = {};
  proxy.resetForm("editRef");
}

/** 取消按钮 */
function cancel() {
  open.value = false;
  reset();
}

// 新增/修改按钮操作
function init(row) {
  reset();
  if (!row || !row.id) {
    open.value = true;
    title.value = "添加";
    form.value.sort = 99;
  } else {
    demoTypesInfo({id: row.id}).then(res => {
      form.value = res.data;
      open.value = true;
      title.value = "修改";
    });
  }
}

/** 提交按钮 */
function submitForm() {
  proxy.$refs["editRef"].validate(valid => {
    if (valid) {
      if (form.value.id) {
        demoTypesUpdate(form.value).then(res => {
          proxy.$modal.msgSuccess("修改成功");
          open.value = false;
          emit("change", true);
        });
      } else {
        demoTypesCreate(form.value).then(res => {
          proxy.$modal.msgSuccess("新增成功");
          open.value = false;
          emit("change", true);
        });
      }
    }
  });
}
</script>

