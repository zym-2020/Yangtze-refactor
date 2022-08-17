import { createRouter, createWebHistory, RouteRecordRaw } from 'vue-router'


const routes: Array<RouteRecordRaw> = [
  {
    path: '/',
    redirect: '/mapOne'
  },
  {
    path: '/mapOne',
    name: 'MapOne',
    component: () => import('@/views/MapOne.vue')
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
