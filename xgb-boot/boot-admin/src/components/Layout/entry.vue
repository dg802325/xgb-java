<template>
    <div>
        <Header :menu="menuList" :currentIndex="index" @change="indexChange"/>
       <div>
           <div class="main-nav">
               <ul class="menu-wrapper">
                   <li v-for="(item,_index) in menuList" @click="handleClick(_index)" :class="{'active':_index==index}">
                       <span><img src="./images/u102.png" /></span>
                       {{item.title}}
                   </li>
               </ul>
           </div>
           <Sider :list="list"/>
           <mainView />
       </div>
    </div>
</template>

<script>
    import  _ from 'lodash'
    import Header from './header';
    import Sider from './sider';
    import mainView from './main';
    import {menus} from './menu';
    export default {
        data(){
            return {
                index:0,
                menuList:[],
                list: []
            }
        },
        components: {
            Header,
            Sider,
            mainView
        } ,
        created(){
            this.menuList = menus;
            this.findRouterIndex();
            this.list = this.menuList[this.index].children;

        },
        methods: {
            handleClick(index){
                this.index = index;
                this.list = this.menuList[this.index].children;
            },
            findRouterIndex(){
                let fullPath = this.$route.fullPath;
                let _fullPath = fullPath.split('/');
                fullPath = _fullPath.length<=2 ? fullPath : '/'+_fullPath[1]+'/'+_fullPath[2]
                let index = 0;
                let menuList = JSON.parse(JSON.stringify(this.menuList));
                for(let i=0;i<menuList.length;i++){
                    let menu = menuList[i];
                    let childRouter = this.deepRouters(menu.children);
                    childRouter = _.flattenDeep(childRouter);
                    let  _index = _.findIndex(childRouter, function(o) {
                        return o.url === fullPath;
                    });
                    if(_index!==-1){
                        index = i;
                    }
                }
                this.index = index;
            },
            deepRouters(items=[],arr=[]){
                arr.push(items)
                for(let i=0;i<items.length;i++){
                    let item = items[i];
                    if(item.children) this.deepRouters(item.children,arr)
                }
                return arr
            },
            indexChange(index){
                this.index = index;
                this.list  = this.menuList[index].children
            }
        }
    }
</script>

<style>
    .main-nav{
        float:left;
        width: 70px;
        height: calc(100vh - 51px);
        background:#464c5b;
    }
    .main-nav ul{
        overflow-y: auto;
    }
    .main-nav ul li{
        position: relative;
        display: flex;
        align-items: center;
        height: 39px;
        color:#ccc;
        cursor: pointer;
    }
    .main-nav ul li:after{
        display: none;
        position: absolute;
        right:0;
        top:13px;
        content: '';
        width: 10px;
        height: 12px;
        background: url(./images/arrow.png) no-repeat;
    }
    .main-nav ul li.active{
        color:#fff;
    }
    .main-nav ul li.active:after{
        display: block;
    }
    .main-nav ul li span{
        padding: 0 4px 0 10px;
    }
    .header-container {
        height: 50px;
        box-sizing: border-box;
        background-color: rgba(171, 167, 188, 0.9);
        border-bottom: 2px rgba(0, 0, 0, 0.2) solid;
    }

    .header-container .logo-wrapper {
        float: left;
        display: flex;
        align-items: center;
        height: 100%;
        padding-left: 16px;
        color: #fff;
    }

    .header-container .logo-wrapper .name {
        padding-left: 10px;
        color: #fff;
        font-size: 18px;
        font-weight: bold
    }

    .header-container .menu-wrapper {
        margin-left: 20px;
        float: left;
        height: 100%;
    }

    .header-container .menu-wrapper li {
        position: relative;
        float: left;
        display: flex;
        align-items: center;
        justify-content: center;
        width: 60px;
        height: 100%;
        color: #fff;
        cursor: pointer;
    }

    .header-container .menu-wrapper li:hover {
        color: rgba(255, 255, 255, 0.8)
    }

    .header-container .menu-wrapper li.active::after {
        position: absolute;
        content: '';
        left: 0;
        top: 0;
        width: 100%;
        height: calc(100% + 1px);
        background: rgba(255, 255, 255, 0.36);
    }

    .header-container .header-right {
        float: right;
        display: flex;
        align-items: center;
        padding-right: 30px;
        height: 100%;
    }

    .header-container .header-right .head-avatar {
        width: 30px;
        height: 30px;
    }

    .header-container .header-right .user-name {
        margin: 0 10px;
        color: #fff;
    }

    .header-container .header-right .line {
        width: 1px;
        height: 20px;
        background: rgba(71, 75, 86, 0.46);
        font-size: 0;
        margin: 0 20px 0 10px;
    }

    .header-container .header-right .close-icon {
        font-size: 20px;
        color: #fff;
        cursor: pointer;
    }

    .header-container .header-right .close-icon:hover {
        color: rgba(255, 255, 255, 0.8);
    }


    .sidebar-container {
        float: left;
        width: 140px;
        height: calc(100vh - 51px);
        background: #eaedf1;
        border-right: 1px #e4e4e4 solid;
        overflow: auto;
    }

    .sidebar-container dt {
        height: 48px;
        line-height: 48px;
        padding-left:38px;
        border-bottom: 1px #e4e4e4 solid;
        color:#999;
        font-size: 14px;
        border-bottom: 1px #e4e4e4 solid;
        background: #f2f2f2;
    }

    .sidebar-container dd{
        height: 39px;
        padding-left:21px;
        line-height: 39px;
        color:#666;
        border-bottom: 1px #e4e4e4 solid;
        cursor: pointer;
    }

    .sidebar-container dd:hover,
    .sidebar-container dd.router-link-active{
        background: #fff;
        color:#48c9b0;
    }

    .main-container{
        position: absolute;
        left: 211px;
        top: 51px;
        right: 0;
        bottom:0;
        height: calc(100vh - 51px);
        overflow: auto;
    }

</style>
