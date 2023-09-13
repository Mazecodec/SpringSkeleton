package cl.mazecodec.springskeleton.repository;

import cl.mazecodec.springskeleton.entity.Demo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepository extends JpaRepository<Demo, Integer> {
}
