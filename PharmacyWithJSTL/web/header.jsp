<%@ taglib prefix="c"       uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"     uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn"      uri="http://java.sun.com/jsp/jstl/functions" %>


<%@page import="com.store.common.beans.AdminBean"%>
<%@page import="java.util.HashSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="com.store.presn.constansApp.*"%>
<!DOCTYPE html>

<html lang="en">

    <head>
        <title><%=   request.getAttribute(Constants.TITLE_ATTRIBUTE)  %></title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <style>
            body{
                margin: 0px;
                padding: 0px;
            }
            .head{ 
                background-color: #69f4f2;
                margin: 0px;
                height: 70px;
                width: 100%;
            }
            .head-1{
                display: inline;
                color: blue;
                float: left;
                padding-left: 40px;
                padding-top: 20px;
                font-size: 30px;
            }
            .admin{
                float: right;
                padding-right: 50px;
                padding-top: 20px;
                font-size: 20px;
            }
            a{
                text-decoration: none;
            }


            body {
                font-family: Arial, Helvetica, sans-serif;
            }

            .navbar {
                overflow: hidden;
                background-color: #333;
            }

            .navbar a {
                float: left;
                font-size: 16px;
                color: white;
                text-align: center;
                padding: 14px 16px;
                text-decoration: none;
            }

            .dropdown {
                float: left;
                overflow: hidden;
            }

            .dropdown .dropbtn {
                font-size: 16px;  
                border: none;
                outline: none;
                color: white;
                padding: 14px 16px;
                background-color: inherit;
                font-family: inherit;
                margin: 0;
                width: 100%;
            }

            .navbar a:hover,  .dropbtn:hover  {
                background-color: red;
            }

            .dropdown-content {
                display: none;
                position: absolute;
                background-color: #f9f9f9;
                min-width: 160px;
                box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
                z-index: 1;
            }
            .dropdown-content1 {
                display: none;
                position:absolute;
                background-color: #f9f9f9;
                min-width: 100px;
                box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
                z-index: 1;

            }

            .dropdown-content a {
                float: none;
                color: black;
                padding: 12px 16px;
                text-decoration: none;
                display: block;
                text-align: left;
            }
            .dropdown-content1 a {
                float: none;
                color: black;
                padding: 12px 16px;
                text-decoration: none;
                display: block;
                text-align: left;
            }
            .dropdown-content a:hover {
                background-color: #ddd;
            }

            .dropdown:hover .dropdown-content{
                display:block;
            }
            .link:hover .dropdown-content1{
                display:inline;
            }

        </style>

    </head>
    <body>
        <div class="head">
            <div class="head-1">
                <a href="MenuController?page=home">PHARMACARE</a>
            </div>
            <div class="admin">
                  <a href="MenuController?page=home" class="js-logo-clone"> ${log.name} </a>
            </div>
        </div>
        <div  class="navbar" >
            <a href="MenuController?page=home">Home</a>
            <!--#############################################################################-->
            <div  class="dropdown">
                <button class="dropbtn" >Sales</button>
                <div class="dropdown-content">
                    <a  href="MenuController?page=newsales">   New Sales      </a>   
                    <a  href="MenuController?page=deliverylist">  Delivery List </a>  
                </div>

            </div>

            <!--#########################################################################3-->

            <div  class="dropdown">

                <button class="dropbtn" >Purchases</button>
                <div class="dropdown-content">
                    <a href="MenuController?page=newpurchase">New Bill</a>
                    <div class="link">
                        <a href="#" class="droplink">Founded</a> 
                        <div class="dropdown-content1" >
                            <a href="MenuController?page=foundedall">ALL</a>
                            <a href="MenuController?page=foundedname">NAME</a>
                            <a href="MenuController?page=foundedtype">TYPE</a>
                            <a href="MenuController?page=foundedquantity">QUANTITY</a>
                            <a href="MenuController?page=foundedexpiry">EXPIRY</a>
                            <a href="MenuController?page=foundedprice">PRICE</a>
                            <a href="MenuController?page=foundedcompany">COMPANY</a>
                        </div>
                    </div>
                    <div class="link">

                        <a href="#" class="droplink">Requested</a> 
                        <div class="dropdown-content1">
                            <a href="MenuController?page=requestadd" >ADD</a>
                            <div class="link">
                                <a href="#" class="droplink">SEARCH</a>  
                                <div class="dropdown-content1">
                                    <a href="MenuController?page=requestall">ALL</a>
                                    <a href="MenuController?page=requestname">NAME</a>
                                </div>
                            </div>



                        </div>
                    </div> 


                </div>    
            </div>
            <!--################################################################-->
            <div  class="dropdown">
                <button class="dropbtn">Customer</button>
                <div class="dropdown-content">
                    <a href="MenuController?page=customeradd">ADD</a>
                    <div class="link">
                        <a href="#" class="droplink">SEARCH</a>
                        <div class="dropdown-content1"> 
                            <a href="MenuController?page=customerall">ALL</a>
                            <a href="MenuController?page=customername">NAME</a>
                        </div>                
                    </div>
                </div>     
            </div>     
            <!--            ##############################-->
            <div  class="dropdown">
                <button class="dropbtn">Search</button>
                <div class="dropdown-content">
                    <a href="MenuController?page=searchall">ALL</a>
                    <a href="MenuController?page=searchname">NAME</a>
                    <a href="MenuController?page=searchtype">TYPE</a>
                    <a href="MenuController?page=searchprice">PRICE</a>
                    <a href="MenuController?page=searchexpiry">EXPIRY</a>
                </div>     
            </div>
            <!--####################################################-->
            <div  class="dropdown">
                <button class="dropbtn">Discount</button>
                <div class="dropdown-content">
                    <a href="MenuController?page=discountall">ALL</a>
                    <a href="MenuController?page=discountname">NAME</a>
                    <a href="MenuController?page=discounttype">TYPE</a>
                    <a href="MenuController?page=discountprice">PRICE</a>
                    <a href="MenuController?page=discountdiscount">DISCOUNT</a>
                </div>
            </div>
            <!--################################################-->
            <div  class="dropdown">
                <button class="dropbtn">Reports</button>                
                <div class="dropdown-content">
                    <a href="MenuController?page=analysisbillreports">Analysis</a> 
                    <div class="link" >
                        <a href="#" class="droplink">Sale Bills By</a>
                        <div class="dropdown-content1">                                                
                            <a href="MenuController?page=salebillreportsall" >All</a>
                            <a href="MenuController?page=salebillreportsbillcode">Bill Code</a>
                            <a href="MenuController?page=salebillreportsdate">Date</a>
                            <a href="MenuController?page=salebillreportstotal" >Total</a>
                            <a href="MenuController?page=salebillreportsprofit" >Profit</a>                      
                        </div>                        
                    </div>
                    <div class="link" >
                        <a href="#" class="droplink">Purchase Bills By</a>
                        <div class="dropdown-content1">                           
                            <a href="MenuController?page=purchasebillreportsall">All</a>
                            <a href="MenuController?page=purchasebillreportsbillcode">Bill Code</a>
                            <a href="MenuController?page=purchasebillreportsdate">Date</a>
                            <a href="MenuController?page=purchasebillreportstotal">Total</a>
                        </div>                        
                    </div>                                                             
                </div>
            </div>
            <!--###################################################33-->
            <div  class="dropdown">
                <button class="dropbtn">Setting</button>
                <div class="dropdown-content">
                    <a href="MenuController?page=addaccount">Add Account</a>
                    <a href="MenuController?page=deleteaccount">Delete Account</a>
                    <a href="MenuController?page=editaccount">Change Password</a>
                    <a href="MenuController?page=viewaccounts">View Accounts</a>
                    <a href="MenuController?page=priviliges"> Priviliges </a>
                </div>
            </div>

            <!--#####################################################-->
            <a href="MenuController?page=logout">Log Out</a>
        </div>


