/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package de.metas.adempiere.model;

import java.sql.ResultSet;
import java.util.Properties;

/** Generated Model for C_CountryArea
 *  @author Adempiere (generated) 
 */
@SuppressWarnings("javadoc")
public class X_C_CountryArea extends org.compiere.model.PO implements I_C_CountryArea, org.compiere.model.I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 2121315776L;

    /** Standard Constructor */
    public X_C_CountryArea (Properties ctx, int C_CountryArea_ID, String trxName)
    {
      super (ctx, C_CountryArea_ID, trxName);
      /** if (C_CountryArea_ID == 0)
        {
			setC_CountryArea_ID (0);
			setName (null);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_C_CountryArea (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }


    /** Load Meta Data */
    @Override
    protected org.compiere.model.POInfo initPO (Properties ctx)
    {
      org.compiere.model.POInfo poi = org.compiere.model.POInfo.getPOInfo (ctx, Table_Name, get_TrxName());
      return poi;
    }

    @Override
    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_C_CountryArea[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Country Area.
		@param C_CountryArea_ID Country Area	  */
	@Override
	public void setC_CountryArea_ID (int C_CountryArea_ID)
	{
		if (C_CountryArea_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_CountryArea_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_CountryArea_ID, Integer.valueOf(C_CountryArea_ID));
	}

	/** Get Country Area.
		@return Country Area	  */
	@Override
	public int getC_CountryArea_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_CountryArea_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	@Override
	public void setName (java.lang.String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	@Override
	public java.lang.String getName () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_Name);
	}

	/** Set Suchschlüssel.
		@param Value 
		Suchschlüssel für den Eintrag im erforderlichen Format - muss eindeutig sein
	  */
	@Override
	public void setValue (java.lang.String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Suchschlüssel.
		@return Suchschlüssel für den Eintrag im erforderlichen Format - muss eindeutig sein
	  */
	@Override
	public java.lang.String getValue () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_Value);
	}
}