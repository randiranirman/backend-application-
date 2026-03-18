package org.devops.basicdevops.dto;

import jakarta.validation.constraints.NotBlank;

public record CustomerDto(@NotBlank String name , @NotBlank String email ,@NotBlank String username,@NotBlank  String phoneNumber) {


}
