
var browser = {  
    versions : function() {
        var u = navigator.userAgent;  
        return {
            trident : u.indexOf('Trident') > -1, // IE内核
            presto : u.indexOf('Presto') > -1, // opera内核
            webKit : u.indexOf('AppleWebKit') > -1, // 苹果、谷歌内核
            gecko : u.indexOf('Gecko') > -1 && u.indexOf('KHTML') == -1, // 火狐内核
            mobile : !!u.match(/AppleWebKit.*Mobile.*/)
                    || !!u.match(/AppleWebKit/), // 是否为移动终端
            ios : !!u.match(/\(i[^;]+;( U;)? CPU.+Mac OS X/), // ios终端
            android : u.indexOf('Android') > -1 || u.indexOf('Linux') > -1, // android终端或者uc浏览器
            iPhone : u.indexOf('iPhone') > -1 || u.indexOf('Mac') > -1, // 是否为iPhone或者QQHD浏览器
            iPad : u.indexOf('iPad') > -1, // 是否iPad
            webApp : u.indexOf('Safari') == -1,

            ie: u.indexOf("MSIE") > 0,
            ie6: u.indexOf("MSIE") > 0 && u.indexOf("MSIE 6.0") > 0,
            ie7: u.indexOf("MSIE") > 0 && u.indexOf("MSIE 7.0") > 0,
            ie8: u.indexOf("MSIE") > 0 && u.indexOf("MSIE 8.0") > 0 && !window.innerWidth,
            ie9: u.indexOf("MSIE") > 0 && u.indexOf("MSIE 9.0") > 0,
            ie10: u.indexOf("MSIE") > 0 && u.indexOf("MSIE 10.0") > 0
        };
    }(),
    language : (navigator.browserLanguage || navigator.language).toLowerCase()
}