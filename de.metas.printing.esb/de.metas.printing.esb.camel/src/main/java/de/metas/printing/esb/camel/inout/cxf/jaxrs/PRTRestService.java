package de.metas.printing.esb.camel.inout.cxf.jaxrs;

/*
 * #%L
 * Metas :: Components :: Request-Response Framework for Mass Printing (SMX-4.5.2)
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


import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import de.metas.printing.esb.api.PRTRestServiceConstants;

@Path("/printing/")
public class PRTRestService
{
	/**
	 * Sends feedback regarding the print job to ADempiere.
	 * 
	 * @param transactionId
	 * @param input
	 */
	@POST
	@Path(PRTRestServiceConstants.PATH_Login)
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public void login(
			@PathParam(PRTRestServiceConstants.PARAM_SessionId) int sessionId,
			String input)
	{
		// No body
	}

	/**
	 * 
	 * Sends to ADempiere one AD_PrinterHW record (including media tray and media sizes) as a json string.
	 * 
	 * @param sessionId
	 * @param input
	 * @return
	 */
	@POST
	@Path(PRTRestServiceConstants.PATH_AddPrinterHW)
	@Consumes(MediaType.APPLICATION_JSON)
	public void addPrinterHW(
			@PathParam(PRTRestServiceConstants.PARAM_SessionId) int sessionId,
			String input)
	{
		// No body
	}

	/**
	 * Retrieves the next print package by print job.
	 * 
	 * @param printJobID
	 * @param adSessionId
	 * @return
	 */
	@POST
	@Path(PRTRestServiceConstants.PATH_GetNextPrintPackage)
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String getNextPrintPackage(
			@PathParam(PRTRestServiceConstants.PARAM_SessionId) int sessionId,
			@PathParam(PRTRestServiceConstants.PARAM_TransactionId) String transactionId)
	{
		return null;
	}

	/**
	 * Returns a binary stream of data to be printed.
	 * 
	 * @param PrintPackageID
	 * @param adSessionId
	 * @return
	 */
	@POST
	@Path(PRTRestServiceConstants.PATH_GetPrintPackageData)
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Response getPrintPackageData(
			@PathParam(PRTRestServiceConstants.PARAM_SessionId) int sessionId,
			@PathParam(PRTRestServiceConstants.PARAM_TransactionId) String transactionId)
	{
		return null;
	}

	/**
	 * Sends feedback regarding the print job to ADempiere.
	 * 
	 * @param transactionId
	 * @param input
	 */
	@POST
	@Path(PRTRestServiceConstants.PATH_SendPrintPackageResponse)
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public void sendPrintPackageResponse(
			@PathParam(PRTRestServiceConstants.PARAM_SessionId) int sessionId,
			@PathParam(PRTRestServiceConstants.PARAM_TransactionId) String transactionId,
			String input)
	{
		// No body
	}
}
