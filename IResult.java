public interface IResult {
    boolean isValid (); // determines whether the results are expected or reasonable
    IContestant getWinner (); // determines  the winner of the two contestants
}
