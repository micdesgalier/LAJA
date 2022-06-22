import Vue from 'vue'
import VueRouter from 'vue-router'
import HomeView from '../views/HomeView.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/login',
    name: 'login',
    component: () => import(/* webpackChunkName: "about" */ '../views/LoginView.vue')
  },
  {
    path: '/main',
    name: 'main',
    component: () => import(/* webpackChunkName: "about" */ '../views/MainView.vue')
  },
  {
    path: '/sondage/:id',
    name: 'sondage',
    component: () => import(/* webpackChunkName: "about" */ '../views/SondageView.vue')
  },
  {
    path: '/mysondage/:id',
    name: 'mysondage',
    component: () => import(/* webpackChunkName: "about" */ '../views/MySondageView.vue')
  },
  {
    path: '/resultats/:id',
    name: 'resultats',
    component: () => import(/* webpackChunkName: "about" */ '../views/ResultatsSondageView.vue')
  }
]

const router = new VueRouter({
  routes
})

export default router
