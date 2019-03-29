<template>
    <div class="hello">
        <h2></h2>
        <div>
            <img src="./../assets/logo.svg">
        </div>
        <h1>{{ hellomsg }}</h1>
    </div>
</template>

<script>
    export default {
        name: 'Hello',
        props: {hellomsg: {type: String, required: true}}
    }

</script>

<style scoped>
    h1 {
        font-weight: normal;
        padding: 150px;
    }

    h2 {
        font-weight: normal;
        padding: 50px;
    }
</style>

