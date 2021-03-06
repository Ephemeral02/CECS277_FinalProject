/*******************************************************************************
 * File Name:		RoachColony.java	
 * Project:			FinalProject_Patterns
 * Designer(s):		Garrett Cross
 * 
 * Purpose:			Represents a roach colony
 * Inputs:			
 * Outputs:			
 * 
 * Copyright � 2020 Garrett Cross. All rights reserved.
 ******************************************************************************/
package main;

/**
 * <tt> RoachColony </tt>
 *
 * @version 0.0.1
 * @since   04/29/20
 */
public class RoachColony
{
    private String name;
    private int population;
    private double growthRate;
    
    /**
     * Instantiates a new roach colony.
     */
    public RoachColony()
    {
        this("",0,1.0);
    }
    
    /**
     * Instantiates a new roach colony.
     *
     * @param name the name
     * @param initPopulation the initial population
     * @param growthRate the growth rate
     */
    public RoachColony(String name, int initPopulation, double growthRate)
    {
        this.name = name;
        this.population = initPopulation;
        this.growthRate = growthRate;
    }
    
    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Gets the population.
     *
     * @return the population
     */
    public int getPopulation()
    {
        return population;
    }

    /**
     * Gets the growth rate.
     *
     * @return the growthRate
     */
    public double getGrowthRate()
    {
        return growthRate;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        return String.format("%s %s %d %.3f", this.getClass().getSimpleName().toUpperCase(), this.name, this.population, this.growthRate);
    }
}
