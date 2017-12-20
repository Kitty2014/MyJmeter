package com.susie.action.equals;

import org.json.JSONArray;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//各种类型的数据
//		String standardData = "{'uid':123,'phone':null,'has_password':{'hight':true,'wight':1},'location':{'province':true,'city':'123'},'cpma':1,'lo':true}";
//		String resData = "{data:{'uid':123,'phone':1,'has_password':{'hight':true,'wight':true},'location':null,'lo':{'pre':true,'ci':ok}}}";

//		//打印外层字段
		String standardData = "{'error_code':0,'error_message':'SUCCESS::Api success','error_description':null,'data':{'order_sn':'test1735297413','presale_info':{'id':'182','deposit_start_time':1513678798,'deposit_end_time':1513681084,'final_payment_start_time':1513681089,'final_payment_end_time':1544112000,'can_use_coupon':'0','can_join_promotion':'0','deposit_price':0.01,'final_payment_price':0.01},'final_payment_order_id':'1506064515210781821','packages':[{'id':'123653','order_id':1218,'warehouse_id':'1','status':'40','title':'\\u5305\\u88f91','actions':[{'action':'refund','is_highlight':false,'text':'\\u7533\\u8bf7\\u552e\\u540e'},{'action':'presale_progress_package','is_highlight':false,'text':'\\u8ffd\\u8e2a\\u7269\\u6d41'}],'status_text':'\\u5df2\\u5b8c\\u6210','order_items':[{'goods_id':'262638','goods_item_id':300434,'group_and_spec_name':'\\u81ea\\u5b9a\\u4e49\\u5c5e\\u60271\\uff1aSIN049','image':{'s':{'path':'public\\/upload\\/goodsspc\\/origin\\/2017\\/06\\/28\\/9823d2824ec7efa2a3d8bb5a151363d7jSpeS5.jpg','url':'http:\\/\\/cdn3.meijiabang.cn\\/public\\/upload\\/goodsspc\\/origin\\/2017\\/06\\/28\\/9823d2824ec7efa2a3d8bb5a151363d7jSpeS5.jpg@320w_80Q.jpg','width':320,'height':0}},'is_freebies':false,'limited_use_voucher':true,'name':'\\u56de\\u5f52-\\u6d4b\\u8bd5\\u9884\\u552e\\u652f\\u4ed8-262638','stock':100,'app_route':'','goods_item':{'sale_price':110,'pay_price_string':null},'count':1,'price':0.01,'sale_price':0.01,'pay_price_string':null,'coupon_info':null,'mall_price':150,'package_id':123653,'per_spec_total_save_price':149.99,'can_cod':'1','promotion_id':'0','promotion_type':'','combine_id':0,'combine_count':0,'premium_optional_id':0,'can_return_separately':false,'final_payment_price':0.01,'deposit_price':0.01}]}],'can_cod':false,'cannot_cod_reason':'\\u5b9e\\u4ed8\\u91d1\\u989d\\u4e0d\\u6ee1159\\u5143','status_tip':null,'time_out':0,'actions':[{'action':'refund','is_highlight':false,'text':'\\u7533\\u8bf7\\u552e\\u540e'}],'status_text':'\\u5df2\\u5b8c\\u6210','shipping_address':{'province':'\\u5e7f\\u4e1c\\u7701','city':'\\u5e7f\\u5dde\\u5e02','district':'\\u5929\\u6cb3\\u533a','street':'\\u6c99\\u6cb3\\u8857\\u9053','name':'oms\\u6d4b\\u8bd5\\u8ba2\\u5355','phone':'13580478329','detail':'\\u70ed\\u5230\\u5929\\u660f\\u5730\\u6697'},'share_entity':{'share_entity_id':'final_payment_order|1506064515210781821','title':'\\u6211\\u5728\\u7f8e\\u7532\\u5e2e\\u4e0b\\u5355\\uff0c\\u4e00\\u5355\\u5c31\\u7701\\u4e86150\\u5143\\u5462\\uff01\\u5feb\\u6765\\u770b\\u770b\\u5427','text':'\\u7f8e\\u7532\\u5e2e\\u5546\\u57ce\\uff0c\\u7f8e\\u7532\\u3001\\u7f8e\\u776b\\u3001\\u5de5\\u5177\\u3001\\u9970\\u54c1\\uff0c\\u5929\\u5929\\u5e95\\u4ef7\\u72c2\\u6b22','image_url':'https:\\/\\/cdn3.meijiabang.cn\\/public\\/images\\/meijiabang_icon192.png','link_url':'http:\\/\\/m.meijiabang.cn\\/single-page\\/share-order\\/index.html?save_amount=150'},'bill':{'detail_info':[{'name':'\\u652f\\u4ed8\\u65b9\\u5f0f','desc':'\\u652f\\u4ed8\\u5b9d\\u652f\\u4ed8'},{'name':'\\u5b9a\\u91d1\\u5408\\u8ba1','desc':'\\uffe50.01'},{'name':'\\u5c3e\\u6b3e\\u5408\\u8ba1','desc':'\\uffe50.01'},{'name':'\\u8fd0\\u8d39','desc':'\\u514d\\u8fd0\\u8d39'}],'paid_info':[{'name':'\\u5df2\\u4ed8\\u5b9a\\u91d1\\uff08\\u4e0d\\u4e88\\u9000\\u6b3e\\uff09','desc':'\\uffe50.01'},{'name':'\\u5df2\\u4ed8\\u5c3e\\u6b3e','desc':'\\uffe50.01'}],'unpaid_info':[],'order_info':[{'name':'\\u8ba2\\u5355\\u7f16\\u53f7','desc':'test173527318635'},{'name':'\\u4e0b\\u5355\\u65f6\\u95f4','desc':'2017-12-19 19:06'},{'name':'\\u5b9a\\u91d1\\u4ed8\\u6b3e\\u65f6\\u95f4','desc':'2017-12-19 18:38'},{'name':'\\u5c3e\\u6b3e\\u4ed8\\u6b3e\\u65f6\\u95f4','desc':'2017-12-19 19:07'},{'name':'\\u4e70\\u5bb6\\u7559\\u8a00','desc':''}]},'contact':{'name':'oms\\u6d4b\\u8bd5\\u8ba2\\u5355','phone':'13580478329'},'presale_order_id':'1218','pay_price':0.01},'extra':233}";
		String resData = "{'error_code':1,'error_message':'SUCCESS::Api success','error_description':null,'data':{'order_sn':'test1735297413','presale_info':{'id':'182','deposit_start_time':1513678798,'deposit_end_time':1513681084,'final_payment_start_time':1513681089,'final_payment_end_time':1544112000,'can_use_coupon':'0','can_join_promotion':'0','deposit_price':0.01,'final_payment_price':0.01},'final_payment_order_id':'1506064515210781821','packages':[{'id':'123653','order_id':1218,'warehouse_id':'1','status':'40','title':'\\u5305\\u88f91','actions':[{'action':'refund','is_highlight':false,'text':'\\u7533\\u8bf7\\u552e\\u540e'},{'action':'presale_progress_package','is_highlight':false,'text':'\\u8ffd\\u8e2a\\u7269\\u6d41'}],'status_text':'0','order_items':[{'goods_id':'262638','goods_item_id':300434,'group_and_spec_name':'\\u81ea\\u5b9a\\u4e49\\u5c5e\\u60271\\uff1aSIN049','image':{'s':{'path':'1public\\/upload\\/goodsspc\\/origin\\/2017\\/06\\/28\\/9823d2824ec7efa2a3d8bb5a151363d7jSpeS5.jpg','url':'http:\\/\\/cdn3.meijiabang.cn\\/public\\/upload\\/goodsspc\\/origin\\/2017\\/06\\/28\\/9823d2824ec7efa2a3d8bb5a151363d7jSpeS5.jpg@320w_80Q.jpg','width':320,'height':0}},'is_freebies':false,'limited_use_voucher':true,'name':'\\u56de\\u5f52-\\u6d4b\\u8bd5\\u9884\\u552e\\u652f\\u4ed8-262638','stock':100,'app_route':'','goods_item':{'sale_price':110,'pay_price_string':null},'count':1,'price':0.01,'sale_price':0.01,'pay_price_string':null,'coupon_info':null,'mall_price':150,'package_id':123653,'per_spec_total_save_price':149.99,'can_cod':'1','promotion_id':'0','promotion_type':'','combine_id':0,'combine_count':0,'premium_optional_id':0,'can_return_separately':false,'final_payment_price':0.01,'deposit_price':0.01}]}],'can_cod':false,'cannot_cod_reason':'\\u5b9e\\u4ed8\\u91d1\\u989d\\u4e0d\\u6ee1159\\u5143','status_tip':null,'time_out':0,'actions':[{'action':'refund','is_highlight':false,'text':'\\u7533\\u8bf7\\u552e\\u540e'}],'status_text':'\\u5df2\\u5b8c\\u6210','shipping_address':{'province':'\\u5e7f\\u4e1c\\u7701','city':'\\u5e7f\\u5dde\\u5e02','district':'\\u5929\\u6cb3\\u533a','street':'\\u6c99\\u6cb3\\u8857\\u9053','name':'oms\\u6d4b\\u8bd5\\u8ba2\\u5355','phone':'13580478329','detail':'\\u70ed\\u5230\\u5929\\u660f\\u5730\\u6697'},'share_entity':{'share_entity_id':'final_payment_order|1506064515210781821','title':'\\u6211\\u5728\\u7f8e\\u7532\\u5e2e\\u4e0b\\u5355\\uff0c\\u4e00\\u5355\\u5c31\\u7701\\u4e86150\\u5143\\u5462\\uff01\\u5feb\\u6765\\u770b\\u770b\\u5427','text':'\\u7f8e\\u7532\\u5e2e\\u5546\\u57ce\\uff0c\\u7f8e\\u7532\\u3001\\u7f8e\\u776b\\u3001\\u5de5\\u5177\\u3001\\u9970\\u54c1\\uff0c\\u5929\\u5929\\u5e95\\u4ef7\\u72c2\\u6b22','image_url':'https:\\/\\/cdn3.meijiabang.cn\\/public\\/images\\/meijiabang_icon192.png','link_url':'http:\\/\\/m.meijiabang.cn\\/single-page\\/share-order\\/index.html?save_amount=150'},'bill':{'detail_info':[{'name':'\\u652f\\u4ed8\\u65b9\\u5f0f','desc':'\\u652f\\u4ed8\\u5b9d\\u652f\\u4ed8'},{'name':'\\u5b9a\\u91d1\\u5408\\u8ba1','desc':'\\uffe50.01'},{'name':'\\u5c3e\\u6b3e\\u5408\\u8ba1','desc':'\\uffe50.01'},{'name':'\\u8fd0\\u8d39','desc':'\\u514d\\u8fd0\\u8d39'}],'paid_info':[{'name':'\\u5df2\\u4ed8\\u5b9a\\u91d1\\uff08\\u4e0d\\u4e88\\u9000\\u6b3e\\uff09','desc':'\\uffe50.01'},{'name':'\\u5df2\\u4ed8\\u5c3e\\u6b3e','desc':'\\uffe50.01'}],'unpaid_info':[],'order_info':[{'name':'\\u8ba2\\u5355\\u7f16\\u53f7','desc':'test173527318635'},{'name':'\\u4e0b\\u5355\\u65f6\\u95f4','desc':'2017-12-19 19:06'},{'name':'\\u5b9a\\u91d1\\u4ed8\\u6b3e\\u65f6\\u95f4','desc':'2017-12-19 18:38'},{'name':'\\u5c3e\\u6b3e\\u4ed8\\u6b3e\\u65f6\\u95f4','desc':'2017-12-19 19:07'},{'name':'\\u4e70\\u5bb6\\u7559\\u8a00','desc':''}]},'contact':{'name':'oms\\u6d4b\\u8bd5\\u8ba2\\u5355','phone':'13580478329'},'presale_order_id':'1218','pay_price':0.01},'extra':null}";
//		EqualsJsonType eqType = new EqualsJsonType();
//		boolean result;
//		result = eqType.respTypeAssertion(standardData, resData);
//        System.out.println(result);

		EqualsJsonValue eqValue = new EqualsJsonValue();
		boolean result2;
		result2 = eqValue.respValueAssertion(standardData, resData);
		System.out.println(result2);

	}

}
