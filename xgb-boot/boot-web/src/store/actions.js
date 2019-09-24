import * as type from './mutation-types';
import {
  $get
} from '../utils/http';
import {
  getToken,
  getMember,
  removeToken,
  removeMember
} from './../utils/auth';

// 查询购物车信息
export const queryCartList = async function ({
  commit
}) {
  const cartList = await getShoppingCart();
  commit(type.SET_CART_LIST, cartList);
}

// 登录成功后调用
export const loginAction = async function ({
  commit
}) {
  const token = getToken();
  if(!token) return;
  const member = getMember();
  const cartList = await getShoppingCart();
  commit(type.SET_TOKEN, token);
  commit(type.SET_MEMBER, JSON.parse(member));
  commit(type.SET_CART_LIST, cartList);
}

// 退出登录
export const loginOutAction = async function ({
  commit
}) {
  removeToken();
  removeMember();
  commit(type.SET_TOKEN, '');
  commit(type.SET_MEMBER, null);
  commit(type.SET_CART_LIST, []);
}

// 获取购物车信息
async function  getShoppingCart(){
  const token = getToken();
  const res = await $get('/api/getShoppingCart', {
    token
  })
  let cartList = [];
  if (res.code === '200'){
    res.shoppingCartCommodityList.forEach(sku => {
      sku.skuPrice = sku.skuPrice || 0;
    });
    cartList = res.shoppingCartCommodityList
  }
  return cartList;
}