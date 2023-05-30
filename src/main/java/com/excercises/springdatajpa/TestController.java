package com.excercises.springdatajpa;

import com.excercises.springdatajpa.entidades.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class TestController {

    @Autowired
    private UsuariosRepository usuariosRepository;
    @Autowired
    private ProyectoRepository proyectoRepository;
    @Autowired
    private TareasRepository tareasRepository;
    @Autowired
    private ProyUserRepository proyuserRepository;
    @Autowired
    private UsuarioProyectoRepository usuarioProyectoRepository;

    @GetMapping
    @RequestMapping("/user")
public List<Usuario>Usuarios(){
        List<Usuario> usuarios =usuariosRepository.findAll();
        return usuarios;
    }
    @GetMapping
    @RequestMapping("/tarea")
    public List<Tarea>Tareas(){
        List<Tarea> tarea =tareasRepository.findAll();
        return tarea;
    }
    @GetMapping
    @RequestMapping("/proyecto")
    public List<Proyecto>Proyecto(){
        List<Proyecto> proyecto =proyectoRepository.findAll();
        return proyecto;
    }
    @GetMapping
    @RequestMapping("/proy_User")
    public List<Proy_User>Proy_User(){
        List<Proy_User> Proyuser = proyuserRepository.findAll();
        return Proyuser;
    }
    @GetMapping
    @RequestMapping("/usuario_proy")
    public List<Usuario_Proyecto>Usuario_Proyecto(){
        List<Usuario_Proyecto> Usuario_Proyecto = usuarioProyectoRepository.findAll();
        return Usuario_Proyecto ;
    }
}

