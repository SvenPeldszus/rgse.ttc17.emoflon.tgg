/**
 */
package rgse.ttc17.emoflon.tgg.task2.Rules.impl;

import gluemodel.CIM.IEC61968.Metering.EndDeviceAsset;
import gluemodel.CIM.IEC61968.Metering.MeterAsset;
import gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint;

import gluemodel.CIM.IEC61970.LoadModel.ConformLoad;
import gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup;
import gluemodel.CIM.IEC61970.LoadModel.LoadGroup;
import gluemodel.CIM.IEC61970.LoadModel.SubLoadArea;

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

import outagePreventionJointarget.OutagePreventionJointargetFactory;

import rgse.ttc17.emoflon.tgg.task2.LoadAreaToLoadArea;

import rgse.ttc17.emoflon.tgg.task2.Rules.LoadArea;
import rgse.ttc17.emoflon.tgg.task2.Rules.RulesPackage;

import rgse.ttc17.emoflon.tgg.task2.SubLoadAreaToSubLoadArea;
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
 * An implementation of the model object '<em><b>Load Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LoadAreaImpl extends AbstractRuleImpl implements LoadArea {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getLoadArea();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			SubLoadArea srcArea, gluemodel.CIM.IEC61970.LoadModel.LoadArea srcLoadArea, ServiceDeliveryPoint srcDeliver,
			ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		// initial bindings
		Object[] result1_black = LoadAreaImpl.pattern_LoadArea_0_1_initialbindings_blackBBBBBBBBB(this, match, asset,
				pair, srcArea, srcLoadArea, srcDeliver, srcGroup, srcConsumer);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[asset] = " + asset + ", "
					+ "[pair] = " + pair + ", " + "[srcArea] = " + srcArea + ", " + "[srcLoadArea] = " + srcLoadArea
					+ ", " + "[srcDeliver] = " + srcDeliver + ", " + "[srcGroup] = " + srcGroup + ", "
					+ "[srcConsumer] = " + srcConsumer + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = LoadAreaImpl.pattern_LoadArea_0_2_SolveCSP_bindingAndBlackFBBBBBBBBB(this,
				match, asset, pair, srcArea, srcLoadArea, srcDeliver, srcGroup, srcConsumer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[asset] = " + asset + ", " + "[pair] = " + pair
					+ ", " + "[srcArea] = " + srcArea + ", " + "[srcLoadArea] = " + srcLoadArea + ", "
					+ "[srcDeliver] = " + srcDeliver + ", " + "[srcGroup] = " + srcGroup + ", " + "[srcConsumer] = "
					+ srcConsumer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (LoadAreaImpl.pattern_LoadArea_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = LoadAreaImpl.pattern_LoadArea_0_4_collectelementstobetranslated_blackBBBBBBBB(
					match, asset, pair, srcArea, srcLoadArea, srcDeliver, srcGroup, srcConsumer);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[asset] = " + asset + ", " + "[pair] = "
						+ pair + ", " + "[srcArea] = " + srcArea + ", " + "[srcLoadArea] = " + srcLoadArea + ", "
						+ "[srcDeliver] = " + srcDeliver + ", " + "[srcGroup] = " + srcGroup + ", " + "[srcConsumer] = "
						+ srcConsumer + ".");
			}
			LoadAreaImpl.pattern_LoadArea_0_4_collectelementstobetranslated_greenBBBFF(match, srcArea, srcLoadArea);
			// EMoflonEdge srcArea__srcLoadArea____LoadArea = (EMoflonEdge) result4_green[3];
			// EMoflonEdge srcLoadArea__srcArea____SubLoadAreas = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = LoadAreaImpl.pattern_LoadArea_0_5_collectcontextelements_blackBBBBBBBB(match,
					asset, pair, srcArea, srcLoadArea, srcDeliver, srcGroup, srcConsumer);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[asset] = " + asset + ", " + "[pair] = "
						+ pair + ", " + "[srcArea] = " + srcArea + ", " + "[srcLoadArea] = " + srcLoadArea + ", "
						+ "[srcDeliver] = " + srcDeliver + ", " + "[srcGroup] = " + srcGroup + ", " + "[srcConsumer] = "
						+ srcConsumer + ".");
			}
			LoadAreaImpl.pattern_LoadArea_0_5_collectcontextelements_greenBBBBBBBFFFFFFFFF(match, asset, pair, srcArea,
					srcDeliver, srcGroup, srcConsumer);
			// EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = (EMoflonEdge) result5_green[7];
			// EMoflonEdge srcDeliver__asset____EndDeviceAssets = (EMoflonEdge) result5_green[8];
			// EMoflonEdge pair__asset____a = (EMoflonEdge) result5_green[9];
			// EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = (EMoflonEdge) result5_green[10];
			// EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = (EMoflonEdge) result5_green[11];
			// EMoflonEdge srcGroup__srcArea____SubLoadArea = (EMoflonEdge) result5_green[12];
			// EMoflonEdge srcArea__srcGroup____LoadGroups = (EMoflonEdge) result5_green[13];
			// EMoflonEdge srcConsumer__srcGroup____LoadGroup = (EMoflonEdge) result5_green[14];
			// EMoflonEdge srcGroup__srcConsumer____EnergyConsumers = (EMoflonEdge) result5_green[15];

			// register objects to match
			LoadAreaImpl.pattern_LoadArea_0_6_registerobjectstomatch_expressionBBBBBBBBB(this, match, asset, pair,
					srcArea, srcLoadArea, srcDeliver, srcGroup, srcConsumer);
			return LoadAreaImpl.pattern_LoadArea_0_7_expressionF();
		} else {
			return LoadAreaImpl.pattern_LoadArea_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = LoadAreaImpl
				.pattern_LoadArea_1_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MeterAsset asset = (MeterAsset) result1_bindingAndBlack[0];
		outagePreventionJointarget.SubLoadArea trgArea = (outagePreventionJointarget.SubLoadArea) result1_bindingAndBlack[1];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result1_bindingAndBlack[2];
		SubLoadArea srcArea = (SubLoadArea) result1_bindingAndBlack[3];
		SubLoadAreaToSubLoadArea areaToArea = (SubLoadAreaToSubLoadArea) result1_bindingAndBlack[4];
		gluemodel.CIM.IEC61970.LoadModel.LoadArea srcLoadArea = (gluemodel.CIM.IEC61970.LoadModel.LoadArea) result1_bindingAndBlack[5];
		ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result1_bindingAndBlack[6];
		ConformLoadGroup srcGroup = (ConformLoadGroup) result1_bindingAndBlack[7];
		ConformLoad srcConsumer = (ConformLoad) result1_bindingAndBlack[8];
		// CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = LoadAreaImpl.pattern_LoadArea_1_1_performtransformation_greenFBBF(trgArea,
				srcLoadArea);
		LoadAreaToLoadArea laodToLoad = (LoadAreaToLoadArea) result1_green[0];
		outagePreventionJointarget.LoadArea trgLoadArea = (outagePreventionJointarget.LoadArea) result1_green[3];

		// collect translated elements
		Object[] result2_black = LoadAreaImpl.pattern_LoadArea_1_2_collecttranslatedelements_blackBBB(laodToLoad,
				srcLoadArea, trgLoadArea);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[laodToLoad] = " + laodToLoad + ", " + "[srcLoadArea] = " + srcLoadArea + ", "
					+ "[trgLoadArea] = " + trgLoadArea + ".");
		}
		Object[] result2_green = LoadAreaImpl.pattern_LoadArea_1_2_collecttranslatedelements_greenFBBB(laodToLoad,
				srcLoadArea, trgLoadArea);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = LoadAreaImpl.pattern_LoadArea_1_3_bookkeepingforedges_blackBBBBBBBBBBBB(ruleresult,
				asset, laodToLoad, trgArea, pair, srcArea, areaToArea, srcLoadArea, srcDeliver, trgLoadArea, srcGroup,
				srcConsumer);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[asset] = " + asset + ", " + "[laodToLoad] = "
					+ laodToLoad + ", " + "[trgArea] = " + trgArea + ", " + "[pair] = " + pair + ", " + "[srcArea] = "
					+ srcArea + ", " + "[areaToArea] = " + areaToArea + ", " + "[srcLoadArea] = " + srcLoadArea + ", "
					+ "[srcDeliver] = " + srcDeliver + ", " + "[trgLoadArea] = " + trgLoadArea + ", " + "[srcGroup] = "
					+ srcGroup + ", " + "[srcConsumer] = " + srcConsumer + ".");
		}
		LoadAreaImpl.pattern_LoadArea_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, laodToLoad, trgArea, srcArea,
				srcLoadArea, trgLoadArea);
		// EMoflonEdge trgArea__trgLoadArea____LoadArea = (EMoflonEdge) result3_green[6];
		// EMoflonEdge laodToLoad__srcLoadArea____source = (EMoflonEdge) result3_green[7];
		// EMoflonEdge srcArea__srcLoadArea____LoadArea = (EMoflonEdge) result3_green[8];
		// EMoflonEdge srcLoadArea__srcArea____SubLoadAreas = (EMoflonEdge) result3_green[9];
		// EMoflonEdge laodToLoad__trgLoadArea____target = (EMoflonEdge) result3_green[10];

		// perform postprocessing story node is empty
		// register objects
		LoadAreaImpl.pattern_LoadArea_1_5_registerobjects_expressionBBBBBBBBBBBBB(this, ruleresult, asset, laodToLoad,
				trgArea, pair, srcArea, areaToArea, srcLoadArea, srcDeliver, trgLoadArea, srcGroup, srcConsumer);
		return LoadAreaImpl.pattern_LoadArea_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = LoadAreaImpl
				.pattern_LoadArea_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LoadAreaImpl.pattern_LoadArea_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = LoadAreaImpl.pattern_LoadArea_2_2_corematch_bindingFFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MeterAsset asset = (MeterAsset) result2_binding[0];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_binding[1];
		SubLoadArea srcArea = (SubLoadArea) result2_binding[2];
		gluemodel.CIM.IEC61970.LoadModel.LoadArea srcLoadArea = (gluemodel.CIM.IEC61970.LoadModel.LoadArea) result2_binding[3];
		ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result2_binding[4];
		ConformLoadGroup srcGroup = (ConformLoadGroup) result2_binding[5];
		ConformLoad srcConsumer = (ConformLoad) result2_binding[6];
		for (Object[] result2_black : LoadAreaImpl.pattern_LoadArea_2_2_corematch_blackBFBBFBBBBB(asset, pair, srcArea,
				srcLoadArea, srcDeliver, srcGroup, srcConsumer, match)) {
			outagePreventionJointarget.SubLoadArea trgArea = (outagePreventionJointarget.SubLoadArea) result2_black[1];
			SubLoadAreaToSubLoadArea areaToArea = (SubLoadAreaToSubLoadArea) result2_black[4];
			// ForEach find context
			for (Object[] result3_black : LoadAreaImpl.pattern_LoadArea_2_3_findcontext_blackBBBBBBBBB(asset, trgArea,
					pair, srcArea, areaToArea, srcLoadArea, srcDeliver, srcGroup, srcConsumer)) {
				Object[] result3_green = LoadAreaImpl.pattern_LoadArea_2_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFFFF(
						asset, trgArea, pair, srcArea, areaToArea, srcLoadArea, srcDeliver, srcGroup, srcConsumer);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = (EMoflonEdge) result3_green[10];
				// EMoflonEdge srcDeliver__asset____EndDeviceAssets = (EMoflonEdge) result3_green[11];
				// EMoflonEdge pair__asset____a = (EMoflonEdge) result3_green[12];
				// EMoflonEdge areaToArea__trgArea____target = (EMoflonEdge) result3_green[13];
				// EMoflonEdge areaToArea__srcArea____source = (EMoflonEdge) result3_green[14];
				// EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = (EMoflonEdge) result3_green[15];
				// EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = (EMoflonEdge) result3_green[16];
				// EMoflonEdge srcArea__srcLoadArea____LoadArea = (EMoflonEdge) result3_green[17];
				// EMoflonEdge srcLoadArea__srcArea____SubLoadAreas = (EMoflonEdge) result3_green[18];
				// EMoflonEdge srcGroup__srcArea____SubLoadArea = (EMoflonEdge) result3_green[19];
				// EMoflonEdge srcArea__srcGroup____LoadGroups = (EMoflonEdge) result3_green[20];
				// EMoflonEdge srcConsumer__srcGroup____LoadGroup = (EMoflonEdge) result3_green[21];
				// EMoflonEdge srcGroup__srcConsumer____EnergyConsumers = (EMoflonEdge) result3_green[22];

				// solve CSP
				Object[] result4_bindingAndBlack = LoadAreaImpl
						.pattern_LoadArea_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(this, isApplicableMatch, asset,
								trgArea, pair, srcArea, areaToArea, srcLoadArea, srcDeliver, srcGroup, srcConsumer);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[asset] = " + asset + ", " + "[trgArea] = " + trgArea + ", " + "[pair] = " + pair + ", "
							+ "[srcArea] = " + srcArea + ", " + "[areaToArea] = " + areaToArea + ", "
							+ "[srcLoadArea] = " + srcLoadArea + ", " + "[srcDeliver] = " + srcDeliver + ", "
							+ "[srcGroup] = " + srcGroup + ", " + "[srcConsumer] = " + srcConsumer + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (LoadAreaImpl.pattern_LoadArea_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = LoadAreaImpl.pattern_LoadArea_2_6_addmatchtoruleresult_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					LoadAreaImpl.pattern_LoadArea_2_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return LoadAreaImpl.pattern_LoadArea_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			SubLoadArea srcArea, gluemodel.CIM.IEC61970.LoadModel.LoadArea srcLoadArea, ServiceDeliveryPoint srcDeliver,
			ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		match.registerObject("asset", asset);
		match.registerObject("pair", pair);
		match.registerObject("srcArea", srcArea);
		match.registerObject("srcLoadArea", srcLoadArea);
		match.registerObject("srcDeliver", srcDeliver);
		match.registerObject("srcGroup", srcGroup);
		match.registerObject("srcConsumer", srcConsumer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			SubLoadArea srcArea, gluemodel.CIM.IEC61970.LoadModel.LoadArea srcLoadArea, ServiceDeliveryPoint srcDeliver,
			ConformLoadGroup srcGroup, ConformLoad srcConsumer) {// Create CSP
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
			outagePreventionJointarget.SubLoadArea trgArea, MeterAssetPhysicalDevicePair pair, SubLoadArea srcArea,
			SubLoadAreaToSubLoadArea areaToArea, gluemodel.CIM.IEC61970.LoadModel.LoadArea srcLoadArea,
			ServiceDeliveryPoint srcDeliver, ConformLoadGroup srcGroup, ConformLoad srcConsumer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("asset", asset);
		isApplicableMatch.registerObject("trgArea", trgArea);
		isApplicableMatch.registerObject("pair", pair);
		isApplicableMatch.registerObject("srcArea", srcArea);
		isApplicableMatch.registerObject("areaToArea", areaToArea);
		isApplicableMatch.registerObject("srcLoadArea", srcLoadArea);
		isApplicableMatch.registerObject("srcDeliver", srcDeliver);
		isApplicableMatch.registerObject("srcGroup", srcGroup);
		isApplicableMatch.registerObject("srcConsumer", srcConsumer);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject asset, EObject laodToLoad, EObject trgArea,
			EObject pair, EObject srcArea, EObject areaToArea, EObject srcLoadArea, EObject srcDeliver,
			EObject trgLoadArea, EObject srcGroup, EObject srcConsumer) {
		ruleresult.registerObject("asset", asset);
		ruleresult.registerObject("laodToLoad", laodToLoad);
		ruleresult.registerObject("trgArea", trgArea);
		ruleresult.registerObject("pair", pair);
		ruleresult.registerObject("srcArea", srcArea);
		ruleresult.registerObject("areaToArea", areaToArea);
		ruleresult.registerObject("srcLoadArea", srcLoadArea);
		ruleresult.registerObject("srcDeliver", srcDeliver);
		ruleresult.registerObject("trgLoadArea", trgLoadArea);
		ruleresult.registerObject("srcGroup", srcGroup);
		ruleresult.registerObject("srcConsumer", srcConsumer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("srcLoadArea").eClass())
				.equals("gluemodel.CIM.IEC61970.LoadModel.LoadArea.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_156(EMoflonEdge _edge_LoadArea) {
		// prepare return value
		Object[] result1_bindingAndBlack = LoadAreaImpl
				.pattern_LoadArea_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = LoadAreaImpl.pattern_LoadArea_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : LoadAreaImpl
				.pattern_LoadArea_10_2_testcorematchandDECs_blackFFFFFFFB(_edge_LoadArea)) {
			MeterAsset asset = (MeterAsset) result2_black[0];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_black[1];
			SubLoadArea srcArea = (SubLoadArea) result2_black[2];
			gluemodel.CIM.IEC61970.LoadModel.LoadArea srcLoadArea = (gluemodel.CIM.IEC61970.LoadModel.LoadArea) result2_black[3];
			ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result2_black[4];
			ConformLoadGroup srcGroup = (ConformLoadGroup) result2_black[5];
			ConformLoad srcConsumer = (ConformLoad) result2_black[6];
			Object[] result2_green = LoadAreaImpl.pattern_LoadArea_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (LoadAreaImpl.pattern_LoadArea_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBBB(this,
					match, asset, pair, srcArea, srcLoadArea, srcDeliver, srcGroup, srcConsumer)) {
				// Ensure that the correct types of elements are matched
				if (LoadAreaImpl.pattern_LoadArea_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
						match)) {

					// Add match to rule result
					Object[] result5_black = LoadAreaImpl.pattern_LoadArea_10_5_Addmatchtoruleresult_blackBBBB(match,
							__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					LoadAreaImpl.pattern_LoadArea_10_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return LoadAreaImpl.pattern_LoadArea_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("LoadArea");
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
	public boolean checkDEC_FWD(MeterAsset asset, MeterAssetPhysicalDevicePair pair, SubLoadArea srcArea,
			gluemodel.CIM.IEC61970.LoadModel.LoadArea srcLoadArea, ServiceDeliveryPoint srcDeliver,
			ConformLoadGroup srcGroup, ConformLoad srcConsumer) {// match tgg pattern
		Object[] result1_black = LoadAreaImpl.pattern_LoadArea_13_1_matchtggpattern_blackBBBBBBB(asset, pair, srcArea,
				srcLoadArea, srcDeliver, srcGroup, srcConsumer);
		if (result1_black != null) {
			return LoadAreaImpl.pattern_LoadArea_13_2_expressionF();
		} else {
			return LoadAreaImpl.pattern_LoadArea_13_3_expressionF();
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
		case RulesPackage.LOAD_AREA___IS_APPROPRIATE_FWD__MATCH_METERASSET_METERASSETPHYSICALDEVICEPAIR_SUBLOADAREA_LOADAREA_SERVICEDELIVERYPOINT_CONFORMLOADGROUP_CONFORMLOAD:
			return isAppropriate_FWD((Match) arguments.get(0), (MeterAsset) arguments.get(1),
					(MeterAssetPhysicalDevicePair) arguments.get(2), (SubLoadArea) arguments.get(3),
					(gluemodel.CIM.IEC61970.LoadModel.LoadArea) arguments.get(4),
					(ServiceDeliveryPoint) arguments.get(5), (ConformLoadGroup) arguments.get(6),
					(ConformLoad) arguments.get(7));
		case RulesPackage.LOAD_AREA___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LOAD_AREA___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.LOAD_AREA___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_METERASSET_METERASSETPHYSICALDEVICEPAIR_SUBLOADAREA_LOADAREA_SERVICEDELIVERYPOINT_CONFORMLOADGROUP_CONFORMLOAD:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MeterAsset) arguments.get(1),
					(MeterAssetPhysicalDevicePair) arguments.get(2), (SubLoadArea) arguments.get(3),
					(gluemodel.CIM.IEC61970.LoadModel.LoadArea) arguments.get(4),
					(ServiceDeliveryPoint) arguments.get(5), (ConformLoadGroup) arguments.get(6),
					(ConformLoad) arguments.get(7));
			return null;
		case RulesPackage.LOAD_AREA___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_METERASSET_METERASSETPHYSICALDEVICEPAIR_SUBLOADAREA_LOADAREA_SERVICEDELIVERYPOINT_CONFORMLOADGROUP_CONFORMLOAD:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MeterAsset) arguments.get(1),
					(MeterAssetPhysicalDevicePair) arguments.get(2), (SubLoadArea) arguments.get(3),
					(gluemodel.CIM.IEC61970.LoadModel.LoadArea) arguments.get(4),
					(ServiceDeliveryPoint) arguments.get(5), (ConformLoadGroup) arguments.get(6),
					(ConformLoad) arguments.get(7));
		case RulesPackage.LOAD_AREA___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LOAD_AREA___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_METERASSET_SUBLOADAREA_METERASSETPHYSICALDEVICEPAIR_SUBLOADAREA_SUBLOADAREATOSUBLOADAREA_LOADAREA_SERVICEDELIVERYPOINT_CONFORMLOADGROUP_CONFORMLOAD:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MeterAsset) arguments.get(1),
					(outagePreventionJointarget.SubLoadArea) arguments.get(2),
					(MeterAssetPhysicalDevicePair) arguments.get(3), (SubLoadArea) arguments.get(4),
					(SubLoadAreaToSubLoadArea) arguments.get(5),
					(gluemodel.CIM.IEC61970.LoadModel.LoadArea) arguments.get(6),
					(ServiceDeliveryPoint) arguments.get(7), (ConformLoadGroup) arguments.get(8),
					(ConformLoad) arguments.get(9));
		case RulesPackage.LOAD_AREA___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LOAD_AREA___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.LOAD_AREA___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.LOAD_AREA___IS_APPROPRIATE_FWD_EMOFLON_EDGE_156__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_156((EMoflonEdge) arguments.get(0));
		case RulesPackage.LOAD_AREA___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.LOAD_AREA___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.LOAD_AREA___CHECK_DEC_FWD__METERASSET_METERASSETPHYSICALDEVICEPAIR_SUBLOADAREA_LOADAREA_SERVICEDELIVERYPOINT_CONFORMLOADGROUP_CONFORMLOAD:
			return checkDEC_FWD((MeterAsset) arguments.get(0), (MeterAssetPhysicalDevicePair) arguments.get(1),
					(SubLoadArea) arguments.get(2), (gluemodel.CIM.IEC61970.LoadModel.LoadArea) arguments.get(3),
					(ServiceDeliveryPoint) arguments.get(4), (ConformLoadGroup) arguments.get(5),
					(ConformLoad) arguments.get(6));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_LoadArea_0_1_initialbindings_blackBBBBBBBBB(LoadArea _this, Match match,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair, SubLoadArea srcArea,
			gluemodel.CIM.IEC61970.LoadModel.LoadArea srcLoadArea, ServiceDeliveryPoint srcDeliver,
			ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		return new Object[] { _this, match, asset, pair, srcArea, srcLoadArea, srcDeliver, srcGroup, srcConsumer };
	}

	public static final Object[] pattern_LoadArea_0_2_SolveCSP_bindingFBBBBBBBBB(LoadArea _this, Match match,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair, SubLoadArea srcArea,
			gluemodel.CIM.IEC61970.LoadModel.LoadArea srcLoadArea, ServiceDeliveryPoint srcDeliver,
			ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, asset, pair, srcArea, srcLoadArea, srcDeliver,
				srcGroup, srcConsumer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, asset, pair, srcArea, srcLoadArea, srcDeliver, srcGroup,
					srcConsumer };
		}
		return null;
	}

	public static final Object[] pattern_LoadArea_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LoadArea_0_2_SolveCSP_bindingAndBlackFBBBBBBBBB(LoadArea _this, Match match,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair, SubLoadArea srcArea,
			gluemodel.CIM.IEC61970.LoadModel.LoadArea srcLoadArea, ServiceDeliveryPoint srcDeliver,
			ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		Object[] result_pattern_LoadArea_0_2_SolveCSP_binding = pattern_LoadArea_0_2_SolveCSP_bindingFBBBBBBBBB(_this,
				match, asset, pair, srcArea, srcLoadArea, srcDeliver, srcGroup, srcConsumer);
		if (result_pattern_LoadArea_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LoadArea_0_2_SolveCSP_binding[0];

			Object[] result_pattern_LoadArea_0_2_SolveCSP_black = pattern_LoadArea_0_2_SolveCSP_blackB(csp);
			if (result_pattern_LoadArea_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, asset, pair, srcArea, srcLoadArea, srcDeliver, srcGroup,
						srcConsumer };
			}
		}
		return null;
	}

	public static final boolean pattern_LoadArea_0_3_CheckCSP_expressionFBB(LoadArea _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LoadArea_0_4_collectelementstobetranslated_blackBBBBBBBB(Match match,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair, SubLoadArea srcArea,
			gluemodel.CIM.IEC61970.LoadModel.LoadArea srcLoadArea, ServiceDeliveryPoint srcDeliver,
			ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		return new Object[] { match, asset, pair, srcArea, srcLoadArea, srcDeliver, srcGroup, srcConsumer };
	}

	public static final Object[] pattern_LoadArea_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			SubLoadArea srcArea, gluemodel.CIM.IEC61970.LoadModel.LoadArea srcLoadArea) {
		EMoflonEdge srcArea__srcLoadArea____LoadArea = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLoadArea__srcArea____SubLoadAreas = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(srcLoadArea);
		String srcArea__srcLoadArea____LoadArea_name_prime = "LoadArea";
		String srcLoadArea__srcArea____SubLoadAreas_name_prime = "SubLoadAreas";
		srcArea__srcLoadArea____LoadArea.setSrc(srcArea);
		srcArea__srcLoadArea____LoadArea.setTrg(srcLoadArea);
		match.getToBeTranslatedEdges().add(srcArea__srcLoadArea____LoadArea);
		srcLoadArea__srcArea____SubLoadAreas.setSrc(srcLoadArea);
		srcLoadArea__srcArea____SubLoadAreas.setTrg(srcArea);
		match.getToBeTranslatedEdges().add(srcLoadArea__srcArea____SubLoadAreas);
		srcArea__srcLoadArea____LoadArea.setName(srcArea__srcLoadArea____LoadArea_name_prime);
		srcLoadArea__srcArea____SubLoadAreas.setName(srcLoadArea__srcArea____SubLoadAreas_name_prime);
		return new Object[] { match, srcArea, srcLoadArea, srcArea__srcLoadArea____LoadArea,
				srcLoadArea__srcArea____SubLoadAreas };
	}

	public static final Object[] pattern_LoadArea_0_5_collectcontextelements_blackBBBBBBBB(Match match,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair, SubLoadArea srcArea,
			gluemodel.CIM.IEC61970.LoadModel.LoadArea srcLoadArea, ServiceDeliveryPoint srcDeliver,
			ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		return new Object[] { match, asset, pair, srcArea, srcLoadArea, srcDeliver, srcGroup, srcConsumer };
	}

	public static final Object[] pattern_LoadArea_0_5_collectcontextelements_greenBBBBBBBFFFFFFFFF(Match match,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair, SubLoadArea srcArea, ServiceDeliveryPoint srcDeliver,
			ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__asset____EndDeviceAssets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcGroup__srcArea____SubLoadArea = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcArea__srcGroup____LoadGroups = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcConsumer__srcGroup____LoadGroup = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcGroup__srcConsumer____EnergyConsumers = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(asset);
		match.getContextNodes().add(pair);
		match.getContextNodes().add(srcArea);
		match.getContextNodes().add(srcDeliver);
		match.getContextNodes().add(srcGroup);
		match.getContextNodes().add(srcConsumer);
		String asset__srcDeliver____ServiceDeliveryPoint_name_prime = "ServiceDeliveryPoint";
		String srcDeliver__asset____EndDeviceAssets_name_prime = "EndDeviceAssets";
		String pair__asset____a_name_prime = "a";
		String srcDeliver__srcConsumer____EnergyConsumer_name_prime = "EnergyConsumer";
		String srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime = "ServiceDeliveryPoints";
		String srcGroup__srcArea____SubLoadArea_name_prime = "SubLoadArea";
		String srcArea__srcGroup____LoadGroups_name_prime = "LoadGroups";
		String srcConsumer__srcGroup____LoadGroup_name_prime = "LoadGroup";
		String srcGroup__srcConsumer____EnergyConsumers_name_prime = "EnergyConsumers";
		asset__srcDeliver____ServiceDeliveryPoint.setSrc(asset);
		asset__srcDeliver____ServiceDeliveryPoint.setTrg(srcDeliver);
		match.getContextEdges().add(asset__srcDeliver____ServiceDeliveryPoint);
		srcDeliver__asset____EndDeviceAssets.setSrc(srcDeliver);
		srcDeliver__asset____EndDeviceAssets.setTrg(asset);
		match.getContextEdges().add(srcDeliver__asset____EndDeviceAssets);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		match.getContextEdges().add(pair__asset____a);
		srcDeliver__srcConsumer____EnergyConsumer.setSrc(srcDeliver);
		srcDeliver__srcConsumer____EnergyConsumer.setTrg(srcConsumer);
		match.getContextEdges().add(srcDeliver__srcConsumer____EnergyConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setSrc(srcConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setTrg(srcDeliver);
		match.getContextEdges().add(srcConsumer__srcDeliver____ServiceDeliveryPoints);
		srcGroup__srcArea____SubLoadArea.setSrc(srcGroup);
		srcGroup__srcArea____SubLoadArea.setTrg(srcArea);
		match.getContextEdges().add(srcGroup__srcArea____SubLoadArea);
		srcArea__srcGroup____LoadGroups.setSrc(srcArea);
		srcArea__srcGroup____LoadGroups.setTrg(srcGroup);
		match.getContextEdges().add(srcArea__srcGroup____LoadGroups);
		srcConsumer__srcGroup____LoadGroup.setSrc(srcConsumer);
		srcConsumer__srcGroup____LoadGroup.setTrg(srcGroup);
		match.getContextEdges().add(srcConsumer__srcGroup____LoadGroup);
		srcGroup__srcConsumer____EnergyConsumers.setSrc(srcGroup);
		srcGroup__srcConsumer____EnergyConsumers.setTrg(srcConsumer);
		match.getContextEdges().add(srcGroup__srcConsumer____EnergyConsumers);
		asset__srcDeliver____ServiceDeliveryPoint.setName(asset__srcDeliver____ServiceDeliveryPoint_name_prime);
		srcDeliver__asset____EndDeviceAssets.setName(srcDeliver__asset____EndDeviceAssets_name_prime);
		pair__asset____a.setName(pair__asset____a_name_prime);
		srcDeliver__srcConsumer____EnergyConsumer.setName(srcDeliver__srcConsumer____EnergyConsumer_name_prime);
		srcConsumer__srcDeliver____ServiceDeliveryPoints
				.setName(srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime);
		srcGroup__srcArea____SubLoadArea.setName(srcGroup__srcArea____SubLoadArea_name_prime);
		srcArea__srcGroup____LoadGroups.setName(srcArea__srcGroup____LoadGroups_name_prime);
		srcConsumer__srcGroup____LoadGroup.setName(srcConsumer__srcGroup____LoadGroup_name_prime);
		srcGroup__srcConsumer____EnergyConsumers.setName(srcGroup__srcConsumer____EnergyConsumers_name_prime);
		return new Object[] { match, asset, pair, srcArea, srcDeliver, srcGroup, srcConsumer,
				asset__srcDeliver____ServiceDeliveryPoint, srcDeliver__asset____EndDeviceAssets, pair__asset____a,
				srcDeliver__srcConsumer____EnergyConsumer, srcConsumer__srcDeliver____ServiceDeliveryPoints,
				srcGroup__srcArea____SubLoadArea, srcArea__srcGroup____LoadGroups, srcConsumer__srcGroup____LoadGroup,
				srcGroup__srcConsumer____EnergyConsumers };
	}

	public static final void pattern_LoadArea_0_6_registerobjectstomatch_expressionBBBBBBBBB(LoadArea _this,
			Match match, MeterAsset asset, MeterAssetPhysicalDevicePair pair, SubLoadArea srcArea,
			gluemodel.CIM.IEC61970.LoadModel.LoadArea srcLoadArea, ServiceDeliveryPoint srcDeliver,
			ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		_this.registerObjectsToMatch_FWD(match, asset, pair, srcArea, srcLoadArea, srcDeliver, srcGroup, srcConsumer);

	}

	public static final boolean pattern_LoadArea_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LoadArea_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_LoadArea_1_1_performtransformation_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("asset");
		EObject _localVariable_1 = isApplicableMatch.getObject("trgArea");
		EObject _localVariable_2 = isApplicableMatch.getObject("pair");
		EObject _localVariable_3 = isApplicableMatch.getObject("srcArea");
		EObject _localVariable_4 = isApplicableMatch.getObject("areaToArea");
		EObject _localVariable_5 = isApplicableMatch.getObject("srcLoadArea");
		EObject _localVariable_6 = isApplicableMatch.getObject("srcDeliver");
		EObject _localVariable_7 = isApplicableMatch.getObject("srcGroup");
		EObject _localVariable_8 = isApplicableMatch.getObject("srcConsumer");
		EObject tmpAsset = _localVariable_0;
		EObject tmpTrgArea = _localVariable_1;
		EObject tmpPair = _localVariable_2;
		EObject tmpSrcArea = _localVariable_3;
		EObject tmpAreaToArea = _localVariable_4;
		EObject tmpSrcLoadArea = _localVariable_5;
		EObject tmpSrcDeliver = _localVariable_6;
		EObject tmpSrcGroup = _localVariable_7;
		EObject tmpSrcConsumer = _localVariable_8;
		if (tmpAsset instanceof MeterAsset) {
			MeterAsset asset = (MeterAsset) tmpAsset;
			if (tmpTrgArea instanceof outagePreventionJointarget.SubLoadArea) {
				outagePreventionJointarget.SubLoadArea trgArea = (outagePreventionJointarget.SubLoadArea) tmpTrgArea;
				if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
					MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
					if (tmpSrcArea instanceof SubLoadArea) {
						SubLoadArea srcArea = (SubLoadArea) tmpSrcArea;
						if (tmpAreaToArea instanceof SubLoadAreaToSubLoadArea) {
							SubLoadAreaToSubLoadArea areaToArea = (SubLoadAreaToSubLoadArea) tmpAreaToArea;
							if (tmpSrcLoadArea instanceof gluemodel.CIM.IEC61970.LoadModel.LoadArea) {
								gluemodel.CIM.IEC61970.LoadModel.LoadArea srcLoadArea = (gluemodel.CIM.IEC61970.LoadModel.LoadArea) tmpSrcLoadArea;
								if (tmpSrcDeliver instanceof ServiceDeliveryPoint) {
									ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) tmpSrcDeliver;
									if (tmpSrcGroup instanceof ConformLoadGroup) {
										ConformLoadGroup srcGroup = (ConformLoadGroup) tmpSrcGroup;
										if (tmpSrcConsumer instanceof ConformLoad) {
											ConformLoad srcConsumer = (ConformLoad) tmpSrcConsumer;
											return new Object[] { asset, trgArea, pair, srcArea, areaToArea,
													srcLoadArea, srcDeliver, srcGroup, srcConsumer, isApplicableMatch };
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

	public static final Object[] pattern_LoadArea_1_1_performtransformation_blackBBBBBBBBBFBB(MeterAsset asset,
			outagePreventionJointarget.SubLoadArea trgArea, MeterAssetPhysicalDevicePair pair, SubLoadArea srcArea,
			SubLoadAreaToSubLoadArea areaToArea, gluemodel.CIM.IEC61970.LoadModel.LoadArea srcLoadArea,
			ServiceDeliveryPoint srcDeliver, ConformLoadGroup srcGroup, ConformLoad srcConsumer, LoadArea _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { asset, trgArea, pair, srcArea, areaToArea, srcLoadArea, srcDeliver, srcGroup,
						srcConsumer, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LoadArea_1_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(LoadArea _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_LoadArea_1_1_performtransformation_binding = pattern_LoadArea_1_1_performtransformation_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_LoadArea_1_1_performtransformation_binding != null) {
			MeterAsset asset = (MeterAsset) result_pattern_LoadArea_1_1_performtransformation_binding[0];
			outagePreventionJointarget.SubLoadArea trgArea = (outagePreventionJointarget.SubLoadArea) result_pattern_LoadArea_1_1_performtransformation_binding[1];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result_pattern_LoadArea_1_1_performtransformation_binding[2];
			SubLoadArea srcArea = (SubLoadArea) result_pattern_LoadArea_1_1_performtransformation_binding[3];
			SubLoadAreaToSubLoadArea areaToArea = (SubLoadAreaToSubLoadArea) result_pattern_LoadArea_1_1_performtransformation_binding[4];
			gluemodel.CIM.IEC61970.LoadModel.LoadArea srcLoadArea = (gluemodel.CIM.IEC61970.LoadModel.LoadArea) result_pattern_LoadArea_1_1_performtransformation_binding[5];
			ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result_pattern_LoadArea_1_1_performtransformation_binding[6];
			ConformLoadGroup srcGroup = (ConformLoadGroup) result_pattern_LoadArea_1_1_performtransformation_binding[7];
			ConformLoad srcConsumer = (ConformLoad) result_pattern_LoadArea_1_1_performtransformation_binding[8];

			Object[] result_pattern_LoadArea_1_1_performtransformation_black = pattern_LoadArea_1_1_performtransformation_blackBBBBBBBBBFBB(
					asset, trgArea, pair, srcArea, areaToArea, srcLoadArea, srcDeliver, srcGroup, srcConsumer, _this,
					isApplicableMatch);
			if (result_pattern_LoadArea_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_LoadArea_1_1_performtransformation_black[9];

				return new Object[] { asset, trgArea, pair, srcArea, areaToArea, srcLoadArea, srcDeliver, srcGroup,
						srcConsumer, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LoadArea_1_1_performtransformation_greenFBBF(
			outagePreventionJointarget.SubLoadArea trgArea, gluemodel.CIM.IEC61970.LoadModel.LoadArea srcLoadArea) {
		LoadAreaToLoadArea laodToLoad = Task2Factory.eINSTANCE.createLoadAreaToLoadArea();
		outagePreventionJointarget.LoadArea trgLoadArea = OutagePreventionJointargetFactory.eINSTANCE.createLoadArea();
		laodToLoad.setSource(srcLoadArea);
		trgArea.setLoadArea(trgLoadArea);
		laodToLoad.setTarget(trgLoadArea);
		return new Object[] { laodToLoad, trgArea, srcLoadArea, trgLoadArea };
	}

	public static final Object[] pattern_LoadArea_1_2_collecttranslatedelements_blackBBB(LoadAreaToLoadArea laodToLoad,
			gluemodel.CIM.IEC61970.LoadModel.LoadArea srcLoadArea, outagePreventionJointarget.LoadArea trgLoadArea) {
		return new Object[] { laodToLoad, srcLoadArea, trgLoadArea };
	}

	public static final Object[] pattern_LoadArea_1_2_collecttranslatedelements_greenFBBB(LoadAreaToLoadArea laodToLoad,
			gluemodel.CIM.IEC61970.LoadModel.LoadArea srcLoadArea, outagePreventionJointarget.LoadArea trgLoadArea) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(laodToLoad);
		ruleresult.getTranslatedElements().add(srcLoadArea);
		ruleresult.getCreatedElements().add(trgLoadArea);
		return new Object[] { ruleresult, laodToLoad, srcLoadArea, trgLoadArea };
	}

	public static final Object[] pattern_LoadArea_1_3_bookkeepingforedges_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject asset, EObject laodToLoad, EObject trgArea, EObject pair,
			EObject srcArea, EObject areaToArea, EObject srcLoadArea, EObject srcDeliver, EObject trgLoadArea,
			EObject srcGroup, EObject srcConsumer) {
		if (!asset.equals(laodToLoad)) {
			if (!asset.equals(trgArea)) {
				if (!asset.equals(pair)) {
					if (!asset.equals(srcArea)) {
						if (!asset.equals(srcLoadArea)) {
							if (!asset.equals(srcDeliver)) {
								if (!asset.equals(trgLoadArea)) {
									if (!asset.equals(srcGroup)) {
										if (!asset.equals(srcConsumer)) {
											if (!laodToLoad.equals(trgArea)) {
												if (!laodToLoad.equals(pair)) {
													if (!laodToLoad.equals(srcArea)) {
														if (!laodToLoad.equals(srcLoadArea)) {
															if (!laodToLoad.equals(srcDeliver)) {
																if (!laodToLoad.equals(trgLoadArea)) {
																	if (!laodToLoad.equals(srcGroup)) {
																		if (!laodToLoad.equals(srcConsumer)) {
																			if (!trgArea.equals(trgLoadArea)) {
																				if (!pair.equals(trgArea)) {
																					if (!pair.equals(srcArea)) {
																						if (!pair.equals(srcLoadArea)) {
																							if (!pair.equals(
																									srcDeliver)) {
																								if (!pair.equals(
																										trgLoadArea)) {
																									if (!pair.equals(
																											srcGroup)) {
																										if (!pair
																												.equals(srcConsumer)) {
																											if (!srcArea
																													.equals(trgArea)) {
																												if (!srcArea
																														.equals(srcLoadArea)) {
																													if (!srcArea
																															.equals(srcDeliver)) {
																														if (!srcArea
																																.equals(trgLoadArea)) {
																															if (!srcArea
																																	.equals(srcGroup)) {
																																if (!srcArea
																																		.equals(srcConsumer)) {
																																	if (!areaToArea
																																			.equals(asset)) {
																																		if (!areaToArea
																																				.equals(laodToLoad)) {
																																			if (!areaToArea
																																					.equals(trgArea)) {
																																				if (!areaToArea
																																						.equals(pair)) {
																																					if (!areaToArea
																																							.equals(srcArea)) {
																																						if (!areaToArea
																																								.equals(srcLoadArea)) {
																																							if (!areaToArea
																																									.equals(srcDeliver)) {
																																								if (!areaToArea
																																										.equals(trgLoadArea)) {
																																									if (!areaToArea
																																											.equals(srcGroup)) {
																																										if (!areaToArea
																																												.equals(srcConsumer)) {
																																											if (!srcLoadArea
																																													.equals(trgArea)) {
																																												if (!srcLoadArea
																																														.equals(trgLoadArea)) {
																																													if (!srcDeliver
																																															.equals(trgArea)) {
																																														if (!srcDeliver
																																																.equals(srcLoadArea)) {
																																															if (!srcDeliver
																																																	.equals(trgLoadArea)) {
																																																if (!srcDeliver
																																																		.equals(srcGroup)) {
																																																	if (!srcGroup
																																																			.equals(trgArea)) {
																																																		if (!srcGroup
																																																				.equals(srcLoadArea)) {
																																																			if (!srcGroup
																																																					.equals(trgLoadArea)) {
																																																				if (!srcConsumer
																																																						.equals(trgArea)) {
																																																					if (!srcConsumer
																																																							.equals(srcLoadArea)) {
																																																						if (!srcConsumer
																																																								.equals(srcDeliver)) {
																																																							if (!srcConsumer
																																																									.equals(trgLoadArea)) {
																																																								if (!srcConsumer
																																																										.equals(srcGroup)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											asset,
																																																											laodToLoad,
																																																											trgArea,
																																																											pair,
																																																											srcArea,
																																																											areaToArea,
																																																											srcLoadArea,
																																																											srcDeliver,
																																																											trgLoadArea,
																																																											srcGroup,
																																																											srcConsumer };
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

	public static final Object[] pattern_LoadArea_1_3_bookkeepingforedges_greenBBBBBBFFFFF(PerformRuleResult ruleresult,
			EObject laodToLoad, EObject trgArea, EObject srcArea, EObject srcLoadArea, EObject trgLoadArea) {
		EMoflonEdge trgArea__trgLoadArea____LoadArea = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge laodToLoad__srcLoadArea____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcArea__srcLoadArea____LoadArea = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLoadArea__srcArea____SubLoadAreas = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge laodToLoad__trgLoadArea____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "LoadArea";
		String trgArea__trgLoadArea____LoadArea_name_prime = "LoadArea";
		String laodToLoad__srcLoadArea____source_name_prime = "source";
		String srcArea__srcLoadArea____LoadArea_name_prime = "LoadArea";
		String srcLoadArea__srcArea____SubLoadAreas_name_prime = "SubLoadAreas";
		String laodToLoad__trgLoadArea____target_name_prime = "target";
		trgArea__trgLoadArea____LoadArea.setSrc(trgArea);
		trgArea__trgLoadArea____LoadArea.setTrg(trgLoadArea);
		ruleresult.getCreatedEdges().add(trgArea__trgLoadArea____LoadArea);
		laodToLoad__srcLoadArea____source.setSrc(laodToLoad);
		laodToLoad__srcLoadArea____source.setTrg(srcLoadArea);
		ruleresult.getCreatedEdges().add(laodToLoad__srcLoadArea____source);
		srcArea__srcLoadArea____LoadArea.setSrc(srcArea);
		srcArea__srcLoadArea____LoadArea.setTrg(srcLoadArea);
		ruleresult.getTranslatedEdges().add(srcArea__srcLoadArea____LoadArea);
		srcLoadArea__srcArea____SubLoadAreas.setSrc(srcLoadArea);
		srcLoadArea__srcArea____SubLoadAreas.setTrg(srcArea);
		ruleresult.getTranslatedEdges().add(srcLoadArea__srcArea____SubLoadAreas);
		laodToLoad__trgLoadArea____target.setSrc(laodToLoad);
		laodToLoad__trgLoadArea____target.setTrg(trgLoadArea);
		ruleresult.getCreatedEdges().add(laodToLoad__trgLoadArea____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		trgArea__trgLoadArea____LoadArea.setName(trgArea__trgLoadArea____LoadArea_name_prime);
		laodToLoad__srcLoadArea____source.setName(laodToLoad__srcLoadArea____source_name_prime);
		srcArea__srcLoadArea____LoadArea.setName(srcArea__srcLoadArea____LoadArea_name_prime);
		srcLoadArea__srcArea____SubLoadAreas.setName(srcLoadArea__srcArea____SubLoadAreas_name_prime);
		laodToLoad__trgLoadArea____target.setName(laodToLoad__trgLoadArea____target_name_prime);
		return new Object[] { ruleresult, laodToLoad, trgArea, srcArea, srcLoadArea, trgLoadArea,
				trgArea__trgLoadArea____LoadArea, laodToLoad__srcLoadArea____source, srcArea__srcLoadArea____LoadArea,
				srcLoadArea__srcArea____SubLoadAreas, laodToLoad__trgLoadArea____target };
	}

	public static final void pattern_LoadArea_1_5_registerobjects_expressionBBBBBBBBBBBBB(LoadArea _this,
			PerformRuleResult ruleresult, EObject asset, EObject laodToLoad, EObject trgArea, EObject pair,
			EObject srcArea, EObject areaToArea, EObject srcLoadArea, EObject srcDeliver, EObject trgLoadArea,
			EObject srcGroup, EObject srcConsumer) {
		_this.registerObjects_FWD(ruleresult, asset, laodToLoad, trgArea, pair, srcArea, areaToArea, srcLoadArea,
				srcDeliver, trgLoadArea, srcGroup, srcConsumer);

	}

	public static final PerformRuleResult pattern_LoadArea_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LoadArea_2_1_preparereturnvalue_bindingFB(LoadArea _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LoadArea_2_1_preparereturnvalue_blackFBB(EClass eClass, LoadArea _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LoadArea_2_1_preparereturnvalue_bindingAndBlackFFB(LoadArea _this) {
		Object[] result_pattern_LoadArea_2_1_preparereturnvalue_binding = pattern_LoadArea_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_LoadArea_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_LoadArea_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_LoadArea_2_1_preparereturnvalue_black = pattern_LoadArea_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_LoadArea_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_LoadArea_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LoadArea_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "LoadArea";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_LoadArea_2_2_corematch_bindingFFFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("asset");
		EObject _localVariable_1 = match.getObject("pair");
		EObject _localVariable_2 = match.getObject("srcArea");
		EObject _localVariable_3 = match.getObject("srcLoadArea");
		EObject _localVariable_4 = match.getObject("srcDeliver");
		EObject _localVariable_5 = match.getObject("srcGroup");
		EObject _localVariable_6 = match.getObject("srcConsumer");
		EObject tmpAsset = _localVariable_0;
		EObject tmpPair = _localVariable_1;
		EObject tmpSrcArea = _localVariable_2;
		EObject tmpSrcLoadArea = _localVariable_3;
		EObject tmpSrcDeliver = _localVariable_4;
		EObject tmpSrcGroup = _localVariable_5;
		EObject tmpSrcConsumer = _localVariable_6;
		if (tmpAsset instanceof MeterAsset) {
			MeterAsset asset = (MeterAsset) tmpAsset;
			if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
				MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
				if (tmpSrcArea instanceof SubLoadArea) {
					SubLoadArea srcArea = (SubLoadArea) tmpSrcArea;
					if (tmpSrcLoadArea instanceof gluemodel.CIM.IEC61970.LoadModel.LoadArea) {
						gluemodel.CIM.IEC61970.LoadModel.LoadArea srcLoadArea = (gluemodel.CIM.IEC61970.LoadModel.LoadArea) tmpSrcLoadArea;
						if (tmpSrcDeliver instanceof ServiceDeliveryPoint) {
							ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) tmpSrcDeliver;
							if (tmpSrcGroup instanceof ConformLoadGroup) {
								ConformLoadGroup srcGroup = (ConformLoadGroup) tmpSrcGroup;
								if (tmpSrcConsumer instanceof ConformLoad) {
									ConformLoad srcConsumer = (ConformLoad) tmpSrcConsumer;
									return new Object[] { asset, pair, srcArea, srcLoadArea, srcDeliver, srcGroup,
											srcConsumer, match };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LoadArea_2_2_corematch_blackBFBBFBBBBB(MeterAsset asset,
			MeterAssetPhysicalDevicePair pair, SubLoadArea srcArea,
			gluemodel.CIM.IEC61970.LoadModel.LoadArea srcLoadArea, ServiceDeliveryPoint srcDeliver,
			ConformLoadGroup srcGroup, ConformLoad srcConsumer, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (SubLoadAreaToSubLoadArea areaToArea : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(srcArea, SubLoadAreaToSubLoadArea.class, "source")) {
			outagePreventionJointarget.SubLoadArea trgArea = areaToArea.getTarget();
			if (trgArea != null) {
				_result.add(new Object[] { asset, trgArea, pair, srcArea, areaToArea, srcLoadArea, srcDeliver, srcGroup,
						srcConsumer, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_LoadArea_2_3_findcontext_blackBBBBBBBBB(MeterAsset asset,
			outagePreventionJointarget.SubLoadArea trgArea, MeterAssetPhysicalDevicePair pair, SubLoadArea srcArea,
			SubLoadAreaToSubLoadArea areaToArea, gluemodel.CIM.IEC61970.LoadModel.LoadArea srcLoadArea,
			ServiceDeliveryPoint srcDeliver, ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (srcDeliver.equals(asset.getServiceDeliveryPoint())) {
			if (asset.equals(pair.getA())) {
				if (trgArea.equals(areaToArea.getTarget())) {
					if (srcArea.equals(areaToArea.getSource())) {
						if (srcConsumer.equals(srcDeliver.getEnergyConsumer())) {
							if (srcLoadArea.equals(srcArea.getLoadArea())) {
								if (srcArea.equals(srcGroup.getSubLoadArea())) {
									if (srcGroup.equals(srcConsumer.getLoadGroup())) {
										_result.add(new Object[] { asset, trgArea, pair, srcArea, areaToArea,
												srcLoadArea, srcDeliver, srcGroup, srcConsumer });
									}
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_LoadArea_2_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFFFF(MeterAsset asset,
			outagePreventionJointarget.SubLoadArea trgArea, MeterAssetPhysicalDevicePair pair, SubLoadArea srcArea,
			SubLoadAreaToSubLoadArea areaToArea, gluemodel.CIM.IEC61970.LoadModel.LoadArea srcLoadArea,
			ServiceDeliveryPoint srcDeliver, ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__asset____EndDeviceAssets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge areaToArea__trgArea____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge areaToArea__srcArea____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcArea__srcLoadArea____LoadArea = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLoadArea__srcArea____SubLoadAreas = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcGroup__srcArea____SubLoadArea = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcArea__srcGroup____LoadGroups = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcConsumer__srcGroup____LoadGroup = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcGroup__srcConsumer____EnergyConsumers = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String asset__srcDeliver____ServiceDeliveryPoint_name_prime = "ServiceDeliveryPoint";
		String srcDeliver__asset____EndDeviceAssets_name_prime = "EndDeviceAssets";
		String pair__asset____a_name_prime = "a";
		String areaToArea__trgArea____target_name_prime = "target";
		String areaToArea__srcArea____source_name_prime = "source";
		String srcDeliver__srcConsumer____EnergyConsumer_name_prime = "EnergyConsumer";
		String srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime = "ServiceDeliveryPoints";
		String srcArea__srcLoadArea____LoadArea_name_prime = "LoadArea";
		String srcLoadArea__srcArea____SubLoadAreas_name_prime = "SubLoadAreas";
		String srcGroup__srcArea____SubLoadArea_name_prime = "SubLoadArea";
		String srcArea__srcGroup____LoadGroups_name_prime = "LoadGroups";
		String srcConsumer__srcGroup____LoadGroup_name_prime = "LoadGroup";
		String srcGroup__srcConsumer____EnergyConsumers_name_prime = "EnergyConsumers";
		isApplicableMatch.getAllContextElements().add(asset);
		isApplicableMatch.getAllContextElements().add(trgArea);
		isApplicableMatch.getAllContextElements().add(pair);
		isApplicableMatch.getAllContextElements().add(srcArea);
		isApplicableMatch.getAllContextElements().add(areaToArea);
		isApplicableMatch.getAllContextElements().add(srcLoadArea);
		isApplicableMatch.getAllContextElements().add(srcDeliver);
		isApplicableMatch.getAllContextElements().add(srcGroup);
		isApplicableMatch.getAllContextElements().add(srcConsumer);
		asset__srcDeliver____ServiceDeliveryPoint.setSrc(asset);
		asset__srcDeliver____ServiceDeliveryPoint.setTrg(srcDeliver);
		isApplicableMatch.getAllContextElements().add(asset__srcDeliver____ServiceDeliveryPoint);
		srcDeliver__asset____EndDeviceAssets.setSrc(srcDeliver);
		srcDeliver__asset____EndDeviceAssets.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(srcDeliver__asset____EndDeviceAssets);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(pair__asset____a);
		areaToArea__trgArea____target.setSrc(areaToArea);
		areaToArea__trgArea____target.setTrg(trgArea);
		isApplicableMatch.getAllContextElements().add(areaToArea__trgArea____target);
		areaToArea__srcArea____source.setSrc(areaToArea);
		areaToArea__srcArea____source.setTrg(srcArea);
		isApplicableMatch.getAllContextElements().add(areaToArea__srcArea____source);
		srcDeliver__srcConsumer____EnergyConsumer.setSrc(srcDeliver);
		srcDeliver__srcConsumer____EnergyConsumer.setTrg(srcConsumer);
		isApplicableMatch.getAllContextElements().add(srcDeliver__srcConsumer____EnergyConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setSrc(srcConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setTrg(srcDeliver);
		isApplicableMatch.getAllContextElements().add(srcConsumer__srcDeliver____ServiceDeliveryPoints);
		srcArea__srcLoadArea____LoadArea.setSrc(srcArea);
		srcArea__srcLoadArea____LoadArea.setTrg(srcLoadArea);
		isApplicableMatch.getAllContextElements().add(srcArea__srcLoadArea____LoadArea);
		srcLoadArea__srcArea____SubLoadAreas.setSrc(srcLoadArea);
		srcLoadArea__srcArea____SubLoadAreas.setTrg(srcArea);
		isApplicableMatch.getAllContextElements().add(srcLoadArea__srcArea____SubLoadAreas);
		srcGroup__srcArea____SubLoadArea.setSrc(srcGroup);
		srcGroup__srcArea____SubLoadArea.setTrg(srcArea);
		isApplicableMatch.getAllContextElements().add(srcGroup__srcArea____SubLoadArea);
		srcArea__srcGroup____LoadGroups.setSrc(srcArea);
		srcArea__srcGroup____LoadGroups.setTrg(srcGroup);
		isApplicableMatch.getAllContextElements().add(srcArea__srcGroup____LoadGroups);
		srcConsumer__srcGroup____LoadGroup.setSrc(srcConsumer);
		srcConsumer__srcGroup____LoadGroup.setTrg(srcGroup);
		isApplicableMatch.getAllContextElements().add(srcConsumer__srcGroup____LoadGroup);
		srcGroup__srcConsumer____EnergyConsumers.setSrc(srcGroup);
		srcGroup__srcConsumer____EnergyConsumers.setTrg(srcConsumer);
		isApplicableMatch.getAllContextElements().add(srcGroup__srcConsumer____EnergyConsumers);
		asset__srcDeliver____ServiceDeliveryPoint.setName(asset__srcDeliver____ServiceDeliveryPoint_name_prime);
		srcDeliver__asset____EndDeviceAssets.setName(srcDeliver__asset____EndDeviceAssets_name_prime);
		pair__asset____a.setName(pair__asset____a_name_prime);
		areaToArea__trgArea____target.setName(areaToArea__trgArea____target_name_prime);
		areaToArea__srcArea____source.setName(areaToArea__srcArea____source_name_prime);
		srcDeliver__srcConsumer____EnergyConsumer.setName(srcDeliver__srcConsumer____EnergyConsumer_name_prime);
		srcConsumer__srcDeliver____ServiceDeliveryPoints
				.setName(srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime);
		srcArea__srcLoadArea____LoadArea.setName(srcArea__srcLoadArea____LoadArea_name_prime);
		srcLoadArea__srcArea____SubLoadAreas.setName(srcLoadArea__srcArea____SubLoadAreas_name_prime);
		srcGroup__srcArea____SubLoadArea.setName(srcGroup__srcArea____SubLoadArea_name_prime);
		srcArea__srcGroup____LoadGroups.setName(srcArea__srcGroup____LoadGroups_name_prime);
		srcConsumer__srcGroup____LoadGroup.setName(srcConsumer__srcGroup____LoadGroup_name_prime);
		srcGroup__srcConsumer____EnergyConsumers.setName(srcGroup__srcConsumer____EnergyConsumers_name_prime);
		return new Object[] { asset, trgArea, pair, srcArea, areaToArea, srcLoadArea, srcDeliver, srcGroup, srcConsumer,
				isApplicableMatch, asset__srcDeliver____ServiceDeliveryPoint, srcDeliver__asset____EndDeviceAssets,
				pair__asset____a, areaToArea__trgArea____target, areaToArea__srcArea____source,
				srcDeliver__srcConsumer____EnergyConsumer, srcConsumer__srcDeliver____ServiceDeliveryPoints,
				srcArea__srcLoadArea____LoadArea, srcLoadArea__srcArea____SubLoadAreas,
				srcGroup__srcArea____SubLoadArea, srcArea__srcGroup____LoadGroups, srcConsumer__srcGroup____LoadGroup,
				srcGroup__srcConsumer____EnergyConsumers };
	}

	public static final Object[] pattern_LoadArea_2_4_solveCSP_bindingFBBBBBBBBBBB(LoadArea _this,
			IsApplicableMatch isApplicableMatch, MeterAsset asset, outagePreventionJointarget.SubLoadArea trgArea,
			MeterAssetPhysicalDevicePair pair, SubLoadArea srcArea, SubLoadAreaToSubLoadArea areaToArea,
			gluemodel.CIM.IEC61970.LoadModel.LoadArea srcLoadArea, ServiceDeliveryPoint srcDeliver,
			ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, asset, trgArea, pair, srcArea,
				areaToArea, srcLoadArea, srcDeliver, srcGroup, srcConsumer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, asset, trgArea, pair, srcArea, areaToArea, srcLoadArea,
					srcDeliver, srcGroup, srcConsumer };
		}
		return null;
	}

	public static final Object[] pattern_LoadArea_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LoadArea_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(LoadArea _this,
			IsApplicableMatch isApplicableMatch, MeterAsset asset, outagePreventionJointarget.SubLoadArea trgArea,
			MeterAssetPhysicalDevicePair pair, SubLoadArea srcArea, SubLoadAreaToSubLoadArea areaToArea,
			gluemodel.CIM.IEC61970.LoadModel.LoadArea srcLoadArea, ServiceDeliveryPoint srcDeliver,
			ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		Object[] result_pattern_LoadArea_2_4_solveCSP_binding = pattern_LoadArea_2_4_solveCSP_bindingFBBBBBBBBBBB(_this,
				isApplicableMatch, asset, trgArea, pair, srcArea, areaToArea, srcLoadArea, srcDeliver, srcGroup,
				srcConsumer);
		if (result_pattern_LoadArea_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LoadArea_2_4_solveCSP_binding[0];

			Object[] result_pattern_LoadArea_2_4_solveCSP_black = pattern_LoadArea_2_4_solveCSP_blackB(csp);
			if (result_pattern_LoadArea_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, asset, trgArea, pair, srcArea, areaToArea,
						srcLoadArea, srcDeliver, srcGroup, srcConsumer };
			}
		}
		return null;
	}

	public static final boolean pattern_LoadArea_2_5_checkCSP_expressionFBB(LoadArea _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LoadArea_2_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_LoadArea_2_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "LoadArea";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_LoadArea_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LoadArea_10_1_preparereturnvalue_bindingFB(LoadArea _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LoadArea_10_1_preparereturnvalue_blackFBBF(EClass __eClass, LoadArea _this) {
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

	public static final Object[] pattern_LoadArea_10_1_preparereturnvalue_bindingAndBlackFFBF(LoadArea _this) {
		Object[] result_pattern_LoadArea_10_1_preparereturnvalue_binding = pattern_LoadArea_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_LoadArea_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_LoadArea_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_LoadArea_10_1_preparereturnvalue_black = pattern_LoadArea_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_LoadArea_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_LoadArea_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_LoadArea_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_LoadArea_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_LoadArea_10_2_testcorematchandDECs_black_nac_0BB(
			gluemodel.CIM.IEC61970.LoadModel.LoadArea srcLoadArea, SubLoadArea srcArea) {
		for (SubLoadArea __DEC_srcLoadArea_LoadArea_818675 : srcLoadArea.getSubLoadAreas()) {
			if (!srcArea.equals(__DEC_srcLoadArea_LoadArea_818675)) {
				return new Object[] { srcLoadArea, srcArea };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LoadArea_10_2_testcorematchandDECs_blackFFFFFFFB(
			EMoflonEdge _edge_LoadArea) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSrcArea = _edge_LoadArea.getSrc();
		if (tmpSrcArea instanceof SubLoadArea) {
			SubLoadArea srcArea = (SubLoadArea) tmpSrcArea;
			EObject tmpSrcLoadArea = _edge_LoadArea.getTrg();
			if (tmpSrcLoadArea instanceof gluemodel.CIM.IEC61970.LoadModel.LoadArea) {
				gluemodel.CIM.IEC61970.LoadModel.LoadArea srcLoadArea = (gluemodel.CIM.IEC61970.LoadModel.LoadArea) tmpSrcLoadArea;
				if (srcLoadArea.equals(srcArea.getLoadArea())) {
					if (pattern_LoadArea_10_2_testcorematchandDECs_black_nac_0BB(srcLoadArea, srcArea) == null) {
						for (LoadGroup tmpSrcGroup : srcArea.getLoadGroups()) {
							if (tmpSrcGroup instanceof ConformLoadGroup) {
								ConformLoadGroup srcGroup = (ConformLoadGroup) tmpSrcGroup;
								for (ConformLoad srcConsumer : srcGroup.getEnergyConsumers()) {
									for (ServiceDeliveryPoint srcDeliver : srcConsumer.getServiceDeliveryPoints()) {
										for (EndDeviceAsset tmpAsset : srcDeliver.getEndDeviceAssets()) {
											if (tmpAsset instanceof MeterAsset) {
												MeterAsset asset = (MeterAsset) tmpAsset;
												for (MeterAssetPhysicalDevicePair pair : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(asset,
																MeterAssetPhysicalDevicePair.class, "a")) {
													_result.add(new Object[] { asset, pair, srcArea, srcLoadArea,
															srcDeliver, srcGroup, srcConsumer, _edge_LoadArea });
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

		return _result;
	}

	public static final Object[] pattern_LoadArea_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_LoadArea_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBBB(
			LoadArea _this, Match match, MeterAsset asset, MeterAssetPhysicalDevicePair pair, SubLoadArea srcArea,
			gluemodel.CIM.IEC61970.LoadModel.LoadArea srcLoadArea, ServiceDeliveryPoint srcDeliver,
			ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, asset, pair, srcArea, srcLoadArea, srcDeliver,
				srcGroup, srcConsumer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_LoadArea_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			LoadArea _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LoadArea_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_LoadArea_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_LoadArea_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_LoadArea_13_1_matchtggpattern_black_nac_0BB(
			gluemodel.CIM.IEC61970.LoadModel.LoadArea srcLoadArea, SubLoadArea srcArea) {
		for (SubLoadArea __DEC_srcLoadArea_LoadArea_212072 : srcLoadArea.getSubLoadAreas()) {
			if (!srcArea.equals(__DEC_srcLoadArea_LoadArea_212072)) {
				return new Object[] { srcLoadArea, srcArea };
			}
		}
		return null;
	}

	public static final Object[] pattern_LoadArea_13_1_matchtggpattern_blackBBBBBBB(MeterAsset asset,
			MeterAssetPhysicalDevicePair pair, SubLoadArea srcArea,
			gluemodel.CIM.IEC61970.LoadModel.LoadArea srcLoadArea, ServiceDeliveryPoint srcDeliver,
			ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		if (srcDeliver.equals(asset.getServiceDeliveryPoint())) {
			if (asset.equals(pair.getA())) {
				if (srcConsumer.equals(srcDeliver.getEnergyConsumer())) {
					if (srcLoadArea.equals(srcArea.getLoadArea())) {
						if (srcArea.equals(srcGroup.getSubLoadArea())) {
							if (srcGroup.equals(srcConsumer.getLoadGroup())) {
								if (pattern_LoadArea_13_1_matchtggpattern_black_nac_0BB(srcLoadArea, srcArea) == null) {
									return new Object[] { asset, pair, srcArea, srcLoadArea, srcDeliver, srcGroup,
											srcConsumer };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_LoadArea_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LoadArea_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //LoadAreaImpl
