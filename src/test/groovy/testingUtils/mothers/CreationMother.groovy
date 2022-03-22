package testingUtils.mothers

import com.alfajores.models.entities.Alfajor
import com.alfajores.models.entities.Categoria

class CreationMother {
    static Alfajor createAlfajor() {
        return Alfajor.builder()
                .id(1L)
                .name("Jorgito")
                .description("Es muy rico")
                .weight(100)
                .price(150)
                .categoria(createCategoria(1L, "Chocolate"))
                .build()
    }

    static Categoria createCategoria(id, name) {
        return Categoria.builder()
                .id(id)
                .name(name)
                .build()
    }
}
