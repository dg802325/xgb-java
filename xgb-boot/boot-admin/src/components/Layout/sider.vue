<template>
    <div class="sidebar-container">
        <dl v-for="menu in list">
            <dt>{{menu.title}}</dt>
            <template  v-if="menu.children" v-for="item in menu.children">
                <dd v-if="!item.url">{{item.title}}</dd>
                <router-link tag="dd" v-if="item.url" :to="item.url">{{item.title}}</router-link>
            </template>
        </dl>
    </div>
</template>

<script>
    export default {
        data() {
            return {
                activeIndex: 1,
            };
        },
        props: {
            list: Array
        },
        methods: {
        }
    }
</script>

<style>

</style>
