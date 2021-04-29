package com.board.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.board.domain.BoardVO;
import com.board.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {

    @Inject
    private BoardService service;

    // 게시물 목록 
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public void getList(Model model) throws Exception {  // Model: Controller와 View 연결
  
	    List list = null;
	    list = service.list();
	    model.addAttribute("list", list);
    }
    
    // 게시물 작성
    @RequestMapping(value = "/write", method = RequestMethod.GET)
    public void getWrite() throws Exception{
    	/* GET메소드는 서버 -> 사용자로 데이터를 이동시킴
    	 * 게시물 작성은 사용자가 입력한 데이터가 서버로 이동해야하므로 POST메소드가 필요하다
    	 * 그럼 POST만 작성하면 되지않나? -> 405에러 -> GET과 POST 둘다 필요함 */
    }
    
    // 게시물 작성
    @RequestMapping(value = "/write", method = RequestMethod.POST)
    public String getWirte(BoardVO vo) throws Exception {
    	service.write(vo);
    	
    	return "redirect:/board/list";
       
    }
    
}
