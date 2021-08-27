package com.digital.crud.saladereuniao.saladereuniao.exception;

import lombok.*;

import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ErrorDetails {

    private Date timestemp;
    private String message;
    private String details;


}
