/**
 * Created by litao on 2018/1/3.
 */
$(function(){

})
function testAdd(){
    $.ajax( {
        url:'theme/add',// 跳转到 action
        data:JSON.stringify({"meetingName":"第一次会议"+Math.random(),"meetingTime":new Date().getTime(),"useLandInfo":"这是第一次post请求","others":"嘻嘻嘻"}),
        type:'post',
        cache:false,
        contentType: "application/json; charset=utf-8",
        dataType:'json',
        success:function(data) {
            console.log(data);
        },
        error : function() {
            // view("异常！");
            alert("异常！");
        }
    });
    // $.ajax( {
    //     url:'theme/get/445bc4b2-d4e8-4ec5-b08b-4251c9a93e3f',// 跳转到 action
    //     //data:{"meetingName":"第一次会议","meetingTime":new Date().getTime(),"useLandInfo":"这是第一次post请求","others":"嘻嘻嘻"},
    //     type:'get',
    //     dataType:'json',
    //     success:function(data) {
    //         console.log(data);
    //     },
    //     error : function() {
    //         // view("异常！");
    //         alert("异常！");
    //     }
    // });
}