package in.taskoo.category.service;

import org.springframework.stereotype.Service;

import in.taskoo.category.dto.CategoryDTO;
import in.taskoo.category.entity.Category;
import in.taskoo.category.mapper.CategoryMapper;
import in.taskoo.category.repository.CategoryRepository;
import in.taskoo.common.exception.DataNotFoundException;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    public Long save(CategoryDTO dto) {
        return categoryRepository.save(categoryMapper.mapToEntity(dto)).getId();
    }

    public CategoryDTO get(Long categoryId) {
        Category category = categoryRepository.findById(categoryId).orElseThrow(DataNotFoundException::new);
        return categoryMapper.mapToCategory(category);
    }
}