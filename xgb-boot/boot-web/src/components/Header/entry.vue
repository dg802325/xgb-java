<template>
  <div class="header-container">
    <div class="header-wrapper">
      <div class="container">
<!--        <div class="link-wrapper">-->
<!--          <div class="user-nav" v-if="member">-->
<!--            <div class="shadow">-->
<!--              <span class="el-dropdown-link">-->
<!--                {{member.memberName}} <i class="fa fa-chevron-down"></i>-->
<!--              </span>-->
<!--              <ul>-->
<!--                <router-link tag="li" to="/center/person">个人中心</router-link>-->
<!--                <router-link tag="li" to="/center/security">安全设置</router-link>-->
<!--                <li @click="loginOut">退出登录</li>-->
<!--              </ul>-->
<!--            </div>-->
<!--          </div>-->
<!--          <span class="line" v-if="member">|</span>-->
<!--          <router-link to="/login" v-if="!member" class="link">请先登录</router-link>-->
<!--          <span class="line" v-if="!member">|</span>-->
<!--          <router-link to="/register" v-if="!member" class="link">免费注册</router-link>-->
<!--          <span class="line" v-if="!member">|</span>-->
<!--          <router-link to="/center/order" class="link">我的订单</router-link>-->
<!--          <span class="line">|</span>-->
<!--          <router-link to="/help" class="link">帮助中心</router-link>-->
<!--          <span class="line">|</span>-->
<!--          <div class="link">-->
<!--            <el-dropdown>-->
<!--              <span class="link mobile">手机版</span>-->
<!--              <el-dropdown-menu class="qr-code" slot="dropdown">-->
<!--                <p class="code">-->
<!--                  <img src="./images/u90.png">-->
<!--                </p>-->
<!--                <p class="desc">扫描二维码下载e农商城APP</p>-->
<!--              </el-dropdown-menu>-->
<!--            </el-dropdown>-->
<!--          </div>-->
<!--        </div>-->
        <div class="address-wrapper">
          <p class="address" @click="showCityEvent">🚩
            <span v-if="showCity.length" v-for="(city,index) in showCity" :key="index">{{regionMap[city].divisionName}}<template
                v-if="index<2">-</template></span>
            <span style="color:#949494" v-if="!showCity.length">选择区域</span>
          </p>
          <SelectCity @changeCity="changeCity" :showCity="showCity" v-show="selCityVisible" :cityOption="regions"/>
        </div>
      </div>
    </div>
    <div class="nav-container">

      <div class="nav-wrapper container">
        <router-link to="/" class="logo-wrapper">
          <img src="./images/web-logo.png" width="45" height="45">
        </router-link>
        <div class="login-title">
          <h1>正在制作</h1>
          <p>稍后</p>
        </div>
        <div class="nav-group">
          <router-link to="/home">首页</router-link>
          <el-dropdown @visible-change="mouseoutEvent">
            <span>
              <a href="javascript:;"
                 class="link"
                 v-for="item in OneFl"
                 :key="item.id"
                 v-if="twoCategoryList[item.id]"
                 @mouseover="mouseoverEvent(item.id)"
                 :class='{
                  "hover":currentId===item.id,
                  "selected": selectId === item.id
                  }'
              >{{item.categoryName}}</a></span>
            <el-dropdown-menu slot="dropdown" class="subnav">
              <div v-if="currentId">
                <ul class="container">
                  <router-link
                      v-for="child in twoCategoryList[currentId]"
                      :class='{"active":twoId===child.id}'
                      :key="child.id"
                      :to="'/list/'+currentId+'/'+child.id"
                      @click='twoId=child.id'
                      tag="li">
                    <el-image
                        class="cover-img"
                        :src="child.categoryIcon"
                        fit="contain"
                    />
                    <p class="value">{{child.categoryName}}</p>
                  </router-link>
                </ul>
              </div>
            </el-dropdown-menu>
          </el-dropdown>
        </div>
        <div class="search-wrapper">
          <el-input v-model="searchVal" class="context" @keyup.enter.native="searchEvent"  placeholder="输入什么都没用"></el-input>
          <span v-show="deleteVisible" class="delete" @click="deleteContext">
            <img src="./images/delete.svg"/>
          </span>
          <el-button icon="el-icon-search" class="search-button" @click="searchEvent" type="text"></el-button>
        </div>
        <!-- 购物车 -->
        <div class="my-cart-wrapper">
          <el-dropdown v-if="cartList.length">
            <el-badge :value="statistics.length" class="badge">
              <router-link tag="p" to="/cart" class="label">我的购物车</router-link>
            </el-badge>
            <el-dropdown-menu slot="dropdown">
              <div class="cart-wrapper">
                <div class="items">
                  <template v-for="store in cartList" >
                    <div class="dropdown-store-name">{{store.storeName}}</div>
                    <div class="item"  v-for="sku in store.lists" >
                      <router-link :to='/detail/+sku.skuId' class="cover">
                        <img :src="sku.resourcesUrl">
                      </router-link>
                      <div class="desc">
                        <div class="name">
                          <router-link tag='span' :to='/detail/+sku.skuId' class="l">{{sku.skuName}}</router-link>
                          <span class="price">¥{{sku.skuPrice.toFixed(2)}}</span>
                        </div>
                        <p class="value">
                          <span class="l"></span>
                          <span class="num">x{{sku.commonityCount}}</span>
                        </p>
                      </div>
                      <div class="delete" @click="removeSkuEvent(sku.id)">
                        <div class="btn"></div>
                      </div>
                    </div>
                  </template>
                </div>
                <div class="my-cart-button">
                  <div>
                    <p class="len">共{{statistics.length}}件商品</p>
                    <p class="price">{{statistics.price.toFixed(2)}}元</p>
                  </div>
                  <router-link to="/cart" tag="button" class="link-button">去购物车结算
                  </router-link>
                </div>
              </div>
            </el-dropdown-menu>
          </el-dropdown>
<!--          <router-link v-if="!cartList.length" tag="p" to="/cart" class="label">我的购物车</router-link>-->
        </div>
      </div>
    </div>
    <!-- 固定导航 -->
    <div class="fixed-header" v-show="fixedHeader">
      <div class="container">
        <router-link to="/" class="logo-wrapper">
          <img src="./images/web-logo.png" width="45" height="45">
        </router-link>
        <div class="login-title">
          <h1>佛系商城</h1>
        </div>
        <div class="nav-group">
          <router-link to="/home">首页</router-link>
          <el-dropdown @visible-change="mouseoutEvent">
            <span>
              <a href="javascript:;"
                 class="link"
                 v-for="item in OneFl"
                 :key="item.id"
                 v-if="twoCategoryList[item.id]"
                 @mouseover="mouseoverEvent(item.id)"
                 :class='{
                  "hover":currentId===item.id,
                  "selected": selectId === item.id
                  }'
              >{{item.categoryName}}</a></span>
            <el-dropdown-menu slot="dropdown" class="subnav">
              <div v-if="currentId">
                <ul class="container">
                  <router-link
                      v-for="child in twoCategoryList[currentId]"
                      :class='{"active":twoId===child.id}'
                      :key="child.id"
                      :to="'/list/'+currentId+'/'+child.id"
                      @click='twoId=child.id'
                      tag="li">
                    <!--<p class="fa fa-photo"></p>-->
                    <el-image
                        class="cover-img"
                        :src="child.categoryIcon"
                        fit="contain"
                    />
                    <p class="value">{{child.categoryName}}</p>
                  </router-link>
                </ul>
              </div>
            </el-dropdown-menu>
          </el-dropdown>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
  import {removeToken, getMember, removeMember} from "../../utils/auth";
  import SelectCity from './selectCity';
  import {mapMutations, mapGetters, mapActions} from 'vuex';
  import Cookies from 'js-cookie'

  export default {
    data() {
      return {
        fixedHeader: false,
        searchVal: "",
        twoId: '',
        deleteVisible: false,
        OneFl: [],
        twoCategoryList: {},
        currentId: '',
        selectId: '',
        statistics: {
          length: 0,
          price: 0
        },
        selCityVisible: false,
        regions: [],
        regionMap: {},
        showCity: []
      }
    },
    computed: {
      ...mapGetters(['member', 'cartList'])
    },
    async created() {
      window.onscroll = () => {
        this.showFixedHeader();
      };
      await this.showFixedHeader();
      await this.getCategoryList();
      this.setRouterActive();
      this.loginAction();
      this.getProvinceList();
    },
    watch: {
      searchVal(val) {
        if (val) {
          this.deleteVisible = true;
        } else {
          this.deleteVisible = false;
        }
      },
      $route() {
        this.setRouterActive();
      },
      cartList(storeList) {
        let statistics = {
          length: 0,
          price: 0
        };
        storeList.forEach(store=>{
          store.lists.forEach(sku => {
            let length = sku.commonityCount || 0;
            let price = sku.skuPrice || 0;
            statistics.length += length;
            statistics.price += length * price;
          });
        })

        this.statistics = statistics;
      }
    },
    methods: {
      // 搜索
      searchEvent(){
        this.$router.replace('/search?val='+this.searchVal)
      },
      showCityEvent() {
        this.selCityVisible = true;
      },
      changeCity(val) {
        this.showCity = val;
        Cookies.set('defaultCity', JSON.stringify(this.showCity),{ expires: 1000 });
        this.selCityVisible = false;
      },
      // 获取所有省
      async getProvinceList() {
        const res = await this.$get('/api/getProvinceList');
        if (res.code === '200') {
          let provinceList = res.ProvinceList;
          const provinceIds = provinceList.map(item => item.id).join();
          this.getCityList(provinceIds, provinceList);
        }
      },
      // 获取市
      async getCityList(ProvinceId, provinceList) {
        let res = await this.$get('/api/getCityList', {
          ProvinceId
        });
        if (res.code === '200') {
          let city = res.cityList;
          const cityIds = city.map(item => item.id).join();
          this.getAreaList(cityIds, provinceList, city);
        }
      },
      // 获取所有区县
      async getAreaList(cityId, provinceList, city) {
        let res = await this.$post('/api/getAreaList', {
          cityId
        });
        if (res.code === '200') {
          let region = [...provinceList, ...city, ...res.areaList];
          let map = {};
          region.forEach(item => {
            map[item.id] = item;
          });
          let regions = [];

          for (let key in map) {
            let item = map[key];
            if (item.parentId) {
              if (map[item.parentId]) {
                if (!map[item.parentId].children) {
                  map[item.parentId].children = [];
                }
                map[item.parentId].children.push(item);
              } else {
                regions.push(item);
              }
            } else {
              regions.push(item);
            }
          }

          this.regionMap = map;
          this.setPegionMap(map);
          this.regions = regions;
          this.setPegions(regions);
          let defaultCity = Cookies.get('defaultCity');
          // 如果cookie有城市的值
          if (defaultCity) {
            this.showCity = JSON.parse(defaultCity);
          } else {
            // 如果没有 定位当前城市
            this.getPosition().then(code=>{
              this.setDefaultCity(map,code)
            }).catch( () =>{
              // 处理掉用失败
              // let showCity = [regions[0].id, regions[0].children[0].id, regions[0].children[0].children[0].id];
              // this.showCity = showCity;
              // this.setLocation(showCity);
              // Cookies.set('defaultCity', JSON.stringify(showCity),{ expires: 100 })
            });
          }
        }
      },
      setDefaultCity(map,code){
        let area = null;
        for(let key in map){
          let item = map[key];
          if(item.divisionCode === code){
            area = item;
          }
        }
        let city = null;
        if(area){
          for(let key in map){
            let item = map[key];
            if(item.id === area.parentId){
              city = item;
            }
          }
          let province = null;
          if(city){
            for(let key in map){
              let item = map[key];
              if(item.id === city.parentId){
                province = item;
              }
            }
          }
          if(province){
            let showCity = [province.id, city.id, area.id];
            this.setLocation(showCity);
            this.showCity = showCity;
            Cookies.set('defaultCity', JSON.stringify(showCity),{ expires: 100 })
          }
        }
      },
      // 获取位置
      async getPosition(){
        return new Promise((resolve,reject)=>{
          // let that = this;
          let mapObj = new AMap.Map('iCenter');
          mapObj.plugin('AMap.Geolocation', function () {
            let geolocation = new AMap.Geolocation({
              enableHighAccuracy: true,
              timeout: 10000,
              maximumAge: 0,
              convert: true,
              showButton: false,
              buttonPosition: 'LB',
              buttonOffset: new AMap.Pixel(10, 20),
              showMarker: false,
              showCircle: false,
              panToLocation: false,
              zoomToAccuracy:false
            });
            mapObj.addControl(geolocation);
            geolocation.getCurrentPosition();
            //返回定位信息
            AMap.event.addListener(geolocation, 'complete', function (val) {
              if(val.info==='SUCCESS'){
                let addressComponent = val.addressComponent;
                if(addressComponent){
                  let adcode = addressComponent.adcode;
                  Cookies.set('code',adcode ,{ expires: 100 });
                  // that.adcode = adcode;
                  resolve(adcode)
                }else{
                  reject()
                }
              }else{
                reject()
              }
            });
            //返回定位出错信息
            AMap.event.addListener(geolocation, 'error', function (err) {
              reject()
            });
          });
        })
      },
      // 设置导航选中状态
      setRouterActive() {
        let {parentId, id} = this.$route.params;
        this.twoId = id;
        this.selectId = this.$route.name === 'list' ? parentId : '';
        this.selectId = this.$route.name === 'classify' ? id : '';
      },
      // 退出登录
      loginOut() {
        this.loginOutAction();
      },
      removeSkuEvent(id) {
        this.$$confirm("确定删除此商品吗？")
          .then(async () => {
            let res = await this.$post('/api/deleteShoppingCart', {
              id
            });
            this.$$message(res.message, res.code);
            this.queryCartList();
          })
      },
      // 导航鼠标移出
      mouseoutEvent(status) {
        if (!status) this.currentId = '';
      },
      mouseoverEvent(id) {
        this.currentId = id;
      },
      // 获取一级分类
      async getCategoryList() {
        let res = await this.$get('/api/getCategoryList')
        if (res.code === '200') {
          const categoryList = res.categoryList;
          this.OneFl = categoryList;
          let twoCategoryList = {};
          for (let i = 0; i < categoryList.length; i++) {
            await this.apiGetTwoCategoryList(categoryList[i].id, twoCategoryList);
          }
          this.setFirstMenu(categoryList);
          this.setTwoMenu(twoCategoryList);
          this.twoCategoryList = twoCategoryList;
        }
      },
      // 获取二级分类
      async apiGetTwoCategoryList(parentId, parentMap) {
        let res = await this.$get('/api/getCategoryTwoList', {
          parentId
        });
        if (res.code === '200') {
          parentMap[parentId] = res.categoryTwoList;
        }
      },
      showFixedHeader() {
        var sTop = document.documentElement.scrollTop || document.body.scrollTop;
        if (sTop >= 152) {
          this.fixedHeader = true;
        } else {
          this.fixedHeader = false;
        }
      },
      // 删除搜索框内如
      deleteContext() {
        this.searchVal = "";
      },
      ...mapActions(['loginAction', 'queryCartList', 'loginOutAction']),
      ...mapMutations({
        'setFirstMenu': 'SET_FIRSTMENU',
        'setTwoMenu': 'SET_TWOMENU',
        'setPegionMap': 'SET_REGIONMAP',
        'setPegions': 'SET_REGIONS',
        'setLocation': 'SET_LOCATION'
      })
    },
    components: {
      SelectCity
    }
  };
</script>

<style lang="scss">
  .dropdown-store-name{
    line-height: 30px;
    padding-left:8px;
    margin-bottom:7px;
    font-weight: bold;
    background:rgb(245, 245, 245);
  }
  .el-dropdown-link {
    position: relative;
    z-index: 3;
    display: block;
    color: #ccc;
    font-size: 12px;
    cursor: pointer;
    height: 50px;
    line-height: 50px;

    .fa {
      color: #ccc;
    }
  }

  .user-nav {
    z-index: 20;
    position: relative;
    width: 120px;
    text-align: center;

    .shadow {
      position: relative
    }
  }

  .user-nav ul {
    display: none;
    padding: 55px 0 10px;
    width: 100%;
    position: absolute;
    z-index: 2;
    left: 0;
    top: -7px;
    background: #fff;
    box-shadow: 0 2px 12px 0 rgba(0, 0, 0, .1);

    li {
      height: 30px;
      line-height: 30px;
      color: #999999;
      cursor: pointer;

      &:hover {
        background: #f2f2f2;
      }
    }
  }

  .user-nav:hover {
    background: #fff;

    .shadow {
      box-shadow: 0 2px 12px 0 rgba(0, 0, 0, .1);
    }

    .el-dropdown-link {
      color: #F04844;

      .fa {
        color: #F04844;
      }
    }

    ul {
      display: block;
    }

  }

  .subnav {
    width: 100vw;
    height: 87px;
    background: #fff;
    z-index: 3;
    border: none;
    border-bottom: 1px #e4e4e4 solid;
    box-shadow: none;

    li {
      float: left;
      width: 110px;
      text-align: center;
      cursor: pointer;

      .fa {
        padding: 10px 0;
        font-size: 28px;
        color: #ccc;
      }

      .cover-img {
        width: 45px;
        height: 45px;
        margin-bottom: 10px;

        .el-image__error {
          line-height: 1.5;
          font-size: 12px;
        }
      }

      .value {
        font-size: 14px;
        color: #666;
      }

      &.active .fa,
      &.active .value,
      &:hover .fa,
      &:hover .value {
        color: #1abc9c;
      }
    }

  }

  .qr-code {
    top: 38px !important;
    padding: 0;
    width: 209px;
    height: 238px;
    color: #999;
    background: #fff;
    box-shadow: 0px 0px 5px rgba(102, 102, 102, 0.349019607843137);
    text-align: center;

    .popper__arrow {
      display: none !important;
    }

    img {
      max-width: 209px;
    }

    .desc:hover {
      color: rgb(204, 204, 204);
    }
  }

  .logo-wrapper {
    display: flex;
    align-items: center;
    justify-content: center;
    margin: 13px 9px 0 0;
    float: left;
    width: 65px;
    height: 65px;
    background: url(./images/u147.png) no-repeat left bottom;
  }

  .login-title {
    float: left;
    width: 120px;
    padding-top: 18px;

    h1 {
      padding-bottom: 7px;
      font-family: 微软雅黑 Bold, 微软雅黑 Regular, 微软雅黑;
      font-size: 28px;
      font-weight: 700;
      color: #999999;
    }

    p {
      font-size: 14px;
      color: #ccc;
    }
  }

  .nav-group {
    position: relative;
    width: 640px;
    float: left;
    padding-top: 29px;

    a {
      position: relative;
      text-rendering: optimizeLegibility;
      display: inline-block;
      margin-right: 8px;
      padding: 0 12px;
      font-size: 14px;
      line-height: 45px;
      color: rgb(102, 102, 102);;
      font-family: 微软雅黑 Bold, 微软雅黑 Regular, 微软雅黑;
      font-weight: 700;

      &:hover,
      &.hover,
      &.selected,
      &.router-link-active {
        color: rgb(26, 188, 156);
      }

      &.link:hover::after {
        display: block;
      }

      &.link::after {
        display: none;
        position: absolute;
        bottom: 0;
        left: 0;
        content: '';
        width: 100%;
        height: 2px;
        background: #1abc9c;
      }

      &.hover::after {
        display: block;
      }

    }

  }

  .header-container {
    .header-wrapper {
      position: relative;
      z-index: 3;
      height: 50px;
      background-color: rgba(51, 51, 51, 1);

      .address-wrapper {
        position: relative;
        float: left;
        display: flex;
        align-items: center;
        width: 400px;
        height: 50px;
        font-size: 14px;

        .address {
          color: #ccc;
          cursor: pointer;
        }
      }

      .link-wrapper {
        position: relative;
        float: right;
        height: 50px;
        display: flex;
        align-items: center;
        color: #666666;
        z-index: 2;

        .router-link-active{
          color:#333;
        }
        .link {
          font-size: 12px;
          color: rgb(204, 204, 204);
          transition: all 0.5s;
          cursor: pointer;

          &:hover {
            color: #fff;
          }
        }

        .mobile {
          padding-left: 13px;
          background: url(./images/3.png) no-repeat left center;
        }

        span {
          padding: 0 7px;
        }
      }
    }

    .nav-container {
      position: relative;
      z-index: 2;
      height: 99px;
      border: 1px rgba(228, 228, 228, 1) solid;

      .nav-wrapper {
        height: 99px;

        .search-wrapper {
          position: relative;
          padding-top: 34px;
          float: left;
          z-index: 6;

          .delete {
            cursor: pointer;
            position: absolute;
            left: 185px;
            top: 43px;
          }

          .context {
            input {
              width: 252px;
              height: 38px;
              padding: 0 38px 0 18px;
              border-radius: 20px;

              &::placeholder {
                color: #666666;
              }
            }
          }

          .search-button {
            position: absolute;
            right: 16px;
            top: 33px;
            color: #ccc;

            &:hover {
              color: rgb(26, 188, 186);
            }
          }
        }
      }
    }
  }

  .my-cart-wrapper {
    position: relative;
    float: left;
    width: 96px;
    padding: 43px 0 0 16px;

    .badge {
      .el-badge__content {
        right: 18px;
        top: -1px;
        background-color: rgba(255, 89, 24, 1);
      }
    }

    .label {
      cursor: pointer;
      padding-left: 23px;
      background: url(./images/2.png) no-repeat left center;
      line-height: 20px;
      font-weight: 400;
      font-size: 14px;
      color: #999999;
    }

  }

  .cart-wrapper {
    padding: 10px 15px;
    box-sizing: border-box;
    width: 326px;
    background: #fff;

    .items {
      max-height: 300px;
      overflow: hidden;
      overflow-y: auto;
      .item {
        display: flex;
        margin-bottom: 10px;

        .cover {
          margin-right: 9px;
          flex: 0 0 80px;
          width: 80px;

          img {
            width: 80px;
            height: 80px;
          }
        }

        .desc {
          flex: 0 0 183px;
          width: 183px;

          .name {
            font-size: 14px;
            line-height: 24px;
            color: #666666;
            display: flex;
            justify-content: space-between;
            cursor: pointer;

            .price {
              font-size: 12px;
              color: #f04844;
            }
          }

          .value {
            display: flex;
            font-size: 12px;
            color: #999;
            line-height: 25px;

            .l {
              display: inline-block;
              max-width: 108px;
              white-space: nowrap;
              text-overflow: ellipsis;
              overflow: hidden;
            }

            .num {
              display: inline-block;
              padding-left: 10px;
            }
          }
        }

        .delete {
          padding: 10px 0 0 10px;
          flex: 1;

          .btn {
            width: 10px;
            height: 9px;
            background: url(./images/4.png);
            cursor: pointer;

            &:hover {
              background: url(./images/5.png);
            }
          }
        }
      }
    }

    .my-cart-button {
      display: flex;
      justify-content: space-between;

      .len {
        font-size: 12px;
        color: #666;
        line-height: 21px;
      }

      .price {
        font-size: 18px;
        line-height: 20px;
        color: #f04844;
      }

      .link-button {
        width: 150px;
        height: 40px;
        background: url(./images/6.png);
        cursor: pointer;
        border: none;
        text-indent: -3333px;
      }
    }
  }

  .fixed-header {
    position: fixed;
    left: 0;
    top: 0;
    width: 100%;
    height: 100%;
    z-index: 99;
    background: #fff;
    height: 80px;
    border-bottom: 1px #e4e4e4 solid;

    .nav-group {
      padding-top: 17px;
    }

    .login-title {
      h1 {
        padding-top: 10px;
      }
    }
  }

</style>
