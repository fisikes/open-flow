package org.fisikes.flow.server.interfaces;


import lombok.AllArgsConstructor;
import org.fisikes.flow.server.domain.GitRepoInfo;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@Component
@AllArgsConstructor
public class GitCmd implements GitCmdApi {


    @Override
    public void deleteBranch(GitRepoInfo gitRepoInfo, String branchName) {

    }

    @Override
    public void createBranch(GitRepoInfo gitRepoInfo, String branchName) {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("git", "checkout", "-b", branchName);
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();

            // 读取命令输出
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            int exitCode = process.waitFor();
            if (exitCode == 0) {
                System.out.println("Branch '" + branchName + "' created successfully.");
            } else {
                System.out.println("Failed to create branch. Exit code: " + exitCode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void mergeBranch(GitRepoInfo gitRepoInfo, String branchName, String targetBranch) {

    }
}
