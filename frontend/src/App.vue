<template>
    <div id="app">
        <div id="nav">
            <router-link to="/">Lyra</router-link>
            |
            <router-link to="/p1mussample">MusSample</router-link>
        </div>
        <router-view :hellomsg="msg"></router-view>
    </div>
</template>

<script>

    export default {
        name: 'app',
        data() {
            return {
                msg: 'Welcome to your Lyra Grid'
            }
        }
    }
</script>

<style lang="scss">
    #app {
        font-family: 'Avenir', Helvetica, Arial, sans-serif;
        -webkit-font-smoothing: antialiased;
        -moz-osx-font-smoothing: grayscale;
        text-align: center;
        color: #2c3e50;
        margin-top: 10px;
    }

    #nav {
        padding: 10px;

        a {
            font-weight: bold;
            color: #2c3e50;

            &.router-link-exact-active {
                color: #42b983;
            }
        }
    }
</style>
