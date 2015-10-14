package org.adempiere.bpartner.service;

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


public final class ProductHasNoVendorException extends Exception
{
	private static final long serialVersionUID = -7583112372829053131L;

	public ProductHasNoVendorException(final String message, final Throwable cause)
	{
		super(message, cause);
	}

	public ProductHasNoVendorException(final String message)
	{
		super(message);
	}
}
