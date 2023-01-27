package com.region.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.region.controller.RegionDto;
import com.region.entities.Region;
import com.region.repository.RegionRepository;
import com.region.service.RegionService;

@Service
public class RegionServiceImpl implements RegionService {

	@Autowired
	private RegionRepository regionRepo;

	@Override
	public RegionDto createRegion(RegionDto regionDto) {

		Region region = mapToEntity(regionDto);

		Region RegionEntity = regionRepo.save(region);

		RegionDto dto = mapToDto(RegionEntity);

		return dto;
	}

	public RegionDto mapToDto(Region region) {

		RegionDto dto = new RegionDto();

		dto.setId(region.getId());
		dto.setName(region.getName());
		dto.setRegion(region.getRegion());
		dto.setLandMass(region.getLandMass());

		return dto;

	}

	public Region mapToEntity(RegionDto regionDto) {
		Region region = new Region();

		region.setId(regionDto.getId());
		region.setName(regionDto.getName());
		region.setRegion(regionDto.getRegion());
		region.setLandMass(regionDto.getLandMass());
		return region;

	}

	@Override
	public List<Region> getRegionList() {

		List<Region> list = regionRepo.findAll();
		

		return list;
	}

}
