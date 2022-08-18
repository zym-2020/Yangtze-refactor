import { createRouter, createWebHistory, RouteRecordRaw, createWebHashHistory } from 'vue-router'


const routes: Array<RouteRecordRaw> = [
  {
    path: '/',
    redirect: '/mapOne'
  },
  {
    path: '/mapOne',
    name: 'MapOne',
    component: () => import('@/views/MapOne.vue')
  },
  {
    path: '/data',
    name: 'Name',
    children: [
      {
        path: '',
        name: 'List',
        component: () => import('@/views/resource/Index.vue')
      },
      {
        path: ':id',
        name: 'DataListItem',
        component: () => import('@/views/resource/DataListItem.vue')
      }
    ]
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})


export default router
