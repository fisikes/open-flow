package org.fisikes.flow.server.interfaces;

import org.fisikes.flow.server.domain.GitRepoInfo;

public interface GitCmdApi {


    void deleteBranch(GitRepoInfo gitRepoInfo, String branchName);

    void createBranch(GitRepoInfo gitRepoInfo, String branchName);

    void mergeBranch(GitRepoInfo gitRepoInfo, String branchName, String targetBranch);
}
