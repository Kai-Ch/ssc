var url = "/ssc/user/checkUser"
var data = {
    "userName": "admin",
    "passWord": "admin"
}
$(function () {
    console.log(1111);
    // alert("jquery");

    postAjax(url, JSON.stringify(data))
})

function postAjax(url, data) {
    $.ajax({
        url: url,
        data: data,
        method: "post",
        cache: false,
        dataType: "json",
        contentType: "application/json;charset=UTF-8",
        async: false,
        success: function (result) {
            return result;
        }
    })
}