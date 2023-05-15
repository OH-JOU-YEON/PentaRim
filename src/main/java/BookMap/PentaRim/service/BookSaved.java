package BookMap.PentaRim.service;

import BookMap.PentaRim.Book.Dto.*;
import java.util.List;

// 저장소와 연결하고 구현? 아니면 그냥 구현?
public interface BookSaved {

    void Reading(Long id, BookPersonalRequestDto bookPersonalRequestDto);
    void changeState(Long id, String isbn, BookPersonalUpdateStateDto bookPersonalUpdateStateDto);

    void changeAll(Long id, String isbn, BookPersonalUpdateRequestDto bookPersonalUpdateRequestDto);

    void deleteBook(Long id, String isbn);
    List<BookPersonalResponseDto> findByUser(Long id);

    void bookMemoSave(Long id, String isbn, BookMemoRequestDto bookMemoRequestDto);
    void bookMemoUpdate(Long id, BookMemoRequestDto bookMemoRequestDto);

    void bookMemoDelete(Long id);

    List<BookMemoResponseDto> findByUserAndBook(Long id, String isbn);

    BookPersonalMonthStatisticsResponseDto findByMonth(Long id, BookPersonalMonthRequestDto bookPersonalMonthRequestDto);

}