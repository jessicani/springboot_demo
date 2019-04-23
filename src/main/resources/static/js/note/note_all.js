//加载游记分页的信息（游记记录，分页信息）
var currentPage ;
function loadNote(pageNum){
    console.log("当前页码 pageNum："+pageNum);
    currentPage = pageNum;
    var nextPage  = pageNum +1;
    var previousPage  = pageNum -1;

    $.get("/myspring_demo/note/getall/"+pageNum,{},function (result) {
        var noteList = result.data.noteList;
        var totalPage = result.data.totalPage;
        var totalCount = result.data.totalCount;

        var noteEle ="<li class=\"list-group-item\">\n" +
            "                <a href=\"\" ><img src=\"images/list-1.jpeg\"></a>\n" +
            "                <div class=\"list-dest\">\n" +
            "                    <dl>\n" +
            "                        <dt>\n" +
            "                            <a href=\"\" target=\"_blank\">万山之中，山川出云（贵州环线亲子自驾游）</a>\n" +
            "                        </dt>\n" +
            "                        <dd>\n" +
            "                            <a href=\"\" target=\"_blank\">崭新的旅行拉开了帷幕~ 让我们踏起脚步~ 更多的美景吸引着我们瞩目~ 奔向我们期望的自由之路~ 曾经的美好已悄然离去~ 更多的幸福需要我们孕育~ 让我们开始新的旅程~ 把心中的杂念过滤~ 江从...</a>\n" +
            "                        </dd>\n" +
            "                        <dd>\n" +
            "                            <span>坐标：</span><span>新加披</span>\n" +
            "                            <span>作者：</span><a href=\"\" class=\"note_author\"><span>嘎嘎</span></a>\n" +
            "                        </dd>\n" +
            "                    </dl>\n" +
            "                </div>\n" +
            "            </li>";


        var record = $("#hot_note .list-group");


        //渲染游记数据
        $.each(noteList,function (index,item) {

            console.log("item.noteTitle:"+item.noteTitle);
            console.log("item.noteCity:"+item.noteCity);
            console.log("item.others1:"+item.others1);
            console.log("item.custId:"+item.custId);



            if(pageNum ==1)
                record.append(noteEle);


            var note_html = record.children().eq(index);
            console.log("note_html:" +note_html.html());

            var div = 	note_html.children().eq(1);
            console.log("div:" +div.html());
            var title = div.children().eq(0);
            var city = div.children().eq(1).children().eq(0);
            var author = div.children().eq(1).children().eq(1);
            console.log("title:" +title);
            console.log("city:" +city);
            console.log("author:" +author);

            title.text(item.noteTitle);
            city.text(item.noteCity);
            author.text(item.others1);




        });


        //渲染页码信息

        $(".totalPage").text(totalPage);
        $(".totalCount").text(totalCount);

        //当前页码显示
        $(".currentPage").text(pageNum);

        console.log("当前页码 currentPage："+currentPage);
        // 上一页与下一页显示
        if(pageNum >1)
            $(".preivous").show();
        else{
            $(".preivous").hide();
        }

        if(pageNum ==totalPage)
            $(".next").hide();
        else{
            $(".next").show();
        }
    });
}



loadNote(1);
