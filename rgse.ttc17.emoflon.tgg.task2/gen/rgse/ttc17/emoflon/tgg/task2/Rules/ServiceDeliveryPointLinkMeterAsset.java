/**
 */
package rgse.ttc17.emoflon.tgg.task2.Rules;

import gluemodel.CIM.IEC61968.Metering.MeterAsset;
import gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint;

import gluemodel.MeterAssetPhysicalDevicePair;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.language.csp.CSP;

import org.moflon.tgg.runtime.AbstractRule;
import org.moflon.tgg.runtime.AttributeConstraintsRuleResult;
import org.moflon.tgg.runtime.EMoflonEdge;
import org.moflon.tgg.runtime.EObjectContainer;
import org.moflon.tgg.runtime.IsApplicableMatch;
import org.moflon.tgg.runtime.IsApplicableRuleResult;
import org.moflon.tgg.runtime.Match;
import org.moflon.tgg.runtime.PerformRuleResult;
import org.moflon.tgg.runtime.TripleMatch;

import outagePreventionJointarget.PrivateMeterVoltage;

import rgse.ttc17.emoflon.tgg.task2.MeterAssetToPrivateMeterVoltage;
import rgse.ttc17.emoflon.tgg.task2.ServiceDeliveryPointToServiceDeliveryPoint;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Delivery Point Link Meter Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see rgse.ttc17.emoflon.tgg.task2.Rules.RulesPackage#getServiceDeliveryPointLinkMeterAsset()
 * @model
 * @generated
 */
public interface ServiceDeliveryPointLinkMeterAsset extends EObject, AbstractRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_FWD(Match match, MeterAssetPhysicalDevicePair pair, ServiceDeliveryPoint srcDeliver,
			MeterAsset asset);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IsApplicableRuleResult isApplicable_FWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerObjectsToMatch_FWD(Match match, MeterAssetPhysicalDevicePair pair, ServiceDeliveryPoint srcDeliver,
			MeterAsset asset);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_FWD(Match match, MeterAssetPhysicalDevicePair pair, ServiceDeliveryPoint srcDeliver,
			MeterAsset asset);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_checkCsp_FWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			outagePreventionJointarget.ServiceDeliveryPoint trgDeliver, MeterAssetPhysicalDevicePair pair,
			PrivateMeterVoltage meter, ServiceDeliveryPointToServiceDeliveryPoint deliverToDeliver,
			MeterAssetToPrivateMeterVoltage assetToMeter, ServiceDeliveryPoint srcDeliver, MeterAsset asset);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isApplicable_checkCsp_FWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerObjects_FWD(PerformRuleResult ruleresult, EObject trgDeliver, EObject pair, EObject meter,
			EObject deliverToDeliver, EObject assetToMeter, EObject srcDeliver, EObject asset);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkTypes_FWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_EMoflonEdge_36(EMoflonEdge _edge_ServiceDeliveryPoint);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IsApplicableRuleResult isApplicable_CC(Match sourceMatch, Match targetMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkDEC_FWD(MeterAssetPhysicalDevicePair pair, ServiceDeliveryPoint srcDeliver, MeterAsset asset);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ServiceDeliveryPointLinkMeterAsset
