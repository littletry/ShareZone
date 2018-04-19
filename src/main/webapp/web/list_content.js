var listContent = avalon.define({
    $id: "listContent",
    contentList: [],
    init: function () {
        $.ajax({
            type: "POST",
            url: "/ShareZone/content/all?page="+"1",
            success: function (result) {
                if (result.code === 0) {
                    listContent.contentList = result.content;
                    console.log(result);
                } else {
                    layer.alert("系统中没有分享内容");
                }
            }
        });
    }

});
var init = function () {
    listContent.init();
}();