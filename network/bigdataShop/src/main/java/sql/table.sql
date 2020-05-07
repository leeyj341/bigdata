
DROP TABLE TB_REPLY CASCADE CONSTRAINTS;

CREATE TABLE TB_REPLY (
       BOARD_NO             VARCHAR2(12) NOT NULL,
       SEQ                  VARCHAR2(8) NOT NULL,
       MEM_ID               VARCHAR2(20) NOT NULL,
       MEM_NM               VARCHAR2(50) NULL,
       REPLY                VARCHAR2(100) NULL,
       DEL_FLG              VARCHAR2(1) NULL,
       REG_DTM              VARCHAR2(14) NULL,
       PRIMARY KEY (BOARD_NO, SEQ)
);


DROP TABLE TB_ORDER_PRODUCT CASCADE CONSTRAINTS;

CREATE TABLE TB_ORDER_PRODUCT (
       ORD_NO               VARCHAR2(20) NOT NULL,
       PRD_NO               VARCHAR2(12) NOT NULL,
       QTY                  NUMBER(8) NULL,
       PRIMARY KEY (ORD_NO, PRD_NO)
);


DROP TABLE TB_PAYMENT CASCADE CONSTRAINTS;

CREATE TABLE TB_PAYMENT (
       PAY_NO               VARCHAR2(12) NOT NULL,
       ORD_NO               VARCHAR2(12) NOT NULL,
       PAYMENT_OPT_CD       VARCHAR2(3) NULL,
       PAY_AMT              NUMBER(8) NULL,
       PAY_DTM              VARCHAR2(14) NULL,
       PRIMARY KEY (PAY_NO)
);


DROP TABLE TB_ORDER CASCADE CONSTRAINTS;

CREATE TABLE TB_ORDER (
       ORD_NO               VARCHAR2(20) NOT NULL,
       MEM_ID               VARCHAR2(20) NOT NULL,
       ORD_AMT              NUMBER(8) NULL,
       RCVR_NM              VARCHAR2(50) NULL,
       RCVR_TEL_NO          VARCHAR2(14) NULL,
       RCVR_ADDR            VARCHAR2(100) NULL,
       DLV_CORP_NO          VARCHAR2(12) NOT NULL,
       DLV_REQ              VARCHAR2(100) NULL,
       ORD_STAT_CD          VARCHAR2(3) NULL,
       ORD_DTM              VARCHAR2(14) NULL,
       PRIMARY KEY (ORD_NO)
);


DROP TABLE TB_PRODUCT CASCADE CONSTRAINTS;

CREATE TABLE TB_PRODUCT (
       PRD_NO               VARCHAR2(12) NOT NULL,
       PRD_NM               VARCHAR2(50) NULL,
       CATEGORY_NO          VARCHAR2(12) NOT NULL,
       PRD_DES              VARCHAR2(500) NULL,
       SELL_PRC_UNIT        NUMBER(8) NULL,
       SELL_START_DT        VARCHAR2(8) NULL,
       SELL_END_DT          VARCHAR2(8) NULL,
       DLV_CONSTRAINT       VARCHAR2(500) NULL,
       AS_FLG               VARCHAR2(1) NULL,
       RETURN_FLG           VARCHAR2(1) NULL,
       IMG_ORG_FILE_NM      VARCHAR2(100) NULL,
       IMG_GEN_FILE_NM      VARCHAR2(100) NULL,
       REG_ID               VARCHAR2(20) NULL,
       REG_DTM              VARCHAR2(14) NULL,
       PRIMARY KEY (PRD_NO)
);

 create table pro_comment(
        prd_no varchar2(20) ,
        mem_id varchar2(20) , 
        pro_comment varchar2(60),
        writedate date);
        
        
DROP TABLE board CASCADE CONSTRAINTS;

CREATE TABLE board (
       BOARD_NO             VARCHAR2(12) NOT NULL,
       id               VARCHAR2(20) NOT NULL,
       TITLE                VARCHAR2(50) NULL,
       TEXT                 VARCHAR2(2000) NULL,
       hit                NUMBER(8) NULL,
       DEL_FLG              VARCHAR2(1) NULL,
       REG_DTM              VARCHAR2(14) NULL,
       MOD_DTM              VARCHAR2(14) NULL,
       PRIMARY KEY (BOARD_NO)
);
create table board_file(
	board_no varchar2(12),
	file_name varchar2(30)	
);


DROP TABLE TB_MEM CASCADE CONSTRAINTS;

CREATE TABLE TB_MEM (
       MEM_ID               VARCHAR2(20) NOT NULL,
       MEM_NM               VARCHAR2(50) NULL,
       MEM_CD               VARCHAR2(3) NULL,
       PWD                  VARCHAR2(10) NULL,
       PWD_HINT             VARCHAR2(100) NULL,
       PWD_HINT_ANS         VARCHAR2(50) NULL,
       SSN                  VARCHAR2(13) NULL,
       BIRTH_DT             VARCHAR2(8) NULL,
       MALE_FLG             VARCHAR2(1) NULL,
       TEL_NO               VARCHAR2(14) NULL,
       CELL_NO              VARCHAR2(14) NULL,
       ADDR                 VARCHAR2(100) NULL,
       EMAIL                VARCHAR2(50) NULL,
       EMAIL_RCV_FLG        VARCHAR2(1) NULL,
       MEM_REG_DTM          VARCHAR2(14) NULL,
       PRIMARY KEY (MEM_ID)
);


DROP TABLE TB_CATEGORY CASCADE CONSTRAINTS;

CREATE TABLE TB_CATEGORY (
       CATEGORY_NO          VARCHAR2(12) NOT NULL,
       CATEGORY_NM          VARCHAR2(50) NULL,
       CATEGORY_DESC        VARCHAR2(500) NULL,
       REG_ID               VARCHAR2(20) NULL,
       REG_DTM              VARCHAR2(14) NULL,
       PRIMARY KEY (CATEGORY_NO)
);


DROP TABLE TB_CODE CASCADE CONSTRAINTS;

CREATE TABLE TB_CODE (
       CD_NO                VARCHAR2(3) NOT NULL,
       CD_NM                VARCHAR2(50) NULL,
       CD_DESC              VARCHAR2(500) NULL,
       CD_GROUP_NO          VARCHAR2(3) NOT NULL,
       PRIMARY KEY (CD_NO)
);


DROP TABLE TB_CODE_GROUP CASCADE CONSTRAINTS;

CREATE TABLE TB_CODE_GROUP (
       CD_GROUP_NO          VARCHAR2(3) NOT NULL,
       CD_GROUP_NM          VARCHAR2(50) NULL,
       CD_GROUP_DESC        VARCHAR2(500) NULL,
       PRIMARY KEY (CD_GROUP_NO)
);


DROP TABLE TB_DLV_CORP CASCADE CONSTRAINTS;

CREATE TABLE TB_DLV_CORP (
       DLV_CORP_NO          VARCHAR2(12) NOT NULL,
       DLV_CORP_NM          VARCHAR2(50) NULL,
       BIZ_NO               VARCHAR2(10) NULL,
       CEO_NM               VARCHAR2(50) NULL,
       CEO_TEL_NO           VARCHAR2(14) NULL,
       ADDR                 VARCHAR2(100) NULL,
       REG_ID               VARCHAR2(20) NULL,
       REG_DTM              VARCHAR2(14) NULL,
       PRIMARY KEY (DLV_CORP_NO)
);

create sequence ord_seq;





