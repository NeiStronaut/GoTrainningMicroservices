-- Asuming we already have discounts loaded
INSERT INTO TBL_DISCOUNT(id, shop, shop_type, description, active, stamp_modifier, stamp_modified)
VALUES (100, 'STAR QUIDS CAFE', 'COFEE CHAIN', 'DISCOUNT APPLIES ON CAFEINATED COLD BEVERAGES ONLY', 'TRUE', 'sysmngr@thiscounts.com', '1522077777');
INSERT INTO TBL_DISCOUNT(id, shop, shop_type, description, active, stamp_modifier, stamp_modified) 
VALUES (101, 'ZAIRA', 'CLOTHING SHOP', 'DISCOUNT APPLIES ON ALL THE PRODUCTS BUT UNDERCLOTHES', 'TRUE', 'sysmngr@thiscounts.com', '1522077888');
INSERT INTO TBL_DISCOUNT(id, shop, shop_type, description, active, stamp_modifier, stamp_modified) 
VALUES (102, 'YOGO', 'ICECREAM SHOP', 'DISCOUNT APPLIES ON ALL THE DAIRY PRODUCTS', 'TRUE', 'sysmngr@thiscounts.com', '1522077999');

-- Asuming we already have companies loaded
INSERT INTO TBL_COMPANY(id, name, active, stamp_modifier, stamp_modified) 
VALUES (100, 'THISCOUNTS CO', 'TRUE', 'sysmngr@thiscounts.com', '1522088444');
INSERT INTO TBL_COMPANY(id, name, active, stamp_modifier, stamp_modified)  
VALUES (101, 'GLOBANT', 'TRUE', 'sysmngr@thiscounts.com', '1522088333');
INSERT INTO TBL_COMPANY(id, name, active, stamp_modifier, stamp_modified)  
VALUES (102, 'NICO BOXING KING', 'FALSE', 'sysmngr@thiscounts.com', '1522088111');


-- Defaults for examples
INSERT INTO TBL_EMPLOYEE(id, company_id, name, name_additionals, last_name, last_name_additionals, rfc, mail_busines, mail_personal, active, stamp_modifier, stamp_modified)
VALUES (200, 100, 'Yoshimi', '', 'Yorkshire', 'Terrier', 'YOTY141223', 'yoshimi@thiscounts.com', '', 'TRUE', 'sysmngr@thiscounts.com', '1521999444');

INSERT INTO TBL_VAULT(id, employee_id, hash, roles, failed_attempts, open_session, locked, stamp_modifier, stamp_modified)  
VALUES (1, 200, 'ABCDEFG1234567890', 'SYSMGR; CPYMGR; EMP', 0, 'FALSE', 'FALSE', 'sysmngr@thiscounts.com', '1521988444');
