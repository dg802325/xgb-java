let dev = process.env.NODE_ENV !== 'production';
let host = dev ? 'http://localhost:10010' : 'http://admin.lovexgb.com';

export {
    host
}
