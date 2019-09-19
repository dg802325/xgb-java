import store from "../store";

function checkPermission(key) {
    console.log(key)
    console.log(store.getters.permissions)
    return store.getters.permissions.indexOf(key)>= 0;
}

export {
    checkPermission
}
