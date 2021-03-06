package com.pawnini.model.product.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pawnini.model.product.ProductDTO;

@Repository
public class ProductDAO {
	
	@Autowired
	private SqlSessionTemplate mybtis;
	
	//상품 등록
	public void insertProduct(ProductDTO dto) {
		System.out.println("mybatis => insertProduct 실행 전");
		mybtis.insert("ProductDAO.insertProduct",dto);
		System.out.println("mybatis => insertProduct 실행 완료");
	}
	//상품 수정
	public void updateProduct(ProductDTO dto) {
		System.out.println("mybatis => updateProduct 실행 전");
		mybtis.update("ProductDAO.updateProduct",dto);
		System.out.println("mybatis => updateProduct 실행 완료");
	}
	//상품 삭제
	public void deleteProduct(ProductDTO dto) {
		System.out.println("mybatis => deleteProduct 실행 전");
		mybtis.delete("ProductDAO.deleteProduct",dto);
		System.out.println("mybatis => deleteProduct 실행 완료");
	}
	//상세 보기
	public ProductDTO getProduct(ProductDTO dto) {
		System.out.println("mybatis => getProduct 실행");
		return (ProductDTO) mybtis.selectOne("ProductDAO.getProduct",dto);
	}
	//상품 리스트
	public List<ProductDTO> getProductList(ProductDTO dto) {
		System.out.println("mybatis => getProductList 실행");
		return mybtis.selectList("ProductDAO.getProductList",dto);
	}
	
	//리스트 불러오기
	public int getCountProduct(ProductDTO dto) {
		System.out.println("mybatis => 상품 카운트 불러오기");
		return mybtis.selectOne("ProductDAO.getCountProduct",dto);
	}
}







