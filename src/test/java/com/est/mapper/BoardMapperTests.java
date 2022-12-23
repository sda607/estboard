package com.est.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.est.domain.BoardVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	@Autowired
	private BoardMapper boardMapper;
	
	
	@Test
	public void testGetList() {
		
		log.info(".................");
		boardMapper.getList();
	}
	
	@Test
	public void testInsert() {
		
		BoardVO vo = new BoardVO();
		vo.setTitle("Test");
		vo.setContent("content 내용이지");
		vo.setWriter("작성자는 누구야 ");
		
		boardMapper.insert(vo);
		log.info("...................");
		log.info("after inset" + vo.getBno());
	}
	
	@Test
	public void testInsertSelectKey() {
		BoardVO vo = new BoardVO();
		vo.setTitle("AAATest");
		vo.setContent("AAAAcontent 내용이지");
		vo.setWriter("AAAA작성자는 누구야 ");
		
		boardMapper.insertSelectKey(vo);
		
		log.info("...................");
		log.info("after selectKey" + vo.getBno());
	}
}
