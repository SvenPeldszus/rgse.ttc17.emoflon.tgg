/**
 */
package rgse.ttc17.emoflon.tgg.task2.Rules;

import gluemodel.CIM.IEC61968.Common.Location;

import gluemodel.CIM.IEC61968.Metering.MeterAsset;

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

import rgse.ttc17.emoflon.tgg.task2.TerminalToTerminal;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tie Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see rgse.ttc17.emoflon.tgg.task2.Rules.RulesPackage#getTieFlow()
 * @model
 * @generated
 */
public interface TieFlow extends EObject, AbstractRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_FWD(Match match, Location srcLocation, MeterAsset meter,
			gluemodel.CIM.IEC61970.ControlArea.TieFlow srcFlow, MeterAssetMMXUPair pair, Terminal srcTerminal,
			ConductingEquipment srcResource);

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
	void registerObjectsToMatch_FWD(Match match, Location srcLocation, MeterAsset meter,
			gluemodel.CIM.IEC61970.ControlArea.TieFlow srcFlow, MeterAssetMMXUPair pair, Terminal srcTerminal,
			ConductingEquipment srcResource);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_FWD(Match match, Location srcLocation, MeterAsset meter,
			gluemodel.CIM.IEC61970.ControlArea.TieFlow srcFlow, MeterAssetMMXUPair pair, Terminal srcTerminal,
			ConductingEquipment srcResource);

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
	CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Location srcLocation,
			TerminalToTerminal terminalToTerminal, MeterAsset meter, gluemodel.CIM.IEC61970.ControlArea.TieFlow srcFlow,
			MeterAssetMMXUPair pair, Terminal srcTerminal, outagePreventionJointarget.Terminal trgTerminal,
			ConductingEquipment srcResource);

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
	void registerObjects_FWD(PerformRuleResult ruleresult, EObject srcLocation, EObject terminalToTerminal,
			EObject meter, EObject trgFlow, EObject srcFlow, EObject flowToFlow, EObject pair, EObject srcTerminal,
			EObject trgTerminal, EObject srcResource);

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
	EObjectContainer isAppropriate_FWD_EMoflonEdge_155(EMoflonEdge _edge_TieFlow);

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
	boolean checkDEC_FWD(Location srcLocation, MeterAsset meter, gluemodel.CIM.IEC61970.ControlArea.TieFlow srcFlow,
			MeterAssetMMXUPair pair, Terminal srcTerminal, ConductingEquipment srcResource);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TieFlow
