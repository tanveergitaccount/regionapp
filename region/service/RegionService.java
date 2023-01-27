package com.region.service;

import java.util.List;

import com.region.controller.RegionDto;
import com.region.entities.Region;

public interface RegionService {

	RegionDto createRegion(RegionDto regionDto);

	List<Region> getRegionList();
	

}
