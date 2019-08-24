let dev = process.env.NODE_ENV !== 'production'
// const Base_url = dev ? 'http://localhost:20910' : 'https://zhuzubao.com'
const Base_url = dev ? 'http://localhost:10010' : 'http://supplier.e-nongye.com.cn'
let host = dev ? 'localhost' : 'http://supplier.e-nongye.com.cn'
export {
    Base_url,
    host
}



