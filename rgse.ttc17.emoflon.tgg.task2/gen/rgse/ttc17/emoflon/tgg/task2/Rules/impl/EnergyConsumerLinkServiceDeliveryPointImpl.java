/**
 */
package rgse.ttc17.emoflon.tgg.task2.Rules.impl;

import gluemodel.CIM.IEC61968.Metering.EndDeviceAsset;
import gluemodel.CIM.IEC61968.Metering.MeterAsset;
import gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint;

import gluemodel.CIM.IEC61970.Wires.EnergyConsumer;

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

import rgse.ttc17.emoflon.tgg.task2.EnergyConsumerToEnergyConsumer;

import rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumerLinkServiceDeliveryPoint;
import rgse.ttc17.emoflon.tgg.task2.Rules.RulesPackage;

import rgse.ttc17.emoflon.tgg.task2.ServiceDeliveryPointToServiceDeliveryPoint;
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
 * An implementation of the model object '<em><b>Energy Consumer Link Service Delivery Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EnergyConsumerLinkServiceDeliveryPointImpl extends AbstractRuleImpl
		implements EnergyConsumerLinkServiceDeliveryPoint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnergyConsumerLinkServiceDeliveryPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getEnergyConsumerLinkServiceDeliveryPoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ServiceDeliveryPoint srcDeliver, MeterAsset asset,
			MeterAssetPhysicalDevicePair pair, EnergyConsumer srcConsumer) {
		// initial bindings
		Object[] result1_black = EnergyConsumerLinkServiceDeliveryPointImpl
				.pattern_EnergyConsumerLinkServiceDeliveryPoint_0_1_initialbindings_blackBBBBBB(this, match, srcDeliver,
						asset, pair, srcConsumer);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[srcDeliver] = " + srcDeliver + ", "
					+ "[asset] = " + asset + ", " + "[pair] = " + pair + ", " + "[srcConsumer] = " + srcConsumer + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = EnergyConsumerLinkServiceDeliveryPointImpl
				.pattern_EnergyConsumerLinkServiceDeliveryPoint_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match,
						srcDeliver, asset, pair, srcConsumer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[srcDeliver] = " + srcDeliver + ", " + "[asset] = "
					+ asset + ", " + "[pair] = " + pair + ", " + "[srcConsumer] = " + srcConsumer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (EnergyConsumerLinkServiceDeliveryPointImpl
				.pattern_EnergyConsumerLinkServiceDeliveryPoint_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = EnergyConsumerLinkServiceDeliveryPointImpl
					.pattern_EnergyConsumerLinkServiceDeliveryPoint_0_4_collectelementstobetranslated_blackBBBBB(match,
							srcDeliver, asset, pair, srcConsumer);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed." + " Variables: "
								+ "[match] = " + match + ", " + "[srcDeliver] = " + srcDeliver + ", " + "[asset] = "
								+ asset + ", " + "[pair] = " + pair + ", " + "[srcConsumer] = " + srcConsumer + ".");
			}
			EnergyConsumerLinkServiceDeliveryPointImpl
					.pattern_EnergyConsumerLinkServiceDeliveryPoint_0_4_collectelementstobetranslated_greenBBBFF(match,
							srcDeliver, srcConsumer);
			// EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = (EMoflonEdge) result4_green[3];
			// EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = EnergyConsumerLinkServiceDeliveryPointImpl
					.pattern_EnergyConsumerLinkServiceDeliveryPoint_0_5_collectcontextelements_blackBBBBB(match,
							srcDeliver, asset, pair, srcConsumer);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[srcDeliver] = " + srcDeliver + ", " + "[asset] = " + asset + ", "
								+ "[pair] = " + pair + ", " + "[srcConsumer] = " + srcConsumer + ".");
			}
			EnergyConsumerLinkServiceDeliveryPointImpl
					.pattern_EnergyConsumerLinkServiceDeliveryPoint_0_5_collectcontextelements_greenBBBBBFFF(match,
							srcDeliver, asset, pair, srcConsumer);
			// EMoflonEdge pair__asset____a = (EMoflonEdge) result5_green[5];
			// EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = (EMoflonEdge) result5_green[6];
			// EMoflonEdge srcDeliver__asset____EndDeviceAssets = (EMoflonEdge) result5_green[7];

			// register objects to match
			EnergyConsumerLinkServiceDeliveryPointImpl
					.pattern_EnergyConsumerLinkServiceDeliveryPoint_0_6_registerobjectstomatch_expressionBBBBBB(this,
							match, srcDeliver, asset, pair, srcConsumer);
			return EnergyConsumerLinkServiceDeliveryPointImpl
					.pattern_EnergyConsumerLinkServiceDeliveryPoint_0_7_expressionF();
		} else {
			return EnergyConsumerLinkServiceDeliveryPointImpl
					.pattern_EnergyConsumerLinkServiceDeliveryPoint_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = EnergyConsumerLinkServiceDeliveryPointImpl
				.pattern_EnergyConsumerLinkServiceDeliveryPoint_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		EnergyConsumerToEnergyConsumer consumerToConsumer = (EnergyConsumerToEnergyConsumer) result1_bindingAndBlack[0];
		ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result1_bindingAndBlack[1];
		MeterAsset asset = (MeterAsset) result1_bindingAndBlack[2];
		outagePreventionJointarget.ServiceDeliveryPoint trgDeliver = (outagePreventionJointarget.ServiceDeliveryPoint) result1_bindingAndBlack[3];
		outagePreventionJointarget.EnergyConsumer trgConsumer = (outagePreventionJointarget.EnergyConsumer) result1_bindingAndBlack[4];
		ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver = (ServiceDeliveryPointToServiceDeliveryPoint) result1_bindingAndBlack[5];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result1_bindingAndBlack[6];
		EnergyConsumer srcConsumer = (EnergyConsumer) result1_bindingAndBlack[7];
		// CSP csp = (CSP) result1_bindingAndBlack[8];
		EnergyConsumerLinkServiceDeliveryPointImpl
				.pattern_EnergyConsumerLinkServiceDeliveryPoint_1_1_performtransformation_greenBB(trgDeliver,
						trgConsumer);

		// collect translated elements
		Object[] result2_green = EnergyConsumerLinkServiceDeliveryPointImpl
				.pattern_EnergyConsumerLinkServiceDeliveryPoint_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = EnergyConsumerLinkServiceDeliveryPointImpl
				.pattern_EnergyConsumerLinkServiceDeliveryPoint_1_3_bookkeepingforedges_blackBBBBBBBBB(ruleresult,
						consumerToConsumer, srcDeliver, asset, trgDeliver, trgConsumer, deliverToDeliver, pair,
						srcConsumer);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[consumerToConsumer] = " + consumerToConsumer + ", "
					+ "[srcDeliver] = " + srcDeliver + ", " + "[asset] = " + asset + ", " + "[trgDeliver] = "
					+ trgDeliver + ", " + "[trgConsumer] = " + trgConsumer + ", " + "[deliverToDeliver] = "
					+ deliverToDeliver + ", " + "[pair] = " + pair + ", " + "[srcConsumer] = " + srcConsumer + ".");
		}
		EnergyConsumerLinkServiceDeliveryPointImpl
				.pattern_EnergyConsumerLinkServiceDeliveryPoint_1_3_bookkeepingforedges_greenBBBBBFFF(ruleresult,
						srcDeliver, trgDeliver, trgConsumer, srcConsumer);
		// EMoflonEdge trgDeliver__trgConsumer____EnergyConsumer = (EMoflonEdge) result3_green[5];
		// EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = (EMoflonEdge) result3_green[6];
		// EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = (EMoflonEdge) result3_green[7];

		// perform postprocessing story node is empty
		// register objects
		EnergyConsumerLinkServiceDeliveryPointImpl
				.pattern_EnergyConsumerLinkServiceDeliveryPoint_1_5_registerobjects_expressionBBBBBBBBBB(this,
						ruleresult, consumerToConsumer, srcDeliver, asset, trgDeliver, trgConsumer, deliverToDeliver,
						pair, srcConsumer);
		return EnergyConsumerLinkServiceDeliveryPointImpl
				.pattern_EnergyConsumerLinkServiceDeliveryPoint_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = EnergyConsumerLinkServiceDeliveryPointImpl
				.pattern_EnergyConsumerLinkServiceDeliveryPoint_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EnergyConsumerLinkServiceDeliveryPointImpl
				.pattern_EnergyConsumerLinkServiceDeliveryPoint_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = EnergyConsumerLinkServiceDeliveryPointImpl
				.pattern_EnergyConsumerLinkServiceDeliveryPoint_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result2_binding[0];
		MeterAsset asset = (MeterAsset) result2_binding[1];
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_binding[2];
		EnergyConsumer srcConsumer = (EnergyConsumer) result2_binding[3];
		for (Object[] result2_black : EnergyConsumerLinkServiceDeliveryPointImpl
				.pattern_EnergyConsumerLinkServiceDeliveryPoint_2_2_corematch_blackFBBFFFBBB(srcDeliver, asset, pair,
						srcConsumer, match)) {
			EnergyConsumerToEnergyConsumer consumerToConsumer = (EnergyConsumerToEnergyConsumer) result2_black[0];
			outagePreventionJointarget.ServiceDeliveryPoint trgDeliver = (outagePreventionJointarget.ServiceDeliveryPoint) result2_black[3];
			outagePreventionJointarget.EnergyConsumer trgConsumer = (outagePreventionJointarget.EnergyConsumer) result2_black[4];
			ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver = (ServiceDeliveryPointToServiceDeliveryPoint) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : EnergyConsumerLinkServiceDeliveryPointImpl
					.pattern_EnergyConsumerLinkServiceDeliveryPoint_2_3_findcontext_blackBBBBBBBB(consumerToConsumer,
							srcDeliver, asset, trgDeliver, trgConsumer, deliverToDeliver, pair, srcConsumer)) {
				Object[] result3_green = EnergyConsumerLinkServiceDeliveryPointImpl
						.pattern_EnergyConsumerLinkServiceDeliveryPoint_2_3_findcontext_greenBBBBBBBBFFFFFFFFFF(
								consumerToConsumer, srcDeliver, asset, trgDeliver, trgConsumer, deliverToDeliver, pair,
								srcConsumer);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				// EMoflonEdge consumerToConsumer__trgConsumer____target = (EMoflonEdge) result3_green[9];
				// EMoflonEdge pair__asset____a = (EMoflonEdge) result3_green[10];
				// EMoflonEdge deliverToDeliver__trgDeliver____target = (EMoflonEdge) result3_green[11];
				// EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = (EMoflonEdge) result3_green[12];
				// EMoflonEdge srcDeliver__asset____EndDeviceAssets = (EMoflonEdge) result3_green[13];
				// EMoflonEdge deliverToDeliver__srcDeliver____source = (EMoflonEdge) result3_green[14];
				// EMoflonEdge consumerToConsumer__srcConsumer____source = (EMoflonEdge) result3_green[15];
				// EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = (EMoflonEdge) result3_green[16];
				// EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = (EMoflonEdge) result3_green[17];

				// solve CSP
				Object[] result4_bindingAndBlack = EnergyConsumerLinkServiceDeliveryPointImpl
						.pattern_EnergyConsumerLinkServiceDeliveryPoint_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this,
								isApplicableMatch, consumerToConsumer, srcDeliver, asset, trgDeliver, trgConsumer,
								deliverToDeliver, pair, srcConsumer);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[consumerToConsumer] = " + consumerToConsumer + ", " + "[srcDeliver] = " + srcDeliver
							+ ", " + "[asset] = " + asset + ", " + "[trgDeliver] = " + trgDeliver + ", "
							+ "[trgConsumer] = " + trgConsumer + ", " + "[deliverToDeliver] = " + deliverToDeliver
							+ ", " + "[pair] = " + pair + ", " + "[srcConsumer] = " + srcConsumer + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (EnergyConsumerLinkServiceDeliveryPointImpl
						.pattern_EnergyConsumerLinkServiceDeliveryPoint_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = EnergyConsumerLinkServiceDeliveryPointImpl
							.pattern_EnergyConsumerLinkServiceDeliveryPoint_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					EnergyConsumerLinkServiceDeliveryPointImpl
							.pattern_EnergyConsumerLinkServiceDeliveryPoint_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return EnergyConsumerLinkServiceDeliveryPointImpl
				.pattern_EnergyConsumerLinkServiceDeliveryPoint_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ServiceDeliveryPoint srcDeliver, MeterAsset asset,
			MeterAssetPhysicalDevicePair pair, EnergyConsumer srcConsumer) {
		match.registerObject("srcDeliver", srcDeliver);
		match.registerObject("asset", asset);
		match.registerObject("pair", pair);
		match.registerObject("srcConsumer", srcConsumer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ServiceDeliveryPoint srcDeliver, MeterAsset asset,
			MeterAssetPhysicalDevicePair pair, EnergyConsumer srcConsumer) {// Create CSP
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
			EnergyConsumerToEnergyConsumer consumerToConsumer, ServiceDeliveryPoint srcDeliver, MeterAsset asset,
			outagePreventionJointarget.ServiceDeliveryPoint trgDeliver,
			outagePreventionJointarget.EnergyConsumer trgConsumer,
			ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver, MeterAssetPhysicalDevicePair pair,
			EnergyConsumer srcConsumer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("consumerToConsumer", consumerToConsumer);
		isApplicableMatch.registerObject("srcDeliver", srcDeliver);
		isApplicableMatch.registerObject("asset", asset);
		isApplicableMatch.registerObject("trgDeliver", trgDeliver);
		isApplicableMatch.registerObject("trgConsumer", trgConsumer);
		isApplicableMatch.registerObject("deliverToDeliver", deliverToDeliver);
		isApplicableMatch.registerObject("pair", pair);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject consumerToConsumer, EObject srcDeliver,
			EObject asset, EObject trgDeliver, EObject trgConsumer, EObject deliverToDeliver, EObject pair,
			EObject srcConsumer) {
		ruleresult.registerObject("consumerToConsumer", consumerToConsumer);
		ruleresult.registerObject("srcDeliver", srcDeliver);
		ruleresult.registerObject("asset", asset);
		ruleresult.registerObject("trgDeliver", trgDeliver);
		ruleresult.registerObject("trgConsumer", trgConsumer);
		ruleresult.registerObject("deliverToDeliver", deliverToDeliver);
		ruleresult.registerObject("pair", pair);
		ruleresult.registerObject("srcConsumer", srcConsumer);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_159(EMoflonEdge _edge_EnergyConsumer) {
		// prepare return value
		Object[] result1_bindingAndBlack = EnergyConsumerLinkServiceDeliveryPointImpl
				.pattern_EnergyConsumerLinkServiceDeliveryPoint_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = EnergyConsumerLinkServiceDeliveryPointImpl
				.pattern_EnergyConsumerLinkServiceDeliveryPoint_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EnergyConsumerLinkServiceDeliveryPointImpl
				.pattern_EnergyConsumerLinkServiceDeliveryPoint_10_2_testcorematchandDECs_blackFFFFB(
						_edge_EnergyConsumer)) {
			ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result2_black[0];
			MeterAsset asset = (MeterAsset) result2_black[1];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_black[2];
			EnergyConsumer srcConsumer = (EnergyConsumer) result2_black[3];
			Object[] result2_green = EnergyConsumerLinkServiceDeliveryPointImpl
					.pattern_EnergyConsumerLinkServiceDeliveryPoint_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EnergyConsumerLinkServiceDeliveryPointImpl
					.pattern_EnergyConsumerLinkServiceDeliveryPoint_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, srcDeliver, asset, pair, srcConsumer)) {
				// Ensure that the correct types of elements are matched
				if (EnergyConsumerLinkServiceDeliveryPointImpl
						.pattern_EnergyConsumerLinkServiceDeliveryPoint_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = EnergyConsumerLinkServiceDeliveryPointImpl
							.pattern_EnergyConsumerLinkServiceDeliveryPoint_10_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					EnergyConsumerLinkServiceDeliveryPointImpl
							.pattern_EnergyConsumerLinkServiceDeliveryPoint_10_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return EnergyConsumerLinkServiceDeliveryPointImpl
				.pattern_EnergyConsumerLinkServiceDeliveryPoint_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("EnergyConsumerLinkServiceDeliveryPoint");
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
			EnergyConsumer srcConsumer) {// match tgg pattern
		Object[] result1_black = EnergyConsumerLinkServiceDeliveryPointImpl
				.pattern_EnergyConsumerLinkServiceDeliveryPoint_13_1_matchtggpattern_blackBBBB(srcDeliver, asset, pair,
						srcConsumer);
		if (result1_black != null) {
			return EnergyConsumerLinkServiceDeliveryPointImpl
					.pattern_EnergyConsumerLinkServiceDeliveryPoint_13_2_expressionF();
		} else {
			return EnergyConsumerLinkServiceDeliveryPointImpl
					.pattern_EnergyConsumerLinkServiceDeliveryPoint_13_3_expressionF();
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
		case RulesPackage.ENERGY_CONSUMER_LINK_SERVICE_DELIVERY_POINT___IS_APPROPRIATE_FWD__MATCH_SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR_ENERGYCONSUMER:
			return isAppropriate_FWD((Match) arguments.get(0), (ServiceDeliveryPoint) arguments.get(1),
					(MeterAsset) arguments.get(2), (MeterAssetPhysicalDevicePair) arguments.get(3),
					(EnergyConsumer) arguments.get(4));
		case RulesPackage.ENERGY_CONSUMER_LINK_SERVICE_DELIVERY_POINT___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ENERGY_CONSUMER_LINK_SERVICE_DELIVERY_POINT___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ENERGY_CONSUMER_LINK_SERVICE_DELIVERY_POINT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR_ENERGYCONSUMER:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ServiceDeliveryPoint) arguments.get(1),
					(MeterAsset) arguments.get(2), (MeterAssetPhysicalDevicePair) arguments.get(3),
					(EnergyConsumer) arguments.get(4));
			return null;
		case RulesPackage.ENERGY_CONSUMER_LINK_SERVICE_DELIVERY_POINT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR_ENERGYCONSUMER:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ServiceDeliveryPoint) arguments.get(1),
					(MeterAsset) arguments.get(2), (MeterAssetPhysicalDevicePair) arguments.get(3),
					(EnergyConsumer) arguments.get(4));
		case RulesPackage.ENERGY_CONSUMER_LINK_SERVICE_DELIVERY_POINT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ENERGY_CONSUMER_LINK_SERVICE_DELIVERY_POINT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ENERGYCONSUMERTOENERGYCONSUMER_SERVICEDELIVERYPOINT_METERASSET_SERVICEDELIVERYPOINT_ENERGYCONSUMER_SERVICEDELIVERYPOINTTOSERVICEDELIVERYPOINT_METERASSETPHYSICALDEVICEPAIR_ENERGYCONSUMER:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(EnergyConsumerToEnergyConsumer) arguments.get(1), (ServiceDeliveryPoint) arguments.get(2),
					(MeterAsset) arguments.get(3), (outagePreventionJointarget.ServiceDeliveryPoint) arguments.get(4),
					(outagePreventionJointarget.EnergyConsumer) arguments.get(5),
					(ServiceDeliveryPointToServiceDeliveryPoint) arguments.get(6),
					(MeterAssetPhysicalDevicePair) arguments.get(7), (EnergyConsumer) arguments.get(8));
		case RulesPackage.ENERGY_CONSUMER_LINK_SERVICE_DELIVERY_POINT___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ENERGY_CONSUMER_LINK_SERVICE_DELIVERY_POINT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.ENERGY_CONSUMER_LINK_SERVICE_DELIVERY_POINT___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ENERGY_CONSUMER_LINK_SERVICE_DELIVERY_POINT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_159__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_159((EMoflonEdge) arguments.get(0));
		case RulesPackage.ENERGY_CONSUMER_LINK_SERVICE_DELIVERY_POINT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ENERGY_CONSUMER_LINK_SERVICE_DELIVERY_POINT___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ENERGY_CONSUMER_LINK_SERVICE_DELIVERY_POINT___CHECK_DEC_FWD__SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR_ENERGYCONSUMER:
			return checkDEC_FWD((ServiceDeliveryPoint) arguments.get(0), (MeterAsset) arguments.get(1),
					(MeterAssetPhysicalDevicePair) arguments.get(2), (EnergyConsumer) arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_EnergyConsumerLinkServiceDeliveryPoint_0_1_initialbindings_blackBBBBBB(
			EnergyConsumerLinkServiceDeliveryPoint _this, Match match, ServiceDeliveryPoint srcDeliver,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair, EnergyConsumer srcConsumer) {
		return new Object[] { _this, match, srcDeliver, asset, pair, srcConsumer };
	}

	public static final Object[] pattern_EnergyConsumerLinkServiceDeliveryPoint_0_2_SolveCSP_bindingFBBBBBB(
			EnergyConsumerLinkServiceDeliveryPoint _this, Match match, ServiceDeliveryPoint srcDeliver,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair, EnergyConsumer srcConsumer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, srcDeliver, asset, pair, srcConsumer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, srcDeliver, asset, pair, srcConsumer };
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumerLinkServiceDeliveryPoint_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnergyConsumerLinkServiceDeliveryPoint_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			EnergyConsumerLinkServiceDeliveryPoint _this, Match match, ServiceDeliveryPoint srcDeliver,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair, EnergyConsumer srcConsumer) {
		Object[] result_pattern_EnergyConsumerLinkServiceDeliveryPoint_0_2_SolveCSP_binding = pattern_EnergyConsumerLinkServiceDeliveryPoint_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, srcDeliver, asset, pair, srcConsumer);
		if (result_pattern_EnergyConsumerLinkServiceDeliveryPoint_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_EnergyConsumerLinkServiceDeliveryPoint_0_2_SolveCSP_binding[0];

			Object[] result_pattern_EnergyConsumerLinkServiceDeliveryPoint_0_2_SolveCSP_black = pattern_EnergyConsumerLinkServiceDeliveryPoint_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_EnergyConsumerLinkServiceDeliveryPoint_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, srcDeliver, asset, pair, srcConsumer };
			}
		}
		return null;
	}

	public static final boolean pattern_EnergyConsumerLinkServiceDeliveryPoint_0_3_CheckCSP_expressionFBB(
			EnergyConsumerLinkServiceDeliveryPoint _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EnergyConsumerLinkServiceDeliveryPoint_0_4_collectelementstobetranslated_blackBBBBB(
			Match match, ServiceDeliveryPoint srcDeliver, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			EnergyConsumer srcConsumer) {
		return new Object[] { match, srcDeliver, asset, pair, srcConsumer };
	}

	public static final Object[] pattern_EnergyConsumerLinkServiceDeliveryPoint_0_4_collectelementstobetranslated_greenBBBFF(
			Match match, ServiceDeliveryPoint srcDeliver, EnergyConsumer srcConsumer) {
		EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String srcDeliver__srcConsumer____EnergyConsumer_name_prime = "EnergyConsumer";
		String srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime = "ServiceDeliveryPoints";
		srcDeliver__srcConsumer____EnergyConsumer.setSrc(srcDeliver);
		srcDeliver__srcConsumer____EnergyConsumer.setTrg(srcConsumer);
		match.getToBeTranslatedEdges().add(srcDeliver__srcConsumer____EnergyConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setSrc(srcConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setTrg(srcDeliver);
		match.getToBeTranslatedEdges().add(srcConsumer__srcDeliver____ServiceDeliveryPoints);
		srcDeliver__srcConsumer____EnergyConsumer.setName(srcDeliver__srcConsumer____EnergyConsumer_name_prime);
		srcConsumer__srcDeliver____ServiceDeliveryPoints
				.setName(srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime);
		return new Object[] { match, srcDeliver, srcConsumer, srcDeliver__srcConsumer____EnergyConsumer,
				srcConsumer__srcDeliver____ServiceDeliveryPoints };
	}

	public static final Object[] pattern_EnergyConsumerLinkServiceDeliveryPoint_0_5_collectcontextelements_blackBBBBB(
			Match match, ServiceDeliveryPoint srcDeliver, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			EnergyConsumer srcConsumer) {
		return new Object[] { match, srcDeliver, asset, pair, srcConsumer };
	}

	public static final Object[] pattern_EnergyConsumerLinkServiceDeliveryPoint_0_5_collectcontextelements_greenBBBBBFFF(
			Match match, ServiceDeliveryPoint srcDeliver, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			EnergyConsumer srcConsumer) {
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__asset____EndDeviceAssets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(srcDeliver);
		match.getContextNodes().add(asset);
		match.getContextNodes().add(pair);
		match.getContextNodes().add(srcConsumer);
		String pair__asset____a_name_prime = "a";
		String asset__srcDeliver____ServiceDeliveryPoint_name_prime = "ServiceDeliveryPoint";
		String srcDeliver__asset____EndDeviceAssets_name_prime = "EndDeviceAssets";
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		match.getContextEdges().add(pair__asset____a);
		asset__srcDeliver____ServiceDeliveryPoint.setSrc(asset);
		asset__srcDeliver____ServiceDeliveryPoint.setTrg(srcDeliver);
		match.getContextEdges().add(asset__srcDeliver____ServiceDeliveryPoint);
		srcDeliver__asset____EndDeviceAssets.setSrc(srcDeliver);
		srcDeliver__asset____EndDeviceAssets.setTrg(asset);
		match.getContextEdges().add(srcDeliver__asset____EndDeviceAssets);
		pair__asset____a.setName(pair__asset____a_name_prime);
		asset__srcDeliver____ServiceDeliveryPoint.setName(asset__srcDeliver____ServiceDeliveryPoint_name_prime);
		srcDeliver__asset____EndDeviceAssets.setName(srcDeliver__asset____EndDeviceAssets_name_prime);
		return new Object[] { match, srcDeliver, asset, pair, srcConsumer, pair__asset____a,
				asset__srcDeliver____ServiceDeliveryPoint, srcDeliver__asset____EndDeviceAssets };
	}

	public static final void pattern_EnergyConsumerLinkServiceDeliveryPoint_0_6_registerobjectstomatch_expressionBBBBBB(
			EnergyConsumerLinkServiceDeliveryPoint _this, Match match, ServiceDeliveryPoint srcDeliver,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair, EnergyConsumer srcConsumer) {
		_this.registerObjectsToMatch_FWD(match, srcDeliver, asset, pair, srcConsumer);

	}

	public static final boolean pattern_EnergyConsumerLinkServiceDeliveryPoint_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EnergyConsumerLinkServiceDeliveryPoint_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_EnergyConsumerLinkServiceDeliveryPoint_1_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("consumerToConsumer");
		EObject _localVariable_1 = isApplicableMatch.getObject("srcDeliver");
		EObject _localVariable_2 = isApplicableMatch.getObject("asset");
		EObject _localVariable_3 = isApplicableMatch.getObject("trgDeliver");
		EObject _localVariable_4 = isApplicableMatch.getObject("trgConsumer");
		EObject _localVariable_5 = isApplicableMatch.getObject("deliverToDeliver");
		EObject _localVariable_6 = isApplicableMatch.getObject("pair");
		EObject _localVariable_7 = isApplicableMatch.getObject("srcConsumer");
		EObject tmpConsumerToConsumer = _localVariable_0;
		EObject tmpSrcDeliver = _localVariable_1;
		EObject tmpAsset = _localVariable_2;
		EObject tmpTrgDeliver = _localVariable_3;
		EObject tmpTrgConsumer = _localVariable_4;
		EObject tmpDeliverToDeliver = _localVariable_5;
		EObject tmpPair = _localVariable_6;
		EObject tmpSrcConsumer = _localVariable_7;
		if (tmpConsumerToConsumer instanceof EnergyConsumerToEnergyConsumer) {
			EnergyConsumerToEnergyConsumer consumerToConsumer = (EnergyConsumerToEnergyConsumer) tmpConsumerToConsumer;
			if (tmpSrcDeliver instanceof ServiceDeliveryPoint) {
				ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) tmpSrcDeliver;
				if (tmpAsset instanceof MeterAsset) {
					MeterAsset asset = (MeterAsset) tmpAsset;
					if (tmpTrgDeliver instanceof outagePreventionJointarget.ServiceDeliveryPoint) {
						outagePreventionJointarget.ServiceDeliveryPoint trgDeliver = (outagePreventionJointarget.ServiceDeliveryPoint) tmpTrgDeliver;
						if (tmpTrgConsumer instanceof outagePreventionJointarget.EnergyConsumer) {
							outagePreventionJointarget.EnergyConsumer trgConsumer = (outagePreventionJointarget.EnergyConsumer) tmpTrgConsumer;
							if (tmpDeliverToDeliver instanceof ServiceDeliveryPointToServiceDeliveryPoint) {
								ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver = (ServiceDeliveryPointToServiceDeliveryPoint) tmpDeliverToDeliver;
								if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
									MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
									if (tmpSrcConsumer instanceof EnergyConsumer) {
										EnergyConsumer srcConsumer = (EnergyConsumer) tmpSrcConsumer;
										return new Object[] { consumerToConsumer, srcDeliver, asset, trgDeliver,
												trgConsumer, deliverToDeliver, pair, srcConsumer, isApplicableMatch };
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

	public static final Object[] pattern_EnergyConsumerLinkServiceDeliveryPoint_1_1_performtransformation_blackBBBBBBBBFBB(
			EnergyConsumerToEnergyConsumer consumerToConsumer, ServiceDeliveryPoint srcDeliver, MeterAsset asset,
			outagePreventionJointarget.ServiceDeliveryPoint trgDeliver,
			outagePreventionJointarget.EnergyConsumer trgConsumer,
			ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver, MeterAssetPhysicalDevicePair pair,
			EnergyConsumer srcConsumer, EnergyConsumerLinkServiceDeliveryPoint _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { consumerToConsumer, srcDeliver, asset, trgDeliver, trgConsumer, deliverToDeliver,
						pair, srcConsumer, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumerLinkServiceDeliveryPoint_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			EnergyConsumerLinkServiceDeliveryPoint _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_EnergyConsumerLinkServiceDeliveryPoint_1_1_performtransformation_binding = pattern_EnergyConsumerLinkServiceDeliveryPoint_1_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_EnergyConsumerLinkServiceDeliveryPoint_1_1_performtransformation_binding != null) {
			EnergyConsumerToEnergyConsumer consumerToConsumer = (EnergyConsumerToEnergyConsumer) result_pattern_EnergyConsumerLinkServiceDeliveryPoint_1_1_performtransformation_binding[0];
			ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) result_pattern_EnergyConsumerLinkServiceDeliveryPoint_1_1_performtransformation_binding[1];
			MeterAsset asset = (MeterAsset) result_pattern_EnergyConsumerLinkServiceDeliveryPoint_1_1_performtransformation_binding[2];
			outagePreventionJointarget.ServiceDeliveryPoint trgDeliver = (outagePreventionJointarget.ServiceDeliveryPoint) result_pattern_EnergyConsumerLinkServiceDeliveryPoint_1_1_performtransformation_binding[3];
			outagePreventionJointarget.EnergyConsumer trgConsumer = (outagePreventionJointarget.EnergyConsumer) result_pattern_EnergyConsumerLinkServiceDeliveryPoint_1_1_performtransformation_binding[4];
			ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver = (ServiceDeliveryPointToServiceDeliveryPoint) result_pattern_EnergyConsumerLinkServiceDeliveryPoint_1_1_performtransformation_binding[5];
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result_pattern_EnergyConsumerLinkServiceDeliveryPoint_1_1_performtransformation_binding[6];
			EnergyConsumer srcConsumer = (EnergyConsumer) result_pattern_EnergyConsumerLinkServiceDeliveryPoint_1_1_performtransformation_binding[7];

			Object[] result_pattern_EnergyConsumerLinkServiceDeliveryPoint_1_1_performtransformation_black = pattern_EnergyConsumerLinkServiceDeliveryPoint_1_1_performtransformation_blackBBBBBBBBFBB(
					consumerToConsumer, srcDeliver, asset, trgDeliver, trgConsumer, deliverToDeliver, pair, srcConsumer,
					_this, isApplicableMatch);
			if (result_pattern_EnergyConsumerLinkServiceDeliveryPoint_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_EnergyConsumerLinkServiceDeliveryPoint_1_1_performtransformation_black[8];

				return new Object[] { consumerToConsumer, srcDeliver, asset, trgDeliver, trgConsumer, deliverToDeliver,
						pair, srcConsumer, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumerLinkServiceDeliveryPoint_1_1_performtransformation_greenBB(
			outagePreventionJointarget.ServiceDeliveryPoint trgDeliver,
			outagePreventionJointarget.EnergyConsumer trgConsumer) {
		trgDeliver.setEnergyConsumer(trgConsumer);
		return new Object[] { trgDeliver, trgConsumer };
	}

	public static final Object[] pattern_EnergyConsumerLinkServiceDeliveryPoint_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_EnergyConsumerLinkServiceDeliveryPoint_1_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject consumerToConsumer, EObject srcDeliver, EObject asset,
			EObject trgDeliver, EObject trgConsumer, EObject deliverToDeliver, EObject pair, EObject srcConsumer) {
		if (!consumerToConsumer.equals(srcDeliver)) {
			if (!consumerToConsumer.equals(trgDeliver)) {
				if (!consumerToConsumer.equals(trgConsumer)) {
					if (!consumerToConsumer.equals(deliverToDeliver)) {
						if (!consumerToConsumer.equals(pair)) {
							if (!consumerToConsumer.equals(srcConsumer)) {
								if (!srcDeliver.equals(trgDeliver)) {
									if (!srcDeliver.equals(trgConsumer)) {
										if (!asset.equals(consumerToConsumer)) {
											if (!asset.equals(srcDeliver)) {
												if (!asset.equals(trgDeliver)) {
													if (!asset.equals(trgConsumer)) {
														if (!asset.equals(deliverToDeliver)) {
															if (!asset.equals(pair)) {
																if (!asset.equals(srcConsumer)) {
																	if (!trgConsumer.equals(trgDeliver)) {
																		if (!deliverToDeliver.equals(srcDeliver)) {
																			if (!deliverToDeliver.equals(trgDeliver)) {
																				if (!deliverToDeliver
																						.equals(trgConsumer)) {
																					if (!deliverToDeliver
																							.equals(pair)) {
																						if (!deliverToDeliver
																								.equals(srcConsumer)) {
																							if (!pair.equals(
																									srcDeliver)) {
																								if (!pair.equals(
																										trgDeliver)) {
																									if (!pair.equals(
																											trgConsumer)) {
																										if (!pair
																												.equals(srcConsumer)) {
																											if (!srcConsumer
																													.equals(srcDeliver)) {
																												if (!srcConsumer
																														.equals(trgDeliver)) {
																													if (!srcConsumer
																															.equals(trgConsumer)) {
																														return new Object[] {
																																ruleresult,
																																consumerToConsumer,
																																srcDeliver,
																																asset,
																																trgDeliver,
																																trgConsumer,
																																deliverToDeliver,
																																pair,
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
		return null;
	}

	public static final Object[] pattern_EnergyConsumerLinkServiceDeliveryPoint_1_3_bookkeepingforedges_greenBBBBBFFF(
			PerformRuleResult ruleresult, EObject srcDeliver, EObject trgDeliver, EObject trgConsumer,
			EObject srcConsumer) {
		EMoflonEdge trgDeliver__trgConsumer____EnergyConsumer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "EnergyConsumerLinkServiceDeliveryPoint";
		String trgDeliver__trgConsumer____EnergyConsumer_name_prime = "EnergyConsumer";
		String srcDeliver__srcConsumer____EnergyConsumer_name_prime = "EnergyConsumer";
		String srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime = "ServiceDeliveryPoints";
		trgDeliver__trgConsumer____EnergyConsumer.setSrc(trgDeliver);
		trgDeliver__trgConsumer____EnergyConsumer.setTrg(trgConsumer);
		ruleresult.getCreatedEdges().add(trgDeliver__trgConsumer____EnergyConsumer);
		srcDeliver__srcConsumer____EnergyConsumer.setSrc(srcDeliver);
		srcDeliver__srcConsumer____EnergyConsumer.setTrg(srcConsumer);
		ruleresult.getTranslatedEdges().add(srcDeliver__srcConsumer____EnergyConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setSrc(srcConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setTrg(srcDeliver);
		ruleresult.getTranslatedEdges().add(srcConsumer__srcDeliver____ServiceDeliveryPoints);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		trgDeliver__trgConsumer____EnergyConsumer.setName(trgDeliver__trgConsumer____EnergyConsumer_name_prime);
		srcDeliver__srcConsumer____EnergyConsumer.setName(srcDeliver__srcConsumer____EnergyConsumer_name_prime);
		srcConsumer__srcDeliver____ServiceDeliveryPoints
				.setName(srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime);
		return new Object[] { ruleresult, srcDeliver, trgDeliver, trgConsumer, srcConsumer,
				trgDeliver__trgConsumer____EnergyConsumer, srcDeliver__srcConsumer____EnergyConsumer,
				srcConsumer__srcDeliver____ServiceDeliveryPoints };
	}

	public static final void pattern_EnergyConsumerLinkServiceDeliveryPoint_1_5_registerobjects_expressionBBBBBBBBBB(
			EnergyConsumerLinkServiceDeliveryPoint _this, PerformRuleResult ruleresult, EObject consumerToConsumer,
			EObject srcDeliver, EObject asset, EObject trgDeliver, EObject trgConsumer, EObject deliverToDeliver,
			EObject pair, EObject srcConsumer) {
		_this.registerObjects_FWD(ruleresult, consumerToConsumer, srcDeliver, asset, trgDeliver, trgConsumer,
				deliverToDeliver, pair, srcConsumer);

	}

	public static final PerformRuleResult pattern_EnergyConsumerLinkServiceDeliveryPoint_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EnergyConsumerLinkServiceDeliveryPoint_2_1_preparereturnvalue_bindingFB(
			EnergyConsumerLinkServiceDeliveryPoint _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumerLinkServiceDeliveryPoint_2_1_preparereturnvalue_blackFBB(
			EClass eClass, EnergyConsumerLinkServiceDeliveryPoint _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumerLinkServiceDeliveryPoint_2_1_preparereturnvalue_bindingAndBlackFFB(
			EnergyConsumerLinkServiceDeliveryPoint _this) {
		Object[] result_pattern_EnergyConsumerLinkServiceDeliveryPoint_2_1_preparereturnvalue_binding = pattern_EnergyConsumerLinkServiceDeliveryPoint_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_EnergyConsumerLinkServiceDeliveryPoint_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_EnergyConsumerLinkServiceDeliveryPoint_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_EnergyConsumerLinkServiceDeliveryPoint_2_1_preparereturnvalue_black = pattern_EnergyConsumerLinkServiceDeliveryPoint_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_EnergyConsumerLinkServiceDeliveryPoint_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_EnergyConsumerLinkServiceDeliveryPoint_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumerLinkServiceDeliveryPoint_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "EnergyConsumerLinkServiceDeliveryPoint";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_EnergyConsumerLinkServiceDeliveryPoint_2_2_corematch_bindingFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("srcDeliver");
		EObject _localVariable_1 = match.getObject("asset");
		EObject _localVariable_2 = match.getObject("pair");
		EObject _localVariable_3 = match.getObject("srcConsumer");
		EObject tmpSrcDeliver = _localVariable_0;
		EObject tmpAsset = _localVariable_1;
		EObject tmpPair = _localVariable_2;
		EObject tmpSrcConsumer = _localVariable_3;
		if (tmpSrcDeliver instanceof ServiceDeliveryPoint) {
			ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) tmpSrcDeliver;
			if (tmpAsset instanceof MeterAsset) {
				MeterAsset asset = (MeterAsset) tmpAsset;
				if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
					MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
					if (tmpSrcConsumer instanceof EnergyConsumer) {
						EnergyConsumer srcConsumer = (EnergyConsumer) tmpSrcConsumer;
						return new Object[] { srcDeliver, asset, pair, srcConsumer, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EnergyConsumerLinkServiceDeliveryPoint_2_2_corematch_blackFBBFFFBBB(
			ServiceDeliveryPoint srcDeliver, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			EnergyConsumer srcConsumer, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(srcDeliver, ServiceDeliveryPointToServiceDeliveryPoint.class, "source")) {
			outagePreventionJointarget.ServiceDeliveryPoint trgDeliver = deliverToDeliver.getTarget();
			if (trgDeliver != null) {
				for (EnergyConsumerToEnergyConsumer consumerToConsumer : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(srcConsumer, EnergyConsumerToEnergyConsumer.class, "source")) {
					outagePreventionJointarget.EnergyConsumer trgConsumer = consumerToConsumer.getTarget();
					if (trgConsumer != null) {
						_result.add(new Object[] { consumerToConsumer, srcDeliver, asset, trgDeliver, trgConsumer,
								deliverToDeliver, pair, srcConsumer, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_EnergyConsumerLinkServiceDeliveryPoint_2_3_findcontext_blackBBBBBBBB(
			EnergyConsumerToEnergyConsumer consumerToConsumer, ServiceDeliveryPoint srcDeliver, MeterAsset asset,
			outagePreventionJointarget.ServiceDeliveryPoint trgDeliver,
			outagePreventionJointarget.EnergyConsumer trgConsumer,
			ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver, MeterAssetPhysicalDevicePair pair,
			EnergyConsumer srcConsumer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (trgConsumer.equals(consumerToConsumer.getTarget())) {
			if (asset.equals(pair.getA())) {
				if (trgDeliver.equals(deliverToDeliver.getTarget())) {
					if (srcDeliver.equals(asset.getServiceDeliveryPoint())) {
						if (srcDeliver.equals(deliverToDeliver.getSource())) {
							if (srcConsumer.equals(consumerToConsumer.getSource())) {
								if (srcConsumer.equals(srcDeliver.getEnergyConsumer())) {
									_result.add(new Object[] { consumerToConsumer, srcDeliver, asset, trgDeliver,
											trgConsumer, deliverToDeliver, pair, srcConsumer });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_EnergyConsumerLinkServiceDeliveryPoint_2_3_findcontext_greenBBBBBBBBFFFFFFFFFF(
			EnergyConsumerToEnergyConsumer consumerToConsumer, ServiceDeliveryPoint srcDeliver, MeterAsset asset,
			outagePreventionJointarget.ServiceDeliveryPoint trgDeliver,
			outagePreventionJointarget.EnergyConsumer trgConsumer,
			ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver, MeterAssetPhysicalDevicePair pair,
			EnergyConsumer srcConsumer) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge consumerToConsumer__trgConsumer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge deliverToDeliver__trgDeliver____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge asset__srcDeliver____ServiceDeliveryPoint = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__asset____EndDeviceAssets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge deliverToDeliver__srcDeliver____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge consumerToConsumer__srcConsumer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcDeliver__srcConsumer____EnergyConsumer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcConsumer__srcDeliver____ServiceDeliveryPoints = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String consumerToConsumer__trgConsumer____target_name_prime = "target";
		String pair__asset____a_name_prime = "a";
		String deliverToDeliver__trgDeliver____target_name_prime = "target";
		String asset__srcDeliver____ServiceDeliveryPoint_name_prime = "ServiceDeliveryPoint";
		String srcDeliver__asset____EndDeviceAssets_name_prime = "EndDeviceAssets";
		String deliverToDeliver__srcDeliver____source_name_prime = "source";
		String consumerToConsumer__srcConsumer____source_name_prime = "source";
		String srcDeliver__srcConsumer____EnergyConsumer_name_prime = "EnergyConsumer";
		String srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime = "ServiceDeliveryPoints";
		isApplicableMatch.getAllContextElements().add(consumerToConsumer);
		isApplicableMatch.getAllContextElements().add(srcDeliver);
		isApplicableMatch.getAllContextElements().add(asset);
		isApplicableMatch.getAllContextElements().add(trgDeliver);
		isApplicableMatch.getAllContextElements().add(trgConsumer);
		isApplicableMatch.getAllContextElements().add(deliverToDeliver);
		isApplicableMatch.getAllContextElements().add(pair);
		isApplicableMatch.getAllContextElements().add(srcConsumer);
		consumerToConsumer__trgConsumer____target.setSrc(consumerToConsumer);
		consumerToConsumer__trgConsumer____target.setTrg(trgConsumer);
		isApplicableMatch.getAllContextElements().add(consumerToConsumer__trgConsumer____target);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(pair__asset____a);
		deliverToDeliver__trgDeliver____target.setSrc(deliverToDeliver);
		deliverToDeliver__trgDeliver____target.setTrg(trgDeliver);
		isApplicableMatch.getAllContextElements().add(deliverToDeliver__trgDeliver____target);
		asset__srcDeliver____ServiceDeliveryPoint.setSrc(asset);
		asset__srcDeliver____ServiceDeliveryPoint.setTrg(srcDeliver);
		isApplicableMatch.getAllContextElements().add(asset__srcDeliver____ServiceDeliveryPoint);
		srcDeliver__asset____EndDeviceAssets.setSrc(srcDeliver);
		srcDeliver__asset____EndDeviceAssets.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(srcDeliver__asset____EndDeviceAssets);
		deliverToDeliver__srcDeliver____source.setSrc(deliverToDeliver);
		deliverToDeliver__srcDeliver____source.setTrg(srcDeliver);
		isApplicableMatch.getAllContextElements().add(deliverToDeliver__srcDeliver____source);
		consumerToConsumer__srcConsumer____source.setSrc(consumerToConsumer);
		consumerToConsumer__srcConsumer____source.setTrg(srcConsumer);
		isApplicableMatch.getAllContextElements().add(consumerToConsumer__srcConsumer____source);
		srcDeliver__srcConsumer____EnergyConsumer.setSrc(srcDeliver);
		srcDeliver__srcConsumer____EnergyConsumer.setTrg(srcConsumer);
		isApplicableMatch.getAllContextElements().add(srcDeliver__srcConsumer____EnergyConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setSrc(srcConsumer);
		srcConsumer__srcDeliver____ServiceDeliveryPoints.setTrg(srcDeliver);
		isApplicableMatch.getAllContextElements().add(srcConsumer__srcDeliver____ServiceDeliveryPoints);
		consumerToConsumer__trgConsumer____target.setName(consumerToConsumer__trgConsumer____target_name_prime);
		pair__asset____a.setName(pair__asset____a_name_prime);
		deliverToDeliver__trgDeliver____target.setName(deliverToDeliver__trgDeliver____target_name_prime);
		asset__srcDeliver____ServiceDeliveryPoint.setName(asset__srcDeliver____ServiceDeliveryPoint_name_prime);
		srcDeliver__asset____EndDeviceAssets.setName(srcDeliver__asset____EndDeviceAssets_name_prime);
		deliverToDeliver__srcDeliver____source.setName(deliverToDeliver__srcDeliver____source_name_prime);
		consumerToConsumer__srcConsumer____source.setName(consumerToConsumer__srcConsumer____source_name_prime);
		srcDeliver__srcConsumer____EnergyConsumer.setName(srcDeliver__srcConsumer____EnergyConsumer_name_prime);
		srcConsumer__srcDeliver____ServiceDeliveryPoints
				.setName(srcConsumer__srcDeliver____ServiceDeliveryPoints_name_prime);
		return new Object[] { consumerToConsumer, srcDeliver, asset, trgDeliver, trgConsumer, deliverToDeliver, pair,
				srcConsumer, isApplicableMatch, consumerToConsumer__trgConsumer____target, pair__asset____a,
				deliverToDeliver__trgDeliver____target, asset__srcDeliver____ServiceDeliveryPoint,
				srcDeliver__asset____EndDeviceAssets, deliverToDeliver__srcDeliver____source,
				consumerToConsumer__srcConsumer____source, srcDeliver__srcConsumer____EnergyConsumer,
				srcConsumer__srcDeliver____ServiceDeliveryPoints };
	}

	public static final Object[] pattern_EnergyConsumerLinkServiceDeliveryPoint_2_4_solveCSP_bindingFBBBBBBBBBB(
			EnergyConsumerLinkServiceDeliveryPoint _this, IsApplicableMatch isApplicableMatch,
			EnergyConsumerToEnergyConsumer consumerToConsumer, ServiceDeliveryPoint srcDeliver, MeterAsset asset,
			outagePreventionJointarget.ServiceDeliveryPoint trgDeliver,
			outagePreventionJointarget.EnergyConsumer trgConsumer,
			ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver, MeterAssetPhysicalDevicePair pair,
			EnergyConsumer srcConsumer) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, consumerToConsumer, srcDeliver, asset,
				trgDeliver, trgConsumer, deliverToDeliver, pair, srcConsumer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, consumerToConsumer, srcDeliver, asset, trgDeliver,
					trgConsumer, deliverToDeliver, pair, srcConsumer };
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumerLinkServiceDeliveryPoint_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnergyConsumerLinkServiceDeliveryPoint_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			EnergyConsumerLinkServiceDeliveryPoint _this, IsApplicableMatch isApplicableMatch,
			EnergyConsumerToEnergyConsumer consumerToConsumer, ServiceDeliveryPoint srcDeliver, MeterAsset asset,
			outagePreventionJointarget.ServiceDeliveryPoint trgDeliver,
			outagePreventionJointarget.EnergyConsumer trgConsumer,
			ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver, MeterAssetPhysicalDevicePair pair,
			EnergyConsumer srcConsumer) {
		Object[] result_pattern_EnergyConsumerLinkServiceDeliveryPoint_2_4_solveCSP_binding = pattern_EnergyConsumerLinkServiceDeliveryPoint_2_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, consumerToConsumer, srcDeliver, asset, trgDeliver, trgConsumer,
				deliverToDeliver, pair, srcConsumer);
		if (result_pattern_EnergyConsumerLinkServiceDeliveryPoint_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_EnergyConsumerLinkServiceDeliveryPoint_2_4_solveCSP_binding[0];

			Object[] result_pattern_EnergyConsumerLinkServiceDeliveryPoint_2_4_solveCSP_black = pattern_EnergyConsumerLinkServiceDeliveryPoint_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_EnergyConsumerLinkServiceDeliveryPoint_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, consumerToConsumer, srcDeliver, asset, trgDeliver,
						trgConsumer, deliverToDeliver, pair, srcConsumer };
			}
		}
		return null;
	}

	public static final boolean pattern_EnergyConsumerLinkServiceDeliveryPoint_2_5_checkCSP_expressionFBB(
			EnergyConsumerLinkServiceDeliveryPoint _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EnergyConsumerLinkServiceDeliveryPoint_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_EnergyConsumerLinkServiceDeliveryPoint_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "EnergyConsumerLinkServiceDeliveryPoint";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_EnergyConsumerLinkServiceDeliveryPoint_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EnergyConsumerLinkServiceDeliveryPoint_10_1_preparereturnvalue_bindingFB(
			EnergyConsumerLinkServiceDeliveryPoint _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumerLinkServiceDeliveryPoint_10_1_preparereturnvalue_blackFBBF(
			EClass __eClass, EnergyConsumerLinkServiceDeliveryPoint _this) {
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

	public static final Object[] pattern_EnergyConsumerLinkServiceDeliveryPoint_10_1_preparereturnvalue_bindingAndBlackFFBF(
			EnergyConsumerLinkServiceDeliveryPoint _this) {
		Object[] result_pattern_EnergyConsumerLinkServiceDeliveryPoint_10_1_preparereturnvalue_binding = pattern_EnergyConsumerLinkServiceDeliveryPoint_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_EnergyConsumerLinkServiceDeliveryPoint_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_EnergyConsumerLinkServiceDeliveryPoint_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_EnergyConsumerLinkServiceDeliveryPoint_10_1_preparereturnvalue_black = pattern_EnergyConsumerLinkServiceDeliveryPoint_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_EnergyConsumerLinkServiceDeliveryPoint_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EnergyConsumerLinkServiceDeliveryPoint_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_EnergyConsumerLinkServiceDeliveryPoint_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumerLinkServiceDeliveryPoint_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_EnergyConsumerLinkServiceDeliveryPoint_10_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_EnergyConsumer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSrcDeliver = _edge_EnergyConsumer.getSrc();
		if (tmpSrcDeliver instanceof ServiceDeliveryPoint) {
			ServiceDeliveryPoint srcDeliver = (ServiceDeliveryPoint) tmpSrcDeliver;
			EObject tmpSrcConsumer = _edge_EnergyConsumer.getTrg();
			if (tmpSrcConsumer instanceof EnergyConsumer) {
				EnergyConsumer srcConsumer = (EnergyConsumer) tmpSrcConsumer;
				if (srcConsumer.equals(srcDeliver.getEnergyConsumer())) {
					for (EndDeviceAsset tmpAsset : srcDeliver.getEndDeviceAssets()) {
						if (tmpAsset instanceof MeterAsset) {
							MeterAsset asset = (MeterAsset) tmpAsset;
							for (MeterAssetPhysicalDevicePair pair : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(asset, MeterAssetPhysicalDevicePair.class, "a")) {
								_result.add(
										new Object[] { srcDeliver, asset, pair, srcConsumer, _edge_EnergyConsumer });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_EnergyConsumerLinkServiceDeliveryPoint_10_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EnergyConsumerLinkServiceDeliveryPoint_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			EnergyConsumerLinkServiceDeliveryPoint _this, Match match, ServiceDeliveryPoint srcDeliver,
			MeterAsset asset, MeterAssetPhysicalDevicePair pair, EnergyConsumer srcConsumer) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, srcDeliver, asset, pair, srcConsumer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EnergyConsumerLinkServiceDeliveryPoint_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			EnergyConsumerLinkServiceDeliveryPoint _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EnergyConsumerLinkServiceDeliveryPoint_10_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_EnergyConsumerLinkServiceDeliveryPoint_10_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_EnergyConsumerLinkServiceDeliveryPoint_10_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EnergyConsumerLinkServiceDeliveryPoint_13_1_matchtggpattern_blackBBBB(
			ServiceDeliveryPoint srcDeliver, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			EnergyConsumer srcConsumer) {
		if (asset.equals(pair.getA())) {
			if (srcDeliver.equals(asset.getServiceDeliveryPoint())) {
				if (srcConsumer.equals(srcDeliver.getEnergyConsumer())) {
					return new Object[] { srcDeliver, asset, pair, srcConsumer };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_EnergyConsumerLinkServiceDeliveryPoint_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EnergyConsumerLinkServiceDeliveryPoint_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //EnergyConsumerLinkServiceDeliveryPointImpl
