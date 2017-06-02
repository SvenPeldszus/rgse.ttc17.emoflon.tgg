/**
 */
package rgse.ttc17.emoflon.tgg.task2.Rules.impl;

import gluemodel.CIM.IEC61968.Assets.Asset;

import gluemodel.CIM.IEC61968.Common.Location;

import gluemodel.CIM.IEC61968.Metering.MeterAsset;

import gluemodel.CIM.IEC61970.ControlArea.ControlArea;
import gluemodel.CIM.IEC61970.ControlArea.TieFlow;

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

import rgse.ttc17.emoflon.tgg.task2.ControlAreaToControlSrea;

import rgse.ttc17.emoflon.tgg.task2.Rules.RulesPackage;
import rgse.ttc17.emoflon.tgg.task2.Rules.TieFlowLinkControlArea;

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
 * An implementation of the model object '<em><b>Tie Flow Link Control Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TieFlowLinkControlAreaImpl extends AbstractRuleImpl implements TieFlowLinkControlArea {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TieFlowLinkControlAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getTieFlowLinkControlArea();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MeterAssetMMXUPair pair, Terminal srcTerminal, TieFlow srcTieFlow,
			ConductingEquipment srcResource, MeterAsset meter, Location srcLocation, ControlArea srcControlArea) {
		// initial bindings
		Object[] result1_black = TieFlowLinkControlAreaImpl
				.pattern_TieFlowLinkControlArea_0_1_initialbindings_blackBBBBBBBBB(this, match, pair, srcTerminal,
						srcTieFlow, srcResource, meter, srcLocation, srcControlArea);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[pair] = " + pair + ", "
					+ "[srcTerminal] = " + srcTerminal + ", " + "[srcTieFlow] = " + srcTieFlow + ", "
					+ "[srcResource] = " + srcResource + ", " + "[meter] = " + meter + ", " + "[srcLocation] = "
					+ srcLocation + ", " + "[srcControlArea] = " + srcControlArea + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = TieFlowLinkControlAreaImpl
				.pattern_TieFlowLinkControlArea_0_2_SolveCSP_bindingAndBlackFBBBBBBBBB(this, match, pair, srcTerminal,
						srcTieFlow, srcResource, meter, srcLocation, srcControlArea);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[pair] = " + pair + ", " + "[srcTerminal] = "
					+ srcTerminal + ", " + "[srcTieFlow] = " + srcTieFlow + ", " + "[srcResource] = " + srcResource
					+ ", " + "[meter] = " + meter + ", " + "[srcLocation] = " + srcLocation + ", "
					+ "[srcControlArea] = " + srcControlArea + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (TieFlowLinkControlAreaImpl.pattern_TieFlowLinkControlArea_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = TieFlowLinkControlAreaImpl
					.pattern_TieFlowLinkControlArea_0_4_collectelementstobetranslated_blackBBBBBBBB(match, pair,
							srcTerminal, srcTieFlow, srcResource, meter, srcLocation, srcControlArea);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[pair] = " + pair + ", " + "[srcTerminal] = "
						+ srcTerminal + ", " + "[srcTieFlow] = " + srcTieFlow + ", " + "[srcResource] = " + srcResource
						+ ", " + "[meter] = " + meter + ", " + "[srcLocation] = " + srcLocation + ", "
						+ "[srcControlArea] = " + srcControlArea + ".");
			}
			TieFlowLinkControlAreaImpl.pattern_TieFlowLinkControlArea_0_4_collectelementstobetranslated_greenBBBFF(
					match, srcTieFlow, srcControlArea);
			// EMoflonEdge srcTieFlow__srcControlArea____ControlArea = (EMoflonEdge) result4_green[3];
			// EMoflonEdge srcControlArea__srcTieFlow____TieFlow = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = TieFlowLinkControlAreaImpl
					.pattern_TieFlowLinkControlArea_0_5_collectcontextelements_blackBBBBBBBB(match, pair, srcTerminal,
							srcTieFlow, srcResource, meter, srcLocation, srcControlArea);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[pair] = " + pair + ", " + "[srcTerminal] = "
						+ srcTerminal + ", " + "[srcTieFlow] = " + srcTieFlow + ", " + "[srcResource] = " + srcResource
						+ ", " + "[meter] = " + meter + ", " + "[srcLocation] = " + srcLocation + ", "
						+ "[srcControlArea] = " + srcControlArea + ".");
			}
			TieFlowLinkControlAreaImpl.pattern_TieFlowLinkControlArea_0_5_collectcontextelements_greenBBBBBBBBFFFFFFFFF(
					match, pair, srcTerminal, srcTieFlow, srcResource, meter, srcLocation, srcControlArea);
			// EMoflonEdge srcTerminal__srcTieFlow____TieFlow = (EMoflonEdge) result5_green[8];
			// EMoflonEdge srcTieFlow__srcTerminal____Terminal = (EMoflonEdge) result5_green[9];
			// EMoflonEdge srcResource__srcTerminal____Terminals = (EMoflonEdge) result5_green[10];
			// EMoflonEdge srcTerminal__srcResource____ConductingEquipment = (EMoflonEdge) result5_green[11];
			// EMoflonEdge pair__meter____a = (EMoflonEdge) result5_green[12];
			// EMoflonEdge srcLocation__srcResource____PowerSystemResources = (EMoflonEdge) result5_green[13];
			// EMoflonEdge srcResource__srcLocation____Location = (EMoflonEdge) result5_green[14];
			// EMoflonEdge meter__srcLocation____Location = (EMoflonEdge) result5_green[15];
			// EMoflonEdge srcLocation__meter____Assets = (EMoflonEdge) result5_green[16];

			// register objects to match
			TieFlowLinkControlAreaImpl.pattern_TieFlowLinkControlArea_0_6_registerobjectstomatch_expressionBBBBBBBBB(
					this, match, pair, srcTerminal, srcTieFlow, srcResource, meter, srcLocation, srcControlArea);
			return TieFlowLinkControlAreaImpl.pattern_TieFlowLinkControlArea_0_7_expressionF();
		} else {
			return TieFlowLinkControlAreaImpl.pattern_TieFlowLinkControlArea_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = TieFlowLinkControlAreaImpl
				.pattern_TieFlowLinkControlArea_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		outagePreventionJointarget.TieFlow trgTieFlow = (outagePreventionJointarget.TieFlow) result1_bindingAndBlack[0];
		outagePreventionJointarget.ControlArea trgControlArea = (outagePreventionJointarget.ControlArea) result1_bindingAndBlack[1];
		MeterAssetMMXUPair pair = (MeterAssetMMXUPair) result1_bindingAndBlack[2];
		Terminal srcTerminal = (Terminal) result1_bindingAndBlack[3];
		TieFlowToTieFlow flowToFlow = (TieFlowToTieFlow) result1_bindingAndBlack[4];
		TieFlow srcTieFlow = (TieFlow) result1_bindingAndBlack[5];
		ConductingEquipment srcResource = (ConductingEquipment) result1_bindingAndBlack[6];
		MeterAsset meter = (MeterAsset) result1_bindingAndBlack[7];
		Location srcLocation = (Location) result1_bindingAndBlack[8];
		ControlArea srcControlArea = (ControlArea) result1_bindingAndBlack[9];
		ControlAreaToControlSrea controlAreaToControlArea = (ControlAreaToControlSrea) result1_bindingAndBlack[10];
		// CSP csp = (CSP) result1_bindingAndBlack[11];
		TieFlowLinkControlAreaImpl.pattern_TieFlowLinkControlArea_1_1_performtransformation_greenBB(trgTieFlow,
				trgControlArea);

		// collect translated elements
		Object[] result2_green = TieFlowLinkControlAreaImpl
				.pattern_TieFlowLinkControlArea_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = TieFlowLinkControlAreaImpl
				.pattern_TieFlowLinkControlArea_1_3_bookkeepingforedges_blackBBBBBBBBBBBB(ruleresult, trgTieFlow,
						trgControlArea, pair, srcTerminal, flowToFlow, srcTieFlow, srcResource, meter, srcLocation,
						srcControlArea, controlAreaToControlArea);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[trgTieFlow] = " + trgTieFlow + ", "
					+ "[trgControlArea] = " + trgControlArea + ", " + "[pair] = " + pair + ", " + "[srcTerminal] = "
					+ srcTerminal + ", " + "[flowToFlow] = " + flowToFlow + ", " + "[srcTieFlow] = " + srcTieFlow + ", "
					+ "[srcResource] = " + srcResource + ", " + "[meter] = " + meter + ", " + "[srcLocation] = "
					+ srcLocation + ", " + "[srcControlArea] = " + srcControlArea + ", "
					+ "[controlAreaToControlArea] = " + controlAreaToControlArea + ".");
		}
		TieFlowLinkControlAreaImpl.pattern_TieFlowLinkControlArea_1_3_bookkeepingforedges_greenBBBBBFFF(ruleresult,
				trgTieFlow, trgControlArea, srcTieFlow, srcControlArea);
		// EMoflonEdge trgTieFlow__trgControlArea____ControlArea = (EMoflonEdge) result3_green[5];
		// EMoflonEdge srcTieFlow__srcControlArea____ControlArea = (EMoflonEdge) result3_green[6];
		// EMoflonEdge srcControlArea__srcTieFlow____TieFlow = (EMoflonEdge) result3_green[7];

		// perform postprocessing story node is empty
		// register objects
		TieFlowLinkControlAreaImpl.pattern_TieFlowLinkControlArea_1_5_registerobjects_expressionBBBBBBBBBBBBB(this,
				ruleresult, trgTieFlow, trgControlArea, pair, srcTerminal, flowToFlow, srcTieFlow, srcResource, meter,
				srcLocation, srcControlArea, controlAreaToControlArea);
		return TieFlowLinkControlAreaImpl.pattern_TieFlowLinkControlArea_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = TieFlowLinkControlAreaImpl
				.pattern_TieFlowLinkControlArea_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TieFlowLinkControlAreaImpl
				.pattern_TieFlowLinkControlArea_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = TieFlowLinkControlAreaImpl
				.pattern_TieFlowLinkControlArea_2_2_corematch_bindingFFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MeterAssetMMXUPair pair = (MeterAssetMMXUPair) result2_binding[0];
		Terminal srcTerminal = (Terminal) result2_binding[1];
		TieFlow srcTieFlow = (TieFlow) result2_binding[2];
		ConductingEquipment srcResource = (ConductingEquipment) result2_binding[3];
		MeterAsset meter = (MeterAsset) result2_binding[4];
		Location srcLocation = (Location) result2_binding[5];
		ControlArea srcControlArea = (ControlArea) result2_binding[6];
		for (Object[] result2_black : TieFlowLinkControlAreaImpl
				.pattern_TieFlowLinkControlArea_2_2_corematch_blackFFBBFBBBBBFB(pair, srcTerminal, srcTieFlow,
						srcResource, meter, srcLocation, srcControlArea, match)) {
			outagePreventionJointarget.TieFlow trgTieFlow = (outagePreventionJointarget.TieFlow) result2_black[0];
			outagePreventionJointarget.ControlArea trgControlArea = (outagePreventionJointarget.ControlArea) result2_black[1];
			TieFlowToTieFlow flowToFlow = (TieFlowToTieFlow) result2_black[4];
			ControlAreaToControlSrea controlAreaToControlArea = (ControlAreaToControlSrea) result2_black[10];
			// ForEach find context
			for (Object[] result3_black : TieFlowLinkControlAreaImpl
					.pattern_TieFlowLinkControlArea_2_3_findcontext_blackBBBBBBBBBBB(trgTieFlow, trgControlArea, pair,
							srcTerminal, flowToFlow, srcTieFlow, srcResource, meter, srcLocation, srcControlArea,
							controlAreaToControlArea)) {
				Object[] result3_green = TieFlowLinkControlAreaImpl
						.pattern_TieFlowLinkControlArea_2_3_findcontext_greenBBBBBBBBBBBFFFFFFFFFFFFFFFF(trgTieFlow,
								trgControlArea, pair, srcTerminal, flowToFlow, srcTieFlow, srcResource, meter,
								srcLocation, srcControlArea, controlAreaToControlArea);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[11];
				// EMoflonEdge srcTerminal__srcTieFlow____TieFlow = (EMoflonEdge) result3_green[12];
				// EMoflonEdge srcTieFlow__srcTerminal____Terminal = (EMoflonEdge) result3_green[13];
				// EMoflonEdge srcTieFlow__srcControlArea____ControlArea = (EMoflonEdge) result3_green[14];
				// EMoflonEdge srcControlArea__srcTieFlow____TieFlow = (EMoflonEdge) result3_green[15];
				// EMoflonEdge flowToFlow__srcTieFlow____source = (EMoflonEdge) result3_green[16];
				// EMoflonEdge srcResource__srcTerminal____Terminals = (EMoflonEdge) result3_green[17];
				// EMoflonEdge srcTerminal__srcResource____ConductingEquipment = (EMoflonEdge) result3_green[18];
				// EMoflonEdge pair__meter____a = (EMoflonEdge) result3_green[19];
				// EMoflonEdge srcLocation__srcResource____PowerSystemResources = (EMoflonEdge) result3_green[20];
				// EMoflonEdge srcResource__srcLocation____Location = (EMoflonEdge) result3_green[21];
				// EMoflonEdge controlAreaToControlArea__srcControlArea____source = (EMoflonEdge) result3_green[22];
				// EMoflonEdge meter__srcLocation____Location = (EMoflonEdge) result3_green[23];
				// EMoflonEdge srcLocation__meter____Assets = (EMoflonEdge) result3_green[24];
				// EMoflonEdge controlAreaToControlArea__trgControlArea____target = (EMoflonEdge) result3_green[25];
				// EMoflonEdge flowToFlow__trgTieFlow____target = (EMoflonEdge) result3_green[26];

				// solve CSP
				Object[] result4_bindingAndBlack = TieFlowLinkControlAreaImpl
						.pattern_TieFlowLinkControlArea_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBB(this,
								isApplicableMatch, trgTieFlow, trgControlArea, pair, srcTerminal, flowToFlow,
								srcTieFlow, srcResource, meter, srcLocation, srcControlArea, controlAreaToControlArea);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[trgTieFlow] = " + trgTieFlow + ", " + "[trgControlArea] = " + trgControlArea + ", "
							+ "[pair] = " + pair + ", " + "[srcTerminal] = " + srcTerminal + ", " + "[flowToFlow] = "
							+ flowToFlow + ", " + "[srcTieFlow] = " + srcTieFlow + ", " + "[srcResource] = "
							+ srcResource + ", " + "[meter] = " + meter + ", " + "[srcLocation] = " + srcLocation + ", "
							+ "[srcControlArea] = " + srcControlArea + ", " + "[controlAreaToControlArea] = "
							+ controlAreaToControlArea + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (TieFlowLinkControlAreaImpl.pattern_TieFlowLinkControlArea_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = TieFlowLinkControlAreaImpl
							.pattern_TieFlowLinkControlArea_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					TieFlowLinkControlAreaImpl.pattern_TieFlowLinkControlArea_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return TieFlowLinkControlAreaImpl.pattern_TieFlowLinkControlArea_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MeterAssetMMXUPair pair, Terminal srcTerminal,
			TieFlow srcTieFlow, ConductingEquipment srcResource, MeterAsset meter, Location srcLocation,
			ControlArea srcControlArea) {
		match.registerObject("pair", pair);
		match.registerObject("srcTerminal", srcTerminal);
		match.registerObject("srcTieFlow", srcTieFlow);
		match.registerObject("srcResource", srcResource);
		match.registerObject("meter", meter);
		match.registerObject("srcLocation", srcLocation);
		match.registerObject("srcControlArea", srcControlArea);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MeterAssetMMXUPair pair, Terminal srcTerminal,
			TieFlow srcTieFlow, ConductingEquipment srcResource, MeterAsset meter, Location srcLocation,
			ControlArea srcControlArea) {// Create CSP
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
			outagePreventionJointarget.TieFlow trgTieFlow, outagePreventionJointarget.ControlArea trgControlArea,
			MeterAssetMMXUPair pair, Terminal srcTerminal, TieFlowToTieFlow flowToFlow, TieFlow srcTieFlow,
			ConductingEquipment srcResource, MeterAsset meter, Location srcLocation, ControlArea srcControlArea,
			ControlAreaToControlSrea controlAreaToControlArea) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("trgTieFlow", trgTieFlow);
		isApplicableMatch.registerObject("trgControlArea", trgControlArea);
		isApplicableMatch.registerObject("pair", pair);
		isApplicableMatch.registerObject("srcTerminal", srcTerminal);
		isApplicableMatch.registerObject("flowToFlow", flowToFlow);
		isApplicableMatch.registerObject("srcTieFlow", srcTieFlow);
		isApplicableMatch.registerObject("srcResource", srcResource);
		isApplicableMatch.registerObject("meter", meter);
		isApplicableMatch.registerObject("srcLocation", srcLocation);
		isApplicableMatch.registerObject("srcControlArea", srcControlArea);
		isApplicableMatch.registerObject("controlAreaToControlArea", controlAreaToControlArea);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject trgTieFlow, EObject trgControlArea,
			EObject pair, EObject srcTerminal, EObject flowToFlow, EObject srcTieFlow, EObject srcResource,
			EObject meter, EObject srcLocation, EObject srcControlArea, EObject controlAreaToControlArea) {
		ruleresult.registerObject("trgTieFlow", trgTieFlow);
		ruleresult.registerObject("trgControlArea", trgControlArea);
		ruleresult.registerObject("pair", pair);
		ruleresult.registerObject("srcTerminal", srcTerminal);
		ruleresult.registerObject("flowToFlow", flowToFlow);
		ruleresult.registerObject("srcTieFlow", srcTieFlow);
		ruleresult.registerObject("srcResource", srcResource);
		ruleresult.registerObject("meter", meter);
		ruleresult.registerObject("srcLocation", srcLocation);
		ruleresult.registerObject("srcControlArea", srcControlArea);
		ruleresult.registerObject("controlAreaToControlArea", controlAreaToControlArea);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_148(EMoflonEdge _edge_ControlArea) {
		// prepare return value
		Object[] result1_bindingAndBlack = TieFlowLinkControlAreaImpl
				.pattern_TieFlowLinkControlArea_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = TieFlowLinkControlAreaImpl
				.pattern_TieFlowLinkControlArea_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : TieFlowLinkControlAreaImpl
				.pattern_TieFlowLinkControlArea_10_2_testcorematchandDECs_blackFFFFFFFB(_edge_ControlArea)) {
			MeterAssetMMXUPair pair = (MeterAssetMMXUPair) result2_black[0];
			Terminal srcTerminal = (Terminal) result2_black[1];
			TieFlow srcTieFlow = (TieFlow) result2_black[2];
			ConductingEquipment srcResource = (ConductingEquipment) result2_black[3];
			MeterAsset meter = (MeterAsset) result2_black[4];
			Location srcLocation = (Location) result2_black[5];
			ControlArea srcControlArea = (ControlArea) result2_black[6];
			Object[] result2_green = TieFlowLinkControlAreaImpl
					.pattern_TieFlowLinkControlArea_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (TieFlowLinkControlAreaImpl
					.pattern_TieFlowLinkControlArea_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBBB(
							this, match, pair, srcTerminal, srcTieFlow, srcResource, meter, srcLocation,
							srcControlArea)) {
				// Ensure that the correct types of elements are matched
				if (TieFlowLinkControlAreaImpl
						.pattern_TieFlowLinkControlArea_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = TieFlowLinkControlAreaImpl
							.pattern_TieFlowLinkControlArea_10_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					TieFlowLinkControlAreaImpl.pattern_TieFlowLinkControlArea_10_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return TieFlowLinkControlAreaImpl.pattern_TieFlowLinkControlArea_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("TieFlowLinkControlArea");
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
	public boolean checkDEC_FWD(MeterAssetMMXUPair pair, Terminal srcTerminal, TieFlow srcTieFlow,
			ConductingEquipment srcResource, MeterAsset meter, Location srcLocation, ControlArea srcControlArea) {// match tgg pattern
		Object[] result1_black = TieFlowLinkControlAreaImpl
				.pattern_TieFlowLinkControlArea_13_1_matchtggpattern_blackBBBBBBB(pair, srcTerminal, srcTieFlow,
						srcResource, meter, srcLocation, srcControlArea);
		if (result1_black != null) {
			return TieFlowLinkControlAreaImpl.pattern_TieFlowLinkControlArea_13_2_expressionF();
		} else {
			return TieFlowLinkControlAreaImpl.pattern_TieFlowLinkControlArea_13_3_expressionF();
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
		case RulesPackage.TIE_FLOW_LINK_CONTROL_AREA___IS_APPROPRIATE_FWD__MATCH_METERASSETMMXUPAIR_TERMINAL_TIEFLOW_CONDUCTINGEQUIPMENT_METERASSET_LOCATION_CONTROLAREA:
			return isAppropriate_FWD((Match) arguments.get(0), (MeterAssetMMXUPair) arguments.get(1),
					(Terminal) arguments.get(2), (TieFlow) arguments.get(3), (ConductingEquipment) arguments.get(4),
					(MeterAsset) arguments.get(5), (Location) arguments.get(6), (ControlArea) arguments.get(7));
		case RulesPackage.TIE_FLOW_LINK_CONTROL_AREA___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TIE_FLOW_LINK_CONTROL_AREA___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.TIE_FLOW_LINK_CONTROL_AREA___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_METERASSETMMXUPAIR_TERMINAL_TIEFLOW_CONDUCTINGEQUIPMENT_METERASSET_LOCATION_CONTROLAREA:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MeterAssetMMXUPair) arguments.get(1),
					(Terminal) arguments.get(2), (TieFlow) arguments.get(3), (ConductingEquipment) arguments.get(4),
					(MeterAsset) arguments.get(5), (Location) arguments.get(6), (ControlArea) arguments.get(7));
			return null;
		case RulesPackage.TIE_FLOW_LINK_CONTROL_AREA___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_METERASSETMMXUPAIR_TERMINAL_TIEFLOW_CONDUCTINGEQUIPMENT_METERASSET_LOCATION_CONTROLAREA:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MeterAssetMMXUPair) arguments.get(1),
					(Terminal) arguments.get(2), (TieFlow) arguments.get(3), (ConductingEquipment) arguments.get(4),
					(MeterAsset) arguments.get(5), (Location) arguments.get(6), (ControlArea) arguments.get(7));
		case RulesPackage.TIE_FLOW_LINK_CONTROL_AREA___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TIE_FLOW_LINK_CONTROL_AREA___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TIEFLOW_CONTROLAREA_METERASSETMMXUPAIR_TERMINAL_TIEFLOWTOTIEFLOW_TIEFLOW_CONDUCTINGEQUIPMENT_METERASSET_LOCATION_CONTROLAREA_CONTROLAREATOCONTROLSREA:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(outagePreventionJointarget.TieFlow) arguments.get(1),
					(outagePreventionJointarget.ControlArea) arguments.get(2), (MeterAssetMMXUPair) arguments.get(3),
					(Terminal) arguments.get(4), (TieFlowToTieFlow) arguments.get(5), (TieFlow) arguments.get(6),
					(ConductingEquipment) arguments.get(7), (MeterAsset) arguments.get(8), (Location) arguments.get(9),
					(ControlArea) arguments.get(10), (ControlAreaToControlSrea) arguments.get(11));
		case RulesPackage.TIE_FLOW_LINK_CONTROL_AREA___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TIE_FLOW_LINK_CONTROL_AREA___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.TIE_FLOW_LINK_CONTROL_AREA___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.TIE_FLOW_LINK_CONTROL_AREA___IS_APPROPRIATE_FWD_EMOFLON_EDGE_148__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_148((EMoflonEdge) arguments.get(0));
		case RulesPackage.TIE_FLOW_LINK_CONTROL_AREA___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.TIE_FLOW_LINK_CONTROL_AREA___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.TIE_FLOW_LINK_CONTROL_AREA___CHECK_DEC_FWD__METERASSETMMXUPAIR_TERMINAL_TIEFLOW_CONDUCTINGEQUIPMENT_METERASSET_LOCATION_CONTROLAREA:
			return checkDEC_FWD((MeterAssetMMXUPair) arguments.get(0), (Terminal) arguments.get(1),
					(TieFlow) arguments.get(2), (ConductingEquipment) arguments.get(3), (MeterAsset) arguments.get(4),
					(Location) arguments.get(5), (ControlArea) arguments.get(6));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_TieFlowLinkControlArea_0_1_initialbindings_blackBBBBBBBBB(
			TieFlowLinkControlArea _this, Match match, MeterAssetMMXUPair pair, Terminal srcTerminal,
			TieFlow srcTieFlow, ConductingEquipment srcResource, MeterAsset meter, Location srcLocation,
			ControlArea srcControlArea) {
		return new Object[] { _this, match, pair, srcTerminal, srcTieFlow, srcResource, meter, srcLocation,
				srcControlArea };
	}

	public static final Object[] pattern_TieFlowLinkControlArea_0_2_SolveCSP_bindingFBBBBBBBBB(
			TieFlowLinkControlArea _this, Match match, MeterAssetMMXUPair pair, Terminal srcTerminal,
			TieFlow srcTieFlow, ConductingEquipment srcResource, MeterAsset meter, Location srcLocation,
			ControlArea srcControlArea) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, pair, srcTerminal, srcTieFlow, srcResource,
				meter, srcLocation, srcControlArea);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, pair, srcTerminal, srcTieFlow, srcResource, meter, srcLocation,
					srcControlArea };
		}
		return null;
	}

	public static final Object[] pattern_TieFlowLinkControlArea_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TieFlowLinkControlArea_0_2_SolveCSP_bindingAndBlackFBBBBBBBBB(
			TieFlowLinkControlArea _this, Match match, MeterAssetMMXUPair pair, Terminal srcTerminal,
			TieFlow srcTieFlow, ConductingEquipment srcResource, MeterAsset meter, Location srcLocation,
			ControlArea srcControlArea) {
		Object[] result_pattern_TieFlowLinkControlArea_0_2_SolveCSP_binding = pattern_TieFlowLinkControlArea_0_2_SolveCSP_bindingFBBBBBBBBB(
				_this, match, pair, srcTerminal, srcTieFlow, srcResource, meter, srcLocation, srcControlArea);
		if (result_pattern_TieFlowLinkControlArea_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TieFlowLinkControlArea_0_2_SolveCSP_binding[0];

			Object[] result_pattern_TieFlowLinkControlArea_0_2_SolveCSP_black = pattern_TieFlowLinkControlArea_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_TieFlowLinkControlArea_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, pair, srcTerminal, srcTieFlow, srcResource, meter, srcLocation,
						srcControlArea };
			}
		}
		return null;
	}

	public static final boolean pattern_TieFlowLinkControlArea_0_3_CheckCSP_expressionFBB(TieFlowLinkControlArea _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TieFlowLinkControlArea_0_4_collectelementstobetranslated_blackBBBBBBBB(
			Match match, MeterAssetMMXUPair pair, Terminal srcTerminal, TieFlow srcTieFlow,
			ConductingEquipment srcResource, MeterAsset meter, Location srcLocation, ControlArea srcControlArea) {
		return new Object[] { match, pair, srcTerminal, srcTieFlow, srcResource, meter, srcLocation, srcControlArea };
	}

	public static final Object[] pattern_TieFlowLinkControlArea_0_4_collectelementstobetranslated_greenBBBFF(
			Match match, TieFlow srcTieFlow, ControlArea srcControlArea) {
		EMoflonEdge srcTieFlow__srcControlArea____ControlArea = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcControlArea__srcTieFlow____TieFlow = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String srcTieFlow__srcControlArea____ControlArea_name_prime = "ControlArea";
		String srcControlArea__srcTieFlow____TieFlow_name_prime = "TieFlow";
		srcTieFlow__srcControlArea____ControlArea.setSrc(srcTieFlow);
		srcTieFlow__srcControlArea____ControlArea.setTrg(srcControlArea);
		match.getToBeTranslatedEdges().add(srcTieFlow__srcControlArea____ControlArea);
		srcControlArea__srcTieFlow____TieFlow.setSrc(srcControlArea);
		srcControlArea__srcTieFlow____TieFlow.setTrg(srcTieFlow);
		match.getToBeTranslatedEdges().add(srcControlArea__srcTieFlow____TieFlow);
		srcTieFlow__srcControlArea____ControlArea.setName(srcTieFlow__srcControlArea____ControlArea_name_prime);
		srcControlArea__srcTieFlow____TieFlow.setName(srcControlArea__srcTieFlow____TieFlow_name_prime);
		return new Object[] { match, srcTieFlow, srcControlArea, srcTieFlow__srcControlArea____ControlArea,
				srcControlArea__srcTieFlow____TieFlow };
	}

	public static final Object[] pattern_TieFlowLinkControlArea_0_5_collectcontextelements_blackBBBBBBBB(Match match,
			MeterAssetMMXUPair pair, Terminal srcTerminal, TieFlow srcTieFlow, ConductingEquipment srcResource,
			MeterAsset meter, Location srcLocation, ControlArea srcControlArea) {
		return new Object[] { match, pair, srcTerminal, srcTieFlow, srcResource, meter, srcLocation, srcControlArea };
	}

	public static final Object[] pattern_TieFlowLinkControlArea_0_5_collectcontextelements_greenBBBBBBBBFFFFFFFFF(
			Match match, MeterAssetMMXUPair pair, Terminal srcTerminal, TieFlow srcTieFlow,
			ConductingEquipment srcResource, MeterAsset meter, Location srcLocation, ControlArea srcControlArea) {
		EMoflonEdge srcTerminal__srcTieFlow____TieFlow = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcTieFlow__srcTerminal____Terminal = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcResource__srcTerminal____Terminals = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcTerminal__srcResource____ConductingEquipment = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__meter____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocation__srcResource____PowerSystemResources = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcResource__srcLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge meter__srcLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocation__meter____Assets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(pair);
		match.getContextNodes().add(srcTerminal);
		match.getContextNodes().add(srcTieFlow);
		match.getContextNodes().add(srcResource);
		match.getContextNodes().add(meter);
		match.getContextNodes().add(srcLocation);
		match.getContextNodes().add(srcControlArea);
		String srcTerminal__srcTieFlow____TieFlow_name_prime = "TieFlow";
		String srcTieFlow__srcTerminal____Terminal_name_prime = "Terminal";
		String srcResource__srcTerminal____Terminals_name_prime = "Terminals";
		String srcTerminal__srcResource____ConductingEquipment_name_prime = "ConductingEquipment";
		String pair__meter____a_name_prime = "a";
		String srcLocation__srcResource____PowerSystemResources_name_prime = "PowerSystemResources";
		String srcResource__srcLocation____Location_name_prime = "Location";
		String meter__srcLocation____Location_name_prime = "Location";
		String srcLocation__meter____Assets_name_prime = "Assets";
		srcTerminal__srcTieFlow____TieFlow.setSrc(srcTerminal);
		srcTerminal__srcTieFlow____TieFlow.setTrg(srcTieFlow);
		match.getContextEdges().add(srcTerminal__srcTieFlow____TieFlow);
		srcTieFlow__srcTerminal____Terminal.setSrc(srcTieFlow);
		srcTieFlow__srcTerminal____Terminal.setTrg(srcTerminal);
		match.getContextEdges().add(srcTieFlow__srcTerminal____Terminal);
		srcResource__srcTerminal____Terminals.setSrc(srcResource);
		srcResource__srcTerminal____Terminals.setTrg(srcTerminal);
		match.getContextEdges().add(srcResource__srcTerminal____Terminals);
		srcTerminal__srcResource____ConductingEquipment.setSrc(srcTerminal);
		srcTerminal__srcResource____ConductingEquipment.setTrg(srcResource);
		match.getContextEdges().add(srcTerminal__srcResource____ConductingEquipment);
		pair__meter____a.setSrc(pair);
		pair__meter____a.setTrg(meter);
		match.getContextEdges().add(pair__meter____a);
		srcLocation__srcResource____PowerSystemResources.setSrc(srcLocation);
		srcLocation__srcResource____PowerSystemResources.setTrg(srcResource);
		match.getContextEdges().add(srcLocation__srcResource____PowerSystemResources);
		srcResource__srcLocation____Location.setSrc(srcResource);
		srcResource__srcLocation____Location.setTrg(srcLocation);
		match.getContextEdges().add(srcResource__srcLocation____Location);
		meter__srcLocation____Location.setSrc(meter);
		meter__srcLocation____Location.setTrg(srcLocation);
		match.getContextEdges().add(meter__srcLocation____Location);
		srcLocation__meter____Assets.setSrc(srcLocation);
		srcLocation__meter____Assets.setTrg(meter);
		match.getContextEdges().add(srcLocation__meter____Assets);
		srcTerminal__srcTieFlow____TieFlow.setName(srcTerminal__srcTieFlow____TieFlow_name_prime);
		srcTieFlow__srcTerminal____Terminal.setName(srcTieFlow__srcTerminal____Terminal_name_prime);
		srcResource__srcTerminal____Terminals.setName(srcResource__srcTerminal____Terminals_name_prime);
		srcTerminal__srcResource____ConductingEquipment
				.setName(srcTerminal__srcResource____ConductingEquipment_name_prime);
		pair__meter____a.setName(pair__meter____a_name_prime);
		srcLocation__srcResource____PowerSystemResources
				.setName(srcLocation__srcResource____PowerSystemResources_name_prime);
		srcResource__srcLocation____Location.setName(srcResource__srcLocation____Location_name_prime);
		meter__srcLocation____Location.setName(meter__srcLocation____Location_name_prime);
		srcLocation__meter____Assets.setName(srcLocation__meter____Assets_name_prime);
		return new Object[] { match, pair, srcTerminal, srcTieFlow, srcResource, meter, srcLocation, srcControlArea,
				srcTerminal__srcTieFlow____TieFlow, srcTieFlow__srcTerminal____Terminal,
				srcResource__srcTerminal____Terminals, srcTerminal__srcResource____ConductingEquipment,
				pair__meter____a, srcLocation__srcResource____PowerSystemResources,
				srcResource__srcLocation____Location, meter__srcLocation____Location, srcLocation__meter____Assets };
	}

	public static final void pattern_TieFlowLinkControlArea_0_6_registerobjectstomatch_expressionBBBBBBBBB(
			TieFlowLinkControlArea _this, Match match, MeterAssetMMXUPair pair, Terminal srcTerminal,
			TieFlow srcTieFlow, ConductingEquipment srcResource, MeterAsset meter, Location srcLocation,
			ControlArea srcControlArea) {
		_this.registerObjectsToMatch_FWD(match, pair, srcTerminal, srcTieFlow, srcResource, meter, srcLocation,
				srcControlArea);

	}

	public static final boolean pattern_TieFlowLinkControlArea_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TieFlowLinkControlArea_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TieFlowLinkControlArea_1_1_performtransformation_bindingFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("trgTieFlow");
		EObject _localVariable_1 = isApplicableMatch.getObject("trgControlArea");
		EObject _localVariable_2 = isApplicableMatch.getObject("pair");
		EObject _localVariable_3 = isApplicableMatch.getObject("srcTerminal");
		EObject _localVariable_4 = isApplicableMatch.getObject("flowToFlow");
		EObject _localVariable_5 = isApplicableMatch.getObject("srcTieFlow");
		EObject _localVariable_6 = isApplicableMatch.getObject("srcResource");
		EObject _localVariable_7 = isApplicableMatch.getObject("meter");
		EObject _localVariable_8 = isApplicableMatch.getObject("srcLocation");
		EObject _localVariable_9 = isApplicableMatch.getObject("srcControlArea");
		EObject _localVariable_10 = isApplicableMatch.getObject("controlAreaToControlArea");
		EObject tmpTrgTieFlow = _localVariable_0;
		EObject tmpTrgControlArea = _localVariable_1;
		EObject tmpPair = _localVariable_2;
		EObject tmpSrcTerminal = _localVariable_3;
		EObject tmpFlowToFlow = _localVariable_4;
		EObject tmpSrcTieFlow = _localVariable_5;
		EObject tmpSrcResource = _localVariable_6;
		EObject tmpMeter = _localVariable_7;
		EObject tmpSrcLocation = _localVariable_8;
		EObject tmpSrcControlArea = _localVariable_9;
		EObject tmpControlAreaToControlArea = _localVariable_10;
		if (tmpTrgTieFlow instanceof outagePreventionJointarget.TieFlow) {
			outagePreventionJointarget.TieFlow trgTieFlow = (outagePreventionJointarget.TieFlow) tmpTrgTieFlow;
			if (tmpTrgControlArea instanceof outagePreventionJointarget.ControlArea) {
				outagePreventionJointarget.ControlArea trgControlArea = (outagePreventionJointarget.ControlArea) tmpTrgControlArea;
				if (tmpPair instanceof MeterAssetMMXUPair) {
					MeterAssetMMXUPair pair = (MeterAssetMMXUPair) tmpPair;
					if (tmpSrcTerminal instanceof Terminal) {
						Terminal srcTerminal = (Terminal) tmpSrcTerminal;
						if (tmpFlowToFlow instanceof TieFlowToTieFlow) {
							TieFlowToTieFlow flowToFlow = (TieFlowToTieFlow) tmpFlowToFlow;
							if (tmpSrcTieFlow instanceof TieFlow) {
								TieFlow srcTieFlow = (TieFlow) tmpSrcTieFlow;
								if (tmpSrcResource instanceof ConductingEquipment) {
									ConductingEquipment srcResource = (ConductingEquipment) tmpSrcResource;
									if (tmpMeter instanceof MeterAsset) {
										MeterAsset meter = (MeterAsset) tmpMeter;
										if (tmpSrcLocation instanceof Location) {
											Location srcLocation = (Location) tmpSrcLocation;
											if (tmpSrcControlArea instanceof ControlArea) {
												ControlArea srcControlArea = (ControlArea) tmpSrcControlArea;
												if (tmpControlAreaToControlArea instanceof ControlAreaToControlSrea) {
													ControlAreaToControlSrea controlAreaToControlArea = (ControlAreaToControlSrea) tmpControlAreaToControlArea;
													return new Object[] { trgTieFlow, trgControlArea, pair, srcTerminal,
															flowToFlow, srcTieFlow, srcResource, meter, srcLocation,
															srcControlArea, controlAreaToControlArea,
															isApplicableMatch };
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

	public static final Object[] pattern_TieFlowLinkControlArea_1_1_performtransformation_blackBBBBBBBBBBBFBB(
			outagePreventionJointarget.TieFlow trgTieFlow, outagePreventionJointarget.ControlArea trgControlArea,
			MeterAssetMMXUPair pair, Terminal srcTerminal, TieFlowToTieFlow flowToFlow, TieFlow srcTieFlow,
			ConductingEquipment srcResource, MeterAsset meter, Location srcLocation, ControlArea srcControlArea,
			ControlAreaToControlSrea controlAreaToControlArea, TieFlowLinkControlArea _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { trgTieFlow, trgControlArea, pair, srcTerminal, flowToFlow, srcTieFlow,
						srcResource, meter, srcLocation, srcControlArea, controlAreaToControlArea, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TieFlowLinkControlArea_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFFBB(
			TieFlowLinkControlArea _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TieFlowLinkControlArea_1_1_performtransformation_binding = pattern_TieFlowLinkControlArea_1_1_performtransformation_bindingFFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_TieFlowLinkControlArea_1_1_performtransformation_binding != null) {
			outagePreventionJointarget.TieFlow trgTieFlow = (outagePreventionJointarget.TieFlow) result_pattern_TieFlowLinkControlArea_1_1_performtransformation_binding[0];
			outagePreventionJointarget.ControlArea trgControlArea = (outagePreventionJointarget.ControlArea) result_pattern_TieFlowLinkControlArea_1_1_performtransformation_binding[1];
			MeterAssetMMXUPair pair = (MeterAssetMMXUPair) result_pattern_TieFlowLinkControlArea_1_1_performtransformation_binding[2];
			Terminal srcTerminal = (Terminal) result_pattern_TieFlowLinkControlArea_1_1_performtransformation_binding[3];
			TieFlowToTieFlow flowToFlow = (TieFlowToTieFlow) result_pattern_TieFlowLinkControlArea_1_1_performtransformation_binding[4];
			TieFlow srcTieFlow = (TieFlow) result_pattern_TieFlowLinkControlArea_1_1_performtransformation_binding[5];
			ConductingEquipment srcResource = (ConductingEquipment) result_pattern_TieFlowLinkControlArea_1_1_performtransformation_binding[6];
			MeterAsset meter = (MeterAsset) result_pattern_TieFlowLinkControlArea_1_1_performtransformation_binding[7];
			Location srcLocation = (Location) result_pattern_TieFlowLinkControlArea_1_1_performtransformation_binding[8];
			ControlArea srcControlArea = (ControlArea) result_pattern_TieFlowLinkControlArea_1_1_performtransformation_binding[9];
			ControlAreaToControlSrea controlAreaToControlArea = (ControlAreaToControlSrea) result_pattern_TieFlowLinkControlArea_1_1_performtransformation_binding[10];

			Object[] result_pattern_TieFlowLinkControlArea_1_1_performtransformation_black = pattern_TieFlowLinkControlArea_1_1_performtransformation_blackBBBBBBBBBBBFBB(
					trgTieFlow, trgControlArea, pair, srcTerminal, flowToFlow, srcTieFlow, srcResource, meter,
					srcLocation, srcControlArea, controlAreaToControlArea, _this, isApplicableMatch);
			if (result_pattern_TieFlowLinkControlArea_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TieFlowLinkControlArea_1_1_performtransformation_black[11];

				return new Object[] { trgTieFlow, trgControlArea, pair, srcTerminal, flowToFlow, srcTieFlow,
						srcResource, meter, srcLocation, srcControlArea, controlAreaToControlArea, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TieFlowLinkControlArea_1_1_performtransformation_greenBB(
			outagePreventionJointarget.TieFlow trgTieFlow, outagePreventionJointarget.ControlArea trgControlArea) {
		trgTieFlow.setControlArea(trgControlArea);
		return new Object[] { trgTieFlow, trgControlArea };
	}

	public static final Object[] pattern_TieFlowLinkControlArea_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_TieFlowLinkControlArea_1_3_bookkeepingforedges_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject trgTieFlow, EObject trgControlArea, EObject pair, EObject srcTerminal,
			EObject flowToFlow, EObject srcTieFlow, EObject srcResource, EObject meter, EObject srcLocation,
			EObject srcControlArea, EObject controlAreaToControlArea) {
		if (!trgControlArea.equals(trgTieFlow)) {
			if (!pair.equals(trgTieFlow)) {
				if (!pair.equals(trgControlArea)) {
					if (!pair.equals(srcTerminal)) {
						if (!pair.equals(srcTieFlow)) {
							if (!pair.equals(srcResource)) {
								if (!pair.equals(srcLocation)) {
									if (!pair.equals(srcControlArea)) {
										if (!srcTerminal.equals(trgTieFlow)) {
											if (!srcTerminal.equals(trgControlArea)) {
												if (!srcTerminal.equals(srcTieFlow)) {
													if (!flowToFlow.equals(trgTieFlow)) {
														if (!flowToFlow.equals(trgControlArea)) {
															if (!flowToFlow.equals(pair)) {
																if (!flowToFlow.equals(srcTerminal)) {
																	if (!flowToFlow.equals(srcTieFlow)) {
																		if (!flowToFlow.equals(srcResource)) {
																			if (!flowToFlow.equals(meter)) {
																				if (!flowToFlow.equals(srcLocation)) {
																					if (!flowToFlow
																							.equals(srcControlArea)) {
																						if (!srcTieFlow
																								.equals(trgTieFlow)) {
																							if (!srcTieFlow.equals(
																									trgControlArea)) {
																								if (!srcResource.equals(
																										trgTieFlow)) {
																									if (!srcResource
																											.equals(trgControlArea)) {
																										if (!srcResource
																												.equals(srcTerminal)) {
																											if (!srcResource
																													.equals(srcTieFlow)) {
																												if (!meter
																														.equals(trgTieFlow)) {
																													if (!meter
																															.equals(trgControlArea)) {
																														if (!meter
																																.equals(pair)) {
																															if (!meter
																																	.equals(srcTerminal)) {
																																if (!meter
																																		.equals(srcTieFlow)) {
																																	if (!meter
																																			.equals(srcResource)) {
																																		if (!meter
																																				.equals(srcLocation)) {
																																			if (!meter
																																					.equals(srcControlArea)) {
																																				if (!srcLocation
																																						.equals(trgTieFlow)) {
																																					if (!srcLocation
																																							.equals(trgControlArea)) {
																																						if (!srcLocation
																																								.equals(srcTerminal)) {
																																							if (!srcLocation
																																									.equals(srcTieFlow)) {
																																								if (!srcLocation
																																										.equals(srcResource)) {
																																									if (!srcControlArea
																																											.equals(trgTieFlow)) {
																																										if (!srcControlArea
																																												.equals(trgControlArea)) {
																																											if (!srcControlArea
																																													.equals(srcTerminal)) {
																																												if (!srcControlArea
																																														.equals(srcTieFlow)) {
																																													if (!srcControlArea
																																															.equals(srcResource)) {
																																														if (!srcControlArea
																																																.equals(srcLocation)) {
																																															if (!controlAreaToControlArea
																																																	.equals(trgTieFlow)) {
																																																if (!controlAreaToControlArea
																																																		.equals(trgControlArea)) {
																																																	if (!controlAreaToControlArea
																																																			.equals(pair)) {
																																																		if (!controlAreaToControlArea
																																																				.equals(srcTerminal)) {
																																																			if (!controlAreaToControlArea
																																																					.equals(flowToFlow)) {
																																																				if (!controlAreaToControlArea
																																																						.equals(srcTieFlow)) {
																																																					if (!controlAreaToControlArea
																																																							.equals(srcResource)) {
																																																						if (!controlAreaToControlArea
																																																								.equals(meter)) {
																																																							if (!controlAreaToControlArea
																																																									.equals(srcLocation)) {
																																																								if (!controlAreaToControlArea
																																																										.equals(srcControlArea)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											trgTieFlow,
																																																											trgControlArea,
																																																											pair,
																																																											srcTerminal,
																																																											flowToFlow,
																																																											srcTieFlow,
																																																											srcResource,
																																																											meter,
																																																											srcLocation,
																																																											srcControlArea,
																																																											controlAreaToControlArea };
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

	public static final Object[] pattern_TieFlowLinkControlArea_1_3_bookkeepingforedges_greenBBBBBFFF(
			PerformRuleResult ruleresult, EObject trgTieFlow, EObject trgControlArea, EObject srcTieFlow,
			EObject srcControlArea) {
		EMoflonEdge trgTieFlow__trgControlArea____ControlArea = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcTieFlow__srcControlArea____ControlArea = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcControlArea__srcTieFlow____TieFlow = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TieFlowLinkControlArea";
		String trgTieFlow__trgControlArea____ControlArea_name_prime = "ControlArea";
		String srcTieFlow__srcControlArea____ControlArea_name_prime = "ControlArea";
		String srcControlArea__srcTieFlow____TieFlow_name_prime = "TieFlow";
		trgTieFlow__trgControlArea____ControlArea.setSrc(trgTieFlow);
		trgTieFlow__trgControlArea____ControlArea.setTrg(trgControlArea);
		ruleresult.getCreatedEdges().add(trgTieFlow__trgControlArea____ControlArea);
		srcTieFlow__srcControlArea____ControlArea.setSrc(srcTieFlow);
		srcTieFlow__srcControlArea____ControlArea.setTrg(srcControlArea);
		ruleresult.getTranslatedEdges().add(srcTieFlow__srcControlArea____ControlArea);
		srcControlArea__srcTieFlow____TieFlow.setSrc(srcControlArea);
		srcControlArea__srcTieFlow____TieFlow.setTrg(srcTieFlow);
		ruleresult.getTranslatedEdges().add(srcControlArea__srcTieFlow____TieFlow);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		trgTieFlow__trgControlArea____ControlArea.setName(trgTieFlow__trgControlArea____ControlArea_name_prime);
		srcTieFlow__srcControlArea____ControlArea.setName(srcTieFlow__srcControlArea____ControlArea_name_prime);
		srcControlArea__srcTieFlow____TieFlow.setName(srcControlArea__srcTieFlow____TieFlow_name_prime);
		return new Object[] { ruleresult, trgTieFlow, trgControlArea, srcTieFlow, srcControlArea,
				trgTieFlow__trgControlArea____ControlArea, srcTieFlow__srcControlArea____ControlArea,
				srcControlArea__srcTieFlow____TieFlow };
	}

	public static final void pattern_TieFlowLinkControlArea_1_5_registerobjects_expressionBBBBBBBBBBBBB(
			TieFlowLinkControlArea _this, PerformRuleResult ruleresult, EObject trgTieFlow, EObject trgControlArea,
			EObject pair, EObject srcTerminal, EObject flowToFlow, EObject srcTieFlow, EObject srcResource,
			EObject meter, EObject srcLocation, EObject srcControlArea, EObject controlAreaToControlArea) {
		_this.registerObjects_FWD(ruleresult, trgTieFlow, trgControlArea, pair, srcTerminal, flowToFlow, srcTieFlow,
				srcResource, meter, srcLocation, srcControlArea, controlAreaToControlArea);

	}

	public static final PerformRuleResult pattern_TieFlowLinkControlArea_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TieFlowLinkControlArea_2_1_preparereturnvalue_bindingFB(
			TieFlowLinkControlArea _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TieFlowLinkControlArea_2_1_preparereturnvalue_blackFBB(EClass eClass,
			TieFlowLinkControlArea _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TieFlowLinkControlArea_2_1_preparereturnvalue_bindingAndBlackFFB(
			TieFlowLinkControlArea _this) {
		Object[] result_pattern_TieFlowLinkControlArea_2_1_preparereturnvalue_binding = pattern_TieFlowLinkControlArea_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TieFlowLinkControlArea_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_TieFlowLinkControlArea_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TieFlowLinkControlArea_2_1_preparereturnvalue_black = pattern_TieFlowLinkControlArea_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_TieFlowLinkControlArea_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_TieFlowLinkControlArea_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TieFlowLinkControlArea_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "TieFlowLinkControlArea";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_TieFlowLinkControlArea_2_2_corematch_bindingFFFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("pair");
		EObject _localVariable_1 = match.getObject("srcTerminal");
		EObject _localVariable_2 = match.getObject("srcTieFlow");
		EObject _localVariable_3 = match.getObject("srcResource");
		EObject _localVariable_4 = match.getObject("meter");
		EObject _localVariable_5 = match.getObject("srcLocation");
		EObject _localVariable_6 = match.getObject("srcControlArea");
		EObject tmpPair = _localVariable_0;
		EObject tmpSrcTerminal = _localVariable_1;
		EObject tmpSrcTieFlow = _localVariable_2;
		EObject tmpSrcResource = _localVariable_3;
		EObject tmpMeter = _localVariable_4;
		EObject tmpSrcLocation = _localVariable_5;
		EObject tmpSrcControlArea = _localVariable_6;
		if (tmpPair instanceof MeterAssetMMXUPair) {
			MeterAssetMMXUPair pair = (MeterAssetMMXUPair) tmpPair;
			if (tmpSrcTerminal instanceof Terminal) {
				Terminal srcTerminal = (Terminal) tmpSrcTerminal;
				if (tmpSrcTieFlow instanceof TieFlow) {
					TieFlow srcTieFlow = (TieFlow) tmpSrcTieFlow;
					if (tmpSrcResource instanceof ConductingEquipment) {
						ConductingEquipment srcResource = (ConductingEquipment) tmpSrcResource;
						if (tmpMeter instanceof MeterAsset) {
							MeterAsset meter = (MeterAsset) tmpMeter;
							if (tmpSrcLocation instanceof Location) {
								Location srcLocation = (Location) tmpSrcLocation;
								if (tmpSrcControlArea instanceof ControlArea) {
									ControlArea srcControlArea = (ControlArea) tmpSrcControlArea;
									return new Object[] { pair, srcTerminal, srcTieFlow, srcResource, meter,
											srcLocation, srcControlArea, match };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TieFlowLinkControlArea_2_2_corematch_blackFFBBFBBBBBFB(
			MeterAssetMMXUPair pair, Terminal srcTerminal, TieFlow srcTieFlow, ConductingEquipment srcResource,
			MeterAsset meter, Location srcLocation, ControlArea srcControlArea, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TieFlowToTieFlow flowToFlow : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(srcTieFlow, TieFlowToTieFlow.class, "source")) {
			outagePreventionJointarget.TieFlow trgTieFlow = flowToFlow.getTarget();
			if (trgTieFlow != null) {
				for (ControlAreaToControlSrea controlAreaToControlArea : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(srcControlArea, ControlAreaToControlSrea.class, "source")) {
					outagePreventionJointarget.ControlArea trgControlArea = controlAreaToControlArea.getTarget();
					if (trgControlArea != null) {
						_result.add(new Object[] { trgTieFlow, trgControlArea, pair, srcTerminal, flowToFlow,
								srcTieFlow, srcResource, meter, srcLocation, srcControlArea, controlAreaToControlArea,
								match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_TieFlowLinkControlArea_2_3_findcontext_blackBBBBBBBBBBB(
			outagePreventionJointarget.TieFlow trgTieFlow, outagePreventionJointarget.ControlArea trgControlArea,
			MeterAssetMMXUPair pair, Terminal srcTerminal, TieFlowToTieFlow flowToFlow, TieFlow srcTieFlow,
			ConductingEquipment srcResource, MeterAsset meter, Location srcLocation, ControlArea srcControlArea,
			ControlAreaToControlSrea controlAreaToControlArea) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (srcTerminal.getTieFlow().contains(srcTieFlow)) {
			if (srcControlArea.equals(srcTieFlow.getControlArea())) {
				if (srcTieFlow.equals(flowToFlow.getSource())) {
					if (srcResource.getTerminals().contains(srcTerminal)) {
						if (meter.equals(pair.getA())) {
							if (srcLocation.getPowerSystemResources().contains(srcResource)) {
								if (srcControlArea.equals(controlAreaToControlArea.getSource())) {
									if (srcLocation.equals(meter.getLocation())) {
										if (trgControlArea.equals(controlAreaToControlArea.getTarget())) {
											if (trgTieFlow.equals(flowToFlow.getTarget())) {
												_result.add(new Object[] { trgTieFlow, trgControlArea, pair,
														srcTerminal, flowToFlow, srcTieFlow, srcResource, meter,
														srcLocation, srcControlArea, controlAreaToControlArea });
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
		return _result;
	}

	public static final Object[] pattern_TieFlowLinkControlArea_2_3_findcontext_greenBBBBBBBBBBBFFFFFFFFFFFFFFFF(
			outagePreventionJointarget.TieFlow trgTieFlow, outagePreventionJointarget.ControlArea trgControlArea,
			MeterAssetMMXUPair pair, Terminal srcTerminal, TieFlowToTieFlow flowToFlow, TieFlow srcTieFlow,
			ConductingEquipment srcResource, MeterAsset meter, Location srcLocation, ControlArea srcControlArea,
			ControlAreaToControlSrea controlAreaToControlArea) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge srcTerminal__srcTieFlow____TieFlow = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcTieFlow__srcTerminal____Terminal = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcTieFlow__srcControlArea____ControlArea = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcControlArea__srcTieFlow____TieFlow = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flowToFlow__srcTieFlow____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcResource__srcTerminal____Terminals = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcTerminal__srcResource____ConductingEquipment = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pair__meter____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocation__srcResource____PowerSystemResources = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcResource__srcLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge controlAreaToControlArea__srcControlArea____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge meter__srcLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocation__meter____Assets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge controlAreaToControlArea__trgControlArea____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flowToFlow__trgTieFlow____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String srcTerminal__srcTieFlow____TieFlow_name_prime = "TieFlow";
		String srcTieFlow__srcTerminal____Terminal_name_prime = "Terminal";
		String srcTieFlow__srcControlArea____ControlArea_name_prime = "ControlArea";
		String srcControlArea__srcTieFlow____TieFlow_name_prime = "TieFlow";
		String flowToFlow__srcTieFlow____source_name_prime = "source";
		String srcResource__srcTerminal____Terminals_name_prime = "Terminals";
		String srcTerminal__srcResource____ConductingEquipment_name_prime = "ConductingEquipment";
		String pair__meter____a_name_prime = "a";
		String srcLocation__srcResource____PowerSystemResources_name_prime = "PowerSystemResources";
		String srcResource__srcLocation____Location_name_prime = "Location";
		String controlAreaToControlArea__srcControlArea____source_name_prime = "source";
		String meter__srcLocation____Location_name_prime = "Location";
		String srcLocation__meter____Assets_name_prime = "Assets";
		String controlAreaToControlArea__trgControlArea____target_name_prime = "target";
		String flowToFlow__trgTieFlow____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(trgTieFlow);
		isApplicableMatch.getAllContextElements().add(trgControlArea);
		isApplicableMatch.getAllContextElements().add(pair);
		isApplicableMatch.getAllContextElements().add(srcTerminal);
		isApplicableMatch.getAllContextElements().add(flowToFlow);
		isApplicableMatch.getAllContextElements().add(srcTieFlow);
		isApplicableMatch.getAllContextElements().add(srcResource);
		isApplicableMatch.getAllContextElements().add(meter);
		isApplicableMatch.getAllContextElements().add(srcLocation);
		isApplicableMatch.getAllContextElements().add(srcControlArea);
		isApplicableMatch.getAllContextElements().add(controlAreaToControlArea);
		srcTerminal__srcTieFlow____TieFlow.setSrc(srcTerminal);
		srcTerminal__srcTieFlow____TieFlow.setTrg(srcTieFlow);
		isApplicableMatch.getAllContextElements().add(srcTerminal__srcTieFlow____TieFlow);
		srcTieFlow__srcTerminal____Terminal.setSrc(srcTieFlow);
		srcTieFlow__srcTerminal____Terminal.setTrg(srcTerminal);
		isApplicableMatch.getAllContextElements().add(srcTieFlow__srcTerminal____Terminal);
		srcTieFlow__srcControlArea____ControlArea.setSrc(srcTieFlow);
		srcTieFlow__srcControlArea____ControlArea.setTrg(srcControlArea);
		isApplicableMatch.getAllContextElements().add(srcTieFlow__srcControlArea____ControlArea);
		srcControlArea__srcTieFlow____TieFlow.setSrc(srcControlArea);
		srcControlArea__srcTieFlow____TieFlow.setTrg(srcTieFlow);
		isApplicableMatch.getAllContextElements().add(srcControlArea__srcTieFlow____TieFlow);
		flowToFlow__srcTieFlow____source.setSrc(flowToFlow);
		flowToFlow__srcTieFlow____source.setTrg(srcTieFlow);
		isApplicableMatch.getAllContextElements().add(flowToFlow__srcTieFlow____source);
		srcResource__srcTerminal____Terminals.setSrc(srcResource);
		srcResource__srcTerminal____Terminals.setTrg(srcTerminal);
		isApplicableMatch.getAllContextElements().add(srcResource__srcTerminal____Terminals);
		srcTerminal__srcResource____ConductingEquipment.setSrc(srcTerminal);
		srcTerminal__srcResource____ConductingEquipment.setTrg(srcResource);
		isApplicableMatch.getAllContextElements().add(srcTerminal__srcResource____ConductingEquipment);
		pair__meter____a.setSrc(pair);
		pair__meter____a.setTrg(meter);
		isApplicableMatch.getAllContextElements().add(pair__meter____a);
		srcLocation__srcResource____PowerSystemResources.setSrc(srcLocation);
		srcLocation__srcResource____PowerSystemResources.setTrg(srcResource);
		isApplicableMatch.getAllContextElements().add(srcLocation__srcResource____PowerSystemResources);
		srcResource__srcLocation____Location.setSrc(srcResource);
		srcResource__srcLocation____Location.setTrg(srcLocation);
		isApplicableMatch.getAllContextElements().add(srcResource__srcLocation____Location);
		controlAreaToControlArea__srcControlArea____source.setSrc(controlAreaToControlArea);
		controlAreaToControlArea__srcControlArea____source.setTrg(srcControlArea);
		isApplicableMatch.getAllContextElements().add(controlAreaToControlArea__srcControlArea____source);
		meter__srcLocation____Location.setSrc(meter);
		meter__srcLocation____Location.setTrg(srcLocation);
		isApplicableMatch.getAllContextElements().add(meter__srcLocation____Location);
		srcLocation__meter____Assets.setSrc(srcLocation);
		srcLocation__meter____Assets.setTrg(meter);
		isApplicableMatch.getAllContextElements().add(srcLocation__meter____Assets);
		controlAreaToControlArea__trgControlArea____target.setSrc(controlAreaToControlArea);
		controlAreaToControlArea__trgControlArea____target.setTrg(trgControlArea);
		isApplicableMatch.getAllContextElements().add(controlAreaToControlArea__trgControlArea____target);
		flowToFlow__trgTieFlow____target.setSrc(flowToFlow);
		flowToFlow__trgTieFlow____target.setTrg(trgTieFlow);
		isApplicableMatch.getAllContextElements().add(flowToFlow__trgTieFlow____target);
		srcTerminal__srcTieFlow____TieFlow.setName(srcTerminal__srcTieFlow____TieFlow_name_prime);
		srcTieFlow__srcTerminal____Terminal.setName(srcTieFlow__srcTerminal____Terminal_name_prime);
		srcTieFlow__srcControlArea____ControlArea.setName(srcTieFlow__srcControlArea____ControlArea_name_prime);
		srcControlArea__srcTieFlow____TieFlow.setName(srcControlArea__srcTieFlow____TieFlow_name_prime);
		flowToFlow__srcTieFlow____source.setName(flowToFlow__srcTieFlow____source_name_prime);
		srcResource__srcTerminal____Terminals.setName(srcResource__srcTerminal____Terminals_name_prime);
		srcTerminal__srcResource____ConductingEquipment
				.setName(srcTerminal__srcResource____ConductingEquipment_name_prime);
		pair__meter____a.setName(pair__meter____a_name_prime);
		srcLocation__srcResource____PowerSystemResources
				.setName(srcLocation__srcResource____PowerSystemResources_name_prime);
		srcResource__srcLocation____Location.setName(srcResource__srcLocation____Location_name_prime);
		controlAreaToControlArea__srcControlArea____source
				.setName(controlAreaToControlArea__srcControlArea____source_name_prime);
		meter__srcLocation____Location.setName(meter__srcLocation____Location_name_prime);
		srcLocation__meter____Assets.setName(srcLocation__meter____Assets_name_prime);
		controlAreaToControlArea__trgControlArea____target
				.setName(controlAreaToControlArea__trgControlArea____target_name_prime);
		flowToFlow__trgTieFlow____target.setName(flowToFlow__trgTieFlow____target_name_prime);
		return new Object[] { trgTieFlow, trgControlArea, pair, srcTerminal, flowToFlow, srcTieFlow, srcResource, meter,
				srcLocation, srcControlArea, controlAreaToControlArea, isApplicableMatch,
				srcTerminal__srcTieFlow____TieFlow, srcTieFlow__srcTerminal____Terminal,
				srcTieFlow__srcControlArea____ControlArea, srcControlArea__srcTieFlow____TieFlow,
				flowToFlow__srcTieFlow____source, srcResource__srcTerminal____Terminals,
				srcTerminal__srcResource____ConductingEquipment, pair__meter____a,
				srcLocation__srcResource____PowerSystemResources, srcResource__srcLocation____Location,
				controlAreaToControlArea__srcControlArea____source, meter__srcLocation____Location,
				srcLocation__meter____Assets, controlAreaToControlArea__trgControlArea____target,
				flowToFlow__trgTieFlow____target };
	}

	public static final Object[] pattern_TieFlowLinkControlArea_2_4_solveCSP_bindingFBBBBBBBBBBBBB(
			TieFlowLinkControlArea _this, IsApplicableMatch isApplicableMatch,
			outagePreventionJointarget.TieFlow trgTieFlow, outagePreventionJointarget.ControlArea trgControlArea,
			MeterAssetMMXUPair pair, Terminal srcTerminal, TieFlowToTieFlow flowToFlow, TieFlow srcTieFlow,
			ConductingEquipment srcResource, MeterAsset meter, Location srcLocation, ControlArea srcControlArea,
			ControlAreaToControlSrea controlAreaToControlArea) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, trgTieFlow, trgControlArea, pair,
				srcTerminal, flowToFlow, srcTieFlow, srcResource, meter, srcLocation, srcControlArea,
				controlAreaToControlArea);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, trgTieFlow, trgControlArea, pair, srcTerminal,
					flowToFlow, srcTieFlow, srcResource, meter, srcLocation, srcControlArea, controlAreaToControlArea };
		}
		return null;
	}

	public static final Object[] pattern_TieFlowLinkControlArea_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TieFlowLinkControlArea_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBB(
			TieFlowLinkControlArea _this, IsApplicableMatch isApplicableMatch,
			outagePreventionJointarget.TieFlow trgTieFlow, outagePreventionJointarget.ControlArea trgControlArea,
			MeterAssetMMXUPair pair, Terminal srcTerminal, TieFlowToTieFlow flowToFlow, TieFlow srcTieFlow,
			ConductingEquipment srcResource, MeterAsset meter, Location srcLocation, ControlArea srcControlArea,
			ControlAreaToControlSrea controlAreaToControlArea) {
		Object[] result_pattern_TieFlowLinkControlArea_2_4_solveCSP_binding = pattern_TieFlowLinkControlArea_2_4_solveCSP_bindingFBBBBBBBBBBBBB(
				_this, isApplicableMatch, trgTieFlow, trgControlArea, pair, srcTerminal, flowToFlow, srcTieFlow,
				srcResource, meter, srcLocation, srcControlArea, controlAreaToControlArea);
		if (result_pattern_TieFlowLinkControlArea_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TieFlowLinkControlArea_2_4_solveCSP_binding[0];

			Object[] result_pattern_TieFlowLinkControlArea_2_4_solveCSP_black = pattern_TieFlowLinkControlArea_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_TieFlowLinkControlArea_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, trgTieFlow, trgControlArea, pair, srcTerminal,
						flowToFlow, srcTieFlow, srcResource, meter, srcLocation, srcControlArea,
						controlAreaToControlArea };
			}
		}
		return null;
	}

	public static final boolean pattern_TieFlowLinkControlArea_2_5_checkCSP_expressionFBB(TieFlowLinkControlArea _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TieFlowLinkControlArea_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_TieFlowLinkControlArea_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "TieFlowLinkControlArea";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_TieFlowLinkControlArea_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TieFlowLinkControlArea_10_1_preparereturnvalue_bindingFB(
			TieFlowLinkControlArea _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TieFlowLinkControlArea_10_1_preparereturnvalue_blackFBBF(EClass __eClass,
			TieFlowLinkControlArea _this) {
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

	public static final Object[] pattern_TieFlowLinkControlArea_10_1_preparereturnvalue_bindingAndBlackFFBF(
			TieFlowLinkControlArea _this) {
		Object[] result_pattern_TieFlowLinkControlArea_10_1_preparereturnvalue_binding = pattern_TieFlowLinkControlArea_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TieFlowLinkControlArea_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_TieFlowLinkControlArea_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TieFlowLinkControlArea_10_1_preparereturnvalue_black = pattern_TieFlowLinkControlArea_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_TieFlowLinkControlArea_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TieFlowLinkControlArea_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_TieFlowLinkControlArea_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_TieFlowLinkControlArea_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_TieFlowLinkControlArea_10_2_testcorematchandDECs_blackFFFFFFFB(
			EMoflonEdge _edge_ControlArea) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSrcTieFlow = _edge_ControlArea.getSrc();
		if (tmpSrcTieFlow instanceof TieFlow) {
			TieFlow srcTieFlow = (TieFlow) tmpSrcTieFlow;
			EObject tmpSrcControlArea = _edge_ControlArea.getTrg();
			if (tmpSrcControlArea instanceof ControlArea) {
				ControlArea srcControlArea = (ControlArea) tmpSrcControlArea;
				if (srcControlArea.equals(srcTieFlow.getControlArea())) {
					Terminal srcTerminal = srcTieFlow.getTerminal();
					if (srcTerminal != null) {
						ConductingEquipment srcResource = srcTerminal.getConductingEquipment();
						if (srcResource != null) {
							Location srcLocation = srcResource.getLocation();
							if (srcLocation != null) {
								for (Asset tmpMeter : srcLocation.getAssets()) {
									if (tmpMeter instanceof MeterAsset) {
										MeterAsset meter = (MeterAsset) tmpMeter;
										for (MeterAssetMMXUPair pair : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(meter, MeterAssetMMXUPair.class, "a")) {
											_result.add(new Object[] { pair, srcTerminal, srcTieFlow, srcResource,
													meter, srcLocation, srcControlArea, _edge_ControlArea });
										}
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

	public static final Object[] pattern_TieFlowLinkControlArea_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TieFlowLinkControlArea_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBBB(
			TieFlowLinkControlArea _this, Match match, MeterAssetMMXUPair pair, Terminal srcTerminal,
			TieFlow srcTieFlow, ConductingEquipment srcResource, MeterAsset meter, Location srcLocation,
			ControlArea srcControlArea) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, pair, srcTerminal, srcTieFlow, srcResource, meter,
				srcLocation, srcControlArea);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TieFlowLinkControlArea_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			TieFlowLinkControlArea _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TieFlowLinkControlArea_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_TieFlowLinkControlArea_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_TieFlowLinkControlArea_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TieFlowLinkControlArea_13_1_matchtggpattern_blackBBBBBBB(
			MeterAssetMMXUPair pair, Terminal srcTerminal, TieFlow srcTieFlow, ConductingEquipment srcResource,
			MeterAsset meter, Location srcLocation, ControlArea srcControlArea) {
		if (srcTerminal.getTieFlow().contains(srcTieFlow)) {
			if (srcControlArea.equals(srcTieFlow.getControlArea())) {
				if (srcResource.getTerminals().contains(srcTerminal)) {
					if (meter.equals(pair.getA())) {
						if (srcLocation.getPowerSystemResources().contains(srcResource)) {
							if (srcLocation.equals(meter.getLocation())) {
								return new Object[] { pair, srcTerminal, srcTieFlow, srcResource, meter, srcLocation,
										srcControlArea };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_TieFlowLinkControlArea_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TieFlowLinkControlArea_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TieFlowLinkControlAreaImpl
