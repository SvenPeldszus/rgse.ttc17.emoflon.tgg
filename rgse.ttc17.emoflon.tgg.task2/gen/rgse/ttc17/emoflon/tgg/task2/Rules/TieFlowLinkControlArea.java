/**
 */
package rgse.ttc17.emoflon.tgg.task2.Rules;

import gluemodel.CIM.IEC61968.Common.Location;

import gluemodel.CIM.IEC61968.Metering.MeterAsset;

import gluemodel.CIM.IEC61970.ControlArea.ControlArea;
import gluemodel.CIM.IEC61970.ControlArea.TieFlow;

import gluemodel.CIM.IEC61970.Core.ConductingEquipment;
import gluemodel.CIM.IEC61970.Core.Terminal;

import gluemodel.MeterAssetMMXUPair;

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
import rgse.ttc17.emoflon.tgg.task2.TieFlowToTieFlow;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tie Flow Link Control Area</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see rgse.ttc17.emoflon.tgg.task2.Rules.RulesPackage#getTieFlowLinkControlArea()
 * @model
 * @generated
 */
public interface TieFlowLinkControlArea extends EObject, AbstractRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_FWD(Match match, MeterAssetMMXUPair pair, ControlArea srcControlArea, MeterAsset meter,
			ConductingEquipment srcResource, Location srcLocation, Terminal srcTerminal, TieFlow srcTieFlow);

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
	void registerObjectsToMatch_FWD(Match match, MeterAssetMMXUPair pair, ControlArea srcControlArea, MeterAsset meter,
			ConductingEquipment srcResource, Location srcLocation, Terminal srcTerminal, TieFlow srcTieFlow);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_FWD(Match match, MeterAssetMMXUPair pair, ControlArea srcControlArea, MeterAsset meter,
			ConductingEquipment srcResource, Location srcLocation, Terminal srcTerminal, TieFlow srcTieFlow);

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
			ControlAreaToControlSrea controlAreaToControlArea, MeterAssetMMXUPair pair, ControlArea srcControlArea,
			outagePreventionJointarget.TieFlow trgTieFlow, MeterAsset meter, ConductingEquipment srcResource,
			outagePreventionJointarget.ControlArea trgControlArea, TieFlowToTieFlow flowToFlow, Location srcLocation,
			Terminal srcTerminal, TieFlow srcTieFlow);

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
	void registerObjects_FWD(PerformRuleResult ruleresult, EObject controlAreaToControlArea, EObject pair,
			EObject srcControlArea, EObject trgTieFlow, EObject meter, EObject srcResource, EObject trgControlArea,
			EObject flowToFlow, EObject srcLocation, EObject srcTerminal, EObject srcTieFlow);

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
	EObjectContainer isAppropriate_FWD_EMoflonEdge_43(EMoflonEdge _edge_ControlArea);

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
	boolean checkDEC_FWD(MeterAssetMMXUPair pair, ControlArea srcControlArea, MeterAsset meter,
			ConductingEquipment srcResource, Location srcLocation, Terminal srcTerminal, TieFlow srcTieFlow);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TieFlowLinkControlArea
