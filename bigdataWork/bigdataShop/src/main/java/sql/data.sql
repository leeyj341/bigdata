INSERT INTO TB_MEM(MEM_ID, MEM_NM, MEM_CD, PWD, PWD_HINT, PWD_HINT_ANS, SSN, BIRTH_DT, MALE_FLG, TEL_NO, CELL_NO, ADDR, EMAIL, EMAIL_RCV_FLG, MEM_REG_DTM)      
VALUES('user01', '홍길동', 'USR', 'user01', '초등학교는?', '서울초등학교', '8010101234567', '19801010', 'F', '02-555-4567', '010-234-4567', '서울시 서초구 서초동 서초아파트 101동 1001호', 'abcd@email.com', 'Y', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ; 
 
INSERT INTO TB_MEM(MEM_ID, MEM_NM, MEM_CD, PWD, PWD_HINT, PWD_HINT_ANS, SSN, BIRTH_DT, MALE_FLG, TEL_NO, CELL_NO, ADDR, EMAIL, EMAIL_RCV_FLG, MEM_REG_DTM)      
VALUES('admin01', '관리자', 'ADM', 'admin01', '고등학교는?', '삼성고등학교', '7010101234567', '19701010', 'F', '02-555-1000', '010-100-2000', '서울시 서초구 서초동 삼성아파트 201동 1201호', 'admin@email.com', 'Y', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ; 
 
INSERT INTO TB_MEM(MEM_ID, MEM_NM, MEM_CD, PWD, PWD_HINT, PWD_HINT_ANS, SSN, BIRTH_DT, MALE_FLG, TEL_NO, CELL_NO, ADDR, EMAIL, EMAIL_RCV_FLG, MEM_REG_DTM)      
VALUES('jang', '장동건', 'USR', 'jang', '초등학교는?', '서울초등학교', '7710101234567', '19801010', 'F', '02-555-4567', '010-234-4567', '서울시 서초구 서초동 서초아파트 101동 1001호', 'abcd@email.com', 'Y', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ; 
 
INSERT INTO TB_MEM(MEM_ID, MEM_NM, MEM_CD, PWD, PWD_HINT, PWD_HINT_ANS, SSN, BIRTH_DT, MALE_FLG, TEL_NO, CELL_NO, ADDR, EMAIL, EMAIL_RCV_FLG, MEM_REG_DTM)      
VALUES('kim', '김서연', 'USR', 'kim', '초등학교는?', '서울초등학교', '8810101234567', '19801010', 'F', '02-555-4567', '010-234-4567', '서울시 서초구 서초동 서초아파트 101동 1001호', 'abcd@email.com', 'Y', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ; 
 
INSERT INTO TB_MEM(MEM_ID, MEM_NM, MEM_CD, PWD, PWD_HINT, PWD_HINT_ANS, SSN, BIRTH_DT, MALE_FLG, TEL_NO, CELL_NO, ADDR, EMAIL, EMAIL_RCV_FLG, MEM_REG_DTM)      
VALUES('lee', '이문세', 'USR', 'lee', '초등학교는?', '서울초등학교', '7901010123457', '19801010', 'F', '02-555-4567', '010-234-4567', '서울시 서초구 서초동 서초아파트 101동 1001호', 'abcd@email.com', 'Y', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ; 
 
INSERT INTO TB_MEM(MEM_ID, MEM_NM, MEM_CD, PWD, PWD_HINT, PWD_HINT_ANS, SSN, BIRTH_DT, MALE_FLG, TEL_NO, CELL_NO, ADDR, EMAIL, EMAIL_RCV_FLG, MEM_REG_DTM)      
VALUES('kang', '강감찬', 'USR', 'kang', '초등학교는?', '서울초등학교', '7110101234567', '19801010', 'F', '02-555-4567', '010-234-4567', '서울시 서초구 서초동 서초아파트 101동 1001호', 'abcd@email.com', 'Y', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ; 
 


INSERT INTO tb_code_group(cd_group_no, cd_group_nm, cd_group_desc) 
VALUES('00A', '이메일 종류 코드', '');

INSERT INTO tb_code_group(cd_group_no, cd_group_nm, cd_group_desc) 
VALUES('00B', '주문 상태 코드', '');

INSERT INTO tb_code_group(cd_group_no, cd_group_nm, cd_group_desc) 
VALUES('00C', '결제 수단 코드', '');

INSERT INTO tb_code_group(cd_group_no, cd_group_nm, cd_group_desc) 
VALUES('00D', '휴대폰 국번 코드', '');



INSERT INTO tb_code(cd_no, cd_nm, cd_group_no, cd_desc) VALUES('A01', 'naver.com', '00A', ''); 
INSERT INTO tb_code(cd_no, cd_nm, cd_group_no, cd_desc) VALUES('A02', 'chol.com', '00A', ''); 
INSERT INTO tb_code(cd_no, cd_nm, cd_group_no, cd_desc) VALUES('A03', 'dreamwiz.com', '00A', ''); 
INSERT INTO tb_code(cd_no, cd_nm, cd_group_no, cd_desc) VALUES('A04', 'empal.com', '00A', ''); 
INSERT INTO tb_code(cd_no, cd_nm, cd_group_no, cd_desc) VALUES('A05', 'freechal.com', '00A', ''); 
INSERT INTO tb_code(cd_no, cd_nm, cd_group_no, cd_desc) VALUES('A06', 'google.com', '00A', ''); 
INSERT INTO tb_code(cd_no, cd_nm, cd_group_no, cd_desc) VALUES('A07', 'hanafos.com', '00A', ''); 
INSERT INTO tb_code(cd_no, cd_nm, cd_group_no, cd_desc) VALUES('A08', 'hanmail.net', '00A', ''); 
INSERT INTO tb_code(cd_no, cd_nm, cd_group_no, cd_desc) VALUES('A09', 'hanmir.com', '00A', ''); 
INSERT INTO tb_code(cd_no, cd_nm, cd_group_no, cd_desc) VALUES('A10', 'hitel.net', '00A', ''); 
INSERT INTO tb_code(cd_no, cd_nm, cd_group_no, cd_desc) VALUES('A11', 'hotmail.com', '00A', '');
INSERT INTO tb_code(cd_no, cd_nm, cd_group_no, cd_desc) VALUES('A12', 'korea.com', '00A', ''); 
INSERT INTO tb_code(cd_no, cd_nm, cd_group_no, cd_desc) VALUES('A13', 'lycos.co.kr', '00A', ''); 
INSERT INTO tb_code(cd_no, cd_nm, cd_group_no, cd_desc) VALUES('A14', 'nate.com', '00A', ''); 
INSERT INTO tb_code(cd_no, cd_nm, cd_group_no, cd_desc) VALUES('A15', 'netian.com', '00A', ''); 
INSERT INTO tb_code(cd_no, cd_nm, cd_group_no, cd_desc) VALUES('A16', 'yahoo.co.kr', '00A', ''); 
 
INSERT INTO tb_code(cd_no, cd_nm, cd_group_no, cd_desc) VALUES('B01', '주문접수', '00B', ''); 
INSERT INTO tb_code(cd_no, cd_nm, cd_group_no, cd_desc) VALUES('B02', '결제완료', '00B', ''); 
INSERT INTO tb_code(cd_no, cd_nm, cd_group_no, cd_desc) VALUES('B03', '배송중', '00B', ''); 
INSERT INTO tb_code(cd_no, cd_nm, cd_group_no, cd_desc) VALUES('B04', '배송완료', '00B', '');  

INSERT INTO tb_code(cd_no, cd_nm, cd_group_no, cd_desc) VALUES('C01', '신용카드', '00C', ''); 
INSERT INTO tb_code(cd_no, cd_nm, cd_group_no, cd_desc) VALUES('C02', '무통장입금', '00C', ''); 
INSERT INTO tb_code(cd_no, cd_nm, cd_group_no, cd_desc) VALUES('C03', '핸드폰', '00C', ''); 
INSERT INTO tb_code(cd_no, cd_nm, cd_group_no, cd_desc) VALUES('C04', '포인트', '00C', '');  

INSERT INTO tb_code(cd_no, cd_nm, cd_group_no, cd_desc) VALUES('D01', '010', '00D', ''); 
INSERT INTO tb_code(cd_no, cd_nm, cd_group_no, cd_desc) VALUES('D02', '011', '00D', ''); 
INSERT INTO tb_code(cd_no, cd_nm, cd_group_no, cd_desc) VALUES('D03', '016', '00D', ''); 
INSERT INTO tb_code(cd_no, cd_nm, cd_group_no, cd_desc) VALUES('D04', '017', '00D', ''); 
INSERT INTO tb_code(cd_no, cd_nm, cd_group_no, cd_desc) VALUES('D05', '018', '00D', ''); 
INSERT INTO tb_code(cd_no, cd_nm, cd_group_no, cd_desc) VALUES('D06', '019', '00D', '');  





INSERT INTO TB_CATEGORY(CATEGORY_NO, CATEGORY_NM, CATEGORY_DESC, REG_ID, REG_DTM)      
VALUES('CAT000000001', 'DRESS', '원피스 카테고리입니다.', 'admin', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ; 

INSERT INTO TB_CATEGORY(CATEGORY_NO, CATEGORY_NM, CATEGORY_DESC, REG_ID, REG_DTM)      
VALUES('CAT000000002', 'TOP', '상의 카테고리입니다.', 'admin', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ; 
 
INSERT INTO TB_CATEGORY(CATEGORY_NO, CATEGORY_NM, CATEGORY_DESC, REG_ID, REG_DTM)      
VALUES('CAT000000003', 'BOTTOM', '하의 카테고리입니다.', 'admin', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ; 

INSERT INTO TB_CATEGORY(CATEGORY_NO, CATEGORY_NM, CATEGORY_DESC, REG_ID, REG_DTM)      
VALUES('CAT000000004', 'OUTER', '아우터 카테고리입니다.', 'admin', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ; 

INSERT INTO TB_CATEGORY(CATEGORY_NO, CATEGORY_NM, CATEGORY_DESC, REG_ID, REG_DTM)      
VALUES('CAT000000005', 'ACC', '악세사리 카테고리입니다.', 'admin', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ; 
 
INSERT INTO TB_CATEGORY(CATEGORY_NO, CATEGORY_NM, CATEGORY_DESC, REG_ID, REG_DTM)      
VALUES('CAT000000006', 'CARDIGAN', '가디건 카테고리입니다.', 'admin', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ; 




INSERT INTO TB_PRODUCT(PRD_NO, PRD_NM, CATEGORY_NO, PRD_DES, SELL_PRC_UNIT, SELL_START_DT, SELL_END_DT, DLV_CONSTRAINT, AS_FLG, RETURN_FLG, IMG_ORG_FILE_NM, IMG_GEN_FILE_NM, REG_ID, REG_DTM) 
VALUES('PRD000000001', '위니네크리스', 'CAT000000005', '착용하셨을때 떨어지는 라인이 정말 예뻐요', 39000, '20140201', '20141201', '국내 배송만 됩니다.', 'Y', 'Y',  'acc_image1.jpg', 'acc_image1.jpg', 'admin', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ;

INSERT INTO TB_PRODUCT(PRD_NO, PRD_NM, CATEGORY_NO, PRD_DES, SELL_PRC_UNIT, SELL_START_DT, SELL_END_DT, DLV_CONSTRAINT, AS_FLG, RETURN_FLG, IMG_ORG_FILE_NM, IMG_GEN_FILE_NM, REG_ID, REG_DTM) 
VALUES('PRD000000002', '올인원크리스', 'CAT000000005', '진주의방울방울이 끝내줍니다.', 39000, '20140201', '20141201', '국내 배송만 됩니다.', 'Y', 'Y',  'acc_image2.jpg', 'acc_image2.jpg', 'admin', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ;

INSERT INTO TB_PRODUCT(PRD_NO, PRD_NM, CATEGORY_NO, PRD_DES, SELL_PRC_UNIT, SELL_START_DT, SELL_END_DT, DLV_CONSTRAINT, AS_FLG, RETURN_FLG, IMG_ORG_FILE_NM, IMG_GEN_FILE_NM, REG_ID, REG_DTM) 
VALUES('PRD000000003', '블론디네크리스', 'CAT000000005', '조금 있으면 품절이예요 빨리 서두르세요', 18000, '20140201', '20141201', '국내 배송만 됩니다.', 'Y', 'Y',  'acc_image3.jpg', 'acc_image3.jpg', 'admin', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ;

INSERT INTO TB_PRODUCT(PRD_NO, PRD_NM, CATEGORY_NO, PRD_DES, SELL_PRC_UNIT, SELL_START_DT, SELL_END_DT, DLV_CONSTRAINT, AS_FLG, RETURN_FLG, IMG_ORG_FILE_NM, IMG_GEN_FILE_NM, REG_ID, REG_DTM) 
VALUES('PRD000000004', '로렐라이네크리스', 'CAT000000005', 'Best of Best', 15000, '20140201', '20141201', '국내 배송만 됩니다.', 'Y', 'Y',  'acc_image4.jpg', 'acc_image4.jpg', 'admin', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ;

INSERT INTO TB_PRODUCT(PRD_NO, PRD_NM, CATEGORY_NO, PRD_DES, SELL_PRC_UNIT, SELL_START_DT, SELL_END_DT, DLV_CONSTRAINT, AS_FLG, RETURN_FLG, IMG_ORG_FILE_NM, IMG_GEN_FILE_NM, REG_ID, REG_DTM) 
VALUES('PRD000000005', '스트로우네크리스', 'CAT000000005', '악세사리 멋져요', 15000, '20140201', '20141201', '국내 배송만 됩니다.', 'Y', 'Y',  'acc_image5.jpg', 'acc_image5.jpg', 'admin', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ;







INSERT INTO TB_PRODUCT(PRD_NO, PRD_NM, CATEGORY_NO, PRD_DES, SELL_PRC_UNIT, SELL_START_DT, SELL_END_DT, DLV_CONSTRAINT, AS_FLG, RETURN_FLG, IMG_ORG_FILE_NM, IMG_GEN_FILE_NM, REG_ID, REG_DTM) 
VALUES('PRD000000006', '글로아셔링ops', 'CAT000000001', '사랑스런 셔링의 루즈핏', 22000, '20140201', '20141201', '국내 배송만 됩니다.', 'Y', 'Y',  'dress_images1.jpg', 'dress_images1.jpg', 'admin', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ;

INSERT INTO TB_PRODUCT(PRD_NO, PRD_NM, CATEGORY_NO, PRD_DES, SELL_PRC_UNIT, SELL_START_DT, SELL_END_DT, DLV_CONSTRAINT, AS_FLG, RETURN_FLG, IMG_ORG_FILE_NM, IMG_GEN_FILE_NM, REG_ID, REG_DTM) 
VALUES('PRD000000007', '바이블ops', 'CAT000000001', '큐트한 라인감이 여성스러워요', 23900, '20140201', '20141201', '국내 배송만 됩니다.', 'Y', 'Y',  'dress_images2.jpg', 'dress_images2.jpg', 'admin', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ;

INSERT INTO TB_PRODUCT(PRD_NO, PRD_NM, CATEGORY_NO, PRD_DES, SELL_PRC_UNIT, SELL_START_DT, SELL_END_DT, DLV_CONSTRAINT, AS_FLG, RETURN_FLG, IMG_ORG_FILE_NM, IMG_GEN_FILE_NM, REG_ID, REG_DTM) 
VALUES('PRD000000008', '텐디박스ops', 'CAT000000001', '편안해요 홈웨어로도 좋아요', 24000, '20140201', '20141201', '국내 배송만 됩니다.', 'Y', 'Y',  'dress_images3.jpg', 'dress_images3.jpg', 'admin', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ;

INSERT INTO TB_PRODUCT(PRD_NO, PRD_NM, CATEGORY_NO, PRD_DES, SELL_PRC_UNIT, SELL_START_DT, SELL_END_DT, DLV_CONSTRAINT, AS_FLG, RETURN_FLG, IMG_ORG_FILE_NM, IMG_GEN_FILE_NM, REG_ID, REG_DTM) 
VALUES('PRD000000009', '마리안 ops', 'CAT000000001', '살랑거리는 핏이 가녀린 여성미를 연출해줄 봄 원피스', 36000, '20140201', '20141201', '국내 배송만 됩니다.', 'Y', 'Y',  'dress_images4.jpg', 'dress_images4.jpg', 'admin', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ;

INSERT INTO TB_PRODUCT(PRD_NO, PRD_NM, CATEGORY_NO, PRD_DES, SELL_PRC_UNIT, SELL_START_DT, SELL_END_DT, DLV_CONSTRAINT, AS_FLG, RETURN_FLG, IMG_ORG_FILE_NM, IMG_GEN_FILE_NM, REG_ID, REG_DTM) 
VALUES('PRD000000010', '디아망 ops', 'CAT000000001', '시스루 디테일로 여성스러움에 은은한 섹시함까지', 59800, '20140201', '20141201', '국내 배송만 됩니다.', 'Y', 'Y',  'dress_images5.gif', 'dress_images5.gif', 'admin', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ;



INSERT INTO TB_PRODUCT(PRD_NO, PRD_NM, CATEGORY_NO, PRD_DES, SELL_PRC_UNIT, SELL_START_DT, SELL_END_DT, DLV_CONSTRAINT, AS_FLG, RETURN_FLG, IMG_ORG_FILE_NM, IMG_GEN_FILE_NM, REG_ID, REG_DTM) 
VALUES('PRD000000011', 'no.3932', 'CAT000000002', '썸머 나시 남다른 비치웨어로', 9800, '20140201', '20141201', '국내 배송만 됩니다.', 'Y', 'Y',  'top_image1.gif', 'top_image1.gif', 'admin', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ;

INSERT INTO TB_PRODUCT(PRD_NO, PRD_NM, CATEGORY_NO, PRD_DES, SELL_PRC_UNIT, SELL_START_DT, SELL_END_DT, DLV_CONSTRAINT, AS_FLG, RETURN_FLG, IMG_ORG_FILE_NM, IMG_GEN_FILE_NM, REG_ID, REG_DTM) 
VALUES('PRD000000012', '숄더홀믹스', 'CAT000000002', '네추럴한 가오리핏으로 순수하고 께끗한 이미지를 up', 38000, '20140201', '20141201', '국내 배송만 됩니다.', 'Y', 'Y',  'top_image2.jpg', 'top_image2.jpg', 'admin', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ;

INSERT INTO TB_PRODUCT(PRD_NO, PRD_NM, CATEGORY_NO, PRD_DES, SELL_PRC_UNIT, SELL_START_DT, SELL_END_DT, DLV_CONSTRAINT, AS_FLG, RETURN_FLG, IMG_ORG_FILE_NM, IMG_GEN_FILE_NM, REG_ID, REG_DTM) 
VALUES('PRD000000013', '클로라모티브', 'CAT000000002', '넉넉한 핏과 레이스패턴으로 여리하고 여성스러워요', 22000, '20140201', '20141201', '국내 배송만 됩니다.', 'Y', 'Y',  'top_image3.jpg', 'top_image3.jpg', 'admin', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ;

INSERT INTO TB_PRODUCT(PRD_NO, PRD_NM, CATEGORY_NO, PRD_DES, SELL_PRC_UNIT, SELL_START_DT, SELL_END_DT, DLV_CONSTRAINT, AS_FLG, RETURN_FLG, IMG_ORG_FILE_NM, IMG_GEN_FILE_NM, REG_ID, REG_DTM) 
VALUES('PRD000000014', '타임포켓', 'CAT000000002', '부드러운 소재로 착용감 정말 편해요', 26000, '20140201', '20141201', '국내 배송만 됩니다.', 'Y', 'Y',  'top_image4.gif', 'top_image4.gif', 'admin', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ;

INSERT INTO TB_PRODUCT(PRD_NO, PRD_NM, CATEGORY_NO, PRD_DES, SELL_PRC_UNIT, SELL_START_DT, SELL_END_DT, DLV_CONSTRAINT, AS_FLG, RETURN_FLG, IMG_ORG_FILE_NM, IMG_GEN_FILE_NM, REG_ID, REG_DTM) 
VALUES('PRD000000015', '글로니린넨', 'CAT000000002', '체형커버에도 좋은 장점', 27400, '20140201', '20141201', '국내 배송만 됩니다.', 'Y', 'Y',  'top_image5.jpg', 'top_image5.jpg', 'admin', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ;


INSERT INTO TB_PRODUCT(PRD_NO, PRD_NM, CATEGORY_NO, PRD_DES, SELL_PRC_UNIT, SELL_START_DT, SELL_END_DT, DLV_CONSTRAINT, AS_FLG, RETURN_FLG, IMG_ORG_FILE_NM, IMG_GEN_FILE_NM, REG_ID, REG_DTM) 
VALUES('PRD000000016', '7부쿨팬츠', 'CAT000000003', '여름까지 쭉 입기 좋은 소재와 베이직한 디자인으로 소장가치 up',14500, '20140201', '20141201', '국내 배송만 됩니다.', 'Y', 'Y',  'bottom_image1.jpg', 'bottom_image1.jpg', 'admin', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ;

INSERT INTO TB_PRODUCT(PRD_NO, PRD_NM, CATEGORY_NO, PRD_DES, SELL_PRC_UNIT, SELL_START_DT, SELL_END_DT, DLV_CONSTRAINT, AS_FLG, RETURN_FLG, IMG_ORG_FILE_NM, IMG_GEN_FILE_NM, REG_ID, REG_DTM) 
VALUES('PRD000000017', '미카베이직펜츠', 'CAT000000003', '세련된 느낌이 참좋아요', 24500, '20140201', '20141201', '국내 배송만 됩니다.', 'Y', 'Y',  'bottom_image2.jpg', 'bottom_image2.jpg', 'admin', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ;

INSERT INTO TB_PRODUCT(PRD_NO, PRD_NM, CATEGORY_NO, PRD_DES, SELL_PRC_UNIT, SELL_START_DT, SELL_END_DT, DLV_CONSTRAINT, AS_FLG, RETURN_FLG, IMG_ORG_FILE_NM, IMG_GEN_FILE_NM, REG_ID, REG_DTM) 
VALUES('PRD000000018', '빈스큐롯반펜츠', 'CAT000000003', '가볍고 시원하게 즐겨주세요', 24000, '20140201', '20141201', '국내 배송만 됩니다.', 'Y', 'Y',  'bottom_image3.jpg', 'bottom_image3.jpg', 'admin', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ;

INSERT INTO TB_PRODUCT(PRD_NO, PRD_NM, CATEGORY_NO, PRD_DES, SELL_PRC_UNIT, SELL_START_DT, SELL_END_DT, DLV_CONSTRAINT, AS_FLG, RETURN_FLG, IMG_ORG_FILE_NM, IMG_GEN_FILE_NM, REG_ID, REG_DTM) 
VALUES('PRD000000019', '브루노배기팬츠', 'CAT000000003', '화사한 플라워 패턴으로 스타일UP ', 26000, '20140201', '20141201', '국내 배송만 됩니다.', 'Y', 'Y',  'bottom_image4.jpg', 'bottom_image4.jpg', 'admin', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ;

INSERT INTO TB_PRODUCT(PRD_NO, PRD_NM, CATEGORY_NO, PRD_DES, SELL_PRC_UNIT, SELL_START_DT, SELL_END_DT, DLV_CONSTRAINT, AS_FLG, RETURN_FLG, IMG_ORG_FILE_NM, IMG_GEN_FILE_NM, REG_ID, REG_DTM) 
VALUES('PRD000000020', '히스토리팬츠', 'CAT000000003', '신축성좋은 슬림핏데님', 27000, '20140201', '20141201', '국내 배송만 됩니다.', 'Y', 'Y',  'bottom_image5.jpg', 'bottom_image5.jpg', 'admin', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ;


INSERT INTO TB_PRODUCT(PRD_NO, PRD_NM, CATEGORY_NO, PRD_DES, SELL_PRC_UNIT, SELL_START_DT, SELL_END_DT, DLV_CONSTRAINT, AS_FLG, RETURN_FLG, IMG_ORG_FILE_NM, IMG_GEN_FILE_NM, REG_ID, REG_DTM) 
VALUES('PRD000000021', '필립차이나 사파리', 'CAT000000004', '네추럴한 핏과 가벼운 소재로 편하게 걸치기 좋아요',61800, '20140201', '20141201', '국내 배송만 됩니다.', 'Y', 'Y',  'outer_image1.gif', 'outer_image1.gif', 'admin', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ;

INSERT INTO TB_PRODUCT(PRD_NO, PRD_NM, CATEGORY_NO, PRD_DES, SELL_PRC_UNIT, SELL_START_DT, SELL_END_DT, DLV_CONSTRAINT, AS_FLG, RETURN_FLG, IMG_ORG_FILE_NM, IMG_GEN_FILE_NM, REG_ID, REG_DTM) 
VALUES('PRD000000022', '띠어리nb', 'CAT000000004', '아우터 셔츠로 연출하기 좋은 실용적인 아이템', 59000, '20140201', '20141201', '국내 배송만 됩니다.', 'Y', 'Y',  'outer_image2.gif', 'outer_image2.gif', 'admin', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ;

INSERT INTO TB_PRODUCT(PRD_NO, PRD_NM, CATEGORY_NO, PRD_DES, SELL_PRC_UNIT, SELL_START_DT, SELL_END_DT, DLV_CONSTRAINT, AS_FLG, RETURN_FLG, IMG_ORG_FILE_NM, IMG_GEN_FILE_NM, REG_ID, REG_DTM) 
VALUES('PRD000000023', '메종더블', 'CAT000000004', '날씬하게 떨어지는 핏이 정말 매력적인', 73000, '20140201', '20141201', '국내 배송만 됩니다.', 'Y', 'Y',  'outer_image3.gif', 'outer_image3.gif', 'admin', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ;

INSERT INTO TB_PRODUCT(PRD_NO, PRD_NM, CATEGORY_NO, PRD_DES, SELL_PRC_UNIT, SELL_START_DT, SELL_END_DT, DLV_CONSTRAINT, AS_FLG, RETURN_FLG, IMG_ORG_FILE_NM, IMG_GEN_FILE_NM, REG_ID, REG_DTM) 
VALUES('PRD000000024', '세인트린넨jk', 'CAT000000004', '린넨 100% 고급스러운 자켓!소재,디자인,핏,마감 정말 좋은 퀄리티메이드 아이템!', 68000, '20140201', '20141201', '국내 배송만 됩니다.', 'Y', 'Y',  'outer_image4.gif', 'outer_image4.gif', 'admin', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ;

INSERT INTO TB_PRODUCT(PRD_NO, PRD_NM, CATEGORY_NO, PRD_DES, SELL_PRC_UNIT, SELL_START_DT, SELL_END_DT, DLV_CONSTRAINT, AS_FLG, RETURN_FLG, IMG_ORG_FILE_NM, IMG_GEN_FILE_NM, REG_ID, REG_DTM) 
VALUES('PRD000000025', '메이퀸 진주 조끼', 'CAT000000004', '가볍게 걸치기만해도 멋스러운 아이템!', 49300, '20140201', '20141201', '국내 배송만 됩니다.', 'Y', 'Y',  'outer_image5.gif', 'outer_image5.gif', 'admin', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ;






