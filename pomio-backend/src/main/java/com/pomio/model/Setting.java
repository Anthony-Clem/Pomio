package com.pomio.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Setting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int pomodoroTime = 1500;

    private int shortBreakTime = 300;

    private int longBreakTime = 900;

    private String themeColor = "#FF5C58";

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
