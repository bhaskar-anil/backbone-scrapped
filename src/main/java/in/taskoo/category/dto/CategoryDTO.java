package in.taskoo.category.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CategoryDTO {
    private Long id;
    private String title;
}