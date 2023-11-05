OnlineJobPortal


Server details:
Wildfly 26
Wildfly 26

Servlet Api
-Handles HTTP REQUEST

Main packages of servlet api 
    1. javax.servlet - protocol independent servlet
    2. javax.servlet.http - http servlet

Ways of implementing servlet
 -Implement servlet interface
 -Extend Generic Servlet class
 -Extend HttpServlet Class

GenericServlet
HttpServlet

 service();




1. Implementing servlet (implments interface)

Client (Browser,Mobile) (request) -> Server (Servlet Container - Wildfly) 
    -> Hello -> Service(html content) (response)

2. Extending GenericServlet (extends abstract class)

Client (Browser,Mobile) (request) -> Server (Servlet Container - Wildfly)
    -> Hello -> Service(html content) (response)

3. Extending HTTP servlet 

Client (Browser,Mobile) (request) -> Server (Servlet Container - Wildfly)
-> Hello -> Service -> doGet,doPost,doPut(html content) (response)


Servlet Lifecycle
    1 Loading the servlet - point of deployment to the server - servlet container
    2 Servlet instance created - on the first access - servlet container
    3 init() method invoked - called only once
    4 service() - called on any request
    5 destroy() - servlet is shutting down or the server is shutting
        the application is undeployed.

Deployment Descriptor (web.xml) - programming through configuration---later
    programme through convention
    describes how web application should be deployed by the servlet container.


Now we move on to programming with conventions. Remove all the mappings in the web.xml.
Include "@webservlet(./servlet-name)" at the beginning of every servlet. These are called annotations.


ServletRequest - handles request, get parameters
ServletResponse - enable response, PrintWriter

RequestDispatcher - The url does not change. The page does not change. Allows you to call a servlet within another servlet.
                Functional difference:- works on the request object
Sendredirect - Requires one to set attributes and redirects to a whole other page. Directs you to another page.
            url changes.
             Functional difference:- works on the response object. Cannot get the request object as it is

Include and forward work within the requestDispatcher
Include - includes the request information on the current page
forward - forward the request information to the target page

Model addition(module)
Bean(business package)

JobBean.java is the action class

Servlet context: Created by the web container for every web application
Defines a set of methods that a servlet uses to communicate with its servlet container. ServletContext object is used to get configuration information from Deployment Descriptor(web.xml) which will be available to any servlet or JSPs that are part of the web app. 

Servlet config and servlet context difference: context can be applied on the whole web application, any servlet in the web application while servlet config can only be used in a specific servlet.