import * as types from './mutation-types';

const mutataions = {
  [types.SET_FIRSTMENU](state, firstMenu) {
    state.firstMenu = firstMenu;
  },
  [types.SET_TWOMENU](state, twoMenu) {
    state.twoMenu = twoMenu;
  },
  [types.SET_CART_LIST](state, cartList) {
    state.cartList = cartList;
  },
  [types.SET_TOKEN](state,token){
    state.token = token;
  },
  [types.SET_MEMBER](state,member){
    state.member = member;
  },
  [types.SET_REGIONMAP](state,regionMap){
    state.regionMap = regionMap;
  },
  [types.SET_REGIONS](state,regions){
    state.regions = regions;
  },
  [types.SET_LOCATION](state,location){
    state.location = location;
  },
  [types.SET_CODE](state,code){
    state.code = code;
  }
};

export default mutataions;
