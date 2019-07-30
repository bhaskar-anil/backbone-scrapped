package in.taskoo.task.dto;

import in.taskoo.category.dto.CategoryDTO;
import lombok.Data;

@Data
public class TaskDTO {
    private Long id;
    private String title;
    private CategoryDTO categoryDTO;
}