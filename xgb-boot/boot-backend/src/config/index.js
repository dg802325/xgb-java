let dev = process.env.NODE_ENV !== 'production'
const Base_url = dev ? 'http://localhost:10010' : 'http://admin.lovexgb.com'
let host = dev ? 'localhost' : 'http://admin.lovexgb.com'
export {
    Base_url,
    host
}



