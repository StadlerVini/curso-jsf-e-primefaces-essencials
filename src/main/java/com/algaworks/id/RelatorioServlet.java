package com.algaworks.id;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/relatorio")
public class RelatorioServlet extends HttpServlet{

	@Inject
	private RelatorioService relatorioService;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		resp.getWriter().println(relatorioService.totalPedidosMesAtual());
	}
}
