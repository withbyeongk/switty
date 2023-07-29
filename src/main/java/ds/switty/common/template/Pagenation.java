package ds.switty.common.template;

import ds.switty.common.domain.PageInfo;

public class Pagenation {

    public static PageInfo getPageinfo(int listCount,
                                       int currentPage,
                                       int pageLimit,
                                       int boardLimit) {

        if (currentPage < 1) {
            currentPage = 1;
        }

        int maxPage = (int)(Math.ceil(((double)listCount / boardLimit)));

        if (maxPage <= currentPage) {
            currentPage = maxPage;
        }

        int startPage = (currentPage-1)/pageLimit * pageLimit + 1;

        int endPage = startPage + pageLimit - 1;

        //startPage가 11일때 endPage는 20으로 된다 (만약 maxPage가 13이라면?)
        //endPage를 maxPage로 변경
        if(endPage>maxPage) {
            endPage = maxPage;
        }

        return new PageInfo(listCount,currentPage,pageLimit,boardLimit,maxPage,startPage,endPage);

    }
}
