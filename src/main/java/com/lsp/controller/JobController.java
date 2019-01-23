package com.lsp.controller;

import com.lsp.service.JobService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lsp
 * @Title: JobController
 * @ProjectName lsp
 * @Description: TODO
 * @date 2018/12/25 14:25
 */
@RestController
@RequestMapping("/quartztest")
@Api(value = "JobController", description = "demo接口")
public class JobController {
    @Autowired
    private JobService jobService;


    /**
     * 创建cron任务
     *
     * @param jobName
     * @param jobGroup
     * @return
     */
    @RequestMapping(value = "/cron", method = RequestMethod.POST)
    @ApiOperation(value="创建cron任务",notes="查询所有的人员接口说明")
    //@ApiImplicitParams({
    //        @ApiImplicitParam(name="month",value="年月，格式为：201801",dataType="String", paramType = "query"),
    //        @ApiImplicitParam(name="pageSize",value="页码",dataType="String", paramType = "query"),
    //        @ApiImplicitParam(name="pageNum",value="每页条数",dataType="String", paramType = "query"),
    //        @ApiImplicitParam(name="empName",value="业务员名称",dataType="String", paramType = "query"),
    //        @ApiImplicitParam(name="orderType",value="排序类型",dataType="String", paramType = "query"),
    //})
    @ApiResponse(response=String.class, code = 200, message = "接口返回一句话")
    public String startCronJob(@RequestParam("jobName") String jobName, @RequestParam("jobGroup") String jobGroup) {
        jobService.addCronJob(jobName, jobGroup);
        return "create cron task success";
    }

    /**
     * 创建异步任务
     *
     * @param jobName
     * @param jobGroup
     * @return
     */
    @RequestMapping(value = "/async", method = RequestMethod.POST)
    public String startAsyncJob(@RequestParam("jobName") String jobName, @RequestParam("jobGroup") String jobGroup) {
        jobService.addAsyncJob(jobName, jobGroup);
        return "create async task success";
    }

    /**
     * 暂停任务
     *
     * @param jobName
     * @param jobGroup
     * @return
     */
    @RequestMapping(value = "/pause", method = RequestMethod.POST)
    public String pauseJob(@RequestParam("jobName") String jobName, @RequestParam("jobGroup") String jobGroup) {
        jobService.pauseJob(jobName, jobGroup);
        return "pause job success";
    }

    /**
     * 恢复任务
     *
     * @param jobName
     * @param jobGroup
     * @return
     */
    @RequestMapping(value = "/resume", method = RequestMethod.POST)
    public String resumeJob(@RequestParam("jobName") String jobName, @RequestParam("jobGroup") String jobGroup) {
        jobService.resumeJob(jobName, jobGroup);
        return "resume job success";
    }

    /**
     * 删除务
     *
     * @param jobName
     * @param jobGroup
     * @return
     */
    @RequestMapping(value = "/delete", method = RequestMethod.PUT)
    public String deleteJob(@RequestParam("jobName") String jobName, @RequestParam("jobGroup") String jobGroup) {
        jobService.deleteJob(jobName, jobGroup);
        return "delete job success";
    }
}
