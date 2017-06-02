/**
 */
package rgse.ttc17.emoflon.tgg.task2.Rules;

import gluemodel.CIM.IEC61968.Metering.MeterAsset;
import gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint;

import gluemodel.CIM.IEC61970.ControlArea.ControlArea;

import gluemodel.CIM.IEC61970.LoadModel.ConformLoad;
import gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup;
import gluemodel.CIM.IEC61970.LoadModel.LoadArea;
import gluemodel.CIM.IEC61970.LoadModel.SubLoadArea;

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

import rgse.ttc17.emoflon.tgg.task2.ControlAreaToControlSrea;
import rgse.ttc17.emoflon.tgg.task2.LoadAreaToLoadArea;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Area Link Control Area</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see rgse.ttc17.emoflon.tgg.task2.Rules.RulesPackage#getLoadAreaLinkControlArea()
 * @model
 * @generated
 */
public interface LoadAreaLinkControlArea extends EObject, AbstractRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_FWD(Match match, ConformLoadGroup srcGroup, MeterAsset asset, ControlArea srcControl,
			SubLoadArea srcArea, ServiceDeliveryPoint srcDeliver, LoadArea srcLoadArea,
			MeterAssetPhysicalDevicePair pair, ConformLoad srcConsumer);

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
	void registerObjectsToMatch_FWD(Match match, ConformLoadGroup srcGroup, MeterAsset asset, ControlArea srcControl,
			SubLoadArea srcArea, ServiceDeliveryPoint srcDeliver, LoadArea srcLoadArea,
			MeterAssetPhysicalDevicePair pair, ConformLoad srcConsumer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_FWD(Match match, ConformLoadGroup srcGroup, MeterAsset asset, ControlArea srcControl,
			SubLoadArea srcArea, ServiceDeliveryPoint srcDeliver, LoadArea srcLoadArea,
			MeterAssetPhysicalDevicePair pair, ConformLoad srcConsumer);

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
	CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, ConformLoadGroup srcGroup,
			ControlAreaToControlSrea controlToControl, MeterAsset asset,
			outagePreventionJointarget.ControlArea trgControl, ControlArea srcControl, SubLoadArea srcArea,
			ServiceDeliveryPoint srcDeliver, LoadAreaToLoadArea laodToLoad, LoadArea srcLoadArea,
			outagePreventionJointarget.LoadArea trgLoadArea, MeterAssetPhysicalDevicePair pair,
			ConformLoad srcConsumer);

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
	void registerObjects_FWD(PerformRuleResult ruleresult, EObject srcGroup, EObject controlToControl, EObject asset,
			EObject trgControl, EObject srcControl, EObject srcArea, EObject srcDeliver, EObject laodToLoad,
			EObject srcLoadArea, EObject trgLoadArea, EObject pair, EObject srcConsumer);

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
	EObjectContainer isAppropriate_FWD_EMoflonEdge_163(EMoflonEdge _edge_ControlArea);

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
	boolean checkDEC_FWD(ConformLoadGroup srcGroup, MeterAsset asset, ControlArea srcControl, SubLoadArea srcArea,
			ServiceDeliveryPoint srcDeliver, LoadArea srcLoadArea, MeterAssetPhysicalDevicePair pair,
			ConformLoad srcConsumer);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // LoadAreaLinkControlArea
