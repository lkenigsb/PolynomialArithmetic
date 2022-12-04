import java.util.*;

public class Polynomial
{
    private GDSLL<Monomial> poly;

    public Polynomial()
    {
        poly = new GDSLL<Monomial>();
    }

    /**
     * mutator addTerm term to the polynomial poly <br>
     * e.g. if poly is 1 + 2x  <br>
     * then addTerm(3x) should result in poly being 1 + 5x
     *
     * @param term Monomial to be added
     */
    public void addTerm(Monomial term)
    {
        // TODO write this method
        boolean added = false;


        Iterator<Monomial> iterator = poly.ascIterator();
        while (iterator.hasNext())
        {
            Monomial current = iterator.next();
            if (current.compareTo(term) == 0) //this means we found the matching degree)
            {
                double theCoefficient = current.getCoeff();
                theCoefficient += term.getCoeff();

                current.setCoeff(theCoefficient);

                added = true;
            }
        }

        if (!added)//our type of term wasn't found AKA just need to add it to the end
        {
            poly.insert(term);
        }
    }

    /**
     * mutator addPoly: add another polynomial to this one e.g. <br>
     * if our poly is 1 + 2x <br>
     * and the other is 3 + x^2 <br>
     * then addPoly should transform our poly to 4 + 3x + x^2 -->meant to be 4 + 2x + x^2
     *
     * @param other Polynomial to add to this one
     */
    public void addPoly(Polynomial other)
    {
        // TODO write this method
        Iterator<Monomial> iterator = other.poly.ascIterator();
        while (iterator.hasNext())
        {
            addTerm(iterator.next());
        }
    }

    /**
     * multiply this polynomial by other <br>
     * for example if this is 1+2x+3x^ and other = 1 -3x^2, <br>
     * then this should become 1+2x-6x^3-9x^4
     *
     * @param other Polynomial to multiply this one by
     */
    public void multiplyBy(Polynomial other)
    {
        // TODO write this method
        Polynomial tempPoly = new Polynomial();
        Iterator<Monomial> polyIterator = poly.ascIterator();
        while (polyIterator.hasNext())
        {
            Monomial curr = polyIterator.next();
            tempPoly.addTerm(curr);
            poly.remove(curr);
        }
        //right now we have an empty poly and a tempPoly containing our OG poly which we want to multiply by other

        Iterator<Monomial> iteratorCurr = tempPoly.poly.ascIterator();
        while (iteratorCurr.hasNext())
        {
            Monomial curr = iteratorCurr.next();

            Iterator<Monomial> iteratorOther = other.poly.ascIterator();
            while (iteratorOther.hasNext())
            {
                Monomial otherMono = iteratorOther.next();

                double coeffMultiply = curr.getCoeff();
                coeffMultiply *= otherMono.getCoeff();

                int degreeAdded = curr.getDegree();
                degreeAdded += otherMono.getDegree();

                Monomial addToPoly = new Monomial(degreeAdded, coeffMultiply);
                addTerm(addToPoly);
            }
        }
    }

    public String toString()
    {
        String strRet = "";
        if (poly != null)
        {
            Iterator<Monomial> it = poly.ascIterator();
            while (it.hasNext())
            {
                Monomial term = it.next();
                strRet += term.toString();
                strRet += " + ";
            }
            strRet = strRet.substring(0, strRet.length() - 3); // eat last " + "
        }
        return strRet;
    }
}
