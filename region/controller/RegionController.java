package com.region.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.region.entities.Region;
import com.region.service.RegionService;

@RestController
@RequestMapping("/api/region/")
public class RegionController {

	@Autowired
	private RegionService regionService;

	@PostMapping("save")
	public ResponseEntity<RegionDto> createRegion(@RequestBody RegionDto regionDto) {
		return new ResponseEntity<>(regionService.createRegion(regionDto), HttpStatus.CREATED);

	}

	@GetMapping("getalldata")
		public ResponseEntity<List<Region>> getAllRegions(){
			
	    	 List<Region> regionList = regionService.getRegionList();
			  return ResponseEntity.ok(regionList);	  
	  
	
	
	}	

}
