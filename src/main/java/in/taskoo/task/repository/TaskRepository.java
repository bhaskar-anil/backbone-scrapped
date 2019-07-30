package in.taskoo.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.taskoo.task.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}