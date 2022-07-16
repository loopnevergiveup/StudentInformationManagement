<template>
  <HeaderAll/>
  <div class="main">
    <login-form/>
  </div>
</template>

<script>
import HeaderAll from "@/components/HeaderAll";
import LoginForm from "@/components/LoginForm";
export default {
  name: "UserLogin",
  components: {LoginForm, HeaderAll}
}
</script>

<style scoped>

</style>