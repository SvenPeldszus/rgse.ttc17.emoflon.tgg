/**
 */
package rgse.ttc17.emoflon.tgg.task2.Rules.impl;

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
import outagePreventionJointarget.PMUVoltageMeter;

import rgse.ttc17.emoflon.tgg.task2.LocationToLocation;
import rgse.ttc17.emoflon.tgg.task2.MeterAssetToPMUVoltageMeter;

import rgse.ttc17.emoflon.tgg.task2.Rules.Location;
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
	public boolean isAppropriate_FWD(Match match, MeterAsset asset, MeterAssetMMXUPair pair,
			gluemodel.CIM.IEC61968.Common.Location srcLocation) {
		// initial bindings
		Object[] result1_black = LocationImpl.pattern_Location_0_1_initialbindings_blackBBBBB(this, match, asset, pair,
				srcLocation);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[asset] = " + asset + ", "
					+ "[pair] = " + pair + ", " + "[srcLocation] = " + srcLocation + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = LocationImpl.pattern_Location_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match,
				asset, pair, srcLocation);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[asset] = " + asset + ", " + "[pair] = " + pair
					+ ", " + "[srcLocation] = " + srcLocation + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (LocationImpl.pattern_Location_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = LocationImpl.pattern_Location_0_4_collectelementstobetranslated_blackBBBB(match,
					asset, pair, srcLocation);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[asset] = " + asset + ", " + "[pair] = "
						+ pair + ", " + "[srcLocation] = " + srcLocation + ".");
			}
			LocationImpl.pattern_Location_0_4_collectelementstobetranslated_greenBBBFF(match, asset, srcLocation);
			// EMoflonEdge asset__srcLocation____Location = (EMoflonEdge) result4_green[3];
			// EMoflonEdge srcLocation__asset____Assets = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = LocationImpl.pattern_Location_0_5_collectcontextelements_blackBBBB(match, asset,
					pair, srcLocation);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[asset] = " + asset + ", " + "[pair] = "
						+ pair + ", " + "[srcLocation] = " + srcLocation + ".");
			}
			LocationImpl.pattern_Location_0_5_collectcontextelements_greenBBBF(match, asset, pair);
			// EMoflonEdge pair__asset____a = (EMoflonEdge) result5_green[3];

			// register objects to match
			LocationImpl.pattern_Location_0_6_registerobjectstomatch_expressionBBBBB(this, match, asset, pair,
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
		MeterAsset asset = (MeterAsset) result1_bindingAndBlack[0];
		MeterAssetToPMUVoltageMeter assetToPMU = (MeterAssetToPMUVoltageMeter) result1_bindingAndBlack[1];
		MeterAssetMMXUPair pair = (MeterAssetMMXUPair) result1_bindingAndBlack[2];
		gluemodel.CIM.IEC61968.Common.Location srcLocation = (gluemodel.CIM.IEC61968.Common.Location) result1_bindingAndBlack[3];
		PMUVoltageMeter consumer = (PMUVoltageMeter) result1_bindingAndBlack[4];
		// CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = LocationImpl.pattern_Location_1_1_performtransformation_greenFBFB(srcLocation,
				consumer);
		LocationToLocation locationCorr = (LocationToLocation) result1_green[0];
		outagePreventionJointarget.Location trgLocation = (outagePreventionJointarget.Location) result1_green[2];

		// collect translated elements
		Object[] result2_black = LocationImpl.pattern_Location_1_2_collecttranslatedelements_blackBBB(locationCorr,
				srcLocation, trgLocation);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[locationCorr] = " + locationCorr + ", " + "[srcLocation] = " + srcLocation + ", "
					+ "[trgLocation] = " + trgLocation + ".");
		}
		Object[] result2_green = LocationImpl.pattern_Location_1_2_collecttranslatedelements_greenFBBB(locationCorr,
				srcLocation, trgLocation);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = LocationImpl.pattern_Location_1_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, asset,
				assetToPMU, locationCorr, pair, srcLocation, trgLocation, consumer);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[asset] = " + asset + ", " + "[assetToPMU] = "
					+ assetToPMU + ", " + "[locationCorr] = " + locationCorr + ", " + "[pair] = " + pair + ", "
					+ "[srcLocation] = " + srcLocation + ", " + "[trgLocation] = " + trgLocation + ", "
					+ "[consumer] = " + consumer + ".");
		}
		LocationImpl.pattern_Location_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, asset, locationCorr,
				srcLocation, trgLocation, consumer);
		// EMoflonEdge locationCorr__srcLocation____source = (EMoflonEdge) result3_green[6];
		// EMoflonEdge locationCorr__trgLocation____target = (EMoflonEdge) result3_green[7];
		// EMoflonEdge asset__srcLocation____Location = (EMoflonEdge) result3_green[8];
		// EMoflonEdge srcLocation__asset____Assets = (EMoflonEdge) result3_green[9];
		// EMoflonEdge consumer__trgLocation____Location = (EMoflonEdge) result3_green[10];

		// perform postprocessing story node is empty
		// register objects
		LocationImpl.pattern_Location_1_5_registerobjects_expressionBBBBBBBBB(this, ruleresult, asset, assetToPMU,
				locationCorr, pair, srcLocation, trgLocation, consumer);
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
		MeterAsset asset = (MeterAsset) result2_binding[0];
		MeterAssetMMXUPair pair = (MeterAssetMMXUPair) result2_binding[1];
		gluemodel.CIM.IEC61968.Common.Location srcLocation = (gluemodel.CIM.IEC61968.Common.Location) result2_binding[2];
		for (Object[] result2_black : LocationImpl.pattern_Location_2_2_corematch_blackBFBBFB(asset, pair, srcLocation,
				match)) {
			MeterAssetToPMUVoltageMeter assetToPMU = (MeterAssetToPMUVoltageMeter) result2_black[1];
			PMUVoltageMeter consumer = (PMUVoltageMeter) result2_black[4];
			// ForEach find context
			for (Object[] result3_black : LocationImpl.pattern_Location_2_3_findcontext_blackBBBBB(asset, assetToPMU,
					pair, srcLocation, consumer)) {
				Object[] result3_green = LocationImpl.pattern_Location_2_3_findcontext_greenBBBBBFFFFFF(asset,
						assetToPMU, pair, srcLocation, consumer);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				// EMoflonEdge assetToPMU__asset____source = (EMoflonEdge) result3_green[6];
				// EMoflonEdge pair__asset____a = (EMoflonEdge) result3_green[7];
				// EMoflonEdge asset__srcLocation____Location = (EMoflonEdge) result3_green[8];
				// EMoflonEdge srcLocation__asset____Assets = (EMoflonEdge) result3_green[9];
				// EMoflonEdge assetToPMU__consumer____target = (EMoflonEdge) result3_green[10];

				// solve CSP
				Object[] result4_bindingAndBlack = LocationImpl.pattern_Location_2_4_solveCSP_bindingAndBlackFBBBBBBB(
						this, isApplicableMatch, asset, assetToPMU, pair, srcLocation, consumer);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[asset] = " + asset + ", " + "[assetToPMU] = " + assetToPMU + ", " + "[pair] = " + pair
							+ ", " + "[srcLocation] = " + srcLocation + ", " + "[consumer] = " + consumer + ".");
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
	public void registerObjectsToMatch_FWD(Match match, MeterAsset asset, MeterAssetMMXUPair pair,
			gluemodel.CIM.IEC61968.Common.Location srcLocation) {
		match.registerObject("asset", asset);
		match.registerObject("pair", pair);
		match.registerObject("srcLocation", srcLocation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MeterAsset asset, MeterAssetMMXUPair pair,
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MeterAsset asset,
			MeterAssetToPMUVoltageMeter assetToPMU, MeterAssetMMXUPair pair,
			gluemodel.CIM.IEC61968.Common.Location srcLocation, PMUVoltageMeter consumer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("asset", asset);
		isApplicableMatch.registerObject("assetToPMU", assetToPMU);
		isApplicableMatch.registerObject("pair", pair);
		isApplicableMatch.registerObject("srcLocation", srcLocation);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject asset, EObject assetToPMU,
			EObject locationCorr, EObject pair, EObject srcLocation, EObject trgLocation, EObject consumer) {
		ruleresult.registerObject("asset", asset);
		ruleresult.registerObject("assetToPMU", assetToPMU);
		ruleresult.registerObject("locationCorr", locationCorr);
		ruleresult.registerObject("pair", pair);
		ruleresult.registerObject("srcLocation", srcLocation);
		ruleresult.registerObject("trgLocation", trgLocation);
		ruleresult.registerObject("consumer", consumer);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_44(EMoflonEdge _edge_Location) {
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
			MeterAsset asset = (MeterAsset) result2_black[0];
			MeterAssetMMXUPair pair = (MeterAssetMMXUPair) result2_black[1];
			gluemodel.CIM.IEC61968.Common.Location srcLocation = (gluemodel.CIM.IEC61968.Common.Location) result2_black[2];
			Object[] result2_green = LocationImpl.pattern_Location_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (LocationImpl.pattern_Location_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
					match, asset, pair, srcLocation)) {
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
	public boolean checkDEC_FWD(MeterAsset asset, MeterAssetMMXUPair pair,
			gluemodel.CIM.IEC61968.Common.Location srcLocation) {// match tgg pattern
		Object[] result1_black = LocationImpl.pattern_Location_13_1_matchtggpattern_blackBBB(asset, pair, srcLocation);
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
		case RulesPackage.LOCATION___IS_APPROPRIATE_FWD__MATCH_METERASSET_METERASSETMMXUPAIR_LOCATION:
			return isAppropriate_FWD((Match) arguments.get(0), (MeterAsset) arguments.get(1),
					(MeterAssetMMXUPair) arguments.get(2), (gluemodel.CIM.IEC61968.Common.Location) arguments.get(3));
		case RulesPackage.LOCATION___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LOCATION___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.LOCATION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_METERASSET_METERASSETMMXUPAIR_LOCATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MeterAsset) arguments.get(1),
					(MeterAssetMMXUPair) arguments.get(2), (gluemodel.CIM.IEC61968.Common.Location) arguments.get(3));
			return null;
		case RulesPackage.LOCATION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_METERASSET_METERASSETMMXUPAIR_LOCATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MeterAsset) arguments.get(1),
					(MeterAssetMMXUPair) arguments.get(2), (gluemodel.CIM.IEC61968.Common.Location) arguments.get(3));
		case RulesPackage.LOCATION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LOCATION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_METERASSET_METERASSETTOPMUVOLTAGEMETER_METERASSETMMXUPAIR_LOCATION_PMUVOLTAGEMETER:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MeterAsset) arguments.get(1),
					(MeterAssetToPMUVoltageMeter) arguments.get(2), (MeterAssetMMXUPair) arguments.get(3),
					(gluemodel.CIM.IEC61968.Common.Location) arguments.get(4), (PMUVoltageMeter) arguments.get(5));
		case RulesPackage.LOCATION___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LOCATION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.LOCATION___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.LOCATION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_44__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_44((EMoflonEdge) arguments.get(0));
		case RulesPackage.LOCATION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.LOCATION___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.LOCATION___CHECK_DEC_FWD__METERASSET_METERASSETMMXUPAIR_LOCATION:
			return checkDEC_FWD((MeterAsset) arguments.get(0), (MeterAssetMMXUPair) arguments.get(1),
					(gluemodel.CIM.IEC61968.Common.Location) arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_Location_0_1_initialbindings_blackBBBBB(Location _this, Match match,
			MeterAsset asset, MeterAssetMMXUPair pair, gluemodel.CIM.IEC61968.Common.Location srcLocation) {
		return new Object[] { _this, match, asset, pair, srcLocation };
	}

	public static final Object[] pattern_Location_0_2_SolveCSP_bindingFBBBBB(Location _this, Match match,
			MeterAsset asset, MeterAssetMMXUPair pair, gluemodel.CIM.IEC61968.Common.Location srcLocation) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, asset, pair, srcLocation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, asset, pair, srcLocation };
		}
		return null;
	}

	public static final Object[] pattern_Location_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Location_0_2_SolveCSP_bindingAndBlackFBBBBB(Location _this, Match match,
			MeterAsset asset, MeterAssetMMXUPair pair, gluemodel.CIM.IEC61968.Common.Location srcLocation) {
		Object[] result_pattern_Location_0_2_SolveCSP_binding = pattern_Location_0_2_SolveCSP_bindingFBBBBB(_this,
				match, asset, pair, srcLocation);
		if (result_pattern_Location_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Location_0_2_SolveCSP_binding[0];

			Object[] result_pattern_Location_0_2_SolveCSP_black = pattern_Location_0_2_SolveCSP_blackB(csp);
			if (result_pattern_Location_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, asset, pair, srcLocation };
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
			MeterAsset asset, MeterAssetMMXUPair pair, gluemodel.CIM.IEC61968.Common.Location srcLocation) {
		return new Object[] { match, asset, pair, srcLocation };
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

	public static final Object[] pattern_Location_0_5_collectcontextelements_blackBBBB(Match match, MeterAsset asset,
			MeterAssetMMXUPair pair, gluemodel.CIM.IEC61968.Common.Location srcLocation) {
		return new Object[] { match, asset, pair, srcLocation };
	}

	public static final Object[] pattern_Location_0_5_collectcontextelements_greenBBBF(Match match, MeterAsset asset,
			MeterAssetMMXUPair pair) {
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(asset);
		match.getContextNodes().add(pair);
		String pair__asset____a_name_prime = "a";
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		match.getContextEdges().add(pair__asset____a);
		pair__asset____a.setName(pair__asset____a_name_prime);
		return new Object[] { match, asset, pair, pair__asset____a };
	}

	public static final void pattern_Location_0_6_registerobjectstomatch_expressionBBBBB(Location _this, Match match,
			MeterAsset asset, MeterAssetMMXUPair pair, gluemodel.CIM.IEC61968.Common.Location srcLocation) {
		_this.registerObjectsToMatch_FWD(match, asset, pair, srcLocation);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("asset");
		EObject _localVariable_1 = isApplicableMatch.getObject("assetToPMU");
		EObject _localVariable_2 = isApplicableMatch.getObject("pair");
		EObject _localVariable_3 = isApplicableMatch.getObject("srcLocation");
		EObject _localVariable_4 = isApplicableMatch.getObject("consumer");
		EObject tmpAsset = _localVariable_0;
		EObject tmpAssetToPMU = _localVariable_1;
		EObject tmpPair = _localVariable_2;
		EObject tmpSrcLocation = _localVariable_3;
		EObject tmpConsumer = _localVariable_4;
		if (tmpAsset instanceof MeterAsset) {
			MeterAsset asset = (MeterAsset) tmpAsset;
			if (tmpAssetToPMU instanceof MeterAssetToPMUVoltageMeter) {
				MeterAssetToPMUVoltageMeter assetToPMU = (MeterAssetToPMUVoltageMeter) tmpAssetToPMU;
				if (tmpPair instanceof MeterAssetMMXUPair) {
					MeterAssetMMXUPair pair = (MeterAssetMMXUPair) tmpPair;
					if (tmpSrcLocation instanceof gluemodel.CIM.IEC61968.Common.Location) {
						gluemodel.CIM.IEC61968.Common.Location srcLocation = (gluemodel.CIM.IEC61968.Common.Location) tmpSrcLocation;
						if (tmpConsumer instanceof PMUVoltageMeter) {
							PMUVoltageMeter consumer = (PMUVoltageMeter) tmpConsumer;
							return new Object[] { asset, assetToPMU, pair, srcLocation, consumer, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Location_1_1_performtransformation_blackBBBBBFBB(MeterAsset asset,
			MeterAssetToPMUVoltageMeter assetToPMU, MeterAssetMMXUPair pair,
			gluemodel.CIM.IEC61968.Common.Location srcLocation, PMUVoltageMeter consumer, Location _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { asset, assetToPMU, pair, srcLocation, consumer, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Location_1_1_performtransformation_bindingAndBlackFFFFFFBB(Location _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Location_1_1_performtransformation_binding = pattern_Location_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_Location_1_1_performtransformation_binding != null) {
			MeterAsset asset = (MeterAsset) result_pattern_Location_1_1_performtransformation_binding[0];
			MeterAssetToPMUVoltageMeter assetToPMU = (MeterAssetToPMUVoltageMeter) result_pattern_Location_1_1_performtransformation_binding[1];
			MeterAssetMMXUPair pair = (MeterAssetMMXUPair) result_pattern_Location_1_1_performtransformation_binding[2];
			gluemodel.CIM.IEC61968.Common.Location srcLocation = (gluemodel.CIM.IEC61968.Common.Location) result_pattern_Location_1_1_performtransformation_binding[3];
			PMUVoltageMeter consumer = (PMUVoltageMeter) result_pattern_Location_1_1_performtransformation_binding[4];

			Object[] result_pattern_Location_1_1_performtransformation_black = pattern_Location_1_1_performtransformation_blackBBBBBFBB(
					asset, assetToPMU, pair, srcLocation, consumer, _this, isApplicableMatch);
			if (result_pattern_Location_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_Location_1_1_performtransformation_black[5];

				return new Object[] { asset, assetToPMU, pair, srcLocation, consumer, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Location_1_1_performtransformation_greenFBFB(
			gluemodel.CIM.IEC61968.Common.Location srcLocation, PMUVoltageMeter consumer) {
		LocationToLocation locationCorr = Task2Factory.eINSTANCE.createLocationToLocation();
		outagePreventionJointarget.Location trgLocation = OutagePreventionJointargetFactory.eINSTANCE.createLocation();
		locationCorr.setSource(srcLocation);
		locationCorr.setTarget(trgLocation);
		consumer.setLocation(trgLocation);
		return new Object[] { locationCorr, srcLocation, trgLocation, consumer };
	}

	public static final Object[] pattern_Location_1_2_collecttranslatedelements_blackBBB(
			LocationToLocation locationCorr, gluemodel.CIM.IEC61968.Common.Location srcLocation,
			outagePreventionJointarget.Location trgLocation) {
		return new Object[] { locationCorr, srcLocation, trgLocation };
	}

	public static final Object[] pattern_Location_1_2_collecttranslatedelements_greenFBBB(
			LocationToLocation locationCorr, gluemodel.CIM.IEC61968.Common.Location srcLocation,
			outagePreventionJointarget.Location trgLocation) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(locationCorr);
		ruleresult.getTranslatedElements().add(srcLocation);
		ruleresult.getCreatedElements().add(trgLocation);
		return new Object[] { ruleresult, locationCorr, srcLocation, trgLocation };
	}

	public static final Object[] pattern_Location_1_3_bookkeepingforedges_blackBBBBBBBB(PerformRuleResult ruleresult,
			EObject asset, EObject assetToPMU, EObject locationCorr, EObject pair, EObject srcLocation,
			EObject trgLocation, EObject consumer) {
		if (!asset.equals(assetToPMU)) {
			if (!asset.equals(locationCorr)) {
				if (!asset.equals(pair)) {
					if (!asset.equals(srcLocation)) {
						if (!asset.equals(trgLocation)) {
							if (!asset.equals(consumer)) {
								if (!assetToPMU.equals(locationCorr)) {
									if (!assetToPMU.equals(pair)) {
										if (!assetToPMU.equals(srcLocation)) {
											if (!assetToPMU.equals(trgLocation)) {
												if (!assetToPMU.equals(consumer)) {
													if (!locationCorr.equals(pair)) {
														if (!locationCorr.equals(srcLocation)) {
															if (!locationCorr.equals(trgLocation)) {
																if (!pair.equals(srcLocation)) {
																	if (!pair.equals(trgLocation)) {
																		if (!srcLocation.equals(trgLocation)) {
																			if (!consumer.equals(locationCorr)) {
																				if (!consumer.equals(pair)) {
																					if (!consumer.equals(srcLocation)) {
																						if (!consumer
																								.equals(trgLocation)) {
																							return new Object[] {
																									ruleresult, asset,
																									assetToPMU,
																									locationCorr, pair,
																									srcLocation,
																									trgLocation,
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

	public static final Object[] pattern_Location_1_3_bookkeepingforedges_greenBBBBBBFFFFF(PerformRuleResult ruleresult,
			EObject asset, EObject locationCorr, EObject srcLocation, EObject trgLocation, EObject consumer) {
		EMoflonEdge locationCorr__srcLocation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge locationCorr__trgLocation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge asset__srcLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocation__asset____Assets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge consumer__trgLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Location";
		String locationCorr__srcLocation____source_name_prime = "source";
		String locationCorr__trgLocation____target_name_prime = "target";
		String asset__srcLocation____Location_name_prime = "Location";
		String srcLocation__asset____Assets_name_prime = "Assets";
		String consumer__trgLocation____Location_name_prime = "Location";
		locationCorr__srcLocation____source.setSrc(locationCorr);
		locationCorr__srcLocation____source.setTrg(srcLocation);
		ruleresult.getCreatedEdges().add(locationCorr__srcLocation____source);
		locationCorr__trgLocation____target.setSrc(locationCorr);
		locationCorr__trgLocation____target.setTrg(trgLocation);
		ruleresult.getCreatedEdges().add(locationCorr__trgLocation____target);
		asset__srcLocation____Location.setSrc(asset);
		asset__srcLocation____Location.setTrg(srcLocation);
		ruleresult.getTranslatedEdges().add(asset__srcLocation____Location);
		srcLocation__asset____Assets.setSrc(srcLocation);
		srcLocation__asset____Assets.setTrg(asset);
		ruleresult.getTranslatedEdges().add(srcLocation__asset____Assets);
		consumer__trgLocation____Location.setSrc(consumer);
		consumer__trgLocation____Location.setTrg(trgLocation);
		ruleresult.getCreatedEdges().add(consumer__trgLocation____Location);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		locationCorr__srcLocation____source.setName(locationCorr__srcLocation____source_name_prime);
		locationCorr__trgLocation____target.setName(locationCorr__trgLocation____target_name_prime);
		asset__srcLocation____Location.setName(asset__srcLocation____Location_name_prime);
		srcLocation__asset____Assets.setName(srcLocation__asset____Assets_name_prime);
		consumer__trgLocation____Location.setName(consumer__trgLocation____Location_name_prime);
		return new Object[] { ruleresult, asset, locationCorr, srcLocation, trgLocation, consumer,
				locationCorr__srcLocation____source, locationCorr__trgLocation____target,
				asset__srcLocation____Location, srcLocation__asset____Assets, consumer__trgLocation____Location };
	}

	public static final void pattern_Location_1_5_registerobjects_expressionBBBBBBBBB(Location _this,
			PerformRuleResult ruleresult, EObject asset, EObject assetToPMU, EObject locationCorr, EObject pair,
			EObject srcLocation, EObject trgLocation, EObject consumer) {
		_this.registerObjects_FWD(ruleresult, asset, assetToPMU, locationCorr, pair, srcLocation, trgLocation,
				consumer);

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
		EObject _localVariable_0 = match.getObject("asset");
		EObject _localVariable_1 = match.getObject("pair");
		EObject _localVariable_2 = match.getObject("srcLocation");
		EObject tmpAsset = _localVariable_0;
		EObject tmpPair = _localVariable_1;
		EObject tmpSrcLocation = _localVariable_2;
		if (tmpAsset instanceof MeterAsset) {
			MeterAsset asset = (MeterAsset) tmpAsset;
			if (tmpPair instanceof MeterAssetMMXUPair) {
				MeterAssetMMXUPair pair = (MeterAssetMMXUPair) tmpPair;
				if (tmpSrcLocation instanceof gluemodel.CIM.IEC61968.Common.Location) {
					gluemodel.CIM.IEC61968.Common.Location srcLocation = (gluemodel.CIM.IEC61968.Common.Location) tmpSrcLocation;
					return new Object[] { asset, pair, srcLocation, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Location_2_2_corematch_blackBFBBFB(MeterAsset asset,
			MeterAssetMMXUPair pair, gluemodel.CIM.IEC61968.Common.Location srcLocation, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MeterAssetToPMUVoltageMeter assetToPMU : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(asset, MeterAssetToPMUVoltageMeter.class, "source")) {
			PMUVoltageMeter consumer = assetToPMU.getTarget();
			if (consumer != null) {
				_result.add(new Object[] { asset, assetToPMU, pair, srcLocation, consumer, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Location_2_3_findcontext_blackBBBBB(MeterAsset asset,
			MeterAssetToPMUVoltageMeter assetToPMU, MeterAssetMMXUPair pair,
			gluemodel.CIM.IEC61968.Common.Location srcLocation, PMUVoltageMeter consumer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (asset.equals(assetToPMU.getSource())) {
			if (asset.equals(pair.getA())) {
				if (srcLocation.equals(asset.getLocation())) {
					if (consumer.equals(assetToPMU.getTarget())) {
						_result.add(new Object[] { asset, assetToPMU, pair, srcLocation, consumer });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Location_2_3_findcontext_greenBBBBBFFFFFF(MeterAsset asset,
			MeterAssetToPMUVoltageMeter assetToPMU, MeterAssetMMXUPair pair,
			gluemodel.CIM.IEC61968.Common.Location srcLocation, PMUVoltageMeter consumer) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge assetToPMU__asset____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge asset__srcLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocation__asset____Assets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge assetToPMU__consumer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String assetToPMU__asset____source_name_prime = "source";
		String pair__asset____a_name_prime = "a";
		String asset__srcLocation____Location_name_prime = "Location";
		String srcLocation__asset____Assets_name_prime = "Assets";
		String assetToPMU__consumer____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(asset);
		isApplicableMatch.getAllContextElements().add(assetToPMU);
		isApplicableMatch.getAllContextElements().add(pair);
		isApplicableMatch.getAllContextElements().add(srcLocation);
		isApplicableMatch.getAllContextElements().add(consumer);
		assetToPMU__asset____source.setSrc(assetToPMU);
		assetToPMU__asset____source.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(assetToPMU__asset____source);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(pair__asset____a);
		asset__srcLocation____Location.setSrc(asset);
		asset__srcLocation____Location.setTrg(srcLocation);
		isApplicableMatch.getAllContextElements().add(asset__srcLocation____Location);
		srcLocation__asset____Assets.setSrc(srcLocation);
		srcLocation__asset____Assets.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(srcLocation__asset____Assets);
		assetToPMU__consumer____target.setSrc(assetToPMU);
		assetToPMU__consumer____target.setTrg(consumer);
		isApplicableMatch.getAllContextElements().add(assetToPMU__consumer____target);
		assetToPMU__asset____source.setName(assetToPMU__asset____source_name_prime);
		pair__asset____a.setName(pair__asset____a_name_prime);
		asset__srcLocation____Location.setName(asset__srcLocation____Location_name_prime);
		srcLocation__asset____Assets.setName(srcLocation__asset____Assets_name_prime);
		assetToPMU__consumer____target.setName(assetToPMU__consumer____target_name_prime);
		return new Object[] { asset, assetToPMU, pair, srcLocation, consumer, isApplicableMatch,
				assetToPMU__asset____source, pair__asset____a, asset__srcLocation____Location,
				srcLocation__asset____Assets, assetToPMU__consumer____target };
	}

	public static final Object[] pattern_Location_2_4_solveCSP_bindingFBBBBBBB(Location _this,
			IsApplicableMatch isApplicableMatch, MeterAsset asset, MeterAssetToPMUVoltageMeter assetToPMU,
			MeterAssetMMXUPair pair, gluemodel.CIM.IEC61968.Common.Location srcLocation, PMUVoltageMeter consumer) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, asset, assetToPMU, pair, srcLocation,
				consumer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, asset, assetToPMU, pair, srcLocation, consumer };
		}
		return null;
	}

	public static final Object[] pattern_Location_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Location_2_4_solveCSP_bindingAndBlackFBBBBBBB(Location _this,
			IsApplicableMatch isApplicableMatch, MeterAsset asset, MeterAssetToPMUVoltageMeter assetToPMU,
			MeterAssetMMXUPair pair, gluemodel.CIM.IEC61968.Common.Location srcLocation, PMUVoltageMeter consumer) {
		Object[] result_pattern_Location_2_4_solveCSP_binding = pattern_Location_2_4_solveCSP_bindingFBBBBBBB(_this,
				isApplicableMatch, asset, assetToPMU, pair, srcLocation, consumer);
		if (result_pattern_Location_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Location_2_4_solveCSP_binding[0];

			Object[] result_pattern_Location_2_4_solveCSP_black = pattern_Location_2_4_solveCSP_blackB(csp);
			if (result_pattern_Location_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, asset, assetToPMU, pair, srcLocation, consumer };
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
					for (MeterAssetMMXUPair pair : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(asset, MeterAssetMMXUPair.class, "a")) {
						_result.add(new Object[] { asset, pair, srcLocation, _edge_Location });
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
			Location _this, Match match, MeterAsset asset, MeterAssetMMXUPair pair,
			gluemodel.CIM.IEC61968.Common.Location srcLocation) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, asset, pair, srcLocation);
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

	public static final Object[] pattern_Location_13_1_matchtggpattern_blackBBB(MeterAsset asset,
			MeterAssetMMXUPair pair, gluemodel.CIM.IEC61968.Common.Location srcLocation) {
		if (asset.equals(pair.getA())) {
			if (srcLocation.equals(asset.getLocation())) {
				return new Object[] { asset, pair, srcLocation };
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
