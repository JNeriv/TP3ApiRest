package com.example.demo.controladores;

import com.example.demo.entidades.Localidad;
import com.example.demo.servicios.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//CrossOrigin nos permite dar acceso a nuestra api desde distintos origenes (clientes)
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl>{


}