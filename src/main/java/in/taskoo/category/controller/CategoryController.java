package in.taskoo.category.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import in.taskoo.category.dto.CategoryDTO;
import in.taskoo.category.service.CategoryService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Validated
@RestController
@RequestMapping("/categories")
public class CategoryController {
    private final CategoryService categoryService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE, produces = APPLICATION_JSON_UTF8_VALUE)
    public Long post(@RequestBody CategoryDTO category) {
        return categoryService.save(category);
    }

    @GetMapping(path = "/{categoryId}", produces = APPLICATION_JSON_UTF8_VALUE)
    public CategoryDTO get(@PathVariable Long categoryId) {
        return categoryService.get(categoryId);
    }

}