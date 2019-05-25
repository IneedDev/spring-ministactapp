package com.romaniuk.ministack.model.entity;

import com.romaniuk.ministack.model.form.RegisterForm;
import lombok.Data;

import javax.persistence.*;

@Entity

//nazwa clasy takasama jak nazwa tabeli

@Table(name = "tuser")
//metodtyy dostepowe porzez lombok

@Data
public class UserEntity {

    //mapowanie entity z nazwami kolumn

    @Id
    @GeneratedValue
    //powyzsze adnotajc edotycza tylko pierwszej ponizszej wartosci
    private int id;
    private String nickname;

    //mapowanie kolumn
    @Column(name ="password_encrypted")
    private String password;
    private String email;

    //spring najpier towrzy na bazie pustego konstruktora obiekt entity


    public UserEntity() {
    }

    public UserEntity(RegisterForm registerForm) {
        this.email=registerForm.getEmail();
        this.nickname=registerForm.getNickname();
        this.password=registerForm.getPassword();
    }
}
