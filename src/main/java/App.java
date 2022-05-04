import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;
public class App {
    public static void main(String[] args) {

        staticFileLocation("/public");

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(new HashMap(), "index.hbs");
        }, new HandlebarsTemplateEngine());


        post("/heros/new", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams("name");
            int age = Integer.parseInt(request.queryParams("age"));
            String power = request.queryParams("power");
            String weakness = request.queryParams("weakness");
            String squadId = request.params("squadId");
            Heros heros = new Heros(name,age,power,weakness,squadId);
            model.put("heros" ,heros);
            System.out.println(request.queryParams("name"));
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());


        get("/hero", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            ArrayList<Heros> heros=Heros.getAll();
            model.put("heros",heros);
            return new ModelAndView(model, "heroform.hbs");
        }, new HandlebarsTemplateEngine());


        get("/heros/list",(request, response) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            ArrayList<Heros> heros=Heros.getAll();
            model.put("heros",heros);
            return new ModelAndView(model , "hero.hbs");
        },new HandlebarsTemplateEngine());


        get("heros/success", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model,"success.hbs");
        }, new HandlebarsTemplateEngine());




        get("/squad/list", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            ArrayList<Squad> squad = Squad.getAll();
            model.put("squad", squad);
            return new ModelAndView(model, "squad.hbs");
        }, new HandlebarsTemplateEngine());


        get("/heroform.hbs", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "heroform.hbs");
        }, new HandlebarsTemplateEngine());

        get("/Squadform.hbs", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "Squadform.hbs");
        }, new HandlebarsTemplateEngine());

        post("/squads/new", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams("name");
            String cause = request.queryParams("cause");
            int maxsize = Integer.parseInt(request.queryParams("maxsize"));
            Squad squad = new Squad(name,cause,maxsize);
            model.put("squad" ,squad);
            return new ModelAndView(model, "Squadsuccess.hbs");
        }, new HandlebarsTemplateEngine());

    }

}





