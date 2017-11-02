package edu.ecnu.sqslab.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Mr.Liu
 * Created by user on 2017/11/1.
 */
@Controller
public class FDroidAppController {

    @Autowired
    IssueFDroidRepository issueRepository;

    @GetMapping("/FDroid.html")
    public ModelAndView home(
            @RequestParam(value = "p", required = false, defaultValue = "1") int index,
            @RequestParam(value = "s", required = false, defaultValue = "20") int size) {
        ModelAndView modelAndView = new ModelAndView("FDroid");
        PageRequest request = new PageRequest(index - 1, size);
        Page<IssueFDroid> issues = issueRepository.findAllByTypeContains("t",request);
        modelAndView.addObject("issues", issues.getContent());
        modelAndView.addObject("pagination", new Pagination(
                "FDroid.html", index,
                Math.max(index - size, 1),
                Math.min(index + size, issues.getTotalPages() + 1),
                size,
                issues.getTotalPages() + 1, issues.isFirst(), issues.isLast())
        );
        return modelAndView;
    }

    @ResponseBody
    @PostMapping("/issueFDroidSummary")
    public Response<IssueFDroid> issueFDroidSummary(
            @RequestParam(value = "issueId") long issueId,
            @RequestParam(value = "summary") String summary) {
        IssueFDroid issue = issueRepository.findOne(issueId);
        if (issue == null) {
            return Response.failed("找不到issue");
        }
        issue.setSummary(summary);
        if(!"[Thread]".equals(summary)){
            issue.setType("0");
        }
        issue = issueRepository.save(issue);
        return Response.ok(issue);
    }
}
