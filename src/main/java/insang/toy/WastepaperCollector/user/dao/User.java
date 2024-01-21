package insang.toy.WastepaperCollector.user.dao;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="user_table")
@Getter
@Setter

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userSeqNo;

    @NonNull
    @Column(unique = true, length=30)
    private String id;
}
