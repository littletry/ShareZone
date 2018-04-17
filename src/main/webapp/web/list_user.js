var listUser = avalon.define({
    $id: "listUser",
    userList: [],
    init: function () {
        $.ajax({
            type: "GET",
            url: "/ShareZone/user/all?page="+"1",
            success: function (result) {
                if (result.code === 0) {
                    listUser.userList = result.content;
                } else {
                    layer.alert("系统中没有用户");
                }
            }
        });
    }

});
var init = function () {
    listUser.init();
}();