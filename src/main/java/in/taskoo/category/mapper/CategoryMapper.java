package in.taskoo.category.mapper;

import org.springframework.stereotype.Component;

import in.taskoo.category.dto.CategoryDTO;
import in.taskoo.category.entity.Category;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CategoryMapper {
    public Category mapToEntity(CategoryDTO dto) {
        return Category.builder().title(dto.getTitle()).build();
    }
}