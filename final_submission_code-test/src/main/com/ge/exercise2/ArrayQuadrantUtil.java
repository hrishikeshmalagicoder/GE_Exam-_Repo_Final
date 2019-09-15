package com.ge.exercise2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author HRISHIKESH
 * 
 *         This Class supports char and float data types and can be extended for
 *         other data types if needed
 * 
 *         partition methods() return portion of matrix with custom size
 *         specified
 * 
 *         Quadrant values method() return 4 values
 * 
 *         Row and Column method() return row and column values respectively
 * 
 * 
 */

public class ArrayQuadrantUtil {
	private static final Logger logger = LogManager.getLogger(ArrayQuadrantUtil.class);

	char[][] data;
	float[][] floatdata;

	public ArrayQuadrantUtil(char[][] data) {
		this.data = data;
	}

	public ArrayQuadrantUtil(float[][] data) {
		this.floatdata = data;
	}

	public char[] getRowValues(int row) {

		if (row < 0 || row >= data.length) {
			return null;
		}

		char[] result = new char[data.length];

		for (int i = 0; i < data.length; i++) {
			result[i] = data[row][i];
		}

		return result;

	}

	public float[] getRowValuesFloatDataType(int row) {

		if (row < 0 || row >= floatdata.length) {
			return null;
		}

		float[] result = new float[floatdata.length];

		for (int i = 0; i < floatdata.length; i++) {
			result[i] = floatdata[row][i];
		}

		return result;

	}

	public char[] getColumnValues(int column) {

		if (column < 0 || column >= data.length) {
			return null;
		}

		char[] result = new char[data.length];

		for (int i = 0; i < data.length; i++) {
			result[i] = data[i][column];
		}

		return result;
	}

	public float[] getColumnValuesFloatDataType(int column) {

		if (column < 0 || column >= floatdata.length) {
			return null;
		}

		float[] result = new float[floatdata.length];

		for (int i = 0; i < floatdata.length; i++) {
			result[i] = floatdata[i][column];
		}

		return result;
	}

	public char[] getQuadrantValues(int row, int column) {

		if (column < 0 || column >= data.length || row < 0 || row >= data.length) {
			return null;
		}

		if (row + 1 >= data.length || column + 1 >= data.length) {

			return null;
		}

		/* a quadrant contains 4 elements */
		char[] result = new char[4];

		result[0] = data[row][column];
		result[1] = data[row][column + 1];
		result[2] = data[row + 1][column];
		result[3] = data[row + 1][column + 1];

		return result;

	}

	public float[] getQuadrantValuesFloatdataType(int row, int column) {

		if (column < 0 || column >= floatdata.length || row < 0 || row >= floatdata.length) {
			return null;
		}

		if (row + 1 >= floatdata.length || column + 1 >= floatdata.length) {

			return null;
		}

		/* a quadrant contains 4 elements */
		float[] result = new float[4];

		result[0] = floatdata[row][column];
		result[1] = floatdata[row][column + 1];
		result[2] = floatdata[row + 1][column];
		result[3] = floatdata[row + 1][column + 1];

		return result;

	}

	public char[][] getArbitraryPartitionValues(int row, int column, int partition_size) {

		if (column < 0 || column >= data.length || row < 0 || row >= data.length) {
			return null;
		}

		if (row + partition_size - 1 >= data.length || column + partition_size - 1 >= data.length) {

			return null;
		}

		char[][] partition = new char[partition_size][partition_size];
		int ic = 0;
		int jc = 0;
		for (int i = row; i <= row + partition_size - 1; i++, ic++) {
			jc = 0;
			for (int j = column; j <= column + partition_size - 1; j++, jc++) {
				partition[ic][jc] = data[i][j];
			}
		}

		return partition;

	}

	public float[][] getArbitraryPartitionValuesFloatDataType(int row, int column, int partition_size) {

		if (column < 0 || column >= floatdata.length || row < 0 || row >= floatdata.length) {
			return null;
		}

		if (row + partition_size - 1 >= floatdata.length || column + partition_size - 1 >= floatdata.length) {

			return null;
		}

		float[][] partition = new float[partition_size][partition_size];
		int ic = 0;
		int jc = 0;
		for (int i = row; i <= row + partition_size - 1; i++, ic++) {
			jc = 0;
			for (int j = column; j <= column + partition_size - 1; j++, jc++) {
				partition[ic][jc] = floatdata[i][j];
			}
		}

		return partition;

	}

}
