import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GitPushAll {

    public static void main(String[] args) {
        pushToAllRemotesAndBranches();
    }

    // Get a list of all Git remotes
    private static List<String> getRemotes() {
        List<String> remotes = new ArrayList<>();
        try {
            Process process = new ProcessBuilder("git", "remote").start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                remotes.add(line.trim());
            }
            process.waitFor();
        } catch (Exception e) {
            System.err.println("Failed to retrieve remotes: " + e.getMessage());
        }
        return remotes;
    }

    // Get a list of all branches
    private static List<String> getBranches() {
        Set<String> branches = new HashSet<>();
        try {
            Process process = new ProcessBuilder("git", "branch", "--all").start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                String branch = line.replace("remotes/", "").replace("*", "").trim();
                branches.add(branch);
            }
            process.waitFor();
        } catch (Exception e) {
            System.err.println("Failed to retrieve branches: " + e.getMessage());
        }
        return new ArrayList<>(branches);
    }

    // Push to all remotes and branches
    private static void pushToAllRemotesAndBranches() {
        List<String> remotes = getRemotes();
        List<String> branches = getBranches();

        for (String remote : remotes) {
            for (String branch : branches) {
                System.out.println("Pushing to " + remote + "/" + branch + "...");
                try {
                    Process process = new ProcessBuilder("git", "push", remote, branch).start();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                    BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));

                    // Read output
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                    }

                    // Read errors
                    while ((line = errorReader.readLine()) != null) {
                        System.err.println(line);
                    }

                    process.waitFor();
                    if (process.exitValue() != 0) {
                        System.err.println("Failed to push to " + remote + "/" + branch);
                    }

                } catch (Exception e) {
                    System.err.println("Error pushing to " + remote + "/" + branch + ": " + e.getMessage());
                }
            }
        }
    }
}
