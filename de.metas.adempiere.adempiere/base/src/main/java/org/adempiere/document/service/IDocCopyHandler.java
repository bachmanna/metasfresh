package org.adempiere.document.service;

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


/**
 * Document copy handler, provides DocLineCopyHandler access
 * 
 * @author al
 * 
 * @param <HT> header type (document type)
 * @param <LT> line type (document line type)
 */
public interface IDocCopyHandler<HT extends Object, LT extends Object> extends ICopyHandler<HT>
{
	/**
	 * @return implementation of the {@link IDocLineCopyHandler} for this document handler.
	 *         <p>
	 *         If your implementation dies not need a line handler, then please return the result of {@link ICopyHandlerBL#getNullDocLineCopyHandler()}.
	 */
	IDocLineCopyHandler<LT> getDocLineCopyHandler();
}
