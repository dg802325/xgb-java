<template>
    <div class="sidebar-container">
        <dl v-for="menu in list">
            <dt>{{menu.menuName}}</dt>
            <template  v-if="menu.menuItemThree" v-for="item in menu.menuItemThree">
                <dd v-if="!item.menuUrl">{{item.menuName}}</dd>
                <router-link tag="dd" v-if="item.menuUrl" @click="routerClick" :to="item.menuUrl">{{"• "+item.menuName}}</router-link>
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
            routerClick(e){
                console.log(e)
            }
        }
    }
</script>

<style>

</style>