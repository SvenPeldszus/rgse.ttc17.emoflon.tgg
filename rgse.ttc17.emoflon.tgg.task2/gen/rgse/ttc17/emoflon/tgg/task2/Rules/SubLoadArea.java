/**
 */
package rgse.ttc17.emoflon.tgg.task2.Rules;

import gluemodel.CIM.IEC61968.Metering.MeterAsset;
import gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint;

import gluemodel.CIM.IEC61970.LoadModel.ConformLoad;
import gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup;

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

import rgse.ttc17.emoflon.tgg.task2.ConformLoadGroupToConformLoadGroup;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Load Area</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see rgse.ttc17.emoflon.tgg.task2.Rules.RulesPackage#getSubLoadArea()
 * @model
 * @generated
 */
public interface SubLoadArea extends EObject, AbstractRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_FWD(Match match, ServiceDeliveryPoint srcDeliver, MeterAsset asset,
			MeterAssetPhysicalDevicePair pair, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea,
			ConformLoadGroup srcGroup, ConformLoad srcConsumer);

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
	void registerObjectsToMatch_FWD(Match match, ServiceDeliveryPoint srcDeliver, MeterAsset asset,
			MeterAssetPhysicalDevicePair pair, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea,
			ConformLoadGroup srcGroup, ConformLoad srcConsumer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_FWD(Match match, ServiceDeliveryPoint srcDeliver, MeterAsset asset,
			MeterAssetPhysicalDevicePair pair, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea,
			ConformLoadGroup srcGroup, ConformLoad srcConsumer);

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
	CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, ServiceDeliveryPoint srcDeliver,
			MeterAsset asset, ConformLoadGroupToConformLoadGroup groupToGroup,
			outagePreventionJointarget.ConformLoadGroup trgGroup, MeterAssetPhysicalDevicePair pair,
			gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea, ConformLoadGroup srcGroup, ConformLoad srcConsumer);

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
	void registerObjects_FWD(PerformRuleResult ruleresult, EObject srcDeliver, EObject asset, EObject groupToGroup,
			EObject trgGroup, EObject trgArea, EObject pair, EObject srcArea, EObject areaToArea, EObject srcGroup,
			EObject srcConsumer);

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
	EObjectContainer isAppropriate_FWD_EMoflonEdge_33(EMoflonEdge _edge_SubLoadArea);

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
	boolean checkDEC_FWD(ServiceDeliveryPoint srcDeliver, MeterAsset asset, MeterAssetPhysicalDevicePair pair,
			gluemodel.CIM.IEC61970.LoadModel.SubLoadArea srcArea, ConformLoadGroup srcGroup, ConformLoad srcConsumer);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // SubLoadArea
