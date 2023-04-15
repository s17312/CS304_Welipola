package com.example.mybackend0.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BranchDetailsDto {

    private Integer branch_id;
    private String branch_name;
    private String location;

}
