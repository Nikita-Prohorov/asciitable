/* Copyright 2016 Sven van der Meer <vdmeer.sven@mykolab.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.vandermeer.asciitable.examples;

import org.apache.commons.lang3.text.StrBuilder;

import de.vandermeer.asciitable.AsciiTable;
import de.vandermeer.skb.interfaces.StandardExampleAsCmd;

/**
 * AsciiTable example for a simple table as getting started example.
 *
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.3.2 build 170502 (02-May-17) for Java 1.8
 * @since      v0.0.3
 */
public class AT_01d_3Columns implements StandardExampleAsCmd {

	@Override
	public void showOutput(){
		// tag::example[]
		AsciiTable at = new AsciiTable();
		at.addRule();
		at.addRow("first row (col1)", "some information (col2)", "more info (col3)");
		at.addRule();
		at.addRow("second row (col1)", "some information (col2)", "more info (col3)");
		at.addRule();
		System.out.println(at.render());
		// end::example[]
	}

	@Override
	public StrBuilder getSource(){
		String[] source = new String[]{
				"AsciiTable at = new AsciiTable();",
				"at.addRule();",
				"at.addRow(\"first row (col1)\", \"some information (col2)\", \"more info (col3)\");",
				"at.addRule();",
				"at.addRow(\"second row (col1)\", \"some information (col2)\", \"more info (col3)\");",
				"at.addRule();",
				"System.out.println(at.render());",
		};
		return new StrBuilder().appendWithSeparators(source, "\n");
	}

	@Override
	public String getDescription() {
		return "table with 3 columns";
	}

	@Override
	public String getID() {
		return "3cols";
	}
}
