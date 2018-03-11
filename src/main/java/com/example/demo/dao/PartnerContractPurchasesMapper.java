package com.example.demo.dao;

import java.util.List;

import com.example.demo.bean.po.PartnerContractPurchases;

public interface PartnerContractPurchasesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table partner_contract_purchases
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long purchaseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table partner_contract_purchases
     *
     * @mbggenerated
     */
    int insert(PartnerContractPurchases record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table partner_contract_purchases
     *
     * @mbggenerated
     */
    PartnerContractPurchases selectByPrimaryKey(Long purchaseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table partner_contract_purchases
     *
     * @mbggenerated
     */
    List<PartnerContractPurchases> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table partner_contract_purchases
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PartnerContractPurchases record);
}