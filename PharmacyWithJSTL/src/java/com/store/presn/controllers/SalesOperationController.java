package com.store.presn.controllers;

import com.store.bll.delegate.StoreGetWay;
import com.store.common.beans.DrugsBean;
import com.store.common.beans.SalesBillsBean;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SalesOperationController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String page = request.getParameter("page");
        String operation = request.getParameter("operation");
        StoreGetWay getWay = new StoreGetWay();
        RequestDispatcher dispatcher = null;
        HttpSession session = request.getSession();

        if (page == null || page.equals("") || page.trim().equals("")) {
            dispatcher = request.getRequestDispatcher("index.jsp");
            dispatcher.forward(request, response);
        }

        if (operation == null || operation.equals("") || operation.trim().equals("")) {
            dispatcher = request.getRequestDispatcher("index.jsp");
            dispatcher.forward(request, response);
        }
        if (operation.equals("save")) {
            SalesBillsBean salesBills = new SalesBillsBean();
            String drug1 = (String) request.getParameter("drug1");
            int num1 = Integer.parseInt(request.getParameter("num1"));
            System.out.println(drug1);
            System.out.println(page);
            System.out.println(operation);
            int totalNet = 0;
            int totalProfit = 0;
            if (drug1 != null && num1 != 0) {
                List<DrugsBean> bean1 = getWay.findDrug(drug1);
                if (bean1 != null) {
                    salesBills.setDrug1(bean1.get(0).getName());
                }
                salesBills.setUnitprice1(bean1.get(0).getSellingPrice());
                salesBills.setQuantity1(num1);
                salesBills.setTotal1(num1 * bean1.get(0).getSellingPrice());
                salesBills.setDiscount1(bean1.get(0).getDiscount());
                int net = (num1 * bean1.get(0).getSellingPrice()) - (num1 * bean1.get(0).getDiscount());
                salesBills.setNet1(net);
                int profit = bean1.get(0).getProfit() * num1;
                salesBills.setProfit1(profit);
                totalNet += net;
                totalProfit += profit;

            }
            String drug2 = (String) request.getParameter("drug2");
            int num2 = Integer.parseInt(request.getParameter("num2"));

            if (drug2 != null && num2 != 0) {
                List<DrugsBean> bean1 = getWay.findDrug(drug2);
                if (bean1 != null) {
                    salesBills.setDrug2(bean1.get(0).getName());
                }
                salesBills.setUnitprice2(bean1.get(0).getSellingPrice());
                salesBills.setQuantity2(num2);
                salesBills.setTotal2(num2 * bean1.get(0).getSellingPrice());
                salesBills.setDiscount2(bean1.get(0).getDiscount());
                int net = (num2 * bean1.get(0).getSellingPrice()) - (num2 * bean1.get(0).getDiscount());
                salesBills.setNet2(net);
                int profit = bean1.get(0).getProfit() * num2;
                salesBills.setProfit2(profit);
                totalNet += net;
                totalProfit += profit;

            }
            String drug3 = (String) request.getParameter("drug3");
            int num3 = Integer.parseInt(request.getParameter("num3"));

            if (drug3 != null && num3 != 0) {
                List<DrugsBean> bean1 = getWay.findDrug(drug3);
                if (bean1 != null) {
                    salesBills.setDrug3(bean1.get(0).getName());
                }
                salesBills.setUnitprice3(bean1.get(0).getSellingPrice());
                salesBills.setQuantity3(num3);
                salesBills.setTotal3(num3 * bean1.get(0).getSellingPrice());
                salesBills.setDiscount3(bean1.get(0).getDiscount());
                int net = (num3 * bean1.get(0).getSellingPrice()) - (num3 * bean1.get(0).getDiscount());
                salesBills.setNet3(net);
                int profit = bean1.get(0).getProfit() * num3;
                salesBills.setProfit3(profit);
                totalNet += net;
                totalProfit += profit;
            }
            String drug4 = (String) request.getParameter("drug4");
            int num4 = Integer.parseInt(request.getParameter("num4"));

            if (drug4 != null && num4 != 0) {
                List<DrugsBean> bean1 = getWay.findDrug(drug4);

                if (bean1 != null) {
                    salesBills.setDrug4(bean1.get(0).getName());
                }
                salesBills.setUnitprice4(bean1.get(0).getSellingPrice());
                salesBills.setQuantity4(num4);
                salesBills.setTotal4(num4 * bean1.get(0).getSellingPrice());
                salesBills.setDiscount4(bean1.get(0).getDiscount());
                int net = (num4 * bean1.get(0).getSellingPrice()) - (num4 * bean1.get(0).getDiscount());
                salesBills.setNet4(net);
                int profit = bean1.get(0).getProfit() * num4;
                salesBills.setProfit4(profit);
                totalNet += net;
                totalProfit += profit;
            }

            String drug5 = (String) request.getParameter("drug5");
            int num5 = Integer.parseInt(request.getParameter("num5"));

            if (drug5 != null && num5 != 0) {
                List<DrugsBean> bean1 = getWay.findDrug(drug5);

                if (bean1 != null) {
                    salesBills.setDrug5(bean1.get(0).getName());
                }
                salesBills.setUnitprice5(bean1.get(0).getSellingPrice());
                salesBills.setQuantity5(num5);
                salesBills.setTotal5(num5 * bean1.get(0).getSellingPrice());
                salesBills.setDiscount5(bean1.get(0).getDiscount());
                int net = (num5 * bean1.get(0).getSellingPrice()) - (num5 * bean1.get(0).getDiscount());
                salesBills.setNet5(net);
                int profit = bean1.get(0).getProfit() * num5;
                salesBills.setProfit5(profit);
                totalNet += net;
                totalProfit += profit;
            }
            salesBills.setTotalnet(totalNet);
            salesBills.setTotalprofits(totalProfit);
            java.util.Date date = new java.util.Date(new java.util.Date().getTime());
            salesBills.setBilldate(date);
            int createBill = getWay.createBill();
            salesBills.setBillcode(createBill);
            if (createBill != 0) {
                SalesBillsBean saveSaleBill = getWay.saveSaleBill(salesBills);
                if (saveSaleBill != null) {
                    session.setAttribute("salebill", "1");
                    session.setAttribute("code", createBill);
                } else {
                    session.setAttribute("salebill", "0");

                }
            } else {
                session.setAttribute("salebill", "0");
            }
              response.sendRedirect("MenuController?page=" + page);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // processRequest(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
