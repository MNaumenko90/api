package api.builders;

import api.dto.request.book.AddBookDto;
import api.dto.request.book.IsbnDto;

import java.util.List;

public class BookBuilders {

    public AddBookDto defaultBookDtoBuilder() {
        return AddBookDto.builder()
                .userId("9d78c0f9-52dc-4ff7-a433-43b557960e3b")
                .collectionOfIsbns(List.of(IsbnDto.builder().isbn("9781449325862").build()))
                .build();
    }
}
