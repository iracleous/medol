package com.quedg.medol.model;

import lombok.Data;

import java.util.Date;

@Data
public class Measurement {
        private int id;
        private String name;
        private Date date;
        private double value;
}
