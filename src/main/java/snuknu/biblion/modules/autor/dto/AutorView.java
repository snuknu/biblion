package snuknu.biblion.modules.autor.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AutorView(

        @NotNull
        Long autorId,

        @NotBlank
        String nome) {
}
