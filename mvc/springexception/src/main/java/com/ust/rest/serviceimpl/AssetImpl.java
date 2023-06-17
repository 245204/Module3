package com.ust.rest.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.rest.model.FTTIssueBase;
import com.ust.rest.repositories.FTTIssueBaseRepository;
import com.ust.rest.services.AssetIface;

@Service
public class AssetImpl implements AssetIface{
	@Autowired
	FTTIssueBaseRepository repo;
	
	@Override
	public Optional<FTTIssueBase> findById(String id) {

		return repo.findById(id);
	}
}
