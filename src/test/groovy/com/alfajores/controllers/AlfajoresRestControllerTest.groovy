package com.alfajores.controllers

import com.alfajores.services.AlfajoresService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import spock.lang.Specification
import testingUtils.mothers.CreationMother

class AlfajoresRestControllerTest extends Specification {
    def alfajoresService = Mock(AlfajoresService)
    def alfajoresRestController = new AlfajoresRestController(alfajoresService)

    def "should return empty list"() {
        given:
        alfajoresService.getAllAlfajores() >> []
        def expected = new ResponseEntity([], HttpStatus.OK)

        when:
        def result = alfajoresRestController.getAllAlfajores()

        then:
        expected == result
    }

    def "should a List<Alfajores>"() {
        given:
        alfajoresService.getAllAlfajores() >> expectedAlfajores
        def expected = new ResponseEntity(expectedAlfajores, HttpStatus.OK)

        when:
        def result = alfajoresRestController.getAllAlfajores()

        then:
        expected == result
    }

    static getExpectedAlfajores() {
        return [CreationMother.createAlfajor()]
    }
}
