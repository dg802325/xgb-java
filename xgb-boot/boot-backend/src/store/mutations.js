import * as types from './mutation-types';

const mutataions = {
    [types.SET_SEAPORTID](state, id) {
        state.seaportId = id;
    },
    [types.SET_GOODS_INTEGRAL_ID](state, id) {
        state.goodsIntegralId = id;
    },
    [types.SET_ORDER_ID](state, id){
      state.orderId = id;
    },
    [types.SET_SETTLEMENTS_ID](state, id){
        state.settlementsId = id;
    },
    [types.SET_PERMISSIONS](state,permissions){
        state.permissions = permissions;
    },
    [types.SET_COMMISSION_NAME](state,name){
        state.commissionName = name;
    },
    [types.SET_MEMBER_ID](state,id){
        state.memberId = id;
    }
};

export default mutataions;
