package ro.mycode.libraryapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.time.LocalDate;

import static javax.persistence.GenerationType.SEQUENCE;

@Table(name="carte")
@Entity(name="Carte")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Carte {

    @Id
    @SequenceGenerator(name="book_sequence",
            sequenceName = "book_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "book_sequence"
    )

    @Column(name="id")

    private long id;


   @Column (name="book_name",
   nullable = false,columnDefinition = "TEXT")

    @NotEmpty
    private String book_name;

   @Column(
           name="create_at",
           nullable=false,
           columnDefinition = "DATE"
   )

    private LocalDate created_at;

   @Column(
           name="description",
           nullable = false,
           columnDefinition = "TEXT"
   )
   @Not
    private String description;
}
