package org.adempiere.acct.api.exception;

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


import java.util.Properties;

import org.adempiere.exceptions.AdempiereException;

public class AccountingException extends AdempiereException
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1774967178922781694L;

	public AccountingException(String message)
	{
		super(message);
	}

	public AccountingException(String language, String message, Object[] params)
	{
		super(language, message, params);
	}

	public AccountingException(Properties ctx, String message, Object[] params)
	{
		super(ctx, message, params);
	}

	public AccountingException(String message, Object[] params)
	{
		super(message, params);
	}

	public AccountingException(String message, Throwable cause)
	{
		super(message, cause);
	}

}
