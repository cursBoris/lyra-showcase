import Vue from 'vue'
import Router from 'vue-router'
import Hello from '@/components/Hello'
import P1MusSample from '@/components/P1MusSample'


Vue.use(Router)

export default new Router({
    routes: [
        {
            path: '/',
            name: 'hello',
            component: Hello
        },
        {
            path: '/p1mussample',
            name: 'P1MusSample',
            component: P1MusSample
        },
    ]
})
