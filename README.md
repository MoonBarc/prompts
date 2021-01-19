# THIS IS NOT IMPLEMENTED YET HOW DID YOU FIND THIS REPO!?!?

# prompts
Prompts is a simple library that allows you to prompt users for a variety of answers through cool guis!

Need to ask your user if they really want to do that destructive action? Need to ask them for their favorite color? This is the perfect plugin for all types of input.

Featuring:
 - Text input
    - signs
    - anvils
    - books
    - chat
 - Color selector
    - wool
    - concrete
    - glass
 - Destructive action confirmation
    - delayed button (button is greyed out for x seconds)
    - knob (drag item and drop it in specific slot to confirm)
 - General action confirmation
 - And more!
 
## Examples:
### Confirmation prompt
```java
Confirmation c = new ConfirmationBuilder().setCancelIcon(Material.BARRIER).setTitle(ChatColor.RED + "Would you like to do that?").onConfirm((player) -> {
  // TODO: Do things here!
}).build();
c.prompt(player);
```
### Chat input
```java
ChatInput c = new ChatInputBuilder().setTitle(ChatColor.GREEN + "What is 4*5?").setSubtitle(ChatColor.YELLOW + "Answer in chat!").setTimes(20,60,20).onAnswer((player,answer) -> {
  // TODO: Do things with message!
}).build()
c.prompt(player);
```
### Destructive confirmation prompt.
```java
DestructiveConfirmation c = new DestructiveConfirmationBuilder().setTitle(ChatColor.RED + "Are you sure you want to do that?").setBackground(Material.AIR).setDraggable(Material.IRON_SWORD).setMethod(DESTRUCTIVEMETHOD.KNOB).onConfirm((player) -> {
  // TODO: Do something evil >:)
}).build()
c.prompt(player);
```
