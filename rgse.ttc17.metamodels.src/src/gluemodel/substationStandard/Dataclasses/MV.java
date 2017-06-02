/**
 */
package gluemodel.substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MV</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.MV#getInstMag <em>Inst Mag</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.MV#getMag <em>Mag</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.MV#getRange <em>Range</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.MV#getQ <em>Q</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.MV#getT <em>T</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.MV#isSubEna <em>Sub Ena</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.MV#getSubMag <em>Sub Mag</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.MV#getSubQ <em>Sub Q</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.MV#getSubID <em>Sub ID</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.MV#getUnits <em>Units</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.MV#getDb <em>Db</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.MV#getZeroDb <em>Zero Db</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.MV#getSVC <em>SVC</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.MV#getRangeC <em>Range C</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.MV#getSmpRate <em>Smp Rate</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getMV()
 * @model
 * @generated
 */
public interface MV extends EObject {
	/**
	 * Returns the value of the '<em><b>Inst Mag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inst Mag</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inst Mag</em>' reference.
	 * @see #setInstMag(AnalogueValue)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getMV_InstMag()
	 * @model required="true"
	 * @generated
	 */
	AnalogueValue getInstMag();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.MV#getInstMag <em>Inst Mag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inst Mag</em>' reference.
	 * @see #getInstMag()
	 * @generated
	 */
	void setInstMag(AnalogueValue value);

	/**
	 * Returns the value of the '<em><b>Mag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mag</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mag</em>' reference.
	 * @see #setMag(AnalogueValue)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getMV_Mag()
	 * @model required="true"
	 * @generated
	 */
	AnalogueValue getMag();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.MV#getMag <em>Mag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mag</em>' reference.
	 * @see #getMag()
	 * @generated
	 */
	void setMag(AnalogueValue value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' reference.
	 * @see #setRange(Range)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getMV_Range()
	 * @model required="true"
	 * @generated
	 */
	Range getRange();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.MV#getRange <em>Range</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(Range value);

	/**
	 * Returns the value of the '<em><b>Q</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Q</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Q</em>' reference.
	 * @see #setQ(Quality)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getMV_Q()
	 * @model required="true"
	 * @generated
	 */
	Quality getQ();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.MV#getQ <em>Q</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Q</em>' reference.
	 * @see #getQ()
	 * @generated
	 */
	void setQ(Quality value);

	/**
	 * Returns the value of the '<em><b>T</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>T</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>T</em>' reference.
	 * @see #setT(TimeStamp)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getMV_T()
	 * @model required="true"
	 * @generated
	 */
	TimeStamp getT();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.MV#getT <em>T</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>T</em>' reference.
	 * @see #getT()
	 * @generated
	 */
	void setT(TimeStamp value);

	/**
	 * Returns the value of the '<em><b>Sub Ena</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Ena</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Ena</em>' attribute.
	 * @see #setSubEna(boolean)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getMV_SubEna()
	 * @model
	 * @generated
	 */
	boolean isSubEna();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.MV#isSubEna <em>Sub Ena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Ena</em>' attribute.
	 * @see #isSubEna()
	 * @generated
	 */
	void setSubEna(boolean value);

	/**
	 * Returns the value of the '<em><b>Sub Mag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Mag</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Mag</em>' reference.
	 * @see #setSubMag(AnalogueValue)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getMV_SubMag()
	 * @model required="true"
	 * @generated
	 */
	AnalogueValue getSubMag();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.MV#getSubMag <em>Sub Mag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Mag</em>' reference.
	 * @see #getSubMag()
	 * @generated
	 */
	void setSubMag(AnalogueValue value);

	/**
	 * Returns the value of the '<em><b>Sub Q</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Q</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Q</em>' reference.
	 * @see #setSubQ(Quality)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getMV_SubQ()
	 * @model required="true"
	 * @generated
	 */
	Quality getSubQ();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.MV#getSubQ <em>Sub Q</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Q</em>' reference.
	 * @see #getSubQ()
	 * @generated
	 */
	void setSubQ(Quality value);

	/**
	 * Returns the value of the '<em><b>Sub ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub ID</em>' attribute.
	 * @see #setSubID(String)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getMV_SubID()
	 * @model
	 * @generated
	 */
	String getSubID();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.MV#getSubID <em>Sub ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub ID</em>' attribute.
	 * @see #getSubID()
	 * @generated
	 */
	void setSubID(String value);

	/**
	 * Returns the value of the '<em><b>Units</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' reference.
	 * @see #setUnits(Units)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getMV_Units()
	 * @model required="true"
	 * @generated
	 */
	Units getUnits();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.MV#getUnits <em>Units</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' reference.
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(Units value);

	/**
	 * Returns the value of the '<em><b>Db</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Db</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db</em>' attribute.
	 * @see #setDb(int)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getMV_Db()
	 * @model
	 * @generated
	 */
	int getDb();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.MV#getDb <em>Db</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db</em>' attribute.
	 * @see #getDb()
	 * @generated
	 */
	void setDb(int value);

	/**
	 * Returns the value of the '<em><b>Zero Db</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zero Db</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zero Db</em>' attribute.
	 * @see #setZeroDb(int)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getMV_ZeroDb()
	 * @model
	 * @generated
	 */
	int getZeroDb();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.MV#getZeroDb <em>Zero Db</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zero Db</em>' attribute.
	 * @see #getZeroDb()
	 * @generated
	 */
	void setZeroDb(int value);

	/**
	 * Returns the value of the '<em><b>SVC</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SVC</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SVC</em>' reference.
	 * @see #setSVC(ScaledValueConfig)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getMV_SVC()
	 * @model required="true"
	 * @generated
	 */
	ScaledValueConfig getSVC();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.MV#getSVC <em>SVC</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SVC</em>' reference.
	 * @see #getSVC()
	 * @generated
	 */
	void setSVC(ScaledValueConfig value);

	/**
	 * Returns the value of the '<em><b>Range C</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range C</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range C</em>' reference.
	 * @see #setRangeC(RangeConfig)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getMV_RangeC()
	 * @model required="true"
	 * @generated
	 */
	RangeConfig getRangeC();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.MV#getRangeC <em>Range C</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range C</em>' reference.
	 * @see #getRangeC()
	 * @generated
	 */
	void setRangeC(RangeConfig value);

	/**
	 * Returns the value of the '<em><b>Smp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Smp Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smp Rate</em>' attribute.
	 * @see #setSmpRate(int)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getMV_SmpRate()
	 * @model
	 * @generated
	 */
	int getSmpRate();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.MV#getSmpRate <em>Smp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smp Rate</em>' attribute.
	 * @see #getSmpRate()
	 * @generated
	 */
	void setSmpRate(int value);

} // MV
