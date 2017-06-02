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
	public boolean isAppropriate_FWD(Match match, gluemodel.CIM.IEC61968.Common.Location srcLocation,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset) {
		// initial bindings
		Object[] result1_black = LocationImpl.pattern_Location_0_1_initialbindings_blackBBBBB(this, match, srcLocation,
				pair, asset);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[srcLocation] = " + srcLocation + ", "
					+ "[pair] = " + pair + ", " + "[asset] = " + asset + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = LocationImpl.pattern_Location_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match,
				srcLocation, pair, asset);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[srcLocation] = " + srcLocation + ", " + "[pair] = "
					+ pair + ", " + "[asset] = " + asset + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (LocationImpl.pattern_Location_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = LocationImpl.pattern_Location_0_4_collectelementstobetranslated_blackBBBB(match,
					srcLocation, pair, asset);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[srcLocation] = " + srcLocation + ", "
						+ "[pair] = " + pair + ", " + "[asset] = " + asset + ".");
			}
			LocationImpl.pattern_Location_0_4_collectelementstobetranslated_greenBBBFF(match, srcLocation, asset);
			// EMoflonEdge asset__srcLocation____Location = (EMoflonEdge) result4_green[3];
			// EMoflonEdge srcLocation__asset____Assets = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = LocationImpl.pattern_Location_0_5_collectcontextelements_blackBBBB(match,
					srcLocation, pair, asset);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[srcLocation] = " + srcLocation + ", "
						+ "[pair] = " + pair + ", " + "[asset] = " + asset + ".");
			}
			LocationImpl.pattern_Location_0_5_collectcontextelements_greenBBBF(match, pair, asset);
			// EMoflonEdge pair__asset____a = (EMoflonEdge) result5_green[3];

			// register objects to match
			LocationImpl.pattern_Location_0_6_registerobjectstomatch_expressionBBBBB(this, match, srcLocation, pair,
					asset);
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
		EnergyConsumer consumer = (EnergyConsumer) result1_bindingAndBlack[0];
		gluemodel.CIM.IEC61968.Common.Location srcLocation = (gluemodel.CIM.IEC61968.Common.Location) result1_bindingAndBlack[1];
		MeterAssetToEnergyConsumer assetToConumer = (MeterAssetToEnergyConsumer) result1_bindingAndBlack[2];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result1_bindingAndBlack[3];
		MeterAsset asset = (MeterAsset) result1_bindingAndBlack[4];
		// CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = LocationImpl.pattern_Location_1_1_performtransformation_greenBBFF(consumer,
				srcLocation);
		LocationToLocation srcLocationCorr = (LocationToLocation) result1_green[2];
		outageDetectionJointarget.Location trgLocation = (outageDetectionJointarget.Location) result1_green[3];

		// collect translated elements
		Object[] result2_black = LocationImpl.pattern_Location_1_2_collecttranslatedelements_blackBBB(srcLocation,
				srcLocationCorr, trgLocation);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[srcLocation] = " + srcLocation + ", " + "[srcLocationCorr] = " + srcLocationCorr + ", "
					+ "[trgLocation] = " + trgLocation + ".");
		}
		Object[] result2_green = LocationImpl.pattern_Location_1_2_collecttranslatedelements_greenFBBB(srcLocation,
				srcLocationCorr, trgLocation);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = LocationImpl.pattern_Location_1_3_bookkeepingforedges_blackBBBBBBBB(ruleresult,
				consumer, srcLocation, srcLocationCorr, assetToConumer, trgLocation, pair, asset);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[consumer] = " + consumer + ", " + "[srcLocation] = "
					+ srcLocation + ", " + "[srcLocationCorr] = " + srcLocationCorr + ", " + "[assetToConumer] = "
					+ assetToConumer + ", " + "[trgLocation] = " + trgLocation + ", " + "[pair] = " + pair + ", "
					+ "[asset] = " + asset + ".");
		}
		LocationImpl.pattern_Location_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, consumer, srcLocation,
				srcLocationCorr, trgLocation, asset);
		// EMoflonEdge srcLocationCorr__trgLocation____target = (EMoflonEdge) result3_green[6];
		// EMoflonEdge consumer__trgLocation____Location = (EMoflonEdge) result3_green[7];
		// EMoflonEdge srcLocationCorr__srcLocation____source = (EMoflonEdge) result3_green[8];
		// EMoflonEdge asset__srcLocation____Location = (EMoflonEdge) result3_green[9];
		// EMoflonEdge srcLocation__asset____Assets = (EMoflonEdge) result3_green[10];

		// perform postprocessing story node is empty
		// register objects
		LocationImpl.pattern_Location_1_5_registerobjects_expressionBBBBBBBBB(this, ruleresult, consumer, srcLocation,
				srcLocationCorr, assetToConumer, trgLocation, pair, asset);
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
		gluemodel.CIM.IEC61968.Common.Location srcLocation = (gluemodel.CIM.IEC61968.Common.Location) result2_binding[0];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_binding[1];
		MeterAsset asset = (MeterAsset) result2_binding[2];
		for (Object[] result2_black : LocationImpl.pattern_Location_2_2_corematch_blackFBFBBB(srcLocation, pair, asset,
				match)) {
			EnergyConsumer consumer = (EnergyConsumer) result2_black[0];
			MeterAssetToEnergyConsumer assetToConumer = (MeterAssetToEnergyConsumer) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : LocationImpl.pattern_Location_2_3_findcontext_blackBBBBB(consumer,
					srcLocation, assetToConumer, pair, asset)) {
				Object[] result3_green = LocationImpl.pattern_Location_2_3_findcontext_greenBBBBBFFFFFF(consumer,
						srcLocation, assetToConumer, pair, asset);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				// EMoflonEdge assetToConumer__consumer____target = (EMoflonEdge) result3_green[6];
				// EMoflonEdge pair__asset____a = (EMoflonEdge) result3_green[7];
				// EMoflonEdge assetToConumer__asset____source = (EMoflonEdge) result3_green[8];
				// EMoflonEdge asset__srcLocation____Location = (EMoflonEdge) result3_green[9];
				// EMoflonEdge srcLocation__asset____Assets = (EMoflonEdge) result3_green[10];

				// solve CSP
				Object[] result4_bindingAndBlack = LocationImpl.pattern_Location_2_4_solveCSP_bindingAndBlackFBBBBBBB(
						this, isApplicableMatch, consumer, srcLocation, assetToConumer, pair, asset);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = " + this + ", "
									+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[consumer] = " + consumer
									+ ", " + "[srcLocation] = " + srcLocation + ", " + "[assetToConumer] = "
									+ assetToConumer + ", " + "[pair] = " + pair + ", " + "[asset] = " + asset + ".");
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
	public void registerObjectsToMatch_FWD(Match match, gluemodel.CIM.IEC61968.Common.Location srcLocation,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset) {
		match.registerObject("srcLocation", srcLocation);
		match.registerObject("pair", pair);
		match.registerObject("asset", asset);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, gluemodel.CIM.IEC61968.Common.Location srcLocation,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, EnergyConsumer consumer,
			gluemodel.CIM.IEC61968.Common.Location srcLocation, MeterAssetToEnergyConsumer assetToConumer,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("consumer", consumer);
		isApplicableMatch.registerObject("srcLocation", srcLocation);
		isApplicableMatch.registerObject("assetToConumer", assetToConumer);
		isApplicableMatch.registerObject("pair", pair);
		isApplicableMatch.registerObject("asset", asset);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject consumer, EObject srcLocation,
			EObject srcLocationCorr, EObject assetToConumer, EObject trgLocation, EObject pair, EObject asset) {
		ruleresult.registerObject("consumer", consumer);
		ruleresult.registerObject("srcLocation", srcLocation);
		ruleresult.registerObject("srcLocationCorr", srcLocationCorr);
		ruleresult.registerObject("assetToConumer", assetToConumer);
		ruleresult.registerObject("trgLocation", trgLocation);
		ruleresult.registerObject("pair", pair);
		ruleresult.registerObject("asset", asset);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_0(EMoflonEdge _edge_Location) {
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
			gluemodel.CIM.IEC61968.Common.Location srcLocation = (gluemodel.CIM.IEC61968.Common.Location) result2_black[0];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_black[1];
			MeterAsset asset = (MeterAsset) result2_black[2];
			Object[] result2_green = LocationImpl.pattern_Location_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (LocationImpl.pattern_Location_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
					match, srcLocation, pair, asset)) {
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
	public boolean checkDEC_FWD(gluemodel.CIM.IEC61968.Common.Location srcLocation, MeterAssetPhysicalDevicePair pair,
			MeterAsset asset) {// match tgg pattern
		Object[] result1_black = LocationImpl.pattern_Location_13_1_matchtggpattern_blackBBB(srcLocation, pair, asset);
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
		case RulesPackage.LOCATION___IS_APPROPRIATE_FWD__MATCH_LOCATION_METERASSETPHYSICALDEVICEPAIR_METERASSET:
			return isAppropriate_FWD((Match) arguments.get(0),
					(gluemodel.CIM.IEC61968.Common.Location) arguments.get(1),
					(MeterAssetPhysicalDevicePair) arguments.get(2), (MeterAsset) arguments.get(3));
		case RulesPackage.LOCATION___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LOCATION___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.LOCATION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_LOCATION_METERASSETPHYSICALDEVICEPAIR_METERASSET:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(gluemodel.CIM.IEC61968.Common.Location) arguments.get(1),
					(MeterAssetPhysicalDevicePair) arguments.get(2), (MeterAsset) arguments.get(3));
			return null;
		case RulesPackage.LOCATION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_LOCATION_METERASSETPHYSICALDEVICEPAIR_METERASSET:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(gluemodel.CIM.IEC61968.Common.Location) arguments.get(1),
					(MeterAssetPhysicalDevicePair) arguments.get(2), (MeterAsset) arguments.get(3));
		case RulesPackage.LOCATION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LOCATION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ENERGYCONSUMER_LOCATION_METERASSETTOENERGYCONSUMER_METERASSETPHYSICALDEVICEPAIR_METERASSET:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (EnergyConsumer) arguments.get(1),
					(gluemodel.CIM.IEC61968.Common.Location) arguments.get(2),
					(MeterAssetToEnergyConsumer) arguments.get(3), (MeterAssetPhysicalDevicePair) arguments.get(4),
					(MeterAsset) arguments.get(5));
		case RulesPackage.LOCATION___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LOCATION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.LOCATION___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.LOCATION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_0__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_0((EMoflonEdge) arguments.get(0));
		case RulesPackage.LOCATION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.LOCATION___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.LOCATION___CHECK_DEC_FWD__LOCATION_METERASSETPHYSICALDEVICEPAIR_METERASSET:
			return checkDEC_FWD((gluemodel.CIM.IEC61968.Common.Location) arguments.get(0),
					(MeterAssetPhysicalDevicePair) arguments.get(1), (MeterAsset) arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_Location_0_1_initialbindings_blackBBBBB(Location _this, Match match,
			gluemodel.CIM.IEC61968.Common.Location srcLocation, MeterAssetPhysicalDevicePair pair, MeterAsset asset) {
		return new Object[] { _this, match, srcLocation, pair, asset };
	}

	public static final Object[] pattern_Location_0_2_SolveCSP_bindingFBBBBB(Location _this, Match match,
			gluemodel.CIM.IEC61968.Common.Location srcLocation, MeterAssetPhysicalDevicePair pair, MeterAsset asset) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, srcLocation, pair, asset);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, srcLocation, pair, asset };
		}
		return null;
	}

	public static final Object[] pattern_Location_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Location_0_2_SolveCSP_bindingAndBlackFBBBBB(Location _this, Match match,
			gluemodel.CIM.IEC61968.Common.Location srcLocation, MeterAssetPhysicalDevicePair pair, MeterAsset asset) {
		Object[] result_pattern_Location_0_2_SolveCSP_binding = pattern_Location_0_2_SolveCSP_bindingFBBBBB(_this,
				match, srcLocation, pair, asset);
		if (result_pattern_Location_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Location_0_2_SolveCSP_binding[0];

			Object[] result_pattern_Location_0_2_SolveCSP_black = pattern_Location_0_2_SolveCSP_blackB(csp);
			if (result_pattern_Location_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, srcLocation, pair, asset };
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
			gluemodel.CIM.IEC61968.Common.Location srcLocation, MeterAssetPhysicalDevicePair pair, MeterAsset asset) {
		return new Object[] { match, srcLocation, pair, asset };
	}

	public static final Object[] pattern_Location_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			gluemodel.CIM.IEC61968.Common.Location srcLocation, MeterAsset asset) {
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
		return new Object[] { match, srcLocation, asset, asset__srcLocation____Location, srcLocation__asset____Assets };
	}

	public static final Object[] pattern_Location_0_5_collectcontextelements_blackBBBB(Match match,
			gluemodel.CIM.IEC61968.Common.Location srcLocation, MeterAssetPhysicalDevicePair pair, MeterAsset asset) {
		return new Object[] { match, srcLocation, pair, asset };
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
			gluemodel.CIM.IEC61968.Common.Location srcLocation, MeterAssetPhysicalDevicePair pair, MeterAsset asset) {
		_this.registerObjectsToMatch_FWD(match, srcLocation, pair, asset);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("consumer");
		EObject _localVariable_1 = isApplicableMatch.getObject("srcLocation");
		EObject _localVariable_2 = isApplicableMatch.getObject("assetToConumer");
		EObject _localVariable_3 = isApplicableMatch.getObject("pair");
		EObject _localVariable_4 = isApplicableMatch.getObject("asset");
		EObject tmpConsumer = _localVariable_0;
		EObject tmpSrcLocation = _localVariable_1;
		EObject tmpAssetToConumer = _localVariable_2;
		EObject tmpPair = _localVariable_3;
		EObject tmpAsset = _localVariable_4;
		if (tmpConsumer instanceof EnergyConsumer) {
			EnergyConsumer consumer = (EnergyConsumer) tmpConsumer;
			if (tmpSrcLocation instanceof gluemodel.CIM.IEC61968.Common.Location) {
				gluemodel.CIM.IEC61968.Common.Location srcLocation = (gluemodel.CIM.IEC61968.Common.Location) tmpSrcLocation;
				if (tmpAssetToConumer instanceof MeterAssetToEnergyConsumer) {
					MeterAssetToEnergyConsumer assetToConumer = (MeterAssetToEnergyConsumer) tmpAssetToConumer;
					if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
						MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
						if (tmpAsset instanceof MeterAsset) {
							MeterAsset asset = (MeterAsset) tmpAsset;
							return new Object[] { consumer, srcLocation, assetToConumer, pair, asset,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Location_1_1_performtransformation_blackBBBBBFBB(EnergyConsumer consumer,
			gluemodel.CIM.IEC61968.Common.Location srcLocation, MeterAssetToEnergyConsumer assetToConumer,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset, Location _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { consumer, srcLocation, assetToConumer, pair, asset, csp, _this,
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
			EnergyConsumer consumer = (EnergyConsumer) result_pattern_Location_1_1_performtransformation_binding[0];
			gluemodel.CIM.IEC61968.Common.Location srcLocation = (gluemodel.CIM.IEC61968.Common.Location) result_pattern_Location_1_1_performtransformation_binding[1];
			MeterAssetToEnergyConsumer assetToConumer = (MeterAssetToEnergyConsumer) result_pattern_Location_1_1_performtransformation_binding[2];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result_pattern_Location_1_1_performtransformation_binding[3];
			MeterAsset asset = (MeterAsset) result_pattern_Location_1_1_performtransformation_binding[4];

			Object[] result_pattern_Location_1_1_performtransformation_black = pattern_Location_1_1_performtransformation_blackBBBBBFBB(
					consumer, srcLocation, assetToConumer, pair, asset, _this, isApplicableMatch);
			if (result_pattern_Location_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_Location_1_1_performtransformation_black[5];

				return new Object[] { consumer, srcLocation, assetToConumer, pair, asset, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Location_1_1_performtransformation_greenBBFF(EnergyConsumer consumer,
			gluemodel.CIM.IEC61968.Common.Location srcLocation) {
		LocationToLocation srcLocationCorr = Task1Factory.eINSTANCE.createLocationToLocation();
		outageDetectionJointarget.Location trgLocation = OutageDetectionJointargetFactory.eINSTANCE.createLocation();
		srcLocationCorr.setSource(srcLocation);
		srcLocationCorr.setTarget(trgLocation);
		consumer.setLocation(trgLocation);
		return new Object[] { consumer, srcLocation, srcLocationCorr, trgLocation };
	}

	public static final Object[] pattern_Location_1_2_collecttranslatedelements_blackBBB(
			gluemodel.CIM.IEC61968.Common.Location srcLocation, LocationToLocation srcLocationCorr,
			outageDetectionJointarget.Location trgLocation) {
		return new Object[] { srcLocation, srcLocationCorr, trgLocation };
	}

	public static final Object[] pattern_Location_1_2_collecttranslatedelements_greenFBBB(
			gluemodel.CIM.IEC61968.Common.Location srcLocation, LocationToLocation srcLocationCorr,
			outageDetectionJointarget.Location trgLocation) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(srcLocation);
		ruleresult.getCreatedLinkElements().add(srcLocationCorr);
		ruleresult.getCreatedElements().add(trgLocation);
		return new Object[] { ruleresult, srcLocation, srcLocationCorr, trgLocation };
	}

	public static final Object[] pattern_Location_1_3_bookkeepingforedges_blackBBBBBBBB(PerformRuleResult ruleresult,
			EObject consumer, EObject srcLocation, EObject srcLocationCorr, EObject assetToConumer, EObject trgLocation,
			EObject pair, EObject asset) {
		if (!consumer.equals(srcLocation)) {
			if (!consumer.equals(srcLocationCorr)) {
				if (!consumer.equals(trgLocation)) {
					if (!consumer.equals(pair)) {
						if (!srcLocation.equals(srcLocationCorr)) {
							if (!srcLocation.equals(trgLocation)) {
								if (!srcLocationCorr.equals(trgLocation)) {
									if (!assetToConumer.equals(consumer)) {
										if (!assetToConumer.equals(srcLocation)) {
											if (!assetToConumer.equals(srcLocationCorr)) {
												if (!assetToConumer.equals(trgLocation)) {
													if (!assetToConumer.equals(pair)) {
														if (!pair.equals(srcLocation)) {
															if (!pair.equals(srcLocationCorr)) {
																if (!pair.equals(trgLocation)) {
																	if (!asset.equals(consumer)) {
																		if (!asset.equals(srcLocation)) {
																			if (!asset.equals(srcLocationCorr)) {
																				if (!asset.equals(assetToConumer)) {
																					if (!asset.equals(trgLocation)) {
																						if (!asset.equals(pair)) {
																							return new Object[] {
																									ruleresult,
																									consumer,
																									srcLocation,
																									srcLocationCorr,
																									assetToConumer,
																									trgLocation, pair,
																									asset };
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
			EObject consumer, EObject srcLocation, EObject srcLocationCorr, EObject trgLocation, EObject asset) {
		EMoflonEdge srcLocationCorr__trgLocation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge consumer__trgLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocationCorr__srcLocation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge asset__srcLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocation__asset____Assets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Location";
		String srcLocationCorr__trgLocation____target_name_prime = "target";
		String consumer__trgLocation____Location_name_prime = "Location";
		String srcLocationCorr__srcLocation____source_name_prime = "source";
		String asset__srcLocation____Location_name_prime = "Location";
		String srcLocation__asset____Assets_name_prime = "Assets";
		srcLocationCorr__trgLocation____target.setSrc(srcLocationCorr);
		srcLocationCorr__trgLocation____target.setTrg(trgLocation);
		ruleresult.getCreatedEdges().add(srcLocationCorr__trgLocation____target);
		consumer__trgLocation____Location.setSrc(consumer);
		consumer__trgLocation____Location.setTrg(trgLocation);
		ruleresult.getCreatedEdges().add(consumer__trgLocation____Location);
		srcLocationCorr__srcLocation____source.setSrc(srcLocationCorr);
		srcLocationCorr__srcLocation____source.setTrg(srcLocation);
		ruleresult.getCreatedEdges().add(srcLocationCorr__srcLocation____source);
		asset__srcLocation____Location.setSrc(asset);
		asset__srcLocation____Location.setTrg(srcLocation);
		ruleresult.getTranslatedEdges().add(asset__srcLocation____Location);
		srcLocation__asset____Assets.setSrc(srcLocation);
		srcLocation__asset____Assets.setTrg(asset);
		ruleresult.getTranslatedEdges().add(srcLocation__asset____Assets);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		srcLocationCorr__trgLocation____target.setName(srcLocationCorr__trgLocation____target_name_prime);
		consumer__trgLocation____Location.setName(consumer__trgLocation____Location_name_prime);
		srcLocationCorr__srcLocation____source.setName(srcLocationCorr__srcLocation____source_name_prime);
		asset__srcLocation____Location.setName(asset__srcLocation____Location_name_prime);
		srcLocation__asset____Assets.setName(srcLocation__asset____Assets_name_prime);
		return new Object[] { ruleresult, consumer, srcLocation, srcLocationCorr, trgLocation, asset,
				srcLocationCorr__trgLocation____target, consumer__trgLocation____Location,
				srcLocationCorr__srcLocation____source, asset__srcLocation____Location, srcLocation__asset____Assets };
	}

	public static final void pattern_Location_1_5_registerobjects_expressionBBBBBBBBB(Location _this,
			PerformRuleResult ruleresult, EObject consumer, EObject srcLocation, EObject srcLocationCorr,
			EObject assetToConumer, EObject trgLocation, EObject pair, EObject asset) {
		_this.registerObjects_FWD(ruleresult, consumer, srcLocation, srcLocationCorr, assetToConumer, trgLocation, pair,
				asset);

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
		EObject _localVariable_0 = match.getObject("srcLocation");
		EObject _localVariable_1 = match.getObject("pair");
		EObject _localVariable_2 = match.getObject("asset");
		EObject tmpSrcLocation = _localVariable_0;
		EObject tmpPair = _localVariable_1;
		EObject tmpAsset = _localVariable_2;
		if (tmpSrcLocation instanceof gluemodel.CIM.IEC61968.Common.Location) {
			gluemodel.CIM.IEC61968.Common.Location srcLocation = (gluemodel.CIM.IEC61968.Common.Location) tmpSrcLocation;
			if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
				MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
				if (tmpAsset instanceof MeterAsset) {
					MeterAsset asset = (MeterAsset) tmpAsset;
					return new Object[] { srcLocation, pair, asset, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Location_2_2_corematch_blackFBFBBB(
			gluemodel.CIM.IEC61968.Common.Location srcLocation, MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MeterAssetToEnergyConsumer assetToConumer : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(asset, MeterAssetToEnergyConsumer.class, "source")) {
			EnergyConsumer consumer = assetToConumer.getTarget();
			if (consumer != null) {
				_result.add(new Object[] { consumer, srcLocation, assetToConumer, pair, asset, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Location_2_3_findcontext_blackBBBBB(EnergyConsumer consumer,
			gluemodel.CIM.IEC61968.Common.Location srcLocation, MeterAssetToEnergyConsumer assetToConumer,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (consumer.equals(assetToConumer.getTarget())) {
			if (asset.equals(pair.getA())) {
				if (asset.equals(assetToConumer.getSource())) {
					if (srcLocation.equals(asset.getLocation())) {
						_result.add(new Object[] { consumer, srcLocation, assetToConumer, pair, asset });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Location_2_3_findcontext_greenBBBBBFFFFFF(EnergyConsumer consumer,
			gluemodel.CIM.IEC61968.Common.Location srcLocation, MeterAssetToEnergyConsumer assetToConumer,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge assetToConumer__consumer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge assetToConumer__asset____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge asset__srcLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocation__asset____Assets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String assetToConumer__consumer____target_name_prime = "target";
		String pair__asset____a_name_prime = "a";
		String assetToConumer__asset____source_name_prime = "source";
		String asset__srcLocation____Location_name_prime = "Location";
		String srcLocation__asset____Assets_name_prime = "Assets";
		isApplicableMatch.getAllContextElements().add(consumer);
		isApplicableMatch.getAllContextElements().add(srcLocation);
		isApplicableMatch.getAllContextElements().add(assetToConumer);
		isApplicableMatch.getAllContextElements().add(pair);
		isApplicableMatch.getAllContextElements().add(asset);
		assetToConumer__consumer____target.setSrc(assetToConumer);
		assetToConumer__consumer____target.setTrg(consumer);
		isApplicableMatch.getAllContextElements().add(assetToConumer__consumer____target);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(pair__asset____a);
		assetToConumer__asset____source.setSrc(assetToConumer);
		assetToConumer__asset____source.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(assetToConumer__asset____source);
		asset__srcLocation____Location.setSrc(asset);
		asset__srcLocation____Location.setTrg(srcLocation);
		isApplicableMatch.getAllContextElements().add(asset__srcLocation____Location);
		srcLocation__asset____Assets.setSrc(srcLocation);
		srcLocation__asset____Assets.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(srcLocation__asset____Assets);
		assetToConumer__consumer____target.setName(assetToConumer__consumer____target_name_prime);
		pair__asset____a.setName(pair__asset____a_name_prime);
		assetToConumer__asset____source.setName(assetToConumer__asset____source_name_prime);
		asset__srcLocation____Location.setName(asset__srcLocation____Location_name_prime);
		srcLocation__asset____Assets.setName(srcLocation__asset____Assets_name_prime);
		return new Object[] { consumer, srcLocation, assetToConumer, pair, asset, isApplicableMatch,
				assetToConumer__consumer____target, pair__asset____a, assetToConumer__asset____source,
				asset__srcLocation____Location, srcLocation__asset____Assets };
	}

	public static final Object[] pattern_Location_2_4_solveCSP_bindingFBBBBBBB(Location _this,
			IsApplicableMatch isApplicableMatch, EnergyConsumer consumer,
			gluemodel.CIM.IEC61968.Common.Location srcLocation, MeterAssetToEnergyConsumer assetToConumer,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, consumer, srcLocation, assetToConumer,
				pair, asset);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, consumer, srcLocation, assetToConumer, pair, asset };
		}
		return null;
	}

	public static final Object[] pattern_Location_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Location_2_4_solveCSP_bindingAndBlackFBBBBBBB(Location _this,
			IsApplicableMatch isApplicableMatch, EnergyConsumer consumer,
			gluemodel.CIM.IEC61968.Common.Location srcLocation, MeterAssetToEnergyConsumer assetToConumer,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset) {
		Object[] result_pattern_Location_2_4_solveCSP_binding = pattern_Location_2_4_solveCSP_bindingFBBBBBBB(_this,
				isApplicableMatch, consumer, srcLocation, assetToConumer, pair, asset);
		if (result_pattern_Location_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Location_2_4_solveCSP_binding[0];

			Object[] result_pattern_Location_2_4_solveCSP_black = pattern_Location_2_4_solveCSP_blackB(csp);
			if (result_pattern_Location_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, consumer, srcLocation, assetToConumer, pair,
						asset };
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
						_result.add(new Object[] { srcLocation, pair, asset, _edge_Location });
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
			Location _this, Match match, gluemodel.CIM.IEC61968.Common.Location srcLocation,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, srcLocation, pair, asset);
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

	public static final Object[] pattern_Location_13_1_matchtggpattern_blackBBB(
			gluemodel.CIM.IEC61968.Common.Location srcLocation, MeterAssetPhysicalDevicePair pair, MeterAsset asset) {
		if (asset.equals(pair.getA())) {
			if (srcLocation.equals(asset.getLocation())) {
				return new Object[] { srcLocation, pair, asset };
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
