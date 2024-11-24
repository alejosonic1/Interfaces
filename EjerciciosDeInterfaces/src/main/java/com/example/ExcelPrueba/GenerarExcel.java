package com.example.ExcelPrueba;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GenerarExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear el libro de trabajo (workbook)
        XSSFWorkbook workbook = new XSSFWorkbook(); // Para formato .xlsx
        // Si quisieras formato .xls (antiguo), usarías HSSFWorkbook

        // Crear una hoja (sheet)
        Sheet sheet = workbook.createSheet("Hoja 1");

        // Crear una fila en la hoja
        Row row = sheet.createRow(0); // Fila 0

        // Crear celdas en la fila
        Cell cell1 = row.createCell(0); // Celda A1
        Cell cell2 = row.createCell(1); // Celda B1

        // Escribir en las celdas
        cell1.setCellValue("Nombre");
        cell2.setCellValue("Edad");

        // Crear más filas con datos
        Row row1 = sheet.createRow(1); // Fila 1
        row1.createCell(0).setCellValue("Juan");
        row1.createCell(1).setCellValue(25);

        Row row2 = sheet.createRow(2); // Fila 2
        row2.createCell(0).setCellValue("Ana");
        row2.createCell(1).setCellValue(30);

        // Ajustar el tamaño de las columnas
        sheet.autoSizeColumn(0); // Columna "Nombre"
        sheet.autoSizeColumn(1); // Columna "Edad"

        // Guardar el archivo Excel en el disco
        try (FileOutputStream fileOut = new FileOutputStream("archivo_generado.xlsx")) {
            workbook.write(fileOut);
            workbook.close();
            System.out.println("Archivo Excel generado exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
