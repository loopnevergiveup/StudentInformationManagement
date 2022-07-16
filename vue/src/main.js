import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import './assets/css/base.css'
import './assets/css/header.css'
import './assets/css/loginform.css'
import axios from 'axios'
import VueAxios from "vue-axios";

createApp(App).use(store).use(VueAxios,axios).use(router).use(ElementPlus).mount('#app')
