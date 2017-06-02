/**
 */
package rgse.ttc17.emoflon.tgg.task1.Rules.impl;

import gluemodel.CIM.IEC61968.Assets.Asset;

import gluemodel.CIM.IEC61968.Common.Location;
import gluemodel.CIM.IEC61968.Common.PositionPoint;

import gluemodel.CIM.IEC61968.Metering.MeterAsset;

import gluemodel.MeterAssetPhysicalDevicePair;

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

import rgse.ttc17.emoflon.tgg.task1.LocationToLocation;
import rgse.ttc17.emoflon.tgg.task1.PositionPointToPositionPoint;

import rgse.ttc17.emoflon.tgg.task1.Rules.PositionPointLink;
import rgse.ttc17.emoflon.tgg.task1.Rules.RulesPackage;
// <-- [user defined imports]
import org.moflon.tgg.csp.*;
import rgse.ttc17.emoflon.tgg.task1.csp.constraints.*;
import org.moflon.tgg.csp.constraints.*;
import org.moflon.tgg.language.csp.*;
import org.moflon.tgg.runtime.TripleMatchNodeMapping;
import java.util.Optional;
import org.moflon.tgg.algorithm.delta.attribute.CheckAttributeHelper;
import SDMLanguage.expressions.ComparingOperator;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position Point Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PositionPointLinkImpl extends AbstractRuleImpl implements PositionPointLink {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionPointLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getPositionPointLink();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MeterAsset asset, Location srcLocation, PositionPoint positionPoint,
			MeterAssetPhysicalDevicePair pair) {
		// initial bindings
		Object[] result1_black = PositionPointLinkImpl.pattern_PositionPointLink_0_1_initialbindings_blackBBBBBB(this,
				match, asset, srcLocation, positionPoint, pair);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[asset] = " + asset + ", "
					+ "[srcLocation] = " + srcLocation + ", " + "[positionPoint] = " + positionPoint + ", "
					+ "[pair] = " + pair + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = PositionPointLinkImpl
				.pattern_PositionPointLink_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, asset, srcLocation,
						positionPoint, pair);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[asset] = " + asset + ", " + "[srcLocation] = "
					+ srcLocation + ", " + "[positionPoint] = " + positionPoint + ", " + "[pair] = " + pair + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (PositionPointLinkImpl.pattern_PositionPointLink_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = PositionPointLinkImpl
					.pattern_PositionPointLink_0_4_collectelementstobetranslated_blackBBBBB(match, asset, srcLocation,
							positionPoint, pair);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[asset] = " + asset + ", "
						+ "[srcLocation] = " + srcLocation + ", " + "[positionPoint] = " + positionPoint + ", "
						+ "[pair] = " + pair + ".");
			}
			PositionPointLinkImpl.pattern_PositionPointLink_0_4_collectelementstobetranslated_greenBBBF(match,
					srcLocation, positionPoint);
			// EMoflonEdge srcLocation__positionPoint____Position = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = PositionPointLinkImpl
					.pattern_PositionPointLink_0_5_collectcontextelements_blackBBBBB(match, asset, srcLocation,
							positionPoint, pair);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[asset] = " + asset + ", " + "[srcLocation] = " + srcLocation + ", "
								+ "[positionPoint] = " + positionPoint + ", " + "[pair] = " + pair + ".");
			}
			PositionPointLinkImpl.pattern_PositionPointLink_0_5_collectcontextelements_greenBBBBBFFF(match, asset,
					srcLocation, positionPoint, pair);
			// EMoflonEdge asset__srcLocation____Location = (EMoflonEdge) result5_green[5];
			// EMoflonEdge srcLocation__asset____Assets = (EMoflonEdge) result5_green[6];
			// EMoflonEdge pair__asset____a = (EMoflonEdge) result5_green[7];

			// register objects to match
			PositionPointLinkImpl.pattern_PositionPointLink_0_6_registerobjectstomatch_expressionBBBBBB(this, match,
					asset, srcLocation, positionPoint, pair);
			return PositionPointLinkImpl.pattern_PositionPointLink_0_7_expressionF();
		} else {
			return PositionPointLinkImpl.pattern_PositionPointLink_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = PositionPointLinkImpl
				.pattern_PositionPointLink_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		LocationToLocation locationToLocation = (LocationToLocation) result1_bindingAndBlack[0];
		outageDetectionJointarget.Location trgLocation = (outageDetectionJointarget.Location) result1_bindingAndBlack[1];
		MeterAsset asset = (MeterAsset) result1_bindingAndBlack[2];
		outageDetectionJointarget.PositionPoint trgPositionPoint = (outageDetectionJointarget.PositionPoint) result1_bindingAndBlack[3];
		PositionPointToPositionPoint positionCorr = (PositionPointToPositionPoint) result1_bindingAndBlack[4];
		Location srcLocation = (Location) result1_bindingAndBlack[5];
		PositionPoint positionPoint = (PositionPoint) result1_bindingAndBlack[6];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result1_bindingAndBlack[7];
		// CSP csp = (CSP) result1_bindingAndBlack[8];
		PositionPointLinkImpl.pattern_PositionPointLink_1_1_performtransformation_greenBB(trgLocation,
				trgPositionPoint);

		// collect translated elements
		Object[] result2_green = PositionPointLinkImpl.pattern_PositionPointLink_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = PositionPointLinkImpl.pattern_PositionPointLink_1_3_bookkeepingforedges_blackBBBBBBBBB(
				ruleresult, locationToLocation, trgLocation, asset, trgPositionPoint, positionCorr, srcLocation,
				positionPoint, pair);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[locationToLocation] = " + locationToLocation + ", "
					+ "[trgLocation] = " + trgLocation + ", " + "[asset] = " + asset + ", " + "[trgPositionPoint] = "
					+ trgPositionPoint + ", " + "[positionCorr] = " + positionCorr + ", " + "[srcLocation] = "
					+ srcLocation + ", " + "[positionPoint] = " + positionPoint + ", " + "[pair] = " + pair + ".");
		}
		PositionPointLinkImpl.pattern_PositionPointLink_1_3_bookkeepingforedges_greenBBBBBFF(ruleresult, trgLocation,
				trgPositionPoint, srcLocation, positionPoint);
		// EMoflonEdge srcLocation__positionPoint____Position = (EMoflonEdge) result3_green[5];
		// EMoflonEdge trgLocation__trgPositionPoint____Position = (EMoflonEdge) result3_green[6];

		// perform postprocessing story node is empty
		// register objects
		PositionPointLinkImpl.pattern_PositionPointLink_1_5_registerobjects_expressionBBBBBBBBBB(this, ruleresult,
				locationToLocation, trgLocation, asset, trgPositionPoint, positionCorr, srcLocation, positionPoint,
				pair);
		return PositionPointLinkImpl.pattern_PositionPointLink_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = PositionPointLinkImpl
				.pattern_PositionPointLink_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PositionPointLinkImpl
				.pattern_PositionPointLink_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = PositionPointLinkImpl.pattern_PositionPointLink_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MeterAsset asset = (MeterAsset) result2_binding[0];
		Location srcLocation = (Location) result2_binding[1];
		PositionPoint positionPoint = (PositionPoint) result2_binding[2];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_binding[3];
		for (Object[] result2_black : PositionPointLinkImpl.pattern_PositionPointLink_2_2_corematch_blackFFBFFBBBB(
				asset, srcLocation, positionPoint, pair, match)) {
			LocationToLocation locationToLocation = (LocationToLocation) result2_black[0];
			outageDetectionJointarget.Location trgLocation = (outageDetectionJointarget.Location) result2_black[1];
			outageDetectionJointarget.PositionPoint trgPositionPoint = (outageDetectionJointarget.PositionPoint) result2_black[3];
			PositionPointToPositionPoint positionCorr = (PositionPointToPositionPoint) result2_black[4];
			// ForEach find context
			for (Object[] result3_black : PositionPointLinkImpl.pattern_PositionPointLink_2_3_findcontext_blackBBBBBBBB(
					locationToLocation, trgLocation, asset, trgPositionPoint, positionCorr, srcLocation, positionPoint,
					pair)) {
				Object[] result3_green = PositionPointLinkImpl
						.pattern_PositionPointLink_2_3_findcontext_greenBBBBBBBBFFFFFFFFF(locationToLocation,
								trgLocation, asset, trgPositionPoint, positionCorr, srcLocation, positionPoint, pair);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				// EMoflonEdge locationToLocation__trgLocation____target = (EMoflonEdge) result3_green[9];
				// EMoflonEdge asset__srcLocation____Location = (EMoflonEdge) result3_green[10];
				// EMoflonEdge srcLocation__asset____Assets = (EMoflonEdge) result3_green[11];
				// EMoflonEdge positionCorr__positionPoint____source = (EMoflonEdge) result3_green[12];
				// EMoflonEdge srcLocation__positionPoint____Position = (EMoflonEdge) result3_green[13];
				// EMoflonEdge positionCorr__trgPositionPoint____target = (EMoflonEdge) result3_green[14];
				// EMoflonEdge locationToLocation__srcLocation____source = (EMoflonEdge) result3_green[15];
				// EMoflonEdge pair__asset____a = (EMoflonEdge) result3_green[16];

				// solve CSP
				Object[] result4_bindingAndBlack = PositionPointLinkImpl
						.pattern_PositionPointLink_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
								locationToLocation, trgLocation, asset, trgPositionPoint, positionCorr, srcLocation,
								positionPoint, pair);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[locationToLocation] = " + locationToLocation + ", " + "[trgLocation] = " + trgLocation
							+ ", " + "[asset] = " + asset + ", " + "[trgPositionPoint] = " + trgPositionPoint + ", "
							+ "[positionCorr] = " + positionCorr + ", " + "[srcLocation] = " + srcLocation + ", "
							+ "[positionPoint] = " + positionPoint + ", " + "[pair] = " + pair + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (PositionPointLinkImpl.pattern_PositionPointLink_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = PositionPointLinkImpl
							.pattern_PositionPointLink_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					PositionPointLinkImpl.pattern_PositionPointLink_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return PositionPointLinkImpl.pattern_PositionPointLink_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MeterAsset asset, Location srcLocation,
			PositionPoint positionPoint, MeterAssetPhysicalDevicePair pair) {
		match.registerObject("asset", asset);
		match.registerObject("srcLocation", srcLocation);
		match.registerObject("positionPoint", positionPoint);
		match.registerObject("pair", pair);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MeterAsset asset, Location srcLocation,
			PositionPoint positionPoint, MeterAssetPhysicalDevicePair pair) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, LocationToLocation locationToLocation,
			outageDetectionJointarget.Location trgLocation, MeterAsset asset,
			outageDetectionJointarget.PositionPoint trgPositionPoint, PositionPointToPositionPoint positionCorr,
			Location srcLocation, PositionPoint positionPoint, MeterAssetPhysicalDevicePair pair) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("locationToLocation", locationToLocation);
		isApplicableMatch.registerObject("trgLocation", trgLocation);
		isApplicableMatch.registerObject("asset", asset);
		isApplicableMatch.registerObject("trgPositionPoint", trgPositionPoint);
		isApplicableMatch.registerObject("positionCorr", positionCorr);
		isApplicableMatch.registerObject("srcLocation", srcLocation);
		isApplicableMatch.registerObject("positionPoint", positionPoint);
		isApplicableMatch.registerObject("pair", pair);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject locationToLocation, EObject trgLocation,
			EObject asset, EObject trgPositionPoint, EObject positionCorr, EObject srcLocation, EObject positionPoint,
			EObject pair) {
		ruleresult.registerObject("locationToLocation", locationToLocation);
		ruleresult.registerObject("trgLocation", trgLocation);
		ruleresult.registerObject("asset", asset);
		ruleresult.registerObject("trgPositionPoint", trgPositionPoint);
		ruleresult.registerObject("positionCorr", positionCorr);
		ruleresult.registerObject("srcLocation", srcLocation);
		ruleresult.registerObject("positionPoint", positionPoint);
		ruleresult.registerObject("pair", pair);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_52(EMoflonEdge _edge_Position) {
		// prepare return value
		Object[] result1_bindingAndBlack = PositionPointLinkImpl
				.pattern_PositionPointLink_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = PositionPointLinkImpl.pattern_PositionPointLink_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PositionPointLinkImpl
				.pattern_PositionPointLink_10_2_testcorematchandDECs_blackFFFFB(_edge_Position)) {
			MeterAsset asset = (MeterAsset) result2_black[0];
			Location srcLocation = (Location) result2_black[1];
			PositionPoint positionPoint = (PositionPoint) result2_black[2];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_black[3];
			Object[] result2_green = PositionPointLinkImpl
					.pattern_PositionPointLink_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PositionPointLinkImpl
					.pattern_PositionPointLink_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, asset, srcLocation, positionPoint, pair)) {
				// Ensure that the correct types of elements are matched
				if (PositionPointLinkImpl
						.pattern_PositionPointLink_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = PositionPointLinkImpl
							.pattern_PositionPointLink_10_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					PositionPointLinkImpl.pattern_PositionPointLink_10_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return PositionPointLinkImpl.pattern_PositionPointLink_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("PositionPointLink");
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
	public boolean checkDEC_FWD(MeterAsset asset, Location srcLocation, PositionPoint positionPoint,
			MeterAssetPhysicalDevicePair pair) {// match tgg pattern
		Object[] result1_black = PositionPointLinkImpl.pattern_PositionPointLink_13_1_matchtggpattern_blackBBBB(asset,
				srcLocation, positionPoint, pair);
		if (result1_black != null) {
			return PositionPointLinkImpl.pattern_PositionPointLink_13_2_expressionF();
		} else {
			return PositionPointLinkImpl.pattern_PositionPointLink_13_3_expressionF();
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
		case RulesPackage.POSITION_POINT_LINK___IS_APPROPRIATE_FWD__MATCH_METERASSET_LOCATION_POSITIONPOINT_METERASSETPHYSICALDEVICEPAIR:
			return isAppropriate_FWD((Match) arguments.get(0), (MeterAsset) arguments.get(1),
					(Location) arguments.get(2), (PositionPoint) arguments.get(3),
					(MeterAssetPhysicalDevicePair) arguments.get(4));
		case RulesPackage.POSITION_POINT_LINK___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.POSITION_POINT_LINK___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.POSITION_POINT_LINK___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_METERASSET_LOCATION_POSITIONPOINT_METERASSETPHYSICALDEVICEPAIR:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MeterAsset) arguments.get(1),
					(Location) arguments.get(2), (PositionPoint) arguments.get(3),
					(MeterAssetPhysicalDevicePair) arguments.get(4));
			return null;
		case RulesPackage.POSITION_POINT_LINK___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_METERASSET_LOCATION_POSITIONPOINT_METERASSETPHYSICALDEVICEPAIR:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MeterAsset) arguments.get(1),
					(Location) arguments.get(2), (PositionPoint) arguments.get(3),
					(MeterAssetPhysicalDevicePair) arguments.get(4));
		case RulesPackage.POSITION_POINT_LINK___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.POSITION_POINT_LINK___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_LOCATIONTOLOCATION_LOCATION_METERASSET_POSITIONPOINT_POSITIONPOINTTOPOSITIONPOINT_LOCATION_POSITIONPOINT_METERASSETPHYSICALDEVICEPAIR:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(LocationToLocation) arguments.get(1), (outageDetectionJointarget.Location) arguments.get(2),
					(MeterAsset) arguments.get(3), (outageDetectionJointarget.PositionPoint) arguments.get(4),
					(PositionPointToPositionPoint) arguments.get(5), (Location) arguments.get(6),
					(PositionPoint) arguments.get(7), (MeterAssetPhysicalDevicePair) arguments.get(8));
		case RulesPackage.POSITION_POINT_LINK___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.POSITION_POINT_LINK___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.POSITION_POINT_LINK___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.POSITION_POINT_LINK___IS_APPROPRIATE_FWD_EMOFLON_EDGE_52__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_52((EMoflonEdge) arguments.get(0));
		case RulesPackage.POSITION_POINT_LINK___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.POSITION_POINT_LINK___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.POSITION_POINT_LINK___CHECK_DEC_FWD__METERASSET_LOCATION_POSITIONPOINT_METERASSETPHYSICALDEVICEPAIR:
			return checkDEC_FWD((MeterAsset) arguments.get(0), (Location) arguments.get(1),
					(PositionPoint) arguments.get(2), (MeterAssetPhysicalDevicePair) arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_PositionPointLink_0_1_initialbindings_blackBBBBBB(PositionPointLink _this,
			Match match, MeterAsset asset, Location srcLocation, PositionPoint positionPoint,
			MeterAssetPhysicalDevicePair pair) {
		return new Object[] { _this, match, asset, srcLocation, positionPoint, pair };
	}

	public static final Object[] pattern_PositionPointLink_0_2_SolveCSP_bindingFBBBBBB(PositionPointLink _this,
			Match match, MeterAsset asset, Location srcLocation, PositionPoint positionPoint,
			MeterAssetPhysicalDevicePair pair) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, asset, srcLocation, positionPoint, pair);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, asset, srcLocation, positionPoint, pair };
		}
		return null;
	}

	public static final Object[] pattern_PositionPointLink_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PositionPointLink_0_2_SolveCSP_bindingAndBlackFBBBBBB(PositionPointLink _this,
			Match match, MeterAsset asset, Location srcLocation, PositionPoint positionPoint,
			MeterAssetPhysicalDevicePair pair) {
		Object[] result_pattern_PositionPointLink_0_2_SolveCSP_binding = pattern_PositionPointLink_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, asset, srcLocation, positionPoint, pair);
		if (result_pattern_PositionPointLink_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PositionPointLink_0_2_SolveCSP_binding[0];

			Object[] result_pattern_PositionPointLink_0_2_SolveCSP_black = pattern_PositionPointLink_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_PositionPointLink_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, asset, srcLocation, positionPoint, pair };
			}
		}
		return null;
	}

	public static final boolean pattern_PositionPointLink_0_3_CheckCSP_expressionFBB(PositionPointLink _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PositionPointLink_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			MeterAsset asset, Location srcLocation, PositionPoint positionPoint, MeterAssetPhysicalDevicePair pair) {
		return new Object[] { match, asset, srcLocation, positionPoint, pair };
	}

	public static final Object[] pattern_PositionPointLink_0_4_collectelementstobetranslated_greenBBBF(Match match,
			Location srcLocation, PositionPoint positionPoint) {
		EMoflonEdge srcLocation__positionPoint____Position = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String srcLocation__positionPoint____Position_name_prime = "Position";
		srcLocation__positionPoint____Position.setSrc(srcLocation);
		srcLocation__positionPoint____Position.setTrg(positionPoint);
		match.getToBeTranslatedEdges().add(srcLocation__positionPoint____Position);
		srcLocation__positionPoint____Position.setName(srcLocation__positionPoint____Position_name_prime);
		return new Object[] { match, srcLocation, positionPoint, srcLocation__positionPoint____Position };
	}

	public static final Object[] pattern_PositionPointLink_0_5_collectcontextelements_blackBBBBB(Match match,
			MeterAsset asset, Location srcLocation, PositionPoint positionPoint, MeterAssetPhysicalDevicePair pair) {
		return new Object[] { match, asset, srcLocation, positionPoint, pair };
	}

	public static final Object[] pattern_PositionPointLink_0_5_collectcontextelements_greenBBBBBFFF(Match match,
			MeterAsset asset, Location srcLocation, PositionPoint positionPoint, MeterAssetPhysicalDevicePair pair) {
		EMoflonEdge asset__srcLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocation__asset____Assets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(asset);
		match.getContextNodes().add(srcLocation);
		match.getContextNodes().add(positionPoint);
		match.getContextNodes().add(pair);
		String asset__srcLocation____Location_name_prime = "Location";
		String srcLocation__asset____Assets_name_prime = "Assets";
		String pair__asset____a_name_prime = "a";
		asset__srcLocation____Location.setSrc(asset);
		asset__srcLocation____Location.setTrg(srcLocation);
		match.getContextEdges().add(asset__srcLocation____Location);
		srcLocation__asset____Assets.setSrc(srcLocation);
		srcLocation__asset____Assets.setTrg(asset);
		match.getContextEdges().add(srcLocation__asset____Assets);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		match.getContextEdges().add(pair__asset____a);
		asset__srcLocation____Location.setName(asset__srcLocation____Location_name_prime);
		srcLocation__asset____Assets.setName(srcLocation__asset____Assets_name_prime);
		pair__asset____a.setName(pair__asset____a_name_prime);
		return new Object[] { match, asset, srcLocation, positionPoint, pair, asset__srcLocation____Location,
				srcLocation__asset____Assets, pair__asset____a };
	}

	public static final void pattern_PositionPointLink_0_6_registerobjectstomatch_expressionBBBBBB(
			PositionPointLink _this, Match match, MeterAsset asset, Location srcLocation, PositionPoint positionPoint,
			MeterAssetPhysicalDevicePair pair) {
		_this.registerObjectsToMatch_FWD(match, asset, srcLocation, positionPoint, pair);

	}

	public static final boolean pattern_PositionPointLink_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PositionPointLink_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_PositionPointLink_1_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("locationToLocation");
		EObject _localVariable_1 = isApplicableMatch.getObject("trgLocation");
		EObject _localVariable_2 = isApplicableMatch.getObject("asset");
		EObject _localVariable_3 = isApplicableMatch.getObject("trgPositionPoint");
		EObject _localVariable_4 = isApplicableMatch.getObject("positionCorr");
		EObject _localVariable_5 = isApplicableMatch.getObject("srcLocation");
		EObject _localVariable_6 = isApplicableMatch.getObject("positionPoint");
		EObject _localVariable_7 = isApplicableMatch.getObject("pair");
		EObject tmpLocationToLocation = _localVariable_0;
		EObject tmpTrgLocation = _localVariable_1;
		EObject tmpAsset = _localVariable_2;
		EObject tmpTrgPositionPoint = _localVariable_3;
		EObject tmpPositionCorr = _localVariable_4;
		EObject tmpSrcLocation = _localVariable_5;
		EObject tmpPositionPoint = _localVariable_6;
		EObject tmpPair = _localVariable_7;
		if (tmpLocationToLocation instanceof LocationToLocation) {
			LocationToLocation locationToLocation = (LocationToLocation) tmpLocationToLocation;
			if (tmpTrgLocation instanceof outageDetectionJointarget.Location) {
				outageDetectionJointarget.Location trgLocation = (outageDetectionJointarget.Location) tmpTrgLocation;
				if (tmpAsset instanceof MeterAsset) {
					MeterAsset asset = (MeterAsset) tmpAsset;
					if (tmpTrgPositionPoint instanceof outageDetectionJointarget.PositionPoint) {
						outageDetectionJointarget.PositionPoint trgPositionPoint = (outageDetectionJointarget.PositionPoint) tmpTrgPositionPoint;
						if (tmpPositionCorr instanceof PositionPointToPositionPoint) {
							PositionPointToPositionPoint positionCorr = (PositionPointToPositionPoint) tmpPositionCorr;
							if (tmpSrcLocation instanceof Location) {
								Location srcLocation = (Location) tmpSrcLocation;
								if (tmpPositionPoint instanceof PositionPoint) {
									PositionPoint positionPoint = (PositionPoint) tmpPositionPoint;
									if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
										MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
										return new Object[] { locationToLocation, trgLocation, asset, trgPositionPoint,
												positionCorr, srcLocation, positionPoint, pair, isApplicableMatch };
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

	public static final Object[] pattern_PositionPointLink_1_1_performtransformation_blackBBBBBBBBFBB(
			LocationToLocation locationToLocation, outageDetectionJointarget.Location trgLocation, MeterAsset asset,
			outageDetectionJointarget.PositionPoint trgPositionPoint, PositionPointToPositionPoint positionCorr,
			Location srcLocation, PositionPoint positionPoint, MeterAssetPhysicalDevicePair pair,
			PositionPointLink _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { locationToLocation, trgLocation, asset, trgPositionPoint, positionCorr,
						srcLocation, positionPoint, pair, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PositionPointLink_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			PositionPointLink _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_PositionPointLink_1_1_performtransformation_binding = pattern_PositionPointLink_1_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_PositionPointLink_1_1_performtransformation_binding != null) {
			LocationToLocation locationToLocation = (LocationToLocation) result_pattern_PositionPointLink_1_1_performtransformation_binding[0];
			outageDetectionJointarget.Location trgLocation = (outageDetectionJointarget.Location) result_pattern_PositionPointLink_1_1_performtransformation_binding[1];
			MeterAsset asset = (MeterAsset) result_pattern_PositionPointLink_1_1_performtransformation_binding[2];
			outageDetectionJointarget.PositionPoint trgPositionPoint = (outageDetectionJointarget.PositionPoint) result_pattern_PositionPointLink_1_1_performtransformation_binding[3];
			PositionPointToPositionPoint positionCorr = (PositionPointToPositionPoint) result_pattern_PositionPointLink_1_1_performtransformation_binding[4];
			Location srcLocation = (Location) result_pattern_PositionPointLink_1_1_performtransformation_binding[5];
			PositionPoint positionPoint = (PositionPoint) result_pattern_PositionPointLink_1_1_performtransformation_binding[6];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result_pattern_PositionPointLink_1_1_performtransformation_binding[7];

			Object[] result_pattern_PositionPointLink_1_1_performtransformation_black = pattern_PositionPointLink_1_1_performtransformation_blackBBBBBBBBFBB(
					locationToLocation, trgLocation, asset, trgPositionPoint, positionCorr, srcLocation, positionPoint,
					pair, _this, isApplicableMatch);
			if (result_pattern_PositionPointLink_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_PositionPointLink_1_1_performtransformation_black[8];

				return new Object[] { locationToLocation, trgLocation, asset, trgPositionPoint, positionCorr,
						srcLocation, positionPoint, pair, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PositionPointLink_1_1_performtransformation_greenBB(
			outageDetectionJointarget.Location trgLocation, outageDetectionJointarget.PositionPoint trgPositionPoint) {
		trgLocation.setPosition(trgPositionPoint);
		return new Object[] { trgLocation, trgPositionPoint };
	}

	public static final Object[] pattern_PositionPointLink_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_PositionPointLink_1_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject locationToLocation, EObject trgLocation, EObject asset,
			EObject trgPositionPoint, EObject positionCorr, EObject srcLocation, EObject positionPoint, EObject pair) {
		if (!locationToLocation.equals(trgLocation)) {
			if (!locationToLocation.equals(trgPositionPoint)) {
				if (!locationToLocation.equals(positionCorr)) {
					if (!locationToLocation.equals(srcLocation)) {
						if (!locationToLocation.equals(positionPoint)) {
							if (!locationToLocation.equals(pair)) {
								if (!trgLocation.equals(trgPositionPoint)) {
									if (!asset.equals(locationToLocation)) {
										if (!asset.equals(trgLocation)) {
											if (!asset.equals(trgPositionPoint)) {
												if (!asset.equals(positionCorr)) {
													if (!asset.equals(srcLocation)) {
														if (!asset.equals(positionPoint)) {
															if (!asset.equals(pair)) {
																if (!positionCorr.equals(trgLocation)) {
																	if (!positionCorr.equals(trgPositionPoint)) {
																		if (!positionCorr.equals(srcLocation)) {
																			if (!positionCorr.equals(positionPoint)) {
																				if (!srcLocation.equals(trgLocation)) {
																					if (!srcLocation
																							.equals(trgPositionPoint)) {
																						if (!positionPoint
																								.equals(trgLocation)) {
																							if (!positionPoint.equals(
																									trgPositionPoint)) {
																								if (!positionPoint
																										.equals(srcLocation)) {
																									if (!pair.equals(
																											trgLocation)) {
																										if (!pair
																												.equals(trgPositionPoint)) {
																											if (!pair
																													.equals(positionCorr)) {
																												if (!pair
																														.equals(srcLocation)) {
																													if (!pair
																															.equals(positionPoint)) {
																														return new Object[] {
																																ruleresult,
																																locationToLocation,
																																trgLocation,
																																asset,
																																trgPositionPoint,
																																positionCorr,
																																srcLocation,
																																positionPoint,
																																pair };
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

	public static final Object[] pattern_PositionPointLink_1_3_bookkeepingforedges_greenBBBBBFF(
			PerformRuleResult ruleresult, EObject trgLocation, EObject trgPositionPoint, EObject srcLocation,
			EObject positionPoint) {
		EMoflonEdge srcLocation__positionPoint____Position = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgLocation__trgPositionPoint____Position = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "PositionPointLink";
		String srcLocation__positionPoint____Position_name_prime = "Position";
		String trgLocation__trgPositionPoint____Position_name_prime = "Position";
		srcLocation__positionPoint____Position.setSrc(srcLocation);
		srcLocation__positionPoint____Position.setTrg(positionPoint);
		ruleresult.getTranslatedEdges().add(srcLocation__positionPoint____Position);
		trgLocation__trgPositionPoint____Position.setSrc(trgLocation);
		trgLocation__trgPositionPoint____Position.setTrg(trgPositionPoint);
		ruleresult.getCreatedEdges().add(trgLocation__trgPositionPoint____Position);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		srcLocation__positionPoint____Position.setName(srcLocation__positionPoint____Position_name_prime);
		trgLocation__trgPositionPoint____Position.setName(trgLocation__trgPositionPoint____Position_name_prime);
		return new Object[] { ruleresult, trgLocation, trgPositionPoint, srcLocation, positionPoint,
				srcLocation__positionPoint____Position, trgLocation__trgPositionPoint____Position };
	}

	public static final void pattern_PositionPointLink_1_5_registerobjects_expressionBBBBBBBBBB(PositionPointLink _this,
			PerformRuleResult ruleresult, EObject locationToLocation, EObject trgLocation, EObject asset,
			EObject trgPositionPoint, EObject positionCorr, EObject srcLocation, EObject positionPoint, EObject pair) {
		_this.registerObjects_FWD(ruleresult, locationToLocation, trgLocation, asset, trgPositionPoint, positionCorr,
				srcLocation, positionPoint, pair);

	}

	public static final PerformRuleResult pattern_PositionPointLink_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PositionPointLink_2_1_preparereturnvalue_bindingFB(PositionPointLink _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PositionPointLink_2_1_preparereturnvalue_blackFBB(EClass eClass,
			PositionPointLink _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PositionPointLink_2_1_preparereturnvalue_bindingAndBlackFFB(
			PositionPointLink _this) {
		Object[] result_pattern_PositionPointLink_2_1_preparereturnvalue_binding = pattern_PositionPointLink_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_PositionPointLink_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_PositionPointLink_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_PositionPointLink_2_1_preparereturnvalue_black = pattern_PositionPointLink_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_PositionPointLink_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_PositionPointLink_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PositionPointLink_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "PositionPointLink";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_PositionPointLink_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("asset");
		EObject _localVariable_1 = match.getObject("srcLocation");
		EObject _localVariable_2 = match.getObject("positionPoint");
		EObject _localVariable_3 = match.getObject("pair");
		EObject tmpAsset = _localVariable_0;
		EObject tmpSrcLocation = _localVariable_1;
		EObject tmpPositionPoint = _localVariable_2;
		EObject tmpPair = _localVariable_3;
		if (tmpAsset instanceof MeterAsset) {
			MeterAsset asset = (MeterAsset) tmpAsset;
			if (tmpSrcLocation instanceof Location) {
				Location srcLocation = (Location) tmpSrcLocation;
				if (tmpPositionPoint instanceof PositionPoint) {
					PositionPoint positionPoint = (PositionPoint) tmpPositionPoint;
					if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
						MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
						return new Object[] { asset, srcLocation, positionPoint, pair, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PositionPointLink_2_2_corematch_blackFFBFFBBBB(MeterAsset asset,
			Location srcLocation, PositionPoint positionPoint, MeterAssetPhysicalDevicePair pair, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (PositionPointToPositionPoint positionCorr : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(positionPoint, PositionPointToPositionPoint.class, "source")) {
			outageDetectionJointarget.PositionPoint trgPositionPoint = positionCorr.getTarget();
			if (trgPositionPoint != null) {
				for (LocationToLocation locationToLocation : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(srcLocation, LocationToLocation.class, "source")) {
					outageDetectionJointarget.Location trgLocation = locationToLocation.getTarget();
					if (trgLocation != null) {
						_result.add(new Object[] { locationToLocation, trgLocation, asset, trgPositionPoint,
								positionCorr, srcLocation, positionPoint, pair, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_PositionPointLink_2_3_findcontext_blackBBBBBBBB(
			LocationToLocation locationToLocation, outageDetectionJointarget.Location trgLocation, MeterAsset asset,
			outageDetectionJointarget.PositionPoint trgPositionPoint, PositionPointToPositionPoint positionCorr,
			Location srcLocation, PositionPoint positionPoint, MeterAssetPhysicalDevicePair pair) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (trgLocation.equals(locationToLocation.getTarget())) {
			if (srcLocation.equals(asset.getLocation())) {
				if (positionPoint.equals(positionCorr.getSource())) {
					if (positionPoint.equals(srcLocation.getPosition())) {
						if (trgPositionPoint.equals(positionCorr.getTarget())) {
							if (srcLocation.equals(locationToLocation.getSource())) {
								if (asset.equals(pair.getA())) {
									_result.add(new Object[] { locationToLocation, trgLocation, asset, trgPositionPoint,
											positionCorr, srcLocation, positionPoint, pair });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_PositionPointLink_2_3_findcontext_greenBBBBBBBBFFFFFFFFF(
			LocationToLocation locationToLocation, outageDetectionJointarget.Location trgLocation, MeterAsset asset,
			outageDetectionJointarget.PositionPoint trgPositionPoint, PositionPointToPositionPoint positionCorr,
			Location srcLocation, PositionPoint positionPoint, MeterAssetPhysicalDevicePair pair) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge locationToLocation__trgLocation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge asset__srcLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocation__asset____Assets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge positionCorr__positionPoint____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocation__positionPoint____Position = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge positionCorr__trgPositionPoint____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge locationToLocation__srcLocation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String locationToLocation__trgLocation____target_name_prime = "target";
		String asset__srcLocation____Location_name_prime = "Location";
		String srcLocation__asset____Assets_name_prime = "Assets";
		String positionCorr__positionPoint____source_name_prime = "source";
		String srcLocation__positionPoint____Position_name_prime = "Position";
		String positionCorr__trgPositionPoint____target_name_prime = "target";
		String locationToLocation__srcLocation____source_name_prime = "source";
		String pair__asset____a_name_prime = "a";
		isApplicableMatch.getAllContextElements().add(locationToLocation);
		isApplicableMatch.getAllContextElements().add(trgLocation);
		isApplicableMatch.getAllContextElements().add(asset);
		isApplicableMatch.getAllContextElements().add(trgPositionPoint);
		isApplicableMatch.getAllContextElements().add(positionCorr);
		isApplicableMatch.getAllContextElements().add(srcLocation);
		isApplicableMatch.getAllContextElements().add(positionPoint);
		isApplicableMatch.getAllContextElements().add(pair);
		locationToLocation__trgLocation____target.setSrc(locationToLocation);
		locationToLocation__trgLocation____target.setTrg(trgLocation);
		isApplicableMatch.getAllContextElements().add(locationToLocation__trgLocation____target);
		asset__srcLocation____Location.setSrc(asset);
		asset__srcLocation____Location.setTrg(srcLocation);
		isApplicableMatch.getAllContextElements().add(asset__srcLocation____Location);
		srcLocation__asset____Assets.setSrc(srcLocation);
		srcLocation__asset____Assets.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(srcLocation__asset____Assets);
		positionCorr__positionPoint____source.setSrc(positionCorr);
		positionCorr__positionPoint____source.setTrg(positionPoint);
		isApplicableMatch.getAllContextElements().add(positionCorr__positionPoint____source);
		srcLocation__positionPoint____Position.setSrc(srcLocation);
		srcLocation__positionPoint____Position.setTrg(positionPoint);
		isApplicableMatch.getAllContextElements().add(srcLocation__positionPoint____Position);
		positionCorr__trgPositionPoint____target.setSrc(positionCorr);
		positionCorr__trgPositionPoint____target.setTrg(trgPositionPoint);
		isApplicableMatch.getAllContextElements().add(positionCorr__trgPositionPoint____target);
		locationToLocation__srcLocation____source.setSrc(locationToLocation);
		locationToLocation__srcLocation____source.setTrg(srcLocation);
		isApplicableMatch.getAllContextElements().add(locationToLocation__srcLocation____source);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(pair__asset____a);
		locationToLocation__trgLocation____target.setName(locationToLocation__trgLocation____target_name_prime);
		asset__srcLocation____Location.setName(asset__srcLocation____Location_name_prime);
		srcLocation__asset____Assets.setName(srcLocation__asset____Assets_name_prime);
		positionCorr__positionPoint____source.setName(positionCorr__positionPoint____source_name_prime);
		srcLocation__positionPoint____Position.setName(srcLocation__positionPoint____Position_name_prime);
		positionCorr__trgPositionPoint____target.setName(positionCorr__trgPositionPoint____target_name_prime);
		locationToLocation__srcLocation____source.setName(locationToLocation__srcLocation____source_name_prime);
		pair__asset____a.setName(pair__asset____a_name_prime);
		return new Object[] { locationToLocation, trgLocation, asset, trgPositionPoint, positionCorr, srcLocation,
				positionPoint, pair, isApplicableMatch, locationToLocation__trgLocation____target,
				asset__srcLocation____Location, srcLocation__asset____Assets, positionCorr__positionPoint____source,
				srcLocation__positionPoint____Position, positionCorr__trgPositionPoint____target,
				locationToLocation__srcLocation____source, pair__asset____a };
	}

	public static final Object[] pattern_PositionPointLink_2_4_solveCSP_bindingFBBBBBBBBBB(PositionPointLink _this,
			IsApplicableMatch isApplicableMatch, LocationToLocation locationToLocation,
			outageDetectionJointarget.Location trgLocation, MeterAsset asset,
			outageDetectionJointarget.PositionPoint trgPositionPoint, PositionPointToPositionPoint positionCorr,
			Location srcLocation, PositionPoint positionPoint, MeterAssetPhysicalDevicePair pair) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, locationToLocation, trgLocation,
				asset, trgPositionPoint, positionCorr, srcLocation, positionPoint, pair);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, locationToLocation, trgLocation, asset,
					trgPositionPoint, positionCorr, srcLocation, positionPoint, pair };
		}
		return null;
	}

	public static final Object[] pattern_PositionPointLink_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PositionPointLink_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			PositionPointLink _this, IsApplicableMatch isApplicableMatch, LocationToLocation locationToLocation,
			outageDetectionJointarget.Location trgLocation, MeterAsset asset,
			outageDetectionJointarget.PositionPoint trgPositionPoint, PositionPointToPositionPoint positionCorr,
			Location srcLocation, PositionPoint positionPoint, MeterAssetPhysicalDevicePair pair) {
		Object[] result_pattern_PositionPointLink_2_4_solveCSP_binding = pattern_PositionPointLink_2_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, locationToLocation, trgLocation, asset, trgPositionPoint, positionCorr,
				srcLocation, positionPoint, pair);
		if (result_pattern_PositionPointLink_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PositionPointLink_2_4_solveCSP_binding[0];

			Object[] result_pattern_PositionPointLink_2_4_solveCSP_black = pattern_PositionPointLink_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_PositionPointLink_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, locationToLocation, trgLocation, asset,
						trgPositionPoint, positionCorr, srcLocation, positionPoint, pair };
			}
		}
		return null;
	}

	public static final boolean pattern_PositionPointLink_2_5_checkCSP_expressionFBB(PositionPointLink _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PositionPointLink_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_PositionPointLink_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "PositionPointLink";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_PositionPointLink_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PositionPointLink_10_1_preparereturnvalue_bindingFB(PositionPointLink _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PositionPointLink_10_1_preparereturnvalue_blackFBBF(EClass __eClass,
			PositionPointLink _this) {
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

	public static final Object[] pattern_PositionPointLink_10_1_preparereturnvalue_bindingAndBlackFFBF(
			PositionPointLink _this) {
		Object[] result_pattern_PositionPointLink_10_1_preparereturnvalue_binding = pattern_PositionPointLink_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_PositionPointLink_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_PositionPointLink_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_PositionPointLink_10_1_preparereturnvalue_black = pattern_PositionPointLink_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_PositionPointLink_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PositionPointLink_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_PositionPointLink_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_PositionPointLink_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_PositionPointLink_10_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_Position) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSrcLocation = _edge_Position.getSrc();
		if (tmpSrcLocation instanceof Location) {
			Location srcLocation = (Location) tmpSrcLocation;
			EObject tmpPositionPoint = _edge_Position.getTrg();
			if (tmpPositionPoint instanceof PositionPoint) {
				PositionPoint positionPoint = (PositionPoint) tmpPositionPoint;
				if (positionPoint.equals(srcLocation.getPosition())) {
					for (Asset tmpAsset : srcLocation.getAssets()) {
						if (tmpAsset instanceof MeterAsset) {
							MeterAsset asset = (MeterAsset) tmpAsset;
							for (MeterAssetPhysicalDevicePair pair : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(asset, MeterAssetPhysicalDevicePair.class, "a")) {
								_result.add(new Object[] { asset, srcLocation, positionPoint, pair, _edge_Position });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_PositionPointLink_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PositionPointLink_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			PositionPointLink _this, Match match, MeterAsset asset, Location srcLocation, PositionPoint positionPoint,
			MeterAssetPhysicalDevicePair pair) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, asset, srcLocation, positionPoint, pair);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PositionPointLink_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			PositionPointLink _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PositionPointLink_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_PositionPointLink_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_PositionPointLink_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PositionPointLink_13_1_matchtggpattern_blackBBBB(MeterAsset asset,
			Location srcLocation, PositionPoint positionPoint, MeterAssetPhysicalDevicePair pair) {
		if (srcLocation.equals(asset.getLocation())) {
			if (positionPoint.equals(srcLocation.getPosition())) {
				if (asset.equals(pair.getA())) {
					return new Object[] { asset, srcLocation, positionPoint, pair };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_PositionPointLink_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PositionPointLink_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //PositionPointLinkImpl
