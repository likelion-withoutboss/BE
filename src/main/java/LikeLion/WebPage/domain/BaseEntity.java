package LikeLion.WebPage.domain;


import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter
@MappedSuperclass
public abstract class BaseEntity {

    @CreationTimestamp // Insert 시 자동으로 값을 채워줌
    private LocalDateTime createdAt;

    @UpdateTimestamp // Update 시 자동으로 값을 채워줌.
    @Setter
    private LocalDateTime updatedAt;


}
