package com.dk.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dk.Entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact,Serializable>{

}
