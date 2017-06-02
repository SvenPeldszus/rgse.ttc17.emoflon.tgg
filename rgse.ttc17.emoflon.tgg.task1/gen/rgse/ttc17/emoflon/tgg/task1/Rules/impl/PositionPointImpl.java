/**
 */
package rgse.ttc17.emoflon.tgg.task1.Rules.impl;

import gluemodel.CIM.IEC61968.Assets.Asset;

import gluemodel.CIM.IEC61968.Common.Location;

import gluemodel.CIM.IEC61968.Metering.MeterAsset;

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

import outageDetectionJointarget.OutageDetectionJointargetFactory;

import rgse.ttc17.emoflon.tgg.task1.LocationToLocation;
import rgse.ttc17.emoflon.tgg.task1.PositionPointToPositionPoint;

import rgse.ttc17.emoflon.tgg.task1.Rules.PositionPoint;
import rgse.ttc17.emoflon.tgg.task1.Rules.RulesPackage;

import rgse.ttc17.emoflon.tgg.task1.Task1Factory;
// <-- [user defined imports]
import org.moflon.tgg.csp.*;
import rgse.ttc17.emoflon.tgg.task1.csp.constraints.*;
import org.moflon.tgg.csp.constraints.*;
import org.moflon.tgg.language.csp.*;
import org.moflon.tgg.runtime.TripleMatchNodeMapping;
import java.util.Optional;
import org.moflon.tgg.algorithm.delta.attribute.CheckAttributeHelper;
import SDMLanguage.expressions.ComparingOperator;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PositionPointImpl extends AbstractRuleImpl implements PositionPoint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getPositionPoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MeterAssetPhysicalDevicePair pair, Location srcLocation,
			gluemodel.CIM.IEC61968.Common.PositionPoint positionPoint, MeterAsset asset) {
		// initial bindings
		Object[] result1_black = PositionPointImpl.pattern_PositionPoint_0_1_initialbindings_blackBBBBBB(this, match,
				pair, srcLocation, positionPoint, asset);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[pair] = " + pair + ", " + "[srcLocation] = " + srcLocation
							+ ", " + "[positionPoint] = " + positionPoint + ", " + "[asset] = " + asset + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = PositionPointImpl.pattern_PositionPoint_0_2_SolveCSP_bindingAndBlackFBBBBBB(
				this, match, pair, srcLocation, positionPoint, asset);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[pair] = " + pair + ", " + "[srcLocation] = "
					+ srcLocation + ", " + "[positionPoint] = " + positionPoint + ", " + "[asset] = " + asset + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (PositionPointImpl.pattern_PositionPoint_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = PositionPointImpl
					.pattern_PositionPoint_0_4_collectelementstobetranslated_blackBBBBB(match, pair, srcLocation,
							positionPoint, asset);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[pair] = " + pair + ", " + "[srcLocation] = "
						+ srcLocation + ", " + "[positionPoint] = " + positionPoint + ", " + "[asset] = " + asset
						+ ".");
			}
			PositionPointImpl.pattern_PositionPoint_0_4_collectelementstobetranslated_greenBBBF(match, srcLocation,
					positionPoint);
			// EMoflonEdge srcLocation__positionPoint____Position = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = PositionPointImpl.pattern_PositionPoint_0_5_collectcontextelements_blackBBBBB(
					match, pair, srcLocation, positionPoint, asset);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[pair] = " + pair + ", " + "[srcLocation] = " + srcLocation + ", "
								+ "[positionPoint] = " + positionPoint + ", " + "[asset] = " + asset + ".");
			}
			PositionPointImpl.pattern_PositionPoint_0_5_collectcontextelements_greenBBBBFFF(match, pair, srcLocation,
					asset);
			// EMoflonEdge pair__asset____a = (EMoflonEdge) result5_green[4];
			// EMoflonEdge asset__srcLocation____Location = (EMoflonEdge) result5_green[5];
			// EMoflonEdge srcLocation__asset____Assets = (EMoflonEdge) result5_green[6];

			// register objects to match
			PositionPointImpl.pattern_PositionPoint_0_6_registerobjectstomatch_expressionBBBBBB(this, match, pair,
					srcLocation, positionPoint, asset);
			return PositionPointImpl.pattern_PositionPoint_0_7_expressionF();
		} else {
			return PositionPointImpl.pattern_PositionPoint_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = PositionPointImpl
				.pattern_PositionPoint_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result1_bindingAndBlack[0];
		outageDetectionJointarget.Location trgLocation = (outageDetectionJointarget.Location) result1_bindingAndBlack[1];
		Location srcLocation = (Location) result1_bindingAndBlack[2];
		gluemodel.CIM.IEC61968.Common.PositionPoint positionPoint = (gluemodel.CIM.IEC61968.Common.PositionPoint) result1_bindingAndBlack[3];
		LocationToLocation locationToLocation = (LocationToLocation) result1_bindingAndBlack[4];
		MeterAsset asset = (MeterAsset) result1_bindingAndBlack[5];
		CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = PositionPointImpl
				.pattern_PositionPoint_1_1_performtransformation_greenBBFFB(trgLocation, positionPoint, csp);
		outageDetectionJointarget.PositionPoint trgPositionPoint = (outageDetectionJointarget.PositionPoint) result1_green[2];
		PositionPointToPositionPoint positionCorr = (PositionPointToPositionPoint) result1_green[3];

		// collect translated elements
		Object[] result2_black = PositionPointImpl.pattern_PositionPoint_1_2_collecttranslatedelements_blackBBB(
				positionPoint, trgPositionPoint, positionCorr);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[positionPoint] = " + positionPoint + ", " + "[trgPositionPoint] = " + trgPositionPoint + ", "
					+ "[positionCorr] = " + positionCorr + ".");
		}
		Object[] result2_green = PositionPointImpl.pattern_PositionPoint_1_2_collecttranslatedelements_greenFBBB(
				positionPoint, trgPositionPoint, positionCorr);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = PositionPointImpl.pattern_PositionPoint_1_3_bookkeepingforedges_blackBBBBBBBBB(
				ruleresult, pair, trgLocation, srcLocation, positionPoint, trgPositionPoint, locationToLocation, asset,
				positionCorr);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[pair] = " + pair + ", " + "[trgLocation] = "
					+ trgLocation + ", " + "[srcLocation] = " + srcLocation + ", " + "[positionPoint] = "
					+ positionPoint + ", " + "[trgPositionPoint] = " + trgPositionPoint + ", "
					+ "[locationToLocation] = " + locationToLocation + ", " + "[asset] = " + asset + ", "
					+ "[positionCorr] = " + positionCorr + ".");
		}
		PositionPointImpl.pattern_PositionPoint_1_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, trgLocation,
				srcLocation, positionPoint, trgPositionPoint, positionCorr);
		// EMoflonEdge srcLocation__positionPoint____Position = (EMoflonEdge) result3_green[6];
		// EMoflonEdge positionCorr__trgPositionPoint____target = (EMoflonEdge) result3_green[7];
		// EMoflonEdge positionCorr__positionPoint____source = (EMoflonEdge) result3_green[8];
		// EMoflonEdge trgLocation__trgPositionPoint____Position = (EMoflonEdge) result3_green[9];

		// perform postprocessing story node is empty
		// register objects
		PositionPointImpl.pattern_PositionPoint_1_5_registerobjects_expressionBBBBBBBBBB(this, ruleresult, pair,
				trgLocation, srcLocation, positionPoint, trgPositionPoint, locationToLocation, asset, positionCorr);
		return PositionPointImpl.pattern_PositionPoint_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = PositionPointImpl
				.pattern_PositionPoint_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PositionPointImpl
				.pattern_PositionPoint_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = PositionPointImpl.pattern_PositionPoint_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_binding[0];
		Location srcLocation = (Location) result2_binding[1];
		gluemodel.CIM.IEC61968.Common.PositionPoint positionPoint = (gluemodel.CIM.IEC61968.Common.PositionPoint) result2_binding[2];
		MeterAsset asset = (MeterAsset) result2_binding[3];
		for (Object[] result2_black : PositionPointImpl.pattern_PositionPoint_2_2_corematch_blackBFBBFBB(pair,
				srcLocation, positionPoint, asset, match)) {
			outageDetectionJointarget.Location trgLocation = (outageDetectionJointarget.Location) result2_black[1];
			LocationToLocation locationToLocation = (LocationToLocation) result2_black[4];
			// ForEach find context
			for (Object[] result3_black : PositionPointImpl.pattern_PositionPoint_2_3_findcontext_blackBBBBBB(pair,
					trgLocation, srcLocation, positionPoint, locationToLocation, asset)) {
				Object[] result3_green = PositionPointImpl.pattern_PositionPoint_2_3_findcontext_greenBBBBBBFFFFFFF(
						pair, trgLocation, srcLocation, positionPoint, locationToLocation, asset);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge pair__asset____a = (EMoflonEdge) result3_green[7];
				// EMoflonEdge locationToLocation__trgLocation____target = (EMoflonEdge) result3_green[8];
				// EMoflonEdge asset__srcLocation____Location = (EMoflonEdge) result3_green[9];
				// EMoflonEdge srcLocation__asset____Assets = (EMoflonEdge) result3_green[10];
				// EMoflonEdge srcLocation__positionPoint____Position = (EMoflonEdge) result3_green[11];
				// EMoflonEdge locationToLocation__srcLocation____source = (EMoflonEdge) result3_green[12];

				// solve CSP
				Object[] result4_bindingAndBlack = PositionPointImpl
						.pattern_PositionPoint_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, pair,
								trgLocation, srcLocation, positionPoint, locationToLocation, asset);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[pair] = " + pair + ", " + "[trgLocation] = " + trgLocation + ", " + "[srcLocation] = "
							+ srcLocation + ", " + "[positionPoint] = " + positionPoint + ", "
							+ "[locationToLocation] = " + locationToLocation + ", " + "[asset] = " + asset + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (PositionPointImpl.pattern_PositionPoint_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = PositionPointImpl
							.pattern_PositionPoint_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					PositionPointImpl.pattern_PositionPoint_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return PositionPointImpl.pattern_PositionPoint_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MeterAssetPhysicalDevicePair pair, Location srcLocation,
			gluemodel.CIM.IEC61968.Common.PositionPoint positionPoint, MeterAsset asset) {
		match.registerObject("pair", pair);
		match.registerObject("srcLocation", srcLocation);
		match.registerObject("positionPoint", positionPoint);
		match.registerObject("asset", asset);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MeterAssetPhysicalDevicePair pair, Location srcLocation,
			gluemodel.CIM.IEC61968.Common.PositionPoint positionPoint, MeterAsset asset) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MeterAssetPhysicalDevicePair pair,
			outageDetectionJointarget.Location trgLocation, Location srcLocation,
			gluemodel.CIM.IEC61968.Common.PositionPoint positionPoint, LocationToLocation locationToLocation,
			MeterAsset asset) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_positionPoint_yPosition = CSPFactoryHelper.eINSTANCE.createVariable("positionPoint.yPosition",
				true, csp);
		var_positionPoint_yPosition.setValue(positionPoint.getYPosition());
		var_positionPoint_yPosition.setType("String");
		Variable var_positionPoint_zPosition = CSPFactoryHelper.eINSTANCE.createVariable("positionPoint.zPosition",
				true, csp);
		var_positionPoint_zPosition.setValue(positionPoint.getZPosition());
		var_positionPoint_zPosition.setType("String");
		Variable var_positionPoint_xPosition = CSPFactoryHelper.eINSTANCE.createVariable("positionPoint.xPosition",
				true, csp);
		var_positionPoint_xPosition.setValue(positionPoint.getXPosition());
		var_positionPoint_xPosition.setType("String");

		// Create unbound variables
		Variable var_trgPositionPoint_yPosition = CSPFactoryHelper.eINSTANCE
				.createVariable("trgPositionPoint.yPosition", csp);
		var_trgPositionPoint_yPosition.setType("String");
		Variable var_trgPositionPoint_zPosition = CSPFactoryHelper.eINSTANCE
				.createVariable("trgPositionPoint.zPosition", csp);
		var_trgPositionPoint_zPosition.setType("String");
		Variable var_trgPositionPoint_xPosition = CSPFactoryHelper.eINSTANCE
				.createVariable("trgPositionPoint.xPosition", csp);
		var_trgPositionPoint_xPosition.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		Eq eq_1 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eq_1);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_positionPoint_yPosition, var_trgPositionPoint_yPosition);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_positionPoint_zPosition, var_trgPositionPoint_zPosition);
		eq_1.setRuleName("NoRuleName");
		eq_1.solve(var_positionPoint_xPosition, var_trgPositionPoint_xPosition);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("pair", pair);
		isApplicableMatch.registerObject("trgLocation", trgLocation);
		isApplicableMatch.registerObject("srcLocation", srcLocation);
		isApplicableMatch.registerObject("positionPoint", positionPoint);
		isApplicableMatch.registerObject("locationToLocation", locationToLocation);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject pair, EObject trgLocation,
			EObject srcLocation, EObject positionPoint, EObject trgPositionPoint, EObject locationToLocation,
			EObject asset, EObject positionCorr) {
		ruleresult.registerObject("pair", pair);
		ruleresult.registerObject("trgLocation", trgLocation);
		ruleresult.registerObject("srcLocation", srcLocation);
		ruleresult.registerObject("positionPoint", positionPoint);
		ruleresult.registerObject("trgPositionPoint", trgPositionPoint);
		ruleresult.registerObject("locationToLocation", locationToLocation);
		ruleresult.registerObject("asset", asset);
		ruleresult.registerObject("positionCorr", positionCorr);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("positionPoint").eClass())
				.equals("gluemodel.CIM.IEC61968.Common.PositionPoint.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_56(EMoflonEdge _edge_Position) {
		// prepare return value
		Object[] result1_bindingAndBlack = PositionPointImpl
				.pattern_PositionPoint_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = PositionPointImpl.pattern_PositionPoint_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PositionPointImpl
				.pattern_PositionPoint_10_2_testcorematchandDECs_blackFFFFB(_edge_Position)) {
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result2_black[0];
			Location srcLocation = (Location) result2_black[1];
			gluemodel.CIM.IEC61968.Common.PositionPoint positionPoint = (gluemodel.CIM.IEC61968.Common.PositionPoint) result2_black[2];
			MeterAsset asset = (MeterAsset) result2_black[3];
			Object[] result2_green = PositionPointImpl
					.pattern_PositionPoint_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PositionPointImpl
					.pattern_PositionPoint_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this, match,
							pair, srcLocation, positionPoint, asset)) {
				// Ensure that the correct types of elements are matched
				if (PositionPointImpl
						.pattern_PositionPoint_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = PositionPointImpl
							.pattern_PositionPoint_10_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					PositionPointImpl.pattern_PositionPoint_10_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return PositionPointImpl.pattern_PositionPoint_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("PositionPoint");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_trgPositionPoint_zPosition = CSPFactoryHelper.eINSTANCE.createVariable("trgPositionPoint", true,
				csp);
		var_trgPositionPoint_zPosition.setValue(__helper.getValue("trgPositionPoint", "zPosition"));
		var_trgPositionPoint_zPosition.setType("String");

		Variable var_positionPoint_yPosition = CSPFactoryHelper.eINSTANCE.createVariable("positionPoint", true, csp);
		var_positionPoint_yPosition.setValue(__helper.getValue("positionPoint", "yPosition"));
		var_positionPoint_yPosition.setType("String");

		Variable var_positionPoint_zPosition = CSPFactoryHelper.eINSTANCE.createVariable("positionPoint", true, csp);
		var_positionPoint_zPosition.setValue(__helper.getValue("positionPoint", "zPosition"));
		var_positionPoint_zPosition.setType("String");

		Variable var_trgPositionPoint_yPosition = CSPFactoryHelper.eINSTANCE.createVariable("trgPositionPoint", true,
				csp);
		var_trgPositionPoint_yPosition.setValue(__helper.getValue("trgPositionPoint", "yPosition"));
		var_trgPositionPoint_yPosition.setType("String");

		Variable var_trgPositionPoint_xPosition = CSPFactoryHelper.eINSTANCE.createVariable("trgPositionPoint", true,
				csp);
		var_trgPositionPoint_xPosition.setValue(__helper.getValue("trgPositionPoint", "xPosition"));
		var_trgPositionPoint_xPosition.setType("String");

		Variable var_positionPoint_xPosition = CSPFactoryHelper.eINSTANCE.createVariable("positionPoint", true, csp);
		var_positionPoint_xPosition.setValue(__helper.getValue("positionPoint", "xPosition"));
		var_positionPoint_xPosition.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		Eq eq2 = new Eq();
		csp.getConstraints().add(eq2);

		eq0.setRuleName("PositionPoint");
		eq0.solve(var_positionPoint_yPosition, var_trgPositionPoint_yPosition);

		eq1.setRuleName("PositionPoint");
		eq1.solve(var_positionPoint_zPosition, var_trgPositionPoint_zPosition);

		eq2.setRuleName("PositionPoint");
		eq2.solve(var_positionPoint_xPosition, var_trgPositionPoint_xPosition);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_trgPositionPoint_yPosition.setBound(false);
			var_trgPositionPoint_zPosition.setBound(false);
			var_trgPositionPoint_xPosition.setBound(false);
			eq0.solve(var_positionPoint_yPosition, var_trgPositionPoint_yPosition);
			eq1.solve(var_positionPoint_zPosition, var_trgPositionPoint_zPosition);
			eq2.solve(var_positionPoint_xPosition, var_trgPositionPoint_xPosition);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("trgPositionPoint", "yPosition", var_trgPositionPoint_yPosition.getValue());
				__helper.setValue("trgPositionPoint", "zPosition", var_trgPositionPoint_zPosition.getValue());
				__helper.setValue("trgPositionPoint", "xPosition", var_trgPositionPoint_xPosition.getValue());
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
	public boolean checkDEC_FWD(MeterAssetPhysicalDevicePair pair, Location srcLocation,
			gluemodel.CIM.IEC61968.Common.PositionPoint positionPoint, MeterAsset asset) {// match tgg pattern
		Object[] result1_black = PositionPointImpl.pattern_PositionPoint_13_1_matchtggpattern_blackBBBB(pair,
				srcLocation, positionPoint, asset);
		if (result1_black != null) {
			return PositionPointImpl.pattern_PositionPoint_13_2_expressionF();
		} else {
			return PositionPointImpl.pattern_PositionPoint_13_3_expressionF();
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
		case RulesPackage.POSITION_POINT___IS_APPROPRIATE_FWD__MATCH_METERASSETPHYSICALDEVICEPAIR_LOCATION_POSITIONPOINT_METERASSET:
			return isAppropriate_FWD((Match) arguments.get(0), (MeterAssetPhysicalDevicePair) arguments.get(1),
					(Location) arguments.get(2), (gluemodel.CIM.IEC61968.Common.PositionPoint) arguments.get(3),
					(MeterAsset) arguments.get(4));
		case RulesPackage.POSITION_POINT___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.POSITION_POINT___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.POSITION_POINT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_METERASSETPHYSICALDEVICEPAIR_LOCATION_POSITIONPOINT_METERASSET:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MeterAssetPhysicalDevicePair) arguments.get(1),
					(Location) arguments.get(2), (gluemodel.CIM.IEC61968.Common.PositionPoint) arguments.get(3),
					(MeterAsset) arguments.get(4));
			return null;
		case RulesPackage.POSITION_POINT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_METERASSETPHYSICALDEVICEPAIR_LOCATION_POSITIONPOINT_METERASSET:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MeterAssetPhysicalDevicePair) arguments.get(1),
					(Location) arguments.get(2), (gluemodel.CIM.IEC61968.Common.PositionPoint) arguments.get(3),
					(MeterAsset) arguments.get(4));
		case RulesPackage.POSITION_POINT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.POSITION_POINT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_METERASSETPHYSICALDEVICEPAIR_LOCATION_LOCATION_POSITIONPOINT_LOCATIONTOLOCATION_METERASSET:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(MeterAssetPhysicalDevicePair) arguments.get(1),
					(outageDetectionJointarget.Location) arguments.get(2), (Location) arguments.get(3),
					(gluemodel.CIM.IEC61968.Common.PositionPoint) arguments.get(4),
					(LocationToLocation) arguments.get(5), (MeterAsset) arguments.get(6));
		case RulesPackage.POSITION_POINT___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.POSITION_POINT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.POSITION_POINT___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.POSITION_POINT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_56__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_56((EMoflonEdge) arguments.get(0));
		case RulesPackage.POSITION_POINT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.POSITION_POINT___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.POSITION_POINT___CHECK_DEC_FWD__METERASSETPHYSICALDEVICEPAIR_LOCATION_POSITIONPOINT_METERASSET:
			return checkDEC_FWD((MeterAssetPhysicalDevicePair) arguments.get(0), (Location) arguments.get(1),
					(gluemodel.CIM.IEC61968.Common.PositionPoint) arguments.get(2), (MeterAsset) arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_PositionPoint_0_1_initialbindings_blackBBBBBB(PositionPoint _this, Match match,
			MeterAssetPhysicalDevicePair pair, Location srcLocation,
			gluemodel.CIM.IEC61968.Common.PositionPoint positionPoint, MeterAsset asset) {
		return new Object[] { _this, match, pair, srcLocation, positionPoint, asset };
	}

	public static final Object[] pattern_PositionPoint_0_2_SolveCSP_bindingFBBBBBB(PositionPoint _this, Match match,
			MeterAssetPhysicalDevicePair pair, Location srcLocation,
			gluemodel.CIM.IEC61968.Common.PositionPoint positionPoint, MeterAsset asset) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, pair, srcLocation, positionPoint, asset);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, pair, srcLocation, positionPoint, asset };
		}
		return null;
	}

	public static final Object[] pattern_PositionPoint_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PositionPoint_0_2_SolveCSP_bindingAndBlackFBBBBBB(PositionPoint _this,
			Match match, MeterAssetPhysicalDevicePair pair, Location srcLocation,
			gluemodel.CIM.IEC61968.Common.PositionPoint positionPoint, MeterAsset asset) {
		Object[] result_pattern_PositionPoint_0_2_SolveCSP_binding = pattern_PositionPoint_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, pair, srcLocation, positionPoint, asset);
		if (result_pattern_PositionPoint_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PositionPoint_0_2_SolveCSP_binding[0];

			Object[] result_pattern_PositionPoint_0_2_SolveCSP_black = pattern_PositionPoint_0_2_SolveCSP_blackB(csp);
			if (result_pattern_PositionPoint_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, pair, srcLocation, positionPoint, asset };
			}
		}
		return null;
	}

	public static final boolean pattern_PositionPoint_0_3_CheckCSP_expressionFBB(PositionPoint _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PositionPoint_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			MeterAssetPhysicalDevicePair pair, Location srcLocation,
			gluemodel.CIM.IEC61968.Common.PositionPoint positionPoint, MeterAsset asset) {
		return new Object[] { match, pair, srcLocation, positionPoint, asset };
	}

	public static final Object[] pattern_PositionPoint_0_4_collectelementstobetranslated_greenBBBF(Match match,
			Location srcLocation, gluemodel.CIM.IEC61968.Common.PositionPoint positionPoint) {
		EMoflonEdge srcLocation__positionPoint____Position = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(positionPoint);
		String srcLocation__positionPoint____Position_name_prime = "Position";
		srcLocation__positionPoint____Position.setSrc(srcLocation);
		srcLocation__positionPoint____Position.setTrg(positionPoint);
		match.getToBeTranslatedEdges().add(srcLocation__positionPoint____Position);
		srcLocation__positionPoint____Position.setName(srcLocation__positionPoint____Position_name_prime);
		return new Object[] { match, srcLocation, positionPoint, srcLocation__positionPoint____Position };
	}

	public static final Object[] pattern_PositionPoint_0_5_collectcontextelements_blackBBBBB(Match match,
			MeterAssetPhysicalDevicePair pair, Location srcLocation,
			gluemodel.CIM.IEC61968.Common.PositionPoint positionPoint, MeterAsset asset) {
		return new Object[] { match, pair, srcLocation, positionPoint, asset };
	}

	public static final Object[] pattern_PositionPoint_0_5_collectcontextelements_greenBBBBFFF(Match match,
			MeterAssetPhysicalDevicePair pair, Location srcLocation, MeterAsset asset) {
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge asset__srcLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocation__asset____Assets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(pair);
		match.getContextNodes().add(srcLocation);
		match.getContextNodes().add(asset);
		String pair__asset____a_name_prime = "a";
		String asset__srcLocation____Location_name_prime = "Location";
		String srcLocation__asset____Assets_name_prime = "Assets";
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		match.getContextEdges().add(pair__asset____a);
		asset__srcLocation____Location.setSrc(asset);
		asset__srcLocation____Location.setTrg(srcLocation);
		match.getContextEdges().add(asset__srcLocation____Location);
		srcLocation__asset____Assets.setSrc(srcLocation);
		srcLocation__asset____Assets.setTrg(asset);
		match.getContextEdges().add(srcLocation__asset____Assets);
		pair__asset____a.setName(pair__asset____a_name_prime);
		asset__srcLocation____Location.setName(asset__srcLocation____Location_name_prime);
		srcLocation__asset____Assets.setName(srcLocation__asset____Assets_name_prime);
		return new Object[] { match, pair, srcLocation, asset, pair__asset____a, asset__srcLocation____Location,
				srcLocation__asset____Assets };
	}

	public static final void pattern_PositionPoint_0_6_registerobjectstomatch_expressionBBBBBB(PositionPoint _this,
			Match match, MeterAssetPhysicalDevicePair pair, Location srcLocation,
			gluemodel.CIM.IEC61968.Common.PositionPoint positionPoint, MeterAsset asset) {
		_this.registerObjectsToMatch_FWD(match, pair, srcLocation, positionPoint, asset);

	}

	public static final boolean pattern_PositionPoint_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PositionPoint_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_PositionPoint_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("pair");
		EObject _localVariable_1 = isApplicableMatch.getObject("trgLocation");
		EObject _localVariable_2 = isApplicableMatch.getObject("srcLocation");
		EObject _localVariable_3 = isApplicableMatch.getObject("positionPoint");
		EObject _localVariable_4 = isApplicableMatch.getObject("locationToLocation");
		EObject _localVariable_5 = isApplicableMatch.getObject("asset");
		EObject tmpPair = _localVariable_0;
		EObject tmpTrgLocation = _localVariable_1;
		EObject tmpSrcLocation = _localVariable_2;
		EObject tmpPositionPoint = _localVariable_3;
		EObject tmpLocationToLocation = _localVariable_4;
		EObject tmpAsset = _localVariable_5;
		if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
			if (tmpTrgLocation instanceof outageDetectionJointarget.Location) {
				outageDetectionJointarget.Location trgLocation = (outageDetectionJointarget.Location) tmpTrgLocation;
				if (tmpSrcLocation instanceof Location) {
					Location srcLocation = (Location) tmpSrcLocation;
					if (tmpPositionPoint instanceof gluemodel.CIM.IEC61968.Common.PositionPoint) {
						gluemodel.CIM.IEC61968.Common.PositionPoint positionPoint = (gluemodel.CIM.IEC61968.Common.PositionPoint) tmpPositionPoint;
						if (tmpLocationToLocation instanceof LocationToLocation) {
							LocationToLocation locationToLocation = (LocationToLocation) tmpLocationToLocation;
							if (tmpAsset instanceof MeterAsset) {
								MeterAsset asset = (MeterAsset) tmpAsset;
								return new Object[] { pair, trgLocation, srcLocation, positionPoint, locationToLocation,
										asset, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PositionPoint_1_1_performtransformation_blackBBBBBBFBB(
			MeterAssetPhysicalDevicePair pair, outageDetectionJointarget.Location trgLocation, Location srcLocation,
			gluemodel.CIM.IEC61968.Common.PositionPoint positionPoint, LocationToLocation locationToLocation,
			MeterAsset asset, PositionPoint _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { pair, trgLocation, srcLocation, positionPoint, locationToLocation, asset, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PositionPoint_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			PositionPoint _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_PositionPoint_1_1_performtransformation_binding = pattern_PositionPoint_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_PositionPoint_1_1_performtransformation_binding != null) {
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) result_pattern_PositionPoint_1_1_performtransformation_binding[0];
			outageDetectionJointarget.Location trgLocation = (outageDetectionJointarget.Location) result_pattern_PositionPoint_1_1_performtransformation_binding[1];
			Location srcLocation = (Location) result_pattern_PositionPoint_1_1_performtransformation_binding[2];
			gluemodel.CIM.IEC61968.Common.PositionPoint positionPoint = (gluemodel.CIM.IEC61968.Common.PositionPoint) result_pattern_PositionPoint_1_1_performtransformation_binding[3];
			LocationToLocation locationToLocation = (LocationToLocation) result_pattern_PositionPoint_1_1_performtransformation_binding[4];
			MeterAsset asset = (MeterAsset) result_pattern_PositionPoint_1_1_performtransformation_binding[5];

			Object[] result_pattern_PositionPoint_1_1_performtransformation_black = pattern_PositionPoint_1_1_performtransformation_blackBBBBBBFBB(
					pair, trgLocation, srcLocation, positionPoint, locationToLocation, asset, _this, isApplicableMatch);
			if (result_pattern_PositionPoint_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_PositionPoint_1_1_performtransformation_black[6];

				return new Object[] { pair, trgLocation, srcLocation, positionPoint, locationToLocation, asset, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PositionPoint_1_1_performtransformation_greenBBFFB(
			outageDetectionJointarget.Location trgLocation, gluemodel.CIM.IEC61968.Common.PositionPoint positionPoint,
			CSP csp) {
		outageDetectionJointarget.PositionPoint trgPositionPoint = OutageDetectionJointargetFactory.eINSTANCE
				.createPositionPoint();
		PositionPointToPositionPoint positionCorr = Task1Factory.eINSTANCE.createPositionPointToPositionPoint();
		Object _localVariable_0 = csp.getValue("trgPositionPoint", "yPosition");
		Object _localVariable_1 = csp.getValue("trgPositionPoint", "zPosition");
		Object _localVariable_2 = csp.getValue("trgPositionPoint", "xPosition");
		trgLocation.setPosition(trgPositionPoint);
		positionCorr.setTarget(trgPositionPoint);
		positionCorr.setSource(positionPoint);
		String trgPositionPoint_yPosition_prime = (String) _localVariable_0;
		String trgPositionPoint_zPosition_prime = (String) _localVariable_1;
		String trgPositionPoint_xPosition_prime = (String) _localVariable_2;
		trgPositionPoint.setYPosition(trgPositionPoint_yPosition_prime);
		trgPositionPoint.setZPosition(trgPositionPoint_zPosition_prime);
		trgPositionPoint.setXPosition(trgPositionPoint_xPosition_prime);
		return new Object[] { trgLocation, positionPoint, trgPositionPoint, positionCorr, csp };
	}

	public static final Object[] pattern_PositionPoint_1_2_collecttranslatedelements_blackBBB(
			gluemodel.CIM.IEC61968.Common.PositionPoint positionPoint,
			outageDetectionJointarget.PositionPoint trgPositionPoint, PositionPointToPositionPoint positionCorr) {
		return new Object[] { positionPoint, trgPositionPoint, positionCorr };
	}

	public static final Object[] pattern_PositionPoint_1_2_collecttranslatedelements_greenFBBB(
			gluemodel.CIM.IEC61968.Common.PositionPoint positionPoint,
			outageDetectionJointarget.PositionPoint trgPositionPoint, PositionPointToPositionPoint positionCorr) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(positionPoint);
		ruleresult.getCreatedElements().add(trgPositionPoint);
		ruleresult.getCreatedLinkElements().add(positionCorr);
		return new Object[] { ruleresult, positionPoint, trgPositionPoint, positionCorr };
	}

	public static final Object[] pattern_PositionPoint_1_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject pair, EObject trgLocation, EObject srcLocation, EObject positionPoint,
			EObject trgPositionPoint, EObject locationToLocation, EObject asset, EObject positionCorr) {
		if (!pair.equals(trgLocation)) {
			if (!pair.equals(srcLocation)) {
				if (!pair.equals(positionPoint)) {
					if (!pair.equals(trgPositionPoint)) {
						if (!pair.equals(positionCorr)) {
							if (!trgLocation.equals(trgPositionPoint)) {
								if (!srcLocation.equals(trgLocation)) {
									if (!srcLocation.equals(trgPositionPoint)) {
										if (!positionPoint.equals(trgLocation)) {
											if (!positionPoint.equals(srcLocation)) {
												if (!positionPoint.equals(trgPositionPoint)) {
													if (!locationToLocation.equals(pair)) {
														if (!locationToLocation.equals(trgLocation)) {
															if (!locationToLocation.equals(srcLocation)) {
																if (!locationToLocation.equals(positionPoint)) {
																	if (!locationToLocation.equals(trgPositionPoint)) {
																		if (!locationToLocation.equals(positionCorr)) {
																			if (!asset.equals(pair)) {
																				if (!asset.equals(trgLocation)) {
																					if (!asset.equals(srcLocation)) {
																						if (!asset.equals(
																								positionPoint)) {
																							if (!asset.equals(
																									trgPositionPoint)) {
																								if (!asset.equals(
																										locationToLocation)) {
																									if (!asset.equals(
																											positionCorr)) {
																										if (!positionCorr
																												.equals(trgLocation)) {
																											if (!positionCorr
																													.equals(srcLocation)) {
																												if (!positionCorr
																														.equals(positionPoint)) {
																													if (!positionCorr
																															.equals(trgPositionPoint)) {
																														return new Object[] {
																																ruleresult,
																																pair,
																																trgLocation,
																																srcLocation,
																																positionPoint,
																																trgPositionPoint,
																																locationToLocation,
																																asset,
																																positionCorr };
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

	public static final Object[] pattern_PositionPoint_1_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject trgLocation, EObject srcLocation, EObject positionPoint,
			EObject trgPositionPoint, EObject positionCorr) {
		EMoflonEdge srcLocation__positionPoint____Position = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge positionCorr__trgPositionPoint____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge positionCorr__positionPoint____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgLocation__trgPositionPoint____Position = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "PositionPoint";
		String srcLocation__positionPoint____Position_name_prime = "Position";
		String positionCorr__trgPositionPoint____target_name_prime = "target";
		String positionCorr__positionPoint____source_name_prime = "source";
		String trgLocation__trgPositionPoint____Position_name_prime = "Position";
		srcLocation__positionPoint____Position.setSrc(srcLocation);
		srcLocation__positionPoint____Position.setTrg(positionPoint);
		ruleresult.getTranslatedEdges().add(srcLocation__positionPoint____Position);
		positionCorr__trgPositionPoint____target.setSrc(positionCorr);
		positionCorr__trgPositionPoint____target.setTrg(trgPositionPoint);
		ruleresult.getCreatedEdges().add(positionCorr__trgPositionPoint____target);
		positionCorr__positionPoint____source.setSrc(positionCorr);
		positionCorr__positionPoint____source.setTrg(positionPoint);
		ruleresult.getCreatedEdges().add(positionCorr__positionPoint____source);
		trgLocation__trgPositionPoint____Position.setSrc(trgLocation);
		trgLocation__trgPositionPoint____Position.setTrg(trgPositionPoint);
		ruleresult.getCreatedEdges().add(trgLocation__trgPositionPoint____Position);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		srcLocation__positionPoint____Position.setName(srcLocation__positionPoint____Position_name_prime);
		positionCorr__trgPositionPoint____target.setName(positionCorr__trgPositionPoint____target_name_prime);
		positionCorr__positionPoint____source.setName(positionCorr__positionPoint____source_name_prime);
		trgLocation__trgPositionPoint____Position.setName(trgLocation__trgPositionPoint____Position_name_prime);
		return new Object[] { ruleresult, trgLocation, srcLocation, positionPoint, trgPositionPoint, positionCorr,
				srcLocation__positionPoint____Position, positionCorr__trgPositionPoint____target,
				positionCorr__positionPoint____source, trgLocation__trgPositionPoint____Position };
	}

	public static final void pattern_PositionPoint_1_5_registerobjects_expressionBBBBBBBBBB(PositionPoint _this,
			PerformRuleResult ruleresult, EObject pair, EObject trgLocation, EObject srcLocation, EObject positionPoint,
			EObject trgPositionPoint, EObject locationToLocation, EObject asset, EObject positionCorr) {
		_this.registerObjects_FWD(ruleresult, pair, trgLocation, srcLocation, positionPoint, trgPositionPoint,
				locationToLocation, asset, positionCorr);

	}

	public static final PerformRuleResult pattern_PositionPoint_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PositionPoint_2_1_preparereturnvalue_bindingFB(PositionPoint _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PositionPoint_2_1_preparereturnvalue_blackFBB(EClass eClass,
			PositionPoint _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PositionPoint_2_1_preparereturnvalue_bindingAndBlackFFB(PositionPoint _this) {
		Object[] result_pattern_PositionPoint_2_1_preparereturnvalue_binding = pattern_PositionPoint_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_PositionPoint_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_PositionPoint_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_PositionPoint_2_1_preparereturnvalue_black = pattern_PositionPoint_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_PositionPoint_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_PositionPoint_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PositionPoint_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "PositionPoint";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_PositionPoint_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("pair");
		EObject _localVariable_1 = match.getObject("srcLocation");
		EObject _localVariable_2 = match.getObject("positionPoint");
		EObject _localVariable_3 = match.getObject("asset");
		EObject tmpPair = _localVariable_0;
		EObject tmpSrcLocation = _localVariable_1;
		EObject tmpPositionPoint = _localVariable_2;
		EObject tmpAsset = _localVariable_3;
		if (tmpPair instanceof MeterAssetPhysicalDevicePair) {
			MeterAssetPhysicalDevicePair pair = (MeterAssetPhysicalDevicePair) tmpPair;
			if (tmpSrcLocation instanceof Location) {
				Location srcLocation = (Location) tmpSrcLocation;
				if (tmpPositionPoint instanceof gluemodel.CIM.IEC61968.Common.PositionPoint) {
					gluemodel.CIM.IEC61968.Common.PositionPoint positionPoint = (gluemodel.CIM.IEC61968.Common.PositionPoint) tmpPositionPoint;
					if (tmpAsset instanceof MeterAsset) {
						MeterAsset asset = (MeterAsset) tmpAsset;
						return new Object[] { pair, srcLocation, positionPoint, asset, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PositionPoint_2_2_corematch_blackBFBBFBB(
			MeterAssetPhysicalDevicePair pair, Location srcLocation,
			gluemodel.CIM.IEC61968.Common.PositionPoint positionPoint, MeterAsset asset, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (LocationToLocation locationToLocation : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(srcLocation, LocationToLocation.class, "source")) {
			outageDetectionJointarget.Location trgLocation = locationToLocation.getTarget();
			if (trgLocation != null) {
				_result.add(new Object[] { pair, trgLocation, srcLocation, positionPoint, locationToLocation, asset,
						match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_PositionPoint_2_3_findcontext_blackBBBBBB(
			MeterAssetPhysicalDevicePair pair, outageDetectionJointarget.Location trgLocation, Location srcLocation,
			gluemodel.CIM.IEC61968.Common.PositionPoint positionPoint, LocationToLocation locationToLocation,
			MeterAsset asset) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (asset.equals(pair.getA())) {
			if (trgLocation.equals(locationToLocation.getTarget())) {
				if (srcLocation.equals(asset.getLocation())) {
					if (positionPoint.equals(srcLocation.getPosition())) {
						if (srcLocation.equals(locationToLocation.getSource())) {
							_result.add(new Object[] { pair, trgLocation, srcLocation, positionPoint,
									locationToLocation, asset });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_PositionPoint_2_3_findcontext_greenBBBBBBFFFFFFF(
			MeterAssetPhysicalDevicePair pair, outageDetectionJointarget.Location trgLocation, Location srcLocation,
			gluemodel.CIM.IEC61968.Common.PositionPoint positionPoint, LocationToLocation locationToLocation,
			MeterAsset asset) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge pair__asset____a = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge locationToLocation__trgLocation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge asset__srcLocation____Location = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocation__asset____Assets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcLocation__positionPoint____Position = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge locationToLocation__srcLocation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String pair__asset____a_name_prime = "a";
		String locationToLocation__trgLocation____target_name_prime = "target";
		String asset__srcLocation____Location_name_prime = "Location";
		String srcLocation__asset____Assets_name_prime = "Assets";
		String srcLocation__positionPoint____Position_name_prime = "Position";
		String locationToLocation__srcLocation____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(pair);
		isApplicableMatch.getAllContextElements().add(trgLocation);
		isApplicableMatch.getAllContextElements().add(srcLocation);
		isApplicableMatch.getAllContextElements().add(positionPoint);
		isApplicableMatch.getAllContextElements().add(locationToLocation);
		isApplicableMatch.getAllContextElements().add(asset);
		pair__asset____a.setSrc(pair);
		pair__asset____a.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(pair__asset____a);
		locationToLocation__trgLocation____target.setSrc(locationToLocation);
		locationToLocation__trgLocation____target.setTrg(trgLocation);
		isApplicableMatch.getAllContextElements().add(locationToLocation__trgLocation____target);
		asset__srcLocation____Location.setSrc(asset);
		asset__srcLocation____Location.setTrg(srcLocation);
		isApplicableMatch.getAllContextElements().add(asset__srcLocation____Location);
		srcLocation__asset____Assets.setSrc(srcLocation);
		srcLocation__asset____Assets.setTrg(asset);
		isApplicableMatch.getAllContextElements().add(srcLocation__asset____Assets);
		srcLocation__positionPoint____Position.setSrc(srcLocation);
		srcLocation__positionPoint____Position.setTrg(positionPoint);
		isApplicableMatch.getAllContextElements().add(srcLocation__positionPoint____Position);
		locationToLocation__srcLocation____source.setSrc(locationToLocation);
		locationToLocation__srcLocation____source.setTrg(srcLocation);
		isApplicableMatch.getAllContextElements().add(locationToLocation__srcLocation____source);
		pair__asset____a.setName(pair__asset____a_name_prime);
		locationToLocation__trgLocation____target.setName(locationToLocation__trgLocation____target_name_prime);
		asset__srcLocation____Location.setName(asset__srcLocation____Location_name_prime);
		srcLocation__asset____Assets.setName(srcLocation__asset____Assets_name_prime);
		srcLocation__positionPoint____Position.setName(srcLocation__positionPoint____Position_name_prime);
		locationToLocation__srcLocation____source.setName(locationToLocation__srcLocation____source_name_prime);
		return new Object[] { pair, trgLocation, srcLocation, positionPoint, locationToLocation, asset,
				isApplicableMatch, pair__asset____a, locationToLocation__trgLocation____target,
				asset__srcLocation____Location, srcLocation__asset____Assets, srcLocation__positionPoint____Position,
				locationToLocation__srcLocation____source };
	}

	public static final Object[] pattern_PositionPoint_2_4_solveCSP_bindingFBBBBBBBB(PositionPoint _this,
			IsApplicableMatch isApplicableMatch, MeterAssetPhysicalDevicePair pair,
			outageDetectionJointarget.Location trgLocation, Location srcLocation,
			gluemodel.CIM.IEC61968.Common.PositionPoint positionPoint, LocationToLocation locationToLocation,
			MeterAsset asset) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, pair, trgLocation, srcLocation,
				positionPoint, locationToLocation, asset);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, pair, trgLocation, srcLocation, positionPoint,
					locationToLocation, asset };
		}
		return null;
	}

	public static final Object[] pattern_PositionPoint_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PositionPoint_2_4_solveCSP_bindingAndBlackFBBBBBBBB(PositionPoint _this,
			IsApplicableMatch isApplicableMatch, MeterAssetPhysicalDevicePair pair,
			outageDetectionJointarget.Location trgLocation, Location srcLocation,
			gluemodel.CIM.IEC61968.Common.PositionPoint positionPoint, LocationToLocation locationToLocation,
			MeterAsset asset) {
		Object[] result_pattern_PositionPoint_2_4_solveCSP_binding = pattern_PositionPoint_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, pair, trgLocation, srcLocation, positionPoint, locationToLocation, asset);
		if (result_pattern_PositionPoint_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PositionPoint_2_4_solveCSP_binding[0];

			Object[] result_pattern_PositionPoint_2_4_solveCSP_black = pattern_PositionPoint_2_4_solveCSP_blackB(csp);
			if (result_pattern_PositionPoint_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, pair, trgLocation, srcLocation, positionPoint,
						locationToLocation, asset };
			}
		}
		return null;
	}

	public static final boolean pattern_PositionPoint_2_5_checkCSP_expressionFBB(PositionPoint _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PositionPoint_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_PositionPoint_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "PositionPoint";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_PositionPoint_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PositionPoint_10_1_preparereturnvalue_bindingFB(PositionPoint _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PositionPoint_10_1_preparereturnvalue_blackFBBF(EClass __eClass,
			PositionPoint _this) {
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

	public static final Object[] pattern_PositionPoint_10_1_preparereturnvalue_bindingAndBlackFFBF(
			PositionPoint _this) {
		Object[] result_pattern_PositionPoint_10_1_preparereturnvalue_binding = pattern_PositionPoint_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_PositionPoint_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_PositionPoint_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_PositionPoint_10_1_preparereturnvalue_black = pattern_PositionPoint_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_PositionPoint_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PositionPoint_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_PositionPoint_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_PositionPoint_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_PositionPoint_10_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_Position) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSrcLocation = _edge_Position.getSrc();
		if (tmpSrcLocation instanceof Location) {
			Location srcLocation = (Location) tmpSrcLocation;
			EObject tmpPositionPoint = _edge_Position.getTrg();
			if (tmpPositionPoint instanceof gluemodel.CIM.IEC61968.Common.PositionPoint) {
				gluemodel.CIM.IEC61968.Common.PositionPoint positionPoint = (gluemodel.CIM.IEC61968.Common.PositionPoint) tmpPositionPoint;
				if (positionPoint.equals(srcLocation.getPosition())) {
					for (Asset tmpAsset : srcLocation.getAssets()) {
						if (tmpAsset instanceof MeterAsset) {
							MeterAsset asset = (MeterAsset) tmpAsset;
							for (MeterAssetPhysicalDevicePair pair : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(asset, MeterAssetPhysicalDevicePair.class, "a")) {
								_result.add(new Object[] { pair, srcLocation, positionPoint, asset, _edge_Position });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_PositionPoint_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PositionPoint_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			PositionPoint _this, Match match, MeterAssetPhysicalDevicePair pair, Location srcLocation,
			gluemodel.CIM.IEC61968.Common.PositionPoint positionPoint, MeterAsset asset) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, pair, srcLocation, positionPoint, asset);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PositionPoint_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			PositionPoint _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PositionPoint_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_PositionPoint_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_PositionPoint_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PositionPoint_13_1_matchtggpattern_blackBBBB(MeterAssetPhysicalDevicePair pair,
			Location srcLocation, gluemodel.CIM.IEC61968.Common.PositionPoint positionPoint, MeterAsset asset) {
		if (asset.equals(pair.getA())) {
			if (srcLocation.equals(asset.getLocation())) {
				if (positionPoint.equals(srcLocation.getPosition())) {
					return new Object[] { pair, srcLocation, positionPoint, asset };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_PositionPoint_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PositionPoint_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //PositionPointImpl
