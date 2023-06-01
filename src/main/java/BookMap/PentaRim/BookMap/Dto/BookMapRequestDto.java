package BookMap.PentaRim.BookMap.Dto;


import BookMap.PentaRim.BookMap.BookMapEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@Component
@NoArgsConstructor
public class BookMapRequestDto {

    private String bookMapTitle; //북맵이름
    private String bookMapContent; //북맵설명
    private String bookMapImage;
    private List<String> hashTag;
    private boolean share;


    @Builder
    public BookMapRequestDto(String bookMapTitle, String bookMapContent, String bookMapImage, List<String> hashTag, boolean share) {
        this.bookMapTitle = bookMapTitle;
        this.bookMapContent = bookMapContent;
        this.bookMapImage = bookMapImage;
        this.hashTag = hashTag;
        this.share = share;
    }

    public BookMapEntity toEntity() {
        return BookMapEntity.builder()
                .bookMapTitle(bookMapTitle)
                .bookMapContent(bookMapContent)
                .share(share)
                .build();
    }

}