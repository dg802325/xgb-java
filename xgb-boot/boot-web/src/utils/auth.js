import Cookies from 'js-cookie'

const TokenKey = 'boot-web-token';

export function getToken() {
    return Cookies.get(TokenKey)
}

export function setToken(token) {
    return Cookies.set(TokenKey, token,{ expires: 1 })
}

export function removeToken() {
    return Cookies.remove(TokenKey)
}


export function getMember() {
    return Cookies.get('boot-web-member')
}

export function setMember(member) {
    return Cookies.set('boot-web-member', member,{ expires: 1 })
}


export function removeMember() {
    return Cookies.remove('boot-web-member')
}
