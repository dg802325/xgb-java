import {
  Message
} from 'element-ui';

export function message(msg, code='none') {
  if (code === 'none') {
    Message(msg);
  }else if(code==='200'){
    Message.success(msg)
  }else{
    Message.warning(msg)
  }
}
