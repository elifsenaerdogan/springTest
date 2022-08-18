package com.firstProject.elifSena.entity;

import javax.persistence.*;

/**
 * @author Ugur
 */
@Entity(name = "public.department")
@Table(name = "department", schema = "public")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_department")
    @SequenceGenerator(name = "seq_department", sequenceName = "public.seq_department", initialValue = 1, allocationSize = 1)
    Long id;
    private String name;

    private String bolum;

    public Department() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }
}
