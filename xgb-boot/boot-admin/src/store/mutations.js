import * as types from './mutation-types';

const mutataions = {
    [types.SET_PERMISSIONS](state,permissions){
        state.permissions = permissions;
    },
};

export default mutataions;
