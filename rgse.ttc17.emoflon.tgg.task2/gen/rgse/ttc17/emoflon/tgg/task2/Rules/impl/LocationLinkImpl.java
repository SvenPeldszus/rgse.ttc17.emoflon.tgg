/**
 */
package rgse.ttc17.emoflon.tgg.task2.Rules.impl;

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

import outagePreventionJointarget.PMUVoltageMeter;

import rgse.ttc17.emoflon.tgg.task2.LocationToLocation;
import rgse.ttc17.emoflon.tgg.task2.MeterAssetToPMUVoltageMeter;

import rgse.ttc17.emoflon.tgg.task2.Rules.LocationLink;
import rgse.ttc17.emoflon.tgg.task2.Rules.RulesPackage;
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
 * An implementation of the model object '<em><b>Location Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LocationLinkImpl extends AbstractRuleImpl implements LocationLink {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getLocationLink();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MeterAssetMMXUPair pair, Location location, MeterAsset asset) {
		// initial bindings
		Object[] result1_black = LocationLinkImpl.pattern_LocationLink_0_1_initialbindings_blackBBBBB(this, match, pair,
				location, asset);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[pair] = " + pair + ", "
					+ "[location] = " + location + ", " + "[asset] = " + asset + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = LocationLinkImpl
				.pattern_LocationLink_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, pair, location, asset);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[pair] = " + pair + ", " + "[location] = " + location
					+ ", " + "[asset] = " + asset + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (LocationLinkImpl.pattern_LocationLink_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = LocationLinkImpl
					.pattern_LocationLink_0_4_collectelementstobetranslated_blackBBBB(match, pair, location, asset);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[pair] = " + pair + ", " + "[location] = "
						+ location + ", " + "[asset] = " + asset + ".");
			}
			LocationLinkImpl.pattern_LocationLink_0_4_collectelementstobetranslated_greenBBBFF(match, location, asset);
			// EMoflonEdge asset__location____Location = (EMoflonEdge) result4_green[3];
			// EMoflonEdge location__asset____Assets = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = LocationLinkImpl.pattern_LocationLink_0_5_collectcontextelements_blackBBBB(match,
					pair, location, asset);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[pair] = " + pair + ", " + "[location] = "
						+ location + ", " + "[asset] = " + asset + ".");
			}
			LocationLinkImpl.pattern_LocationLink_0_5_collectcontextelements_greenBBBBF(match, pair, location, asset);
			// EMoflonEdge pair__asset____a = (EMoflonEdge) result5_green[4];

			// register objects to match
			LocationLinkImpl.pattern_LocationLink_0_6_registerobjectstomatch_expressionBBBBB(this, match, pair,
					location, asset);
			return LocationLinkImpl.pattern_LocationLink_0_7_expressionF();
		} else {
			return LocationLinkImpl.pattern_LocationLink_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = LocationLinkImpl
				.pattern_LocationLink_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MeterAssetMMXUPair pair = (MeterAssetMMXUPair) result1_bindingAndBlack[0];
		outagePreventionJointarget.Location trgLocation = (outagePreventionJointarget.Location) result1_bindingAndBlack[1];
		Location location = (Location) result1_bindingAndBlack[2];
		MeterAssetToPMUVoltageMeter assetToPMU = (MeterAssetToPMUVoltageMeter) result1_bindingAndBlack[3];
		LocationToLocation locationCorr = (LocationToLocation) result1_bindingAndBlack[4];
		MeterAsset asset = (MeterAsset) result1_bindingAndBlack[5];
		PMUVoltageMeter consumer = (PMUVoltageMeter) result1_bindingAndBlack[6];
		// CSP csp = (CSP) result1_bindingAndBlack[7];
		LocationLinkImpl.pattern_LocationLink_1_1_performtransformation_greenBB(trgLocation, consumer);

		// collect translated elements
		Object[] result2_green = LocationLinkImpl.pattern_LocationLink_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = LocationLinkImpl.pattern_LocationLink_1_3_bookkeepingforedges_blackBBBBBBBB(ruleresult,
				pair, trgLocation, location, assetToPMU, locationCorr, asset, consumer);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[pair] = " + pair + ", " + "[trgLocation] = "
					+ trgLocation + ", " + "[location] = " + location + ", " + "[assetToPMU] = " + assetToPMU + ", "
					+ "[locationCorr] = " + locationCorr + ", " + "[asset] = " + asset + ", " + "[consumer] = "
					+ consumer + ".");
		}
		LocationLinkImpl.pattern_LocationLink_1_3_bookkeepingforedges_greenBBBBBFFF(ruleresult, trgLocation, location,
				asset, consumer);
		// EMoflonEdge asset__location____Location = (EMoflonEdge) result3_green[5];
		// EMoflonEdge location__asset____Assets = (EMoflonEdge) result3_green[6];
		// EMoflonEdge consumer__trgLocation____Location = (EMoflonEdge) result3_green[7];

		// perform postprocessing story node is empty
		// register objects
		LocationLinkImpl.pattern_LocationLink_1_5_registerobjects_expressionBBBBBBBBB(this, ruleresult, pair,
				trgLocation, location, assetToPMU, locationCorr, asset, consumer);
		return LocationLinkImpl.pattern_LocationLink_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = LocationLinkImpl
				.pattern_LocationLink_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LocationLinkImpl.pattern_LocationLink_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = LocationLinkImpl.pattern_LocationLink_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MeterAssetMMXUPair pair = (MeterAssetMMXUPair) result2_binding[0];
		Location location = (Location) result2_binding[1];
		MeterAsset asset = (MeterAsset) result2_binding[2];
		for (Object[] result2_black : LocationLinkImpl.pattern_LocationLink_2_2_corematch_blackBFBFFBFB(pair, location,
				asset, match)) {
			outagePreventionJointarget.Location trgLocation = (outagePreventionJointarget.Location) result2_black[1];
			MeterAssetToPMUVoltageMeter assetToPMU = (MeterAssetToPMUVoltageMeter) result2_black[3];
			LocationToLocation locationCorr = (LocationToLocation) result2_black[4];
			PMUVoltageMeter consumer = (PMUVoltageMeter) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : LocationLinkImpl.pattern_LocationLink_2_3_findcontext_blackBBBBBBB(pair,
					trgLocation, location, assetToPMU, locationCorr, asset, consumer)) {
				Object[] result3_green = LocationLinkImpl.pattern_LocationLink_2_3_findcontext_greenBBBBBBBFFFFFFFF(
						pair, trgLocation, location, assetToPMU, locationCorr, asset, consumer);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				// EMoflonEdge pair__asset____a = (EMoflonEdge) result3_green[8];
				// EMoflonEdge locationCorr__trgLocation____target = (EMoflonEdge) result3_green[9];
				// EMoflonEdge assetToPMU__asset____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge asset__location____Location = (EMoflonEdge) result3_green[11];
				// EMoflonEdge location__asset____Assets = (EMoflonEdge) result3_green[12];
				// EMoflonEdge locationCorr__location____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge assetToPMU__consumer____target = (EMoflonEdge) result3_green[14];

				// solve CSP
				Object[] result4_bindingAndBlack = LocationLinkImpl
						.pattern_LocationLink_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, pair,
								trgLocation, location, assetToPMU, locationCorr, asset, consumer);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[pair] = " + pair + ", " + "[trgLocation] = " + trgLocation + ", " + "[location] = "
							+ location + ", " + "[assetToPMU] = " + assetToPMU + ", " + "[locationCorr] = "
							+ locationCorr + ", " + "[asset] = " + asset + ", " + "[consumer] = " + consumer + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (LocationLinkImpl.pattern_LocationLink_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = LocationLinkImpl
							.pattern_LocationLink_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					LocationLinkImpl.pattern_LocationLink_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return LocationLinkImpl.pattern_LocationLink_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MeterAssetMMXUPair pair, Location location, MeterAsset asset) {
		match.registerObject("pair", pair);
		match.registerObject("location", location);
		match.registerObject("asset", asset);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MeterAssetMMXUPair pair, Location location, MeterAsset asset) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MeterAssetMMXUPair pair,
			outagePreventionJointarget.Location trgLocation, Location location, MeterAssetToPMUVoltageMeter assetToPMU,
			LocationToLocation locationCorr, MeterAsset asset, PMUVoltageMeter consumer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("pair", pair);
		isApplicableMatch.registerObject("trgLocation", trgLocation);
		isApplicableMatch.registerObject("location", location);
		isApplicableMatch.registerObject("assetToPMU", assetToPMU);
		isApplicableMatch.registerObject("locationCorr", locationCorr);
		isApplicableMatch.registerObject("asset", asset);
		isApplicableMatch.registerObject("consumer", consumer);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject pair, EObject trgLocation, EObject location,
			EObject assetToPMU, EObject locationCorr, EObject asset, EObject consumer) {
		ruleresult.registerObject("pair", pair);
		ruleresult.registerObject("trgLocation", trgLocation);
		ruleresult.registerObject("location", location);
		ruleresult.registerObject("assetToPMU", assetToPMU);
		ruleresult.registerObject("locationCorr", locationCorr);
		ruleresult.registerObject("asset", asset);
		ruleresult.registerObject("consumer", consumer);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_158(EMoflonEdge _edge_Location) {
		// prepare return value
		Object[] result1_bindingAndBlack = LocationLinkImpl
				.pattern_LocationLink_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = LocationLinkImpl.pattern_LocationLink_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : LocationLinkImpl
				.pattern_LocationLink_10_2_testcorematchandDECs_blackFFFB(_edge_Location)) {
			MeterAssetMMXUPair pair = (MeterAssetMMXUPair) result2_black[0];
			Location location = (Location) result2_black[1];
			MeterAsset asset = (MeterAsset) result2_black[2];
			Object[] result2_green = LocationLinkImpl.pattern_LocationLink_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (LocationLinkImpl.pattern_LocationLink_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
					this, match, pair, location, asset)) {
				// Ensure that the correct types of elements are matched
				if (LocationLinkImpl
						.pattern_LocationLink_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = LocationLinkImpl.pattern_LocationLink_10_5_Addmatchtoruleresult_blackBBBB(
							match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					LocationLinkImpl.pattern_LocationLink_10_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return LocationLinkImpl.pattern_LocationLink_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("LocationLink");
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
	public boolean checkDEC_FWD(MeterAssetMMXUPair pair, Location location, MeterAsset asset) {// match tgg pattern
		Object[] result1_black = LocationLinkImpl.pattern_LocationLink_13_1_matchtggpattern_blackBBB(pair, location,
				asset);
		if (result1_black != null) {
			return LocationLinkImpl.pattern_LocationLink_13_2_expressionF();
		} else {
			return LocationLinkImpl.pattern_LocationLink_13_3_expressionF();
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
		case RulesPackage.LOCATION_LINK___IS_APPROPRIATE_FWD__MATCH_METERASSETMMXUPAIR_LOCATION_METERASSET:
			return isAppropriate_FWD((Match) arguments.get(0), (MeterAssetMMXUPair) arguments.get(1),
					(Location) arguments.get(2), (MeterAsset) arguments.get(3));
		case RulesPackage.LOCATION_LINK___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LOCATION_LINK___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.LOCATION_LINK___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_METERASSETMMXUPAIR_LOCATION_METERASSET:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MeterAssetMMXUPair) arguments.get(1),
					(Location) arguments.get(2), (MeterAsset) arguments.get(3));
			return null;
		case RulesPackage.LOCATION_LINK___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_METERASSETMMXUPAIR_LOCATION_METERASSET:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MeterAssetMMXUPair) arguments.get(1),
					(Location) arguments.get(2), (MeterAsset) arguments.get(3));
		case RulesPackage.LOCATION_LINK___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LOCATION_LINK___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_METERASSETMMXUPAIR_LOCATION_LOCATION_METERASSETTOPMUVOLTAGEMETER_LOCATIONTOLOCATION_METERASSET_PMUVOLTAGEMETER:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(MeterAssetMMXUPair) arguments.get(1), (outagePreventionJointarget.Location) arguments.get(2),
					(Location) arguments.get(3), (MeterAssetToPMUVoltageMeter) arguments.get(4),
					(LocationToLocation) arguments.get(5), (MeterAsset) arguments.get(6),
					(PMUVoltageMeter) arguments.get(7));
		case RulesPackage.LOCATION_LINK___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LOCATION_LINK___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.LOCATION_LINK___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.LOCATION_LINK___IS_APPROPRIATE_FWD_EMOFLON_EDGE_158__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_158((EMoflonEdge) arguments.get(0));
		case RulesPackage.LOCATION_LINK___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.LOCATION_LINK___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.LOCATION_LINK___CHECK_DEC_FWD__METERASSETMMXUPAIR_LOCATION_METERASSET:
			return checkDEC_FWD((MeterAssetMMXUPair) arguments.get(0), (Location) arguments.get(1),
					(MeterAsset) arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_LocationLink_0_1_initialbindings_blackBBBBB(LocationLink _this, Match match,
			MeterAssetMMXUPair pair, Location location, MeterAsset asset) {
		return new Object[] { _this, match, pair, location, asset };
	}

	public static final Object[] pattern_LocationLink_0_2_SolveCSP_bindingFBBBBB(LocationLink _this, Match match,
			MeterAssetMMXUPair pair, Location location, MeterAsset asset) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, pair, location, asset);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, pair, location, asset };
		}
		return null;
	}

	public static final Object[] pattern_LocationLink_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LocationLink_0_2_SolveCSP_bindingAndBlackFBBBBB(LocationLink _this,
			Match match, MeterAssetMMXUPair pair, Location location, MeterAsset asset) {
		Object[] result_pattern_LocationLink_0_2_SolveCSP_binding = pattern_LocationLink_0_2_SolveCSP_bindingFBBBBB(
				_this, match, pair, location, asset);
		if (result_pattern_LocationLink_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LocationLink_0_2_SolveCSP_binding[0];

			Object[] result_pattern_LocationLink_0_2_SolveCSP_black = pattern_LocationLink_0_2_SolveCSP_blackB(csp);
			if (result_pattern_LocationLink_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, pair, location, asset };
			}
		}
		return null;
	}

	public static final boolean pattern_LocationLink_0_3_CheckCSP_expressionFBB(LocationLink _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LocationLink_0_4_collectelementstobetranslated_blackBBBB(Match match,
			MeterAssetMMXUPair pair, Location location, MeterAsset asset) {
		return new Object[] { match, pair, location, asset };
	}

	public static final Object[] pattern_LocationLink_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			Location location, MeterAsset asset) {
		EMoflonEdge asset__location____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge location__asset____Assets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String asset__location____Location_name_prime = "Location";
		String location__asset____Assets_name_prime = "Assets";
		asset__location____Location.setSrc(asset);
		asset__location____Location.setTrg(location);
		match.getToBeTranslatedEdges().add(asset__location____Location);
		location__asset____Assets.setSrc(location);
		location__asset____Assets.setTrg(asset);
		match.getToBeTranslatedEdges().add(location__asset____Assets);
		asset__location____Location.setName(asset__location____Location_name_prime);
		location__asset____Assets.setName(location__asset____Assets_name_prime);
		return new Object[] { match, location, asset, asset__location____Location, location__asset____Assets };
	}

	public static final Object[] pattern_LocationLink_0_5_collectcontextelements_blackBBBB(Match match,
			MeterAssetMMXUPair pair, Location location, MeterAsset asset) {
		return new Object[] { match, pair, location, asset };
	}

	public static final Object[] pattern_LocationLink_0_5_collectcontextelements_greenBBBBF(Match match,
			MeterAssetMMXUPair pair, Location location, MeterAsset asset) {
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(pair);
		match.getContextNodes().add(location);
		match.getContextNodes().add(asset);
		String pair__asset____a_name_prime = "a";
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		match.getContextEdges().add(pair__asset____a);
		pair__asset____a.setName(pair__asset____a_name_prime);
		return new Object[] { match, pair, location, asset, pair__asset____a };
	}

	public static final void pattern_LocationLink_0_6_registerobjectstomatch_expressionBBBBB(LocationLink _this,
			Match match, MeterAssetMMXUPair pair, Location location, MeterAsset asset) {
		_this.registerObjectsToMatch_FWD(match, pair, location, asset);

	}

	public static final boolean pattern_LocationLink_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LocationLink_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_LocationLink_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("pair");
		EObject _localVariable_1 = isApplicableMatch.getObject("trgLocation");
		EObject _localVariable_2 = isApplicableMatch.getObject("location");
		EObject _localVariable_3 = isApplicableMatch.getObject("assetToPMU");
		EObject _localVariable_4 = isApplicableMatch.getObject("locationCorr");
		EObject _localVariable_5 = isApplicableMatch.getObject("asset");
		EObject _localVariable_6 = isApplicableMatch.getObject("consumer");
		EObject tmpPair = _localVariable_0;
		EObject tmpTrgLocation = _localVariable_1;
		EObject tmpLocation = _localVariable_2;
		EObject tmpAssetToPMU = _localVariable_3;
		EObject tmpLocationCorr = _localVariable_4;
		EObject tmpAsset = _localVariable_5;
		EObject tmpConsumer = _localVariable_6;
		if (tmpPair instanceof MeterAssetMMXUPair) {
			MeterAssetMMXUPair pair = (MeterAssetMMXUPair) tmpPair;
			if (tmpTrgLocation instanceof outagePreventionJointarget.Location) {
				outagePreventionJointarget.Location trgLocation = (outagePreventionJointarget.Location) tmpTrgLocation;
				if (tmpLocation instanceof Location) {
					Location location = (Location) tmpLocation;
					if (tmpAssetToPMU instanceof MeterAssetToPMUVoltageMeter) {
						MeterAssetToPMUVoltageMeter assetToPMU = (MeterAssetToPMUVoltageMeter) tmpAssetToPMU;
						if (tmpLocationCorr instanceof LocationToLocation) {
							LocationToLocation locationCorr = (LocationToLocation) tmpLocationCorr;
							if (tmpAsset instanceof MeterAsset) {
								MeterAsset asset = (MeterAsset) tmpAsset;
								if (tmpConsumer instanceof PMUVoltageMeter) {
									PMUVoltageMeter consumer = (PMUVoltageMeter) tmpConsumer;
									return new Object[] { pair, trgLocation, location, assetToPMU, locationCorr, asset,
											consumer, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_LocationLink_1_1_performtransformation_blackBBBBBBBFBB(MeterAssetMMXUPair pair,
			outagePreventionJointarget.Location trgLocation, Location location, MeterAssetToPMUVoltageMeter assetToPMU,
			LocationToLocation locationCorr, MeterAsset asset, PMUVoltageMeter consumer, LocationLink _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { pair, trgLocation, location, assetToPMU, locationCorr, asset, consumer, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LocationLink_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			LocationLink _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_LocationLink_1_1_performtransformation_binding = pattern_LocationLink_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_LocationLink_1_1_performtransformation_binding != null) {
			MeterAssetMMXUPair pair = (MeterAssetMMXUPair) result_pattern_LocationLink_1_1_performtransformation_binding[0];
			outagePreventionJointarget.Location trgLocation = (outagePreventionJointarget.Location) result_pattern_LocationLink_1_1_performtransformation_binding[1];
			Location location = (Location) result_pattern_LocationLink_1_1_performtransformation_binding[2];
			MeterAssetToPMUVoltageMeter assetToPMU = (MeterAssetToPMUVoltageMeter) result_pattern_LocationLink_1_1_performtransformation_binding[3];
			LocationToLocation locationCorr = (LocationToLocation) result_pattern_LocationLink_1_1_performtransformation_binding[4];
			MeterAsset asset = (MeterAsset) result_pattern_LocationLink_1_1_performtransformation_binding[5];
			PMUVoltageMeter consumer = (PMUVoltageMeter) result_pattern_LocationLink_1_1_performtransformation_binding[6];

			Object[] result_pattern_LocationLink_1_1_performtransformation_black = pattern_LocationLink_1_1_performtransformation_blackBBBBBBBFBB(
					pair, trgLocation, location, assetToPMU, locationCorr, asset, consumer, _this, isApplicableMatch);
			if (result_pattern_LocationLink_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_LocationLink_1_1_performtransformation_black[7];

				return new Object[] { pair, trgLocation, location, assetToPMU, locationCorr, asset, consumer, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LocationLink_1_1_performtransformation_greenBB(
			outagePreventionJointarget.Location trgLocation, PMUVoltageMeter consumer) {
		consumer.setLocation(trgLocation);
		return new Object[] { trgLocation, consumer };
	}

	public static final Object[] pattern_LocationLink_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_LocationLink_1_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject pair, EObject trgLocation, EObject location, EObject assetToPMU,
			EObject locationCorr, EObject asset, EObject consumer) {
		if (!pair.equals(trgLocation)) {
			if (!location.equals(pair)) {
				if (!location.equals(trgLocation)) {
					if (!location.equals(locationCorr)) {
						if (!assetToPMU.equals(pair)) {
							if (!assetToPMU.equals(trgLocation)) {
								if (!assetToPMU.equals(location)) {
									if (!assetToPMU.equals(locationCorr)) {
										if (!assetToPMU.equals(consumer)) {
											if (!locationCorr.equals(pair)) {
												if (!locationCorr.equals(trgLocation)) {
													if (!asset.equals(pair)) {
														if (!asset.equals(trgLocation)) {
															if (!asset.equals(location)) {
																if (!asset.equals(assetToPMU)) {
																	if (!asset.equals(locationCorr)) {
																		if (!asset.equals(consumer)) {
																			if (!consumer.equals(pair)) {
																				if (!consumer.equals(trgLocation)) {
																					if (!consumer.equals(location)) {
																						if (!consumer
																								.equals(locationCorr)) {
																							return new Object[] {
																									ruleresult, pair,
																									trgLocation,
																									location,
																									assetToPMU,
																									locationCorr, asset,
																									consumer };
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

	public static final Object[] pattern_LocationLink_1_3_bookkeepingforedges_greenBBBBBFFF(
			PerformRuleResult ruleresult, EObject trgLocation, EObject location, EObject asset, EObject consumer) {
		EMoflonEdge asset__location____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge location__asset____Assets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge consumer__trgLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "LocationLink";
		String asset__location____Location_name_prime = "Location";
		String location__asset____Assets_name_prime = "Assets";
		String consumer__trgLocation____Location_name_prime = "Location";
		asset__location____Location.setSrc(asset);
		asset__location____Location.setTrg(location);
		ruleresult.getTranslatedEdges().add(asset__location____Location);
		location__asset____Assets.setSrc(location);
		location__asset____Assets.setTrg(asset);
		ruleresult.getTranslatedEdges().add(location__asset____Assets);
		consumer__trgLocation____Location.setSrc(consumer);
		consumer__trgLocation____Location.setTrg(trgLocation);
		ruleresult.getCreatedEdges().add(consumer__trgLocation____Location);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		asset__location____Location.setName(asset__location____Location_name_prime);
		location__asset____Assets.setName(location__asset____Assets_name_prime);
		consumer__trgLocation____Location.setName(consumer__trgLocation____Location_name_prime);
		return new Object[] { ruleresult, trgLocation, location, asset, consumer, asset__location____Location,
				location__asset____Assets, consumer__trgLocation____Location };
	}

	public static final void pattern_LocationLink_1_5_registerobjects_expressionBBBBBBBBB(LocationLink _this,
			PerformRuleResult ruleresult, EObject pair, EObject trgLocation, EObject location, EObject assetToPMU,
			EObject locationCorr, EObject asset, EObject consumer) {
		_this.registerObjects_FWD(ruleresult, pair, trgLocation, location, assetToPMU, locationCorr, asset, consumer);

	}

	public static final PerformRuleResult pattern_LocationLink_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LocationLink_2_1_preparereturnvalue_bindingFB(LocationLink _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LocationLink_2_1_preparereturnvalue_blackFBB(EClass eClass,
			LocationLink _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LocationLink_2_1_preparereturnvalue_bindingAndBlackFFB(LocationLink _this) {
		Object[] result_pattern_LocationLink_2_1_preparereturnvalue_binding = pattern_LocationLink_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_LocationLink_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_LocationLink_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_LocationLink_2_1_preparereturnvalue_black = pattern_LocationLink_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_LocationLink_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_LocationLink_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LocationLink_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "LocationLink";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_LocationLink_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("pair");
		EObject _localVariable_1 = match.getObject("location");
		EObject _localVariable_2 = match.getObject("asset");
		EObject tmpPair = _localVariable_0;
		EObject tmpLocation = _localVariable_1;
		EObject tmpAsset = _localVariable_2;
		if (tmpPair instanceof MeterAssetMMXUPair) {
			MeterAssetMMXUPair pair = (MeterAssetMMXUPair) tmpPair;
			if (tmpLocation instanceof Location) {
				Location location = (Location) tmpLocation;
				if (tmpAsset instanceof MeterAsset) {
					MeterAsset asset = (MeterAsset) tmpAsset;
					return new Object[] { pair, location, asset, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LocationLink_2_2_corematch_blackBFBFFBFB(MeterAssetMMXUPair pair,
			Location location, MeterAsset asset, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MeterAssetToPMUVoltageMeter assetToPMU : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(asset, MeterAssetToPMUVoltageMeter.class, "source")) {
			PMUVoltageMeter consumer = assetToPMU.getTarget();
			if (consumer != null) {
				for (LocationToLocation locationCorr : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(location, LocationToLocation.class, "source")) {
					outagePreventionJointarget.Location trgLocation = locationCorr.getTarget();
					if (trgLocation != null) {
						_result.add(new Object[] { pair, trgLocation, location, assetToPMU, locationCorr, asset,
								consumer, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_LocationLink_2_3_findcontext_blackBBBBBBB(MeterAssetMMXUPair pair,
			outagePreventionJointarget.Location trgLocation, Location location, MeterAssetToPMUVoltageMeter assetToPMU,
			LocationToLocation locationCorr, MeterAsset asset, PMUVoltageMeter consumer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (asset.equals(pair.getA())) {
			if (trgLocation.equals(locationCorr.getTarget())) {
				if (asset.equals(assetToPMU.getSource())) {
					if (location.equals(asset.getLocation())) {
						if (location.equals(locationCorr.getSource())) {
							if (consumer.equals(assetToPMU.getTarget())) {
								_result.add(new Object[] { pair, trgLocation, location, assetToPMU, locationCorr, asset,
										consumer });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_LocationLink_2_3_findcontext_greenBBBBBBBFFFFFFFF(MeterAssetMMXUPair pair,
			outagePreventionJointarget.Location trgLocation, Location location, MeterAssetToPMUVoltageMeter assetToPMU,
			LocationToLocation locationCorr, MeterAsset asset, PMUVoltageMeter consumer) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge locationCorr__trgLocation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge assetToPMU__asset____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge asset__location____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge location__asset____Assets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge locationCorr__location____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge assetToPMU__consumer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String pair__asset____a_name_prime = "a";
		String locationCorr__trgLocation____target_name_prime = "target";
		String assetToPMU__asset____source_name_prime = "source";
		String asset__location____Location_name_prime = "Location";
		String location__asset____Assets_name_prime = "Assets";
		String locationCorr__location____source_name_prime = "source";
		String assetToPMU__consumer____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(pair);
		isApplicableMatch.getAllContextElements().add(trgLocation);
		isApplicableMatch.getAllContextElements().add(location);
		isApplicableMatch.getAllContextElements().add(assetToPMU);
		isApplicableMatch.getAllContextElements().add(locationCorr);
		isApplicableMatch.getAllContextElements().add(asset);
		isApplicableMatch.getAllContextElements().add(consumer);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(pair__asset____a);
		locationCorr__trgLocation____target.setSrc(locationCorr);
		locationCorr__trgLocation____target.setTrg(trgLocation);
		isApplicableMatch.getAllContextElements().add(locationCorr__trgLocation____target);
		assetToPMU__asset____source.setSrc(assetToPMU);
		assetToPMU__asset____source.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(assetToPMU__asset____source);
		asset__location____Location.setSrc(asset);
		asset__location____Location.setTrg(location);
		isApplicableMatch.getAllContextElements().add(asset__location____Location);
		location__asset____Assets.setSrc(location);
		location__asset____Assets.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(location__asset____Assets);
		locationCorr__location____source.setSrc(locationCorr);
		locationCorr__location____source.setTrg(location);
		isApplicableMatch.getAllContextElements().add(locationCorr__location____source);
		assetToPMU__consumer____target.setSrc(assetToPMU);
		assetToPMU__consumer____target.setTrg(consumer);
		isApplicableMatch.getAllContextElements().add(assetToPMU__consumer____target);
		pair__asset____a.setName(pair__asset____a_name_prime);
		locationCorr__trgLocation____target.setName(locationCorr__trgLocation____target_name_prime);
		assetToPMU__asset____source.setName(assetToPMU__asset____source_name_prime);
		asset__location____Location.setName(asset__location____Location_name_prime);
		location__asset____Assets.setName(location__asset____Assets_name_prime);
		locationCorr__location____source.setName(locationCorr__location____source_name_prime);
		assetToPMU__consumer____target.setName(assetToPMU__consumer____target_name_prime);
		return new Object[] { pair, trgLocation, location, assetToPMU, locationCorr, asset, consumer, isApplicableMatch,
				pair__asset____a, locationCorr__trgLocation____target, assetToPMU__asset____source,
				asset__location____Location, location__asset____Assets, locationCorr__location____source,
				assetToPMU__consumer____target };
	}

	public static final Object[] pattern_LocationLink_2_4_solveCSP_bindingFBBBBBBBBB(LocationLink _this,
			IsApplicableMatch isApplicableMatch, MeterAssetMMXUPair pair,
			outagePreventionJointarget.Location trgLocation, Location location, MeterAssetToPMUVoltageMeter assetToPMU,
			LocationToLocation locationCorr, MeterAsset asset, PMUVoltageMeter consumer) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, pair, trgLocation, location,
				assetToPMU, locationCorr, asset, consumer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, pair, trgLocation, location, assetToPMU, locationCorr,
					asset, consumer };
		}
		return null;
	}

	public static final Object[] pattern_LocationLink_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LocationLink_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(LocationLink _this,
			IsApplicableMatch isApplicableMatch, MeterAssetMMXUPair pair,
			outagePreventionJointarget.Location trgLocation, Location location, MeterAssetToPMUVoltageMeter assetToPMU,
			LocationToLocation locationCorr, MeterAsset asset, PMUVoltageMeter consumer) {
		Object[] result_pattern_LocationLink_2_4_solveCSP_binding = pattern_LocationLink_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, pair, trgLocation, location, assetToPMU, locationCorr, asset, consumer);
		if (result_pattern_LocationLink_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LocationLink_2_4_solveCSP_binding[0];

			Object[] result_pattern_LocationLink_2_4_solveCSP_black = pattern_LocationLink_2_4_solveCSP_blackB(csp);
			if (result_pattern_LocationLink_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, pair, trgLocation, location, assetToPMU,
						locationCorr, asset, consumer };
			}
		}
		return null;
	}

	public static final boolean pattern_LocationLink_2_5_checkCSP_expressionFBB(LocationLink _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LocationLink_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_LocationLink_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "LocationLink";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_LocationLink_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LocationLink_10_1_preparereturnvalue_bindingFB(LocationLink _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LocationLink_10_1_preparereturnvalue_blackFBBF(EClass __eClass,
			LocationLink _this) {
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

	public static final Object[] pattern_LocationLink_10_1_preparereturnvalue_bindingAndBlackFFBF(LocationLink _this) {
		Object[] result_pattern_LocationLink_10_1_preparereturnvalue_binding = pattern_LocationLink_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_LocationLink_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_LocationLink_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_LocationLink_10_1_preparereturnvalue_black = pattern_LocationLink_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_LocationLink_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_LocationLink_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_LocationLink_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_LocationLink_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_LocationLink_10_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_Location) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpAsset = _edge_Location.getSrc();
		if (tmpAsset instanceof MeterAsset) {
			MeterAsset asset = (MeterAsset) tmpAsset;
			EObject tmpLocation = _edge_Location.getTrg();
			if (tmpLocation instanceof Location) {
				Location location = (Location) tmpLocation;
				if (location.equals(asset.getLocation())) {
					for (MeterAssetMMXUPair pair : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(asset, MeterAssetMMXUPair.class, "a")) {
						_result.add(new Object[] { pair, location, asset, _edge_Location });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_LocationLink_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_LocationLink_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			LocationLink _this, Match match, MeterAssetMMXUPair pair, Location location, MeterAsset asset) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, pair, location, asset);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_LocationLink_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			LocationLink _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LocationLink_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_LocationLink_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_LocationLink_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_LocationLink_13_1_matchtggpattern_blackBBB(MeterAssetMMXUPair pair,
			Location location, MeterAsset asset) {
		if (asset.equals(pair.getA())) {
			if (location.equals(asset.getLocation())) {
				return new Object[] { pair, location, asset };
			}
		}
		return null;
	}

	public static final boolean pattern_LocationLink_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LocationLink_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //LocationLinkImpl
