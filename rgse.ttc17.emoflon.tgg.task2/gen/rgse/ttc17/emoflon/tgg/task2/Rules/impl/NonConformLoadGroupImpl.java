/**
 */
package rgse.ttc17.emoflon.tgg.task2.Rules.impl;

import gluemodel.CIM.IEC61968.Metering.EndDeviceAsset;
import gluemodel.CIM.IEC61968.Metering.MeterAsset;
import gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint;

import gluemodel.CIM.IEC61970.LoadModel.NonConformLoad;

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

import rgse.ttc17.emoflon.tgg.task2.EnergyConsumerToEnergyConsumer;
import rgse.ttc17.emoflon.tgg.task2.NonConformLoadGroupNonToConformLoadGroup;

import rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoadGroup;
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
 * An implementation of the model object '<em><b>Non Conform Load Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NonConformLoadGroupImpl extends AbstractRuleImpl implements NonConformLoadGroup {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonConformLoadGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getNonConformLoadGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, NonConformLoad srcConsumer, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPoint srcDeliver, gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup,
			MeterAsset asset) {
		// initial bindings
		Object[] result1_black = NonConformLoadGroupImpl.pattern_NonConformLoadGroup_0_1_initialbindings_blackBBBBBBB(
				this, match, srcConsumer, pair, srcDeliver, srcGroup, asset);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[srcConsumer] = " + srcConsumer + ", "
					+ "[pair] = " + pair + ", " + "[srcDeliver] = " + srcDeliver + ", " + "[srcGroup] = " + srcGroup
					+ ", " + "[asset] = " + asset + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = NonConformLoadGroupImpl
				.pattern_NonConformLoadGroup_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, srcConsumer, pair,
						srcDeliver, srcGroup, asset);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[srcConsumer] = " + srcConsumer + ", " + "[pair] = "
					+ pair + ", " + "[srcDeliver] = " + srcDeliver + ", " + "[srcGroup] = " + srcGroup + ", "
					+ "[asset] = " + asset + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (NonConformLoadGroupImpl.pattern_NonConformLoadGroup_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = NonConformLoadGroupImpl
					.pattern_NonConformLoadGroup_0_4_collectelementstobetranslated_blackBBBBBB(match, srcConsumer, pair,
							srcDeliver, srcGroup, asset);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[srcConsumer] = " + srcConsumer + ", "
						+ "[pair] = " + pair + ", " + "[srcDeliver] = " + srcDeliver + ", " + "[srcGroup] = " + srcGroup
						+ ", " + "[asset] = " + asset + ".");
			}
			NonConformLoadGroupImpl.pattern_NonConformLoadGroup_0_4_collectelementstobetranslated_greenBBBFF(match,
					srcConsumer, srcGroup);
			// EMoflonEdge srcConsumer__srcGroup____LoadGroup = (EMoflonEdge) result4_green[3];
			// EMoflonEdge srcGroup__srcConsumer____EnergyConsumers = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = NonConformLoadGroupImpl
					.pattern_NonConformLoadGroup_0_5_collectcontextelements_blackBBBBBB(match, srcConsumer, pair,
							srcDeliver, srcGroup, asset);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[srcConsumer] = " + srcConsumer + ", "
						+ "[pair] = " + pair + ", " + "[srcDeliver] = " + srcDeliver + ", " + "[srcGroup] = " + srcGroup
						+ ", " + "[asset] = " + asset + ".");
			}
			NonConformLoadGroupImpl.pattern_NonConformLoadGroup_0_5_collectcontextelements_greenBBBBBFFFFF(match,
					srcConsumer, pair, srcDeliver, asset);
			// EMoflonEdge pair__asset____a = (EMoflonEdge) result5_green[5];
			// EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = (EMoflonEdge) result5_green[6];
			// EMoflonEdge srcDeliver__asset____EndDeviceAssets = (EMoflonEdge) result5_green[7];
			// EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = (EMoflonEdge) result5_green[8];
			// EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = (EMoflonEdge) result5_green[9];

			// register objects to match
			NonConformLoadGroupImpl.pattern_NonConformLoadGroup_0_6_registerobjectstomatch_expressionBBBBBBB(this,
					match, srcConsumer, pair, srcDeliver, srcGroup, asset);
			return NonConformLoadGroupImpl.pattern_NonConformLoadGroup_0_7_expressionF();
		} else {
			return NonConformLoadGroupImpl.pattern_NonConformLoadGroup_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = NonConformLoadGroupImpl
				.pattern_NonConformLoadGroup_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		NonConformLoad srcConsumer = (NonConformLoad) result1_bindingAndBlack[0];
		EnergyConsumerToEnergyConsumer consumerToConsumer = (EnergyConsumerToEnergyConsumer) result1_bindingAndBlack[1];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result1_bindingAndBlack[2];
		outagePreventionJointarget.NonConformLoad trgConsumer = (outagePreventionJointarget.NonConformLoad) result1_bindingAndBlack[3];
		ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result1_bindingAndBlack[4];
		gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup = (gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup) result1_bindingAndBlack[5];
		MeterAsset asset = (MeterAsset) result1_bindingAndBlack[6];
		// CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = NonConformLoadGroupImpl
				.pattern_NonConformLoadGroup_1_1_performtransformation_greenBBFF(trgConsumer, srcGroup);
		outagePreventionJointarget.NonConformLoadGroup trgGroup = (outagePreventionJointarget.NonConformLoadGroup) result1_green[2];
		NonConformLoadGroupNonToConformLoadGroup groupToGroup = (NonConformLoadGroupNonToConformLoadGroup) result1_green[3];

		// collect translated elements
		Object[] result2_black = NonConformLoadGroupImpl
				.pattern_NonConformLoadGroup_1_2_collecttranslatedelements_blackBBB(srcGroup, trgGroup, groupToGroup);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[srcGroup] = " + srcGroup + ", " + "[trgGroup] = " + trgGroup + ", " + "[groupToGroup] = "
					+ groupToGroup + ".");
		}
		Object[] result2_green = NonConformLoadGroupImpl
				.pattern_NonConformLoadGroup_1_2_collecttranslatedelements_greenFBBB(srcGroup, trgGroup, groupToGroup);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = NonConformLoadGroupImpl
				.pattern_NonConformLoadGroup_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, srcConsumer,
						consumerToConsumer, pair, trgConsumer, srcDeliver, srcGroup, asset, trgGroup, groupToGroup);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[srcConsumer] = " + srcConsumer + ", "
					+ "[consumerToConsumer] = " + consumerToConsumer + ", " + "[pair] = " + pair + ", "
					+ "[trgConsumer] = " + trgConsumer + ", " + "[srcDeliver] = " + srcDeliver + ", " + "[srcGroup] = "
					+ srcGroup + ", " + "[asset] = " + asset + ", " + "[trgGroup] = " + trgGroup + ", "
					+ "[groupToGroup] = " + groupToGroup + ".");
		}
		NonConformLoadGroupImpl.pattern_NonConformLoadGroup_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult,
				srcConsumer, trgConsumer, srcGroup, trgGroup, groupToGroup);
		// EMoflonEdge trgConsumer__trgGroup____LoadGroup = (EMoflonEdge) result3_green[6];
		// EMoflonEdge srcConsumer__srcGroup____LoadGroup = (EMoflonEdge) result3_green[7];
		// EMoflonEdge srcGroup__srcConsumer____EnergyConsumers = (EMoflonEdge) result3_green[8];
		// EMoflonEdge groupToGroup__srcGroup____source = (EMoflonEdge) result3_green[9];
		// EMoflonEdge groupToGroup__trgGroup____target = (EMoflonEdge) result3_green[10];

		// perform postprocessing story node is empty
		// register objects
		NonConformLoadGroupImpl.pattern_NonConformLoadGroup_1_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
				srcConsumer, consumerToConsumer, pair, trgConsumer, srcDeliver, srcGroup, asset, trgGroup,
				groupToGroup);
		return NonConformLoadGroupImpl.pattern_NonConformLoadGroup_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = NonConformLoadGroupImpl
				.pattern_NonConformLoadGroup_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = NonConformLoadGroupImpl
				.pattern_NonConformLoadGroup_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = NonConformLoadGroupImpl
				.pattern_NonConformLoadGroup_2_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		NonConformLoad srcConsumer = (NonConformLoad) result2_binding[0];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_binding[1];
		ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result2_binding[2];
		gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup = (gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup) result2_binding[3];
		MeterAsset asset = (MeterAsset) result2_binding[4];
		for (Object[] result2_black : NonConformLoadGroupImpl.pattern_NonConformLoadGroup_2_2_corematch_blackBFBFBBBB(
				srcConsumer, pair, srcDeliver, srcGroup, asset, match)) {
			EnergyConsumerToEnergyConsumer consumerToConsumer = (EnergyConsumerToEnergyConsumer) result2_black[1];
			outagePreventionJointarget.NonConformLoad trgConsumer = (outagePreventionJointarget.NonConformLoad) result2_black[3];
			// ForEach find context
			for (Object[] result3_black : NonConformLoadGroupImpl
					.pattern_NonConformLoadGroup_2_3_findcontext_blackBBBBBBB(srcConsumer, consumerToConsumer, pair,
							trgConsumer, srcDeliver, srcGroup, asset)) {
				Object[] result3_green = NonConformLoadGroupImpl
						.pattern_NonConformLoadGroup_2_3_findcontext_greenBBBBBBBFFFFFFFFFF(srcConsumer,
								consumerToConsumer, pair, trgConsumer, srcDeliver, srcGroup, asset);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				// EMoflonEdge pair__asset____a = (EMoflonEdge) result3_green[8];
				// EMoflonEdge consumerToConsumer__trgConsumer____target = (EMoflonEdge) result3_green[9];
				// EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = (EMoflonEdge) result3_green[10];
				// EMoflonEdge srcDeliver__asset____EndDeviceAssets = (EMoflonEdge) result3_green[11];
				// EMoflonEdge consumerToConsumer__srcConsumer____source = (EMoflonEdge) result3_green[12];
				// EMoflonEdge srcConsumer__srcGroup____LoadGroup = (EMoflonEdge) result3_green[13];
				// EMoflonEdge srcGroup__srcConsumer____EnergyConsumers = (EMoflonEdge) result3_green[14];
				// EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = (EMoflonEdge) result3_green[15];
				// EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = (EMoflonEdge) result3_green[16];

				// solve CSP
				Object[] result4_bindingAndBlack = NonConformLoadGroupImpl
						.pattern_NonConformLoadGroup_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								srcConsumer, consumerToConsumer, pair, trgConsumer, srcDeliver, srcGroup, asset);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[srcConsumer] = " + srcConsumer + ", " + "[consumerToConsumer] = " + consumerToConsumer
							+ ", " + "[pair] = " + pair + ", " + "[trgConsumer] = " + trgConsumer + ", "
							+ "[srcDeliver] = " + srcDeliver + ", " + "[srcGroup] = " + srcGroup + ", " + "[asset] = "
							+ asset + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (NonConformLoadGroupImpl.pattern_NonConformLoadGroup_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = NonConformLoadGroupImpl
							.pattern_NonConformLoadGroup_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					NonConformLoadGroupImpl.pattern_NonConformLoadGroup_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return NonConformLoadGroupImpl.pattern_NonConformLoadGroup_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, NonConformLoad srcConsumer, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPoint srcDeliver, gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup,
			MeterAsset asset) {
		match.registerObject("srcConsumer", srcConsumer);
		match.registerObject("pair", pair);
		match.registerObject("srcDeliver", srcDeliver);
		match.registerObject("srcGroup", srcGroup);
		match.registerObject("asset", asset);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, NonConformLoad srcConsumer, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPoint srcDeliver, gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup,
			MeterAsset asset) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, NonConformLoad srcConsumer,
			EnergyConsumerToEnergyConsumer consumerToConsumer, MeterAssetPhysicalDevicePair pair,
			outagePreventionJointarget.NonConformLoad trgConsumer, ServiceDeliveryPoint srcDeliver,
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup, MeterAsset asset) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("srcConsumer", srcConsumer);
		isApplicableMatch.registerObject("consumerToConsumer", consumerToConsumer);
		isApplicableMatch.registerObject("pair", pair);
		isApplicableMatch.registerObject("trgConsumer", trgConsumer);
		isApplicableMatch.registerObject("srcDeliver", srcDeliver);
		isApplicableMatch.registerObject("srcGroup", srcGroup);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject srcConsumer, EObject consumerToConsumer,
			EObject pair, EObject trgConsumer, EObject srcDeliver, EObject srcGroup, EObject asset, EObject trgGroup,
			EObject groupToGroup) {
		ruleresult.registerObject("srcConsumer", srcConsumer);
		ruleresult.registerObject("consumerToConsumer", consumerToConsumer);
		ruleresult.registerObject("pair", pair);
		ruleresult.registerObject("trgConsumer", trgConsumer);
		ruleresult.registerObject("srcDeliver", srcDeliver);
		ruleresult.registerObject("srcGroup", srcGroup);
		ruleresult.registerObject("asset", asset);
		ruleresult.registerObject("trgGroup", trgGroup);
		ruleresult.registerObject("groupToGroup", groupToGroup);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("srcGroup").eClass())
				.equals("gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_154(EMoflonEdge _edge_LoadGroup) {
		// prepare return value
		Object[] result1_bindingAndBlack = NonConformLoadGroupImpl
				.pattern_NonConformLoadGroup_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = NonConformLoadGroupImpl.pattern_NonConformLoadGroup_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : NonConformLoadGroupImpl
				.pattern_NonConformLoadGroup_10_2_testcorematchandDECs_blackFFFFFB(_edge_LoadGroup)) {
			NonConformLoad srcConsumer = (NonConformLoad) result2_black[0];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_black[1];
			ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result2_black[2];
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup = (gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup) result2_black[3];
			MeterAsset asset = (MeterAsset) result2_black[4];
			Object[] result2_green = NonConformLoadGroupImpl
					.pattern_NonConformLoadGroup_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (NonConformLoadGroupImpl
					.pattern_NonConformLoadGroup_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, srcConsumer, pair, srcDeliver, srcGroup, asset)) {
				// Ensure that the correct types of elements are matched
				if (NonConformLoadGroupImpl
						.pattern_NonConformLoadGroup_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = NonConformLoadGroupImpl
							.pattern_NonConformLoadGroup_10_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					NonConformLoadGroupImpl.pattern_NonConformLoadGroup_10_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return NonConformLoadGroupImpl.pattern_NonConformLoadGroup_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("NonConformLoadGroup");
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
	public boolean checkDEC_FWD(NonConformLoad srcConsumer, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPoint srcDeliver, gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup,
			MeterAsset asset) {// match tgg pattern
		Object[] result1_black = NonConformLoadGroupImpl.pattern_NonConformLoadGroup_13_1_matchtggpattern_blackBBBBB(
				srcConsumer, pair, srcDeliver, srcGroup, asset);
		if (result1_black != null) {
			return NonConformLoadGroupImpl.pattern_NonConformLoadGroup_13_2_expressionF();
		} else {
			return NonConformLoadGroupImpl.pattern_NonConformLoadGroup_13_3_expressionF();
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
		case RulesPackage.NON_CONFORM_LOAD_GROUP___IS_APPROPRIATE_FWD__MATCH_NONCONFORMLOAD_METERASSETPHYSICALDEVICEPAIR_SERVICEDELIVERYPOINT_NONCONFORMLOADGROUP_METERASSET:
			return isAppropriate_FWD((Match) arguments.get(0), (NonConformLoad) arguments.get(1),
					(MeterAssetPhysicalDevicePair) arguments.get(2), (ServiceDeliveryPoint) arguments.get(3),
					(gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup) arguments.get(4),
					(MeterAsset) arguments.get(5));
		case RulesPackage.NON_CONFORM_LOAD_GROUP___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.NON_CONFORM_LOAD_GROUP___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.NON_CONFORM_LOAD_GROUP___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_NONCONFORMLOAD_METERASSETPHYSICALDEVICEPAIR_SERVICEDELIVERYPOINT_NONCONFORMLOADGROUP_METERASSET:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (NonConformLoad) arguments.get(1),
					(MeterAssetPhysicalDevicePair) arguments.get(2), (ServiceDeliveryPoint) arguments.get(3),
					(gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup) arguments.get(4),
					(MeterAsset) arguments.get(5));
			return null;
		case RulesPackage.NON_CONFORM_LOAD_GROUP___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_NONCONFORMLOAD_METERASSETPHYSICALDEVICEPAIR_SERVICEDELIVERYPOINT_NONCONFORMLOADGROUP_METERASSET:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (NonConformLoad) arguments.get(1),
					(MeterAssetPhysicalDevicePair) arguments.get(2), (ServiceDeliveryPoint) arguments.get(3),
					(gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup) arguments.get(4),
					(MeterAsset) arguments.get(5));
		case RulesPackage.NON_CONFORM_LOAD_GROUP___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.NON_CONFORM_LOAD_GROUP___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_NONCONFORMLOAD_ENERGYCONSUMERTOENERGYCONSUMER_METERASSETPHYSICALDEVICEPAIR_NONCONFORMLOAD_SERVICEDELIVERYPOINT_NONCONFORMLOADGROUP_METERASSET:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (NonConformLoad) arguments.get(1),
					(EnergyConsumerToEnergyConsumer) arguments.get(2), (MeterAssetPhysicalDevicePair) arguments.get(3),
					(outagePreventionJointarget.NonConformLoad) arguments.get(4),
					(ServiceDeliveryPoint) arguments.get(5),
					(gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup) arguments.get(6),
					(MeterAsset) arguments.get(7));
		case RulesPackage.NON_CONFORM_LOAD_GROUP___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.NON_CONFORM_LOAD_GROUP___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.NON_CONFORM_LOAD_GROUP___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.NON_CONFORM_LOAD_GROUP___IS_APPROPRIATE_FWD_EMOFLON_EDGE_154__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_154((EMoflonEdge) arguments.get(0));
		case RulesPackage.NON_CONFORM_LOAD_GROUP___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.NON_CONFORM_LOAD_GROUP___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.NON_CONFORM_LOAD_GROUP___CHECK_DEC_FWD__NONCONFORMLOAD_METERASSETPHYSICALDEVICEPAIR_SERVICEDELIVERYPOINT_NONCONFORMLOADGROUP_METERASSET:
			return checkDEC_FWD((NonConformLoad) arguments.get(0), (MeterAssetPhysicalDevicePair) arguments.get(1),
					(ServiceDeliveryPoint) arguments.get(2),
					(gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup) arguments.get(3),
					(MeterAsset) arguments.get(4));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_NonConformLoadGroup_0_1_initialbindings_blackBBBBBBB(NonConformLoadGroup _this,
			Match match, NonConformLoad srcConsumer, MeterAssetPhysicalDevicePair pair, ServiceDeliveryPoint srcDeliver,
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup, MeterAsset asset) {
		return new Object[] { _this, match, srcConsumer, pair, srcDeliver, srcGroup, asset };
	}

	public static final Object[] pattern_NonConformLoadGroup_0_2_SolveCSP_bindingFBBBBBBB(NonConformLoadGroup _this,
			Match match, NonConformLoad srcConsumer, MeterAssetPhysicalDevicePair pair, ServiceDeliveryPoint srcDeliver,
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup, MeterAsset asset) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, srcConsumer, pair, srcDeliver, srcGroup, asset);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, srcConsumer, pair, srcDeliver, srcGroup, asset };
		}
		return null;
	}

	public static final Object[] pattern_NonConformLoadGroup_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_NonConformLoadGroup_0_2_SolveCSP_bindingAndBlackFBBBBBBB(
			NonConformLoadGroup _this, Match match, NonConformLoad srcConsumer, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPoint srcDeliver, gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup,
			MeterAsset asset) {
		Object[] result_pattern_NonConformLoadGroup_0_2_SolveCSP_binding = pattern_NonConformLoadGroup_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, srcConsumer, pair, srcDeliver, srcGroup, asset);
		if (result_pattern_NonConformLoadGroup_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_NonConformLoadGroup_0_2_SolveCSP_binding[0];

			Object[] result_pattern_NonConformLoadGroup_0_2_SolveCSP_black = pattern_NonConformLoadGroup_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_NonConformLoadGroup_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, srcConsumer, pair, srcDeliver, srcGroup, asset };
			}
		}
		return null;
	}

	public static final boolean pattern_NonConformLoadGroup_0_3_CheckCSP_expressionFBB(NonConformLoadGroup _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_NonConformLoadGroup_0_4_collectelementstobetranslated_blackBBBBBB(Match match,
			NonConformLoad srcConsumer, MeterAssetPhysicalDevicePair pair, ServiceDeliveryPoint srcDeliver,
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup, MeterAsset asset) {
		return new Object[] { match, srcConsumer, pair, srcDeliver, srcGroup, asset };
	}

	public static final Object[] pattern_NonConformLoadGroup_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			NonConformLoad srcConsumer, gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup) {
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
		return new Object[] { match, srcConsumer, srcGroup, srcConsumer__srcGroup____LoadGroup,
				srcGroup__srcConsumer____EnergyConsumers };
	}

	public static final Object[] pattern_NonConformLoadGroup_0_5_collectcontextelements_blackBBBBBB(Match match,
			NonConformLoad srcConsumer, MeterAssetPhysicalDevicePair pair, ServiceDeliveryPoint srcDeliver,
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup, MeterAsset asset) {
		return new Object[] { match, srcConsumer, pair, srcDeliver, srcGroup, asset };
	}

	public static final Object[] pattern_NonConformLoadGroup_0_5_collectcontextelements_greenBBBBBFFFFF(Match match,
			NonConformLoad srcConsumer, MeterAssetPhysicalDevicePair pair, ServiceDeliveryPoint srcDeliver,
			MeterAsset asset) {
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__asset____EndDeviceAssets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(srcConsumer);
		match.getContextNodes().add(pair);
		match.getContextNodes().add(srcDeliver);
		match.getContextNodes().add(asset);
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
		return new Object[] { match, srcConsumer, pair, srcDeliver, asset, pair__asset____a,
				asset__srcDeliver____ServiceDeliveryPoint, srcDeliver__asset____EndDeviceAssets,
				srcDeliver__srcConsumer____EnergyConsumer, srcConsumer__srcDeliver____ServiceDeliveryPoints };
	}

	public static final void pattern_NonConformLoadGroup_0_6_registerobjectstomatch_expressionBBBBBBB(
			NonConformLoadGroup _this, Match match, NonConformLoad srcConsumer, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPoint srcDeliver, gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup,
			MeterAsset asset) {
		_this.registerObjectsToMatch_FWD(match, srcConsumer, pair, srcDeliver, srcGroup, asset);

	}

	public static final boolean pattern_NonConformLoadGroup_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_NonConformLoadGroup_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_NonConformLoadGroup_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("srcConsumer");
		EObject _localVariable_1 = isApplicableMatch.getObject("consumerToConsumer");
		EObject _localVariable_2 = isApplicableMatch.getObject("pair");
		EObject _localVariable_3 = isApplicableMatch.getObject("trgConsumer");
		EObject _localVariable_4 = isApplicableMatch.getObject("srcDeliver");
		EObject _localVariable_5 = isApplicableMatch.getObject("srcGroup");
		EObject _localVariable_6 = isApplicableMatch.getObject("asset");
		EObject tmpSrcConsumer = _localVariable_0;
		EObject tmpConsumerToConsumer = _localVariable_1;
		EObject tmpPair = _localVariable_2;
		EObject tmpTrgConsumer = _localVariable_3;
		EObject tmpSrcDeliver = _localVariable_4;
		EObject tmpSrcGroup = _localVariable_5;
		EObject tmpAsset = _localVariable_6;
		if (tmpSrcConsumer instanceof NonConformLoad) {
			NonConformLoad srcConsumer = (NonConformLoad) tmpSrcConsumer;
			if (tmpConsumerToConsumer instanceof EnergyConsumerToEnergyConsumer) {
				EnergyConsumerToEnergyConsumer consumerToConsumer = (EnergyConsumerToEnergyConsumer) tmpConsumerToConsumer;
				if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
					MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
					if (tmpTrgConsumer instanceof outagePreventionJointarget.NonConformLoad) {
						outagePreventionJointarget.NonConformLoad trgConsumer = (outagePreventionJointarget.NonConformLoad) tmpTrgConsumer;
						if (tmpSrcDeliver instanceof ServiceDeliveryPoint) {
							ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) tmpSrcDeliver;
							if (tmpSrcGroup instanceof gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup) {
								gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup = (gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup) tmpSrcGroup;
								if (tmpAsset instanceof MeterAsset) {
									MeterAsset asset = (MeterAsset) tmpAsset;
									return new Object[] { srcConsumer, consumerToConsumer, pair, trgConsumer,
											srcDeliver, srcGroup, asset, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_NonConformLoadGroup_1_1_performtransformation_blackBBBBBBBFBB(
			NonConformLoad srcConsumer, EnergyConsumerToEnergyConsumer consumerToConsumer,
			MeterAssetPhysicalDevicePair pair, outagePreventionJointarget.NonConformLoad trgConsumer,
			ServiceDeliveryPoint srcDeliver, gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup,
			MeterAsset asset, NonConformLoadGroup _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { srcConsumer, consumerToConsumer, pair, trgConsumer, srcDeliver, srcGroup, asset,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_NonConformLoadGroup_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			NonConformLoadGroup _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_NonConformLoadGroup_1_1_performtransformation_binding = pattern_NonConformLoadGroup_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_NonConformLoadGroup_1_1_performtransformation_binding != null) {
			NonConformLoad srcConsumer = (NonConformLoad) result_pattern_NonConformLoadGroup_1_1_performtransformation_binding[0];
			EnergyConsumerToEnergyConsumer consumerToConsumer = (EnergyConsumerToEnergyConsumer) result_pattern_NonConformLoadGroup_1_1_performtransformation_binding[1];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result_pattern_NonConformLoadGroup_1_1_performtransformation_binding[2];
			outagePreventionJointarget.NonConformLoad trgConsumer = (outagePreventionJointarget.NonConformLoad) result_pattern_NonConformLoadGroup_1_1_performtransformation_binding[3];
			ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result_pattern_NonConformLoadGroup_1_1_performtransformation_binding[4];
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup = (gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup) result_pattern_NonConformLoadGroup_1_1_performtransformation_binding[5];
			MeterAsset asset = (MeterAsset) result_pattern_NonConformLoadGroup_1_1_performtransformation_binding[6];

			Object[] result_pattern_NonConformLoadGroup_1_1_performtransformation_black = pattern_NonConformLoadGroup_1_1_performtransformation_blackBBBBBBBFBB(
					srcConsumer, consumerToConsumer, pair, trgConsumer, srcDeliver, srcGroup, asset, _this,
					isApplicableMatch);
			if (result_pattern_NonConformLoadGroup_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_NonConformLoadGroup_1_1_performtransformation_black[7];

				return new Object[] { srcConsumer, consumerToConsumer, pair, trgConsumer, srcDeliver, srcGroup, asset,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_NonConformLoadGroup_1_1_performtransformation_greenBBFF(
			outagePreventionJointarget.NonConformLoad trgConsumer,
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup) {
		outagePreventionJointarget.NonConformLoadGroup trgGroup = OutagePreventionJointargetFactory.eINSTANCE
				.createNonConformLoadGroup();
		NonConformLoadGroupNonToConformLoadGroup groupToGroup = Task2Factory.eINSTANCE
				.createNonConformLoadGroupNonToConformLoadGroup();
		trgConsumer.setLoadGroup(trgGroup);
		groupToGroup.setSource(srcGroup);
		groupToGroup.setTarget(trgGroup);
		return new Object[] { trgConsumer, srcGroup, trgGroup, groupToGroup };
	}

	public static final Object[] pattern_NonConformLoadGroup_1_2_collecttranslatedelements_blackBBB(
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup,
			outagePreventionJointarget.NonConformLoadGroup trgGroup,
			NonConformLoadGroupNonToConformLoadGroup groupToGroup) {
		return new Object[] { srcGroup, trgGroup, groupToGroup };
	}

	public static final Object[] pattern_NonConformLoadGroup_1_2_collecttranslatedelements_greenFBBB(
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup,
			outagePreventionJointarget.NonConformLoadGroup trgGroup,
			NonConformLoadGroupNonToConformLoadGroup groupToGroup) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(srcGroup);
		ruleresult.getCreatedElements().add(trgGroup);
		ruleresult.getCreatedLinkElements().add(groupToGroup);
		return new Object[] { ruleresult, srcGroup, trgGroup, groupToGroup };
	}

	public static final Object[] pattern_NonConformLoadGroup_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject srcConsumer, EObject consumerToConsumer, EObject pair,
			EObject trgConsumer, EObject srcDeliver, EObject srcGroup, EObject asset, EObject trgGroup,
			EObject groupToGroup) {
		if (!srcConsumer.equals(trgConsumer)) {
			if (!srcConsumer.equals(srcDeliver)) {
				if (!srcConsumer.equals(srcGroup)) {
					if (!srcConsumer.equals(trgGroup)) {
						if (!consumerToConsumer.equals(srcConsumer)) {
							if (!consumerToConsumer.equals(pair)) {
								if (!consumerToConsumer.equals(trgConsumer)) {
									if (!consumerToConsumer.equals(srcDeliver)) {
										if (!consumerToConsumer.equals(srcGroup)) {
											if (!consumerToConsumer.equals(trgGroup)) {
												if (!consumerToConsumer.equals(groupToGroup)) {
													if (!pair.equals(srcConsumer)) {
														if (!pair.equals(trgConsumer)) {
															if (!pair.equals(srcDeliver)) {
																if (!pair.equals(srcGroup)) {
																	if (!pair.equals(trgGroup)) {
																		if (!trgConsumer.equals(trgGroup)) {
																			if (!srcDeliver.equals(trgConsumer)) {
																				if (!srcDeliver.equals(srcGroup)) {
																					if (!srcDeliver.equals(trgGroup)) {
																						if (!srcGroup
																								.equals(trgConsumer)) {
																							if (!srcGroup
																									.equals(trgGroup)) {
																								if (!asset.equals(
																										srcConsumer)) {
																									if (!asset.equals(
																											consumerToConsumer)) {
																										if (!asset
																												.equals(pair)) {
																											if (!asset
																													.equals(trgConsumer)) {
																												if (!asset
																														.equals(srcDeliver)) {
																													if (!asset
																															.equals(srcGroup)) {
																														if (!asset
																																.equals(trgGroup)) {
																															if (!asset
																																	.equals(groupToGroup)) {
																																if (!groupToGroup
																																		.equals(srcConsumer)) {
																																	if (!groupToGroup
																																			.equals(pair)) {
																																		if (!groupToGroup
																																				.equals(trgConsumer)) {
																																			if (!groupToGroup
																																					.equals(srcDeliver)) {
																																				if (!groupToGroup
																																						.equals(srcGroup)) {
																																					if (!groupToGroup
																																							.equals(trgGroup)) {
																																						return new Object[] {
																																								ruleresult,
																																								srcConsumer,
																																								consumerToConsumer,
																																								pair,
																																								trgConsumer,
																																								srcDeliver,
																																								srcGroup,
																																								asset,
																																								trgGroup,
																																								groupToGroup };
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

	public static final Object[] pattern_NonConformLoadGroup_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject srcConsumer, EObject trgConsumer, EObject srcGroup, EObject trgGroup,
			EObject groupToGroup) {
		EMoflonEdge trgConsumer__trgGroup____LoadGroup = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcConsumer__srcGroup____LoadGroup = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcGroup__srcConsumer____EnergyConsumers = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge groupToGroup__srcGroup____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge groupToGroup__trgGroup____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "NonConformLoadGroup";
		String trgConsumer__trgGroup____LoadGroup_name_prime = "LoadGroup";
		String srcConsumer__srcGroup____LoadGroup_name_prime = "LoadGroup";
		String srcGroup__srcConsumer____EnergyConsumers_name_prime = "EnergyConsumers";
		String groupToGroup__srcGroup____source_name_prime = "source";
		String groupToGroup__trgGroup____target_name_prime = "target";
		trgConsumer__trgGroup____LoadGroup.setSrc(trgConsumer);
		trgConsumer__trgGroup____LoadGroup.setTrg(trgGroup);
		ruleresult.getCreatedEdges().add(trgConsumer__trgGroup____LoadGroup);
		srcConsumer__srcGroup____LoadGroup.setSrc(srcConsumer);
		srcConsumer__srcGroup____LoadGroup.setTrg(srcGroup);
		ruleresult.getTranslatedEdges().add(srcConsumer__srcGroup____LoadGroup);
		srcGroup__srcConsumer____EnergyConsumers.setSrc(srcGroup);
		srcGroup__srcConsumer____EnergyConsumers.setTrg(srcConsumer);
		ruleresult.getTranslatedEdges().add(srcGroup__srcConsumer____EnergyConsumers);
		groupToGroup__srcGroup____source.setSrc(groupToGroup);
		groupToGroup__srcGroup____source.setTrg(srcGroup);
		ruleresult.getCreatedEdges().add(groupToGroup__srcGroup____source);
		groupToGroup__trgGroup____target.setSrc(groupToGroup);
		groupToGroup__trgGroup____target.setTrg(trgGroup);
		ruleresult.getCreatedEdges().add(groupToGroup__trgGroup____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		trgConsumer__trgGroup____LoadGroup.setName(trgConsumer__trgGroup____LoadGroup_name_prime);
		srcConsumer__srcGroup____LoadGroup.setName(srcConsumer__srcGroup____LoadGroup_name_prime);
		srcGroup__srcConsumer____EnergyConsumers.setName(srcGroup__srcConsumer____EnergyConsumers_name_prime);
		groupToGroup__srcGroup____source.setName(groupToGroup__srcGroup____source_name_prime);
		groupToGroup__trgGroup____target.setName(groupToGroup__trgGroup____target_name_prime);
		return new Object[] { ruleresult, srcConsumer, trgConsumer, srcGroup, trgGroup, groupToGroup,
				trgConsumer__trgGroup____LoadGroup, srcConsumer__srcGroup____LoadGroup,
				srcGroup__srcConsumer____EnergyConsumers, groupToGroup__srcGroup____source,
				groupToGroup__trgGroup____target };
	}

	public static final void pattern_NonConformLoadGroup_1_5_registerobjects_expressionBBBBBBBBBBB(
			NonConformLoadGroup _this, PerformRuleResult ruleresult, EObject srcConsumer, EObject consumerToConsumer,
			EObject pair, EObject trgConsumer, EObject srcDeliver, EObject srcGroup, EObject asset, EObject trgGroup,
			EObject groupToGroup) {
		_this.registerObjects_FWD(ruleresult, srcConsumer, consumerToConsumer, pair, trgConsumer, srcDeliver, srcGroup,
				asset, trgGroup, groupToGroup);

	}

	public static final PerformRuleResult pattern_NonConformLoadGroup_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_NonConformLoadGroup_2_1_preparereturnvalue_bindingFB(
			NonConformLoadGroup _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_NonConformLoadGroup_2_1_preparereturnvalue_blackFBB(EClass eClass,
			NonConformLoadGroup _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_NonConformLoadGroup_2_1_preparereturnvalue_bindingAndBlackFFB(
			NonConformLoadGroup _this) {
		Object[] result_pattern_NonConformLoadGroup_2_1_preparereturnvalue_binding = pattern_NonConformLoadGroup_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_NonConformLoadGroup_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_NonConformLoadGroup_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_NonConformLoadGroup_2_1_preparereturnvalue_black = pattern_NonConformLoadGroup_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_NonConformLoadGroup_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_NonConformLoadGroup_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_NonConformLoadGroup_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "NonConformLoadGroup";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_NonConformLoadGroup_2_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("srcConsumer");
		EObject _localVariable_1 = match.getObject("pair");
		EObject _localVariable_2 = match.getObject("srcDeliver");
		EObject _localVariable_3 = match.getObject("srcGroup");
		EObject _localVariable_4 = match.getObject("asset");
		EObject tmpSrcConsumer = _localVariable_0;
		EObject tmpPair = _localVariable_1;
		EObject tmpSrcDeliver = _localVariable_2;
		EObject tmpSrcGroup = _localVariable_3;
		EObject tmpAsset = _localVariable_4;
		if (tmpSrcConsumer instanceof NonConformLoad) {
			NonConformLoad srcConsumer = (NonConformLoad) tmpSrcConsumer;
			if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
				MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
				if (tmpSrcDeliver instanceof ServiceDeliveryPoint) {
					ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) tmpSrcDeliver;
					if (tmpSrcGroup instanceof gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup) {
						gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup = (gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup) tmpSrcGroup;
						if (tmpAsset instanceof MeterAsset) {
							MeterAsset asset = (MeterAsset) tmpAsset;
							return new Object[] { srcConsumer, pair, srcDeliver, srcGroup, asset, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_NonConformLoadGroup_2_2_corematch_blackBFBFBBBB(
			NonConformLoad srcConsumer, MeterAssetPhysicalDevicePair pair, ServiceDeliveryPoint srcDeliver,
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup, MeterAsset asset, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (EnergyConsumerToEnergyConsumer consumerToConsumer : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(srcConsumer, EnergyConsumerToEnergyConsumer.class, "source")) {
			EnergyConsumer tmpTrgConsumer = consumerToConsumer.getTarget();
			if (tmpTrgConsumer instanceof outagePreventionJointarget.NonConformLoad) {
				outagePreventionJointarget.NonConformLoad trgConsumer = (outagePreventionJointarget.NonConformLoad) tmpTrgConsumer;
				_result.add(new Object[] { srcConsumer, consumerToConsumer, pair, trgConsumer, srcDeliver, srcGroup,
						asset, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_NonConformLoadGroup_2_3_findcontext_blackBBBBBBB(
			NonConformLoad srcConsumer, EnergyConsumerToEnergyConsumer consumerToConsumer,
			MeterAssetPhysicalDevicePair pair, outagePreventionJointarget.NonConformLoad trgConsumer,
			ServiceDeliveryPoint srcDeliver, gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup,
			MeterAsset asset) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (asset.equals(pair.getA())) {
			if (trgConsumer.equals(consumerToConsumer.getTarget())) {
				if (srcDeliver.equals(asset.getServiceDeliveryPoint())) {
					if (srcConsumer.equals(consumerToConsumer.getSource())) {
						if (srcGroup.equals(srcConsumer.getLoadGroup())) {
							if (srcConsumer.equals(srcDeliver.getEnergyConsumer())) {
								_result.add(new Object[] { srcConsumer, consumerToConsumer, pair, trgConsumer,
										srcDeliver, srcGroup, asset });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_NonConformLoadGroup_2_3_findcontext_greenBBBBBBBFFFFFFFFFF(
			NonConformLoad srcConsumer, EnergyConsumerToEnergyConsumer consumerToConsumer,
			MeterAssetPhysicalDevicePair pair, outagePreventionJointarget.NonConformLoad trgConsumer,
			ServiceDeliveryPoint srcDeliver, gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup,
			MeterAsset asset) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge consumerToConsumer__trgConsumer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__asset____EndDeviceAssets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge consumerToConsumer__srcConsumer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcConsumer__srcGroup____LoadGroup = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcGroup__srcConsumer____EnergyConsumers = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String pair__asset____a_name_prime = "a";
		String consumerToConsumer__trgConsumer____target_name_prime = "target";
		String asset__srcDeliver____ServiceDeliveryPoint_name_prime = "ServiceDeliveryPoint";
		String srcDeliver__asset____EndDeviceAssets_name_prime = "EndDeviceAssets";
		String consumerToConsumer__srcConsumer____source_name_prime = "source";
		String srcConsumer__srcGroup____LoadGroup_name_prime = "LoadGroup";
		String srcGroup__srcConsumer____EnergyConsumers_name_prime = "EnergyConsumers";
		String srcDeliver__srcConsumer____EnergyConsumer_name_prime = "EnergyConsumer";
		String srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime = "ServiceDeliveryPoints";
		isApplicableMatch.getAllContextElements().add(srcConsumer);
		isApplicableMatch.getAllContextElements().add(consumerToConsumer);
		isApplicableMatch.getAllContextElements().add(pair);
		isApplicableMatch.getAllContextElements().add(trgConsumer);
		isApplicableMatch.getAllContextElements().add(srcDeliver);
		isApplicableMatch.getAllContextElements().add(srcGroup);
		isApplicableMatch.getAllContextElements().add(asset);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(pair__asset____a);
		consumerToConsumer__trgConsumer____target.setSrc(consumerToConsumer);
		consumerToConsumer__trgConsumer____target.setTrg(trgConsumer);
		isApplicableMatch.getAllContextElements().add(consumerToConsumer__trgConsumer____target);
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
		srcDeliver__srcConsumer____EnergyConsumer.setSrc(srcDeliver);
		srcDeliver__srcConsumer____EnergyConsumer.setTrg(srcConsumer);
		isApplicableMatch.getAllContextElements().add(srcDeliver__srcConsumer____EnergyConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setSrc(srcConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setTrg(srcDeliver);
		isApplicableMatch.getAllContextElements().add(srcConsumer__srcDeliver____ServiceDeliveryPoints);
		pair__asset____a.setName(pair__asset____a_name_prime);
		consumerToConsumer__trgConsumer____target.setName(consumerToConsumer__trgConsumer____target_name_prime);
		asset__srcDeliver____ServiceDeliveryPoint.setName(asset__srcDeliver____ServiceDeliveryPoint_name_prime);
		srcDeliver__asset____EndDeviceAssets.setName(srcDeliver__asset____EndDeviceAssets_name_prime);
		consumerToConsumer__srcConsumer____source.setName(consumerToConsumer__srcConsumer____source_name_prime);
		srcConsumer__srcGroup____LoadGroup.setName(srcConsumer__srcGroup____LoadGroup_name_prime);
		srcGroup__srcConsumer____EnergyConsumers.setName(srcGroup__srcConsumer____EnergyConsumers_name_prime);
		srcDeliver__srcConsumer____EnergyConsumer.setName(srcDeliver__srcConsumer____EnergyConsumer_name_prime);
		srcConsumer__srcDeliver____ServiceDeliveryPoints
				.setName(srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime);
		return new Object[] { srcConsumer, consumerToConsumer, pair, trgConsumer, srcDeliver, srcGroup, asset,
				isApplicableMatch, pair__asset____a, consumerToConsumer__trgConsumer____target,
				asset__srcDeliver____ServiceDeliveryPoint, srcDeliver__asset____EndDeviceAssets,
				consumerToConsumer__srcConsumer____source, srcConsumer__srcGroup____LoadGroup,
				srcGroup__srcConsumer____EnergyConsumers, srcDeliver__srcConsumer____EnergyConsumer,
				srcConsumer__srcDeliver____ServiceDeliveryPoints };
	}

	public static final Object[] pattern_NonConformLoadGroup_2_4_solveCSP_bindingFBBBBBBBBB(NonConformLoadGroup _this,
			IsApplicableMatch isApplicableMatch, NonConformLoad srcConsumer,
			EnergyConsumerToEnergyConsumer consumerToConsumer, MeterAssetPhysicalDevicePair pair,
			outagePreventionJointarget.NonConformLoad trgConsumer, ServiceDeliveryPoint srcDeliver,
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup, MeterAsset asset) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, srcConsumer, consumerToConsumer, pair,
				trgConsumer, srcDeliver, srcGroup, asset);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, srcConsumer, consumerToConsumer, pair, trgConsumer,
					srcDeliver, srcGroup, asset };
		}
		return null;
	}

	public static final Object[] pattern_NonConformLoadGroup_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_NonConformLoadGroup_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			NonConformLoadGroup _this, IsApplicableMatch isApplicableMatch, NonConformLoad srcConsumer,
			EnergyConsumerToEnergyConsumer consumerToConsumer, MeterAssetPhysicalDevicePair pair,
			outagePreventionJointarget.NonConformLoad trgConsumer, ServiceDeliveryPoint srcDeliver,
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup, MeterAsset asset) {
		Object[] result_pattern_NonConformLoadGroup_2_4_solveCSP_binding = pattern_NonConformLoadGroup_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, srcConsumer, consumerToConsumer, pair, trgConsumer, srcDeliver, srcGroup,
				asset);
		if (result_pattern_NonConformLoadGroup_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_NonConformLoadGroup_2_4_solveCSP_binding[0];

			Object[] result_pattern_NonConformLoadGroup_2_4_solveCSP_black = pattern_NonConformLoadGroup_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_NonConformLoadGroup_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, srcConsumer, consumerToConsumer, pair, trgConsumer,
						srcDeliver, srcGroup, asset };
			}
		}
		return null;
	}

	public static final boolean pattern_NonConformLoadGroup_2_5_checkCSP_expressionFBB(NonConformLoadGroup _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_NonConformLoadGroup_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_NonConformLoadGroup_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "NonConformLoadGroup";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_NonConformLoadGroup_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_NonConformLoadGroup_10_1_preparereturnvalue_bindingFB(
			NonConformLoadGroup _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_NonConformLoadGroup_10_1_preparereturnvalue_blackFBBF(EClass __eClass,
			NonConformLoadGroup _this) {
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

	public static final Object[] pattern_NonConformLoadGroup_10_1_preparereturnvalue_bindingAndBlackFFBF(
			NonConformLoadGroup _this) {
		Object[] result_pattern_NonConformLoadGroup_10_1_preparereturnvalue_binding = pattern_NonConformLoadGroup_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_NonConformLoadGroup_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_NonConformLoadGroup_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_NonConformLoadGroup_10_1_preparereturnvalue_black = pattern_NonConformLoadGroup_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_NonConformLoadGroup_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_NonConformLoadGroup_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_NonConformLoadGroup_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_NonConformLoadGroup_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_NonConformLoadGroup_10_2_testcorematchandDECs_black_nac_0BB(
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup, NonConformLoad srcConsumer) {
		for (NonConformLoad __DEC_srcGroup_LoadGroup_537107 : srcGroup.getEnergyConsumers()) {
			if (!srcConsumer.equals(__DEC_srcGroup_LoadGroup_537107)) {
				return new Object[] { srcGroup, srcConsumer };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_NonConformLoadGroup_10_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_LoadGroup) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSrcConsumer = _edge_LoadGroup.getSrc();
		if (tmpSrcConsumer instanceof NonConformLoad) {
			NonConformLoad srcConsumer = (NonConformLoad) tmpSrcConsumer;
			EObject tmpSrcGroup = _edge_LoadGroup.getTrg();
			if (tmpSrcGroup instanceof gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup) {
				gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup = (gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup) tmpSrcGroup;
				if (srcGroup.equals(srcConsumer.getLoadGroup())) {
					if (pattern_NonConformLoadGroup_10_2_testcorematchandDECs_black_nac_0BB(srcGroup,
							srcConsumer) == null) {
						for (ServiceDeliveryPoint srcDeliver : srcConsumer.getServiceDeliveryPoints()) {
							for (EndDeviceAsset tmpAsset : srcDeliver.getEndDeviceAssets()) {
								if (tmpAsset instanceof MeterAsset) {
									MeterAsset asset = (MeterAsset) tmpAsset;
									for (MeterAssetPhysicalDevicePair pair : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(asset, MeterAssetPhysicalDevicePair.class,
													"a")) {
										_result.add(new Object[] { srcConsumer, pair, srcDeliver, srcGroup, asset,
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

	public static final Object[] pattern_NonConformLoadGroup_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_NonConformLoadGroup_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			NonConformLoadGroup _this, Match match, NonConformLoad srcConsumer, MeterAssetPhysicalDevicePair pair,
			ServiceDeliveryPoint srcDeliver, gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup,
			MeterAsset asset) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, srcConsumer, pair, srcDeliver, srcGroup, asset);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_NonConformLoadGroup_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			NonConformLoadGroup _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_NonConformLoadGroup_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_NonConformLoadGroup_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_NonConformLoadGroup_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_NonConformLoadGroup_13_1_matchtggpattern_black_nac_0BB(
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup, NonConformLoad srcConsumer) {
		for (NonConformLoad __DEC_srcGroup_LoadGroup_576402 : srcGroup.getEnergyConsumers()) {
			if (!srcConsumer.equals(__DEC_srcGroup_LoadGroup_576402)) {
				return new Object[] { srcGroup, srcConsumer };
			}
		}
		return null;
	}

	public static final Object[] pattern_NonConformLoadGroup_13_1_matchtggpattern_blackBBBBB(NonConformLoad srcConsumer,
			MeterAssetPhysicalDevicePair pair, ServiceDeliveryPoint srcDeliver,
			gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup srcGroup, MeterAsset asset) {
		if (asset.equals(pair.getA())) {
			if (srcDeliver.equals(asset.getServiceDeliveryPoint())) {
				if (srcGroup.equals(srcConsumer.getLoadGroup())) {
					if (srcConsumer.equals(srcDeliver.getEnergyConsumer())) {
						if (pattern_NonConformLoadGroup_13_1_matchtggpattern_black_nac_0BB(srcGroup,
								srcConsumer) == null) {
							return new Object[] { srcConsumer, pair, srcDeliver, srcGroup, asset };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_NonConformLoadGroup_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_NonConformLoadGroup_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //NonConformLoadGroupImpl
