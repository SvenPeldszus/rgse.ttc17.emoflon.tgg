/**
 */
package rgse.ttc17.emoflon.tgg.task2.Rules.impl;

import gluemodel.CIM.IEC61968.Assets.Asset;

import gluemodel.CIM.IEC61968.Common.Location;

import gluemodel.CIM.IEC61968.Metering.MeterAsset;

import gluemodel.MeterAssetMMXUPair;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.moflon.tgg.language.csp.CSP;

import org.moflon.tgg.runtime.AttributeConstraintsRuleResult;
import org.moflon.tgg.runtime.EMoflonEdge;
import org.moflon.tgg.runtime.EObjectContainer;
import org.moflon.tgg.runtime.IsApplicableMatch;
import org.moflon.tgg.runtime.IsApplicableRuleResult;
import org.moflon.tgg.runtime.Match;
import org.moflon.tgg.runtime.PerformRuleResult;
import org.moflon.tgg.runtime.RuntimeFactory;
import org.moflon.tgg.runtime.TripleMatch;

import org.moflon.tgg.runtime.impl.AbstractRuleImpl;

import outagePreventionJointarget.OutagePreventionJointargetFactory;

import rgse.ttc17.emoflon.tgg.task2.LocationToLocation;
import rgse.ttc17.emoflon.tgg.task2.PowerSystemResourceToPowerSystemResource;

import rgse.ttc17.emoflon.tgg.task2.Rules.PowerSystemResource;
import rgse.ttc17.emoflon.tgg.task2.Rules.RulesPackage;

import rgse.ttc17.emoflon.tgg.task2.Task2Factory;
// <-- [user defined imports]
import org.moflon.tgg.csp.*;
import rgse.ttc17.emoflon.tgg.task2.csp.constraints.*;
import org.moflon.tgg.csp.constraints.*;
import org.moflon.tgg.language.csp.*;
import org.moflon.tgg.runtime.TripleMatchNodeMapping;
import java.util.Optional;
import org.moflon.tgg.algorithm.delta.attribute.CheckAttributeHelper;
import SDMLanguage.expressions.ComparingOperator;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power System Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PowerSystemResourceImpl extends AbstractRuleImpl implements PowerSystemResource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerSystemResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getPowerSystemResource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Location srcLocation,
			gluemodel.CIM.IEC61970.Core.PowerSystemResource srcResource, MeterAssetMMXUPair pair, MeterAsset meter) {
		// initial bindings
		Object[] result1_black = PowerSystemResourceImpl.pattern_PowerSystemResource_0_1_initialbindings_blackBBBBBB(
				this, match, srcLocation, srcResource, pair, meter);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[srcLocation] = " + srcLocation + ", "
					+ "[srcResource] = " + srcResource + ", " + "[pair] = " + pair + ", " + "[meter] = " + meter + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = PowerSystemResourceImpl
				.pattern_PowerSystemResource_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, srcLocation, srcResource,
						pair, meter);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[srcLocation] = " + srcLocation + ", "
					+ "[srcResource] = " + srcResource + ", " + "[pair] = " + pair + ", " + "[meter] = " + meter + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (PowerSystemResourceImpl.pattern_PowerSystemResource_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = PowerSystemResourceImpl
					.pattern_PowerSystemResource_0_4_collectelementstobetranslated_blackBBBBB(match, srcLocation,
							srcResource, pair, meter);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[srcLocation] = " + srcLocation + ", "
						+ "[srcResource] = " + srcResource + ", " + "[pair] = " + pair + ", " + "[meter] = " + meter
						+ ".");
			}
			PowerSystemResourceImpl.pattern_PowerSystemResource_0_4_collectelementstobetranslated_greenBBBFF(match,
					srcLocation, srcResource);
			// EMoflonEdge srcLocation__srcResource____PowerSystemResources = (EMoflonEdge) result4_green[3];
			// EMoflonEdge srcResource__srcLocation____Location = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = PowerSystemResourceImpl
					.pattern_PowerSystemResource_0_5_collectcontextelements_blackBBBBB(match, srcLocation, srcResource,
							pair, meter);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[srcLocation] = " + srcLocation + ", " + "[srcResource] = "
								+ srcResource + ", " + "[pair] = " + pair + ", " + "[meter] = " + meter + ".");
			}
			PowerSystemResourceImpl.pattern_PowerSystemResource_0_5_collectcontextelements_greenBBBBBFFF(match,
					srcLocation, srcResource, pair, meter);
			// EMoflonEdge pair__meter____a = (EMoflonEdge) result5_green[5];
			// EMoflonEdge meter__srcLocation____Location = (EMoflonEdge) result5_green[6];
			// EMoflonEdge srcLocation__meter____Assets = (EMoflonEdge) result5_green[7];

			// register objects to match
			PowerSystemResourceImpl.pattern_PowerSystemResource_0_6_registerobjectstomatch_expressionBBBBBB(this, match,
					srcLocation, srcResource, pair, meter);
			return PowerSystemResourceImpl.pattern_PowerSystemResource_0_7_expressionF();
		} else {
			return PowerSystemResourceImpl.pattern_PowerSystemResource_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = PowerSystemResourceImpl
				.pattern_PowerSystemResource_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Location srcLocation = (Location) result1_bindingAndBlack[0];
		gluemodel.CIM.IEC61970.Core.PowerSystemResource srcResource = (gluemodel.CIM.IEC61970.Core.PowerSystemResource) result1_bindingAndBlack[1];
		MeterAssetMMXUPair pair = (MeterAssetMMXUPair) result1_bindingAndBlack[2];
		LocationToLocation locationToLocation = (LocationToLocation) result1_bindingAndBlack[3];
		MeterAsset meter = (MeterAsset) result1_bindingAndBlack[4];
		outagePreventionJointarget.Location trgLocation = (outagePreventionJointarget.Location) result1_bindingAndBlack[5];
		// CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = PowerSystemResourceImpl
				.pattern_PowerSystemResource_1_1_performtransformation_greenFFBB(srcResource, trgLocation);
		outagePreventionJointarget.PowerSystemResource trgResource = (outagePreventionJointarget.PowerSystemResource) result1_green[0];
		PowerSystemResourceToPowerSystemResource resourceToResource = (PowerSystemResourceToPowerSystemResource) result1_green[1];

		// collect translated elements
		Object[] result2_black = PowerSystemResourceImpl
				.pattern_PowerSystemResource_1_2_collecttranslatedelements_blackBB(trgResource, resourceToResource);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[trgResource] = " + trgResource + ", " + "[resourceToResource] = " + resourceToResource + ".");
		}
		Object[] result2_green = PowerSystemResourceImpl
				.pattern_PowerSystemResource_1_2_collecttranslatedelements_greenFBB(trgResource, resourceToResource);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = PowerSystemResourceImpl
				.pattern_PowerSystemResource_1_3_bookkeepingforedges_blackBBBBBBBBB(ruleresult, srcLocation,
						trgResource, resourceToResource, srcResource, pair, locationToLocation, meter, trgLocation);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[srcLocation] = " + srcLocation + ", "
					+ "[trgResource] = " + trgResource + ", " + "[resourceToResource] = " + resourceToResource + ", "
					+ "[srcResource] = " + srcResource + ", " + "[pair] = " + pair + ", " + "[locationToLocation] = "
					+ locationToLocation + ", " + "[meter] = " + meter + ", " + "[trgLocation] = " + trgLocation + ".");
		}
		PowerSystemResourceImpl.pattern_PowerSystemResource_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult,
				srcLocation, trgResource, resourceToResource, srcResource, trgLocation);
		// EMoflonEdge resourceToResource__trgResource____target = (EMoflonEdge) result3_green[6];
		// EMoflonEdge resourceToResource__srcResource____source = (EMoflonEdge) result3_green[7];
		// EMoflonEdge srcLocation__srcResource____PowerSystemResources = (EMoflonEdge) result3_green[8];
		// EMoflonEdge srcResource__srcLocation____Location = (EMoflonEdge) result3_green[9];
		// EMoflonEdge trgLocation__trgResource____PowerSystemResources = (EMoflonEdge) result3_green[10];

		// perform postprocessing story node is empty
		// register objects
		PowerSystemResourceImpl.pattern_PowerSystemResource_1_5_registerobjects_expressionBBBBBBBBBB(this, ruleresult,
				srcLocation, trgResource, resourceToResource, srcResource, pair, locationToLocation, meter,
				trgLocation);
		return PowerSystemResourceImpl.pattern_PowerSystemResource_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = PowerSystemResourceImpl
				.pattern_PowerSystemResource_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PowerSystemResourceImpl
				.pattern_PowerSystemResource_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = PowerSystemResourceImpl
				.pattern_PowerSystemResource_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Location srcLocation = (Location) result2_binding[0];
		gluemodel.CIM.IEC61970.Core.PowerSystemResource srcResource = (gluemodel.CIM.IEC61970.Core.PowerSystemResource) result2_binding[1];
		MeterAssetMMXUPair pair = (MeterAssetMMXUPair) result2_binding[2];
		MeterAsset meter = (MeterAsset) result2_binding[3];
		for (Object[] result2_black : PowerSystemResourceImpl
				.pattern_PowerSystemResource_2_2_corematch_blackBBBFBFB(srcLocation, srcResource, pair, meter, match)) {
			LocationToLocation locationToLocation = (LocationToLocation) result2_black[3];
			outagePreventionJointarget.Location trgLocation = (outagePreventionJointarget.Location) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : PowerSystemResourceImpl
					.pattern_PowerSystemResource_2_3_findcontext_blackBBBBBB(srcLocation, srcResource, pair,
							locationToLocation, meter, trgLocation)) {
				Object[] result3_green = PowerSystemResourceImpl
						.pattern_PowerSystemResource_2_3_findcontext_greenBBBBBBFFFFFFFF(srcLocation, srcResource, pair,
								locationToLocation, meter, trgLocation);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge pair__meter____a = (EMoflonEdge) result3_green[7];
				// EMoflonEdge srcLocation__srcResource____PowerSystemResources = (EMoflonEdge) result3_green[8];
				// EMoflonEdge srcResource__srcLocation____Location = (EMoflonEdge) result3_green[9];
				// EMoflonEdge locationToLocation__srcLocation____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge meter__srcLocation____Location = (EMoflonEdge) result3_green[11];
				// EMoflonEdge srcLocation__meter____Assets = (EMoflonEdge) result3_green[12];
				// EMoflonEdge locationToLocation__trgLocation____target = (EMoflonEdge) result3_green[13];

				// solve CSP
				Object[] result4_bindingAndBlack = PowerSystemResourceImpl
						.pattern_PowerSystemResource_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								srcLocation, srcResource, pair, locationToLocation, meter, trgLocation);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[srcLocation] = " + srcLocation + ", " + "[srcResource] = " + srcResource + ", "
							+ "[pair] = " + pair + ", " + "[locationToLocation] = " + locationToLocation + ", "
							+ "[meter] = " + meter + ", " + "[trgLocation] = " + trgLocation + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (PowerSystemResourceImpl.pattern_PowerSystemResource_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = PowerSystemResourceImpl
							.pattern_PowerSystemResource_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					PowerSystemResourceImpl.pattern_PowerSystemResource_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return PowerSystemResourceImpl.pattern_PowerSystemResource_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Location srcLocation,
			gluemodel.CIM.IEC61970.Core.PowerSystemResource srcResource, MeterAssetMMXUPair pair, MeterAsset meter) {
		match.registerObject("srcLocation", srcLocation);
		match.registerObject("srcResource", srcResource);
		match.registerObject("pair", pair);
		match.registerObject("meter", meter);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Location srcLocation,
			gluemodel.CIM.IEC61970.Core.PowerSystemResource srcResource, MeterAssetMMXUPair pair, MeterAsset meter) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Location srcLocation,
			gluemodel.CIM.IEC61970.Core.PowerSystemResource srcResource, MeterAssetMMXUPair pair,
			LocationToLocation locationToLocation, MeterAsset meter, outagePreventionJointarget.Location trgLocation) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("srcLocation", srcLocation);
		isApplicableMatch.registerObject("srcResource", srcResource);
		isApplicableMatch.registerObject("pair", pair);
		isApplicableMatch.registerObject("locationToLocation", locationToLocation);
		isApplicableMatch.registerObject("meter", meter);
		isApplicableMatch.registerObject("trgLocation", trgLocation);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject srcLocation, EObject trgResource,
			EObject resourceToResource, EObject srcResource, EObject pair, EObject locationToLocation, EObject meter,
			EObject trgLocation) {
		ruleresult.registerObject("srcLocation", srcLocation);
		ruleresult.registerObject("trgResource", trgResource);
		ruleresult.registerObject("resourceToResource", resourceToResource);
		ruleresult.registerObject("srcResource", srcResource);
		ruleresult.registerObject("pair", pair);
		ruleresult.registerObject("locationToLocation", locationToLocation);
		ruleresult.registerObject("meter", meter);
		ruleresult.registerObject("trgLocation", trgLocation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_49(EMoflonEdge _edge_PowerSystemResources) {
		// prepare return value
		Object[] result1_bindingAndBlack = PowerSystemResourceImpl
				.pattern_PowerSystemResource_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = PowerSystemResourceImpl.pattern_PowerSystemResource_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PowerSystemResourceImpl
				.pattern_PowerSystemResource_10_2_testcorematchandDECs_blackFFFFB(_edge_PowerSystemResources)) {
			Location srcLocation = (Location) result2_black[0];
			gluemodel.CIM.IEC61970.Core.PowerSystemResource srcResource = (gluemodel.CIM.IEC61970.Core.PowerSystemResource) result2_black[1];
			MeterAssetMMXUPair pair = (MeterAssetMMXUPair) result2_black[2];
			MeterAsset meter = (MeterAsset) result2_black[3];
			Object[] result2_green = PowerSystemResourceImpl
					.pattern_PowerSystemResource_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PowerSystemResourceImpl
					.pattern_PowerSystemResource_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, srcLocation, srcResource, pair, meter)) {
				// Ensure that the correct types of elements are matched
				if (PowerSystemResourceImpl
						.pattern_PowerSystemResource_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = PowerSystemResourceImpl
							.pattern_PowerSystemResource_10_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					PowerSystemResourceImpl.pattern_PowerSystemResource_10_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return PowerSystemResourceImpl.pattern_PowerSystemResource_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("PowerSystemResource");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
			} else {
				ruleResult.setSuccess(false);
				return ruleResult;
			}
		}

		return ruleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_CC(Match sourceMatch, Match targetMatch) {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_FWD(Location srcLocation, gluemodel.CIM.IEC61970.Core.PowerSystemResource srcResource,
			MeterAssetMMXUPair pair, MeterAsset meter) {// match tgg pattern
		Object[] result1_black = PowerSystemResourceImpl
				.pattern_PowerSystemResource_13_1_matchtggpattern_blackBBBB(srcLocation, srcResource, pair, meter);
		if (result1_black != null) {
			return PowerSystemResourceImpl.pattern_PowerSystemResource_13_2_expressionF();
		} else {
			return PowerSystemResourceImpl.pattern_PowerSystemResource_13_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RulesPackage.POWER_SYSTEM_RESOURCE___IS_APPROPRIATE_FWD__MATCH_LOCATION_POWERSYSTEMRESOURCE_METERASSETMMXUPAIR_METERASSET:
			return isAppropriate_FWD((Match) arguments.get(0), (Location) arguments.get(1),
					(gluemodel.CIM.IEC61970.Core.PowerSystemResource) arguments.get(2),
					(MeterAssetMMXUPair) arguments.get(3), (MeterAsset) arguments.get(4));
		case RulesPackage.POWER_SYSTEM_RESOURCE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.POWER_SYSTEM_RESOURCE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.POWER_SYSTEM_RESOURCE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_LOCATION_POWERSYSTEMRESOURCE_METERASSETMMXUPAIR_METERASSET:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Location) arguments.get(1),
					(gluemodel.CIM.IEC61970.Core.PowerSystemResource) arguments.get(2),
					(MeterAssetMMXUPair) arguments.get(3), (MeterAsset) arguments.get(4));
			return null;
		case RulesPackage.POWER_SYSTEM_RESOURCE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_LOCATION_POWERSYSTEMRESOURCE_METERASSETMMXUPAIR_METERASSET:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Location) arguments.get(1),
					(gluemodel.CIM.IEC61970.Core.PowerSystemResource) arguments.get(2),
					(MeterAssetMMXUPair) arguments.get(3), (MeterAsset) arguments.get(4));
		case RulesPackage.POWER_SYSTEM_RESOURCE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.POWER_SYSTEM_RESOURCE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_LOCATION_POWERSYSTEMRESOURCE_METERASSETMMXUPAIR_LOCATIONTOLOCATION_METERASSET_LOCATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Location) arguments.get(1),
					(gluemodel.CIM.IEC61970.Core.PowerSystemResource) arguments.get(2),
					(MeterAssetMMXUPair) arguments.get(3), (LocationToLocation) arguments.get(4),
					(MeterAsset) arguments.get(5), (outagePreventionJointarget.Location) arguments.get(6));
		case RulesPackage.POWER_SYSTEM_RESOURCE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.POWER_SYSTEM_RESOURCE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.POWER_SYSTEM_RESOURCE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.POWER_SYSTEM_RESOURCE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_49__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_49((EMoflonEdge) arguments.get(0));
		case RulesPackage.POWER_SYSTEM_RESOURCE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.POWER_SYSTEM_RESOURCE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.POWER_SYSTEM_RESOURCE___CHECK_DEC_FWD__LOCATION_POWERSYSTEMRESOURCE_METERASSETMMXUPAIR_METERASSET:
			return checkDEC_FWD((Location) arguments.get(0),
					(gluemodel.CIM.IEC61970.Core.PowerSystemResource) arguments.get(1),
					(MeterAssetMMXUPair) arguments.get(2), (MeterAsset) arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_PowerSystemResource_0_1_initialbindings_blackBBBBBB(PowerSystemResource _this,
			Match match, Location srcLocation, gluemodel.CIM.IEC61970.Core.PowerSystemResource srcResource,
			MeterAssetMMXUPair pair, MeterAsset meter) {
		return new Object[] { _this, match, srcLocation, srcResource, pair, meter };
	}

	public static final Object[] pattern_PowerSystemResource_0_2_SolveCSP_bindingFBBBBBB(PowerSystemResource _this,
			Match match, Location srcLocation, gluemodel.CIM.IEC61970.Core.PowerSystemResource srcResource,
			MeterAssetMMXUPair pair, MeterAsset meter) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, srcLocation, srcResource, pair, meter);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, srcLocation, srcResource, pair, meter };
		}
		return null;
	}

	public static final Object[] pattern_PowerSystemResource_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PowerSystemResource_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			PowerSystemResource _this, Match match, Location srcLocation,
			gluemodel.CIM.IEC61970.Core.PowerSystemResource srcResource, MeterAssetMMXUPair pair, MeterAsset meter) {
		Object[] result_pattern_PowerSystemResource_0_2_SolveCSP_binding = pattern_PowerSystemResource_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, srcLocation, srcResource, pair, meter);
		if (result_pattern_PowerSystemResource_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PowerSystemResource_0_2_SolveCSP_binding[0];

			Object[] result_pattern_PowerSystemResource_0_2_SolveCSP_black = pattern_PowerSystemResource_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_PowerSystemResource_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, srcLocation, srcResource, pair, meter };
			}
		}
		return null;
	}

	public static final boolean pattern_PowerSystemResource_0_3_CheckCSP_expressionFBB(PowerSystemResource _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PowerSystemResource_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			Location srcLocation, gluemodel.CIM.IEC61970.Core.PowerSystemResource srcResource, MeterAssetMMXUPair pair,
			MeterAsset meter) {
		return new Object[] { match, srcLocation, srcResource, pair, meter };
	}

	public static final Object[] pattern_PowerSystemResource_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			Location srcLocation, gluemodel.CIM.IEC61970.Core.PowerSystemResource srcResource) {
		EMoflonEdge srcLocation__srcResource____PowerSystemResources = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcResource__srcLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String srcLocation__srcResource____PowerSystemResources_name_prime = "PowerSystemResources";
		String srcResource__srcLocation____Location_name_prime = "Location";
		srcLocation__srcResource____PowerSystemResources.setSrc(srcLocation);
		srcLocation__srcResource____PowerSystemResources.setTrg(srcResource);
		match.getToBeTranslatedEdges().add(srcLocation__srcResource____PowerSystemResources);
		srcResource__srcLocation____Location.setSrc(srcResource);
		srcResource__srcLocation____Location.setTrg(srcLocation);
		match.getToBeTranslatedEdges().add(srcResource__srcLocation____Location);
		srcLocation__srcResource____PowerSystemResources
				.setName(srcLocation__srcResource____PowerSystemResources_name_prime);
		srcResource__srcLocation____Location.setName(srcResource__srcLocation____Location_name_prime);
		return new Object[] { match, srcLocation, srcResource, srcLocation__srcResource____PowerSystemResources,
				srcResource__srcLocation____Location };
	}

	public static final Object[] pattern_PowerSystemResource_0_5_collectcontextelements_blackBBBBB(Match match,
			Location srcLocation, gluemodel.CIM.IEC61970.Core.PowerSystemResource srcResource, MeterAssetMMXUPair pair,
			MeterAsset meter) {
		return new Object[] { match, srcLocation, srcResource, pair, meter };
	}

	public static final Object[] pattern_PowerSystemResource_0_5_collectcontextelements_greenBBBBBFFF(Match match,
			Location srcLocation, gluemodel.CIM.IEC61970.Core.PowerSystemResource srcResource, MeterAssetMMXUPair pair,
			MeterAsset meter) {
		EMoflonEdge pair__meter____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge meter__srcLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocation__meter____Assets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(srcLocation);
		match.getContextNodes().add(srcResource);
		match.getContextNodes().add(pair);
		match.getContextNodes().add(meter);
		String pair__meter____a_name_prime = "a";
		String meter__srcLocation____Location_name_prime = "Location";
		String srcLocation__meter____Assets_name_prime = "Assets";
		pair__meter____a.setSrc(pair);
		pair__meter____a.setTrg(meter);
		match.getContextEdges().add(pair__meter____a);
		meter__srcLocation____Location.setSrc(meter);
		meter__srcLocation____Location.setTrg(srcLocation);
		match.getContextEdges().add(meter__srcLocation____Location);
		srcLocation__meter____Assets.setSrc(srcLocation);
		srcLocation__meter____Assets.setTrg(meter);
		match.getContextEdges().add(srcLocation__meter____Assets);
		pair__meter____a.setName(pair__meter____a_name_prime);
		meter__srcLocation____Location.setName(meter__srcLocation____Location_name_prime);
		srcLocation__meter____Assets.setName(srcLocation__meter____Assets_name_prime);
		return new Object[] { match, srcLocation, srcResource, pair, meter, pair__meter____a,
				meter__srcLocation____Location, srcLocation__meter____Assets };
	}

	public static final void pattern_PowerSystemResource_0_6_registerobjectstomatch_expressionBBBBBB(
			PowerSystemResource _this, Match match, Location srcLocation,
			gluemodel.CIM.IEC61970.Core.PowerSystemResource srcResource, MeterAssetMMXUPair pair, MeterAsset meter) {
		_this.registerObjectsToMatch_FWD(match, srcLocation, srcResource, pair, meter);

	}

	public static final boolean pattern_PowerSystemResource_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PowerSystemResource_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_PowerSystemResource_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("srcLocation");
		EObject _localVariable_1 = isApplicableMatch.getObject("srcResource");
		EObject _localVariable_2 = isApplicableMatch.getObject("pair");
		EObject _localVariable_3 = isApplicableMatch.getObject("locationToLocation");
		EObject _localVariable_4 = isApplicableMatch.getObject("meter");
		EObject _localVariable_5 = isApplicableMatch.getObject("trgLocation");
		EObject tmpSrcLocation = _localVariable_0;
		EObject tmpSrcResource = _localVariable_1;
		EObject tmpPair = _localVariable_2;
		EObject tmpLocationToLocation = _localVariable_3;
		EObject tmpMeter = _localVariable_4;
		EObject tmpTrgLocation = _localVariable_5;
		if (tmpSrcLocation instanceof Location) {
			Location srcLocation = (Location) tmpSrcLocation;
			if (tmpSrcResource instanceof gluemodel.CIM.IEC61970.Core.PowerSystemResource) {
				gluemodel.CIM.IEC61970.Core.PowerSystemResource srcResource = (gluemodel.CIM.IEC61970.Core.PowerSystemResource) tmpSrcResource;
				if (tmpPair instanceof MeterAssetMMXUPair) {
					MeterAssetMMXUPair pair = (MeterAssetMMXUPair) tmpPair;
					if (tmpLocationToLocation instanceof LocationToLocation) {
						LocationToLocation locationToLocation = (LocationToLocation) tmpLocationToLocation;
						if (tmpMeter instanceof MeterAsset) {
							MeterAsset meter = (MeterAsset) tmpMeter;
							if (tmpTrgLocation instanceof outagePreventionJointarget.Location) {
								outagePreventionJointarget.Location trgLocation = (outagePreventionJointarget.Location) tmpTrgLocation;
								return new Object[] { srcLocation, srcResource, pair, locationToLocation, meter,
										trgLocation, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PowerSystemResource_1_1_performtransformation_blackBBBBBBFBB(
			Location srcLocation, gluemodel.CIM.IEC61970.Core.PowerSystemResource srcResource, MeterAssetMMXUPair pair,
			LocationToLocation locationToLocation, MeterAsset meter, outagePreventionJointarget.Location trgLocation,
			PowerSystemResource _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { srcLocation, srcResource, pair, locationToLocation, meter, trgLocation, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PowerSystemResource_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			PowerSystemResource _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_PowerSystemResource_1_1_performtransformation_binding = pattern_PowerSystemResource_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_PowerSystemResource_1_1_performtransformation_binding != null) {
			Location srcLocation = (Location) result_pattern_PowerSystemResource_1_1_performtransformation_binding[0];
			gluemodel.CIM.IEC61970.Core.PowerSystemResource srcResource = (gluemodel.CIM.IEC61970.Core.PowerSystemResource) result_pattern_PowerSystemResource_1_1_performtransformation_binding[1];
			MeterAssetMMXUPair pair = (MeterAssetMMXUPair) result_pattern_PowerSystemResource_1_1_performtransformation_binding[2];
			LocationToLocation locationToLocation = (LocationToLocation) result_pattern_PowerSystemResource_1_1_performtransformation_binding[3];
			MeterAsset meter = (MeterAsset) result_pattern_PowerSystemResource_1_1_performtransformation_binding[4];
			outagePreventionJointarget.Location trgLocation = (outagePreventionJointarget.Location) result_pattern_PowerSystemResource_1_1_performtransformation_binding[5];

			Object[] result_pattern_PowerSystemResource_1_1_performtransformation_black = pattern_PowerSystemResource_1_1_performtransformation_blackBBBBBBFBB(
					srcLocation, srcResource, pair, locationToLocation, meter, trgLocation, _this, isApplicableMatch);
			if (result_pattern_PowerSystemResource_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_PowerSystemResource_1_1_performtransformation_black[6];

				return new Object[] { srcLocation, srcResource, pair, locationToLocation, meter, trgLocation, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PowerSystemResource_1_1_performtransformation_greenFFBB(
			gluemodel.CIM.IEC61970.Core.PowerSystemResource srcResource,
			outagePreventionJointarget.Location trgLocation) {
		outagePreventionJointarget.PowerSystemResource trgResource = OutagePreventionJointargetFactory.eINSTANCE
				.createPowerSystemResource();
		PowerSystemResourceToPowerSystemResource resourceToResource = Task2Factory.eINSTANCE
				.createPowerSystemResourceToPowerSystemResource();
		trgLocation.getPowerSystemResources().add(trgResource);
		resourceToResource.setTarget(trgResource);
		resourceToResource.setSource(srcResource);
		return new Object[] { trgResource, resourceToResource, srcResource, trgLocation };
	}

	public static final Object[] pattern_PowerSystemResource_1_2_collecttranslatedelements_blackBB(
			outagePreventionJointarget.PowerSystemResource trgResource,
			PowerSystemResourceToPowerSystemResource resourceToResource) {
		return new Object[] { trgResource, resourceToResource };
	}

	public static final Object[] pattern_PowerSystemResource_1_2_collecttranslatedelements_greenFBB(
			outagePreventionJointarget.PowerSystemResource trgResource,
			PowerSystemResourceToPowerSystemResource resourceToResource) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(trgResource);
		ruleresult.getCreatedLinkElements().add(resourceToResource);
		return new Object[] { ruleresult, trgResource, resourceToResource };
	}

	public static final Object[] pattern_PowerSystemResource_1_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject srcLocation, EObject trgResource, EObject resourceToResource,
			EObject srcResource, EObject pair, EObject locationToLocation, EObject meter, EObject trgLocation) {
		if (!srcLocation.equals(trgResource)) {
			if (!srcLocation.equals(srcResource)) {
				if (!srcLocation.equals(trgLocation)) {
					if (!resourceToResource.equals(srcLocation)) {
						if (!resourceToResource.equals(trgResource)) {
							if (!resourceToResource.equals(srcResource)) {
								if (!resourceToResource.equals(trgLocation)) {
									if (!srcResource.equals(trgResource)) {
										if (!srcResource.equals(trgLocation)) {
											if (!pair.equals(srcLocation)) {
												if (!pair.equals(trgResource)) {
													if (!pair.equals(resourceToResource)) {
														if (!pair.equals(srcResource)) {
															if (!pair.equals(trgLocation)) {
																if (!locationToLocation.equals(srcLocation)) {
																	if (!locationToLocation.equals(trgResource)) {
																		if (!locationToLocation
																				.equals(resourceToResource)) {
																			if (!locationToLocation
																					.equals(srcResource)) {
																				if (!locationToLocation.equals(pair)) {
																					if (!locationToLocation
																							.equals(meter)) {
																						if (!locationToLocation
																								.equals(trgLocation)) {
																							if (!meter.equals(
																									srcLocation)) {
																								if (!meter.equals(
																										trgResource)) {
																									if (!meter.equals(
																											resourceToResource)) {
																										if (!meter
																												.equals(srcResource)) {
																											if (!meter
																													.equals(pair)) {
																												if (!meter
																														.equals(trgLocation)) {
																													if (!trgLocation
																															.equals(trgResource)) {
																														return new Object[] {
																																ruleresult,
																																srcLocation,
																																trgResource,
																																resourceToResource,
																																srcResource,
																																pair,
																																locationToLocation,
																																meter,
																																trgLocation };
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PowerSystemResource_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject srcLocation, EObject trgResource, EObject resourceToResource,
			EObject srcResource, EObject trgLocation) {
		EMoflonEdge resourceToResource__trgResource____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge resourceToResource__srcResource____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocation__srcResource____PowerSystemResources = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcResource__srcLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgLocation__trgResource____PowerSystemResources = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "PowerSystemResource";
		String resourceToResource__trgResource____target_name_prime = "target";
		String resourceToResource__srcResource____source_name_prime = "source";
		String srcLocation__srcResource____PowerSystemResources_name_prime = "PowerSystemResources";
		String srcResource__srcLocation____Location_name_prime = "Location";
		String trgLocation__trgResource____PowerSystemResources_name_prime = "PowerSystemResources";
		resourceToResource__trgResource____target.setSrc(resourceToResource);
		resourceToResource__trgResource____target.setTrg(trgResource);
		ruleresult.getCreatedEdges().add(resourceToResource__trgResource____target);
		resourceToResource__srcResource____source.setSrc(resourceToResource);
		resourceToResource__srcResource____source.setTrg(srcResource);
		ruleresult.getCreatedEdges().add(resourceToResource__srcResource____source);
		srcLocation__srcResource____PowerSystemResources.setSrc(srcLocation);
		srcLocation__srcResource____PowerSystemResources.setTrg(srcResource);
		ruleresult.getTranslatedEdges().add(srcLocation__srcResource____PowerSystemResources);
		srcResource__srcLocation____Location.setSrc(srcResource);
		srcResource__srcLocation____Location.setTrg(srcLocation);
		ruleresult.getTranslatedEdges().add(srcResource__srcLocation____Location);
		trgLocation__trgResource____PowerSystemResources.setSrc(trgLocation);
		trgLocation__trgResource____PowerSystemResources.setTrg(trgResource);
		ruleresult.getCreatedEdges().add(trgLocation__trgResource____PowerSystemResources);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		resourceToResource__trgResource____target.setName(resourceToResource__trgResource____target_name_prime);
		resourceToResource__srcResource____source.setName(resourceToResource__srcResource____source_name_prime);
		srcLocation__srcResource____PowerSystemResources
				.setName(srcLocation__srcResource____PowerSystemResources_name_prime);
		srcResource__srcLocation____Location.setName(srcResource__srcLocation____Location_name_prime);
		trgLocation__trgResource____PowerSystemResources
				.setName(trgLocation__trgResource____PowerSystemResources_name_prime);
		return new Object[] { ruleresult, srcLocation, trgResource, resourceToResource, srcResource, trgLocation,
				resourceToResource__trgResource____target, resourceToResource__srcResource____source,
				srcLocation__srcResource____PowerSystemResources, srcResource__srcLocation____Location,
				trgLocation__trgResource____PowerSystemResources };
	}

	public static final void pattern_PowerSystemResource_1_5_registerobjects_expressionBBBBBBBBBB(
			PowerSystemResource _this, PerformRuleResult ruleresult, EObject srcLocation, EObject trgResource,
			EObject resourceToResource, EObject srcResource, EObject pair, EObject locationToLocation, EObject meter,
			EObject trgLocation) {
		_this.registerObjects_FWD(ruleresult, srcLocation, trgResource, resourceToResource, srcResource, pair,
				locationToLocation, meter, trgLocation);

	}

	public static final PerformRuleResult pattern_PowerSystemResource_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PowerSystemResource_2_1_preparereturnvalue_bindingFB(
			PowerSystemResource _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PowerSystemResource_2_1_preparereturnvalue_blackFBB(EClass eClass,
			PowerSystemResource _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PowerSystemResource_2_1_preparereturnvalue_bindingAndBlackFFB(
			PowerSystemResource _this) {
		Object[] result_pattern_PowerSystemResource_2_1_preparereturnvalue_binding = pattern_PowerSystemResource_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_PowerSystemResource_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_PowerSystemResource_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_PowerSystemResource_2_1_preparereturnvalue_black = pattern_PowerSystemResource_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_PowerSystemResource_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_PowerSystemResource_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PowerSystemResource_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "PowerSystemResource";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_PowerSystemResource_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("srcLocation");
		EObject _localVariable_1 = match.getObject("srcResource");
		EObject _localVariable_2 = match.getObject("pair");
		EObject _localVariable_3 = match.getObject("meter");
		EObject tmpSrcLocation = _localVariable_0;
		EObject tmpSrcResource = _localVariable_1;
		EObject tmpPair = _localVariable_2;
		EObject tmpMeter = _localVariable_3;
		if (tmpSrcLocation instanceof Location) {
			Location srcLocation = (Location) tmpSrcLocation;
			if (tmpSrcResource instanceof gluemodel.CIM.IEC61970.Core.PowerSystemResource) {
				gluemodel.CIM.IEC61970.Core.PowerSystemResource srcResource = (gluemodel.CIM.IEC61970.Core.PowerSystemResource) tmpSrcResource;
				if (tmpPair instanceof MeterAssetMMXUPair) {
					MeterAssetMMXUPair pair = (MeterAssetMMXUPair) tmpPair;
					if (tmpMeter instanceof MeterAsset) {
						MeterAsset meter = (MeterAsset) tmpMeter;
						return new Object[] { srcLocation, srcResource, pair, meter, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PowerSystemResource_2_2_corematch_blackBBBFBFB(Location srcLocation,
			gluemodel.CIM.IEC61970.Core.PowerSystemResource srcResource, MeterAssetMMXUPair pair, MeterAsset meter,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (LocationToLocation locationToLocation : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(srcLocation, LocationToLocation.class, "source")) {
			outagePreventionJointarget.Location trgLocation = locationToLocation.getTarget();
			if (trgLocation != null) {
				_result.add(
						new Object[] { srcLocation, srcResource, pair, locationToLocation, meter, trgLocation, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_PowerSystemResource_2_3_findcontext_blackBBBBBB(Location srcLocation,
			gluemodel.CIM.IEC61970.Core.PowerSystemResource srcResource, MeterAssetMMXUPair pair,
			LocationToLocation locationToLocation, MeterAsset meter, outagePreventionJointarget.Location trgLocation) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (meter.equals(pair.getA())) {
			if (srcLocation.getPowerSystemResources().contains(srcResource)) {
				if (srcLocation.equals(locationToLocation.getSource())) {
					if (srcLocation.equals(meter.getLocation())) {
						if (trgLocation.equals(locationToLocation.getTarget())) {
							_result.add(new Object[] { srcLocation, srcResource, pair, locationToLocation, meter,
									trgLocation });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_PowerSystemResource_2_3_findcontext_greenBBBBBBFFFFFFFF(Location srcLocation,
			gluemodel.CIM.IEC61970.Core.PowerSystemResource srcResource, MeterAssetMMXUPair pair,
			LocationToLocation locationToLocation, MeterAsset meter, outagePreventionJointarget.Location trgLocation) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge pair__meter____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocation__srcResource____PowerSystemResources = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcResource__srcLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge locationToLocation__srcLocation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge meter__srcLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocation__meter____Assets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge locationToLocation__trgLocation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String pair__meter____a_name_prime = "a";
		String srcLocation__srcResource____PowerSystemResources_name_prime = "PowerSystemResources";
		String srcResource__srcLocation____Location_name_prime = "Location";
		String locationToLocation__srcLocation____source_name_prime = "source";
		String meter__srcLocation____Location_name_prime = "Location";
		String srcLocation__meter____Assets_name_prime = "Assets";
		String locationToLocation__trgLocation____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(srcLocation);
		isApplicableMatch.getAllContextElements().add(srcResource);
		isApplicableMatch.getAllContextElements().add(pair);
		isApplicableMatch.getAllContextElements().add(locationToLocation);
		isApplicableMatch.getAllContextElements().add(meter);
		isApplicableMatch.getAllContextElements().add(trgLocation);
		pair__meter____a.setSrc(pair);
		pair__meter____a.setTrg(meter);
		isApplicableMatch.getAllContextElements().add(pair__meter____a);
		srcLocation__srcResource____PowerSystemResources.setSrc(srcLocation);
		srcLocation__srcResource____PowerSystemResources.setTrg(srcResource);
		isApplicableMatch.getAllContextElements().add(srcLocation__srcResource____PowerSystemResources);
		srcResource__srcLocation____Location.setSrc(srcResource);
		srcResource__srcLocation____Location.setTrg(srcLocation);
		isApplicableMatch.getAllContextElements().add(srcResource__srcLocation____Location);
		locationToLocation__srcLocation____source.setSrc(locationToLocation);
		locationToLocation__srcLocation____source.setTrg(srcLocation);
		isApplicableMatch.getAllContextElements().add(locationToLocation__srcLocation____source);
		meter__srcLocation____Location.setSrc(meter);
		meter__srcLocation____Location.setTrg(srcLocation);
		isApplicableMatch.getAllContextElements().add(meter__srcLocation____Location);
		srcLocation__meter____Assets.setSrc(srcLocation);
		srcLocation__meter____Assets.setTrg(meter);
		isApplicableMatch.getAllContextElements().add(srcLocation__meter____Assets);
		locationToLocation__trgLocation____target.setSrc(locationToLocation);
		locationToLocation__trgLocation____target.setTrg(trgLocation);
		isApplicableMatch.getAllContextElements().add(locationToLocation__trgLocation____target);
		pair__meter____a.setName(pair__meter____a_name_prime);
		srcLocation__srcResource____PowerSystemResources
				.setName(srcLocation__srcResource____PowerSystemResources_name_prime);
		srcResource__srcLocation____Location.setName(srcResource__srcLocation____Location_name_prime);
		locationToLocation__srcLocation____source.setName(locationToLocation__srcLocation____source_name_prime);
		meter__srcLocation____Location.setName(meter__srcLocation____Location_name_prime);
		srcLocation__meter____Assets.setName(srcLocation__meter____Assets_name_prime);
		locationToLocation__trgLocation____target.setName(locationToLocation__trgLocation____target_name_prime);
		return new Object[] { srcLocation, srcResource, pair, locationToLocation, meter, trgLocation, isApplicableMatch,
				pair__meter____a, srcLocation__srcResource____PowerSystemResources,
				srcResource__srcLocation____Location, locationToLocation__srcLocation____source,
				meter__srcLocation____Location, srcLocation__meter____Assets,
				locationToLocation__trgLocation____target };
	}

	public static final Object[] pattern_PowerSystemResource_2_4_solveCSP_bindingFBBBBBBBB(PowerSystemResource _this,
			IsApplicableMatch isApplicableMatch, Location srcLocation,
			gluemodel.CIM.IEC61970.Core.PowerSystemResource srcResource, MeterAssetMMXUPair pair,
			LocationToLocation locationToLocation, MeterAsset meter, outagePreventionJointarget.Location trgLocation) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, srcLocation, srcResource, pair,
				locationToLocation, meter, trgLocation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, srcLocation, srcResource, pair, locationToLocation,
					meter, trgLocation };
		}
		return null;
	}

	public static final Object[] pattern_PowerSystemResource_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PowerSystemResource_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			PowerSystemResource _this, IsApplicableMatch isApplicableMatch, Location srcLocation,
			gluemodel.CIM.IEC61970.Core.PowerSystemResource srcResource, MeterAssetMMXUPair pair,
			LocationToLocation locationToLocation, MeterAsset meter, outagePreventionJointarget.Location trgLocation) {
		Object[] result_pattern_PowerSystemResource_2_4_solveCSP_binding = pattern_PowerSystemResource_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, srcLocation, srcResource, pair, locationToLocation, meter, trgLocation);
		if (result_pattern_PowerSystemResource_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PowerSystemResource_2_4_solveCSP_binding[0];

			Object[] result_pattern_PowerSystemResource_2_4_solveCSP_black = pattern_PowerSystemResource_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_PowerSystemResource_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, srcLocation, srcResource, pair, locationToLocation,
						meter, trgLocation };
			}
		}
		return null;
	}

	public static final boolean pattern_PowerSystemResource_2_5_checkCSP_expressionFBB(PowerSystemResource _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PowerSystemResource_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_PowerSystemResource_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "PowerSystemResource";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_PowerSystemResource_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PowerSystemResource_10_1_preparereturnvalue_bindingFB(
			PowerSystemResource _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PowerSystemResource_10_1_preparereturnvalue_blackFBBF(EClass __eClass,
			PowerSystemResource _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperation_name = __performOperation.getName();
			if (__performOperation_name.equals("isApplicable_FWD")) {
				for (EOperation isApplicableCC : __eClass.getEOperations()) {
					if (!__performOperation.equals(isApplicableCC)) {
						String isApplicableCC_name = isApplicableCC.getName();
						if (isApplicableCC_name.equals("isApplicable_CC")) {
							return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
						}

					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_PowerSystemResource_10_1_preparereturnvalue_bindingAndBlackFFBF(
			PowerSystemResource _this) {
		Object[] result_pattern_PowerSystemResource_10_1_preparereturnvalue_binding = pattern_PowerSystemResource_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_PowerSystemResource_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_PowerSystemResource_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_PowerSystemResource_10_1_preparereturnvalue_black = pattern_PowerSystemResource_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_PowerSystemResource_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PowerSystemResource_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_PowerSystemResource_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_PowerSystemResource_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_PowerSystemResource_10_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_PowerSystemResources) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSrcLocation = _edge_PowerSystemResources.getSrc();
		if (tmpSrcLocation instanceof Location) {
			Location srcLocation = (Location) tmpSrcLocation;
			EObject tmpSrcResource = _edge_PowerSystemResources.getTrg();
			if (tmpSrcResource instanceof gluemodel.CIM.IEC61970.Core.PowerSystemResource) {
				gluemodel.CIM.IEC61970.Core.PowerSystemResource srcResource = (gluemodel.CIM.IEC61970.Core.PowerSystemResource) tmpSrcResource;
				if (srcLocation.getPowerSystemResources().contains(srcResource)) {
					for (Asset tmpMeter : srcLocation.getAssets()) {
						if (tmpMeter instanceof MeterAsset) {
							MeterAsset meter = (MeterAsset) tmpMeter;
							for (MeterAssetMMXUPair pair : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(meter, MeterAssetMMXUPair.class, "a")) {
								_result.add(new Object[] { srcLocation, srcResource, pair, meter,
										_edge_PowerSystemResources });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_PowerSystemResource_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PowerSystemResource_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			PowerSystemResource _this, Match match, Location srcLocation,
			gluemodel.CIM.IEC61970.Core.PowerSystemResource srcResource, MeterAssetMMXUPair pair, MeterAsset meter) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, srcLocation, srcResource, pair, meter);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PowerSystemResource_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			PowerSystemResource _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PowerSystemResource_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_PowerSystemResource_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_PowerSystemResource_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PowerSystemResource_13_1_matchtggpattern_blackBBBB(Location srcLocation,
			gluemodel.CIM.IEC61970.Core.PowerSystemResource srcResource, MeterAssetMMXUPair pair, MeterAsset meter) {
		if (meter.equals(pair.getA())) {
			if (srcLocation.getPowerSystemResources().contains(srcResource)) {
				if (srcLocation.equals(meter.getLocation())) {
					return new Object[] { srcLocation, srcResource, pair, meter };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_PowerSystemResource_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PowerSystemResource_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //PowerSystemResourceImpl
