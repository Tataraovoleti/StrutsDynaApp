/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

/**
 *
 * @author TATARAO
 */
public class RegisterAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
   

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        DynaActionForm frm=(DynaActionForm)form;
        String name=(String)frm.get("name");
        String pass=(String)frm.get("password");
        
        HttpSession session=request.getSession();
        session.setAttribute("namepass", name+pass);
        
        if(name.equals("sanjay")&&pass.equals("fazel"))
        {
        return mapping.findForward("success");
        }
        else
        {
            return mapping.findForward("failure");
        }
    }
}
