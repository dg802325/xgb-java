
import axios from 'axios';
import QS from 'qs';
import { Base_url } from '../config/index';

axios.defaults.withCredentials = true;

/**
 * post方法，对应post请求
 * @param {String} url 请求的url地址
 * @param {Object} params 请求参数
 */
export function post(url, params) {
    return new Promise((resolve, reject) => {
         axios.post(Base_url + url, QS.stringify(params))
        .then(res => {
            resolve(res.data);
        })
        .catch(err =>{
            reject(err.data)
        })
    });
}

/**
 * get方法，对应get请求
 * @param {String} url 请求的url地址
 * @param {Object} params 请求时携带的参数
 */
export function get(url, params) {
    return new Promise((resolve, reject) =>{
        axios.get(Base_url + url, {
            params
        }).then(res => {
            resolve(res.data);
        }).catch(err =>{
            reject(err.data)
    })
});}

export function fileUpload(url,file){
    return new Promise(resolve => {
        axios({
            method: 'post',
            url: Base_url+url,
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