package com.alfajores.services


import com.alfajores.models.repositories.AlfajorRepository
import spock.lang.Specification
import testingUtils.mothers.CreationMother

class AlfajoresServiceImplTest extends Specification {
    def alfajoresRepository = Mock(AlfajorRepository)
    def categoriaService = Mock(CategoriaService)
    def alfajoresService = new AlfajoresServiceImpl(alfajoresRepository, categoriaService)

    def "should returns empty List<Alfajores>"() {
        given:
        alfajoresRepository.findAll() >> []
        def expected = []

        when:
        def resultado = alfajoresService.getAllAlfajores()

        then:
        expected == resultado
    }

    def "should returns all elements"() {
        given:
        alfajoresRepository.findAll() >> expectedAlfajores
        def expected = expectedAlfajores

        when:
        def resultado = alfajoresService.getAllAlfajores()

        then:
        expected == resultado
    }

    static getExpectedAlfajores() {
        return [CreationMother.createAlfajor()]
    }

}
