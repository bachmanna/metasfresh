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
package de.metas.dpd.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.compiere.model.MTable;
import org.compiere.util.KeyNamePair;

/** Generated Interface for DPD_Country
 *  @author Adempiere (generated) 
 *  @version Release 3.5.4a
 */
public interface I_DPD_Country 
{

    /** TableName=DPD_Country */
    public static final String Table_Name = "DPD_Country";

    /** AD_Table_ID=540128 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 7 - System - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Mandant.
	  * Mandant fuer diese Installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organisation.
	  * Organisatorische Einheit des Mandanten
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organisation.
	  * Organisatorische Einheit des Mandanten
	  */
	public int getAD_Org_ID();

    /** Column name CountryCode */
    public static final String COLUMNNAME_CountryCode = "CountryCode";

	/** Set ISO Laendercode.
	  * Zweibuchstabiger ISO Laendercode gemaess ISO 3166-1 - http://www.chemie.fu-berlin.de/diverse/doc/ISO_3166.html
	  */
	public void setCountryCode (String CountryCode);

	/** Get ISO Laendercode.
	  * Zweibuchstabiger ISO Laendercode gemaess ISO 3166-1 - http://www.chemie.fu-berlin.de/diverse/doc/ISO_3166.html
	  */
	public String getCountryCode();

    /** Column name CountryCodeLong */
    public static final String COLUMNNAME_CountryCodeLong = "CountryCodeLong";

	/** Set CountryCodeLong.
	  * ISO-Alpha3CountryCode
	  */
	public void setCountryCodeLong (String CountryCodeLong);

	/** Get CountryCodeLong.
	  * ISO-Alpha3CountryCode
	  */
	public String getCountryCodeLong();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Erstellt.
	  * Datum, an dem dieser Eintrag erstellt wurde
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Erstellt durch.
	  * Nutzer, der diesen Eintrag erstellt hat
	  */
	public int getCreatedBy();

    /** Column name DPD_Country_ID */
    public static final String COLUMNNAME_DPD_Country_ID = "DPD_Country_ID";

	/** Set DPD_Country	  */
	public void setDPD_Country_ID (int DPD_Country_ID);

	/** Get DPD_Country	  */
	public int getDPD_Country_ID();

    /** Column name DPD_FileInfo_ID */
    public static final String COLUMNNAME_DPD_FileInfo_ID = "DPD_FileInfo_ID";

	/** Set DPD_FileInfo	  */
	public void setDPD_FileInfo_ID (int DPD_FileInfo_ID);

	/** Get DPD_FileInfo	  */
	public int getDPD_FileInfo_ID();

	public de.metas.dpd.model.I_DPD_FileInfo getDPD_FileInfo() throws RuntimeException;

    /** Column name FlagPostCodeNo */
    public static final String COLUMNNAME_FlagPostCodeNo = "FlagPostCodeNo";

	/** Set FlagPostCodeNo.
	  * Flags if country has *no* post code system
	  */
	public void setFlagPostCodeNo (boolean FlagPostCodeNo);

	/** Get FlagPostCodeNo.
	  * Flags if country has *no* post code system
	  */
	public boolean isFlagPostCodeNo();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Aktiv.
	  * Der Eintrag ist im System aktiv
	  */
	public void setIsActive (boolean IsActive);

	/** Get Aktiv.
	  * Der Eintrag ist im System aktiv
	  */
	public boolean isActive();

    /** Column name Languages */
    public static final String COLUMNNAME_Languages = "Languages";

	/** Set Languages	  */
	public void setLanguages (String Languages);

	/** Get Languages	  */
	public String getLanguages();

    /** Column name NumCountryCode */
    public static final String COLUMNNAME_NumCountryCode = "NumCountryCode";

	/** Set NumCountryCode.
	  * ISO-3166-NumCountryCode
	  */
	public void setNumCountryCode (int NumCountryCode);

	/** Get NumCountryCode.
	  * ISO-3166-NumCountryCode
	  */
	public int getNumCountryCode();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Aktualisiert.
	  * Datum, an dem dieser Eintrag aktualisiert wurde
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Aktualisiert durch.
	  * Nutzer, der diesen Eintrag aktualisiert hat
	  */
	public int getUpdatedBy();
}
