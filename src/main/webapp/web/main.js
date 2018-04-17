var main = avalon.define({
    $id: "main",
    user: "",
    init: function () {
        main.user = $.cookie('user');
    },
    logout: function () {
        $.removeCookie('user');
        window.location.href = "http://" + window.location.host + "/ShareZone/resources/login.html";
    },
    checkUser: function () {
        var user = $.cookie('user');
        if (user === null || user === "") {
            layer.alert('请重新登录', '', function(){
                window.location.href = "http://" + window.location.host + "/ShareZone/resources/login.html";
            });
        }
    }

});
var init = function () {
    main.checkUser();
    main.init();
}();