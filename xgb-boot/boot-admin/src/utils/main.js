import store from "../store";

/**
 * @function 生成 URLSearchParams参数
 * @param  {Object} 参数对象
 * @return {Object} URLSearchParams对象
 */
function createSearchParams(json) {
    let param = new URLSearchParams();
    for (var key in json) {
        param.append(key, json[key]);
    }
    return param;
}

/**
 * @function 设置字典 Map
 * @param  {Array} 原数组
 * @param  {String} 作为 key 的的字段
 * @param  {String} 作为 value 的的字段
 * @return {Object} 获取到得新的字典
 */
function setDictMap(arr, key, value) {
    key = key || 'cdeCode';
    value = value || 'cdeName';
    let json = {};
    // 遍历数组
    arr.forEach((item) => {
        // 生成 {key:value} 对象 比赋值给json
        json[item[key]] = item[value];
    });
    return json;
}

/**
 * @function dataFormat
 * @param  {Object} 参数
 * @param  {Array} 原数组
 * @return 格式化后的数据
 */
function dataFormat(options, sNodes) {
    let key = options.data.simpleData.idKey;
    let parentKey = options.data.simpleData.pIdKey;
    let childKey = options.data.key.children;
    let name = options.data.key.name;
    // 如果没有 key 或者 key 为空或者没有 sNodes 返回空数组
    if (!key || key === '' || !sNodes) return [];
    let r = [];
    let tmpMap = {};
    // 循环数组， 并将数据中每一项用参数设置的key值作为key存入到tmpMap对象中
    for (let i = 0, l = sNodes.length; i < l; i++) {
        sNodes[i].value = sNodes[i][options.data.simpleData.idKey]
        sNodes[i].label = sNodes[i][options.data.key.name]
        if (!tmpMap[sNodes[i][key]]) {
            sNodes[i].label = sNodes[i][name]
            tmpMap[sNodes[i][key]] = sNodes[i];
        }
    }

    for (let i = 0, l = sNodes.length; i < l; i++) {
        // 如果当前元素有parentId 则作是子节点 如果没有则为父节点
        if (tmpMap[sNodes[i][parentKey]] && sNodes[i][key] !== sNodes[i][parentKey]) {
            let item = tmpMap[sNodes[i][parentKey]];
            // 如果没有children数组 创建children数组
            if (!item[childKey]) {
                item[childKey] = []
            }
             // 标记为子节点
            sNodes[i].isParent = false;
            sNodes[i].open = false
            // 将当前元素添加到父节点的 children数组中
            item[childKey].push(sNodes[i]);
        } else {
            // 标记为父节点
            sNodes[i].isParent = true;
            sNodes[i].open = true;
            r.push(sNodes[i]);
        }
    }
    return {
        map: tmpMap,
        list: r
    };
}

function checkPermission(key) {
    return store.getters.permissions.indexOf(key)>= 0;
}

export {
    createSearchParams,
    setDictMap,
    dataFormat,
    checkPermission
}
