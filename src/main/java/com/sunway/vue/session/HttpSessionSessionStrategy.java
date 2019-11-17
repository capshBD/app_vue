package com.sunway.vue.session;

import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;

@Component
public class HttpSessionSessionStrategy implements SessionStrategy {

	public void setAttribute(RequestAttributes request, String name, Object value) {
		request.setAttribute(name, value, RequestAttributes.SCOPE_SESSION);
	}
	
	public Object getAttribute(RequestAttributes request, String name) {
		return request.getAttribute(name, RequestAttributes.SCOPE_SESSION);
	}
	
	public void removeAttribute(RequestAttributes request, String name) {
		request.removeAttribute(name, RequestAttributes.SCOPE_SESSION);
	}
}