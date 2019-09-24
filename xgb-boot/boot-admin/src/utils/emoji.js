import data from '../views/Service/record/emoji/emoji-data'
let emojiData = {}
Object.values(data).forEach(item => {
    emojiData = { ...emojiData, ...item }
})

/**
 *
 *
 * @export
 * @param {string} value
 * @returns {string}
 */

export function emoji (value) {
    if (!value) return
    Object.keys(emojiData).forEach(item => {
        value = value.replace(new RegExp(item, 'g'), createIcon(item))
    })

    let fileType = matchType(value)
    if(fileType =='image'){
        value = `<img src="${value}" style="max-width:90%;max-height:400px"/>`
    }else if(fileType =='other'){
    }else{
        let name = value.substring(value.lastIndexOf('/')+1)
        value = `<a href="${value}" target="_blank"  style="display: flex;line-height: 30px;padding: 10px 0"><span class="imicon icon-${fileType}" style="color: #1592ef;line-height: 30px;margin-right:5px;font-size:21px;"></span> 查看文件 </a>`
    }
    return value
}

function createIcon (item) {
    const value = emojiData[item]
    const path = './assets/emoji/'
    return `<img src=${path}${value} width="16px" height="16px">`
}


/*
      * @param: fileName - 文件名称
      * @param: 数据返回 1) 无后缀匹配 - false
      * @param: 数据返回 2) 匹配图片 - image
      * @param: 数据返回 3) 匹配 txt - txt
      * @param: 数据返回 4) 匹配 excel - excel
      * @param: 数据返回 5) 匹配 word - word
      * @param: 数据返回 6) 匹配 pdf - pdf
      * @param: 数据返回 7) 匹配 ppt - ppt
      * @param: 数据返回 8) 匹配 视频 - video
      * @param: 数据返回 9) 匹配 音频 - radio
      * @param: 数据返回 10) 其他匹配项 - other
      */
function matchType(fileName) {
    // 后缀获取
    var suffix = '';
    // 获取类型结果
    var result = '';
    try {
        var flieArr = fileName.split('.');
        suffix = flieArr[flieArr.length - 1];
    } catch (err) {
        suffix = '';
    }
    // fileName无后缀返回 false
    if (!suffix) {
        result = false;
        return result;
    }
    // 图片格式
    var imglist = ['png', 'jpg', 'jpeg', 'bmp', 'gif'];
    // 进行图片匹配
    result = imglist.some(function (item) {
        return item == suffix;
    });
    if (result) {
        result = 'image';
        return result;
    };
    // 匹配txt
    var txtlist = ['txt'];
    result = txtlist.some(function (item) {
        return item == suffix;
    });
    if (result) {
        result = 'txt';
        return result;
    };
    // 匹配 excel
    var excelist = ['xls', 'xlsx'];
    result = excelist.some(function (item) {
        return item == suffix;
    });
    if (result) {
        result = 'excel';
        return result;
    };
    // 匹配 word
    var wordlist = ['doc', 'docx'];
    result = wordlist.some(function (item) {
        return item == suffix;
    });
    if (result) {
        result = 'word';
        return result;
    };
    // 匹配 pdf
    var pdflist = ['pdf'];
    result = pdflist.some(function (item) {
        return item == suffix;
    });
    if (result) {
        result = 'pdf';
        return result;
    };
    // 匹配 ppt
    var pptlist = ['ppt'];
    result = pptlist.some(function (item) {
        return item == suffix;
    });
    if (result) {
        result = 'ppt';
        return result;
    };
    // 匹配 视频
    var videolist = ['mp4', 'm2v', 'mkv'];
    result = videolist.some(function (item) {
        return item == suffix;
    });
    if (result) {
        result = 'video';
        return result;
    };
    // 匹配 音频
    var radiolist = ['mp3', 'wav', 'wmv'];
    result = radiolist.some(function (item) {
        return item == suffix;
    });
    if (result) {
        result = 'radio';
        return result;
    }
    // 其他 文件类型
    result = 'other';
    return result;
}
