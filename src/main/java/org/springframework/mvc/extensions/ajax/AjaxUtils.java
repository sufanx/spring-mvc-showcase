package org.springframework.mvc.extensions.ajax;

import org.springframework.web.context.request.WebRequest;

public class AjaxUtils {

    private AjaxUtils() {
    }

    public static boolean isAjaxRequest(WebRequest webRequest) {
        return "XMLHttpRequest".equals(webRequest.getHeader("X-Requested-With"));
    }

    public static boolean isAjaxUploadRequest(WebRequest webRequest) {
        return webRequest.getParameter("ajaxUpload") != null;
    }

}
