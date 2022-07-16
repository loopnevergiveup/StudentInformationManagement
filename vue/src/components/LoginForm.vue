<template>
  <div class="login-form">
    <ul class="login-type">
      <li class="user-login li-active">用户登录</li>
      <li class="admin-login">管理员登录</li>
    </ul>
    <div class="login-info">
      <div class="login-main-title">
        <span>正在登录至</span>
        <span class="teach">【综合服务大厅】</span>
      </div>
      <el-form
          :label-position="refForm"
          :model="rule.ruleForm"
          :rules="rule.rules"
          label-width="70px"
          style="max-width: 200px;margin: 20px">
        <el-form-item label="用户名" prop="user_name">
          <el-input v-model="rule.ruleForm.user_name" placeholder="学号"/>
        </el-form-item>
        <el-form-item label="密码" prop="user_pass">
          <el-input v-model="rule.ruleForm.user_pass" placeholder="密码"/>
        </el-form-item>
      </el-form>
      <el-button type="success" class="login-button" @click="login">登录</el-button>
    </div>
  </div>
</template>

<script>
export default {
  name: "LoginForm"
}
</script>
<script setup>
import {reactive,ref} from 'vue'
import request from "@/utils/request";

const refForm=ref('left')
const rule = reactive({
  ruleForm: {
    user_name: '',
    user_pass: '',
    age:''
  },
  rules: {
    user_name: [
      {
        required: true,
        message: '请输入用户名',
        trigger: 'blur'
      },
      {
        min: 10,
        max: 10,
        message: '请输入十位学号',
        trigger: 'blur'
      }
    ],
    user_pass: [
      {
        required:true,
        message: '请输入密码',
        trigger: 'blur'
      }
    ]
  }
})
function login() {
  request.post("/user/login",rule.ruleForm).then(res => {
    console.log(res)
  })
}
// methods: {
//   login(){
//     request.post("/user/login",rule.ruleForm).then(res => {
//       console.log(res)
//     })
//   }
// }
</script>
<style scoped>

</style>