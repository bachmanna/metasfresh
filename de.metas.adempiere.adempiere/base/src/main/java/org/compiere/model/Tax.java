package org.compiere.model;

/*
 * #%L
 * ADempiere ERP - Base
 * %%
 * Copyright (C) 2015 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */


import java.sql.Timestamp;
import java.util.Properties;

import org.adempiere.tax.api.ITaxBL;
import org.adempiere.util.Services;

public class Tax
{
	public static int get (Properties ctx, int M_Product_ID, int C_Charge_ID,
			Timestamp billDate, Timestamp shipDate,
			int AD_Org_ID, int M_Warehouse_ID,
			int billC_BPartner_Location_ID, int shipC_BPartner_Location_ID,
			boolean IsSOTrx)
	{
		return Services.get(ITaxBL.class).get(ctx, M_Product_ID, C_Charge_ID, billDate, shipDate, AD_Org_ID, M_Warehouse_ID, billC_BPartner_Location_ID, shipC_BPartner_Location_ID, IsSOTrx);
	}

}
