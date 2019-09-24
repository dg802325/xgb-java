export  function confirm(msg){
  let oConfirm = document.createElement('div');
  oConfirm.className = 'v-confirm-model';
  oConfirm.innerHTML = `
    <div class="v-confirm-wrapper">
    <div class="header">${msg}<span class="close"></span></div>
    <div class="buttons">
      <a href="javacript:;" class="btn default" >取消</a>
      <a href="javacript:;" class="btn danger" >确定</a>
    </div>
  </div>
  `
  document.body.appendChild(oConfirm);
  return new Promise((resolve,reject)=>{
    let cancelBtn = document.querySelector('.v-confirm-model .default');
    cancelBtn.addEventListener('click',function(){
      document.body.removeChild(oConfirm);
      reject()
    },false);
    let okBtn = document.querySelector('.v-confirm-model .danger');
    okBtn.addEventListener('click',function(){
      document.body.removeChild(oConfirm);
      resolve();
    },false);

  })
}

