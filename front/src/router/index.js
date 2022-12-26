import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue';

Vue.use(VueRouter)

const routes = [
    {
        path: '/',
        name: 'home',
        component: HomeView
    },
    {
      path: '/about',
      name: 'about',
      component: () => import(/* webpackChunkName: "about" */ '../views/AboutView.vue')
    }
]

const router = new createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes
})

export default router
