package microservices.book.multiplication.service;

/**
 * @author by iriyantoperkasa on 7/17/18.
 */
public interface RandomGeneratorService {

    /**
     * @return a randomly-generated factor. It's always a number between 11 and 99.
     */
    int generateRandomFactor();
}
