package de.metas.adempiere.form;

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
 * Asks the user a OK/Cancel question.
 * 
 * @author tsa
 *
 */
public interface IAskDialogBuilder
{
	/**
	 * Shows the popup which asks the user and gets the answer.
	 * 
	 * @return user's answer (true=OK, false=Cancel)
	 */
	boolean getAnswer();

	IAskDialogBuilder setParentWindowNo(int windowNo);

	IAskDialogBuilder setParentComponent(final Object parentCompObj);

	IAskDialogBuilder setAD_Message(String adMessage, Object... params);

	IAskDialogBuilder setAdditionalMessage(final String additionalMessage);

	/**
	 * Sets default answer that will be preselected when the popup is displayed to user.
	 * 
	 * @param defaultAnswer
	 * @return this
	 */
	IAskDialogBuilder setDefaultAnswer(boolean defaultAnswer);
}
