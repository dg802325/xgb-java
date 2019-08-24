let dev = process.env.NODE_ENV !== 'production'
const Base_url = dev ? 'http://localhost:10010' : 'http://dealer.e-nongye.com.cn'
let host = dev ? 'localhost' : 'http://dealer.e-nongye.com.cn'
export {
    Base_url,
    host
}


