package com.mytaxi.datatransferobject;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ManufacturerDTO
{

    @JsonIgnore
    private Long id;

    @NotNull(message = "Name can not be null!")
    private String name;


    private ManufacturerDTO()
    {

    }


    private ManufacturerDTO(Long id, String name)
    {
        super();
        this.id = id;
        this.name = name;
    }
    
    public static ManufacturerDTOBuilder newBuilder()
    {
        return new ManufacturerDTOBuilder();
    }


    @JsonProperty
    public Long getId()
    {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public static class ManufacturerDTOBuilder
    {
        private Long id;
        private String name;
        
        public ManufacturerDTOBuilder setId(Long id)
        {
            this.id = id;
            return this;
        }
        
        public ManufacturerDTOBuilder setName(String name)
        {
            this.name = name;
            return this;
        }


        public ManufacturerDTO createManufacturerDTO()
        {
            return new ManufacturerDTO(id, name);
        }
    }
}
