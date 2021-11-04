package com.torben.Vanish

public class Main extends JavaPlugin {

  @Override
  public void onEnable() {
    System.out.println("Plugin Enabled")
  }
  
  List<Player> vanished  = new ArrayList<>();
  
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
  
    if (sender instanceof Player) {
      Player player = (Player) sender;
      
      if (cmd.getName().equalsIgnoreCase("vanish")) {
        if (vanished.contains(player)) {
          vanished.remove(player);
          for (Player target : Bukkit.getOnlinePlayers()) {
            target.showPlayer   
          }
          
        } else {
          vanished.add(player);
          for (Player target : Bukkit.getOnlinePlayers()) {
            target.hidePlayer
          }
          player.sendMessage(ChatColor.RED + "(!) You have been unvanished (!)"
        }
      }
    } 
    return false;
  }
  
}
