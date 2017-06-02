/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupP;

import gluemodel.substationStandard.Dataclasses.ACD;
import gluemodel.substationStandard.Dataclasses.ACT;
import gluemodel.substationStandard.Dataclasses.ASG;
import gluemodel.substationStandard.Dataclasses.ING;
import gluemodel.substationStandard.Dataclasses.SPS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>POPF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.POPF#getStr <em>Str</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.POPF#getOp <em>Op</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.POPF#getBlkA <em>Blk A</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.POPF#getBlkV <em>Blk V</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.POPF#getStrVal <em>Str Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.POPF#getOpDiTmms <em>Op Di Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.POPF#getRsDiTmms <em>Rs Di Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.POPF#getBlkValA <em>Blk Val A</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.POPF#getBlkValV <em>Blk Val V</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPOPF()
 * @model
 * @generated
 */
public interface POPF extends GroupP {
	/**
	 * Returns the value of the '<em><b>Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Str</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Str</em>' reference.
	 * @see #setStr(ACD)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPOPF_Str()
	 * @model required="true"
	 * @generated
	 */
	ACD getStr();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.POPF#getStr <em>Str</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Str</em>' reference.
	 * @see #getStr()
	 * @generated
	 */
	void setStr(ACD value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' reference.
	 * @see #setOp(ACT)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPOPF_Op()
	 * @model required="true"
	 * @generated
	 */
	ACT getOp();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.POPF#getOp <em>Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(ACT value);

	/**
	 * Returns the value of the '<em><b>Blk A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blk A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blk A</em>' reference.
	 * @see #setBlkA(SPS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPOPF_BlkA()
	 * @model required="true"
	 * @generated
	 */
	SPS getBlkA();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.POPF#getBlkA <em>Blk A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blk A</em>' reference.
	 * @see #getBlkA()
	 * @generated
	 */
	void setBlkA(SPS value);

	/**
	 * Returns the value of the '<em><b>Blk V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blk V</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blk V</em>' reference.
	 * @see #setBlkV(SPS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPOPF_BlkV()
	 * @model required="true"
	 * @generated
	 */
	SPS getBlkV();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.POPF#getBlkV <em>Blk V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blk V</em>' reference.
	 * @see #getBlkV()
	 * @generated
	 */
	void setBlkV(SPS value);

	/**
	 * Returns the value of the '<em><b>Str Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Str Val</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Str Val</em>' reference.
	 * @see #setStrVal(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPOPF_StrVal()
	 * @model required="true"
	 * @generated
	 */
	ASG getStrVal();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.POPF#getStrVal <em>Str Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Str Val</em>' reference.
	 * @see #getStrVal()
	 * @generated
	 */
	void setStrVal(ASG value);

	/**
	 * Returns the value of the '<em><b>Op Di Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Di Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Di Tmms</em>' reference.
	 * @see #setOpDiTmms(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPOPF_OpDiTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getOpDiTmms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.POPF#getOpDiTmms <em>Op Di Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Di Tmms</em>' reference.
	 * @see #getOpDiTmms()
	 * @generated
	 */
	void setOpDiTmms(ING value);

	/**
	 * Returns the value of the '<em><b>Rs Di Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rs Di Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rs Di Tmms</em>' reference.
	 * @see #setRsDiTmms(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPOPF_RsDiTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getRsDiTmms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.POPF#getRsDiTmms <em>Rs Di Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rs Di Tmms</em>' reference.
	 * @see #getRsDiTmms()
	 * @generated
	 */
	void setRsDiTmms(ING value);

	/**
	 * Returns the value of the '<em><b>Blk Val A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blk Val A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blk Val A</em>' reference.
	 * @see #setBlkValA(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPOPF_BlkValA()
	 * @model required="true"
	 * @generated
	 */
	ASG getBlkValA();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.POPF#getBlkValA <em>Blk Val A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blk Val A</em>' reference.
	 * @see #getBlkValA()
	 * @generated
	 */
	void setBlkValA(ASG value);

	/**
	 * Returns the value of the '<em><b>Blk Val V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blk Val V</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blk Val V</em>' reference.
	 * @see #setBlkValV(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage#getPOPF_BlkValV()
	 * @model required="true"
	 * @generated
	 */
	ASG getBlkValV();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.POPF#getBlkValV <em>Blk Val V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blk Val V</em>' reference.
	 * @see #getBlkValV()
	 * @generated
	 */
	void setBlkValV(ASG value);

} // POPF
