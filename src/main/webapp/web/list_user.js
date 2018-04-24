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
    },
    deleteUser: function (userId) {
        layer.open({
            title: '删除对话框',
            content: "确认删除该用户吗？",
            yes: function () {
                $.ajax({
                    type: "DELETE",
                    url: "/ShareZone/user/delete?userId="+userId,
                    success:function (result) {
                        if (result.code === 0) {
                            layer.alert(result.message, function () {
                                location.replace(location.href);
                            });
                        }else {
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