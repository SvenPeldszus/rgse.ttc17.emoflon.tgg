/**
 */
package rgse.ttc17.emoflon.tgg.task1.Rules.impl;

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

import outageDetectionJointarget.EnergyConsumer;
import outageDetectionJointarget.OutageDetectionJointargetFactory;

import rgse.ttc17.emoflon.tgg.task1.LocationToLocation;
import rgse.ttc17.emoflon.tgg.task1.MeterAssetToEnergyConsumer;

import rgse.ttc17.emoflon.tgg.task1.Rules.Location;
import rgse.ttc17.emoflon.tgg.task1.Rules.RulesPackage;

import rgse.ttc17.emoflon.tgg.task1.Task1Factory;
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
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LocationImpl extends AbstractRuleImpl implements Location {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getLocation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			gluemodel.CIM.IEC61968.Common.Location srcLocation) {
		// initial bindings
		Object[] result1_black = LocationImpl.pattern_Location_0_1_initialbindings_blackBBBBB(this, match, pair, asset,
				srcLocation);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[pair] = " + pair + ", " + "[asset] = "
					+ asset + ", " + "[srcLocation] = " + srcLocation + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = LocationImpl.pattern_Location_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match,
				pair, asset, srcLocation);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[pair] = " + pair + ", " + "[asset] = " + asset
					+ ", " + "[srcLocation] = " + srcLocation + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (LocationImpl.pattern_Location_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = LocationImpl.pattern_Location_0_4_collectelementstobetranslated_blackBBBB(match,
					pair, asset, srcLocation);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[pair] = " + pair + ", " + "[asset] = "
						+ asset + ", " + "[srcLocation] = " + srcLocation + ".");
			}
			LocationImpl.pattern_Location_0_4_collectelementstobetranslated_greenBBBFF(match, asset, srcLocation);
			// EMoflonEdge asset__srcLocation____Location = (EMoflonEdge) result4_green[3];
			// EMoflonEdge srcLocation__asset____Assets = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = LocationImpl.pattern_Location_0_5_collectcontextelements_blackBBBB(match, pair,
					asset, srcLocation);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[pair] = " + pair + ", " + "[asset] = "
						+ asset + ", " + "[srcLocation] = " + srcLocation + ".");
			}
			LocationImpl.pattern_Location_0_5_collectcontextelements_greenBBBF(match, pair, asset);
			// EMoflonEdge pair__asset____a = (EMoflonEdge) result5_green[3];

			// register objects to match
			LocationImpl.pattern_Location_0_6_registerobjectstomatch_expressionBBBBB(this, match, pair, asset,
					srcLocation);
			return LocationImpl.pattern_Location_0_7_expressionF();
		} else {
			return LocationImpl.pattern_Location_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = LocationImpl
				.pattern_Location_1_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result1_bindingAndBlack[0];
		MeterAsset asset = (MeterAsset) result1_bindingAndBlack[1];
		EnergyConsumer consumer = (EnergyConsumer) result1_bindingAndBlack[2];
		gluemodel.CIM.IEC61968.Common.Location srcLocation = (gluemodel.CIM.IEC61968.Common.Location) result1_bindingAndBlack[3];
		MeterAssetToEnergyConsumer assetToConumer = (MeterAssetToEnergyConsumer) result1_bindingAndBlack[4];
		// CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = LocationImpl.pattern_Location_1_1_performtransformation_greenBFFB(consumer,
				srcLocation);
		LocationToLocation srcLocationCorr = (LocationToLocation) result1_green[1];
		outageDetectionJointarget.Location trgLocation = (outageDetectionJointarget.Location) result1_green[2];

		// collect translated elements
		Object[] result2_black = LocationImpl.pattern_Location_1_2_collecttranslatedelements_blackBBB(srcLocationCorr,
				trgLocation, srcLocation);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[srcLocationCorr] = " + srcLocationCorr + ", " + "[trgLocation] = " + trgLocation + ", "
					+ "[srcLocation] = " + srcLocation + ".");
		}
		Object[] result2_green = LocationImpl.pattern_Location_1_2_collecttranslatedelements_greenFBBB(srcLocationCorr,
				trgLocation, srcLocation);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = LocationImpl.pattern_Location_1_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, pair,
				asset, consumer, srcLocationCorr, trgLocation, srcLocation, assetToConumer);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[pair] = " + pair + ", " + "[asset] = " + asset + ", "
					+ "[consumer] = " + consumer + ", " + "[srcLocationCorr] = " + srcLocationCorr + ", "
					+ "[trgLocation] = " + trgLocation + ", " + "[srcLocation] = " + srcLocation + ", "
					+ "[assetToConumer] = " + assetToConumer + ".");
		}
		LocationImpl.pattern_Location_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, asset, consumer,
				srcLocationCorr, trgLocation, srcLocation);
		// EMoflonEdge asset__srcLocation____Location = (EMoflonEdge) result3_green[6];
		// EMoflonEdge srcLocation__asset____Assets = (EMoflonEdge) result3_green[7];
		// EMoflonEdge srcLocationCorr__trgLocation____target = (EMoflonEdge) result3_green[8];
		// EMoflonEdge srcLocationCorr__srcLocation____source = (EMoflonEdge) result3_green[9];
		// EMoflonEdge consumer__trgLocation____Location = (EMoflonEdge) result3_green[10];

		// perform postprocessing story node is empty
		// register objects
		LocationImpl.pattern_Location_1_5_registerobjects_expressionBBBBBBBBB(this, ruleresult, pair, asset, consumer,
				srcLocationCorr, trgLocation, srcLocation, assetToConumer);
		return LocationImpl.pattern_Location_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = LocationImpl
				.pattern_Location_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LocationImpl.pattern_Location_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = LocationImpl.pattern_Location_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_binding[0];
		MeterAsset asset = (MeterAsset) result2_binding[1];
		gluemodel.CIM.IEC61968.Common.Location srcLocation = (gluemodel.CIM.IEC61968.Common.Location) result2_binding[2];
		for (Object[] result2_black : LocationImpl.pattern_Location_2_2_corematch_blackBBFBFB(pair, asset, srcLocation,
				match)) {
			EnergyConsumer consumer = (EnergyConsumer) result2_black[2];
			MeterAssetToEnergyConsumer assetToConumer = (MeterAssetToEnergyConsumer) result2_black[4];
			// ForEach find context
			for (Object[] result3_black : LocationImpl.pattern_Location_2_3_findcontext_blackBBBBB(pair, asset,
					consumer, srcLocation, assetToConumer)) {
				Object[] result3_green = LocationImpl.pattern_Location_2_3_findcontext_greenBBBBBFFFFFF(pair, asset,
						consumer, srcLocation, assetToConumer);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				// EMoflonEdge asset__srcLocation____Location = (EMoflonEdge) result3_green[6];
				// EMoflonEdge srcLocation__asset____Assets = (EMoflonEdge) result3_green[7];
				// EMoflonEdge assetToConumer__consumer____target = (EMoflonEdge) result3_green[8];
				// EMoflonEdge assetToConumer__asset____source = (EMoflonEdge) result3_green[9];
				// EMoflonEdge pair__asset____a = (EMoflonEdge) result3_green[10];

				// solve CSP
				Object[] result4_bindingAndBlack = LocationImpl.pattern_Location_2_4_solveCSP_bindingAndBlackFBBBBBBB(
						this, isApplicableMatch, pair, asset, consumer, srcLocation, assetToConumer);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[pair] = " + pair + ", " + "[asset] = " + asset + ", " + "[consumer] = " + consumer
							+ ", " + "[srcLocation] = " + srcLocation + ", " + "[assetToConumer] = " + assetToConumer
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (LocationImpl.pattern_Location_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = LocationImpl.pattern_Location_2_6_addmatchtoruleresult_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					LocationImpl.pattern_Location_2_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return LocationImpl.pattern_Location_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			gluemodel.CIM.IEC61968.Common.Location srcLocation) {
		match.registerObject("pair", pair);
		match.registerObject("asset", asset);
		match.registerObject("srcLocation", srcLocation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			gluemodel.CIM.IEC61968.Common.Location srcLocation) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MeterAssetPhysicalDevicePair pair,
			MeterAsset asset, EnergyConsumer consumer, gluemodel.CIM.IEC61968.Common.Location srcLocation,
			MeterAssetToEnergyConsumer assetToConumer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("pair", pair);
		isApplicableMatch.registerObject("asset", asset);
		isApplicableMatch.registerObject("consumer", consumer);
		isApplicableMatch.registerObject("srcLocation", srcLocation);
		isApplicableMatch.registerObject("assetToConumer", assetToConumer);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject pair, EObject asset, EObject consumer,
			EObject srcLocationCorr, EObject trgLocation, EObject srcLocation, EObject assetToConumer) {
		ruleresult.registerObject("pair", pair);
		ruleresult.registerObject("asset", asset);
		ruleresult.registerObject("consumer", consumer);
		ruleresult.registerObject("srcLocationCorr", srcLocationCorr);
		ruleresult.registerObject("trgLocation", trgLocation);
		ruleresult.registerObject("srcLocation", srcLocation);
		ruleresult.registerObject("assetToConumer", assetToConumer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("srcLocation").eClass())
				.equals("gluemodel.CIM.IEC61968.Common.Location.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_61(EMoflonEdge _edge_Location) {
		// prepare return value
		Object[] result1_bindingAndBlack = LocationImpl
				.pattern_Location_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = LocationImpl.pattern_Location_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : LocationImpl
				.pattern_Location_10_2_testcorematchandDECs_blackFFFB(_edge_Location)) {
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_black[0];
			MeterAsset asset = (MeterAsset) result2_black[1];
			gluemodel.CIM.IEC61968.Common.Location srcLocation = (gluemodel.CIM.IEC61968.Common.Location) result2_black[2];
			Object[] result2_green = LocationImpl.pattern_Location_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (LocationImpl.pattern_Location_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
					match, pair, asset, srcLocation)) {
				// Ensure that the correct types of elements are matched
				if (LocationImpl.pattern_Location_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
						match)) {

					// Add match to rule result
					Object[] result5_black = LocationImpl.pattern_Location_10_5_Addmatchtoruleresult_blackBBBB(match,
							__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					LocationImpl.pattern_Location_10_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return LocationImpl.pattern_Location_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("Location");
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
	public boolean checkDEC_FWD(MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			gluemodel.CIM.IEC61968.Common.Location srcLocation) {// match tgg pattern
		Object[] result1_black = LocationImpl.pattern_Location_13_1_matchtggpattern_blackBBB(pair, asset, srcLocation);
		if (result1_black != null) {
			return LocationImpl.pattern_Location_13_2_expressionF();
		} else {
			return LocationImpl.pattern_Location_13_3_expressionF();
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
		case RulesPackage.LOCATION___IS_APPROPRIATE_FWD__MATCH_METERASSETPHYSICALDEVICEPAIR_METERASSET_LOCATION:
			return isAppropriate_FWD((Match) arguments.get(0), (MeterAssetPhysicalDevicePair) arguments.get(1),
					(MeterAsset) arguments.get(2), (gluemodel.CIM.IEC61968.Common.Location) arguments.get(3));
		case RulesPackage.LOCATION___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LOCATION___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.LOCATION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_METERASSETPHYSICALDEVICEPAIR_METERASSET_LOCATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MeterAssetPhysicalDevicePair) arguments.get(1),
					(MeterAsset) arguments.get(2), (gluemodel.CIM.IEC61968.Common.Location) arguments.get(3));
			return null;
		case RulesPackage.LOCATION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_METERASSETPHYSICALDEVICEPAIR_METERASSET_LOCATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MeterAssetPhysicalDevicePair) arguments.get(1),
					(MeterAsset) arguments.get(2), (gluemodel.CIM.IEC61968.Common.Location) arguments.get(3));
		case RulesPackage.LOCATION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LOCATION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_METERASSETPHYSICALDEVICEPAIR_METERASSET_ENERGYCONSUMER_LOCATION_METERASSETTOENERGYCONSUMER:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(MeterAssetPhysicalDevicePair) arguments.get(1), (MeterAsset) arguments.get(2),
					(EnergyConsumer) arguments.get(3), (gluemodel.CIM.IEC61968.Common.Location) arguments.get(4),
					(MeterAssetToEnergyConsumer) arguments.get(5));
		case RulesPackage.LOCATION___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LOCATION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.LOCATION___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.LOCATION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_61__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_61((EMoflonEdge) arguments.get(0));
		case RulesPackage.LOCATION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.LOCATION___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.LOCATION___CHECK_DEC_FWD__METERASSETPHYSICALDEVICEPAIR_METERASSET_LOCATION:
			return checkDEC_FWD((MeterAssetPhysicalDevicePair) arguments.get(0), (MeterAsset) arguments.get(1),
					(gluemodel.CIM.IEC61968.Common.Location) arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_Location_0_1_initialbindings_blackBBBBB(Location _this, Match match,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset, gluemodel.CIM.IEC61968.Common.Location srcLocation) {
		return new Object[] { _this, match, pair, asset, srcLocation };
	}

	public static final Object[] pattern_Location_0_2_SolveCSP_bindingFBBBBB(Location _this, Match match,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset, gluemodel.CIM.IEC61968.Common.Location srcLocation) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, pair, asset, srcLocation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, pair, asset, srcLocation };
		}
		return null;
	}

	public static final Object[] pattern_Location_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Location_0_2_SolveCSP_bindingAndBlackFBBBBB(Location _this, Match match,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset, gluemodel.CIM.IEC61968.Common.Location srcLocation) {
		Object[] result_pattern_Location_0_2_SolveCSP_binding = pattern_Location_0_2_SolveCSP_bindingFBBBBB(_this,
				match, pair, asset, srcLocation);
		if (result_pattern_Location_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Location_0_2_SolveCSP_binding[0];

			Object[] result_pattern_Location_0_2_SolveCSP_black = pattern_Location_0_2_SolveCSP_blackB(csp);
			if (result_pattern_Location_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, pair, asset, srcLocation };
			}
		}
		return null;
	}

	public static final boolean pattern_Location_0_3_CheckCSP_expressionFBB(Location _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Location_0_4_collectelementstobetranslated_blackBBBB(Match match,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset, gluemodel.CIM.IEC61968.Common.Location srcLocation) {
		return new Object[] { match, pair, asset, srcLocation };
	}

	public static final Object[] pattern_Location_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			MeterAsset asset, gluemodel.CIM.IEC61968.Common.Location srcLocation) {
		EMoflonEdge asset__srcLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocation__asset____Assets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(srcLocation);
		String asset__srcLocation____Location_name_prime = "Location";
		String srcLocation__asset____Assets_name_prime = "Assets";
		asset__srcLocation____Location.setSrc(asset);
		asset__srcLocation____Location.setTrg(srcLocation);
		match.getToBeTranslatedEdges().add(asset__srcLocation____Location);
		srcLocation__asset____Assets.setSrc(srcLocation);
		srcLocation__asset____Assets.setTrg(asset);
		match.getToBeTranslatedEdges().add(srcLocation__asset____Assets);
		asset__srcLocation____Location.setName(asset__srcLocation____Location_name_prime);
		srcLocation__asset____Assets.setName(srcLocation__asset____Assets_name_prime);
		return new Object[] { match, asset, srcLocation, asset__srcLocation____Location, srcLocation__asset____Assets };
	}

	public static final Object[] pattern_Location_0_5_collectcontextelements_blackBBBB(Match match,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset, gluemodel.CIM.IEC61968.Common.Location srcLocation) {
		return new Object[] { match, pair, asset, srcLocation };
	}

	public static final Object[] pattern_Location_0_5_collectcontextelements_greenBBBF(Match match,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset) {
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(pair);
		match.getContextNodes().add(asset);
		String pair__asset____a_name_prime = "a";
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		match.getContextEdges().add(pair__asset____a);
		pair__asset____a.setName(pair__asset____a_name_prime);
		return new Object[] { match, pair, asset, pair__asset____a };
	}

	public static final void pattern_Location_0_6_registerobjectstomatch_expressionBBBBB(Location _this, Match match,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset, gluemodel.CIM.IEC61968.Common.Location srcLocation) {
		_this.registerObjectsToMatch_FWD(match, pair, asset, srcLocation);

	}

	public static final boolean pattern_Location_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Location_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_Location_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("pair");
		EObject _localVariable_1 = isApplicableMatch.getObject("asset");
		EObject _localVariable_2 = isApplicableMatch.getObject("consumer");
		EObject _localVariable_3 = isApplicableMatch.getObject("srcLocation");
		EObject _localVariable_4 = isApplicableMatch.getObject("assetToConumer");
		EObject tmpPair = _localVariable_0;
		EObject tmpAsset = _localVariable_1;
		EObject tmpConsumer = _localVariable_2;
		EObject tmpSrcLocation = _localVariable_3;
		EObject tmpAssetToConumer = _localVariable_4;
		if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
			if (tmpAsset instanceof MeterAsset) {
				MeterAsset asset = (MeterAsset) tmpAsset;
				if (tmpConsumer instanceof EnergyConsumer) {
					EnergyConsumer consumer = (EnergyConsumer) tmpConsumer;
					if (tmpSrcLocation instanceof gluemodel.CIM.IEC61968.Common.Location) {
						gluemodel.CIM.IEC61968.Common.Location srcLocation = (gluemodel.CIM.IEC61968.Common.Location) tmpSrcLocation;
						if (tmpAssetToConumer instanceof MeterAssetToEnergyConsumer) {
							MeterAssetToEnergyConsumer assetToConumer = (MeterAssetToEnergyConsumer) tmpAssetToConumer;
							return new Object[] { pair, asset, consumer, srcLocation, assetToConumer,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Location_1_1_performtransformation_blackBBBBBFBB(
			MeterAssetPhysicalDevicePair pair, MeterAsset asset, EnergyConsumer consumer,
			gluemodel.CIM.IEC61968.Common.Location srcLocation, MeterAssetToEnergyConsumer assetToConumer,
			Location _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { pair, asset, consumer, srcLocation, assetToConumer, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Location_1_1_performtransformation_bindingAndBlackFFFFFFBB(Location _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Location_1_1_performtransformation_binding = pattern_Location_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_Location_1_1_performtransformation_binding != null) {
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result_pattern_Location_1_1_performtransformation_binding[0];
			MeterAsset asset = (MeterAsset) result_pattern_Location_1_1_performtransformation_binding[1];
			EnergyConsumer consumer = (EnergyConsumer) result_pattern_Location_1_1_performtransformation_binding[2];
			gluemodel.CIM.IEC61968.Common.Location srcLocation = (gluemodel.CIM.IEC61968.Common.Location) result_pattern_Location_1_1_performtransformation_binding[3];
			MeterAssetToEnergyConsumer assetToConumer = (MeterAssetToEnergyConsumer) result_pattern_Location_1_1_performtransformation_binding[4];

			Object[] result_pattern_Location_1_1_performtransformation_black = pattern_Location_1_1_performtransformation_blackBBBBBFBB(
					pair, asset, consumer, srcLocation, assetToConumer, _this, isApplicableMatch);
			if (result_pattern_Location_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_Location_1_1_performtransformation_black[5];

				return new Object[] { pair, asset, consumer, srcLocation, assetToConumer, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Location_1_1_performtransformation_greenBFFB(EnergyConsumer consumer,
			gluemodel.CIM.IEC61968.Common.Location srcLocation) {
		LocationToLocation srcLocationCorr = Task1Factory.eINSTANCE.createLocationToLocation();
		outageDetectionJointarget.Location trgLocation = OutageDetectionJointargetFactory.eINSTANCE.createLocation();
		srcLocationCorr.setSource(srcLocation);
		srcLocationCorr.setTarget(trgLocation);
		consumer.setLocation(trgLocation);
		return new Object[] { consumer, srcLocationCorr, trgLocation, srcLocation };
	}

	public static final Object[] pattern_Location_1_2_collecttranslatedelements_blackBBB(
			LocationToLocation srcLocationCorr, outageDetectionJointarget.Location trgLocation,
			gluemodel.CIM.IEC61968.Common.Location srcLocation) {
		return new Object[] { srcLocationCorr, trgLocation, srcLocation };
	}

	public static final Object[] pattern_Location_1_2_collecttranslatedelements_greenFBBB(
			LocationToLocation srcLocationCorr, outageDetectionJointarget.Location trgLocation,
			gluemodel.CIM.IEC61968.Common.Location srcLocation) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(srcLocationCorr);
		ruleresult.getCreatedElements().add(trgLocation);
		ruleresult.getTranslatedElements().add(srcLocation);
		return new Object[] { ruleresult, srcLocationCorr, trgLocation, srcLocation };
	}

	public static final Object[] pattern_Location_1_3_bookkeepingforedges_blackBBBBBBBB(PerformRuleResult ruleresult,
			EObject pair, EObject asset, EObject consumer, EObject srcLocationCorr, EObject trgLocation,
			EObject srcLocation, EObject assetToConumer) {
		if (!pair.equals(srcLocationCorr)) {
			if (!pair.equals(trgLocation)) {
				if (!pair.equals(srcLocation)) {
					if (!asset.equals(pair)) {
						if (!asset.equals(consumer)) {
							if (!asset.equals(srcLocationCorr)) {
								if (!asset.equals(trgLocation)) {
									if (!asset.equals(srcLocation)) {
										if (!asset.equals(assetToConumer)) {
											if (!consumer.equals(pair)) {
												if (!consumer.equals(srcLocationCorr)) {
													if (!consumer.equals(trgLocation)) {
														if (!consumer.equals(srcLocation)) {
															if (!srcLocationCorr.equals(trgLocation)) {
																if (!srcLocation.equals(srcLocationCorr)) {
																	if (!srcLocation.equals(trgLocation)) {
																		if (!assetToConumer.equals(pair)) {
																			if (!assetToConumer.equals(consumer)) {
																				if (!assetToConumer
																						.equals(srcLocationCorr)) {
																					if (!assetToConumer
																							.equals(trgLocation)) {
																						if (!assetToConumer
																								.equals(srcLocation)) {
																							return new Object[] {
																									ruleresult, pair,
																									asset, consumer,
																									srcLocationCorr,
																									trgLocation,
																									srcLocation,
																									assetToConumer };
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

	public static final Object[] pattern_Location_1_3_bookkeepingforedges_greenBBBBBBFFFFF(PerformRuleResult ruleresult,
			EObject asset, EObject consumer, EObject srcLocationCorr, EObject trgLocation, EObject srcLocation) {
		EMoflonEdge asset__srcLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocation__asset____Assets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocationCorr__trgLocation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocationCorr__srcLocation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge consumer__trgLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Location";
		String asset__srcLocation____Location_name_prime = "Location";
		String srcLocation__asset____Assets_name_prime = "Assets";
		String srcLocationCorr__trgLocation____target_name_prime = "target";
		String srcLocationCorr__srcLocation____source_name_prime = "source";
		String consumer__trgLocation____Location_name_prime = "Location";
		asset__srcLocation____Location.setSrc(asset);
		asset__srcLocation____Location.setTrg(srcLocation);
		ruleresult.getTranslatedEdges().add(asset__srcLocation____Location);
		srcLocation__asset____Assets.setSrc(srcLocation);
		srcLocation__asset____Assets.setTrg(asset);
		ruleresult.getTranslatedEdges().add(srcLocation__asset____Assets);
		srcLocationCorr__trgLocation____target.setSrc(srcLocationCorr);
		srcLocationCorr__trgLocation____target.setTrg(trgLocation);
		ruleresult.getCreatedEdges().add(srcLocationCorr__trgLocation____target);
		srcLocationCorr__srcLocation____source.setSrc(srcLocationCorr);
		srcLocationCorr__srcLocation____source.setTrg(srcLocation);
		ruleresult.getCreatedEdges().add(srcLocationCorr__srcLocation____source);
		consumer__trgLocation____Location.setSrc(consumer);
		consumer__trgLocation____Location.setTrg(trgLocation);
		ruleresult.getCreatedEdges().add(consumer__trgLocation____Location);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		asset__srcLocation____Location.setName(asset__srcLocation____Location_name_prime);
		srcLocation__asset____Assets.setName(srcLocation__asset____Assets_name_prime);
		srcLocationCorr__trgLocation____target.setName(srcLocationCorr__trgLocation____target_name_prime);
		srcLocationCorr__srcLocation____source.setName(srcLocationCorr__srcLocation____source_name_prime);
		consumer__trgLocation____Location.setName(consumer__trgLocation____Location_name_prime);
		return new Object[] { ruleresult, asset, consumer, srcLocationCorr, trgLocation, srcLocation,
				asset__srcLocation____Location, srcLocation__asset____Assets, srcLocationCorr__trgLocation____target,
				srcLocationCorr__srcLocation____source, consumer__trgLocation____Location };
	}

	public static final void pattern_Location_1_5_registerobjects_expressionBBBBBBBBB(Location _this,
			PerformRuleResult ruleresult, EObject pair, EObject asset, EObject consumer, EObject srcLocationCorr,
			EObject trgLocation, EObject srcLocation, EObject assetToConumer) {
		_this.registerObjects_FWD(ruleresult, pair, asset, consumer, srcLocationCorr, trgLocation, srcLocation,
				assetToConumer);

	}

	public static final PerformRuleResult pattern_Location_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Location_2_1_preparereturnvalue_bindingFB(Location _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Location_2_1_preparereturnvalue_blackFBB(EClass eClass, Location _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Location_2_1_preparereturnvalue_bindingAndBlackFFB(Location _this) {
		Object[] result_pattern_Location_2_1_preparereturnvalue_binding = pattern_Location_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Location_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_Location_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Location_2_1_preparereturnvalue_black = pattern_Location_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_Location_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Location_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Location_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "Location";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Location_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("pair");
		EObject _localVariable_1 = match.getObject("asset");
		EObject _localVariable_2 = match.getObject("srcLocation");
		EObject tmpPair = _localVariable_0;
		EObject tmpAsset = _localVariable_1;
		EObject tmpSrcLocation = _localVariable_2;
		if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
			if (tmpAsset instanceof MeterAsset) {
				MeterAsset asset = (MeterAsset) tmpAsset;
				if (tmpSrcLocation instanceof gluemodel.CIM.IEC61968.Common.Location) {
					gluemodel.CIM.IEC61968.Common.Location srcLocation = (gluemodel.CIM.IEC61968.Common.Location) tmpSrcLocation;
					return new Object[] { pair, asset, srcLocation, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Location_2_2_corematch_blackBBFBFB(MeterAssetPhysicalDevicePair pair,
			MeterAsset asset, gluemodel.CIM.IEC61968.Common.Location srcLocation, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MeterAssetToEnergyConsumer assetToConumer : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(asset, MeterAssetToEnergyConsumer.class, "source")) {
			EnergyConsumer consumer = assetToConumer.getTarget();
			if (consumer != null) {
				_result.add(new Object[] { pair, asset, consumer, srcLocation, assetToConumer, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Location_2_3_findcontext_blackBBBBB(
			MeterAssetPhysicalDevicePair pair, MeterAsset asset, EnergyConsumer consumer,
			gluemodel.CIM.IEC61968.Common.Location srcLocation, MeterAssetToEnergyConsumer assetToConumer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (srcLocation.equals(asset.getLocation())) {
			if (consumer.equals(assetToConumer.getTarget())) {
				if (asset.equals(assetToConumer.getSource())) {
					if (asset.equals(pair.getA())) {
						_result.add(new Object[] { pair, asset, consumer, srcLocation, assetToConumer });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Location_2_3_findcontext_greenBBBBBFFFFFF(MeterAssetPhysicalDevicePair pair,
			MeterAsset asset, EnergyConsumer consumer, gluemodel.CIM.IEC61968.Common.Location srcLocation,
			MeterAssetToEnergyConsumer assetToConumer) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge asset__srcLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocation__asset____Assets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge assetToConumer__consumer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge assetToConumer__asset____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String asset__srcLocation____Location_name_prime = "Location";
		String srcLocation__asset____Assets_name_prime = "Assets";
		String assetToConumer__consumer____target_name_prime = "target";
		String assetToConumer__asset____source_name_prime = "source";
		String pair__asset____a_name_prime = "a";
		isApplicableMatch.getAllContextElements().add(pair);
		isApplicableMatch.getAllContextElements().add(asset);
		isApplicableMatch.getAllContextElements().add(consumer);
		isApplicableMatch.getAllContextElements().add(srcLocation);
		isApplicableMatch.getAllContextElements().add(assetToConumer);
		asset__srcLocation____Location.setSrc(asset);
		asset__srcLocation____Location.setTrg(srcLocation);
		isApplicableMatch.getAllContextElements().add(asset__srcLocation____Location);
		srcLocation__asset____Assets.setSrc(srcLocation);
		srcLocation__asset____Assets.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(srcLocation__asset____Assets);
		assetToConumer__consumer____target.setSrc(assetToConumer);
		assetToConumer__consumer____target.setTrg(consumer);
		isApplicableMatch.getAllContextElements().add(assetToConumer__consumer____target);
		assetToConumer__asset____source.setSrc(assetToConumer);
		assetToConumer__asset____source.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(assetToConumer__asset____source);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(pair__asset____a);
		asset__srcLocation____Location.setName(asset__srcLocation____Location_name_prime);
		srcLocation__asset____Assets.setName(srcLocation__asset____Assets_name_prime);
		assetToConumer__consumer____target.setName(assetToConumer__consumer____target_name_prime);
		assetToConumer__asset____source.setName(assetToConumer__asset____source_name_prime);
		pair__asset____a.setName(pair__asset____a_name_prime);
		return new Object[] { pair, asset, consumer, srcLocation, assetToConumer, isApplicableMatch,
				asset__srcLocation____Location, srcLocation__asset____Assets, assetToConumer__consumer____target,
				assetToConumer__asset____source, pair__asset____a };
	}

	public static final Object[] pattern_Location_2_4_solveCSP_bindingFBBBBBBB(Location _this,
			IsApplicableMatch isApplicableMatch, MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			EnergyConsumer consumer, gluemodel.CIM.IEC61968.Common.Location srcLocation,
			MeterAssetToEnergyConsumer assetToConumer) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, pair, asset, consumer, srcLocation,
				assetToConumer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, pair, asset, consumer, srcLocation, assetToConumer };
		}
		return null;
	}

	public static final Object[] pattern_Location_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Location_2_4_solveCSP_bindingAndBlackFBBBBBBB(Location _this,
			IsApplicableMatch isApplicableMatch, MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			EnergyConsumer consumer, gluemodel.CIM.IEC61968.Common.Location srcLocation,
			MeterAssetToEnergyConsumer assetToConumer) {
		Object[] result_pattern_Location_2_4_solveCSP_binding = pattern_Location_2_4_solveCSP_bindingFBBBBBBB(_this,
				isApplicableMatch, pair, asset, consumer, srcLocation, assetToConumer);
		if (result_pattern_Location_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Location_2_4_solveCSP_binding[0];

			Object[] result_pattern_Location_2_4_solveCSP_black = pattern_Location_2_4_solveCSP_blackB(csp);
			if (result_pattern_Location_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, pair, asset, consumer, srcLocation,
						assetToConumer };
			}
		}
		return null;
	}

	public static final boolean pattern_Location_2_5_checkCSP_expressionFBB(Location _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Location_2_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Location_2_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Location";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Location_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Location_10_1_preparereturnvalue_bindingFB(Location _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Location_10_1_preparereturnvalue_blackFBBF(EClass __eClass, Location _this) {
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

	public static final Object[] pattern_Location_10_1_preparereturnvalue_bindingAndBlackFFBF(Location _this) {
		Object[] result_pattern_Location_10_1_preparereturnvalue_binding = pattern_Location_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Location_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_Location_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Location_10_1_preparereturnvalue_black = pattern_Location_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_Location_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Location_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_Location_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_Location_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_Location_10_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_Location) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpAsset = _edge_Location.getSrc();
		if (tmpAsset instanceof MeterAsset) {
			MeterAsset asset = (MeterAsset) tmpAsset;
			EObject tmpSrcLocation = _edge_Location.getTrg();
			if (tmpSrcLocation instanceof gluemodel.CIM.IEC61968.Common.Location) {
				gluemodel.CIM.IEC61968.Common.Location srcLocation = (gluemodel.CIM.IEC61968.Common.Location) tmpSrcLocation;
				if (srcLocation.equals(asset.getLocation())) {
					for (MeterAssetPhysicalDevicePair pair : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(asset, MeterAssetPhysicalDevicePair.class, "a")) {
						_result.add(new Object[] { pair, asset, srcLocation, _edge_Location });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_Location_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Location_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			Location _this, Match match, MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			gluemodel.CIM.IEC61968.Common.Location srcLocation) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, pair, asset, srcLocation);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Location_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			Location _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Location_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_Location_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_Location_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Location_13_1_matchtggpattern_blackBBB(MeterAssetPhysicalDevicePair pair,
			MeterAsset asset, gluemodel.CIM.IEC61968.Common.Location srcLocation) {
		if (srcLocation.equals(asset.getLocation())) {
			if (asset.equals(pair.getA())) {
				return new Object[] { pair, asset, srcLocation };
			}
		}
		return null;
	}

	public static final boolean pattern_Location_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Location_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //LocationImpl
