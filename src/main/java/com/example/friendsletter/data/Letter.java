package com.example.friendsletter.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

@RequiredArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "letters")
public class Letter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "letter_gen")
    @SequenceGenerator(name = "letter_gen", sequenceName = "letters_SEQ", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;
    private String letterShortCode;
    private String messageId;
    private LocalDateTime expirationDate;
    private boolean singleUse;
    private boolean publicLetter;
    private LocalDateTime created;

    //Lombok can't exclude field from @AllArgsConstructor, so...
    public Letter(String letterShortCode, String messageId, LocalDateTime expirationDate, boolean singleUse, boolean publicLetter) {
        this.letterShortCode = letterShortCode;
        this.messageId = messageId;
        this.expirationDate = expirationDate;
        this.singleUse = singleUse;
        this.publicLetter = publicLetter;
        this.created = LocalDateTime.now(ZoneOffset.UTC);
    }
}
