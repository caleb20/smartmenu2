package com.smartmenu.app.smartmenu.service;

import com.smartmenu.app.smartmenu.dto.LoginInDTO;
import com.smartmenu.app.smartmenu.dto.LoginOutDTO;

public interface LoginService {

	LoginOutDTO login(LoginInDTO in);

}
