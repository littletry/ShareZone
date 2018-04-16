var login = avalon.define({
    $id: "login",
    loginName: "",
    password: "",
    init: function () {
       
    },
    enter:function (e) {
        if (e.which == 13){
            login.userLogin();
        }
    },
    userLogin: function () {
        console.log('用户名',login.loginName);
        console.log('密码',login.password);
        if (login.loginName.trim() === '' || login.loginName === null) {
            layer.alert('输入账户为空');
            return;
        }
        if (login.password.trim() === '' || login.password === null) {
            layer.alert('输入密码为空');
        }
        var psd = md5(login.password);
        $.ajax({
            type: 'POST',
            url: '/ShareZone/user/login?loginName=' + login.loginName + '&password=' + psd,
            success: function (result) {
                if (result.code === 0) {
                    layer.alert(result.message);
                    var location = "http://" + window.location.host + "/ShareZone/resources/main.html";
                    window.location.href = location;
                } else if (result.code === 501) {
                    layer.alert(result.message);
                }
            }
        });
    }
});
var init = function () {
}();