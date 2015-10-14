package de.metas.relation.grid;

/*
 * #%L
 * de.metas.swat.base
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


import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public interface IViewRelationTarget
{
	public void showWindow();

	public void closeWindow();

	/**
	 * The given actionlistener is fired when the component's OK-button is pressed
	 * 
	 * @param l
	 */
	void addOKButtonListener(ActionListener l);

	void addCancelButtonListener(ActionListener l);

	void addWhereClauseChangedListener(PropertyChangeListener l);

	void showError(String message);
}