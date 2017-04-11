package com.gmail.xibalbazedd.zhorse.enums;

public enum LocaleEnum {
	
	/* headers */
	ADMIN_COMMAND_LIST_HEADER("Headers.adminCommandListHeader"),
	AVAILABLE_OPTION_FORMAT("Headers.availableOptionFormat"),
	COMMAND_LIST_HEADER("Headers.commandListHeader"),
	COMMAND_USAGE_FORMAT("Headers.commandUsageFormat"),
	COMMAND_USAGE_HEADER("Headers.commandUsageHeader"),
	FRIEND_COMMAND_LIST_HEADER("Headers.friendCommandListHeader"),
	FRIEND_LIST_FORMAT("Headers.friendListFormat"),
	HEADER_FORMAT("Headers.headerFormat"),
	HORSE_INFO_HEADER("Headers.horseInfoHeader"),
	HORSE_LIST_FORMAT("Headers.horseListFormat"),
	HORSE_LIST_FORMAT_FAVORITE("Headers.horseListFormatFavorite"),
	HORSE_LIST_HEADER("Headers.horseListHeader"),
	HORSE_LIST_OTHER_HEADER("Headers.horseListOtherHeader"),
	HORSE_OPTION_FORMAT("Headers.horseOptionFormat"),
	PLUGIN_HEADER("Headers.pluginHeader"),
	PLUGIN_PREFIX("Headers.pluginPrefix"),
	REMAINING_CLAIMS_FORMAT("Headers.remainingClaimsFormat"),
	SETTINGS_COMMAND_LIST_HEADER("Headers.settingsCommandListHeader"),
	
	/* messages */
	CLAIMS_LIMIT_REACHED("Messages.claimsLimitReached"),
	CLAIMS_LIMIT_REACHED_OTHER("Messages.claimsLimitReachedOther"),
	DATABASE_IMPORT_FAILURE("Messages.databaseImportFailure"),
	DATABASE_IMPORT_STARTED("Messages.databaseImportStarted"),
	DATABASE_IMPORT_SUCCESS("Messages.databaseImportSuccess"),
	FAVORITE_ALREADY_SET("Messages.favoriteAlreadySet"),
	FAVORITE_ALREADY_SET_OTHER("Messages.favoriteAlreadySetOther"),
	FAVORITE_EDITED("Messages.favoriteEdited"),
	FAVORITE_EDITED_OTHER("Messages.favoriteEditedOther"),
	FRIEND_ADDED("Messages.friendAdded"),
	FRIEND_ADDED_REVERSE("Messages.friendAddedReverse"),
	FRIEND_ALREADY_ADDED("Messages.friendAlreadyAdded"),
	FRIEND_LIST("Messages.friendList"),
	FRIEND_LIST_OTHER("Messages.friendListOther"),
	FRIEND_LIST_REVERSE("Messages.friendListReverse"),
	FRIEND_LIST_REVERSE_OTHER("Messages.friendListReverseOther"),
	FRIEND_REMOVED("Messages.friendRemoved"),
	FRIEND_REMOVED_REVERSE("Messages.friendRemovedReverse"),
	HORSE_ALREADY_CLAIMED("Messages.horseAlreadyClaimed"),
	HORSE_ALREADY_ON_SALE("Messages.horseAlreadyOnSale"),
	HORSE_BELONGS_TO("Messages.horseBelongsTo"),
	HORSE_BOUGHT("Messages.horseBought"),
	HORSE_CLAIMED("Messages.horseClaimed"),
	HORSE_CLEARED("Messages.horseCleared"),
	HORSE_CLEARED_OTHER("Messages.horseClearedOther"),
	HORSE_DIED("Messages.horseDied"),
	HORSE_FREED("Messages.horseFreed"),
	HORSE_GIVEN("Messages.horseGiven"),
	HORSE_HEALED("Messages.horseHealed"),
	HORSE_IS_PROTECTED("Messages.horseIsProtected"),
	HORSE_KILLED("Messages.horseKilled"),
	HORSE_LEASHED("Messages.horseLeashed"),
	HORSE_LEASHED_BY("Messages.horseLeashedBy"),
	HORSE_LOCKED("Messages.horseLocked"),
	HORSE_MANUALLY_TAMED("Messages.horseManuallyTamed"),
	HORSE_MOUNTED("Messages.horseMounted"),
	HORSE_MOUNTED_BY("Messages.horseMountedBy"),
	HORSE_NAME_BANNED("Messages.horseNameBanned"),
	HORSE_NAME_FORBIDDEN("Messages.horseNameForbidden"),
	HORSE_NAME_MANDATORY("Messages.horseNameMandatory"),
	HORSE_NAME_TOO_LONG("Messages.horseNameTooLong"),
	HORSE_NAME_TOO_SHORT("Messages.horseNameTooShort"),
	HORSE_NOT_CLAIMED("Messages.horseNotClaimed"),
	HORSE_NOT_FOR_SALE("Messages.horseNotForSale"),
	HORSE_NOT_FOUND("Messages.horseNotFound"),
	HORSE_NOT_TAMED("Messages.horseNotTamed"),
	HORSE_OUT_OF_RANGE("Messages.horseOutOfRange"),
	HORSE_PROTECTED("Messages.horseProtected"),
	HORSE_PUT_UP_FOR_SALE("Messages.horsePutUpForSale"),
	HORSE_RECEIVED("Messages.horseReceived"),
	HORSE_RENAMED("Messages.horseRenamed"),
	HORSE_SHARED("Messages.horseShared"),
	HORSE_SOLD("Messages.horseSold"),
	HORSE_SPAWNED("Messages.horseSpawned"),
	HORSE_TAMED("Messages.horseTamed"),
	HORSE_TELEPORTED("Messages.horseTeleported"),
	HORSE_UNLOCKED("Messages.horseUnlocked"),
	HORSE_UNPROTECTED("Messages.horseUnprotected"),
	HORSE_UNSHARED("Messages.horseUnshared"),
	HORSE_UNTAMED("Messages.horseUntamed"),
	HORSE_WITHDRAWN_FROM_SALE("Messages.horseWithdrawnFromSale"),
	IDS_SWAPPED("Messages.idsSwapped"),
	INVALID_HEALTH_ARGUMENT("Messages.invalidHealthArgument"),
	INVALID_JUMP_ARGUMENT("Messages.invalidJumpArgument"),
	INVALID_SPEED_ARGUMENT("Messages.invalidSpeedArgument"),
	INVALID_STRENGTH_ARGUMENT("Messages.invalidStrengthArgument"),
	LANGUAGE_ALREADY_USED("Messages.languageAlreadyUsed"),
	LANGUAGE_ALREADY_USED_OTHER("Messages.languageAlreadyUsedOther"),
	LANGUAGE_EDITED("Messages.languageEdited"),
	LANGUAGE_EDITED_OTHER("Messages.languageEditedOther"),
	LIST_HORSE_COLOR("Messages.listHorseColor"),
	LIST_HORSE_STYLE("Messages.listHorseStyle"),
	LIST_HORSE_VARIANT("Messages.listHorseVariant"),
	LIST_LLAMA_COLOR("Messages.listLlamaColor"),
	MISSING_ARGUMENTS("Messages.missingArguments"),
	MISSING_DATABASE("Messages.missingDatabase"),
	MISSING_HORSE_ID("Messages.missingHorseId"),
	MISSING_HORSE_IDS("Messages.missingHorseIds"),
	MISSING_LANGUAGE("Messages.missingLanguage"),
	MISSING_PERMISSION("Messages.missingPermission"),
	MISSING_PERMISSION_OTHER("Messages.missingPermissionOther"),
	MISSING_STATS_DISPLAY_MODE("Messages.missingStatsDisplayMode"),
	MISSING_TARGET("Messages.missingTarget"),
	NO_FRIEND("Messages.noFriend"),
	NO_FRIEND_OTHER("Messages.noFriendOther"),
	NO_FRIEND_REVERSE("Messages.noFriendReverse"),
	NO_FRIEND_REVERSE_OTHER("Messages.noFriendReverseOther"),
	NO_HORSE_OWNED("Messages.noHorseOwned"),
	NO_HORSE_OWNED_OTHER("Messages.noHorseOwnedOther"),
	NOT_ON_HORSE("Messages.notOnHorse"),
	PLAYED_CLEARED("Messages.playerCleared"),
	PLAYER_CLEARED_OTHER("Messages.playerClearedOther"),
	PLAYER_COMMAND("Messages.playerCommand"),
	PLAYER_OFFLINE("Messages.playerOffline"),
	PLUGIN_RELOADED("Messages.pluginReloaded"),
	PLUGIN_RELOADED_WITH_ERRORS("Messages.pluginReloadedWithErrors"),
	SAME_PLAYER("Messages.samePlayer"),
	STATS_DISPLAY_MODE_ALREADY_USED("Messages.statsDisplayModeAlreadyUsed"),
	STATS_DISPLAY_MODE_ALREADY_USED_OTHER("Messages.statsDisplayModeAlreadyUsedOther"),
	STATS_DISPLAY_MODE_EDITED("Messages.statsDisplayModeEdited"),
	STATS_DISPLAY_MODE_EDITED_OTHER("Messages.statsDisplayModeEditedOther"),
	TELEPORTED_TO_HORSE("Messages.teleportedToHorse"),
	UNKNOWN_ADMIN_COMMAND("Messages.unknownAdminCommand"),
	UNKNOWN_COMMAND("Messages.unknownCommand"),
	UNKNOWN_DATABASE("Messages.unknownDatabase"),
	UNKNOWN_FRIEND("Messages.unknownFriend"),
	UNKNOWN_FRIEND_COMMAND("Messages.unknownFriendCommand"),
	UNKNOWN_HORSE_ID("Messages.unknownHorseId"),
	UNKNOWN_HORSE_ID_OTHER("Messages.unknownHorseIdOther"),
	UNKNOWN_HORSE_NAME("Messages.unknownHorseName"),
	UNKNOWN_HORSE_NAME_OTHER("Messages.unknownHorseNameOther"),
	UNKNOWN_LANGUAGE("Messages.unknownLanguage"),
	UNKNOWN_PLAYER("Messages.unknownPlayer"),
	UNKNOWN_SETTINGS_COMMAND("Messages.unknownSettingsCommand"),
	UNKNOWN_SPAWN_ARGUMENT("Messages.unknownSpawnArgument"),
	UNKNOWN_STATS_DISPLAY_MODE("Messages.unknownStatsDisplayMode"),
	WORLD_DISABLED("Messages.worldDisabled"),
	WORLD_UNCROSSABLE("Messages.worldUncrossable"),
	
	/* economy messages */
	AFFORDABLE_COLOR("Economy.affordableColor"),
	COMMAND_COST("Economy.commandCost"),
	COMMAND_PAID("Economy.commandPaid"),
	CURRENCY_SYMBOL("Economy.currencySymbol"),
	HORSE_PRICE("Economy.horsePrice"),
	NOT_ENOUGH_MONEY("Economy.notEnoughMoney"),
	UNAFFORDABLE_COLOR("Economy.unaffordableColor"),
	
	/* horse informations */
	HEALTH("Horse informations.health"),
	ID("Horse informations.id"),
	JUMP("Horse informations.jump"),
	LOCATION("Horse informations.location"),
	LOCKED("Horse informations.locked"),
	NAME("Horse informations.name"),
	OWNER("Horse informations.owner"),
	PRICE("Horse informations.price"),
	PROTECTED("Horse informations.protected"),
	RESTRICTED("Horse informations.restricted"),
	SHARED("Horse informations.shared"),
	SPEED("Horse informations.speed"),
	STATUS("Horse informations.status"),
	STRENGTH("Horse informations.strength"),
	
	/* command descriptions */
	ADMIN_DESCRIPTION("Command descriptions.admin"),
	BUY_DESCRIPTION("Command descriptions.buy"),
	CLAIM_DESCRIPTION("Command descriptions.claim"),
	FREE_DESCRIPTION("Command descriptions.free"),
	FRIEND_DESCRIPTION("Command descriptions.friend"),
	GIVE_DESCRIPTION("Command descriptions.give"),
	HEAL_DESCRIPTION("Command descriptions.heal"),
	HELP_DESCRIPTION("Command descriptions.help"),
	HERE_DESCRIPTION("Command descriptions.here"),
	INFO_DESCRIPTION("Command descriptions.info"),
	KILL_DESCRIPTION("Command descriptions.kill"),
	LIST_DESCRIPTION("Command descriptions.list"),
	LOCK_DESCRIPTION("Command descriptions.lock"),
	RENAME_DESCRIPTION("Command descriptions.rename"),
	PROTECT_DESCRIPTION("Command descriptions.protect"),
	RELOAD_DESCRIPTION("Command descriptions.reload"),
	SELL_DESCRIPTION("Command descriptions.sell"),
	SETTINGS_DESCRIPTION("Command descriptions.settings"),
	SHARE_DESCRIPTION("Command descriptions.share"),
	SPAWN_DESCRIPTION("Command descriptions.spawn"),
	TAME_DESCRIPTION("Command descriptions.tame"),
	TP_DESCRIPTION("Command descriptions.tp"),
	
	/* admin command descriptions */
	ADMIN_CLEAR_DESCRIPTION("Admin command descriptions.clear"),
	ADMIN_IMPORT_DESCRIPTION("Admin command descriptions.import"),
	
	/* friend command descriptions */
	FRIEND_ADD_DESCRIPTION("Friend command descriptions.add"),
	FRIEND_LIST_DESCRIPTION("Friend command descriptions.list"),
	FRIEND_REMOVE_DESCRIPTION("Friend command descriptions.remove"),
	
	/* settings command descriptions */
	SETTINGS_FAVORITE_DESCRIPTION("Settings command descriptions.favorite"),
	SETTINGS_LANGUAGE_DESCRIPTION("Settings command descriptions.language"),
	SETTINGS_STATS_DESCRIPTION("Settings command descriptions.stats"),
	SETTINGS_SWAP_DESCRIPTION("Settings command descriptions.swap"),
	
	/* command usages */
	ADMIN_USAGE("Command usages.admin"),
	BUY_USAGE("Command usages.buy"),
	CLAIM_USAGE("Command usages.claim"),
	FREE_USAGE("Command usages.free"),
	FRIEND_USAGE("Command usages.friend"),
	GIVE_USAGE("Command usages.give"),
	HEAL_USAGE("Command usages.heal"),
	HELP_USAGE("Command usages.help"),
	HERE_USAGE("Command usages.here"),
	INFO_USAGE("Command usages.info"),
	KILL_USAGE("Command usages.kill"),
	LIST_USAGE("Command usages.list"),
	LOCK_USAGE("Command usages.lock"),
	RENAME_USAGE("Command usages.rename"),
	PROTECT_USAGE("Command usages.protect"),
	RELOAD_USAGE("Command usages.reload"),
	SELL_USAGE("Command usages.sell"),
	SETTINGS_USAGE("Command usages.settings"),
	SHARE_USAGE("Command usages.share"),
	SPAWN_USAGE("Command usages.spawn"),
	TAME_USAGE("Command usages.tame"),
	TP_USAGE("Command usages.tp"),
	
	/* admin command usages */
	ADMIN_CLEAR_USAGE("Admin command usages.clear"),
	ADMIN_IMPORT_USAGE("Admin command usages.import"),
	
	/* friend command usages */
	FRIEND_ADD_USAGE("Friend command usages.add"),
	FRIEND_LIST_USAGE("Friend command usages.list"),
	FRIEND_REMOVE_USAGE("Friend command usages.remove"),
	
	/* settings command usages */
	SETTINGS_FAVORITE_USAGE("Settings command usages.favorite"),
	SETTINGS_LANGUAGE_USAGE("Settings command usages.language"),
	SETTINGS_STATS_USAGE("Settings command usages.stats"),
	SETTINGS_SWAP_USAGE("Settings command usages.swap");
	
	private String index;
	
	LocaleEnum(String index) {
		this.index = index;
	}
	
	public String getIndex() {
		return index;
	}
	  
}