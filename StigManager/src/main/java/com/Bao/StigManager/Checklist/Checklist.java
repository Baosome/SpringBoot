package com.Bao.StigManager.Checklist;

import java.util.List;

public record Checklist(String checkListTitle, String description, String publishDate, List<StigVul> stigVuls) {}