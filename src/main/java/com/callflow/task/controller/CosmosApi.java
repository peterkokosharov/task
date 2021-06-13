package com.callflow.task.controller;

import com.callflow.task.CosmosTag;
import com.callflow.task.dto.*;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping(path = "task/cosmos")
    @Api(value = "task/cosmos", tags = CosmosTag.DEMO_COSMOS_TAG_NAME)
    public interface CosmosApi {

        @PostMapping("/galaxy")
        @ApiOperation(value = "add new galaxy")
        @ApiResponses(value = {
                @ApiResponse(code = 200, message = "GalaxyAdded", response = String.class),
                @ApiResponse(code = 400, message = "Bad Request"),
                @ApiResponse(code = 409, message = "Conflict")})
        ResponseEntity<String> addGalaxy(
                @ApiParam(value = "Galaxy data ")
                @RequestBody GalaxyDTORequest galaxy
        );

    @PostMapping("/star")
    @ApiOperation(value = "add new star")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "StarAdded", response = String.class),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 409, message = "Conflict")})
    ResponseEntity<String> addStar(
            @ApiParam(value = "star data ")
            @RequestBody StarDTORequest star
    );

    @PostMapping("/planet")
    @ApiOperation(value = "add new planet")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "PlanetAdded", response = String.class),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 409, message = "Conflict")})
    ResponseEntity<String> addPlanet(
            @ApiParam(value = "planet data ")
            @RequestBody PlanetDTORequest planet
    );

    @PostMapping("/moon")
    @ApiOperation(value = "add new moon")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "MoonAdded", response = String.class),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 409, message = "Conflict")})
    ResponseEntity<String> addMoon(
            @ApiParam(value = "moon data ")
            @RequestBody MoonDTORequest moon
    );

    @GetMapping("/catalog")
    @ApiOperation(value = "catalog of all objects")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "CatalogReturned", response = CatalogDTOResponse.class),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 404, message = "Not Found")})
    ResponseEntity<CatalogDTOResponse> catalog();

}
