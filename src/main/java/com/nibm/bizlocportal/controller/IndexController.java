/**
 * 
 */
package com.nibm.bizlocportal.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nibm.bizlocportal.model.BusinessGoal;
import com.nibm.bizlocportal.model.BusinessType;
import com.nibm.bizlocportal.model.BusinessTypePlaceSize;
import com.nibm.bizlocportal.model.BusinessTypeTargetGroup;
import com.nibm.bizlocportal.model.ColomboZone;
import com.nibm.bizlocportal.model.PlaceSize;
import com.nibm.bizlocportal.model.PriceRange;
import com.nibm.bizlocportal.model.TargetGroup;
import com.nibm.bizlocportal.model.User;
import com.nibm.bizlocportal.repository.BusinessGoalRepository;
import com.nibm.bizlocportal.repository.BusinessTypePlaceSizeRepository;
import com.nibm.bizlocportal.repository.BusinessTypeRepository;
import com.nibm.bizlocportal.repository.BusinessTypeTargetGroupRepository;
import com.nibm.bizlocportal.repository.ColomboZoneRepository;
import com.nibm.bizlocportal.repository.PlaceSizeRepository;
import com.nibm.bizlocportal.repository.PriceRangeRepository;
import com.nibm.bizlocportal.repository.TargetGroupRepository;
import com.nibm.bizlocportal.repository.UserRepository;

/**
 * @author lily2
 *
 */
@ComponentScan(value = "com.nibm.bizlocportal")
@CrossOrigin(origins="*",maxAge = 3600)
@RestController
@RequestMapping("/api")
public class IndexController {

	@Autowired
	BusinessTypeRepository businessTypeRepository;

	@Autowired
	BusinessGoalRepository businessGoalRepository;

	@Autowired
	BusinessTypePlaceSizeRepository businessTypePlaceSizeRepository;

	@Autowired
	BusinessTypeTargetGroupRepository businessTypeTargetGroupRepository;

	@Autowired
	ColomboZoneRepository colomboZoneRepository;

	@Autowired
	PlaceSizeRepository placeSizeRepository;

	@Autowired
	PriceRangeRepository priceRangeRepository;

	@Autowired
	TargetGroupRepository targetGroupRepository;

	@Autowired
	UserRepository userRepository;

	@GetMapping("/businessType")
	public ResponseEntity<List<BusinessType>> getBusinessTypes() {
		try {
			List<BusinessType> businessType = new ArrayList<BusinessType>();
			businessTypeRepository.findAll().forEach(businessType::add);

			if (businessType.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(businessType, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/businessType/{id}")
	public ResponseEntity<BusinessType> getBusinessTypeById(@PathVariable("id") long id) {
		Optional<BusinessType> businessType = businessTypeRepository.findById(id);

		if (businessType.isPresent()) {
			return new ResponseEntity<>(businessType.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/businessType")
	public ResponseEntity<BusinessType> createBusinessType(@RequestBody BusinessType businessType) {
		try {
			BusinessType _businessType = businessTypeRepository.save(businessType);
			return new ResponseEntity<>(_businessType, HttpStatus.CREATED);

		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/businessType/{id}")
	public ResponseEntity<BusinessType> updateBusinessType(@PathVariable("id") long id,
			@RequestBody BusinessType businessType) {
		Optional<BusinessType> businessTypeData = businessTypeRepository.findById(id);

		if (businessTypeData.isPresent()) {
			BusinessType _businessType = businessTypeData.get();
			_businessType.setDescription(businessType.getDescription());
			return new ResponseEntity<>(businessTypeRepository.save(_businessType), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/businessGoal")
	public ResponseEntity<List<BusinessGoal>> getBusinessGoal() {
		try {
			List<BusinessGoal> businessGoal = new ArrayList<BusinessGoal>();
			businessGoalRepository.findAll().forEach(businessGoal::add);

			if (businessGoal.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(businessGoal, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/businessGoal/{id}")
	public ResponseEntity<BusinessGoal> getBusinessGoalById(@PathVariable("id") long id) {
		Optional<BusinessGoal> businessGoal = businessGoalRepository.findById(id);

		if (businessGoal.isPresent()) {
			return new ResponseEntity<>(businessGoal.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/businessGoal")
	public ResponseEntity<BusinessGoal> createBusinessGoal(@RequestBody BusinessGoal businessGoal) {
		try {
			BusinessGoal _businessGoal = businessGoalRepository.save(businessGoal);
			return new ResponseEntity<>(_businessGoal, HttpStatus.CREATED);

		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/businessGoal/{id}")
	public ResponseEntity<BusinessGoal> updateBusinessGoal(@PathVariable("id") long id,
			@RequestBody BusinessGoal businessGoal) {
		Optional<BusinessGoal> businessGoalData = businessGoalRepository.findById(id);

		if (businessGoalData.isPresent()) {
			BusinessGoal _businessGoal = businessGoalData.get();
			_businessGoal.setDescription(businessGoal.getDescription());
			return new ResponseEntity<>(businessGoalRepository.save(_businessGoal), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/businessTypePlaceSize")
	public ResponseEntity<List<BusinessTypePlaceSize>> getBusinessTypePlaceSize() {
		try {
			List<BusinessTypePlaceSize> businessTypePlaceSize = new ArrayList<BusinessTypePlaceSize>();
			businessTypePlaceSizeRepository.findAll().forEach(businessTypePlaceSize::add);

			if (businessTypePlaceSize.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(businessTypePlaceSize, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/businessTypePlaceSize/{id}")
	public ResponseEntity<BusinessTypePlaceSize> getBusinessTypePlaceSizeById(@PathVariable("id") long id) {
		Optional<BusinessTypePlaceSize> businessTypePlaceSize = businessTypePlaceSizeRepository.findById(id);

		if (businessTypePlaceSize.isPresent()) {
			return new ResponseEntity<>(businessTypePlaceSize.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/businessTypePlaceSize")
	public ResponseEntity<BusinessTypePlaceSize> createBusinessTypePlaceSize(@RequestBody BusinessTypePlaceSize businessTypePlaceSize) {
		try {
			BusinessTypePlaceSize _businessTypePlaceSize = businessTypePlaceSizeRepository.save(businessTypePlaceSize);
			return new ResponseEntity<>(_businessTypePlaceSize, HttpStatus.CREATED);

		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/businessTypePlaceSize/{id}")
	public ResponseEntity<BusinessTypePlaceSize> updateBusinessTypePlaceSize(@PathVariable("id") long id,
			@RequestBody BusinessTypePlaceSize businessTypePlaceSize) {
		Optional<BusinessTypePlaceSize> businessTypePlaceSizeData = businessTypePlaceSizeRepository.findById(id);

		if (businessTypePlaceSizeData.isPresent()) {
			BusinessTypePlaceSize _businessTypePlaceSize = businessTypePlaceSizeData.get();
			_businessTypePlaceSize.setPlaceSize(businessTypePlaceSize.getPlaceSize());
			_businessTypePlaceSize.setBusinessType(businessTypePlaceSize.getBusinessType());
			return new ResponseEntity<>(businessTypePlaceSizeRepository.save(_businessTypePlaceSize), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/businessTypeTargetGroup")
	public ResponseEntity<List<BusinessTypeTargetGroup>> getBusinessTypeTargetGroup() {
		try {
			List<BusinessTypeTargetGroup> businessTypeTargetGroup = new ArrayList<BusinessTypeTargetGroup>();
			businessTypeTargetGroupRepository.findAll().forEach(businessTypeTargetGroup::add);

			if (businessTypeTargetGroup.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(businessTypeTargetGroup, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/businessTypeTargetGroup/{id}")
	public ResponseEntity<BusinessTypeTargetGroup> getBusinessTypeTargetGroupById(@PathVariable("id") long id) {
		Optional<BusinessTypeTargetGroup> businessTypeTargetGroup = businessTypeTargetGroupRepository.findById(id);

		if (businessTypeTargetGroup.isPresent()) {
			return new ResponseEntity<>(businessTypeTargetGroup.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/businessTypeTargetGroup")
	public ResponseEntity<BusinessTypeTargetGroup> createBusinessTypeTargetGroup(@RequestBody BusinessTypeTargetGroup businessTypeTargetGroup) {
		try {
			BusinessTypeTargetGroup _businessTypeTargetGroup = businessTypeTargetGroupRepository.save(businessTypeTargetGroup);
			return new ResponseEntity<>(_businessTypeTargetGroup, HttpStatus.CREATED);

		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/businessTypeTargetGroup/{id}")
	public ResponseEntity<BusinessTypeTargetGroup> updateBusinessTypePlaceSize(@PathVariable("id") long id,
			@RequestBody BusinessTypeTargetGroup businessTypeTargetGroup) {
		Optional<BusinessTypeTargetGroup> businessTypeTargetGroupData = businessTypeTargetGroupRepository.findById(id);

		if (businessTypeTargetGroupData.isPresent()) {
			BusinessTypeTargetGroup _businessTypeTargetGroup = businessTypeTargetGroupData.get();
			_businessTypeTargetGroup.setTargetGroup(businessTypeTargetGroup.getTargetGroup());
			_businessTypeTargetGroup.setBusinessType(businessTypeTargetGroup.getBusinessType());
			return new ResponseEntity<>(businessTypeTargetGroupRepository.save(_businessTypeTargetGroup), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/colomboZone")
	public ResponseEntity<List<ColomboZone>> getColomboZone() {
		try {
			List<ColomboZone> colomboZone = new ArrayList<ColomboZone>();
			colomboZoneRepository.findAll().forEach(colomboZone::add);

			if (colomboZone.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(colomboZone, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/colomboZone/{id}")
	public ResponseEntity<ColomboZone> getColomboZoneById(@PathVariable("id") long id) {
		Optional<ColomboZone> colomboZone = colomboZoneRepository.findById(id);

		if (colomboZone.isPresent()) {
			return new ResponseEntity<>(colomboZone.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/colomboZone")
	public ResponseEntity<ColomboZone> createColomboZone(@RequestBody ColomboZone colomboZone) {
		try {
			ColomboZone _colomboZone = colomboZoneRepository.save(colomboZone);
			return new ResponseEntity<>(_colomboZone, HttpStatus.CREATED);

		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/colomboZone/{id}")
	public ResponseEntity<ColomboZone> updateColomboZone(@PathVariable("id") long id,
			@RequestBody ColomboZone colomboZone) {
		Optional<ColomboZone> colomboZoneData = colomboZoneRepository.findById(id);

		if (colomboZoneData.isPresent()) {
			ColomboZone _colomboZone = colomboZoneData.get();
			_colomboZone.setFoodieIndex(colomboZone.getFoodieIndex());
			_colomboZone.setName(colomboZone.getNightLifeIndex());
			_colomboZone.setNightLifeIndex(colomboZone.getNightLifeIndex());
			_colomboZone.setPlaceSize(colomboZone.getPlaceSize());
			_colomboZone.setZonalNumber(colomboZone.getZonalNumber());
			return new ResponseEntity<>(colomboZoneRepository.save(_colomboZone), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/placeSize")
	public ResponseEntity<List<PlaceSize>> getPlaceSize() {
		try {
			List<PlaceSize> placeSize = new ArrayList<PlaceSize>();
			placeSizeRepository.findAll().forEach(placeSize::add);

			if (placeSize.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(placeSize, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/placeSize/{id}")
	public ResponseEntity<PlaceSize> getPlaceSizeById(@PathVariable("id") long id) {
		Optional<PlaceSize> placeSize = placeSizeRepository.findById(id);

		if (placeSize.isPresent()) {
			return new ResponseEntity<>(placeSize.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/placeSize")
	public ResponseEntity<PlaceSize> createPlaceSize(@RequestBody PlaceSize placeSize) {
		try {
			PlaceSize _placeSize = placeSizeRepository.save(placeSize);
			return new ResponseEntity<>(_placeSize, HttpStatus.CREATED);

		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/placeSize/{id}")
	public ResponseEntity<PlaceSize> updatePlaceSize(@PathVariable("id") long id,
			@RequestBody PlaceSize placeSize) {
		Optional<PlaceSize> placeSizeData = placeSizeRepository.findById(id);

		if (placeSizeData.isPresent()) {
			PlaceSize _placeSize = placeSizeData.get();
			_placeSize.setPriceRange(placeSize.getPriceRange());
			_placeSize.setSizing(placeSize.getSizing());
			return new ResponseEntity<>(placeSizeRepository.save(_placeSize), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/priceRange")
	public ResponseEntity<List<PriceRange>> getpriceRange() {
		try {
			List<PriceRange> priceRange = new ArrayList<PriceRange>();
			priceRangeRepository.findAll().forEach(priceRange::add);

			if (priceRange.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(priceRange, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/priceRange/{id}")
	public ResponseEntity<PriceRange> getPriceRangeById(@PathVariable("id") long id) {
		Optional<PriceRange> priceRange = priceRangeRepository.findById(id);

		if (priceRange.isPresent()) {
			return new ResponseEntity<>(priceRange.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/priceRange")
	public ResponseEntity<PriceRange> createPriceRange(@RequestBody PriceRange priceRange) {
		try {
			PriceRange _priceRange = priceRangeRepository.save(priceRange);
			return new ResponseEntity<>(_priceRange, HttpStatus.CREATED);

		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/priceRange/{id}")
	public ResponseEntity<PriceRange> updatePriceRange(@PathVariable("id") long id,
			@RequestBody PriceRange priceRange) {
		Optional<PriceRange> priceRangeData = priceRangeRepository.findById(id);

		if (priceRangeData.isPresent()) {
			PriceRange _priceRange = priceRangeData.get();
			_priceRange.setRange(priceRange.getRange());
			return new ResponseEntity<>(priceRangeRepository.save(_priceRange), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/targetGroup")
	public ResponseEntity<List<TargetGroup>> getTargetGroup() {
		try {
			List<TargetGroup> targetGroup = new ArrayList<TargetGroup>();
			targetGroupRepository.findAll().forEach(targetGroup::add);

			if (targetGroup.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(targetGroup, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/targetGroup/{id}")
	public ResponseEntity<TargetGroup> getTargetGroupById(@PathVariable("id") long id) {
		Optional<TargetGroup> targetGroup = targetGroupRepository.findById(id);

		if (targetGroup.isPresent()) {
			return new ResponseEntity<>(targetGroup.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/targetGroup")
	public ResponseEntity<TargetGroup> createTargetGroup(@RequestBody TargetGroup targetGroup) {
		try {
			TargetGroup _targetGroup = targetGroupRepository.save(targetGroup);
			return new ResponseEntity<>(_targetGroup, HttpStatus.CREATED);

		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/targetGroup/{id}")
	public ResponseEntity<TargetGroup> updateTargetGroup(@PathVariable("id") long id,
			@RequestBody TargetGroup targetGroup) {
		Optional<TargetGroup> targetGroupData = targetGroupRepository.findById(id);

		if (targetGroupData.isPresent()) {
			TargetGroup _targetGroup = targetGroupData.get();
			_targetGroup.setPurchasePower(targetGroup.getPurchasePower());
			_targetGroup.setTargetGroup(targetGroup.getTargetGroup());
			return new ResponseEntity<>(targetGroupRepository.save(_targetGroup), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/user")
	public ResponseEntity<List<User>> getUsers() {
		try {
			List<User> user = new ArrayList<User>();
			userRepository.findAll().forEach(user::add);

			if (user.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(user, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUserId(@PathVariable("id") long id) {
		Optional<User> user = userRepository.findById(id);

		if (user.isPresent()) {
			return new ResponseEntity<>(user.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/user")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		try {
			User _user = userRepository.save(user);
			return new ResponseEntity<>(_user, HttpStatus.CREATED);

		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/user/{id}")
	public ResponseEntity<User> updateUser(@PathVariable("id") long id,
			@RequestBody User user) {
		Optional<User> userData = userRepository.findById(id);

		if (userData.isPresent()) {
			User _user = userData.get();
			_user.setName(user.getName());
			_user.setEmail(user.getEmail());
			_user.setBusinessType(user.getBusinessType());
			return new ResponseEntity<>(userRepository.save(_user), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
