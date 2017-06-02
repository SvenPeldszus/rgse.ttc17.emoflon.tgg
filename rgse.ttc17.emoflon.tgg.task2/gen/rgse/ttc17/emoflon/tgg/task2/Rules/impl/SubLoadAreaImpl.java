/**
 */
package rgse.ttc17.emoflon.tgg.task2.Rules.impl;

import gluemodel.CIM.IEC61968.Metering.EndDeviceAsset;
import gluemodel.CIM.IEC61968.Metering.MeterAsset;
import gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint;

import gluemodel.CIM.IEC61970.LoadModel.ConformLoad;
import gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup;
import gluemodel.CIM.IEC61970.LoadModel.LoadGroup;

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

import rgse.ttc17.emoflon.tgg.task2.ConformLoadGroupToConformLoadGroup;

import rgse.ttc17.emoflon.tgg.task2.Rules.RulesPackage;
import rgse.ttc17.emoflon.tgg.task2.Rules.SubLoadArea;

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
 * An implementation of the model object '<em><b>Sub Load Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SubLoadAreaImpl extends AbstractRuleImpl implements SubLoadArea {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubLoadAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getSubLoadArea();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ServiceDeliveryPoint srcDeliver, MeterAsset asset,
			MeterAssetPhysicalDevicePair pair, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea,
			ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		// initial bindings
		Object[] result1_black = SubLoadAreaImpl.pattern_SubLoadArea_0_1_initialbindings_blackBBBBBBBB(this, match,
				srcDeliver, asset, pair, srcArea, srcGroup, srcConsumer);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[srcDeliver] = " + srcDeliver + ", "
					+ "[asset] = " + asset + ", " + "[pair] = " + pair + ", " + "[srcArea] = " + srcArea + ", "
					+ "[srcGroup] = " + srcGroup + ", " + "[srcConsumer] = " + srcConsumer + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = SubLoadAreaImpl.pattern_SubLoadArea_0_2_SolveCSP_bindingAndBlackFBBBBBBBB(
				this, match, srcDeliver, asset, pair, srcArea, srcGroup, srcConsumer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[srcDeliver] = " + srcDeliver + ", " + "[asset] = "
					+ asset + ", " + "[pair] = " + pair + ", " + "[srcArea] = " + srcArea + ", " + "[srcGroup] = "
					+ srcGroup + ", " + "[srcConsumer] = " + srcConsumer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (SubLoadAreaImpl.pattern_SubLoadArea_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = SubLoadAreaImpl.pattern_SubLoadArea_0_4_collectelementstobetranslated_blackBBBBBBB(
					match, srcDeliver, asset, pair, srcArea, srcGroup, srcConsumer);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[srcDeliver] = " + srcDeliver + ", "
						+ "[asset] = " + asset + ", " + "[pair] = " + pair + ", " + "[srcArea] = " + srcArea + ", "
						+ "[srcGroup] = " + srcGroup + ", " + "[srcConsumer] = " + srcConsumer + ".");
			}
			SubLoadAreaImpl.pattern_SubLoadArea_0_4_collectelementstobetranslated_greenBBBFF(match, srcArea, srcGroup);
			// EMoflonEdge srcGroup__srcArea____SubLoadArea = (EMoflonEdge) result4_green[3];
			// EMoflonEdge srcArea__srcGroup____LoadGroups = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = SubLoadAreaImpl.pattern_SubLoadArea_0_5_collectcontextelements_blackBBBBBBB(match,
					srcDeliver, asset, pair, srcArea, srcGroup, srcConsumer);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[srcDeliver] = " + srcDeliver + ", "
						+ "[asset] = " + asset + ", " + "[pair] = " + pair + ", " + "[srcArea] = " + srcArea + ", "
						+ "[srcGroup] = " + srcGroup + ", " + "[srcConsumer] = " + srcConsumer + ".");
			}
			SubLoadAreaImpl.pattern_SubLoadArea_0_5_collectcontextelements_greenBBBBBBFFFFFFF(match, srcDeliver, asset,
					pair, srcGroup, srcConsumer);
			// EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = (EMoflonEdge) result5_green[6];
			// EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = (EMoflonEdge) result5_green[7];
			// EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = (EMoflonEdge) result5_green[8];
			// EMoflonEdge srcDeliver__asset____EndDeviceAssets = (EMoflonEdge) result5_green[9];
			// EMoflonEdge pair__asset____a = (EMoflonEdge) result5_green[10];
			// EMoflonEdge srcConsumer__srcGroup____LoadGroup = (EMoflonEdge) result5_green[11];
			// EMoflonEdge srcGroup__srcConsumer____EnergyConsumers = (EMoflonEdge) result5_green[12];

			// register objects to match
			SubLoadAreaImpl.pattern_SubLoadArea_0_6_registerobjectstomatch_expressionBBBBBBBB(this, match, srcDeliver,
					asset, pair, srcArea, srcGroup, srcConsumer);
			return SubLoadAreaImpl.pattern_SubLoadArea_0_7_expressionF();
		} else {
			return SubLoadAreaImpl.pattern_SubLoadArea_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = SubLoadAreaImpl
				.pattern_SubLoadArea_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result1_bindingAndBlack[0];
		MeterAsset asset = (MeterAsset) result1_bindingAndBlack[1];
		ConformLoadGroupToConformLoadGroup groupToGroup = (ConformLoadGroupToConformLoadGroup) result1_bindingAndBlack[2];
		outagePreventionJointarget.ConformLoadGroup trgGroup = (outagePreventionJointarget.ConformLoadGroup) result1_bindingAndBlack[3];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result1_bindingAndBlack[4];
		gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea = (gluemodel.CIM.IEC61970.LoadModel.SubLoadArea) result1_bindingAndBlack[5];
		ConformLoadGroup srcGroup = (ConformLoadGroup) result1_bindingAndBlack[6];
		ConformLoad srcConsumer = (ConformLoad) result1_bindingAndBlack[7];
		// CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = SubLoadAreaImpl.pattern_SubLoadArea_1_1_performtransformation_greenBFBF(trgGroup,
				srcArea);
		outagePreventionJointarget.SubLoadArea trgArea = (outagePreventionJointarget.SubLoadArea) result1_green[1];
		SubLoadAreaToSubLoadArea areaToArea = (SubLoadAreaToSubLoadArea) result1_green[3];

		// collect translated elements
		Object[] result2_black = SubLoadAreaImpl.pattern_SubLoadArea_1_2_collecttranslatedelements_blackBBB(trgArea,
				srcArea, areaToArea);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed." + " Variables: " + "[trgArea] = "
							+ trgArea + ", " + "[srcArea] = " + srcArea + ", " + "[areaToArea] = " + areaToArea + ".");
		}
		Object[] result2_green = SubLoadAreaImpl.pattern_SubLoadArea_1_2_collecttranslatedelements_greenFBBB(trgArea,
				srcArea, areaToArea);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = SubLoadAreaImpl.pattern_SubLoadArea_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
				ruleresult, srcDeliver, asset, groupToGroup, trgGroup, trgArea, pair, srcArea, areaToArea, srcGroup,
				srcConsumer);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[srcDeliver] = " + srcDeliver + ", " + "[asset] = "
					+ asset + ", " + "[groupToGroup] = " + groupToGroup + ", " + "[trgGroup] = " + trgGroup + ", "
					+ "[trgArea] = " + trgArea + ", " + "[pair] = " + pair + ", " + "[srcArea] = " + srcArea + ", "
					+ "[areaToArea] = " + areaToArea + ", " + "[srcGroup] = " + srcGroup + ", " + "[srcConsumer] = "
					+ srcConsumer + ".");
		}
		SubLoadAreaImpl.pattern_SubLoadArea_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, trgGroup, trgArea,
				srcArea, areaToArea, srcGroup);
		// EMoflonEdge trgGroup__trgArea____SubLoadArea = (EMoflonEdge) result3_green[6];
		// EMoflonEdge areaToArea__trgArea____target = (EMoflonEdge) result3_green[7];
		// EMoflonEdge areaToArea__srcArea____source = (EMoflonEdge) result3_green[8];
		// EMoflonEdge srcGroup__srcArea____SubLoadArea = (EMoflonEdge) result3_green[9];
		// EMoflonEdge srcArea__srcGroup____LoadGroups = (EMoflonEdge) result3_green[10];

		// perform postprocessing story node is empty
		// register objects
		SubLoadAreaImpl.pattern_SubLoadArea_1_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult, srcDeliver,
				asset, groupToGroup, trgGroup, trgArea, pair, srcArea, areaToArea, srcGroup, srcConsumer);
		return SubLoadAreaImpl.pattern_SubLoadArea_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = SubLoadAreaImpl
				.pattern_SubLoadArea_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SubLoadAreaImpl.pattern_SubLoadArea_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = SubLoadAreaImpl.pattern_SubLoadArea_2_2_corematch_bindingFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result2_binding[0];
		MeterAsset asset = (MeterAsset) result2_binding[1];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_binding[2];
		gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea = (gluemodel.CIM.IEC61970.LoadModel.SubLoadArea) result2_binding[3];
		ConformLoadGroup srcGroup = (ConformLoadGroup) result2_binding[4];
		ConformLoad srcConsumer = (ConformLoad) result2_binding[5];
		for (Object[] result2_black : SubLoadAreaImpl.pattern_SubLoadArea_2_2_corematch_blackBBFFBBBBB(srcDeliver,
				asset, pair, srcArea, srcGroup, srcConsumer, match)) {
			ConformLoadGroupToConformLoadGroup groupToGroup = (ConformLoadGroupToConformLoadGroup) result2_black[2];
			outagePreventionJointarget.ConformLoadGroup trgGroup = (outagePreventionJointarget.ConformLoadGroup) result2_black[3];
			// ForEach find context
			for (Object[] result3_black : SubLoadAreaImpl.pattern_SubLoadArea_2_3_findcontext_blackBBBBBBBB(srcDeliver,
					asset, groupToGroup, trgGroup, pair, srcArea, srcGroup, srcConsumer)) {
				Object[] result3_green = SubLoadAreaImpl.pattern_SubLoadArea_2_3_findcontext_greenBBBBBBBBFFFFFFFFFFFF(
						srcDeliver, asset, groupToGroup, trgGroup, pair, srcArea, srcGroup, srcConsumer);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				// EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = (EMoflonEdge) result3_green[9];
				// EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = (EMoflonEdge) result3_green[10];
				// EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = (EMoflonEdge) result3_green[11];
				// EMoflonEdge srcDeliver__asset____EndDeviceAssets = (EMoflonEdge) result3_green[12];
				// EMoflonEdge groupToGroup__trgGroup____target = (EMoflonEdge) result3_green[13];
				// EMoflonEdge pair__asset____a = (EMoflonEdge) result3_green[14];
				// EMoflonEdge groupToGroup__srcGroup____source = (EMoflonEdge) result3_green[15];
				// EMoflonEdge srcConsumer__srcGroup____LoadGroup = (EMoflonEdge) result3_green[16];
				// EMoflonEdge srcGroup__srcConsumer____EnergyConsumers = (EMoflonEdge) result3_green[17];
				// EMoflonEdge srcGroup__srcArea____SubLoadArea = (EMoflonEdge) result3_green[18];
				// EMoflonEdge srcArea__srcGroup____LoadGroups = (EMoflonEdge) result3_green[19];

				// solve CSP
				Object[] result4_bindingAndBlack = SubLoadAreaImpl
						.pattern_SubLoadArea_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
								srcDeliver, asset, groupToGroup, trgGroup, pair, srcArea, srcGroup, srcConsumer);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[srcDeliver] = " + srcDeliver + ", " + "[asset] = " + asset + ", " + "[groupToGroup] = "
							+ groupToGroup + ", " + "[trgGroup] = " + trgGroup + ", " + "[pair] = " + pair + ", "
							+ "[srcArea] = " + srcArea + ", " + "[srcGroup] = " + srcGroup + ", " + "[srcConsumer] = "
							+ srcConsumer + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (SubLoadAreaImpl.pattern_SubLoadArea_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = SubLoadAreaImpl
							.pattern_SubLoadArea_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					SubLoadAreaImpl.pattern_SubLoadArea_2_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SubLoadAreaImpl.pattern_SubLoadArea_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ServiceDeliveryPoint srcDeliver, MeterAsset asset,
			MeterAssetPhysicalDevicePair pair, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea,
			ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		match.registerObject("srcDeliver", srcDeliver);
		match.registerObject("asset", asset);
		match.registerObject("pair", pair);
		match.registerObject("srcArea", srcArea);
		match.registerObject("srcGroup", srcGroup);
		match.registerObject("srcConsumer", srcConsumer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ServiceDeliveryPoint srcDeliver, MeterAsset asset,
			MeterAssetPhysicalDevicePair pair, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea,
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, ServiceDeliveryPoint srcDeliver,
			MeterAsset asset, ConformLoadGroupToConformLoadGroup groupToGroup,
			outagePreventionJointarget.ConformLoadGroup trgGroup, MeterAssetPhysicalDevicePair pair,
			gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea, ConformLoadGroup srcGroup, ConformLoad srcConsumer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("srcDeliver", srcDeliver);
		isApplicableMatch.registerObject("asset", asset);
		isApplicableMatch.registerObject("groupToGroup", groupToGroup);
		isApplicableMatch.registerObject("trgGroup", trgGroup);
		isApplicableMatch.registerObject("pair", pair);
		isApplicableMatch.registerObject("srcArea", srcArea);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject srcDeliver, EObject asset,
			EObject groupToGroup, EObject trgGroup, EObject trgArea, EObject pair, EObject srcArea, EObject areaToArea,
			EObject srcGroup, EObject srcConsumer) {
		ruleresult.registerObject("srcDeliver", srcDeliver);
		ruleresult.registerObject("asset", asset);
		ruleresult.registerObject("groupToGroup", groupToGroup);
		ruleresult.registerObject("trgGroup", trgGroup);
		ruleresult.registerObject("trgArea", trgArea);
		ruleresult.registerObject("pair", pair);
		ruleresult.registerObject("srcArea", srcArea);
		ruleresult.registerObject("areaToArea", areaToArea);
		ruleresult.registerObject("srcGroup", srcGroup);
		ruleresult.registerObject("srcConsumer", srcConsumer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("srcArea").eClass())
				.equals("gluemodel.CIM.IEC61970.LoadModel.SubLoadArea.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_33(EMoflonEdge _edge_SubLoadArea) {
		// prepare return value
		Object[] result1_bindingAndBlack = SubLoadAreaImpl
				.pattern_SubLoadArea_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = SubLoadAreaImpl.pattern_SubLoadArea_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SubLoadAreaImpl
				.pattern_SubLoadArea_10_2_testcorematchandDECs_blackFFFFFFB(_edge_SubLoadArea)) {
			ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result2_black[0];
			MeterAsset asset = (MeterAsset) result2_black[1];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_black[2];
			gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea = (gluemodel.CIM.IEC61970.LoadModel.SubLoadArea) result2_black[3];
			ConformLoadGroup srcGroup = (ConformLoadGroup) result2_black[4];
			ConformLoad srcConsumer = (ConformLoad) result2_black[5];
			Object[] result2_green = SubLoadAreaImpl.pattern_SubLoadArea_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SubLoadAreaImpl.pattern_SubLoadArea_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBB(
					this, match, srcDeliver, asset, pair, srcArea, srcGroup, srcConsumer)) {
				// Ensure that the correct types of elements are matched
				if (SubLoadAreaImpl
						.pattern_SubLoadArea_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = SubLoadAreaImpl.pattern_SubLoadArea_10_5_Addmatchtoruleresult_blackBBBB(
							match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					SubLoadAreaImpl.pattern_SubLoadArea_10_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return SubLoadAreaImpl.pattern_SubLoadArea_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("SubLoadArea");
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
	public boolean checkDEC_FWD(ServiceDeliveryPoint srcDeliver, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea, ConformLoadGroup srcGroup, ConformLoad srcConsumer) {// match tgg pattern
		Object[] result1_black = SubLoadAreaImpl.pattern_SubLoadArea_13_1_matchtggpattern_blackBBBBBB(srcDeliver, asset,
				pair, srcArea, srcGroup, srcConsumer);
		if (result1_black != null) {
			return SubLoadAreaImpl.pattern_SubLoadArea_13_2_expressionF();
		} else {
			return SubLoadAreaImpl.pattern_SubLoadArea_13_3_expressionF();
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
		case RulesPackage.SUB_LOAD_AREA___IS_APPROPRIATE_FWD__MATCH_SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR_SUBLOADAREA_CONFORMLOADGROUP_CONFORMLOAD:
			return isAppropriate_FWD((Match) arguments.get(0), (ServiceDeliveryPoint) arguments.get(1),
					(MeterAsset) arguments.get(2), (MeterAssetPhysicalDevicePair) arguments.get(3),
					(gluemodel.CIM.IEC61970.LoadModel.SubLoadArea) arguments.get(4),
					(ConformLoadGroup) arguments.get(5), (ConformLoad) arguments.get(6));
		case RulesPackage.SUB_LOAD_AREA___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SUB_LOAD_AREA___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SUB_LOAD_AREA___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR_SUBLOADAREA_CONFORMLOADGROUP_CONFORMLOAD:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ServiceDeliveryPoint) arguments.get(1),
					(MeterAsset) arguments.get(2), (MeterAssetPhysicalDevicePair) arguments.get(3),
					(gluemodel.CIM.IEC61970.LoadModel.SubLoadArea) arguments.get(4),
					(ConformLoadGroup) arguments.get(5), (ConformLoad) arguments.get(6));
			return null;
		case RulesPackage.SUB_LOAD_AREA___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR_SUBLOADAREA_CONFORMLOADGROUP_CONFORMLOAD:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ServiceDeliveryPoint) arguments.get(1),
					(MeterAsset) arguments.get(2), (MeterAssetPhysicalDevicePair) arguments.get(3),
					(gluemodel.CIM.IEC61970.LoadModel.SubLoadArea) arguments.get(4),
					(ConformLoadGroup) arguments.get(5), (ConformLoad) arguments.get(6));
		case RulesPackage.SUB_LOAD_AREA___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SUB_LOAD_AREA___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SERVICEDELIVERYPOINT_METERASSET_CONFORMLOADGROUPTOCONFORMLOADGROUP_CONFORMLOADGROUP_METERASSETPHYSICALDEVICEPAIR_SUBLOADAREA_CONFORMLOADGROUP_CONFORMLOAD:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(ServiceDeliveryPoint) arguments.get(1), (MeterAsset) arguments.get(2),
					(ConformLoadGroupToConformLoadGroup) arguments.get(3),
					(outagePreventionJointarget.ConformLoadGroup) arguments.get(4),
					(MeterAssetPhysicalDevicePair) arguments.get(5),
					(gluemodel.CIM.IEC61970.LoadModel.SubLoadArea) arguments.get(6),
					(ConformLoadGroup) arguments.get(7), (ConformLoad) arguments.get(8));
		case RulesPackage.SUB_LOAD_AREA___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SUB_LOAD_AREA___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.SUB_LOAD_AREA___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SUB_LOAD_AREA___IS_APPROPRIATE_FWD_EMOFLON_EDGE_33__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_33((EMoflonEdge) arguments.get(0));
		case RulesPackage.SUB_LOAD_AREA___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SUB_LOAD_AREA___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.SUB_LOAD_AREA___CHECK_DEC_FWD__SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR_SUBLOADAREA_CONFORMLOADGROUP_CONFORMLOAD:
			return checkDEC_FWD((ServiceDeliveryPoint) arguments.get(0), (MeterAsset) arguments.get(1),
					(MeterAssetPhysicalDevicePair) arguments.get(2),
					(gluemodel.CIM.IEC61970.LoadModel.SubLoadArea) arguments.get(3),
					(ConformLoadGroup) arguments.get(4), (ConformLoad) arguments.get(5));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_SubLoadArea_0_1_initialbindings_blackBBBBBBBB(SubLoadArea _this, Match match,
			ServiceDeliveryPoint srcDeliver, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea, ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		return new Object[] { _this, match, srcDeliver, asset, pair, srcArea, srcGroup, srcConsumer };
	}

	public static final Object[] pattern_SubLoadArea_0_2_SolveCSP_bindingFBBBBBBBB(SubLoadArea _this, Match match,
			ServiceDeliveryPoint srcDeliver, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea, ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, srcDeliver, asset, pair, srcArea, srcGroup,
				srcConsumer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, srcDeliver, asset, pair, srcArea, srcGroup, srcConsumer };
		}
		return null;
	}

	public static final Object[] pattern_SubLoadArea_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SubLoadArea_0_2_SolveCSP_bindingAndBlackFBBBBBBBB(SubLoadArea _this,
			Match match, ServiceDeliveryPoint srcDeliver, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea, ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		Object[] result_pattern_SubLoadArea_0_2_SolveCSP_binding = pattern_SubLoadArea_0_2_SolveCSP_bindingFBBBBBBBB(
				_this, match, srcDeliver, asset, pair, srcArea, srcGroup, srcConsumer);
		if (result_pattern_SubLoadArea_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SubLoadArea_0_2_SolveCSP_binding[0];

			Object[] result_pattern_SubLoadArea_0_2_SolveCSP_black = pattern_SubLoadArea_0_2_SolveCSP_blackB(csp);
			if (result_pattern_SubLoadArea_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, srcDeliver, asset, pair, srcArea, srcGroup, srcConsumer };
			}
		}
		return null;
	}

	public static final boolean pattern_SubLoadArea_0_3_CheckCSP_expressionFBB(SubLoadArea _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SubLoadArea_0_4_collectelementstobetranslated_blackBBBBBBB(Match match,
			ServiceDeliveryPoint srcDeliver, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea, ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		return new Object[] { match, srcDeliver, asset, pair, srcArea, srcGroup, srcConsumer };
	}

	public static final Object[] pattern_SubLoadArea_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea, ConformLoadGroup srcGroup) {
		EMoflonEdge srcGroup__srcArea____SubLoadArea = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcArea__srcGroup____LoadGroups = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(srcArea);
		String srcGroup__srcArea____SubLoadArea_name_prime = "SubLoadArea";
		String srcArea__srcGroup____LoadGroups_name_prime = "LoadGroups";
		srcGroup__srcArea____SubLoadArea.setSrc(srcGroup);
		srcGroup__srcArea____SubLoadArea.setTrg(srcArea);
		match.getToBeTranslatedEdges().add(srcGroup__srcArea____SubLoadArea);
		srcArea__srcGroup____LoadGroups.setSrc(srcArea);
		srcArea__srcGroup____LoadGroups.setTrg(srcGroup);
		match.getToBeTranslatedEdges().add(srcArea__srcGroup____LoadGroups);
		srcGroup__srcArea____SubLoadArea.setName(srcGroup__srcArea____SubLoadArea_name_prime);
		srcArea__srcGroup____LoadGroups.setName(srcArea__srcGroup____LoadGroups_name_prime);
		return new Object[] { match, srcArea, srcGroup, srcGroup__srcArea____SubLoadArea,
				srcArea__srcGroup____LoadGroups };
	}

	public static final Object[] pattern_SubLoadArea_0_5_collectcontextelements_blackBBBBBBB(Match match,
			ServiceDeliveryPoint srcDeliver, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea, ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		return new Object[] { match, srcDeliver, asset, pair, srcArea, srcGroup, srcConsumer };
	}

	public static final Object[] pattern_SubLoadArea_0_5_collectcontextelements_greenBBBBBBFFFFFFF(Match match,
			ServiceDeliveryPoint srcDeliver, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__asset____EndDeviceAssets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcConsumer__srcGroup____LoadGroup = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcGroup__srcConsumer____EnergyConsumers = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(srcDeliver);
		match.getContextNodes().add(asset);
		match.getContextNodes().add(pair);
		match.getContextNodes().add(srcGroup);
		match.getContextNodes().add(srcConsumer);
		String srcDeliver__srcConsumer____EnergyConsumer_name_prime = "EnergyConsumer";
		String srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime = "ServiceDeliveryPoints";
		String asset__srcDeliver____ServiceDeliveryPoint_name_prime = "ServiceDeliveryPoint";
		String srcDeliver__asset____EndDeviceAssets_name_prime = "EndDeviceAssets";
		String pair__asset____a_name_prime = "a";
		String srcConsumer__srcGroup____LoadGroup_name_prime = "LoadGroup";
		String srcGroup__srcConsumer____EnergyConsumers_name_prime = "EnergyConsumers";
		srcDeliver__srcConsumer____EnergyConsumer.setSrc(srcDeliver);
		srcDeliver__srcConsumer____EnergyConsumer.setTrg(srcConsumer);
		match.getContextEdges().add(srcDeliver__srcConsumer____EnergyConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setSrc(srcConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setTrg(srcDeliver);
		match.getContextEdges().add(srcConsumer__srcDeliver____ServiceDeliveryPoints);
		asset__srcDeliver____ServiceDeliveryPoint.setSrc(asset);
		asset__srcDeliver____ServiceDeliveryPoint.setTrg(srcDeliver);
		match.getContextEdges().add(asset__srcDeliver____ServiceDeliveryPoint);
		srcDeliver__asset____EndDeviceAssets.setSrc(srcDeliver);
		srcDeliver__asset____EndDeviceAssets.setTrg(asset);
		match.getContextEdges().add(srcDeliver__asset____EndDeviceAssets);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		match.getContextEdges().add(pair__asset____a);
		srcConsumer__srcGroup____LoadGroup.setSrc(srcConsumer);
		srcConsumer__srcGroup____LoadGroup.setTrg(srcGroup);
		match.getContextEdges().add(srcConsumer__srcGroup____LoadGroup);
		srcGroup__srcConsumer____EnergyConsumers.setSrc(srcGroup);
		srcGroup__srcConsumer____EnergyConsumers.setTrg(srcConsumer);
		match.getContextEdges().add(srcGroup__srcConsumer____EnergyConsumers);
		srcDeliver__srcConsumer____EnergyConsumer.setName(srcDeliver__srcConsumer____EnergyConsumer_name_prime);
		srcConsumer__srcDeliver____ServiceDeliveryPoints
				.setName(srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime);
		asset__srcDeliver____ServiceDeliveryPoint.setName(asset__srcDeliver____ServiceDeliveryPoint_name_prime);
		srcDeliver__asset____EndDeviceAssets.setName(srcDeliver__asset____EndDeviceAssets_name_prime);
		pair__asset____a.setName(pair__asset____a_name_prime);
		srcConsumer__srcGroup____LoadGroup.setName(srcConsumer__srcGroup____LoadGroup_name_prime);
		srcGroup__srcConsumer____EnergyConsumers.setName(srcGroup__srcConsumer____EnergyConsumers_name_prime);
		return new Object[] { match, srcDeliver, asset, pair, srcGroup, srcConsumer,
				srcDeliver__srcConsumer____EnergyConsumer, srcConsumer__srcDeliver____ServiceDeliveryPoints,
				asset__srcDeliver____ServiceDeliveryPoint, srcDeliver__asset____EndDeviceAssets, pair__asset____a,
				srcConsumer__srcGroup____LoadGroup, srcGroup__srcConsumer____EnergyConsumers };
	}

	public static final void pattern_SubLoadArea_0_6_registerobjectstomatch_expressionBBBBBBBB(SubLoadArea _this,
			Match match, ServiceDeliveryPoint srcDeliver, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea, ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		_this.registerObjectsToMatch_FWD(match, srcDeliver, asset, pair, srcArea, srcGroup, srcConsumer);

	}

	public static final boolean pattern_SubLoadArea_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SubLoadArea_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_SubLoadArea_1_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("srcDeliver");
		EObject _localVariable_1 = isApplicableMatch.getObject("asset");
		EObject _localVariable_2 = isApplicableMatch.getObject("groupToGroup");
		EObject _localVariable_3 = isApplicableMatch.getObject("trgGroup");
		EObject _localVariable_4 = isApplicableMatch.getObject("pair");
		EObject _localVariable_5 = isApplicableMatch.getObject("srcArea");
		EObject _localVariable_6 = isApplicableMatch.getObject("srcGroup");
		EObject _localVariable_7 = isApplicableMatch.getObject("srcConsumer");
		EObject tmpSrcDeliver = _localVariable_0;
		EObject tmpAsset = _localVariable_1;
		EObject tmpGroupToGroup = _localVariable_2;
		EObject tmpTrgGroup = _localVariable_3;
		EObject tmpPair = _localVariable_4;
		EObject tmpSrcArea = _localVariable_5;
		EObject tmpSrcGroup = _localVariable_6;
		EObject tmpSrcConsumer = _localVariable_7;
		if (tmpSrcDeliver instanceof ServiceDeliveryPoint) {
			ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) tmpSrcDeliver;
			if (tmpAsset instanceof MeterAsset) {
				MeterAsset asset = (MeterAsset) tmpAsset;
				if (tmpGroupToGroup instanceof ConformLoadGroupToConformLoadGroup) {
					ConformLoadGroupToConformLoadGroup groupToGroup = (ConformLoadGroupToConformLoadGroup) tmpGroupToGroup;
					if (tmpTrgGroup instanceof outagePreventionJointarget.ConformLoadGroup) {
						outagePreventionJointarget.ConformLoadGroup trgGroup = (outagePreventionJointarget.ConformLoadGroup) tmpTrgGroup;
						if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
							MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
							if (tmpSrcArea instanceof gluemodel.CIM.IEC61970.LoadModel.SubLoadArea) {
								gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea = (gluemodel.CIM.IEC61970.LoadModel.SubLoadArea) tmpSrcArea;
								if (tmpSrcGroup instanceof ConformLoadGroup) {
									ConformLoadGroup srcGroup = (ConformLoadGroup) tmpSrcGroup;
									if (tmpSrcConsumer instanceof ConformLoad) {
										ConformLoad srcConsumer = (ConformLoad) tmpSrcConsumer;
										return new Object[] { srcDeliver, asset, groupToGroup, trgGroup, pair, srcArea,
												srcGroup, srcConsumer, isApplicableMatch };
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

	public static final Object[] pattern_SubLoadArea_1_1_performtransformation_blackBBBBBBBBFBB(
			ServiceDeliveryPoint srcDeliver, MeterAsset asset, ConformLoadGroupToConformLoadGroup groupToGroup,
			outagePreventionJointarget.ConformLoadGroup trgGroup, MeterAssetPhysicalDevicePair pair,
			gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea, ConformLoadGroup srcGroup, ConformLoad srcConsumer,
			SubLoadArea _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { srcDeliver, asset, groupToGroup, trgGroup, pair, srcArea, srcGroup, srcConsumer,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SubLoadArea_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			SubLoadArea _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SubLoadArea_1_1_performtransformation_binding = pattern_SubLoadArea_1_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_SubLoadArea_1_1_performtransformation_binding != null) {
			ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result_pattern_SubLoadArea_1_1_performtransformation_binding[0];
			MeterAsset asset = (MeterAsset) result_pattern_SubLoadArea_1_1_performtransformation_binding[1];
			ConformLoadGroupToConformLoadGroup groupToGroup = (ConformLoadGroupToConformLoadGroup) result_pattern_SubLoadArea_1_1_performtransformation_binding[2];
			outagePreventionJointarget.ConformLoadGroup trgGroup = (outagePreventionJointarget.ConformLoadGroup) result_pattern_SubLoadArea_1_1_performtransformation_binding[3];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result_pattern_SubLoadArea_1_1_performtransformation_binding[4];
			gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea = (gluemodel.CIM.IEC61970.LoadModel.SubLoadArea) result_pattern_SubLoadArea_1_1_performtransformation_binding[5];
			ConformLoadGroup srcGroup = (ConformLoadGroup) result_pattern_SubLoadArea_1_1_performtransformation_binding[6];
			ConformLoad srcConsumer = (ConformLoad) result_pattern_SubLoadArea_1_1_performtransformation_binding[7];

			Object[] result_pattern_SubLoadArea_1_1_performtransformation_black = pattern_SubLoadArea_1_1_performtransformation_blackBBBBBBBBFBB(
					srcDeliver, asset, groupToGroup, trgGroup, pair, srcArea, srcGroup, srcConsumer, _this,
					isApplicableMatch);
			if (result_pattern_SubLoadArea_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_SubLoadArea_1_1_performtransformation_black[8];

				return new Object[] { srcDeliver, asset, groupToGroup, trgGroup, pair, srcArea, srcGroup, srcConsumer,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SubLoadArea_1_1_performtransformation_greenBFBF(
			outagePreventionJointarget.ConformLoadGroup trgGroup,
			gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea) {
		outagePreventionJointarget.SubLoadArea trgArea = OutagePreventionJointargetFactory.eINSTANCE
				.createSubLoadArea();
		SubLoadAreaToSubLoadArea areaToArea = Task2Factory.eINSTANCE.createSubLoadAreaToSubLoadArea();
		trgGroup.setSubLoadArea(trgArea);
		areaToArea.setTarget(trgArea);
		areaToArea.setSource(srcArea);
		return new Object[] { trgGroup, trgArea, srcArea, areaToArea };
	}

	public static final Object[] pattern_SubLoadArea_1_2_collecttranslatedelements_blackBBB(
			outagePreventionJointarget.SubLoadArea trgArea, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea,
			SubLoadAreaToSubLoadArea areaToArea) {
		return new Object[] { trgArea, srcArea, areaToArea };
	}

	public static final Object[] pattern_SubLoadArea_1_2_collecttranslatedelements_greenFBBB(
			outagePreventionJointarget.SubLoadArea trgArea, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea,
			SubLoadAreaToSubLoadArea areaToArea) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(trgArea);
		ruleresult.getTranslatedElements().add(srcArea);
		ruleresult.getCreatedLinkElements().add(areaToArea);
		return new Object[] { ruleresult, trgArea, srcArea, areaToArea };
	}

	public static final Object[] pattern_SubLoadArea_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject srcDeliver, EObject asset, EObject groupToGroup, EObject trgGroup,
			EObject trgArea, EObject pair, EObject srcArea, EObject areaToArea, EObject srcGroup, EObject srcConsumer) {
		if (!srcDeliver.equals(trgGroup)) {
			if (!srcDeliver.equals(trgArea)) {
				if (!srcDeliver.equals(srcGroup)) {
					if (!asset.equals(srcDeliver)) {
						if (!asset.equals(groupToGroup)) {
							if (!asset.equals(trgGroup)) {
								if (!asset.equals(trgArea)) {
									if (!asset.equals(pair)) {
										if (!asset.equals(srcArea)) {
											if (!asset.equals(srcGroup)) {
												if (!asset.equals(srcConsumer)) {
													if (!groupToGroup.equals(srcDeliver)) {
														if (!groupToGroup.equals(trgGroup)) {
															if (!groupToGroup.equals(trgArea)) {
																if (!groupToGroup.equals(pair)) {
																	if (!groupToGroup.equals(srcArea)) {
																		if (!groupToGroup.equals(srcGroup)) {
																			if (!groupToGroup.equals(srcConsumer)) {
																				if (!trgArea.equals(trgGroup)) {
																					if (!pair.equals(srcDeliver)) {
																						if (!pair.equals(trgGroup)) {
																							if (!pair.equals(trgArea)) {
																								if (!pair.equals(
																										srcArea)) {
																									if (!pair.equals(
																											srcGroup)) {
																										if (!pair
																												.equals(srcConsumer)) {
																											if (!srcArea
																													.equals(srcDeliver)) {
																												if (!srcArea
																														.equals(trgGroup)) {
																													if (!srcArea
																															.equals(trgArea)) {
																														if (!srcArea
																																.equals(srcGroup)) {
																															if (!srcArea
																																	.equals(srcConsumer)) {
																																if (!areaToArea
																																		.equals(srcDeliver)) {
																																	if (!areaToArea
																																			.equals(asset)) {
																																		if (!areaToArea
																																				.equals(groupToGroup)) {
																																			if (!areaToArea
																																					.equals(trgGroup)) {
																																				if (!areaToArea
																																						.equals(trgArea)) {
																																					if (!areaToArea
																																							.equals(pair)) {
																																						if (!areaToArea
																																								.equals(srcArea)) {
																																							if (!areaToArea
																																									.equals(srcGroup)) {
																																								if (!areaToArea
																																										.equals(srcConsumer)) {
																																									if (!srcGroup
																																											.equals(trgGroup)) {
																																										if (!srcGroup
																																												.equals(trgArea)) {
																																											if (!srcConsumer
																																													.equals(srcDeliver)) {
																																												if (!srcConsumer
																																														.equals(trgGroup)) {
																																													if (!srcConsumer
																																															.equals(trgArea)) {
																																														if (!srcConsumer
																																																.equals(srcGroup)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	srcDeliver,
																																																	asset,
																																																	groupToGroup,
																																																	trgGroup,
																																																	trgArea,
																																																	pair,
																																																	srcArea,
																																																	areaToArea,
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
		return null;
	}

	public static final Object[] pattern_SubLoadArea_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject trgGroup, EObject trgArea, EObject srcArea, EObject areaToArea,
			EObject srcGroup) {
		EMoflonEdge trgGroup__trgArea____SubLoadArea = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge areaToArea__trgArea____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge areaToArea__srcArea____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcGroup__srcArea____SubLoadArea = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcArea__srcGroup____LoadGroups = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SubLoadArea";
		String trgGroup__trgArea____SubLoadArea_name_prime = "SubLoadArea";
		String areaToArea__trgArea____target_name_prime = "target";
		String areaToArea__srcArea____source_name_prime = "source";
		String srcGroup__srcArea____SubLoadArea_name_prime = "SubLoadArea";
		String srcArea__srcGroup____LoadGroups_name_prime = "LoadGroups";
		trgGroup__trgArea____SubLoadArea.setSrc(trgGroup);
		trgGroup__trgArea____SubLoadArea.setTrg(trgArea);
		ruleresult.getCreatedEdges().add(trgGroup__trgArea____SubLoadArea);
		areaToArea__trgArea____target.setSrc(areaToArea);
		areaToArea__trgArea____target.setTrg(trgArea);
		ruleresult.getCreatedEdges().add(areaToArea__trgArea____target);
		areaToArea__srcArea____source.setSrc(areaToArea);
		areaToArea__srcArea____source.setTrg(srcArea);
		ruleresult.getCreatedEdges().add(areaToArea__srcArea____source);
		srcGroup__srcArea____SubLoadArea.setSrc(srcGroup);
		srcGroup__srcArea____SubLoadArea.setTrg(srcArea);
		ruleresult.getTranslatedEdges().add(srcGroup__srcArea____SubLoadArea);
		srcArea__srcGroup____LoadGroups.setSrc(srcArea);
		srcArea__srcGroup____LoadGroups.setTrg(srcGroup);
		ruleresult.getTranslatedEdges().add(srcArea__srcGroup____LoadGroups);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		trgGroup__trgArea____SubLoadArea.setName(trgGroup__trgArea____SubLoadArea_name_prime);
		areaToArea__trgArea____target.setName(areaToArea__trgArea____target_name_prime);
		areaToArea__srcArea____source.setName(areaToArea__srcArea____source_name_prime);
		srcGroup__srcArea____SubLoadArea.setName(srcGroup__srcArea____SubLoadArea_name_prime);
		srcArea__srcGroup____LoadGroups.setName(srcArea__srcGroup____LoadGroups_name_prime);
		return new Object[] { ruleresult, trgGroup, trgArea, srcArea, areaToArea, srcGroup,
				trgGroup__trgArea____SubLoadArea, areaToArea__trgArea____target, areaToArea__srcArea____source,
				srcGroup__srcArea____SubLoadArea, srcArea__srcGroup____LoadGroups };
	}

	public static final void pattern_SubLoadArea_1_5_registerobjects_expressionBBBBBBBBBBBB(SubLoadArea _this,
			PerformRuleResult ruleresult, EObject srcDeliver, EObject asset, EObject groupToGroup, EObject trgGroup,
			EObject trgArea, EObject pair, EObject srcArea, EObject areaToArea, EObject srcGroup, EObject srcConsumer) {
		_this.registerObjects_FWD(ruleresult, srcDeliver, asset, groupToGroup, trgGroup, trgArea, pair, srcArea,
				areaToArea, srcGroup, srcConsumer);

	}

	public static final PerformRuleResult pattern_SubLoadArea_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SubLoadArea_2_1_preparereturnvalue_bindingFB(SubLoadArea _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SubLoadArea_2_1_preparereturnvalue_blackFBB(EClass eClass, SubLoadArea _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SubLoadArea_2_1_preparereturnvalue_bindingAndBlackFFB(SubLoadArea _this) {
		Object[] result_pattern_SubLoadArea_2_1_preparereturnvalue_binding = pattern_SubLoadArea_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SubLoadArea_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_SubLoadArea_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SubLoadArea_2_1_preparereturnvalue_black = pattern_SubLoadArea_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_SubLoadArea_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SubLoadArea_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SubLoadArea_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "SubLoadArea";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SubLoadArea_2_2_corematch_bindingFFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("srcDeliver");
		EObject _localVariable_1 = match.getObject("asset");
		EObject _localVariable_2 = match.getObject("pair");
		EObject _localVariable_3 = match.getObject("srcArea");
		EObject _localVariable_4 = match.getObject("srcGroup");
		EObject _localVariable_5 = match.getObject("srcConsumer");
		EObject tmpSrcDeliver = _localVariable_0;
		EObject tmpAsset = _localVariable_1;
		EObject tmpPair = _localVariable_2;
		EObject tmpSrcArea = _localVariable_3;
		EObject tmpSrcGroup = _localVariable_4;
		EObject tmpSrcConsumer = _localVariable_5;
		if (tmpSrcDeliver instanceof ServiceDeliveryPoint) {
			ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) tmpSrcDeliver;
			if (tmpAsset instanceof MeterAsset) {
				MeterAsset asset = (MeterAsset) tmpAsset;
				if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
					MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
					if (tmpSrcArea instanceof gluemodel.CIM.IEC61970.LoadModel.SubLoadArea) {
						gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea = (gluemodel.CIM.IEC61970.LoadModel.SubLoadArea) tmpSrcArea;
						if (tmpSrcGroup instanceof ConformLoadGroup) {
							ConformLoadGroup srcGroup = (ConformLoadGroup) tmpSrcGroup;
							if (tmpSrcConsumer instanceof ConformLoad) {
								ConformLoad srcConsumer = (ConformLoad) tmpSrcConsumer;
								return new Object[] { srcDeliver, asset, pair, srcArea, srcGroup, srcConsumer, match };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SubLoadArea_2_2_corematch_blackBBFFBBBBB(
			ServiceDeliveryPoint srcDeliver, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea, ConformLoadGroup srcGroup, ConformLoad srcConsumer,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ConformLoadGroupToConformLoadGroup groupToGroup : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(srcGroup, ConformLoadGroupToConformLoadGroup.class, "source")) {
			outagePreventionJointarget.ConformLoadGroup trgGroup = groupToGroup.getTarget();
			if (trgGroup != null) {
				_result.add(new Object[] { srcDeliver, asset, groupToGroup, trgGroup, pair, srcArea, srcGroup,
						srcConsumer, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SubLoadArea_2_3_findcontext_blackBBBBBBBB(
			ServiceDeliveryPoint srcDeliver, MeterAsset asset, ConformLoadGroupToConformLoadGroup groupToGroup,
			outagePreventionJointarget.ConformLoadGroup trgGroup, MeterAssetPhysicalDevicePair pair,
			gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea, ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (srcConsumer.equals(srcDeliver.getEnergyConsumer())) {
			if (srcDeliver.equals(asset.getServiceDeliveryPoint())) {
				if (trgGroup.equals(groupToGroup.getTarget())) {
					if (asset.equals(pair.getA())) {
						if (srcGroup.equals(groupToGroup.getSource())) {
							if (srcGroup.equals(srcConsumer.getLoadGroup())) {
								if (srcArea.equals(srcGroup.getSubLoadArea())) {
									_result.add(new Object[] { srcDeliver, asset, groupToGroup, trgGroup, pair, srcArea,
											srcGroup, srcConsumer });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_SubLoadArea_2_3_findcontext_greenBBBBBBBBFFFFFFFFFFFF(
			ServiceDeliveryPoint srcDeliver, MeterAsset asset, ConformLoadGroupToConformLoadGroup groupToGroup,
			outagePreventionJointarget.ConformLoadGroup trgGroup, MeterAssetPhysicalDevicePair pair,
			gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea, ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__asset____EndDeviceAssets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge groupToGroup__trgGroup____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge groupToGroup__srcGroup____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcConsumer__srcGroup____LoadGroup = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcGroup__srcConsumer____EnergyConsumers = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcGroup__srcArea____SubLoadArea = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcArea__srcGroup____LoadGroups = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String srcDeliver__srcConsumer____EnergyConsumer_name_prime = "EnergyConsumer";
		String srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime = "ServiceDeliveryPoints";
		String asset__srcDeliver____ServiceDeliveryPoint_name_prime = "ServiceDeliveryPoint";
		String srcDeliver__asset____EndDeviceAssets_name_prime = "EndDeviceAssets";
		String groupToGroup__trgGroup____target_name_prime = "target";
		String pair__asset____a_name_prime = "a";
		String groupToGroup__srcGroup____source_name_prime = "source";
		String srcConsumer__srcGroup____LoadGroup_name_prime = "LoadGroup";
		String srcGroup__srcConsumer____EnergyConsumers_name_prime = "EnergyConsumers";
		String srcGroup__srcArea____SubLoadArea_name_prime = "SubLoadArea";
		String srcArea__srcGroup____LoadGroups_name_prime = "LoadGroups";
		isApplicableMatch.getAllContextElements().add(srcDeliver);
		isApplicableMatch.getAllContextElements().add(asset);
		isApplicableMatch.getAllContextElements().add(groupToGroup);
		isApplicableMatch.getAllContextElements().add(trgGroup);
		isApplicableMatch.getAllContextElements().add(pair);
		isApplicableMatch.getAllContextElements().add(srcArea);
		isApplicableMatch.getAllContextElements().add(srcGroup);
		isApplicableMatch.getAllContextElements().add(srcConsumer);
		srcDeliver__srcConsumer____EnergyConsumer.setSrc(srcDeliver);
		srcDeliver__srcConsumer____EnergyConsumer.setTrg(srcConsumer);
		isApplicableMatch.getAllContextElements().add(srcDeliver__srcConsumer____EnergyConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setSrc(srcConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setTrg(srcDeliver);
		isApplicableMatch.getAllContextElements().add(srcConsumer__srcDeliver____ServiceDeliveryPoints);
		asset__srcDeliver____ServiceDeliveryPoint.setSrc(asset);
		asset__srcDeliver____ServiceDeliveryPoint.setTrg(srcDeliver);
		isApplicableMatch.getAllContextElements().add(asset__srcDeliver____ServiceDeliveryPoint);
		srcDeliver__asset____EndDeviceAssets.setSrc(srcDeliver);
		srcDeliver__asset____EndDeviceAssets.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(srcDeliver__asset____EndDeviceAssets);
		groupToGroup__trgGroup____target.setSrc(groupToGroup);
		groupToGroup__trgGroup____target.setTrg(trgGroup);
		isApplicableMatch.getAllContextElements().add(groupToGroup__trgGroup____target);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(pair__asset____a);
		groupToGroup__srcGroup____source.setSrc(groupToGroup);
		groupToGroup__srcGroup____source.setTrg(srcGroup);
		isApplicableMatch.getAllContextElements().add(groupToGroup__srcGroup____source);
		srcConsumer__srcGroup____LoadGroup.setSrc(srcConsumer);
		srcConsumer__srcGroup____LoadGroup.setTrg(srcGroup);
		isApplicableMatch.getAllContextElements().add(srcConsumer__srcGroup____LoadGroup);
		srcGroup__srcConsumer____EnergyConsumers.setSrc(srcGroup);
		srcGroup__srcConsumer____EnergyConsumers.setTrg(srcConsumer);
		isApplicableMatch.getAllContextElements().add(srcGroup__srcConsumer____EnergyConsumers);
		srcGroup__srcArea____SubLoadArea.setSrc(srcGroup);
		srcGroup__srcArea____SubLoadArea.setTrg(srcArea);
		isApplicableMatch.getAllContextElements().add(srcGroup__srcArea____SubLoadArea);
		srcArea__srcGroup____LoadGroups.setSrc(srcArea);
		srcArea__srcGroup____LoadGroups.setTrg(srcGroup);
		isApplicableMatch.getAllContextElements().add(srcArea__srcGroup____LoadGroups);
		srcDeliver__srcConsumer____EnergyConsumer.setName(srcDeliver__srcConsumer____EnergyConsumer_name_prime);
		srcConsumer__srcDeliver____ServiceDeliveryPoints
				.setName(srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime);
		asset__srcDeliver____ServiceDeliveryPoint.setName(asset__srcDeliver____ServiceDeliveryPoint_name_prime);
		srcDeliver__asset____EndDeviceAssets.setName(srcDeliver__asset____EndDeviceAssets_name_prime);
		groupToGroup__trgGroup____target.setName(groupToGroup__trgGroup____target_name_prime);
		pair__asset____a.setName(pair__asset____a_name_prime);
		groupToGroup__srcGroup____source.setName(groupToGroup__srcGroup____source_name_prime);
		srcConsumer__srcGroup____LoadGroup.setName(srcConsumer__srcGroup____LoadGroup_name_prime);
		srcGroup__srcConsumer____EnergyConsumers.setName(srcGroup__srcConsumer____EnergyConsumers_name_prime);
		srcGroup__srcArea____SubLoadArea.setName(srcGroup__srcArea____SubLoadArea_name_prime);
		srcArea__srcGroup____LoadGroups.setName(srcArea__srcGroup____LoadGroups_name_prime);
		return new Object[] { srcDeliver, asset, groupToGroup, trgGroup, pair, srcArea, srcGroup, srcConsumer,
				isApplicableMatch, srcDeliver__srcConsumer____EnergyConsumer,
				srcConsumer__srcDeliver____ServiceDeliveryPoints, asset__srcDeliver____ServiceDeliveryPoint,
				srcDeliver__asset____EndDeviceAssets, groupToGroup__trgGroup____target, pair__asset____a,
				groupToGroup__srcGroup____source, srcConsumer__srcGroup____LoadGroup,
				srcGroup__srcConsumer____EnergyConsumers, srcGroup__srcArea____SubLoadArea,
				srcArea__srcGroup____LoadGroups };
	}

	public static final Object[] pattern_SubLoadArea_2_4_solveCSP_bindingFBBBBBBBBBB(SubLoadArea _this,
			IsApplicableMatch isApplicableMatch, ServiceDeliveryPoint srcDeliver, MeterAsset asset,
			ConformLoadGroupToConformLoadGroup groupToGroup, outagePreventionJointarget.ConformLoadGroup trgGroup,
			MeterAssetPhysicalDevicePair pair, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea,
			ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, srcDeliver, asset, groupToGroup,
				trgGroup, pair, srcArea, srcGroup, srcConsumer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, srcDeliver, asset, groupToGroup, trgGroup, pair,
					srcArea, srcGroup, srcConsumer };
		}
		return null;
	}

	public static final Object[] pattern_SubLoadArea_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SubLoadArea_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(SubLoadArea _this,
			IsApplicableMatch isApplicableMatch, ServiceDeliveryPoint srcDeliver, MeterAsset asset,
			ConformLoadGroupToConformLoadGroup groupToGroup, outagePreventionJointarget.ConformLoadGroup trgGroup,
			MeterAssetPhysicalDevicePair pair, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea,
			ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		Object[] result_pattern_SubLoadArea_2_4_solveCSP_binding = pattern_SubLoadArea_2_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, srcDeliver, asset, groupToGroup, trgGroup, pair, srcArea, srcGroup,
				srcConsumer);
		if (result_pattern_SubLoadArea_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SubLoadArea_2_4_solveCSP_binding[0];

			Object[] result_pattern_SubLoadArea_2_4_solveCSP_black = pattern_SubLoadArea_2_4_solveCSP_blackB(csp);
			if (result_pattern_SubLoadArea_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, srcDeliver, asset, groupToGroup, trgGroup, pair,
						srcArea, srcGroup, srcConsumer };
			}
		}
		return null;
	}

	public static final boolean pattern_SubLoadArea_2_5_checkCSP_expressionFBB(SubLoadArea _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SubLoadArea_2_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SubLoadArea_2_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SubLoadArea";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SubLoadArea_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SubLoadArea_10_1_preparereturnvalue_bindingFB(SubLoadArea _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SubLoadArea_10_1_preparereturnvalue_blackFBBF(EClass __eClass,
			SubLoadArea _this) {
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

	public static final Object[] pattern_SubLoadArea_10_1_preparereturnvalue_bindingAndBlackFFBF(SubLoadArea _this) {
		Object[] result_pattern_SubLoadArea_10_1_preparereturnvalue_binding = pattern_SubLoadArea_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SubLoadArea_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_SubLoadArea_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SubLoadArea_10_1_preparereturnvalue_black = pattern_SubLoadArea_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_SubLoadArea_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SubLoadArea_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_SubLoadArea_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_SubLoadArea_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SubLoadArea_10_2_testcorematchandDECs_black_nac_0BB(
			gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea, ConformLoadGroup srcGroup) {
		for (LoadGroup __DEC_srcArea_SubLoadArea_477037 : srcArea.getLoadGroups()) {
			if (!srcGroup.equals(__DEC_srcArea_SubLoadArea_477037)) {
				return new Object[] { srcArea, srcGroup };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SubLoadArea_10_2_testcorematchandDECs_blackFFFFFFB(
			EMoflonEdge _edge_SubLoadArea) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSrcGroup = _edge_SubLoadArea.getSrc();
		if (tmpSrcGroup instanceof ConformLoadGroup) {
			ConformLoadGroup srcGroup = (ConformLoadGroup) tmpSrcGroup;
			EObject tmpSrcArea = _edge_SubLoadArea.getTrg();
			if (tmpSrcArea instanceof gluemodel.CIM.IEC61970.LoadModel.SubLoadArea) {
				gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea = (gluemodel.CIM.IEC61970.LoadModel.SubLoadArea) tmpSrcArea;
				if (srcArea.equals(srcGroup.getSubLoadArea())) {
					if (pattern_SubLoadArea_10_2_testcorematchandDECs_black_nac_0BB(srcArea, srcGroup) == null) {
						for (ConformLoad srcConsumer : srcGroup.getEnergyConsumers()) {
							for (ServiceDeliveryPoint srcDeliver : srcConsumer.getServiceDeliveryPoints()) {
								for (EndDeviceAsset tmpAsset : srcDeliver.getEndDeviceAssets()) {
									if (tmpAsset instanceof MeterAsset) {
										MeterAsset asset = (MeterAsset) tmpAsset;
										for (MeterAssetPhysicalDevicePair pair : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(asset, MeterAssetPhysicalDevicePair.class,
														"a")) {
											_result.add(new Object[] { srcDeliver, asset, pair, srcArea, srcGroup,
													srcConsumer, _edge_SubLoadArea });
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

	public static final Object[] pattern_SubLoadArea_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SubLoadArea_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBB(
			SubLoadArea _this, Match match, ServiceDeliveryPoint srcDeliver, MeterAsset asset,
			MeterAssetPhysicalDevicePair pair, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea,
			ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, srcDeliver, asset, pair, srcArea, srcGroup,
				srcConsumer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SubLoadArea_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			SubLoadArea _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SubLoadArea_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_SubLoadArea_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_SubLoadArea_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SubLoadArea_13_1_matchtggpattern_black_nac_0BB(
			gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea, ConformLoadGroup srcGroup) {
		for (LoadGroup __DEC_srcArea_SubLoadArea_127542 : srcArea.getLoadGroups()) {
			if (!srcGroup.equals(__DEC_srcArea_SubLoadArea_127542)) {
				return new Object[] { srcArea, srcGroup };
			}
		}
		return null;
	}

	public static final Object[] pattern_SubLoadArea_13_1_matchtggpattern_blackBBBBBB(ServiceDeliveryPoint srcDeliver,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea,
			ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		if (srcConsumer.equals(srcDeliver.getEnergyConsumer())) {
			if (srcDeliver.equals(asset.getServiceDeliveryPoint())) {
				if (asset.equals(pair.getA())) {
					if (srcGroup.equals(srcConsumer.getLoadGroup())) {
						if (srcArea.equals(srcGroup.getSubLoadArea())) {
							if (pattern_SubLoadArea_13_1_matchtggpattern_black_nac_0BB(srcArea, srcGroup) == null) {
								return new Object[] { srcDeliver, asset, pair, srcArea, srcGroup, srcConsumer };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_SubLoadArea_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SubLoadArea_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SubLoadAreaImpl
