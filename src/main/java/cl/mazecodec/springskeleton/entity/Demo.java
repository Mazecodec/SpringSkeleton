package cl.mazecodec.springskeleton.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Demo {
  @Id
  @GeneratedValue
  private Integer id;
  private Date createdAt;
  private Date updatedAt;
  private Date removedAt;
}
