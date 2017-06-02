/**
 */
package rgse.ttc17.emoflon.tgg.task1.Rules;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.moflon.tgg.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see rgse.ttc17.emoflon.tgg.task1.Rules.RulesFactory
 * @model kind="package"
 * @generated
 */
public interface RulesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Rules";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/rgse.ttc17.emoflon.tgg.task1/model/Task1.ecore#//Rules";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Rules";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RulesPackage eINSTANCE = rgse.ttc17.emoflon.tgg.task1.Rules.impl.RulesPackageImpl.init();

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.impl.EnergyConsumerImpl <em>Energy Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.impl.EnergyConsumerImpl
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.impl.RulesPackageImpl#getEnergyConsumer()
	 * @generated
	 */
	int ENERGY_CONSUMER = 0;

	/**
	 * The number of structural features of the '<em>Energy Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER___IS_APPROPRIATE_FWD__MATCH_PHYSICALDEVICE_SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR_AUTOCONNECTOBJECT_ELECTRICITYVALUES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PHYSICALDEVICE_SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR_AUTOCONNECTOBJECT_ELECTRICITYVALUES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PHYSICALDEVICE_SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR_AUTOCONNECTOBJECT_ELECTRICITYVALUES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PHYSICALDEVICE_SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR_AUTOCONNECTOBJECT_ELECTRICITYVALUES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 131</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER___IS_APPROPRIATE_FWD_EMOFLON_EDGE_131__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER___CHECK_DEC_FWD__PHYSICALDEVICE_SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR_AUTOCONNECTOBJECT_ELECTRICITYVALUES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Energy Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.impl.EnergyConsumerWithIDNonConfLoadImpl <em>Energy Consumer With ID Non Conf Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.impl.EnergyConsumerWithIDNonConfLoadImpl
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.impl.RulesPackageImpl#getEnergyConsumerWithIDNonConfLoad()
	 * @generated
	 */
	int ENERGY_CONSUMER_WITH_ID_NON_CONF_LOAD = 1;

	/**
	 * The number of structural features of the '<em>Energy Consumer With ID Non Conf Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID_NON_CONF_LOAD_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID_NON_CONF_LOAD___IS_APPROPRIATE_FWD__MATCH_SUBLOADAREA_ELECTRICITYVALUES_SERVICEDELIVERYPOINT_CONTROLAREA_METERASSETPHYSICALDEVICEPAIR_METERASSET_PHYSICALDEVICE_NONCONFORMLOAD_AUTOCONNECTOBJECT_NONCONFORMLOADGROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID_NON_CONF_LOAD___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID_NON_CONF_LOAD___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID_NON_CONF_LOAD___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SUBLOADAREA_ELECTRICITYVALUES_SERVICEDELIVERYPOINT_CONTROLAREA_METERASSETPHYSICALDEVICEPAIR_METERASSET_PHYSICALDEVICE_NONCONFORMLOAD_AUTOCONNECTOBJECT_NONCONFORMLOADGROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID_NON_CONF_LOAD___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SUBLOADAREA_ELECTRICITYVALUES_SERVICEDELIVERYPOINT_CONTROLAREA_METERASSETPHYSICALDEVICEPAIR_METERASSET_PHYSICALDEVICE_NONCONFORMLOAD_AUTOCONNECTOBJECT_NONCONFORMLOADGROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID_NON_CONF_LOAD___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID_NON_CONF_LOAD___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SUBLOADAREA_ELECTRICITYVALUES_SERVICEDELIVERYPOINT_CONTROLAREA_METERASSETPHYSICALDEVICEPAIR_METERASSET_PHYSICALDEVICE_NONCONFORMLOAD_AUTOCONNECTOBJECT_NONCONFORMLOADGROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID_NON_CONF_LOAD___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID_NON_CONF_LOAD___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID_NON_CONF_LOAD___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 132</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID_NON_CONF_LOAD___IS_APPROPRIATE_FWD_EMOFLON_EDGE_132__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID_NON_CONF_LOAD___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID_NON_CONF_LOAD___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID_NON_CONF_LOAD___CHECK_DEC_FWD__SUBLOADAREA_ELECTRICITYVALUES_SERVICEDELIVERYPOINT_CONTROLAREA_METERASSETPHYSICALDEVICEPAIR_METERASSET_PHYSICALDEVICE_NONCONFORMLOAD_AUTOCONNECTOBJECT_NONCONFORMLOADGROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Energy Consumer With ID Non Conf Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID_NON_CONF_LOAD_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.impl.PositionPointLinkImpl <em>Position Point Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.impl.PositionPointLinkImpl
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.impl.RulesPackageImpl#getPositionPointLink()
	 * @generated
	 */
	int POSITION_POINT_LINK = 2;

	/**
	 * The number of structural features of the '<em>Position Point Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT_LINK_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT_LINK___IS_APPROPRIATE_FWD__MATCH_LOCATION_METERASSET_POSITIONPOINT_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT_LINK___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT_LINK___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT_LINK___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_LOCATION_METERASSET_POSITIONPOINT_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT_LINK___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_LOCATION_METERASSET_POSITIONPOINT_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT_LINK___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT_LINK___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_LOCATIONTOLOCATION_LOCATION_POSITIONPOINTTOPOSITIONPOINT_METERASSET_LOCATION_POSITIONPOINT_POSITIONPOINT_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT_LINK___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT_LINK___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT_LINK___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 133</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT_LINK___IS_APPROPRIATE_FWD_EMOFLON_EDGE_133__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT_LINK___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT_LINK___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT_LINK___CHECK_DEC_FWD__LOCATION_METERASSET_POSITIONPOINT_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Position Point Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT_LINK_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.impl.LocationImpl
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.impl.RulesPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 3;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___IS_APPROPRIATE_FWD__MATCH_METERASSETPHYSICALDEVICEPAIR_LOCATION_METERASSET = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_METERASSETPHYSICALDEVICEPAIR_LOCATION_METERASSET = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_METERASSETPHYSICALDEVICEPAIR_LOCATION_METERASSET = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_METERASSETPHYSICALDEVICEPAIR_LOCATION_METERASSET_ENERGYCONSUMER_METERASSETTOENERGYCONSUMER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 134</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_134__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___CHECK_DEC_FWD__METERASSETPHYSICALDEVICEPAIR_LOCATION_METERASSET = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.impl.EnergyConsumerWithIDImpl <em>Energy Consumer With ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.impl.EnergyConsumerWithIDImpl
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.impl.RulesPackageImpl#getEnergyConsumerWithID()
	 * @generated
	 */
	int ENERGY_CONSUMER_WITH_ID = 4;

	/**
	 * The number of structural features of the '<em>Energy Consumer With ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID___IS_APPROPRIATE_FWD__MATCH_ELECTRICITYVALUES_SERVICEDELIVERYPOINT_METERASSET_PHYSICALDEVICE_ENERGYCONSUMER_METERASSETPHYSICALDEVICEPAIR_AUTOCONNECTOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ELECTRICITYVALUES_SERVICEDELIVERYPOINT_METERASSET_PHYSICALDEVICE_ENERGYCONSUMER_METERASSETPHYSICALDEVICEPAIR_AUTOCONNECTOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ELECTRICITYVALUES_SERVICEDELIVERYPOINT_METERASSET_PHYSICALDEVICE_ENERGYCONSUMER_METERASSETPHYSICALDEVICEPAIR_AUTOCONNECTOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ELECTRICITYVALUES_SERVICEDELIVERYPOINT_METERASSET_PHYSICALDEVICE_ENERGYCONSUMER_METERASSETPHYSICALDEVICEPAIR_AUTOCONNECTOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 135</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID___IS_APPROPRIATE_FWD_EMOFLON_EDGE_135__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID___CHECK_DEC_FWD__ELECTRICITYVALUES_SERVICEDELIVERYPOINT_METERASSET_PHYSICALDEVICE_ENERGYCONSUMER_METERASSETPHYSICALDEVICEPAIR_AUTOCONNECTOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Energy Consumer With ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.impl.ZoneImpl <em>Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.impl.ZoneImpl
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.impl.RulesPackageImpl#getZone()
	 * @generated
	 */
	int ZONE = 5;

	/**
	 * The number of structural features of the '<em>Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE___IS_APPROPRIATE_FWD__MATCH_ZONE_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ZONE_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ZONE_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_METERASSETTOENERGYCONSUMER_ZONE_METERASSET_METERASSETPHYSICALDEVICEPAIR_ENERGYCONSUMER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 136</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_136__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE___CHECK_DEC_FWD__ZONE_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.impl.ServiceLocationImpl <em>Service Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.impl.ServiceLocationImpl
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.impl.RulesPackageImpl#getServiceLocation()
	 * @generated
	 */
	int SERVICE_LOCATION = 6;

	/**
	 * The number of structural features of the '<em>Service Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION___IS_APPROPRIATE_FWD__MATCH_SERVICELOCATION_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SERVICELOCATION_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SERVICELOCATION_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_METERASSETTOENERGYCONSUMER_SERVICELOCATION_METERASSET_METERASSETPHYSICALDEVICEPAIR_ENERGYCONSUMER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 137</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_137__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION___CHECK_DEC_FWD__SERVICELOCATION_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Service Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.impl.EnergyConsumerWithIDConfLoadImpl <em>Energy Consumer With ID Conf Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.impl.EnergyConsumerWithIDConfLoadImpl
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.impl.RulesPackageImpl#getEnergyConsumerWithIDConfLoad()
	 * @generated
	 */
	int ENERGY_CONSUMER_WITH_ID_CONF_LOAD = 7;

	/**
	 * The number of structural features of the '<em>Energy Consumer With ID Conf Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID_CONF_LOAD_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID_CONF_LOAD___IS_APPROPRIATE_FWD__MATCH_SUBLOADAREA_ELECTRICITYVALUES_SERVICEDELIVERYPOINT_CONTROLAREA_METERASSETPHYSICALDEVICEPAIR_METERASSET_PHYSICALDEVICE_CONFORMLOAD_AUTOCONNECTOBJECT_CONFORMLOADGROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID_CONF_LOAD___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID_CONF_LOAD___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID_CONF_LOAD___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SUBLOADAREA_ELECTRICITYVALUES_SERVICEDELIVERYPOINT_CONTROLAREA_METERASSETPHYSICALDEVICEPAIR_METERASSET_PHYSICALDEVICE_CONFORMLOAD_AUTOCONNECTOBJECT_CONFORMLOADGROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID_CONF_LOAD___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SUBLOADAREA_ELECTRICITYVALUES_SERVICEDELIVERYPOINT_CONTROLAREA_METERASSETPHYSICALDEVICEPAIR_METERASSET_PHYSICALDEVICE_CONFORMLOAD_AUTOCONNECTOBJECT_CONFORMLOADGROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID_CONF_LOAD___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID_CONF_LOAD___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SUBLOADAREA_ELECTRICITYVALUES_SERVICEDELIVERYPOINT_CONTROLAREA_METERASSETPHYSICALDEVICEPAIR_METERASSET_PHYSICALDEVICE_CONFORMLOAD_AUTOCONNECTOBJECT_CONFORMLOADGROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID_CONF_LOAD___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID_CONF_LOAD___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID_CONF_LOAD___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 138</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID_CONF_LOAD___IS_APPROPRIATE_FWD_EMOFLON_EDGE_138__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID_CONF_LOAD___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID_CONF_LOAD___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID_CONF_LOAD___CHECK_DEC_FWD__SUBLOADAREA_ELECTRICITYVALUES_SERVICEDELIVERYPOINT_CONTROLAREA_METERASSETPHYSICALDEVICEPAIR_METERASSET_PHYSICALDEVICE_CONFORMLOAD_AUTOCONNECTOBJECT_CONFORMLOADGROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Energy Consumer With ID Conf Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_WITH_ID_CONF_LOAD_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.impl.PositionPointImpl <em>Position Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.impl.PositionPointImpl
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.impl.RulesPackageImpl#getPositionPoint()
	 * @generated
	 */
	int POSITION_POINT = 8;

	/**
	 * The number of structural features of the '<em>Position Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT___IS_APPROPRIATE_FWD__MATCH_METERASSET_POSITIONPOINT_METERASSETPHYSICALDEVICEPAIR_LOCATION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_METERASSET_POSITIONPOINT_METERASSETPHYSICALDEVICEPAIR_LOCATION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_METERASSET_POSITIONPOINT_METERASSETPHYSICALDEVICEPAIR_LOCATION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_METERASSET_POSITIONPOINT_METERASSETPHYSICALDEVICEPAIR_LOCATION_LOCATIONTOLOCATION_LOCATION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 139</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_139__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT___CHECK_DEC_FWD__METERASSET_POSITIONPOINT_METERASSETPHYSICALDEVICEPAIR_LOCATION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Position Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.impl.GmlPositionImpl <em>Gml Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.impl.GmlPositionImpl
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.impl.RulesPackageImpl#getGmlPosition()
	 * @generated
	 */
	int GML_POSITION = 9;

	/**
	 * The number of structural features of the '<em>Gml Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION___IS_APPROPRIATE_FWD__MATCH_GMLPOSITION_LOCATION_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_GMLPOSITION_LOCATION_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_GMLPOSITION_LOCATION_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_GMLPOSITION_LOCATIONTOLOCATION_LOCATION_LOCATION_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 140</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_140__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION___CHECK_DEC_FWD__GMLPOSITION_LOCATION_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Gml Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.impl.LocationLinkImpl <em>Location Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.impl.LocationLinkImpl
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.impl.RulesPackageImpl#getLocationLink()
	 * @generated
	 */
	int LOCATION_LINK = 10;

	/**
	 * The number of structural features of the '<em>Location Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_LINK_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_LINK___IS_APPROPRIATE_FWD__MATCH_METERASSET_METERASSETPHYSICALDEVICEPAIR_LOCATION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_LINK___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_LINK___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_LINK___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_METERASSET_METERASSETPHYSICALDEVICEPAIR_LOCATION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_LINK___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_METERASSET_METERASSETPHYSICALDEVICEPAIR_LOCATION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_LINK___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_LINK___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_METERASSET_ENERGYCONSUMER_METERASSETPHYSICALDEVICEPAIR_LOCATION_LOCATIONTOLOCATION_LOCATION_METERASSETTOENERGYCONSUMER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_LINK___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_LINK___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_LINK___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 141</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_LINK___IS_APPROPRIATE_FWD_EMOFLON_EDGE_141__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_LINK___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_LINK___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_LINK___CHECK_DEC_FWD__METERASSET_METERASSETPHYSICALDEVICEPAIR_LOCATION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Location Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_LINK_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.impl.SDPLocationImpl <em>SDP Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.impl.SDPLocationImpl
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.impl.RulesPackageImpl#getSDPLocation()
	 * @generated
	 */
	int SDP_LOCATION = 11;

	/**
	 * The number of structural features of the '<em>SDP Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION___IS_APPROPRIATE_FWD__MATCH_SDPLOCATION_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SDPLOCATION_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SDPLOCATION_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_METERASSETTOENERGYCONSUMER_SDPLOCATION_METERASSET_METERASSETPHYSICALDEVICEPAIR_ENERGYCONSUMER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 142</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_142__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION___CHECK_DEC_FWD__SDPLOCATION_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>SDP Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.impl.WorkLocationImpl <em>Work Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.impl.WorkLocationImpl
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.impl.RulesPackageImpl#getWorkLocation()
	 * @generated
	 */
	int WORK_LOCATION = 12;

	/**
	 * The number of structural features of the '<em>Work Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION___IS_APPROPRIATE_FWD__MATCH_WORKLOCATION_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_WORKLOCATION_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_WORKLOCATION_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_METERASSETTOENERGYCONSUMER_WORKLOCATION_METERASSET_METERASSETPHYSICALDEVICEPAIR_ENERGYCONSUMER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 143</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_143__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION___CHECK_DEC_FWD__WORKLOCATION_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Work Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumer <em>Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energy Consumer</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumer
	 * @generated
	 */
	EClass getEnergyConsumer();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumer#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.COSEM.COSEMObjects.AutoConnectObject, gluemodel.COSEM.COSEMObjects.ElectricityValues) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumer#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.COSEM.COSEMObjects.AutoConnectObject, gluemodel.COSEM.COSEMObjects.ElectricityValues)
	 * @generated
	 */
	EOperation getEnergyConsumer__IsAppropriate_FWD__Match_PhysicalDevice_ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair_AutoConnectObject_ElectricityValues();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumer#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumer#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getEnergyConsumer__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumer#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumer#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getEnergyConsumer__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumer#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.COSEM.COSEMObjects.AutoConnectObject, gluemodel.COSEM.COSEMObjects.ElectricityValues) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumer#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.COSEM.COSEMObjects.AutoConnectObject, gluemodel.COSEM.COSEMObjects.ElectricityValues)
	 * @generated
	 */
	EOperation getEnergyConsumer__RegisterObjectsToMatch_FWD__Match_PhysicalDevice_ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair_AutoConnectObject_ElectricityValues();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumer#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.COSEM.COSEMObjects.AutoConnectObject, gluemodel.COSEM.COSEMObjects.ElectricityValues) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumer#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.COSEM.COSEMObjects.AutoConnectObject, gluemodel.COSEM.COSEMObjects.ElectricityValues)
	 * @generated
	 */
	EOperation getEnergyConsumer__IsAppropriate_solveCsp_FWD__Match_PhysicalDevice_ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair_AutoConnectObject_ElectricityValues();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumer#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumer#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getEnergyConsumer__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumer#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.COSEM.COSEMObjects.AutoConnectObject, gluemodel.COSEM.COSEMObjects.ElectricityValues) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumer#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.COSEM.COSEMObjects.AutoConnectObject, gluemodel.COSEM.COSEMObjects.ElectricityValues)
	 * @generated
	 */
	EOperation getEnergyConsumer__IsApplicable_solveCsp_FWD__IsApplicableMatch_PhysicalDevice_ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair_AutoConnectObject_ElectricityValues();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumer#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumer#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getEnergyConsumer__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumer#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumer#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEnergyConsumer__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumer#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumer#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getEnergyConsumer__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumer#isAppropriate_FWD_EMoflonEdge_131(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 131</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 131</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumer#isAppropriate_FWD_EMoflonEdge_131(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEnergyConsumer__IsAppropriate_FWD_EMoflonEdge_131__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumer#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumer#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getEnergyConsumer__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumer#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumer#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getEnergyConsumer__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumer#checkDEC_FWD(gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.COSEM.COSEMObjects.AutoConnectObject, gluemodel.COSEM.COSEMObjects.ElectricityValues) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumer#checkDEC_FWD(gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.COSEM.COSEMObjects.AutoConnectObject, gluemodel.COSEM.COSEMObjects.ElectricityValues)
	 * @generated
	 */
	EOperation getEnergyConsumer__CheckDEC_FWD__PhysicalDevice_ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair_AutoConnectObject_ElectricityValues();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDNonConfLoad <em>Energy Consumer With ID Non Conf Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energy Consumer With ID Non Conf Load</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDNonConfLoad
	 * @generated
	 */
	EClass getEnergyConsumerWithIDNonConfLoad();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDNonConfLoad#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.ControlArea.ControlArea, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad, gluemodel.COSEM.COSEMObjects.AutoConnectObject, gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDNonConfLoad#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.ControlArea.ControlArea, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad, gluemodel.COSEM.COSEMObjects.AutoConnectObject, gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup)
	 * @generated
	 */
	EOperation getEnergyConsumerWithIDNonConfLoad__IsAppropriate_FWD__Match_SubLoadArea_ElectricityValues_ServiceDeliveryPoint_ControlArea_MeterAssetPhysicalDevicePair_MeterAsset_PhysicalDevice_NonConformLoad_AutoConnectObject_NonConformLoadGroup();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDNonConfLoad#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDNonConfLoad#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getEnergyConsumerWithIDNonConfLoad__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDNonConfLoad#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDNonConfLoad#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getEnergyConsumerWithIDNonConfLoad__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDNonConfLoad#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.ControlArea.ControlArea, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad, gluemodel.COSEM.COSEMObjects.AutoConnectObject, gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDNonConfLoad#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.ControlArea.ControlArea, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad, gluemodel.COSEM.COSEMObjects.AutoConnectObject, gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup)
	 * @generated
	 */
	EOperation getEnergyConsumerWithIDNonConfLoad__RegisterObjectsToMatch_FWD__Match_SubLoadArea_ElectricityValues_ServiceDeliveryPoint_ControlArea_MeterAssetPhysicalDevicePair_MeterAsset_PhysicalDevice_NonConformLoad_AutoConnectObject_NonConformLoadGroup();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDNonConfLoad#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.ControlArea.ControlArea, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad, gluemodel.COSEM.COSEMObjects.AutoConnectObject, gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDNonConfLoad#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.ControlArea.ControlArea, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad, gluemodel.COSEM.COSEMObjects.AutoConnectObject, gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup)
	 * @generated
	 */
	EOperation getEnergyConsumerWithIDNonConfLoad__IsAppropriate_solveCsp_FWD__Match_SubLoadArea_ElectricityValues_ServiceDeliveryPoint_ControlArea_MeterAssetPhysicalDevicePair_MeterAsset_PhysicalDevice_NonConformLoad_AutoConnectObject_NonConformLoadGroup();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDNonConfLoad#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDNonConfLoad#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getEnergyConsumerWithIDNonConfLoad__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDNonConfLoad#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.ControlArea.ControlArea, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad, gluemodel.COSEM.COSEMObjects.AutoConnectObject, gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDNonConfLoad#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.ControlArea.ControlArea, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad, gluemodel.COSEM.COSEMObjects.AutoConnectObject, gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup)
	 * @generated
	 */
	EOperation getEnergyConsumerWithIDNonConfLoad__IsApplicable_solveCsp_FWD__IsApplicableMatch_SubLoadArea_ElectricityValues_ServiceDeliveryPoint_ControlArea_MeterAssetPhysicalDevicePair_MeterAsset_PhysicalDevice_NonConformLoad_AutoConnectObject_NonConformLoadGroup();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDNonConfLoad#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDNonConfLoad#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getEnergyConsumerWithIDNonConfLoad__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDNonConfLoad#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDNonConfLoad#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEnergyConsumerWithIDNonConfLoad__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDNonConfLoad#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDNonConfLoad#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getEnergyConsumerWithIDNonConfLoad__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDNonConfLoad#isAppropriate_FWD_EMoflonEdge_132(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 132</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 132</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDNonConfLoad#isAppropriate_FWD_EMoflonEdge_132(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEnergyConsumerWithIDNonConfLoad__IsAppropriate_FWD_EMoflonEdge_132__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDNonConfLoad#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDNonConfLoad#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getEnergyConsumerWithIDNonConfLoad__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDNonConfLoad#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDNonConfLoad#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getEnergyConsumerWithIDNonConfLoad__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDNonConfLoad#checkDEC_FWD(gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.ControlArea.ControlArea, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad, gluemodel.COSEM.COSEMObjects.AutoConnectObject, gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDNonConfLoad#checkDEC_FWD(gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.ControlArea.ControlArea, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad, gluemodel.COSEM.COSEMObjects.AutoConnectObject, gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup)
	 * @generated
	 */
	EOperation getEnergyConsumerWithIDNonConfLoad__CheckDEC_FWD__SubLoadArea_ElectricityValues_ServiceDeliveryPoint_ControlArea_MeterAssetPhysicalDevicePair_MeterAsset_PhysicalDevice_NonConformLoad_AutoConnectObject_NonConformLoadGroup();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task1.Rules.PositionPointLink <em>Position Point Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Point Link</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.PositionPointLink
	 * @generated
	 */
	EClass getPositionPointLink();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.PositionPointLink#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.PositionPoint, gluemodel.MeterAssetPhysicalDevicePair) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.PositionPointLink#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.PositionPoint, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getPositionPointLink__IsAppropriate_FWD__Match_Location_MeterAsset_PositionPoint_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.PositionPointLink#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.PositionPointLink#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getPositionPointLink__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.PositionPointLink#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.PositionPointLink#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getPositionPointLink__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.PositionPointLink#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.PositionPoint, gluemodel.MeterAssetPhysicalDevicePair) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.PositionPointLink#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.PositionPoint, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getPositionPointLink__RegisterObjectsToMatch_FWD__Match_Location_MeterAsset_PositionPoint_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.PositionPointLink#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.PositionPoint, gluemodel.MeterAssetPhysicalDevicePair) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.PositionPointLink#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.PositionPoint, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getPositionPointLink__IsAppropriate_solveCsp_FWD__Match_Location_MeterAsset_PositionPoint_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.PositionPointLink#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.PositionPointLink#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getPositionPointLink__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.PositionPointLink#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, rgse.ttc17.emoflon.tgg.task1.LocationToLocation, gluemodel.CIM.IEC61968.Common.Location, rgse.ttc17.emoflon.tgg.task1.PositionPointToPositionPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, outageDetectionJointarget.Location, outageDetectionJointarget.PositionPoint, gluemodel.CIM.IEC61968.Common.PositionPoint, gluemodel.MeterAssetPhysicalDevicePair) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.PositionPointLink#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, rgse.ttc17.emoflon.tgg.task1.LocationToLocation, gluemodel.CIM.IEC61968.Common.Location, rgse.ttc17.emoflon.tgg.task1.PositionPointToPositionPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, outageDetectionJointarget.Location, outageDetectionJointarget.PositionPoint, gluemodel.CIM.IEC61968.Common.PositionPoint, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getPositionPointLink__IsApplicable_solveCsp_FWD__IsApplicableMatch_LocationToLocation_Location_PositionPointToPositionPoint_MeterAsset_Location_PositionPoint_PositionPoint_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.PositionPointLink#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.PositionPointLink#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getPositionPointLink__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.PositionPointLink#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.PositionPointLink#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getPositionPointLink__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.PositionPointLink#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.PositionPointLink#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getPositionPointLink__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.PositionPointLink#isAppropriate_FWD_EMoflonEdge_133(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 133</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 133</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.PositionPointLink#isAppropriate_FWD_EMoflonEdge_133(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPositionPointLink__IsAppropriate_FWD_EMoflonEdge_133__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.PositionPointLink#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.PositionPointLink#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getPositionPointLink__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.PositionPointLink#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.PositionPointLink#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getPositionPointLink__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.PositionPointLink#checkDEC_FWD(gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.PositionPoint, gluemodel.MeterAssetPhysicalDevicePair) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.PositionPointLink#checkDEC_FWD(gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.PositionPoint, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getPositionPointLink__CheckDEC_FWD__Location_MeterAsset_PositionPoint_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task1.Rules.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.Location#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.Location#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset)
	 * @generated
	 */
	EOperation getLocation__IsAppropriate_FWD__Match_MeterAssetPhysicalDevicePair_Location_MeterAsset();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.Location#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.Location#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getLocation__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.Location#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.Location#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getLocation__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.Location#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.Location#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset)
	 * @generated
	 */
	EOperation getLocation__RegisterObjectsToMatch_FWD__Match_MeterAssetPhysicalDevicePair_Location_MeterAsset();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.Location#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.Location#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset)
	 * @generated
	 */
	EOperation getLocation__IsAppropriate_solveCsp_FWD__Match_MeterAssetPhysicalDevicePair_Location_MeterAsset();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.Location#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.Location#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getLocation__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.Location#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset, outageDetectionJointarget.EnergyConsumer, rgse.ttc17.emoflon.tgg.task1.MeterAssetToEnergyConsumer) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.Location#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset, outageDetectionJointarget.EnergyConsumer, rgse.ttc17.emoflon.tgg.task1.MeterAssetToEnergyConsumer)
	 * @generated
	 */
	EOperation getLocation__IsApplicable_solveCsp_FWD__IsApplicableMatch_MeterAssetPhysicalDevicePair_Location_MeterAsset_EnergyConsumer_MeterAssetToEnergyConsumer();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.Location#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.Location#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getLocation__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.Location#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.Location#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getLocation__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.Location#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.Location#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getLocation__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.Location#isAppropriate_FWD_EMoflonEdge_134(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 134</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 134</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.Location#isAppropriate_FWD_EMoflonEdge_134(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLocation__IsAppropriate_FWD_EMoflonEdge_134__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.Location#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.Location#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getLocation__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.Location#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.Location#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getLocation__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.Location#checkDEC_FWD(gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.Location#checkDEC_FWD(gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset)
	 * @generated
	 */
	EOperation getLocation__CheckDEC_FWD__MeterAssetPhysicalDevicePair_Location_MeterAsset();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithID <em>Energy Consumer With ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energy Consumer With ID</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithID
	 * @generated
	 */
	EClass getEnergyConsumerWithID();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithID#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61970.Wires.EnergyConsumer, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.COSEM.COSEMObjects.AutoConnectObject) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithID#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61970.Wires.EnergyConsumer, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.COSEM.COSEMObjects.AutoConnectObject)
	 * @generated
	 */
	EOperation getEnergyConsumerWithID__IsAppropriate_FWD__Match_ElectricityValues_ServiceDeliveryPoint_MeterAsset_PhysicalDevice_EnergyConsumer_MeterAssetPhysicalDevicePair_AutoConnectObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithID#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithID#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getEnergyConsumerWithID__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithID#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithID#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getEnergyConsumerWithID__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithID#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61970.Wires.EnergyConsumer, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.COSEM.COSEMObjects.AutoConnectObject) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithID#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61970.Wires.EnergyConsumer, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.COSEM.COSEMObjects.AutoConnectObject)
	 * @generated
	 */
	EOperation getEnergyConsumerWithID__RegisterObjectsToMatch_FWD__Match_ElectricityValues_ServiceDeliveryPoint_MeterAsset_PhysicalDevice_EnergyConsumer_MeterAssetPhysicalDevicePair_AutoConnectObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithID#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61970.Wires.EnergyConsumer, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.COSEM.COSEMObjects.AutoConnectObject) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithID#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61970.Wires.EnergyConsumer, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.COSEM.COSEMObjects.AutoConnectObject)
	 * @generated
	 */
	EOperation getEnergyConsumerWithID__IsAppropriate_solveCsp_FWD__Match_ElectricityValues_ServiceDeliveryPoint_MeterAsset_PhysicalDevice_EnergyConsumer_MeterAssetPhysicalDevicePair_AutoConnectObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithID#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithID#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getEnergyConsumerWithID__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithID#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61970.Wires.EnergyConsumer, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.COSEM.COSEMObjects.AutoConnectObject) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithID#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61970.Wires.EnergyConsumer, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.COSEM.COSEMObjects.AutoConnectObject)
	 * @generated
	 */
	EOperation getEnergyConsumerWithID__IsApplicable_solveCsp_FWD__IsApplicableMatch_ElectricityValues_ServiceDeliveryPoint_MeterAsset_PhysicalDevice_EnergyConsumer_MeterAssetPhysicalDevicePair_AutoConnectObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithID#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithID#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getEnergyConsumerWithID__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithID#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithID#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEnergyConsumerWithID__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithID#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithID#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getEnergyConsumerWithID__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithID#isAppropriate_FWD_EMoflonEdge_135(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 135</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 135</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithID#isAppropriate_FWD_EMoflonEdge_135(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEnergyConsumerWithID__IsAppropriate_FWD_EMoflonEdge_135__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithID#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithID#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getEnergyConsumerWithID__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithID#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithID#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getEnergyConsumerWithID__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithID#checkDEC_FWD(gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61970.Wires.EnergyConsumer, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.COSEM.COSEMObjects.AutoConnectObject) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithID#checkDEC_FWD(gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61970.Wires.EnergyConsumer, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.COSEM.COSEMObjects.AutoConnectObject)
	 * @generated
	 */
	EOperation getEnergyConsumerWithID__CheckDEC_FWD__ElectricityValues_ServiceDeliveryPoint_MeterAsset_PhysicalDevice_EnergyConsumer_MeterAssetPhysicalDevicePair_AutoConnectObject();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task1.Rules.Zone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zone</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.Zone
	 * @generated
	 */
	EClass getZone();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.Zone#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Informative.InfLocations.Zone, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.Zone#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Informative.InfLocations.Zone, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getZone__IsAppropriate_FWD__Match_Zone_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.Zone#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.Zone#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getZone__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.Zone#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.Zone#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getZone__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.Zone#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Informative.InfLocations.Zone, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.Zone#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Informative.InfLocations.Zone, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getZone__RegisterObjectsToMatch_FWD__Match_Zone_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.Zone#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Informative.InfLocations.Zone, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.Zone#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Informative.InfLocations.Zone, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getZone__IsAppropriate_solveCsp_FWD__Match_Zone_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.Zone#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.Zone#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getZone__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.Zone#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, rgse.ttc17.emoflon.tgg.task1.MeterAssetToEnergyConsumer, gluemodel.CIM.IEC61970.Informative.InfLocations.Zone, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, outageDetectionJointarget.EnergyConsumer) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.Zone#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, rgse.ttc17.emoflon.tgg.task1.MeterAssetToEnergyConsumer, gluemodel.CIM.IEC61970.Informative.InfLocations.Zone, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, outageDetectionJointarget.EnergyConsumer)
	 * @generated
	 */
	EOperation getZone__IsApplicable_solveCsp_FWD__IsApplicableMatch_MeterAssetToEnergyConsumer_Zone_MeterAsset_MeterAssetPhysicalDevicePair_EnergyConsumer();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.Zone#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.Zone#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getZone__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.Zone#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.Zone#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getZone__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.Zone#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.Zone#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getZone__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.Zone#isAppropriate_FWD_EMoflonEdge_136(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 136</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 136</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.Zone#isAppropriate_FWD_EMoflonEdge_136(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getZone__IsAppropriate_FWD_EMoflonEdge_136__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.Zone#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.Zone#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getZone__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.Zone#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.Zone#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getZone__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.Zone#checkDEC_FWD(gluemodel.CIM.IEC61970.Informative.InfLocations.Zone, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.Zone#checkDEC_FWD(gluemodel.CIM.IEC61970.Informative.InfLocations.Zone, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getZone__CheckDEC_FWD__Zone_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task1.Rules.ServiceLocation <em>Service Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Location</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.ServiceLocation
	 * @generated
	 */
	EClass getServiceLocation();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.ServiceLocation#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Customers.ServiceLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.ServiceLocation#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Customers.ServiceLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getServiceLocation__IsAppropriate_FWD__Match_ServiceLocation_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.ServiceLocation#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.ServiceLocation#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getServiceLocation__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.ServiceLocation#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.ServiceLocation#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getServiceLocation__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.ServiceLocation#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Customers.ServiceLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.ServiceLocation#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Customers.ServiceLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getServiceLocation__RegisterObjectsToMatch_FWD__Match_ServiceLocation_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.ServiceLocation#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Customers.ServiceLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.ServiceLocation#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Customers.ServiceLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getServiceLocation__IsAppropriate_solveCsp_FWD__Match_ServiceLocation_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.ServiceLocation#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.ServiceLocation#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getServiceLocation__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.ServiceLocation#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, rgse.ttc17.emoflon.tgg.task1.MeterAssetToEnergyConsumer, gluemodel.CIM.IEC61968.Customers.ServiceLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, outageDetectionJointarget.EnergyConsumer) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.ServiceLocation#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, rgse.ttc17.emoflon.tgg.task1.MeterAssetToEnergyConsumer, gluemodel.CIM.IEC61968.Customers.ServiceLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, outageDetectionJointarget.EnergyConsumer)
	 * @generated
	 */
	EOperation getServiceLocation__IsApplicable_solveCsp_FWD__IsApplicableMatch_MeterAssetToEnergyConsumer_ServiceLocation_MeterAsset_MeterAssetPhysicalDevicePair_EnergyConsumer();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.ServiceLocation#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.ServiceLocation#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getServiceLocation__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.ServiceLocation#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.ServiceLocation#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getServiceLocation__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.ServiceLocation#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.ServiceLocation#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getServiceLocation__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.ServiceLocation#isAppropriate_FWD_EMoflonEdge_137(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 137</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 137</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.ServiceLocation#isAppropriate_FWD_EMoflonEdge_137(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getServiceLocation__IsAppropriate_FWD_EMoflonEdge_137__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.ServiceLocation#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.ServiceLocation#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getServiceLocation__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.ServiceLocation#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.ServiceLocation#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getServiceLocation__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.ServiceLocation#checkDEC_FWD(gluemodel.CIM.IEC61968.Customers.ServiceLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.ServiceLocation#checkDEC_FWD(gluemodel.CIM.IEC61968.Customers.ServiceLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getServiceLocation__CheckDEC_FWD__ServiceLocation_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDConfLoad <em>Energy Consumer With ID Conf Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energy Consumer With ID Conf Load</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDConfLoad
	 * @generated
	 */
	EClass getEnergyConsumerWithIDConfLoad();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDConfLoad#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.ControlArea.ControlArea, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.COSEM.COSEMObjects.AutoConnectObject, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDConfLoad#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.ControlArea.ControlArea, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.COSEM.COSEMObjects.AutoConnectObject, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup)
	 * @generated
	 */
	EOperation getEnergyConsumerWithIDConfLoad__IsAppropriate_FWD__Match_SubLoadArea_ElectricityValues_ServiceDeliveryPoint_ControlArea_MeterAssetPhysicalDevicePair_MeterAsset_PhysicalDevice_ConformLoad_AutoConnectObject_ConformLoadGroup();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDConfLoad#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDConfLoad#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getEnergyConsumerWithIDConfLoad__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDConfLoad#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDConfLoad#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getEnergyConsumerWithIDConfLoad__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDConfLoad#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.ControlArea.ControlArea, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.COSEM.COSEMObjects.AutoConnectObject, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDConfLoad#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.ControlArea.ControlArea, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.COSEM.COSEMObjects.AutoConnectObject, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup)
	 * @generated
	 */
	EOperation getEnergyConsumerWithIDConfLoad__RegisterObjectsToMatch_FWD__Match_SubLoadArea_ElectricityValues_ServiceDeliveryPoint_ControlArea_MeterAssetPhysicalDevicePair_MeterAsset_PhysicalDevice_ConformLoad_AutoConnectObject_ConformLoadGroup();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDConfLoad#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.ControlArea.ControlArea, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.COSEM.COSEMObjects.AutoConnectObject, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDConfLoad#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.ControlArea.ControlArea, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.COSEM.COSEMObjects.AutoConnectObject, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup)
	 * @generated
	 */
	EOperation getEnergyConsumerWithIDConfLoad__IsAppropriate_solveCsp_FWD__Match_SubLoadArea_ElectricityValues_ServiceDeliveryPoint_ControlArea_MeterAssetPhysicalDevicePair_MeterAsset_PhysicalDevice_ConformLoad_AutoConnectObject_ConformLoadGroup();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDConfLoad#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDConfLoad#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getEnergyConsumerWithIDConfLoad__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDConfLoad#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.ControlArea.ControlArea, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.COSEM.COSEMObjects.AutoConnectObject, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDConfLoad#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.ControlArea.ControlArea, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.COSEM.COSEMObjects.AutoConnectObject, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup)
	 * @generated
	 */
	EOperation getEnergyConsumerWithIDConfLoad__IsApplicable_solveCsp_FWD__IsApplicableMatch_SubLoadArea_ElectricityValues_ServiceDeliveryPoint_ControlArea_MeterAssetPhysicalDevicePair_MeterAsset_PhysicalDevice_ConformLoad_AutoConnectObject_ConformLoadGroup();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDConfLoad#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDConfLoad#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getEnergyConsumerWithIDConfLoad__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDConfLoad#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDConfLoad#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEnergyConsumerWithIDConfLoad__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDConfLoad#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDConfLoad#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getEnergyConsumerWithIDConfLoad__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDConfLoad#isAppropriate_FWD_EMoflonEdge_138(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 138</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 138</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDConfLoad#isAppropriate_FWD_EMoflonEdge_138(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEnergyConsumerWithIDConfLoad__IsAppropriate_FWD_EMoflonEdge_138__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDConfLoad#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDConfLoad#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getEnergyConsumerWithIDConfLoad__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDConfLoad#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDConfLoad#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getEnergyConsumerWithIDConfLoad__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDConfLoad#checkDEC_FWD(gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.ControlArea.ControlArea, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.COSEM.COSEMObjects.AutoConnectObject, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDConfLoad#checkDEC_FWD(gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.ControlArea.ControlArea, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.COSEM.PhysicalDevice, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.COSEM.COSEMObjects.AutoConnectObject, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup)
	 * @generated
	 */
	EOperation getEnergyConsumerWithIDConfLoad__CheckDEC_FWD__SubLoadArea_ElectricityValues_ServiceDeliveryPoint_ControlArea_MeterAssetPhysicalDevicePair_MeterAsset_PhysicalDevice_ConformLoad_AutoConnectObject_ConformLoadGroup();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task1.Rules.PositionPoint <em>Position Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Point</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.PositionPoint
	 * @generated
	 */
	EClass getPositionPoint();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.PositionPoint#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.PositionPoint, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Common.Location) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.PositionPoint#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.PositionPoint, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Common.Location)
	 * @generated
	 */
	EOperation getPositionPoint__IsAppropriate_FWD__Match_MeterAsset_PositionPoint_MeterAssetPhysicalDevicePair_Location();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.PositionPoint#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.PositionPoint#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getPositionPoint__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.PositionPoint#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.PositionPoint#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getPositionPoint__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.PositionPoint#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.PositionPoint, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Common.Location) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.PositionPoint#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.PositionPoint, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Common.Location)
	 * @generated
	 */
	EOperation getPositionPoint__RegisterObjectsToMatch_FWD__Match_MeterAsset_PositionPoint_MeterAssetPhysicalDevicePair_Location();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.PositionPoint#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.PositionPoint, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Common.Location) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.PositionPoint#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.PositionPoint, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Common.Location)
	 * @generated
	 */
	EOperation getPositionPoint__IsAppropriate_solveCsp_FWD__Match_MeterAsset_PositionPoint_MeterAssetPhysicalDevicePair_Location();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.PositionPoint#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.PositionPoint#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getPositionPoint__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.PositionPoint#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.PositionPoint, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Common.Location, rgse.ttc17.emoflon.tgg.task1.LocationToLocation, outageDetectionJointarget.Location) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.PositionPoint#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.PositionPoint, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Common.Location, rgse.ttc17.emoflon.tgg.task1.LocationToLocation, outageDetectionJointarget.Location)
	 * @generated
	 */
	EOperation getPositionPoint__IsApplicable_solveCsp_FWD__IsApplicableMatch_MeterAsset_PositionPoint_MeterAssetPhysicalDevicePair_Location_LocationToLocation_Location();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.PositionPoint#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.PositionPoint#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getPositionPoint__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.PositionPoint#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.PositionPoint#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getPositionPoint__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.PositionPoint#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.PositionPoint#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getPositionPoint__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.PositionPoint#isAppropriate_FWD_EMoflonEdge_139(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 139</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 139</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.PositionPoint#isAppropriate_FWD_EMoflonEdge_139(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPositionPoint__IsAppropriate_FWD_EMoflonEdge_139__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.PositionPoint#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.PositionPoint#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getPositionPoint__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.PositionPoint#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.PositionPoint#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getPositionPoint__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.PositionPoint#checkDEC_FWD(gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.PositionPoint, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Common.Location) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.PositionPoint#checkDEC_FWD(gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.PositionPoint, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Common.Location)
	 * @generated
	 */
	EOperation getPositionPoint__CheckDEC_FWD__MeterAsset_PositionPoint_MeterAssetPhysicalDevicePair_Location();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task1.Rules.GmlPosition <em>Gml Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Position</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.GmlPosition
	 * @generated
	 */
	EClass getGmlPosition();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.GmlPosition#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.GmlPosition#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getGmlPosition__IsAppropriate_FWD__Match_GmlPosition_Location_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.GmlPosition#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.GmlPosition#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getGmlPosition__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.GmlPosition#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.GmlPosition#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getGmlPosition__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.GmlPosition#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.GmlPosition#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getGmlPosition__RegisterObjectsToMatch_FWD__Match_GmlPosition_Location_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.GmlPosition#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.GmlPosition#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getGmlPosition__IsAppropriate_solveCsp_FWD__Match_GmlPosition_Location_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.GmlPosition#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.GmlPosition#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getGmlPosition__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.GmlPosition#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition, rgse.ttc17.emoflon.tgg.task1.LocationToLocation, outageDetectionJointarget.Location, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.GmlPosition#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition, rgse.ttc17.emoflon.tgg.task1.LocationToLocation, outageDetectionJointarget.Location, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getGmlPosition__IsApplicable_solveCsp_FWD__IsApplicableMatch_GmlPosition_LocationToLocation_Location_Location_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.GmlPosition#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.GmlPosition#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getGmlPosition__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.GmlPosition#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.GmlPosition#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getGmlPosition__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.GmlPosition#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.GmlPosition#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getGmlPosition__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.GmlPosition#isAppropriate_FWD_EMoflonEdge_140(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 140</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 140</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.GmlPosition#isAppropriate_FWD_EMoflonEdge_140(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getGmlPosition__IsAppropriate_FWD_EMoflonEdge_140__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.GmlPosition#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.GmlPosition#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getGmlPosition__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.GmlPosition#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.GmlPosition#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getGmlPosition__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.GmlPosition#checkDEC_FWD(gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.GmlPosition#checkDEC_FWD(gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getGmlPosition__CheckDEC_FWD__GmlPosition_Location_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task1.Rules.LocationLink <em>Location Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Link</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.LocationLink
	 * @generated
	 */
	EClass getLocationLink();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.LocationLink#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Common.Location) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.LocationLink#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Common.Location)
	 * @generated
	 */
	EOperation getLocationLink__IsAppropriate_FWD__Match_MeterAsset_MeterAssetPhysicalDevicePair_Location();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.LocationLink#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.LocationLink#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getLocationLink__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.LocationLink#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.LocationLink#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getLocationLink__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.LocationLink#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Common.Location) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.LocationLink#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Common.Location)
	 * @generated
	 */
	EOperation getLocationLink__RegisterObjectsToMatch_FWD__Match_MeterAsset_MeterAssetPhysicalDevicePair_Location();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.LocationLink#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Common.Location) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.LocationLink#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Common.Location)
	 * @generated
	 */
	EOperation getLocationLink__IsAppropriate_solveCsp_FWD__Match_MeterAsset_MeterAssetPhysicalDevicePair_Location();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.LocationLink#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.LocationLink#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getLocationLink__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.LocationLink#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61968.Metering.MeterAsset, outageDetectionJointarget.EnergyConsumer, gluemodel.MeterAssetPhysicalDevicePair, outageDetectionJointarget.Location, rgse.ttc17.emoflon.tgg.task1.LocationToLocation, gluemodel.CIM.IEC61968.Common.Location, rgse.ttc17.emoflon.tgg.task1.MeterAssetToEnergyConsumer) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.LocationLink#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61968.Metering.MeterAsset, outageDetectionJointarget.EnergyConsumer, gluemodel.MeterAssetPhysicalDevicePair, outageDetectionJointarget.Location, rgse.ttc17.emoflon.tgg.task1.LocationToLocation, gluemodel.CIM.IEC61968.Common.Location, rgse.ttc17.emoflon.tgg.task1.MeterAssetToEnergyConsumer)
	 * @generated
	 */
	EOperation getLocationLink__IsApplicable_solveCsp_FWD__IsApplicableMatch_MeterAsset_EnergyConsumer_MeterAssetPhysicalDevicePair_Location_LocationToLocation_Location_MeterAssetToEnergyConsumer();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.LocationLink#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.LocationLink#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getLocationLink__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.LocationLink#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.LocationLink#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getLocationLink__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.LocationLink#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.LocationLink#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getLocationLink__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.LocationLink#isAppropriate_FWD_EMoflonEdge_141(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 141</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 141</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.LocationLink#isAppropriate_FWD_EMoflonEdge_141(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLocationLink__IsAppropriate_FWD_EMoflonEdge_141__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.LocationLink#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.LocationLink#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getLocationLink__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.LocationLink#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.LocationLink#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getLocationLink__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.LocationLink#checkDEC_FWD(gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Common.Location) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.LocationLink#checkDEC_FWD(gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Common.Location)
	 * @generated
	 */
	EOperation getLocationLink__CheckDEC_FWD__MeterAsset_MeterAssetPhysicalDevicePair_Location();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task1.Rules.SDPLocation <em>SDP Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDP Location</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.SDPLocation
	 * @generated
	 */
	EClass getSDPLocation();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.SDPLocation#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.SDPLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.SDPLocation#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.SDPLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getSDPLocation__IsAppropriate_FWD__Match_SDPLocation_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.SDPLocation#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.SDPLocation#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSDPLocation__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.SDPLocation#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.SDPLocation#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSDPLocation__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.SDPLocation#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.SDPLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.SDPLocation#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.SDPLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getSDPLocation__RegisterObjectsToMatch_FWD__Match_SDPLocation_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.SDPLocation#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.SDPLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.SDPLocation#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.SDPLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getSDPLocation__IsAppropriate_solveCsp_FWD__Match_SDPLocation_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.SDPLocation#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.SDPLocation#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSDPLocation__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.SDPLocation#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, rgse.ttc17.emoflon.tgg.task1.MeterAssetToEnergyConsumer, gluemodel.CIM.IEC61968.Metering.SDPLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, outageDetectionJointarget.EnergyConsumer) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.SDPLocation#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, rgse.ttc17.emoflon.tgg.task1.MeterAssetToEnergyConsumer, gluemodel.CIM.IEC61968.Metering.SDPLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, outageDetectionJointarget.EnergyConsumer)
	 * @generated
	 */
	EOperation getSDPLocation__IsApplicable_solveCsp_FWD__IsApplicableMatch_MeterAssetToEnergyConsumer_SDPLocation_MeterAsset_MeterAssetPhysicalDevicePair_EnergyConsumer();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.SDPLocation#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.SDPLocation#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSDPLocation__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.SDPLocation#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.SDPLocation#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSDPLocation__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.SDPLocation#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.SDPLocation#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSDPLocation__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.SDPLocation#isAppropriate_FWD_EMoflonEdge_142(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 142</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 142</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.SDPLocation#isAppropriate_FWD_EMoflonEdge_142(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSDPLocation__IsAppropriate_FWD_EMoflonEdge_142__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.SDPLocation#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.SDPLocation#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getSDPLocation__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.SDPLocation#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.SDPLocation#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSDPLocation__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.SDPLocation#checkDEC_FWD(gluemodel.CIM.IEC61968.Metering.SDPLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.SDPLocation#checkDEC_FWD(gluemodel.CIM.IEC61968.Metering.SDPLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getSDPLocation__CheckDEC_FWD__SDPLocation_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task1.Rules.WorkLocation <em>Work Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Location</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.WorkLocation
	 * @generated
	 */
	EClass getWorkLocation();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.WorkLocation#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Informative.InfWork.WorkLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.WorkLocation#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Informative.InfWork.WorkLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getWorkLocation__IsAppropriate_FWD__Match_WorkLocation_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.WorkLocation#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.WorkLocation#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getWorkLocation__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.WorkLocation#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.WorkLocation#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getWorkLocation__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.WorkLocation#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Informative.InfWork.WorkLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.WorkLocation#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Informative.InfWork.WorkLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getWorkLocation__RegisterObjectsToMatch_FWD__Match_WorkLocation_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.WorkLocation#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Informative.InfWork.WorkLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.WorkLocation#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Informative.InfWork.WorkLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getWorkLocation__IsAppropriate_solveCsp_FWD__Match_WorkLocation_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.WorkLocation#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.WorkLocation#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getWorkLocation__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.WorkLocation#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, rgse.ttc17.emoflon.tgg.task1.MeterAssetToEnergyConsumer, gluemodel.CIM.IEC61970.Informative.InfWork.WorkLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, outageDetectionJointarget.EnergyConsumer) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.WorkLocation#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, rgse.ttc17.emoflon.tgg.task1.MeterAssetToEnergyConsumer, gluemodel.CIM.IEC61970.Informative.InfWork.WorkLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, outageDetectionJointarget.EnergyConsumer)
	 * @generated
	 */
	EOperation getWorkLocation__IsApplicable_solveCsp_FWD__IsApplicableMatch_MeterAssetToEnergyConsumer_WorkLocation_MeterAsset_MeterAssetPhysicalDevicePair_EnergyConsumer();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.WorkLocation#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.WorkLocation#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getWorkLocation__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.WorkLocation#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.WorkLocation#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getWorkLocation__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.WorkLocation#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.WorkLocation#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getWorkLocation__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.WorkLocation#isAppropriate_FWD_EMoflonEdge_143(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 143</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 143</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.WorkLocation#isAppropriate_FWD_EMoflonEdge_143(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getWorkLocation__IsAppropriate_FWD_EMoflonEdge_143__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.WorkLocation#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.WorkLocation#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getWorkLocation__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.WorkLocation#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.WorkLocation#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getWorkLocation__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task1.Rules.WorkLocation#checkDEC_FWD(gluemodel.CIM.IEC61970.Informative.InfWork.WorkLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.WorkLocation#checkDEC_FWD(gluemodel.CIM.IEC61970.Informative.InfWork.WorkLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getWorkLocation__CheckDEC_FWD__WorkLocation_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RulesFactory getRulesFactory();

} //RulesPackage
