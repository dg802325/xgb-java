import axios from 'axios';
import QS from 'qs';
import MD5 from 'md5.js';
import {host} from "../config";
import store from '../store/index';

axios.defaults.withCredentials = true;

export function resizeParams(params={}){
    params.nonce = Math.random();
    params.timestamp = Date.now();
    let signParams = `20980`;
    const md5stream = new MD5();
    let parasArr = [];
    for(let key in params){
        if(params[key]!=undefined && key!=='file'){
            parasArr.push(key);
        }
    }
    parasArr = parasArr.sort()
   for(let i=0;i<parasArr.length;i++){
       let item = parasArr[i];
       signParams+=`${item}=${params[item]}`
   }
   const sign =  md5stream.update(signParams).digest('hex').toUpperCase().substring(0,8);
   return Object.assign({sign},params)
}


/**
 * post方法，对应post请求
 * @param {String} url 请求的url地址
 * @param {Object} params 请求参数
 */
export function $post(url, params={}) {
    let _params = resizeParams(params)
    return new Promise((resolve, reject) => {
        axios.post(host+url, QS.stringify(_params))
            .then(res => {
                resolve(res.data);
            })
            .catch(err =>{
                reject(err)
            })
    });
}

/**
 * get方法，对应get请求
 * @param {String} url 请求的url地址
 * @param {Object} params 请求时携带的参数
 */
export function $get(url, params={}) {
    let _params = resizeParams(params)
    return new Promise((resolve, reject) =>{
        axios.get( host + url, {
            params:_params
        }).then(res => {
            resolve(res.data);
        }).catch(err =>{
            reject(err)
        })
    });

}

export function fileUpload(url,file){
    return new Promise(resolve => {
        axios({
            method: 'post',
            url: host+url,
            headers: {
                Accept: '*/*'
            },
            data: file,
            processData: false,
            contentType: false,
        }).then((res)=>{
            resolve(res.data)
        })
    })
}

// axios.interceptors.response.use(function (response) {
//     console.log(response.data)
//     return response;
//   }, function (error) {
//     return Promise.reject(error);
//   });

