import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PolynomialTest
{
    private Polynomial polynomial = new Polynomial();

    @Test
    void addTerm()
    {
        Monomial mono = new Monomial(2, 1);
        polynomial.addTerm(mono);

        Monomial mono2 = new Monomial(1, 2);//2x
        polynomial.addTerm(mono2);

        Monomial mono3 = new Monomial(1, 3);//3x
        polynomial.addTerm(mono3);

        System.out.println(polynomial); //=5x + 1x^2
    }

    @Test
    void addPoly()
    {
        Monomial mono = new Monomial(1, 3);//3x
        polynomial.addTerm(mono);
        Monomial mono2 = new Monomial(2, 2);//2x^2
        polynomial.addTerm(mono2);

        System.out.println(polynomial); //=3x + 2x^2

        Polynomial polytoAdd = new Polynomial();

        Monomial monoToAdd = new Monomial(2, 1);//x^2
        Monomial monoToAdd2 = new Monomial(1, 1);//x
        polytoAdd.addTerm(monoToAdd);
        polytoAdd.addTerm(monoToAdd2);

        polynomial.addPoly(polytoAdd);

        System.out.println(polynomial);//adding x^2+x TO 3x+2x^2 SO polynomial = 4x+3x^2
    }

    @Test
    void multiplyBy()
    {
        Monomial mono = new Monomial(1, 3);//3x
        polynomial.addTerm(mono);
        Monomial mono2 = new Monomial(0, 5);//5
        polynomial.addTerm(mono2);

        System.out.println(polynomial);//3x(+5)

        Polynomial polytoMult = new Polynomial();

        Monomial monoToMult = new Monomial(1, 2); //2x
        Monomial monoToMult2 = new Monomial(0, 7); //7
        polytoMult.addTerm(monoToMult);
        polytoMult.addTerm(monoToMult2); //polyToMult = 2x+7

        polynomial.multiplyBy(polytoMult);//multiplying 3x+5 by 2x+7 so polynomial should = 6x^2+31x+35

        System.out.println(polynomial);
    }

    @Test
    void testToString()
    {
        Monomial mono = new Monomial(2, 1);
        polynomial.addTerm(mono);

        System.out.println(polynomial); //=x^2

        Polynomial polytoAdd = new Polynomial();

        Monomial monoToAdd = new Monomial(2, 1);
        Monomial monoToAdd2 = new Monomial(1, 1);
        polytoAdd.addTerm(monoToAdd);
        polytoAdd.addTerm(monoToAdd2);

        polynomial.addPoly(polytoAdd); //adding x^2+x TO x^2 SO polynomial = 2x^2+x


        System.out.println(polynomial);
    }
}