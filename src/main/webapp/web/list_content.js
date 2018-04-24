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
                } else {
                    layer.alert("系统中没有分享内容");
                }
            }
        });
    },
    changeContent: function (contentId) {
        layer.confirm('确认通过该分享内容吗？', {
            btn: ['通过', '不通过']
        }, function(){
            $.ajax({
                type: "POST",
                url: "/ShareZone/content/change?contentId=" + contentId + "&checkPublish=1",
                success: function (result) {
                    if (result.code === 0) {
                        layer.alert(result.message, function () {
                            location.replace(location.href);
                        });
                    } else {
                        layer.alert(result.message, function () {
                            location.replace(location.href);
                        });
                    }
                }
            });
        }, function(){
            $.ajax({
                type: "POST",
                url: "/ShareZone/content/change?contentId=" + contentId + "&checkPublish=2",
                success: function (result) {
                    if (result.code === 0) {
                        layer.alert(result.message, function () {
                            location.replace(location.href);
                        });
                    } else {
                        layer.alert(result.message, function () {
                            location.replace(location.href);
                        });
                    }
                }
            });
        });
    }

});
var init = function () {
    listContent.init();
}();