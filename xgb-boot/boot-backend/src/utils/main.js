import store from "../store";

function checkPermission(key) {
    return store.getters.permissions.indexOf(key)>= 0;
}

export {
    checkPermission
}
