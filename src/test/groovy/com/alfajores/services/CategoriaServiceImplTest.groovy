package com.alfajores.services

import com.alfajores.models.repositories.CategoriaRepository
import spock.lang.Specification
import testingUtils.mothers.CreationMother

class CategoriaServiceImplTest extends Specification {
    def categoriaRepository = Mock(CategoriaRepository);
    def categoriaService = new CategoriaServiceImpl(categoriaRepository)

    def "should return a category"() {
        given:
        categoriaRepository.getById(1L) >> CreationMother.createCategoria(1L, "Chocolate")
        def expected = CreationMother.createCategoria(1L, "Chocolate")

        when:
        def result = categoriaService.getCategoria(1L)

        then:
        expected == result
    }

    def "should return empty category"() {
        given:
        def expected = null

        when:
        def result = categoriaService.getCategoria(1L)

        then:
        expected == result
    }

}
