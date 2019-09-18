import store from "../store";

function checkPermission(key) {
    console.log(store.getters.permissions)
    console.log(key)
    return store.getters.permissions.indexOf(key)>= 0;
}

export {
    checkPermission
}
