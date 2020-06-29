package co.tala.practice.kotlin

import spock.lang.*

@Title("Test all Maths operations")
class MathOperationsSpec extends Specification {
    def "Add"() {
        given:
            def m = new MathOperations()
        when:
            def result = m.add(2,4)
        then:
            result == 6
    }

    def "Subtract"() {
        given:
            def m = new MathOperations()
        when:
            def result = m.subtract(5,1)
        then:
            result == 4
    }

    def "Multiply"() {
        given:
            def m = new MathOperations()
        when:
            def result = m.multiply(5,2)
        then:
            result == 10
    }

    def "Divide"() {
        given:
            def m = new MathOperations()
        when:
            def result = m.divide(10,2)
        then:
            result == 5
    }
}
