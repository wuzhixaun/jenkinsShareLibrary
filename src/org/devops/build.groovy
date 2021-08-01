package org.devops

class build {
    
    // docker容器直接build
    def DockerBuild(buildShell){
        sh """
        ${buildShell}
    """
    }
}
