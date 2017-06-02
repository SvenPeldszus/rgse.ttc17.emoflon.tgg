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
	boolean isAppropriate_FWD(Match match, ServiceDeliveryPoint srcDeliver, ConformLoadGroup srcGroup,
			LoadArea srcLoadArea, ConformLoad srcConsumer, SubLoadArea srcArea, MeterAssetPhysicalDevicePair pair,
			ControlArea srcControl, MeterAsset asset);

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
	void registerObjectsToMatch_FWD(Match match, ServiceDeliveryPoint srcDeliver, ConformLoadGroup srcGroup,
			LoadArea srcLoadArea, ConformLoad srcConsumer, SubLoadArea srcArea, MeterAssetPhysicalDevicePair pair,
			ControlArea srcControl, MeterAsset asset);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_FWD(Match match, ServiceDeliveryPoint srcDeliver, ConformLoadGroup srcGroup,
			LoadArea srcLoadArea, ConformLoad srcConsumer, SubLoadArea srcArea, MeterAssetPhysicalDevicePair pair,
			ControlArea srcControl, MeterAsset asset);

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
			ConformLoadGroup srcGroup, LoadArea srcLoadArea, ConformLoad srcConsumer, SubLoadArea srcArea,
			MeterAssetPhysicalDevicePair pair, outagePreventionJointarget.LoadArea trgLoadArea,
			outagePreventionJointarget.ControlArea trgControl, ControlAreaToControlSrea controlToControl,
			ControlArea srcControl, LoadAreaToLoadArea laodToLoad, MeterAsset asset);

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
	void registerObjects_FWD(PerformRuleResult ruleresult, EObject srcDeliver, EObject srcGroup, EObject srcLoadArea,
			EObject srcConsumer, EObject srcArea, EObject pair, EObject trgLoadArea, EObject trgControl,
			EObject controlToControl, EObject srcControl, EObject laodToLoad, EObject asset);

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
	EObjectContainer isAppropriate_FWD_EMoflonEdge_50(EMoflonEdge _edge_ControlArea);

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
	boolean checkDEC_FWD(ServiceDeliveryPoint srcDeliver, ConformLoadGroup srcGroup, LoadArea srcLoadArea,
			ConformLoad srcConsumer, SubLoadArea srcArea, MeterAssetPhysicalDevicePair pair, ControlArea srcControl,
			MeterAsset asset);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // LoadAreaLinkControlArea
