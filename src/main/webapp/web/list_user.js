var listUser = avalon.define({
    $id: "listUser",
    userList: [],
    init: function () {
        $.ajax({
            type: "POST",
            url: "/ShareZone/user/all?page="+"1",
            success: function (result) {
                if (result.code === 0) {
                    listUser.userList = result.content;
                } else {
                    layer.alert("系统中没有用户");
                }
            }
        });
    },
    changeUser: function (userId) {
        console.log(userId);
        layer.open({
            title: '重置密码',
            content: "<div>新密码：<input type='text' class='input-text' id='newPassword'></div>",
            yes: function () {
                var newPassword = md5(window.document.getElementById('newPassword').value);
                $.ajax({
                    type: "POST",
                    url: "/ShareZone/user/setPassword?userId="+userId+"&newPassword="+newPassword,
                    success:function (result) {
                        if (result.code === 0) {
                            layer.alert(result.message);
                        }
                    }
                });
            }
        });
    }

});
var init = function () {
    listUser.init();
}();