/**
 */
package rgse.ttc17.emoflon.tgg.task2.Rules.impl;

import gluemodel.CIM.IEC61968.Assets.Asset;

import gluemodel.CIM.IEC61968.Common.Location;

import gluemodel.CIM.IEC61968.Metering.MeterAsset;

import gluemodel.CIM.IEC61970.Core.ConductingEquipment;
import gluemodel.CIM.IEC61970.Core.Terminal;

import gluemodel.MeterAssetMMXUPair;

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

import rgse.ttc17.emoflon.tgg.task2.Rules.RulesPackage;
import rgse.ttc17.emoflon.tgg.task2.Rules.TieFlow;

import rgse.ttc17.emoflon.tgg.task2.Task2Factory;
import rgse.ttc17.emoflon.tgg.task2.TerminalToTerminal;
import rgse.ttc17.emoflon.tgg.task2.TieFlowToTieFlow;
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
 * An implementation of the model object '<em><b>Tie Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TieFlowImpl extends AbstractRuleImpl implements TieFlow {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TieFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getTieFlow();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MeterAssetMMXUPair pair, Terminal srcTerminal, Location srcLocation,
			ConductingEquipment srcResource, gluemodel.CIM.IEC61970.ControlArea.TieFlow srcFlow, MeterAsset meter) {
		// initial bindings
		Object[] result1_black = TieFlowImpl.pattern_TieFlow_0_1_initialbindings_blackBBBBBBBB(this, match, pair,
				srcTerminal, srcLocation, srcResource, srcFlow, meter);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[pair] = " + pair + ", " + "[srcTerminal] = " + srcTerminal
							+ ", " + "[srcLocation] = " + srcLocation + ", " + "[srcResource] = " + srcResource + ", "
							+ "[srcFlow] = " + srcFlow + ", " + "[meter] = " + meter + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = TieFlowImpl.pattern_TieFlow_0_2_SolveCSP_bindingAndBlackFBBBBBBBB(this,
				match, pair, srcTerminal, srcLocation, srcResource, srcFlow, meter);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[pair] = " + pair + ", " + "[srcTerminal] = "
					+ srcTerminal + ", " + "[srcLocation] = " + srcLocation + ", " + "[srcResource] = " + srcResource
					+ ", " + "[srcFlow] = " + srcFlow + ", " + "[meter] = " + meter + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (TieFlowImpl.pattern_TieFlow_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = TieFlowImpl.pattern_TieFlow_0_4_collectelementstobetranslated_blackBBBBBBB(match,
					pair, srcTerminal, srcLocation, srcResource, srcFlow, meter);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[pair] = " + pair + ", " + "[srcTerminal] = "
						+ srcTerminal + ", " + "[srcLocation] = " + srcLocation + ", " + "[srcResource] = "
						+ srcResource + ", " + "[srcFlow] = " + srcFlow + ", " + "[meter] = " + meter + ".");
			}
			TieFlowImpl.pattern_TieFlow_0_4_collectelementstobetranslated_greenBBBFF(match, srcTerminal, srcFlow);
			// EMoflonEdge srcTerminal__srcFlow____TieFlow = (EMoflonEdge) result4_green[3];
			// EMoflonEdge srcFlow__srcTerminal____Terminal = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = TieFlowImpl.pattern_TieFlow_0_5_collectcontextelements_blackBBBBBBB(match, pair,
					srcTerminal, srcLocation, srcResource, srcFlow, meter);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[pair] = " + pair + ", " + "[srcTerminal] = "
						+ srcTerminal + ", " + "[srcLocation] = " + srcLocation + ", " + "[srcResource] = "
						+ srcResource + ", " + "[srcFlow] = " + srcFlow + ", " + "[meter] = " + meter + ".");
			}
			TieFlowImpl.pattern_TieFlow_0_5_collectcontextelements_greenBBBBBBFFFFFFF(match, pair, srcTerminal,
					srcLocation, srcResource, meter);
			// EMoflonEdge srcLocation__srcResource____PowerSystemResources = (EMoflonEdge) result5_green[6];
			// EMoflonEdge srcResource__srcLocation____Location = (EMoflonEdge) result5_green[7];
			// EMoflonEdge pair__meter____a = (EMoflonEdge) result5_green[8];
			// EMoflonEdge meter__srcLocation____Location = (EMoflonEdge) result5_green[9];
			// EMoflonEdge srcLocation__meter____Assets = (EMoflonEdge) result5_green[10];
			// EMoflonEdge srcResource__srcTerminal____Terminals = (EMoflonEdge) result5_green[11];
			// EMoflonEdge srcTerminal__srcResource____ConductingEquipment = (EMoflonEdge) result5_green[12];

			// register objects to match
			TieFlowImpl.pattern_TieFlow_0_6_registerobjectstomatch_expressionBBBBBBBB(this, match, pair, srcTerminal,
					srcLocation, srcResource, srcFlow, meter);
			return TieFlowImpl.pattern_TieFlow_0_7_expressionF();
		} else {
			return TieFlowImpl.pattern_TieFlow_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = TieFlowImpl
				.pattern_TieFlow_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MeterAssetMMXUPair pair = (MeterAssetMMXUPair) result1_bindingAndBlack[0];
		Terminal srcTerminal = (Terminal) result1_bindingAndBlack[1];
		Location srcLocation = (Location) result1_bindingAndBlack[2];
		ConductingEquipment srcResource = (ConductingEquipment) result1_bindingAndBlack[3];
		gluemodel.CIM.IEC61970.ControlArea.TieFlow srcFlow = (gluemodel.CIM.IEC61970.ControlArea.TieFlow) result1_bindingAndBlack[4];
		TerminalToTerminal terminalToTerminal = (TerminalToTerminal) result1_bindingAndBlack[5];
		MeterAsset meter = (MeterAsset) result1_bindingAndBlack[6];
		outagePreventionJointarget.Terminal trgTerminal = (outagePreventionJointarget.Terminal) result1_bindingAndBlack[7];
		// CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = TieFlowImpl.pattern_TieFlow_1_1_performtransformation_greenFBFB(srcFlow, trgTerminal);
		outagePreventionJointarget.TieFlow trgFlow = (outagePreventionJointarget.TieFlow) result1_green[0];
		TieFlowToTieFlow flowToFlow = (TieFlowToTieFlow) result1_green[2];

		// collect translated elements
		Object[] result2_black = TieFlowImpl.pattern_TieFlow_1_2_collecttranslatedelements_blackBBB(trgFlow, srcFlow,
				flowToFlow);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed." + " Variables: " + "[trgFlow] = "
							+ trgFlow + ", " + "[srcFlow] = " + srcFlow + ", " + "[flowToFlow] = " + flowToFlow + ".");
		}
		Object[] result2_green = TieFlowImpl.pattern_TieFlow_1_2_collecttranslatedelements_greenFBBB(trgFlow, srcFlow,
				flowToFlow);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = TieFlowImpl.pattern_TieFlow_1_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult,
				trgFlow, pair, srcTerminal, srcLocation, srcResource, srcFlow, flowToFlow, terminalToTerminal, meter,
				trgTerminal);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[trgFlow] = " + trgFlow + ", " + "[pair] = " + pair
					+ ", " + "[srcTerminal] = " + srcTerminal + ", " + "[srcLocation] = " + srcLocation + ", "
					+ "[srcResource] = " + srcResource + ", " + "[srcFlow] = " + srcFlow + ", " + "[flowToFlow] = "
					+ flowToFlow + ", " + "[terminalToTerminal] = " + terminalToTerminal + ", " + "[meter] = " + meter
					+ ", " + "[trgTerminal] = " + trgTerminal + ".");
		}
		TieFlowImpl.pattern_TieFlow_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, trgFlow, srcTerminal, srcFlow,
				flowToFlow, trgTerminal);
		// EMoflonEdge srcTerminal__srcFlow____TieFlow = (EMoflonEdge) result3_green[6];
		// EMoflonEdge srcFlow__srcTerminal____Terminal = (EMoflonEdge) result3_green[7];
		// EMoflonEdge flowToFlow__srcFlow____source = (EMoflonEdge) result3_green[8];
		// EMoflonEdge flowToFlow__trgFlow____target = (EMoflonEdge) result3_green[9];
		// EMoflonEdge trgTerminal__trgFlow____TieFlow = (EMoflonEdge) result3_green[10];

		// perform postprocessing story node is empty
		// register objects
		TieFlowImpl.pattern_TieFlow_1_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult, trgFlow, pair,
				srcTerminal, srcLocation, srcResource, srcFlow, flowToFlow, terminalToTerminal, meter, trgTerminal);
		return TieFlowImpl.pattern_TieFlow_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = TieFlowImpl.pattern_TieFlow_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TieFlowImpl.pattern_TieFlow_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = TieFlowImpl.pattern_TieFlow_2_2_corematch_bindingFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MeterAssetMMXUPair pair = (MeterAssetMMXUPair) result2_binding[0];
		Terminal srcTerminal = (Terminal) result2_binding[1];
		Location srcLocation = (Location) result2_binding[2];
		ConductingEquipment srcResource = (ConductingEquipment) result2_binding[3];
		gluemodel.CIM.IEC61970.ControlArea.TieFlow srcFlow = (gluemodel.CIM.IEC61970.ControlArea.TieFlow) result2_binding[4];
		MeterAsset meter = (MeterAsset) result2_binding[5];
		for (Object[] result2_black : TieFlowImpl.pattern_TieFlow_2_2_corematch_blackBBBBBFBFB(pair, srcTerminal,
				srcLocation, srcResource, srcFlow, meter, match)) {
			TerminalToTerminal terminalToTerminal = (TerminalToTerminal) result2_black[5];
			outagePreventionJointarget.Terminal trgTerminal = (outagePreventionJointarget.Terminal) result2_black[7];
			// ForEach find context
			for (Object[] result3_black : TieFlowImpl.pattern_TieFlow_2_3_findcontext_blackBBBBBBBB(pair, srcTerminal,
					srcLocation, srcResource, srcFlow, terminalToTerminal, meter, trgTerminal)) {
				Object[] result3_green = TieFlowImpl.pattern_TieFlow_2_3_findcontext_greenBBBBBBBBFFFFFFFFFFFF(pair,
						srcTerminal, srcLocation, srcResource, srcFlow, terminalToTerminal, meter, trgTerminal);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				// EMoflonEdge srcTerminal__srcFlow____TieFlow = (EMoflonEdge) result3_green[9];
				// EMoflonEdge srcFlow__srcTerminal____Terminal = (EMoflonEdge) result3_green[10];
				// EMoflonEdge srcLocation__srcResource____PowerSystemResources = (EMoflonEdge) result3_green[11];
				// EMoflonEdge srcResource__srcLocation____Location = (EMoflonEdge) result3_green[12];
				// EMoflonEdge pair__meter____a = (EMoflonEdge) result3_green[13];
				// EMoflonEdge terminalToTerminal__srcTerminal____source = (EMoflonEdge) result3_green[14];
				// EMoflonEdge meter__srcLocation____Location = (EMoflonEdge) result3_green[15];
				// EMoflonEdge srcLocation__meter____Assets = (EMoflonEdge) result3_green[16];
				// EMoflonEdge srcResource__srcTerminal____Terminals = (EMoflonEdge) result3_green[17];
				// EMoflonEdge srcTerminal__srcResource____ConductingEquipment = (EMoflonEdge) result3_green[18];
				// EMoflonEdge terminalToTerminal__trgTerminal____target = (EMoflonEdge) result3_green[19];

				// solve CSP
				Object[] result4_bindingAndBlack = TieFlowImpl.pattern_TieFlow_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
						this, isApplicableMatch, pair, srcTerminal, srcLocation, srcResource, srcFlow,
						terminalToTerminal, meter, trgTerminal);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[pair] = " + pair + ", " + "[srcTerminal] = " + srcTerminal + ", " + "[srcLocation] = "
							+ srcLocation + ", " + "[srcResource] = " + srcResource + ", " + "[srcFlow] = " + srcFlow
							+ ", " + "[terminalToTerminal] = " + terminalToTerminal + ", " + "[meter] = " + meter + ", "
							+ "[trgTerminal] = " + trgTerminal + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (TieFlowImpl.pattern_TieFlow_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = TieFlowImpl.pattern_TieFlow_2_6_addmatchtoruleresult_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					TieFlowImpl.pattern_TieFlow_2_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return TieFlowImpl.pattern_TieFlow_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MeterAssetMMXUPair pair, Terminal srcTerminal,
			Location srcLocation, ConductingEquipment srcResource, gluemodel.CIM.IEC61970.ControlArea.TieFlow srcFlow,
			MeterAsset meter) {
		match.registerObject("pair", pair);
		match.registerObject("srcTerminal", srcTerminal);
		match.registerObject("srcLocation", srcLocation);
		match.registerObject("srcResource", srcResource);
		match.registerObject("srcFlow", srcFlow);
		match.registerObject("meter", meter);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MeterAssetMMXUPair pair, Terminal srcTerminal,
			Location srcLocation, ConductingEquipment srcResource, gluemodel.CIM.IEC61970.ControlArea.TieFlow srcFlow,
			MeterAsset meter) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MeterAssetMMXUPair pair,
			Terminal srcTerminal, Location srcLocation, ConductingEquipment srcResource,
			gluemodel.CIM.IEC61970.ControlArea.TieFlow srcFlow, TerminalToTerminal terminalToTerminal, MeterAsset meter,
			outagePreventionJointarget.Terminal trgTerminal) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("pair", pair);
		isApplicableMatch.registerObject("srcTerminal", srcTerminal);
		isApplicableMatch.registerObject("srcLocation", srcLocation);
		isApplicableMatch.registerObject("srcResource", srcResource);
		isApplicableMatch.registerObject("srcFlow", srcFlow);
		isApplicableMatch.registerObject("terminalToTerminal", terminalToTerminal);
		isApplicableMatch.registerObject("meter", meter);
		isApplicableMatch.registerObject("trgTerminal", trgTerminal);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject trgFlow, EObject pair, EObject srcTerminal,
			EObject srcLocation, EObject srcResource, EObject srcFlow, EObject flowToFlow, EObject terminalToTerminal,
			EObject meter, EObject trgTerminal) {
		ruleresult.registerObject("trgFlow", trgFlow);
		ruleresult.registerObject("pair", pair);
		ruleresult.registerObject("srcTerminal", srcTerminal);
		ruleresult.registerObject("srcLocation", srcLocation);
		ruleresult.registerObject("srcResource", srcResource);
		ruleresult.registerObject("srcFlow", srcFlow);
		ruleresult.registerObject("flowToFlow", flowToFlow);
		ruleresult.registerObject("terminalToTerminal", terminalToTerminal);
		ruleresult.registerObject("meter", meter);
		ruleresult.registerObject("trgTerminal", trgTerminal);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("srcFlow").eClass())
				.equals("gluemodel.CIM.IEC61970.ControlArea.TieFlow.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_37(EMoflonEdge _edge_TieFlow) {
		// prepare return value
		Object[] result1_bindingAndBlack = TieFlowImpl
				.pattern_TieFlow_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = TieFlowImpl.pattern_TieFlow_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : TieFlowImpl
				.pattern_TieFlow_10_2_testcorematchandDECs_blackFFFFFFB(_edge_TieFlow)) {
			MeterAssetMMXUPair pair = (MeterAssetMMXUPair) result2_black[0];
			Terminal srcTerminal = (Terminal) result2_black[1];
			Location srcLocation = (Location) result2_black[2];
			ConductingEquipment srcResource = (ConductingEquipment) result2_black[3];
			gluemodel.CIM.IEC61970.ControlArea.TieFlow srcFlow = (gluemodel.CIM.IEC61970.ControlArea.TieFlow) result2_black[4];
			MeterAsset meter = (MeterAsset) result2_black[5];
			Object[] result2_green = TieFlowImpl.pattern_TieFlow_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (TieFlowImpl.pattern_TieFlow_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBB(this,
					match, pair, srcTerminal, srcLocation, srcResource, srcFlow, meter)) {
				// Ensure that the correct types of elements are matched
				if (TieFlowImpl.pattern_TieFlow_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
						match)) {

					// Add match to rule result
					Object[] result5_black = TieFlowImpl.pattern_TieFlow_10_5_Addmatchtoruleresult_blackBBBB(match,
							__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					TieFlowImpl.pattern_TieFlow_10_5_Addmatchtoruleresult_greenBBBB(match, __performOperation, __result,
							isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return TieFlowImpl.pattern_TieFlow_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("TieFlow");
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
	public boolean checkDEC_FWD(MeterAssetMMXUPair pair, Terminal srcTerminal, Location srcLocation,
			ConductingEquipment srcResource, gluemodel.CIM.IEC61970.ControlArea.TieFlow srcFlow, MeterAsset meter) {// match tgg pattern
		Object[] result1_black = TieFlowImpl.pattern_TieFlow_13_1_matchtggpattern_blackBBBBBB(pair, srcTerminal,
				srcLocation, srcResource, srcFlow, meter);
		if (result1_black != null) {
			return TieFlowImpl.pattern_TieFlow_13_2_expressionF();
		} else {
			return TieFlowImpl.pattern_TieFlow_13_3_expressionF();
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
		case RulesPackage.TIE_FLOW___IS_APPROPRIATE_FWD__MATCH_METERASSETMMXUPAIR_TERMINAL_LOCATION_CONDUCTINGEQUIPMENT_TIEFLOW_METERASSET:
			return isAppropriate_FWD((Match) arguments.get(0), (MeterAssetMMXUPair) arguments.get(1),
					(Terminal) arguments.get(2), (Location) arguments.get(3), (ConductingEquipment) arguments.get(4),
					(gluemodel.CIM.IEC61970.ControlArea.TieFlow) arguments.get(5), (MeterAsset) arguments.get(6));
		case RulesPackage.TIE_FLOW___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TIE_FLOW___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.TIE_FLOW___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_METERASSETMMXUPAIR_TERMINAL_LOCATION_CONDUCTINGEQUIPMENT_TIEFLOW_METERASSET:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MeterAssetMMXUPair) arguments.get(1),
					(Terminal) arguments.get(2), (Location) arguments.get(3), (ConductingEquipment) arguments.get(4),
					(gluemodel.CIM.IEC61970.ControlArea.TieFlow) arguments.get(5), (MeterAsset) arguments.get(6));
			return null;
		case RulesPackage.TIE_FLOW___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_METERASSETMMXUPAIR_TERMINAL_LOCATION_CONDUCTINGEQUIPMENT_TIEFLOW_METERASSET:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MeterAssetMMXUPair) arguments.get(1),
					(Terminal) arguments.get(2), (Location) arguments.get(3), (ConductingEquipment) arguments.get(4),
					(gluemodel.CIM.IEC61970.ControlArea.TieFlow) arguments.get(5), (MeterAsset) arguments.get(6));
		case RulesPackage.TIE_FLOW___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TIE_FLOW___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_METERASSETMMXUPAIR_TERMINAL_LOCATION_CONDUCTINGEQUIPMENT_TIEFLOW_TERMINALTOTERMINAL_METERASSET_TERMINAL:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(MeterAssetMMXUPair) arguments.get(1), (Terminal) arguments.get(2), (Location) arguments.get(3),
					(ConductingEquipment) arguments.get(4),
					(gluemodel.CIM.IEC61970.ControlArea.TieFlow) arguments.get(5),
					(TerminalToTerminal) arguments.get(6), (MeterAsset) arguments.get(7),
					(outagePreventionJointarget.Terminal) arguments.get(8));
		case RulesPackage.TIE_FLOW___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TIE_FLOW___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.TIE_FLOW___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.TIE_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_37__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_37((EMoflonEdge) arguments.get(0));
		case RulesPackage.TIE_FLOW___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.TIE_FLOW___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.TIE_FLOW___CHECK_DEC_FWD__METERASSETMMXUPAIR_TERMINAL_LOCATION_CONDUCTINGEQUIPMENT_TIEFLOW_METERASSET:
			return checkDEC_FWD((MeterAssetMMXUPair) arguments.get(0), (Terminal) arguments.get(1),
					(Location) arguments.get(2), (ConductingEquipment) arguments.get(3),
					(gluemodel.CIM.IEC61970.ControlArea.TieFlow) arguments.get(4), (MeterAsset) arguments.get(5));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_TieFlow_0_1_initialbindings_blackBBBBBBBB(TieFlow _this, Match match,
			MeterAssetMMXUPair pair, Terminal srcTerminal, Location srcLocation, ConductingEquipment srcResource,
			gluemodel.CIM.IEC61970.ControlArea.TieFlow srcFlow, MeterAsset meter) {
		return new Object[] { _this, match, pair, srcTerminal, srcLocation, srcResource, srcFlow, meter };
	}

	public static final Object[] pattern_TieFlow_0_2_SolveCSP_bindingFBBBBBBBB(TieFlow _this, Match match,
			MeterAssetMMXUPair pair, Terminal srcTerminal, Location srcLocation, ConductingEquipment srcResource,
			gluemodel.CIM.IEC61970.ControlArea.TieFlow srcFlow, MeterAsset meter) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, pair, srcTerminal, srcLocation, srcResource,
				srcFlow, meter);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, pair, srcTerminal, srcLocation, srcResource, srcFlow, meter };
		}
		return null;
	}

	public static final Object[] pattern_TieFlow_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TieFlow_0_2_SolveCSP_bindingAndBlackFBBBBBBBB(TieFlow _this, Match match,
			MeterAssetMMXUPair pair, Terminal srcTerminal, Location srcLocation, ConductingEquipment srcResource,
			gluemodel.CIM.IEC61970.ControlArea.TieFlow srcFlow, MeterAsset meter) {
		Object[] result_pattern_TieFlow_0_2_SolveCSP_binding = pattern_TieFlow_0_2_SolveCSP_bindingFBBBBBBBB(_this,
				match, pair, srcTerminal, srcLocation, srcResource, srcFlow, meter);
		if (result_pattern_TieFlow_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TieFlow_0_2_SolveCSP_binding[0];

			Object[] result_pattern_TieFlow_0_2_SolveCSP_black = pattern_TieFlow_0_2_SolveCSP_blackB(csp);
			if (result_pattern_TieFlow_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, pair, srcTerminal, srcLocation, srcResource, srcFlow, meter };
			}
		}
		return null;
	}

	public static final boolean pattern_TieFlow_0_3_CheckCSP_expressionFBB(TieFlow _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TieFlow_0_4_collectelementstobetranslated_blackBBBBBBB(Match match,
			MeterAssetMMXUPair pair, Terminal srcTerminal, Location srcLocation, ConductingEquipment srcResource,
			gluemodel.CIM.IEC61970.ControlArea.TieFlow srcFlow, MeterAsset meter) {
		return new Object[] { match, pair, srcTerminal, srcLocation, srcResource, srcFlow, meter };
	}

	public static final Object[] pattern_TieFlow_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			Terminal srcTerminal, gluemodel.CIM.IEC61970.ControlArea.TieFlow srcFlow) {
		EMoflonEdge srcTerminal__srcFlow____TieFlow = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcFlow__srcTerminal____Terminal = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(srcFlow);
		String srcTerminal__srcFlow____TieFlow_name_prime = "TieFlow";
		String srcFlow__srcTerminal____Terminal_name_prime = "Terminal";
		srcTerminal__srcFlow____TieFlow.setSrc(srcTerminal);
		srcTerminal__srcFlow____TieFlow.setTrg(srcFlow);
		match.getToBeTranslatedEdges().add(srcTerminal__srcFlow____TieFlow);
		srcFlow__srcTerminal____Terminal.setSrc(srcFlow);
		srcFlow__srcTerminal____Terminal.setTrg(srcTerminal);
		match.getToBeTranslatedEdges().add(srcFlow__srcTerminal____Terminal);
		srcTerminal__srcFlow____TieFlow.setName(srcTerminal__srcFlow____TieFlow_name_prime);
		srcFlow__srcTerminal____Terminal.setName(srcFlow__srcTerminal____Terminal_name_prime);
		return new Object[] { match, srcTerminal, srcFlow, srcTerminal__srcFlow____TieFlow,
				srcFlow__srcTerminal____Terminal };
	}

	public static final Object[] pattern_TieFlow_0_5_collectcontextelements_blackBBBBBBB(Match match,
			MeterAssetMMXUPair pair, Terminal srcTerminal, Location srcLocation, ConductingEquipment srcResource,
			gluemodel.CIM.IEC61970.ControlArea.TieFlow srcFlow, MeterAsset meter) {
		return new Object[] { match, pair, srcTerminal, srcLocation, srcResource, srcFlow, meter };
	}

	public static final Object[] pattern_TieFlow_0_5_collectcontextelements_greenBBBBBBFFFFFFF(Match match,
			MeterAssetMMXUPair pair, Terminal srcTerminal, Location srcLocation, ConductingEquipment srcResource,
			MeterAsset meter) {
		EMoflonEdge srcLocation__srcResource____PowerSystemResources = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcResource__srcLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__meter____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge meter__srcLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocation__meter____Assets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcResource__srcTerminal____Terminals = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcTerminal__srcResource____ConductingEquipment = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(pair);
		match.getContextNodes().add(srcTerminal);
		match.getContextNodes().add(srcLocation);
		match.getContextNodes().add(srcResource);
		match.getContextNodes().add(meter);
		String srcLocation__srcResource____PowerSystemResources_name_prime = "PowerSystemResources";
		String srcResource__srcLocation____Location_name_prime = "Location";
		String pair__meter____a_name_prime = "a";
		String meter__srcLocation____Location_name_prime = "Location";
		String srcLocation__meter____Assets_name_prime = "Assets";
		String srcResource__srcTerminal____Terminals_name_prime = "Terminals";
		String srcTerminal__srcResource____ConductingEquipment_name_prime = "ConductingEquipment";
		srcLocation__srcResource____PowerSystemResources.setSrc(srcLocation);
		srcLocation__srcResource____PowerSystemResources.setTrg(srcResource);
		match.getContextEdges().add(srcLocation__srcResource____PowerSystemResources);
		srcResource__srcLocation____Location.setSrc(srcResource);
		srcResource__srcLocation____Location.setTrg(srcLocation);
		match.getContextEdges().add(srcResource__srcLocation____Location);
		pair__meter____a.setSrc(pair);
		pair__meter____a.setTrg(meter);
		match.getContextEdges().add(pair__meter____a);
		meter__srcLocation____Location.setSrc(meter);
		meter__srcLocation____Location.setTrg(srcLocation);
		match.getContextEdges().add(meter__srcLocation____Location);
		srcLocation__meter____Assets.setSrc(srcLocation);
		srcLocation__meter____Assets.setTrg(meter);
		match.getContextEdges().add(srcLocation__meter____Assets);
		srcResource__srcTerminal____Terminals.setSrc(srcResource);
		srcResource__srcTerminal____Terminals.setTrg(srcTerminal);
		match.getContextEdges().add(srcResource__srcTerminal____Terminals);
		srcTerminal__srcResource____ConductingEquipment.setSrc(srcTerminal);
		srcTerminal__srcResource____ConductingEquipment.setTrg(srcResource);
		match.getContextEdges().add(srcTerminal__srcResource____ConductingEquipment);
		srcLocation__srcResource____PowerSystemResources
				.setName(srcLocation__srcResource____PowerSystemResources_name_prime);
		srcResource__srcLocation____Location.setName(srcResource__srcLocation____Location_name_prime);
		pair__meter____a.setName(pair__meter____a_name_prime);
		meter__srcLocation____Location.setName(meter__srcLocation____Location_name_prime);
		srcLocation__meter____Assets.setName(srcLocation__meter____Assets_name_prime);
		srcResource__srcTerminal____Terminals.setName(srcResource__srcTerminal____Terminals_name_prime);
		srcTerminal__srcResource____ConductingEquipment
				.setName(srcTerminal__srcResource____ConductingEquipment_name_prime);
		return new Object[] { match, pair, srcTerminal, srcLocation, srcResource, meter,
				srcLocation__srcResource____PowerSystemResources, srcResource__srcLocation____Location,
				pair__meter____a, meter__srcLocation____Location, srcLocation__meter____Assets,
				srcResource__srcTerminal____Terminals, srcTerminal__srcResource____ConductingEquipment };
	}

	public static final void pattern_TieFlow_0_6_registerobjectstomatch_expressionBBBBBBBB(TieFlow _this, Match match,
			MeterAssetMMXUPair pair, Terminal srcTerminal, Location srcLocation, ConductingEquipment srcResource,
			gluemodel.CIM.IEC61970.ControlArea.TieFlow srcFlow, MeterAsset meter) {
		_this.registerObjectsToMatch_FWD(match, pair, srcTerminal, srcLocation, srcResource, srcFlow, meter);

	}

	public static final boolean pattern_TieFlow_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TieFlow_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TieFlow_1_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("pair");
		EObject _localVariable_1 = isApplicableMatch.getObject("srcTerminal");
		EObject _localVariable_2 = isApplicableMatch.getObject("srcLocation");
		EObject _localVariable_3 = isApplicableMatch.getObject("srcResource");
		EObject _localVariable_4 = isApplicableMatch.getObject("srcFlow");
		EObject _localVariable_5 = isApplicableMatch.getObject("terminalToTerminal");
		EObject _localVariable_6 = isApplicableMatch.getObject("meter");
		EObject _localVariable_7 = isApplicableMatch.getObject("trgTerminal");
		EObject tmpPair = _localVariable_0;
		EObject tmpSrcTerminal = _localVariable_1;
		EObject tmpSrcLocation = _localVariable_2;
		EObject tmpSrcResource = _localVariable_3;
		EObject tmpSrcFlow = _localVariable_4;
		EObject tmpTerminalToTerminal = _localVariable_5;
		EObject tmpMeter = _localVariable_6;
		EObject tmpTrgTerminal = _localVariable_7;
		if (tmpPair instanceof MeterAssetMMXUPair) {
			MeterAssetMMXUPair pair = (MeterAssetMMXUPair) tmpPair;
			if (tmpSrcTerminal instanceof Terminal) {
				Terminal srcTerminal = (Terminal) tmpSrcTerminal;
				if (tmpSrcLocation instanceof Location) {
					Location srcLocation = (Location) tmpSrcLocation;
					if (tmpSrcResource instanceof ConductingEquipment) {
						ConductingEquipment srcResource = (ConductingEquipment) tmpSrcResource;
						if (tmpSrcFlow instanceof gluemodel.CIM.IEC61970.ControlArea.TieFlow) {
							gluemodel.CIM.IEC61970.ControlArea.TieFlow srcFlow = (gluemodel.CIM.IEC61970.ControlArea.TieFlow) tmpSrcFlow;
							if (tmpTerminalToTerminal instanceof TerminalToTerminal) {
								TerminalToTerminal terminalToTerminal = (TerminalToTerminal) tmpTerminalToTerminal;
								if (tmpMeter instanceof MeterAsset) {
									MeterAsset meter = (MeterAsset) tmpMeter;
									if (tmpTrgTerminal instanceof outagePreventionJointarget.Terminal) {
										outagePreventionJointarget.Terminal trgTerminal = (outagePreventionJointarget.Terminal) tmpTrgTerminal;
										return new Object[] { pair, srcTerminal, srcLocation, srcResource, srcFlow,
												terminalToTerminal, meter, trgTerminal, isApplicableMatch };
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

	public static final Object[] pattern_TieFlow_1_1_performtransformation_blackBBBBBBBBFBB(MeterAssetMMXUPair pair,
			Terminal srcTerminal, Location srcLocation, ConductingEquipment srcResource,
			gluemodel.CIM.IEC61970.ControlArea.TieFlow srcFlow, TerminalToTerminal terminalToTerminal, MeterAsset meter,
			outagePreventionJointarget.Terminal trgTerminal, TieFlow _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { pair, srcTerminal, srcLocation, srcResource, srcFlow, terminalToTerminal, meter,
						trgTerminal, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TieFlow_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(TieFlow _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TieFlow_1_1_performtransformation_binding = pattern_TieFlow_1_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_TieFlow_1_1_performtransformation_binding != null) {
			MeterAssetMMXUPair pair = (MeterAssetMMXUPair) result_pattern_TieFlow_1_1_performtransformation_binding[0];
			Terminal srcTerminal = (Terminal) result_pattern_TieFlow_1_1_performtransformation_binding[1];
			Location srcLocation = (Location) result_pattern_TieFlow_1_1_performtransformation_binding[2];
			ConductingEquipment srcResource = (ConductingEquipment) result_pattern_TieFlow_1_1_performtransformation_binding[3];
			gluemodel.CIM.IEC61970.ControlArea.TieFlow srcFlow = (gluemodel.CIM.IEC61970.ControlArea.TieFlow) result_pattern_TieFlow_1_1_performtransformation_binding[4];
			TerminalToTerminal terminalToTerminal = (TerminalToTerminal) result_pattern_TieFlow_1_1_performtransformation_binding[5];
			MeterAsset meter = (MeterAsset) result_pattern_TieFlow_1_1_performtransformation_binding[6];
			outagePreventionJointarget.Terminal trgTerminal = (outagePreventionJointarget.Terminal) result_pattern_TieFlow_1_1_performtransformation_binding[7];

			Object[] result_pattern_TieFlow_1_1_performtransformation_black = pattern_TieFlow_1_1_performtransformation_blackBBBBBBBBFBB(
					pair, srcTerminal, srcLocation, srcResource, srcFlow, terminalToTerminal, meter, trgTerminal, _this,
					isApplicableMatch);
			if (result_pattern_TieFlow_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TieFlow_1_1_performtransformation_black[8];

				return new Object[] { pair, srcTerminal, srcLocation, srcResource, srcFlow, terminalToTerminal, meter,
						trgTerminal, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TieFlow_1_1_performtransformation_greenFBFB(
			gluemodel.CIM.IEC61970.ControlArea.TieFlow srcFlow, outagePreventionJointarget.Terminal trgTerminal) {
		outagePreventionJointarget.TieFlow trgFlow = OutagePreventionJointargetFactory.eINSTANCE.createTieFlow();
		TieFlowToTieFlow flowToFlow = Task2Factory.eINSTANCE.createTieFlowToTieFlow();
		trgTerminal.getTieFlow().add(trgFlow);
		flowToFlow.setSource(srcFlow);
		flowToFlow.setTarget(trgFlow);
		return new Object[] { trgFlow, srcFlow, flowToFlow, trgTerminal };
	}

	public static final Object[] pattern_TieFlow_1_2_collecttranslatedelements_blackBBB(
			outagePreventionJointarget.TieFlow trgFlow, gluemodel.CIM.IEC61970.ControlArea.TieFlow srcFlow,
			TieFlowToTieFlow flowToFlow) {
		return new Object[] { trgFlow, srcFlow, flowToFlow };
	}

	public static final Object[] pattern_TieFlow_1_2_collecttranslatedelements_greenFBBB(
			outagePreventionJointarget.TieFlow trgFlow, gluemodel.CIM.IEC61970.ControlArea.TieFlow srcFlow,
			TieFlowToTieFlow flowToFlow) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(trgFlow);
		ruleresult.getTranslatedElements().add(srcFlow);
		ruleresult.getCreatedLinkElements().add(flowToFlow);
		return new Object[] { ruleresult, trgFlow, srcFlow, flowToFlow };
	}

	public static final Object[] pattern_TieFlow_1_3_bookkeepingforedges_blackBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject trgFlow, EObject pair, EObject srcTerminal, EObject srcLocation, EObject srcResource,
			EObject srcFlow, EObject flowToFlow, EObject terminalToTerminal, EObject meter, EObject trgTerminal) {
		if (!trgFlow.equals(trgTerminal)) {
			if (!pair.equals(trgFlow)) {
				if (!pair.equals(srcTerminal)) {
					if (!pair.equals(srcLocation)) {
						if (!pair.equals(srcResource)) {
							if (!pair.equals(srcFlow)) {
								if (!pair.equals(terminalToTerminal)) {
									if (!pair.equals(trgTerminal)) {
										if (!srcTerminal.equals(trgFlow)) {
											if (!srcTerminal.equals(terminalToTerminal)) {
												if (!srcTerminal.equals(trgTerminal)) {
													if (!srcLocation.equals(trgFlow)) {
														if (!srcLocation.equals(srcTerminal)) {
															if (!srcLocation.equals(srcResource)) {
																if (!srcLocation.equals(terminalToTerminal)) {
																	if (!srcLocation.equals(trgTerminal)) {
																		if (!srcResource.equals(trgFlow)) {
																			if (!srcResource.equals(srcTerminal)) {
																				if (!srcResource
																						.equals(terminalToTerminal)) {
																					if (!srcResource
																							.equals(trgTerminal)) {
																						if (!srcFlow.equals(trgFlow)) {
																							if (!srcFlow.equals(
																									srcTerminal)) {
																								if (!srcFlow.equals(
																										srcLocation)) {
																									if (!srcFlow.equals(
																											srcResource)) {
																										if (!srcFlow
																												.equals(terminalToTerminal)) {
																											if (!srcFlow
																													.equals(trgTerminal)) {
																												if (!flowToFlow
																														.equals(trgFlow)) {
																													if (!flowToFlow
																															.equals(pair)) {
																														if (!flowToFlow
																																.equals(srcTerminal)) {
																															if (!flowToFlow
																																	.equals(srcLocation)) {
																																if (!flowToFlow
																																		.equals(srcResource)) {
																																	if (!flowToFlow
																																			.equals(srcFlow)) {
																																		if (!flowToFlow
																																				.equals(terminalToTerminal)) {
																																			if (!flowToFlow
																																					.equals(meter)) {
																																				if (!flowToFlow
																																						.equals(trgTerminal)) {
																																					if (!terminalToTerminal
																																							.equals(trgFlow)) {
																																						if (!terminalToTerminal
																																								.equals(trgTerminal)) {
																																							if (!meter
																																									.equals(trgFlow)) {
																																								if (!meter
																																										.equals(pair)) {
																																									if (!meter
																																											.equals(srcTerminal)) {
																																										if (!meter
																																												.equals(srcLocation)) {
																																											if (!meter
																																													.equals(srcResource)) {
																																												if (!meter
																																														.equals(srcFlow)) {
																																													if (!meter
																																															.equals(terminalToTerminal)) {
																																														if (!meter
																																																.equals(trgTerminal)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	trgFlow,
																																																	pair,
																																																	srcTerminal,
																																																	srcLocation,
																																																	srcResource,
																																																	srcFlow,
																																																	flowToFlow,
																																																	terminalToTerminal,
																																																	meter,
																																																	trgTerminal };
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

	public static final Object[] pattern_TieFlow_1_3_bookkeepingforedges_greenBBBBBBFFFFF(PerformRuleResult ruleresult,
			EObject trgFlow, EObject srcTerminal, EObject srcFlow, EObject flowToFlow, EObject trgTerminal) {
		EMoflonEdge srcTerminal__srcFlow____TieFlow = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcFlow__srcTerminal____Terminal = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flowToFlow__srcFlow____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flowToFlow__trgFlow____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgTerminal__trgFlow____TieFlow = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TieFlow";
		String srcTerminal__srcFlow____TieFlow_name_prime = "TieFlow";
		String srcFlow__srcTerminal____Terminal_name_prime = "Terminal";
		String flowToFlow__srcFlow____source_name_prime = "source";
		String flowToFlow__trgFlow____target_name_prime = "target";
		String trgTerminal__trgFlow____TieFlow_name_prime = "TieFlow";
		srcTerminal__srcFlow____TieFlow.setSrc(srcTerminal);
		srcTerminal__srcFlow____TieFlow.setTrg(srcFlow);
		ruleresult.getTranslatedEdges().add(srcTerminal__srcFlow____TieFlow);
		srcFlow__srcTerminal____Terminal.setSrc(srcFlow);
		srcFlow__srcTerminal____Terminal.setTrg(srcTerminal);
		ruleresult.getTranslatedEdges().add(srcFlow__srcTerminal____Terminal);
		flowToFlow__srcFlow____source.setSrc(flowToFlow);
		flowToFlow__srcFlow____source.setTrg(srcFlow);
		ruleresult.getCreatedEdges().add(flowToFlow__srcFlow____source);
		flowToFlow__trgFlow____target.setSrc(flowToFlow);
		flowToFlow__trgFlow____target.setTrg(trgFlow);
		ruleresult.getCreatedEdges().add(flowToFlow__trgFlow____target);
		trgTerminal__trgFlow____TieFlow.setSrc(trgTerminal);
		trgTerminal__trgFlow____TieFlow.setTrg(trgFlow);
		ruleresult.getCreatedEdges().add(trgTerminal__trgFlow____TieFlow);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		srcTerminal__srcFlow____TieFlow.setName(srcTerminal__srcFlow____TieFlow_name_prime);
		srcFlow__srcTerminal____Terminal.setName(srcFlow__srcTerminal____Terminal_name_prime);
		flowToFlow__srcFlow____source.setName(flowToFlow__srcFlow____source_name_prime);
		flowToFlow__trgFlow____target.setName(flowToFlow__trgFlow____target_name_prime);
		trgTerminal__trgFlow____TieFlow.setName(trgTerminal__trgFlow____TieFlow_name_prime);
		return new Object[] { ruleresult, trgFlow, srcTerminal, srcFlow, flowToFlow, trgTerminal,
				srcTerminal__srcFlow____TieFlow, srcFlow__srcTerminal____Terminal, flowToFlow__srcFlow____source,
				flowToFlow__trgFlow____target, trgTerminal__trgFlow____TieFlow };
	}

	public static final void pattern_TieFlow_1_5_registerobjects_expressionBBBBBBBBBBBB(TieFlow _this,
			PerformRuleResult ruleresult, EObject trgFlow, EObject pair, EObject srcTerminal, EObject srcLocation,
			EObject srcResource, EObject srcFlow, EObject flowToFlow, EObject terminalToTerminal, EObject meter,
			EObject trgTerminal) {
		_this.registerObjects_FWD(ruleresult, trgFlow, pair, srcTerminal, srcLocation, srcResource, srcFlow, flowToFlow,
				terminalToTerminal, meter, trgTerminal);

	}

	public static final PerformRuleResult pattern_TieFlow_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TieFlow_2_1_preparereturnvalue_bindingFB(TieFlow _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TieFlow_2_1_preparereturnvalue_blackFBB(EClass eClass, TieFlow _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TieFlow_2_1_preparereturnvalue_bindingAndBlackFFB(TieFlow _this) {
		Object[] result_pattern_TieFlow_2_1_preparereturnvalue_binding = pattern_TieFlow_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TieFlow_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_TieFlow_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TieFlow_2_1_preparereturnvalue_black = pattern_TieFlow_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_TieFlow_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_TieFlow_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TieFlow_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "TieFlow";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_TieFlow_2_2_corematch_bindingFFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("pair");
		EObject _localVariable_1 = match.getObject("srcTerminal");
		EObject _localVariable_2 = match.getObject("srcLocation");
		EObject _localVariable_3 = match.getObject("srcResource");
		EObject _localVariable_4 = match.getObject("srcFlow");
		EObject _localVariable_5 = match.getObject("meter");
		EObject tmpPair = _localVariable_0;
		EObject tmpSrcTerminal = _localVariable_1;
		EObject tmpSrcLocation = _localVariable_2;
		EObject tmpSrcResource = _localVariable_3;
		EObject tmpSrcFlow = _localVariable_4;
		EObject tmpMeter = _localVariable_5;
		if (tmpPair instanceof MeterAssetMMXUPair) {
			MeterAssetMMXUPair pair = (MeterAssetMMXUPair) tmpPair;
			if (tmpSrcTerminal instanceof Terminal) {
				Terminal srcTerminal = (Terminal) tmpSrcTerminal;
				if (tmpSrcLocation instanceof Location) {
					Location srcLocation = (Location) tmpSrcLocation;
					if (tmpSrcResource instanceof ConductingEquipment) {
						ConductingEquipment srcResource = (ConductingEquipment) tmpSrcResource;
						if (tmpSrcFlow instanceof gluemodel.CIM.IEC61970.ControlArea.TieFlow) {
							gluemodel.CIM.IEC61970.ControlArea.TieFlow srcFlow = (gluemodel.CIM.IEC61970.ControlArea.TieFlow) tmpSrcFlow;
							if (tmpMeter instanceof MeterAsset) {
								MeterAsset meter = (MeterAsset) tmpMeter;
								return new Object[] { pair, srcTerminal, srcLocation, srcResource, srcFlow, meter,
										match };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TieFlow_2_2_corematch_blackBBBBBFBFB(MeterAssetMMXUPair pair,
			Terminal srcTerminal, Location srcLocation, ConductingEquipment srcResource,
			gluemodel.CIM.IEC61970.ControlArea.TieFlow srcFlow, MeterAsset meter, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TerminalToTerminal terminalToTerminal : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(srcTerminal, TerminalToTerminal.class, "source")) {
			outagePreventionJointarget.Terminal trgTerminal = terminalToTerminal.getTarget();
			if (trgTerminal != null) {
				_result.add(new Object[] { pair, srcTerminal, srcLocation, srcResource, srcFlow, terminalToTerminal,
						meter, trgTerminal, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_TieFlow_2_3_findcontext_blackBBBBBBBB(MeterAssetMMXUPair pair,
			Terminal srcTerminal, Location srcLocation, ConductingEquipment srcResource,
			gluemodel.CIM.IEC61970.ControlArea.TieFlow srcFlow, TerminalToTerminal terminalToTerminal, MeterAsset meter,
			outagePreventionJointarget.Terminal trgTerminal) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (srcTerminal.getTieFlow().contains(srcFlow)) {
			if (srcLocation.getPowerSystemResources().contains(srcResource)) {
				if (meter.equals(pair.getA())) {
					if (srcTerminal.equals(terminalToTerminal.getSource())) {
						if (srcLocation.equals(meter.getLocation())) {
							if (srcResource.getTerminals().contains(srcTerminal)) {
								if (trgTerminal.equals(terminalToTerminal.getTarget())) {
									_result.add(new Object[] { pair, srcTerminal, srcLocation, srcResource, srcFlow,
											terminalToTerminal, meter, trgTerminal });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TieFlow_2_3_findcontext_greenBBBBBBBBFFFFFFFFFFFF(MeterAssetMMXUPair pair,
			Terminal srcTerminal, Location srcLocation, ConductingEquipment srcResource,
			gluemodel.CIM.IEC61970.ControlArea.TieFlow srcFlow, TerminalToTerminal terminalToTerminal, MeterAsset meter,
			outagePreventionJointarget.Terminal trgTerminal) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge srcTerminal__srcFlow____TieFlow = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcFlow__srcTerminal____Terminal = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocation__srcResource____PowerSystemResources = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcResource__srcLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__meter____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge terminalToTerminal__srcTerminal____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge meter__srcLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocation__meter____Assets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcResource__srcTerminal____Terminals = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcTerminal__srcResource____ConductingEquipment = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge terminalToTerminal__trgTerminal____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String srcTerminal__srcFlow____TieFlow_name_prime = "TieFlow";
		String srcFlow__srcTerminal____Terminal_name_prime = "Terminal";
		String srcLocation__srcResource____PowerSystemResources_name_prime = "PowerSystemResources";
		String srcResource__srcLocation____Location_name_prime = "Location";
		String pair__meter____a_name_prime = "a";
		String terminalToTerminal__srcTerminal____source_name_prime = "source";
		String meter__srcLocation____Location_name_prime = "Location";
		String srcLocation__meter____Assets_name_prime = "Assets";
		String srcResource__srcTerminal____Terminals_name_prime = "Terminals";
		String srcTerminal__srcResource____ConductingEquipment_name_prime = "ConductingEquipment";
		String terminalToTerminal__trgTerminal____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(pair);
		isApplicableMatch.getAllContextElements().add(srcTerminal);
		isApplicableMatch.getAllContextElements().add(srcLocation);
		isApplicableMatch.getAllContextElements().add(srcResource);
		isApplicableMatch.getAllContextElements().add(srcFlow);
		isApplicableMatch.getAllContextElements().add(terminalToTerminal);
		isApplicableMatch.getAllContextElements().add(meter);
		isApplicableMatch.getAllContextElements().add(trgTerminal);
		srcTerminal__srcFlow____TieFlow.setSrc(srcTerminal);
		srcTerminal__srcFlow____TieFlow.setTrg(srcFlow);
		isApplicableMatch.getAllContextElements().add(srcTerminal__srcFlow____TieFlow);
		srcFlow__srcTerminal____Terminal.setSrc(srcFlow);
		srcFlow__srcTerminal____Terminal.setTrg(srcTerminal);
		isApplicableMatch.getAllContextElements().add(srcFlow__srcTerminal____Terminal);
		srcLocation__srcResource____PowerSystemResources.setSrc(srcLocation);
		srcLocation__srcResource____PowerSystemResources.setTrg(srcResource);
		isApplicableMatch.getAllContextElements().add(srcLocation__srcResource____PowerSystemResources);
		srcResource__srcLocation____Location.setSrc(srcResource);
		srcResource__srcLocation____Location.setTrg(srcLocation);
		isApplicableMatch.getAllContextElements().add(srcResource__srcLocation____Location);
		pair__meter____a.setSrc(pair);
		pair__meter____a.setTrg(meter);
		isApplicableMatch.getAllContextElements().add(pair__meter____a);
		terminalToTerminal__srcTerminal____source.setSrc(terminalToTerminal);
		terminalToTerminal__srcTerminal____source.setTrg(srcTerminal);
		isApplicableMatch.getAllContextElements().add(terminalToTerminal__srcTerminal____source);
		meter__srcLocation____Location.setSrc(meter);
		meter__srcLocation____Location.setTrg(srcLocation);
		isApplicableMatch.getAllContextElements().add(meter__srcLocation____Location);
		srcLocation__meter____Assets.setSrc(srcLocation);
		srcLocation__meter____Assets.setTrg(meter);
		isApplicableMatch.getAllContextElements().add(srcLocation__meter____Assets);
		srcResource__srcTerminal____Terminals.setSrc(srcResource);
		srcResource__srcTerminal____Terminals.setTrg(srcTerminal);
		isApplicableMatch.getAllContextElements().add(srcResource__srcTerminal____Terminals);
		srcTerminal__srcResource____ConductingEquipment.setSrc(srcTerminal);
		srcTerminal__srcResource____ConductingEquipment.setTrg(srcResource);
		isApplicableMatch.getAllContextElements().add(srcTerminal__srcResource____ConductingEquipment);
		terminalToTerminal__trgTerminal____target.setSrc(terminalToTerminal);
		terminalToTerminal__trgTerminal____target.setTrg(trgTerminal);
		isApplicableMatch.getAllContextElements().add(terminalToTerminal__trgTerminal____target);
		srcTerminal__srcFlow____TieFlow.setName(srcTerminal__srcFlow____TieFlow_name_prime);
		srcFlow__srcTerminal____Terminal.setName(srcFlow__srcTerminal____Terminal_name_prime);
		srcLocation__srcResource____PowerSystemResources
				.setName(srcLocation__srcResource____PowerSystemResources_name_prime);
		srcResource__srcLocation____Location.setName(srcResource__srcLocation____Location_name_prime);
		pair__meter____a.setName(pair__meter____a_name_prime);
		terminalToTerminal__srcTerminal____source.setName(terminalToTerminal__srcTerminal____source_name_prime);
		meter__srcLocation____Location.setName(meter__srcLocation____Location_name_prime);
		srcLocation__meter____Assets.setName(srcLocation__meter____Assets_name_prime);
		srcResource__srcTerminal____Terminals.setName(srcResource__srcTerminal____Terminals_name_prime);
		srcTerminal__srcResource____ConductingEquipment
				.setName(srcTerminal__srcResource____ConductingEquipment_name_prime);
		terminalToTerminal__trgTerminal____target.setName(terminalToTerminal__trgTerminal____target_name_prime);
		return new Object[] { pair, srcTerminal, srcLocation, srcResource, srcFlow, terminalToTerminal, meter,
				trgTerminal, isApplicableMatch, srcTerminal__srcFlow____TieFlow, srcFlow__srcTerminal____Terminal,
				srcLocation__srcResource____PowerSystemResources, srcResource__srcLocation____Location,
				pair__meter____a, terminalToTerminal__srcTerminal____source, meter__srcLocation____Location,
				srcLocation__meter____Assets, srcResource__srcTerminal____Terminals,
				srcTerminal__srcResource____ConductingEquipment, terminalToTerminal__trgTerminal____target };
	}

	public static final Object[] pattern_TieFlow_2_4_solveCSP_bindingFBBBBBBBBBB(TieFlow _this,
			IsApplicableMatch isApplicableMatch, MeterAssetMMXUPair pair, Terminal srcTerminal, Location srcLocation,
			ConductingEquipment srcResource, gluemodel.CIM.IEC61970.ControlArea.TieFlow srcFlow,
			TerminalToTerminal terminalToTerminal, MeterAsset meter, outagePreventionJointarget.Terminal trgTerminal) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, pair, srcTerminal, srcLocation,
				srcResource, srcFlow, terminalToTerminal, meter, trgTerminal);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, pair, srcTerminal, srcLocation, srcResource, srcFlow,
					terminalToTerminal, meter, trgTerminal };
		}
		return null;
	}

	public static final Object[] pattern_TieFlow_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TieFlow_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(TieFlow _this,
			IsApplicableMatch isApplicableMatch, MeterAssetMMXUPair pair, Terminal srcTerminal, Location srcLocation,
			ConductingEquipment srcResource, gluemodel.CIM.IEC61970.ControlArea.TieFlow srcFlow,
			TerminalToTerminal terminalToTerminal, MeterAsset meter, outagePreventionJointarget.Terminal trgTerminal) {
		Object[] result_pattern_TieFlow_2_4_solveCSP_binding = pattern_TieFlow_2_4_solveCSP_bindingFBBBBBBBBBB(_this,
				isApplicableMatch, pair, srcTerminal, srcLocation, srcResource, srcFlow, terminalToTerminal, meter,
				trgTerminal);
		if (result_pattern_TieFlow_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TieFlow_2_4_solveCSP_binding[0];

			Object[] result_pattern_TieFlow_2_4_solveCSP_black = pattern_TieFlow_2_4_solveCSP_blackB(csp);
			if (result_pattern_TieFlow_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, pair, srcTerminal, srcLocation, srcResource,
						srcFlow, terminalToTerminal, meter, trgTerminal };
			}
		}
		return null;
	}

	public static final boolean pattern_TieFlow_2_5_checkCSP_expressionFBB(TieFlow _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TieFlow_2_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_TieFlow_2_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "TieFlow";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_TieFlow_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TieFlow_10_1_preparereturnvalue_bindingFB(TieFlow _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TieFlow_10_1_preparereturnvalue_blackFBBF(EClass __eClass, TieFlow _this) {
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

	public static final Object[] pattern_TieFlow_10_1_preparereturnvalue_bindingAndBlackFFBF(TieFlow _this) {
		Object[] result_pattern_TieFlow_10_1_preparereturnvalue_binding = pattern_TieFlow_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TieFlow_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_TieFlow_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TieFlow_10_1_preparereturnvalue_black = pattern_TieFlow_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_TieFlow_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TieFlow_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_TieFlow_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_TieFlow_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_TieFlow_10_2_testcorematchandDECs_blackFFFFFFB(
			EMoflonEdge _edge_TieFlow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSrcTerminal = _edge_TieFlow.getSrc();
		if (tmpSrcTerminal instanceof Terminal) {
			Terminal srcTerminal = (Terminal) tmpSrcTerminal;
			EObject tmpSrcFlow = _edge_TieFlow.getTrg();
			if (tmpSrcFlow instanceof gluemodel.CIM.IEC61970.ControlArea.TieFlow) {
				gluemodel.CIM.IEC61970.ControlArea.TieFlow srcFlow = (gluemodel.CIM.IEC61970.ControlArea.TieFlow) tmpSrcFlow;
				if (srcTerminal.getTieFlow().contains(srcFlow)) {
					ConductingEquipment srcResource = srcTerminal.getConductingEquipment();
					if (srcResource != null) {
						Location srcLocation = srcResource.getLocation();
						if (srcLocation != null) {
							for (Asset tmpMeter : srcLocation.getAssets()) {
								if (tmpMeter instanceof MeterAsset) {
									MeterAsset meter = (MeterAsset) tmpMeter;
									for (MeterAssetMMXUPair pair : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(meter, MeterAssetMMXUPair.class, "a")) {
										_result.add(new Object[] { pair, srcTerminal, srcLocation, srcResource, srcFlow,
												meter, _edge_TieFlow });
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

	public static final Object[] pattern_TieFlow_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TieFlow_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBB(
			TieFlow _this, Match match, MeterAssetMMXUPair pair, Terminal srcTerminal, Location srcLocation,
			ConductingEquipment srcResource, gluemodel.CIM.IEC61970.ControlArea.TieFlow srcFlow, MeterAsset meter) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, pair, srcTerminal, srcLocation, srcResource, srcFlow,
				meter);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TieFlow_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			TieFlow _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TieFlow_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_TieFlow_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_TieFlow_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TieFlow_13_1_matchtggpattern_blackBBBBBB(MeterAssetMMXUPair pair,
			Terminal srcTerminal, Location srcLocation, ConductingEquipment srcResource,
			gluemodel.CIM.IEC61970.ControlArea.TieFlow srcFlow, MeterAsset meter) {
		if (srcTerminal.getTieFlow().contains(srcFlow)) {
			if (srcLocation.getPowerSystemResources().contains(srcResource)) {
				if (meter.equals(pair.getA())) {
					if (srcLocation.equals(meter.getLocation())) {
						if (srcResource.getTerminals().contains(srcTerminal)) {
							return new Object[] { pair, srcTerminal, srcLocation, srcResource, srcFlow, meter };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_TieFlow_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TieFlow_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TieFlowImpl
