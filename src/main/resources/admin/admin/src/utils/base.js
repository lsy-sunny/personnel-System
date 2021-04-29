const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot27ek2/",
            name: "springboot27ek2",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot27ek2/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "人事管理系统"
        } 
    }
}
export default base
