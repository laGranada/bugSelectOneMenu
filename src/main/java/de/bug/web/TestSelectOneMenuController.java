/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.bug.web;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author MaggieSaurusRex
 */
@Named
@ViewScoped
public class TestSelectOneMenuController implements Serializable {
    
    private final Logger L = LoggerFactory.getLogger(TestSelectOneMenuController.class);
    
    private String selPokemon;
    private String selPokemonOnChange;
    private String selPokemonList;
    private String selPokemonListOnChange;
    
    private List<String> pokemons = new ArrayList<>();
    
    @PostConstruct
    public void init(){
        pokemons = new ArrayList<>();
        pokemons.add("Bulbasaur");
        pokemons.add("Snorlax");
        pokemons.add("Litten");
        pokemons.add("Umbreon");
    }
    
    public void onSelect(){
        L.info("###################### onSelect: Selected Pokemon: " + selPokemon);
    }
    
    public void onSelectList(){
        L.info("###################### onSelectList: Selected Pokemon: " + selPokemonList);
        System.out.println("###################### onSelectList: Selected Pokemon: " + selPokemonList);
    }
    
    public void onChange(){
        L.info("###################### onChange: Selected Pokemon: " + selPokemonOnChange);
        System.out.println("###################### onChange: Selected Pokemon: " + selPokemonOnChange);
    }
    public void onChangeList(){
        L.info("###################### onChangeList: Selected Pokemon: " + selPokemonListOnChange);
        System.out.println("###################### onChangeList: Selected Pokemon: " + selPokemonListOnChange);
    }

    public String getSelPokemon() {
        return selPokemon;
    }

    public void setSelPokemon(String selPokemon) {
        System.out.println("###################### setter: " + selPokemon);
        this.selPokemon = selPokemon;
    }

    public String getSelPokemonOnChange() {
        return selPokemonOnChange;
    }

    public void setSelPokemonOnChange(String selPokemonOnChange) {
        System.out.println("###################### setSelPokemonOnChange: " + selPokemonOnChange);
        this.selPokemonOnChange = selPokemonOnChange;
    }

    public String getSelPokemonList() {
        return selPokemonList;
    }

    public void setSelPokemonList(String selPokemonList) {
        System.out.println("###################### setSelPokemonList: " + selPokemonList);
        this.selPokemonList = selPokemonList;
    }

    public String getSelPokemonListOnChange() {
        return selPokemonListOnChange;
    }

    public void setSelPokemonListOnChange(String selPokemonListOnChange) {
        System.out.println("###################### setSelPokemonListOnChange: " + selPokemonListOnChange);
        this.selPokemonListOnChange = selPokemonListOnChange;
    }

    public List<String> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<String> pokemons) {
        System.out.println("###################### setPokemons: " + pokemons.size());
        this.pokemons = pokemons;
    }
    
    
    
}
