package exercises;

import java.awt.*;
import java.io.Serializable;

/**
 * @author MarkChern
 */
public class Loan implements Serializable
{
    private double loanAmonut;
    private double annualInterestRate;
    private int loanYear = 1;
    private java.util.Date loanDay;

    public Loan()
    {
        loanAmonut = 0;
        annualInterestRate = 0.025;
        loanDay = new java.util.Date();
    }

    @Override
    public String toString()
    {
        return "Loan{" +
                "loanAmonut=" + loanAmonut +
                ", annualInterestRate=" + annualInterestRate +
                ", loanYear=" + loanYear +
                ", loanDay=" + loanDay +
                '}';
    }
}
