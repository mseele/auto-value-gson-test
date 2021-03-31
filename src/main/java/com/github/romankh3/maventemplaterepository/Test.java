package com.github.romankh3.maventemplaterepository;

import com.google.auto.value.AutoValue;
import com.ryanharter.auto.value.gson.GenerateTypeAdapter;

@GenerateTypeAdapter
@AutoValue
public abstract class Test {

	public abstract String test();

}
