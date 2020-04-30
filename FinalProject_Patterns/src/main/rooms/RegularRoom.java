/*******************************************************************************
 * File Name:		RegularRoom.java	
 * Project:			FinalProject_Patterns
 * Designer(s):		Garrett Cross
 * 
 * Purpose:			Represents a regular roach room
 * Inputs:			
 * Outputs:			
 * 
 * Copyright � 2020 Garrett Cross. All rights reserved.
 ******************************************************************************/
package main.rooms;

import util.Reference;

/**
 * <tt> RegularRoom </tt>
 *
 * @version 0.0.1
 * @since   04/29/20
 */
public class RegularRoom extends MotelRoom
{
    private static final int PRICE = Reference.ROOM_PRICE_REGULAR;

    public RegularRoom()
    {
        description = "Regular Roach Room";
    }
    
    /* (non-Javadoc)
     * @see main.MotelRoom#cost()
     */
    @Override
    public int costDaily()
    {
        return PRICE;
    }
}