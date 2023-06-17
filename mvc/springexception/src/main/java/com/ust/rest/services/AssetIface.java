package com.ust.rest.services;

import java.util.Optional;

import com.ust.rest.model.FTTIssueBase;

public interface AssetIface {

	public Optional<FTTIssueBase> findById(String id);
}
