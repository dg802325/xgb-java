import router from './router';
import {Message} from "element-ui";
import { getToken, removeToken } from './utils/auth'
import {get} from "./utils/http";

const whiteList = ['/login', '/404', '/403','/recommendRegistration','/extension','/registUser','/registSuccess'];


router.beforeEach(async (to, from, next) => {
    let _token = getToken();
    if (_token) {
        get('/admin/vrifyToken',{token:_token}).then(res=>{
            if (res==true) {
                if (whiteList.indexOf(to.path) !== -1) {
                    next('/')
                } else {
                    next()
                }
            } else {
                Message('登录超时,请重新登录！')
                removeToken();
                next('/login')
            }
        }).catch(res=>{
            Message('登录超时,请重新登录！')
            removeToken();
            next('/login')
        });

    } else {
        if (isExist(to.path)) {
            next()
        } else {
            next('/login')
        }
    }
})

function isExist(path){
    for(let i=0;i<whiteList.length;i++){
        if(path.indexOf(whiteList[i])!=-1){
            return true
        }
    }
    return false
}

