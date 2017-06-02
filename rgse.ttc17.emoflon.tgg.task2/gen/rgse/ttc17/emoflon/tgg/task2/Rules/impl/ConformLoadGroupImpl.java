/**
 */
package rgse.ttc17.emoflon.tgg.task2.Rules.impl;

import gluemodel.CIM.IEC61968.Metering.EndDeviceAsset;
import gluemodel.CIM.IEC61968.Metering.MeterAsset;
import gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint;

import gluemodel.CIM.IEC61970.LoadModel.ConformLoad;

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

import outagePreventionJointarget.EnergyConsumer;
import outagePreventionJointarget.OutagePreventionJointargetFactory;

import rgse.ttc17.emoflon.tgg.task2.ConformLoadGroupToConformLoadGroup;
import rgse.ttc17.emoflon.tgg.task2.EnergyConsumerToEnergyConsumer;

import rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoadGroup;
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
 * An implementation of the model object '<em><b>Conform Load Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConformLoadGroupImpl extends AbstractRuleImpl implements ConformLoadGroup {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConformLoadGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getConformLoadGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ServiceDeliveryPoint srcDeliver, MeterAssetPhysicalDevicePair pair,
			MeterAsset asset, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		// initial bindings
		Object[] result1_black = ConformLoadGroupImpl.pattern_ConformLoadGroup_0_1_initialbindings_blackBBBBBBB(this,
				match, srcDeliver, pair, asset, srcGroup, srcConsumer);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[srcDeliver] = " + srcDeliver + ", "
					+ "[pair] = " + pair + ", " + "[asset] = " + asset + ", " + "[srcGroup] = " + srcGroup + ", "
					+ "[srcConsumer] = " + srcConsumer + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ConformLoadGroupImpl
				.pattern_ConformLoadGroup_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, srcDeliver, pair, asset,
						srcGroup, srcConsumer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[srcDeliver] = " + srcDeliver + ", " + "[pair] = "
					+ pair + ", " + "[asset] = " + asset + ", " + "[srcGroup] = " + srcGroup + ", " + "[srcConsumer] = "
					+ srcConsumer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ConformLoadGroupImpl.pattern_ConformLoadGroup_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ConformLoadGroupImpl
					.pattern_ConformLoadGroup_0_4_collectelementstobetranslated_blackBBBBBB(match, srcDeliver, pair,
							asset, srcGroup, srcConsumer);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[srcDeliver] = " + srcDeliver + ", "
						+ "[pair] = " + pair + ", " + "[asset] = " + asset + ", " + "[srcGroup] = " + srcGroup + ", "
						+ "[srcConsumer] = " + srcConsumer + ".");
			}
			ConformLoadGroupImpl.pattern_ConformLoadGroup_0_4_collectelementstobetranslated_greenBBBFF(match, srcGroup,
					srcConsumer);
			// EMoflonEdge srcConsumer__srcGroup____LoadGroup = (EMoflonEdge) result4_green[3];
			// EMoflonEdge srcGroup__srcConsumer____EnergyConsumers = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = ConformLoadGroupImpl
					.pattern_ConformLoadGroup_0_5_collectcontextelements_blackBBBBBB(match, srcDeliver, pair, asset,
							srcGroup, srcConsumer);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[srcDeliver] = " + srcDeliver + ", "
						+ "[pair] = " + pair + ", " + "[asset] = " + asset + ", " + "[srcGroup] = " + srcGroup + ", "
						+ "[srcConsumer] = " + srcConsumer + ".");
			}
			ConformLoadGroupImpl.pattern_ConformLoadGroup_0_5_collectcontextelements_greenBBBBBFFFFF(match, srcDeliver,
					pair, asset, srcConsumer);
			// EMoflonEdge pair__asset____a = (EMoflonEdge) result5_green[5];
			// EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = (EMoflonEdge) result5_green[6];
			// EMoflonEdge srcDeliver__asset____EndDeviceAssets = (EMoflonEdge) result5_green[7];
			// EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = (EMoflonEdge) result5_green[8];
			// EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = (EMoflonEdge) result5_green[9];

			// register objects to match
			ConformLoadGroupImpl.pattern_ConformLoadGroup_0_6_registerobjectstomatch_expressionBBBBBBB(this, match,
					srcDeliver, pair, asset, srcGroup, srcConsumer);
			return ConformLoadGroupImpl.pattern_ConformLoadGroup_0_7_expressionF();
		} else {
			return ConformLoadGroupImpl.pattern_ConformLoadGroup_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ConformLoadGroupImpl
				.pattern_ConformLoadGroup_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		outagePreventionJointarget.ConformLoad trgConsumer = (outagePreventionJointarget.ConformLoad) result1_bindingAndBlack[0];
		EnergyConsumerToEnergyConsumer consumerToConsumer = (EnergyConsumerToEnergyConsumer) result1_bindingAndBlack[1];
		ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result1_bindingAndBlack[2];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result1_bindingAndBlack[3];
		MeterAsset asset = (MeterAsset) result1_bindingAndBlack[4];
		gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup = (gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup) result1_bindingAndBlack[5];
		ConformLoad srcConsumer = (ConformLoad) result1_bindingAndBlack[6];
		// CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = ConformLoadGroupImpl
				.pattern_ConformLoadGroup_1_1_performtransformation_greenBFBF(trgConsumer, srcGroup);
		outagePreventionJointarget.ConformLoadGroup trgGroup = (outagePreventionJointarget.ConformLoadGroup) result1_green[1];
		ConformLoadGroupToConformLoadGroup groupToGroup = (ConformLoadGroupToConformLoadGroup) result1_green[3];

		// collect translated elements
		Object[] result2_black = ConformLoadGroupImpl
				.pattern_ConformLoadGroup_1_2_collecttranslatedelements_blackBBB(trgGroup, srcGroup, groupToGroup);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[trgGroup] = " + trgGroup + ", " + "[srcGroup] = " + srcGroup + ", " + "[groupToGroup] = "
					+ groupToGroup + ".");
		}
		Object[] result2_green = ConformLoadGroupImpl
				.pattern_ConformLoadGroup_1_2_collecttranslatedelements_greenFBBB(trgGroup, srcGroup, groupToGroup);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ConformLoadGroupImpl.pattern_ConformLoadGroup_1_3_bookkeepingforedges_blackBBBBBBBBBB(
				ruleresult, trgConsumer, consumerToConsumer, srcDeliver, trgGroup, pair, asset, srcGroup, groupToGroup,
				srcConsumer);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[trgConsumer] = " + trgConsumer + ", "
					+ "[consumerToConsumer] = " + consumerToConsumer + ", " + "[srcDeliver] = " + srcDeliver + ", "
					+ "[trgGroup] = " + trgGroup + ", " + "[pair] = " + pair + ", " + "[asset] = " + asset + ", "
					+ "[srcGroup] = " + srcGroup + ", " + "[groupToGroup] = " + groupToGroup + ", " + "[srcConsumer] = "
					+ srcConsumer + ".");
		}
		ConformLoadGroupImpl.pattern_ConformLoadGroup_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, trgConsumer,
				trgGroup, srcGroup, groupToGroup, srcConsumer);
		// EMoflonEdge trgConsumer__trgGroup____LoadGroup = (EMoflonEdge) result3_green[6];
		// EMoflonEdge groupToGroup__trgGroup____target = (EMoflonEdge) result3_green[7];
		// EMoflonEdge groupToGroup__srcGroup____source = (EMoflonEdge) result3_green[8];
		// EMoflonEdge srcConsumer__srcGroup____LoadGroup = (EMoflonEdge) result3_green[9];
		// EMoflonEdge srcGroup__srcConsumer____EnergyConsumers = (EMoflonEdge) result3_green[10];

		// perform postprocessing story node is empty
		// register objects
		ConformLoadGroupImpl.pattern_ConformLoadGroup_1_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
				trgConsumer, consumerToConsumer, srcDeliver, trgGroup, pair, asset, srcGroup, groupToGroup,
				srcConsumer);
		return ConformLoadGroupImpl.pattern_ConformLoadGroup_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ConformLoadGroupImpl
				.pattern_ConformLoadGroup_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ConformLoadGroupImpl
				.pattern_ConformLoadGroup_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ConformLoadGroupImpl.pattern_ConformLoadGroup_2_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result2_binding[0];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_binding[1];
		MeterAsset asset = (MeterAsset) result2_binding[2];
		gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup = (gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup) result2_binding[3];
		ConformLoad srcConsumer = (ConformLoad) result2_binding[4];
		for (Object[] result2_black : ConformLoadGroupImpl.pattern_ConformLoadGroup_2_2_corematch_blackFFBBBBBB(
				srcDeliver, pair, asset, srcGroup, srcConsumer, match)) {
			outagePreventionJointarget.ConformLoad trgConsumer = (outagePreventionJointarget.ConformLoad) result2_black[0];
			EnergyConsumerToEnergyConsumer consumerToConsumer = (EnergyConsumerToEnergyConsumer) result2_black[1];
			// ForEach find context
			for (Object[] result3_black : ConformLoadGroupImpl.pattern_ConformLoadGroup_2_3_findcontext_blackBBBBBBB(
					trgConsumer, consumerToConsumer, srcDeliver, pair, asset, srcGroup, srcConsumer)) {
				Object[] result3_green = ConformLoadGroupImpl
						.pattern_ConformLoadGroup_2_3_findcontext_greenBBBBBBBFFFFFFFFFF(trgConsumer,
								consumerToConsumer, srcDeliver, pair, asset, srcGroup, srcConsumer);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				// EMoflonEdge pair__asset____a = (EMoflonEdge) result3_green[8];
				// EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = (EMoflonEdge) result3_green[9];
				// EMoflonEdge srcDeliver__asset____EndDeviceAssets = (EMoflonEdge) result3_green[10];
				// EMoflonEdge consumerToConsumer__srcConsumer____source = (EMoflonEdge) result3_green[11];
				// EMoflonEdge srcConsumer__srcGroup____LoadGroup = (EMoflonEdge) result3_green[12];
				// EMoflonEdge srcGroup__srcConsumer____EnergyConsumers = (EMoflonEdge) result3_green[13];
				// EMoflonEdge consumerToConsumer__trgConsumer____target = (EMoflonEdge) result3_green[14];
				// EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = (EMoflonEdge) result3_green[15];
				// EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = (EMoflonEdge) result3_green[16];

				// solve CSP
				Object[] result4_bindingAndBlack = ConformLoadGroupImpl
						.pattern_ConformLoadGroup_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								trgConsumer, consumerToConsumer, srcDeliver, pair, asset, srcGroup, srcConsumer);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[trgConsumer] = " + trgConsumer + ", " + "[consumerToConsumer] = " + consumerToConsumer
							+ ", " + "[srcDeliver] = " + srcDeliver + ", " + "[pair] = " + pair + ", " + "[asset] = "
							+ asset + ", " + "[srcGroup] = " + srcGroup + ", " + "[srcConsumer] = " + srcConsumer
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ConformLoadGroupImpl.pattern_ConformLoadGroup_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = ConformLoadGroupImpl
							.pattern_ConformLoadGroup_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					ConformLoadGroupImpl.pattern_ConformLoadGroup_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return ConformLoadGroupImpl.pattern_ConformLoadGroup_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ServiceDeliveryPoint srcDeliver,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		match.registerObject("srcDeliver", srcDeliver);
		match.registerObject("pair", pair);
		match.registerObject("asset", asset);
		match.registerObject("srcGroup", srcGroup);
		match.registerObject("srcConsumer", srcConsumer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ServiceDeliveryPoint srcDeliver,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, ConformLoad srcConsumer) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			outagePreventionJointarget.ConformLoad trgConsumer, EnergyConsumerToEnergyConsumer consumerToConsumer,
			ServiceDeliveryPoint srcDeliver, MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, ConformLoad srcConsumer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("trgConsumer", trgConsumer);
		isApplicableMatch.registerObject("consumerToConsumer", consumerToConsumer);
		isApplicableMatch.registerObject("srcDeliver", srcDeliver);
		isApplicableMatch.registerObject("pair", pair);
		isApplicableMatch.registerObject("asset", asset);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject trgConsumer, EObject consumerToConsumer,
			EObject srcDeliver, EObject trgGroup, EObject pair, EObject asset, EObject srcGroup, EObject groupToGroup,
			EObject srcConsumer) {
		ruleresult.registerObject("trgConsumer", trgConsumer);
		ruleresult.registerObject("consumerToConsumer", consumerToConsumer);
		ruleresult.registerObject("srcDeliver", srcDeliver);
		ruleresult.registerObject("trgGroup", trgGroup);
		ruleresult.registerObject("pair", pair);
		ruleresult.registerObject("asset", asset);
		ruleresult.registerObject("srcGroup", srcGroup);
		ruleresult.registerObject("groupToGroup", groupToGroup);
		ruleresult.registerObject("srcConsumer", srcConsumer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("srcGroup").eClass())
				.equals("gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_29(EMoflonEdge _edge_LoadGroup) {
		// prepare return value
		Object[] result1_bindingAndBlack = ConformLoadGroupImpl
				.pattern_ConformLoadGroup_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ConformLoadGroupImpl.pattern_ConformLoadGroup_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ConformLoadGroupImpl
				.pattern_ConformLoadGroup_10_2_testcorematchandDECs_blackFFFFFB(_edge_LoadGroup)) {
			ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result2_black[0];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_black[1];
			MeterAsset asset = (MeterAsset) result2_black[2];
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup = (gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup) result2_black[3];
			ConformLoad srcConsumer = (ConformLoad) result2_black[4];
			Object[] result2_green = ConformLoadGroupImpl
					.pattern_ConformLoadGroup_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ConformLoadGroupImpl
					.pattern_ConformLoadGroup_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, srcDeliver, pair, asset, srcGroup, srcConsumer)) {
				// Ensure that the correct types of elements are matched
				if (ConformLoadGroupImpl
						.pattern_ConformLoadGroup_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = ConformLoadGroupImpl
							.pattern_ConformLoadGroup_10_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					ConformLoadGroupImpl.pattern_ConformLoadGroup_10_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ConformLoadGroupImpl.pattern_ConformLoadGroup_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ConformLoadGroup");
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
	public boolean checkDEC_FWD(ServiceDeliveryPoint srcDeliver, MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, ConformLoad srcConsumer) {// match tgg pattern
		Object[] result1_black = ConformLoadGroupImpl.pattern_ConformLoadGroup_13_1_matchtggpattern_blackBBBBB(
				srcDeliver, pair, asset, srcGroup, srcConsumer);
		if (result1_black != null) {
			return ConformLoadGroupImpl.pattern_ConformLoadGroup_13_2_expressionF();
		} else {
			return ConformLoadGroupImpl.pattern_ConformLoadGroup_13_3_expressionF();
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
		case RulesPackage.CONFORM_LOAD_GROUP___IS_APPROPRIATE_FWD__MATCH_SERVICEDELIVERYPOINT_METERASSETPHYSICALDEVICEPAIR_METERASSET_CONFORMLOADGROUP_CONFORMLOAD:
			return isAppropriate_FWD((Match) arguments.get(0), (ServiceDeliveryPoint) arguments.get(1),
					(MeterAssetPhysicalDevicePair) arguments.get(2), (MeterAsset) arguments.get(3),
					(gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup) arguments.get(4),
					(ConformLoad) arguments.get(5));
		case RulesPackage.CONFORM_LOAD_GROUP___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CONFORM_LOAD_GROUP___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.CONFORM_LOAD_GROUP___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SERVICEDELIVERYPOINT_METERASSETPHYSICALDEVICEPAIR_METERASSET_CONFORMLOADGROUP_CONFORMLOAD:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ServiceDeliveryPoint) arguments.get(1),
					(MeterAssetPhysicalDevicePair) arguments.get(2), (MeterAsset) arguments.get(3),
					(gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup) arguments.get(4),
					(ConformLoad) arguments.get(5));
			return null;
		case RulesPackage.CONFORM_LOAD_GROUP___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SERVICEDELIVERYPOINT_METERASSETPHYSICALDEVICEPAIR_METERASSET_CONFORMLOADGROUP_CONFORMLOAD:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ServiceDeliveryPoint) arguments.get(1),
					(MeterAssetPhysicalDevicePair) arguments.get(2), (MeterAsset) arguments.get(3),
					(gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup) arguments.get(4),
					(ConformLoad) arguments.get(5));
		case RulesPackage.CONFORM_LOAD_GROUP___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CONFORM_LOAD_GROUP___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CONFORMLOAD_ENERGYCONSUMERTOENERGYCONSUMER_SERVICEDELIVERYPOINT_METERASSETPHYSICALDEVICEPAIR_METERASSET_CONFORMLOADGROUP_CONFORMLOAD:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(outagePreventionJointarget.ConformLoad) arguments.get(1),
					(EnergyConsumerToEnergyConsumer) arguments.get(2), (ServiceDeliveryPoint) arguments.get(3),
					(MeterAssetPhysicalDevicePair) arguments.get(4), (MeterAsset) arguments.get(5),
					(gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup) arguments.get(6),
					(ConformLoad) arguments.get(7));
		case RulesPackage.CONFORM_LOAD_GROUP___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CONFORM_LOAD_GROUP___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.CONFORM_LOAD_GROUP___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.CONFORM_LOAD_GROUP___IS_APPROPRIATE_FWD_EMOFLON_EDGE_29__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_29((EMoflonEdge) arguments.get(0));
		case RulesPackage.CONFORM_LOAD_GROUP___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CONFORM_LOAD_GROUP___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.CONFORM_LOAD_GROUP___CHECK_DEC_FWD__SERVICEDELIVERYPOINT_METERASSETPHYSICALDEVICEPAIR_METERASSET_CONFORMLOADGROUP_CONFORMLOAD:
			return checkDEC_FWD((ServiceDeliveryPoint) arguments.get(0),
					(MeterAssetPhysicalDevicePair) arguments.get(1), (MeterAsset) arguments.get(2),
					(gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup) arguments.get(3),
					(ConformLoad) arguments.get(4));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ConformLoadGroup_0_1_initialbindings_blackBBBBBBB(ConformLoadGroup _this,
			Match match, ServiceDeliveryPoint srcDeliver, MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		return new Object[] { _this, match, srcDeliver, pair, asset, srcGroup, srcConsumer };
	}

	public static final Object[] pattern_ConformLoadGroup_0_2_SolveCSP_bindingFBBBBBBB(ConformLoadGroup _this,
			Match match, ServiceDeliveryPoint srcDeliver, MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, srcDeliver, pair, asset, srcGroup, srcConsumer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, srcDeliver, pair, asset, srcGroup, srcConsumer };
		}
		return null;
	}

	public static final Object[] pattern_ConformLoadGroup_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ConformLoadGroup_0_2_SolveCSP_bindingAndBlackFBBBBBBB(ConformLoadGroup _this,
			Match match, ServiceDeliveryPoint srcDeliver, MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		Object[] result_pattern_ConformLoadGroup_0_2_SolveCSP_binding = pattern_ConformLoadGroup_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, srcDeliver, pair, asset, srcGroup, srcConsumer);
		if (result_pattern_ConformLoadGroup_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ConformLoadGroup_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ConformLoadGroup_0_2_SolveCSP_black = pattern_ConformLoadGroup_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ConformLoadGroup_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, srcDeliver, pair, asset, srcGroup, srcConsumer };
			}
		}
		return null;
	}

	public static final boolean pattern_ConformLoadGroup_0_3_CheckCSP_expressionFBB(ConformLoadGroup _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConformLoadGroup_0_4_collectelementstobetranslated_blackBBBBBB(Match match,
			ServiceDeliveryPoint srcDeliver, MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		return new Object[] { match, srcDeliver, pair, asset, srcGroup, srcConsumer };
	}

	public static final Object[] pattern_ConformLoadGroup_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		EMoflonEdge srcConsumer__srcGroup____LoadGroup = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcGroup__srcConsumer____EnergyConsumers = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(srcGroup);
		String srcConsumer__srcGroup____LoadGroup_name_prime = "LoadGroup";
		String srcGroup__srcConsumer____EnergyConsumers_name_prime = "EnergyConsumers";
		srcConsumer__srcGroup____LoadGroup.setSrc(srcConsumer);
		srcConsumer__srcGroup____LoadGroup.setTrg(srcGroup);
		match.getToBeTranslatedEdges().add(srcConsumer__srcGroup____LoadGroup);
		srcGroup__srcConsumer____EnergyConsumers.setSrc(srcGroup);
		srcGroup__srcConsumer____EnergyConsumers.setTrg(srcConsumer);
		match.getToBeTranslatedEdges().add(srcGroup__srcConsumer____EnergyConsumers);
		srcConsumer__srcGroup____LoadGroup.setName(srcConsumer__srcGroup____LoadGroup_name_prime);
		srcGroup__srcConsumer____EnergyConsumers.setName(srcGroup__srcConsumer____EnergyConsumers_name_prime);
		return new Object[] { match, srcGroup, srcConsumer, srcConsumer__srcGroup____LoadGroup,
				srcGroup__srcConsumer____EnergyConsumers };
	}

	public static final Object[] pattern_ConformLoadGroup_0_5_collectcontextelements_blackBBBBBB(Match match,
			ServiceDeliveryPoint srcDeliver, MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		return new Object[] { match, srcDeliver, pair, asset, srcGroup, srcConsumer };
	}

	public static final Object[] pattern_ConformLoadGroup_0_5_collectcontextelements_greenBBBBBFFFFF(Match match,
			ServiceDeliveryPoint srcDeliver, MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			ConformLoad srcConsumer) {
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__asset____EndDeviceAssets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(srcDeliver);
		match.getContextNodes().add(pair);
		match.getContextNodes().add(asset);
		match.getContextNodes().add(srcConsumer);
		String pair__asset____a_name_prime = "a";
		String asset__srcDeliver____ServiceDeliveryPoint_name_prime = "ServiceDeliveryPoint";
		String srcDeliver__asset____EndDeviceAssets_name_prime = "EndDeviceAssets";
		String srcDeliver__srcConsumer____EnergyConsumer_name_prime = "EnergyConsumer";
		String srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime = "ServiceDeliveryPoints";
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		match.getContextEdges().add(pair__asset____a);
		asset__srcDeliver____ServiceDeliveryPoint.setSrc(asset);
		asset__srcDeliver____ServiceDeliveryPoint.setTrg(srcDeliver);
		match.getContextEdges().add(asset__srcDeliver____ServiceDeliveryPoint);
		srcDeliver__asset____EndDeviceAssets.setSrc(srcDeliver);
		srcDeliver__asset____EndDeviceAssets.setTrg(asset);
		match.getContextEdges().add(srcDeliver__asset____EndDeviceAssets);
		srcDeliver__srcConsumer____EnergyConsumer.setSrc(srcDeliver);
		srcDeliver__srcConsumer____EnergyConsumer.setTrg(srcConsumer);
		match.getContextEdges().add(srcDeliver__srcConsumer____EnergyConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setSrc(srcConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setTrg(srcDeliver);
		match.getContextEdges().add(srcConsumer__srcDeliver____ServiceDeliveryPoints);
		pair__asset____a.setName(pair__asset____a_name_prime);
		asset__srcDeliver____ServiceDeliveryPoint.setName(asset__srcDeliver____ServiceDeliveryPoint_name_prime);
		srcDeliver__asset____EndDeviceAssets.setName(srcDeliver__asset____EndDeviceAssets_name_prime);
		srcDeliver__srcConsumer____EnergyConsumer.setName(srcDeliver__srcConsumer____EnergyConsumer_name_prime);
		srcConsumer__srcDeliver____ServiceDeliveryPoints
				.setName(srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime);
		return new Object[] { match, srcDeliver, pair, asset, srcConsumer, pair__asset____a,
				asset__srcDeliver____ServiceDeliveryPoint, srcDeliver__asset____EndDeviceAssets,
				srcDeliver__srcConsumer____EnergyConsumer, srcConsumer__srcDeliver____ServiceDeliveryPoints };
	}

	public static final void pattern_ConformLoadGroup_0_6_registerobjectstomatch_expressionBBBBBBB(
			ConformLoadGroup _this, Match match, ServiceDeliveryPoint srcDeliver, MeterAssetPhysicalDevicePair pair,
			MeterAsset asset, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		_this.registerObjectsToMatch_FWD(match, srcDeliver, pair, asset, srcGroup, srcConsumer);

	}

	public static final boolean pattern_ConformLoadGroup_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ConformLoadGroup_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ConformLoadGroup_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("trgConsumer");
		EObject _localVariable_1 = isApplicableMatch.getObject("consumerToConsumer");
		EObject _localVariable_2 = isApplicableMatch.getObject("srcDeliver");
		EObject _localVariable_3 = isApplicableMatch.getObject("pair");
		EObject _localVariable_4 = isApplicableMatch.getObject("asset");
		EObject _localVariable_5 = isApplicableMatch.getObject("srcGroup");
		EObject _localVariable_6 = isApplicableMatch.getObject("srcConsumer");
		EObject tmpTrgConsumer = _localVariable_0;
		EObject tmpConsumerToConsumer = _localVariable_1;
		EObject tmpSrcDeliver = _localVariable_2;
		EObject tmpPair = _localVariable_3;
		EObject tmpAsset = _localVariable_4;
		EObject tmpSrcGroup = _localVariable_5;
		EObject tmpSrcConsumer = _localVariable_6;
		if (tmpTrgConsumer instanceof outagePreventionJointarget.ConformLoad) {
			outagePreventionJointarget.ConformLoad trgConsumer = (outagePreventionJointarget.ConformLoad) tmpTrgConsumer;
			if (tmpConsumerToConsumer instanceof EnergyConsumerToEnergyConsumer) {
				EnergyConsumerToEnergyConsumer consumerToConsumer = (EnergyConsumerToEnergyConsumer) tmpConsumerToConsumer;
				if (tmpSrcDeliver instanceof ServiceDeliveryPoint) {
					ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) tmpSrcDeliver;
					if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
						MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
						if (tmpAsset instanceof MeterAsset) {
							MeterAsset asset = (MeterAsset) tmpAsset;
							if (tmpSrcGroup instanceof gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup) {
								gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup = (gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup) tmpSrcGroup;
								if (tmpSrcConsumer instanceof ConformLoad) {
									ConformLoad srcConsumer = (ConformLoad) tmpSrcConsumer;
									return new Object[] { trgConsumer, consumerToConsumer, srcDeliver, pair, asset,
											srcGroup, srcConsumer, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ConformLoadGroup_1_1_performtransformation_blackBBBBBBBFBB(
			outagePreventionJointarget.ConformLoad trgConsumer, EnergyConsumerToEnergyConsumer consumerToConsumer,
			ServiceDeliveryPoint srcDeliver, MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, ConformLoad srcConsumer, ConformLoadGroup _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { trgConsumer, consumerToConsumer, srcDeliver, pair, asset, srcGroup, srcConsumer,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConformLoadGroup_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			ConformLoadGroup _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ConformLoadGroup_1_1_performtransformation_binding = pattern_ConformLoadGroup_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ConformLoadGroup_1_1_performtransformation_binding != null) {
			outagePreventionJointarget.ConformLoad trgConsumer = (outagePreventionJointarget.ConformLoad) result_pattern_ConformLoadGroup_1_1_performtransformation_binding[0];
			EnergyConsumerToEnergyConsumer consumerToConsumer = (EnergyConsumerToEnergyConsumer) result_pattern_ConformLoadGroup_1_1_performtransformation_binding[1];
			ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result_pattern_ConformLoadGroup_1_1_performtransformation_binding[2];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result_pattern_ConformLoadGroup_1_1_performtransformation_binding[3];
			MeterAsset asset = (MeterAsset) result_pattern_ConformLoadGroup_1_1_performtransformation_binding[4];
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup = (gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup) result_pattern_ConformLoadGroup_1_1_performtransformation_binding[5];
			ConformLoad srcConsumer = (ConformLoad) result_pattern_ConformLoadGroup_1_1_performtransformation_binding[6];

			Object[] result_pattern_ConformLoadGroup_1_1_performtransformation_black = pattern_ConformLoadGroup_1_1_performtransformation_blackBBBBBBBFBB(
					trgConsumer, consumerToConsumer, srcDeliver, pair, asset, srcGroup, srcConsumer, _this,
					isApplicableMatch);
			if (result_pattern_ConformLoadGroup_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ConformLoadGroup_1_1_performtransformation_black[7];

				return new Object[] { trgConsumer, consumerToConsumer, srcDeliver, pair, asset, srcGroup, srcConsumer,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConformLoadGroup_1_1_performtransformation_greenBFBF(
			outagePreventionJointarget.ConformLoad trgConsumer,
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup) {
		outagePreventionJointarget.ConformLoadGroup trgGroup = OutagePreventionJointargetFactory.eINSTANCE
				.createConformLoadGroup();
		ConformLoadGroupToConformLoadGroup groupToGroup = Task2Factory.eINSTANCE
				.createConformLoadGroupToConformLoadGroup();
		trgConsumer.setLoadGroup(trgGroup);
		groupToGroup.setTarget(trgGroup);
		groupToGroup.setSource(srcGroup);
		return new Object[] { trgConsumer, trgGroup, srcGroup, groupToGroup };
	}

	public static final Object[] pattern_ConformLoadGroup_1_2_collecttranslatedelements_blackBBB(
			outagePreventionJointarget.ConformLoadGroup trgGroup,
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup,
			ConformLoadGroupToConformLoadGroup groupToGroup) {
		return new Object[] { trgGroup, srcGroup, groupToGroup };
	}

	public static final Object[] pattern_ConformLoadGroup_1_2_collecttranslatedelements_greenFBBB(
			outagePreventionJointarget.ConformLoadGroup trgGroup,
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup,
			ConformLoadGroupToConformLoadGroup groupToGroup) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(trgGroup);
		ruleresult.getTranslatedElements().add(srcGroup);
		ruleresult.getCreatedLinkElements().add(groupToGroup);
		return new Object[] { ruleresult, trgGroup, srcGroup, groupToGroup };
	}

	public static final Object[] pattern_ConformLoadGroup_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject trgConsumer, EObject consumerToConsumer, EObject srcDeliver,
			EObject trgGroup, EObject pair, EObject asset, EObject srcGroup, EObject groupToGroup,
			EObject srcConsumer) {
		if (!trgConsumer.equals(trgGroup)) {
			if (!consumerToConsumer.equals(trgConsumer)) {
				if (!consumerToConsumer.equals(srcDeliver)) {
					if (!consumerToConsumer.equals(trgGroup)) {
						if (!consumerToConsumer.equals(pair)) {
							if (!consumerToConsumer.equals(srcGroup)) {
								if (!consumerToConsumer.equals(groupToGroup)) {
									if (!consumerToConsumer.equals(srcConsumer)) {
										if (!srcDeliver.equals(trgConsumer)) {
											if (!srcDeliver.equals(trgGroup)) {
												if (!srcDeliver.equals(srcGroup)) {
													if (!pair.equals(trgConsumer)) {
														if (!pair.equals(srcDeliver)) {
															if (!pair.equals(trgGroup)) {
																if (!pair.equals(srcGroup)) {
																	if (!pair.equals(srcConsumer)) {
																		if (!asset.equals(trgConsumer)) {
																			if (!asset.equals(consumerToConsumer)) {
																				if (!asset.equals(srcDeliver)) {
																					if (!asset.equals(trgGroup)) {
																						if (!asset.equals(pair)) {
																							if (!asset
																									.equals(srcGroup)) {
																								if (!asset.equals(
																										groupToGroup)) {
																									if (!asset.equals(
																											srcConsumer)) {
																										if (!srcGroup
																												.equals(trgConsumer)) {
																											if (!srcGroup
																													.equals(trgGroup)) {
																												if (!groupToGroup
																														.equals(trgConsumer)) {
																													if (!groupToGroup
																															.equals(srcDeliver)) {
																														if (!groupToGroup
																																.equals(trgGroup)) {
																															if (!groupToGroup
																																	.equals(pair)) {
																																if (!groupToGroup
																																		.equals(srcGroup)) {
																																	if (!groupToGroup
																																			.equals(srcConsumer)) {
																																		if (!srcConsumer
																																				.equals(trgConsumer)) {
																																			if (!srcConsumer
																																					.equals(srcDeliver)) {
																																				if (!srcConsumer
																																						.equals(trgGroup)) {
																																					if (!srcConsumer
																																							.equals(srcGroup)) {
																																						return new Object[] {
																																								ruleresult,
																																								trgConsumer,
																																								consumerToConsumer,
																																								srcDeliver,
																																								trgGroup,
																																								pair,
																																								asset,
																																								srcGroup,
																																								groupToGroup,
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
		return null;
	}

	public static final Object[] pattern_ConformLoadGroup_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject trgConsumer, EObject trgGroup, EObject srcGroup, EObject groupToGroup,
			EObject srcConsumer) {
		EMoflonEdge trgConsumer__trgGroup____LoadGroup = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge groupToGroup__trgGroup____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge groupToGroup__srcGroup____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcConsumer__srcGroup____LoadGroup = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcGroup__srcConsumer____EnergyConsumers = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ConformLoadGroup";
		String trgConsumer__trgGroup____LoadGroup_name_prime = "LoadGroup";
		String groupToGroup__trgGroup____target_name_prime = "target";
		String groupToGroup__srcGroup____source_name_prime = "source";
		String srcConsumer__srcGroup____LoadGroup_name_prime = "LoadGroup";
		String srcGroup__srcConsumer____EnergyConsumers_name_prime = "EnergyConsumers";
		trgConsumer__trgGroup____LoadGroup.setSrc(trgConsumer);
		trgConsumer__trgGroup____LoadGroup.setTrg(trgGroup);
		ruleresult.getCreatedEdges().add(trgConsumer__trgGroup____LoadGroup);
		groupToGroup__trgGroup____target.setSrc(groupToGroup);
		groupToGroup__trgGroup____target.setTrg(trgGroup);
		ruleresult.getCreatedEdges().add(groupToGroup__trgGroup____target);
		groupToGroup__srcGroup____source.setSrc(groupToGroup);
		groupToGroup__srcGroup____source.setTrg(srcGroup);
		ruleresult.getCreatedEdges().add(groupToGroup__srcGroup____source);
		srcConsumer__srcGroup____LoadGroup.setSrc(srcConsumer);
		srcConsumer__srcGroup____LoadGroup.setTrg(srcGroup);
		ruleresult.getTranslatedEdges().add(srcConsumer__srcGroup____LoadGroup);
		srcGroup__srcConsumer____EnergyConsumers.setSrc(srcGroup);
		srcGroup__srcConsumer____EnergyConsumers.setTrg(srcConsumer);
		ruleresult.getTranslatedEdges().add(srcGroup__srcConsumer____EnergyConsumers);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		trgConsumer__trgGroup____LoadGroup.setName(trgConsumer__trgGroup____LoadGroup_name_prime);
		groupToGroup__trgGroup____target.setName(groupToGroup__trgGroup____target_name_prime);
		groupToGroup__srcGroup____source.setName(groupToGroup__srcGroup____source_name_prime);
		srcConsumer__srcGroup____LoadGroup.setName(srcConsumer__srcGroup____LoadGroup_name_prime);
		srcGroup__srcConsumer____EnergyConsumers.setName(srcGroup__srcConsumer____EnergyConsumers_name_prime);
		return new Object[] { ruleresult, trgConsumer, trgGroup, srcGroup, groupToGroup, srcConsumer,
				trgConsumer__trgGroup____LoadGroup, groupToGroup__trgGroup____target, groupToGroup__srcGroup____source,
				srcConsumer__srcGroup____LoadGroup, srcGroup__srcConsumer____EnergyConsumers };
	}

	public static final void pattern_ConformLoadGroup_1_5_registerobjects_expressionBBBBBBBBBBB(ConformLoadGroup _this,
			PerformRuleResult ruleresult, EObject trgConsumer, EObject consumerToConsumer, EObject srcDeliver,
			EObject trgGroup, EObject pair, EObject asset, EObject srcGroup, EObject groupToGroup,
			EObject srcConsumer) {
		_this.registerObjects_FWD(ruleresult, trgConsumer, consumerToConsumer, srcDeliver, trgGroup, pair, asset,
				srcGroup, groupToGroup, srcConsumer);

	}

	public static final PerformRuleResult pattern_ConformLoadGroup_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ConformLoadGroup_2_1_preparereturnvalue_bindingFB(ConformLoadGroup _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ConformLoadGroup_2_1_preparereturnvalue_blackFBB(EClass eClass,
			ConformLoadGroup _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ConformLoadGroup_2_1_preparereturnvalue_bindingAndBlackFFB(
			ConformLoadGroup _this) {
		Object[] result_pattern_ConformLoadGroup_2_1_preparereturnvalue_binding = pattern_ConformLoadGroup_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ConformLoadGroup_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ConformLoadGroup_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ConformLoadGroup_2_1_preparereturnvalue_black = pattern_ConformLoadGroup_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ConformLoadGroup_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ConformLoadGroup_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConformLoadGroup_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ConformLoadGroup";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ConformLoadGroup_2_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("srcDeliver");
		EObject _localVariable_1 = match.getObject("pair");
		EObject _localVariable_2 = match.getObject("asset");
		EObject _localVariable_3 = match.getObject("srcGroup");
		EObject _localVariable_4 = match.getObject("srcConsumer");
		EObject tmpSrcDeliver = _localVariable_0;
		EObject tmpPair = _localVariable_1;
		EObject tmpAsset = _localVariable_2;
		EObject tmpSrcGroup = _localVariable_3;
		EObject tmpSrcConsumer = _localVariable_4;
		if (tmpSrcDeliver instanceof ServiceDeliveryPoint) {
			ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) tmpSrcDeliver;
			if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
				MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
				if (tmpAsset instanceof MeterAsset) {
					MeterAsset asset = (MeterAsset) tmpAsset;
					if (tmpSrcGroup instanceof gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup) {
						gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup = (gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup) tmpSrcGroup;
						if (tmpSrcConsumer instanceof ConformLoad) {
							ConformLoad srcConsumer = (ConformLoad) tmpSrcConsumer;
							return new Object[] { srcDeliver, pair, asset, srcGroup, srcConsumer, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ConformLoadGroup_2_2_corematch_blackFFBBBBBB(
			ServiceDeliveryPoint srcDeliver, MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, ConformLoad srcConsumer, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (EnergyConsumerToEnergyConsumer consumerToConsumer : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(srcConsumer, EnergyConsumerToEnergyConsumer.class, "source")) {
			EnergyConsumer tmpTrgConsumer = consumerToConsumer.getTarget();
			if (tmpTrgConsumer instanceof outagePreventionJointarget.ConformLoad) {
				outagePreventionJointarget.ConformLoad trgConsumer = (outagePreventionJointarget.ConformLoad) tmpTrgConsumer;
				_result.add(new Object[] { trgConsumer, consumerToConsumer, srcDeliver, pair, asset, srcGroup,
						srcConsumer, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ConformLoadGroup_2_3_findcontext_blackBBBBBBB(
			outagePreventionJointarget.ConformLoad trgConsumer, EnergyConsumerToEnergyConsumer consumerToConsumer,
			ServiceDeliveryPoint srcDeliver, MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (asset.equals(pair.getA())) {
			if (srcDeliver.equals(asset.getServiceDeliveryPoint())) {
				if (srcConsumer.equals(consumerToConsumer.getSource())) {
					if (srcGroup.equals(srcConsumer.getLoadGroup())) {
						if (trgConsumer.equals(consumerToConsumer.getTarget())) {
							if (srcConsumer.equals(srcDeliver.getEnergyConsumer())) {
								_result.add(new Object[] { trgConsumer, consumerToConsumer, srcDeliver, pair, asset,
										srcGroup, srcConsumer });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ConformLoadGroup_2_3_findcontext_greenBBBBBBBFFFFFFFFFF(
			outagePreventionJointarget.ConformLoad trgConsumer, EnergyConsumerToEnergyConsumer consumerToConsumer,
			ServiceDeliveryPoint srcDeliver, MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__asset____EndDeviceAssets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge consumerToConsumer__srcConsumer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcConsumer__srcGroup____LoadGroup = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcGroup__srcConsumer____EnergyConsumers = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge consumerToConsumer__trgConsumer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String pair__asset____a_name_prime = "a";
		String asset__srcDeliver____ServiceDeliveryPoint_name_prime = "ServiceDeliveryPoint";
		String srcDeliver__asset____EndDeviceAssets_name_prime = "EndDeviceAssets";
		String consumerToConsumer__srcConsumer____source_name_prime = "source";
		String srcConsumer__srcGroup____LoadGroup_name_prime = "LoadGroup";
		String srcGroup__srcConsumer____EnergyConsumers_name_prime = "EnergyConsumers";
		String consumerToConsumer__trgConsumer____target_name_prime = "target";
		String srcDeliver__srcConsumer____EnergyConsumer_name_prime = "EnergyConsumer";
		String srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime = "ServiceDeliveryPoints";
		isApplicableMatch.getAllContextElements().add(trgConsumer);
		isApplicableMatch.getAllContextElements().add(consumerToConsumer);
		isApplicableMatch.getAllContextElements().add(srcDeliver);
		isApplicableMatch.getAllContextElements().add(pair);
		isApplicableMatch.getAllContextElements().add(asset);
		isApplicableMatch.getAllContextElements().add(srcGroup);
		isApplicableMatch.getAllContextElements().add(srcConsumer);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(pair__asset____a);
		asset__srcDeliver____ServiceDeliveryPoint.setSrc(asset);
		asset__srcDeliver____ServiceDeliveryPoint.setTrg(srcDeliver);
		isApplicableMatch.getAllContextElements().add(asset__srcDeliver____ServiceDeliveryPoint);
		srcDeliver__asset____EndDeviceAssets.setSrc(srcDeliver);
		srcDeliver__asset____EndDeviceAssets.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(srcDeliver__asset____EndDeviceAssets);
		consumerToConsumer__srcConsumer____source.setSrc(consumerToConsumer);
		consumerToConsumer__srcConsumer____source.setTrg(srcConsumer);
		isApplicableMatch.getAllContextElements().add(consumerToConsumer__srcConsumer____source);
		srcConsumer__srcGroup____LoadGroup.setSrc(srcConsumer);
		srcConsumer__srcGroup____LoadGroup.setTrg(srcGroup);
		isApplicableMatch.getAllContextElements().add(srcConsumer__srcGroup____LoadGroup);
		srcGroup__srcConsumer____EnergyConsumers.setSrc(srcGroup);
		srcGroup__srcConsumer____EnergyConsumers.setTrg(srcConsumer);
		isApplicableMatch.getAllContextElements().add(srcGroup__srcConsumer____EnergyConsumers);
		consumerToConsumer__trgConsumer____target.setSrc(consumerToConsumer);
		consumerToConsumer__trgConsumer____target.setTrg(trgConsumer);
		isApplicableMatch.getAllContextElements().add(consumerToConsumer__trgConsumer____target);
		srcDeliver__srcConsumer____EnergyConsumer.setSrc(srcDeliver);
		srcDeliver__srcConsumer____EnergyConsumer.setTrg(srcConsumer);
		isApplicableMatch.getAllContextElements().add(srcDeliver__srcConsumer____EnergyConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setSrc(srcConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setTrg(srcDeliver);
		isApplicableMatch.getAllContextElements().add(srcConsumer__srcDeliver____ServiceDeliveryPoints);
		pair__asset____a.setName(pair__asset____a_name_prime);
		asset__srcDeliver____ServiceDeliveryPoint.setName(asset__srcDeliver____ServiceDeliveryPoint_name_prime);
		srcDeliver__asset____EndDeviceAssets.setName(srcDeliver__asset____EndDeviceAssets_name_prime);
		consumerToConsumer__srcConsumer____source.setName(consumerToConsumer__srcConsumer____source_name_prime);
		srcConsumer__srcGroup____LoadGroup.setName(srcConsumer__srcGroup____LoadGroup_name_prime);
		srcGroup__srcConsumer____EnergyConsumers.setName(srcGroup__srcConsumer____EnergyConsumers_name_prime);
		consumerToConsumer__trgConsumer____target.setName(consumerToConsumer__trgConsumer____target_name_prime);
		srcDeliver__srcConsumer____EnergyConsumer.setName(srcDeliver__srcConsumer____EnergyConsumer_name_prime);
		srcConsumer__srcDeliver____ServiceDeliveryPoints
				.setName(srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime);
		return new Object[] { trgConsumer, consumerToConsumer, srcDeliver, pair, asset, srcGroup, srcConsumer,
				isApplicableMatch, pair__asset____a, asset__srcDeliver____ServiceDeliveryPoint,
				srcDeliver__asset____EndDeviceAssets, consumerToConsumer__srcConsumer____source,
				srcConsumer__srcGroup____LoadGroup, srcGroup__srcConsumer____EnergyConsumers,
				consumerToConsumer__trgConsumer____target, srcDeliver__srcConsumer____EnergyConsumer,
				srcConsumer__srcDeliver____ServiceDeliveryPoints };
	}

	public static final Object[] pattern_ConformLoadGroup_2_4_solveCSP_bindingFBBBBBBBBB(ConformLoadGroup _this,
			IsApplicableMatch isApplicableMatch, outagePreventionJointarget.ConformLoad trgConsumer,
			EnergyConsumerToEnergyConsumer consumerToConsumer, ServiceDeliveryPoint srcDeliver,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, trgConsumer, consumerToConsumer,
				srcDeliver, pair, asset, srcGroup, srcConsumer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, trgConsumer, consumerToConsumer, srcDeliver, pair,
					asset, srcGroup, srcConsumer };
		}
		return null;
	}

	public static final Object[] pattern_ConformLoadGroup_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ConformLoadGroup_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(ConformLoadGroup _this,
			IsApplicableMatch isApplicableMatch, outagePreventionJointarget.ConformLoad trgConsumer,
			EnergyConsumerToEnergyConsumer consumerToConsumer, ServiceDeliveryPoint srcDeliver,
			MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		Object[] result_pattern_ConformLoadGroup_2_4_solveCSP_binding = pattern_ConformLoadGroup_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, trgConsumer, consumerToConsumer, srcDeliver, pair, asset, srcGroup,
				srcConsumer);
		if (result_pattern_ConformLoadGroup_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ConformLoadGroup_2_4_solveCSP_binding[0];

			Object[] result_pattern_ConformLoadGroup_2_4_solveCSP_black = pattern_ConformLoadGroup_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ConformLoadGroup_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, trgConsumer, consumerToConsumer, srcDeliver, pair,
						asset, srcGroup, srcConsumer };
			}
		}
		return null;
	}

	public static final boolean pattern_ConformLoadGroup_2_5_checkCSP_expressionFBB(ConformLoadGroup _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConformLoadGroup_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ConformLoadGroup_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ConformLoadGroup";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ConformLoadGroup_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ConformLoadGroup_10_1_preparereturnvalue_bindingFB(ConformLoadGroup _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ConformLoadGroup_10_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ConformLoadGroup _this) {
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

	public static final Object[] pattern_ConformLoadGroup_10_1_preparereturnvalue_bindingAndBlackFFBF(
			ConformLoadGroup _this) {
		Object[] result_pattern_ConformLoadGroup_10_1_preparereturnvalue_binding = pattern_ConformLoadGroup_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ConformLoadGroup_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ConformLoadGroup_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ConformLoadGroup_10_1_preparereturnvalue_black = pattern_ConformLoadGroup_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ConformLoadGroup_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ConformLoadGroup_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ConformLoadGroup_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConformLoadGroup_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ConformLoadGroup_10_2_testcorematchandDECs_black_nac_0BB(
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		for (ConformLoad __DEC_srcGroup_LoadGroup_348666 : srcGroup.getEnergyConsumers()) {
			if (!srcConsumer.equals(__DEC_srcGroup_LoadGroup_348666)) {
				return new Object[] { srcGroup, srcConsumer };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ConformLoadGroup_10_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_LoadGroup) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSrcConsumer = _edge_LoadGroup.getSrc();
		if (tmpSrcConsumer instanceof ConformLoad) {
			ConformLoad srcConsumer = (ConformLoad) tmpSrcConsumer;
			EObject tmpSrcGroup = _edge_LoadGroup.getTrg();
			if (tmpSrcGroup instanceof gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup) {
				gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup = (gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup) tmpSrcGroup;
				if (srcGroup.equals(srcConsumer.getLoadGroup())) {
					if (pattern_ConformLoadGroup_10_2_testcorematchandDECs_black_nac_0BB(srcGroup,
							srcConsumer) == null) {
						for (ServiceDeliveryPoint srcDeliver : srcConsumer.getServiceDeliveryPoints()) {
							for (EndDeviceAsset tmpAsset : srcDeliver.getEndDeviceAssets()) {
								if (tmpAsset instanceof MeterAsset) {
									MeterAsset asset = (MeterAsset) tmpAsset;
									for (MeterAssetPhysicalDevicePair pair : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(asset, MeterAssetPhysicalDevicePair.class,
													"a")) {
										_result.add(new Object[] { srcDeliver, pair, asset, srcGroup, srcConsumer,
												_edge_LoadGroup });
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

	public static final Object[] pattern_ConformLoadGroup_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ConformLoadGroup_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			ConformLoadGroup _this, Match match, ServiceDeliveryPoint srcDeliver, MeterAssetPhysicalDevicePair pair,
			MeterAsset asset, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, srcDeliver, pair, asset, srcGroup, srcConsumer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ConformLoadGroup_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ConformLoadGroup _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConformLoadGroup_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ConformLoadGroup_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ConformLoadGroup_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ConformLoadGroup_13_1_matchtggpattern_black_nac_0BB(
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		for (ConformLoad __DEC_srcGroup_LoadGroup_96345 : srcGroup.getEnergyConsumers()) {
			if (!srcConsumer.equals(__DEC_srcGroup_LoadGroup_96345)) {
				return new Object[] { srcGroup, srcConsumer };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConformLoadGroup_13_1_matchtggpattern_blackBBBBB(
			ServiceDeliveryPoint srcDeliver, MeterAssetPhysicalDevicePair pair, MeterAsset asset,
			gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup srcGroup, ConformLoad srcConsumer) {
		if (asset.equals(pair.getA())) {
			if (srcDeliver.equals(asset.getServiceDeliveryPoint())) {
				if (srcGroup.equals(srcConsumer.getLoadGroup())) {
					if (srcConsumer.equals(srcDeliver.getEnergyConsumer())) {
						if (pattern_ConformLoadGroup_13_1_matchtggpattern_black_nac_0BB(srcGroup,
								srcConsumer) == null) {
							return new Object[] { srcDeliver, pair, asset, srcGroup, srcConsumer };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_ConformLoadGroup_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ConformLoadGroup_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ConformLoadGroupImpl
