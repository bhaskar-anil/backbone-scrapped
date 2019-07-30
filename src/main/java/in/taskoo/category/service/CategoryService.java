package in.taskoo.category.service;

import org.springframework.stereotype.Service;

import in.taskoo.category.dto.CategoryDTO;
import in.taskoo.category.mapper.CategoryMapper;
import in.taskoo.category.repository.CategoryRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    public Long save(CategoryDTO dto) {
        return categoryRepository.save(categoryMapper.mapToEntity(dto)).getId();
    }
}