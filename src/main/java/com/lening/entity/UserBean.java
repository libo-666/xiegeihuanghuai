package com.lening.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Data
@Table(name = "tb_user")
public class UserBean implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;

   private String name;
   private int age;
   private int gid;

   private String gname;

   @DateTimeFormat(pattern = "yyyy-MM-dd")
   private Date birthday;



}
