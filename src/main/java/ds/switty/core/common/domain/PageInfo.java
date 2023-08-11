package ds.switty.core.common.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PageInfo {

    private int listCount;	//총 게시글 개수
    private int currentPage;//현재 페이지
    private int pageLimit; 	//하단에 보여질 페이징바 최대 개수
    private int boardLimit; //한 페이지에 보여질 게시글 개수

    private int maxPage; 	//가장 마지막 페이지수
    private int startPage;	//페이징바 시작수
    private int endPage;	//페이징바 끝 수


}
