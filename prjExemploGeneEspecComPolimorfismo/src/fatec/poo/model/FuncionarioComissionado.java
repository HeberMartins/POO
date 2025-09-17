/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author mhebe
 */
public class FuncionarioComissionado extends Funcionario {
        private double salBase;
        private double taxaComissao;
        private double totalVendas;
        
        public FuncionarioComissionado(int r, String n, String dt, double t){
            super(r, n, dt);
            taxaComissao = t;
        }
        
        public void setSalBase(double s){
            salBase = s;
        }
        
        public double getSalBase(){
            return salBase;
        }
        
        public double getTotalVendas(){
            return totalVendas;
        }
        
        public double getTaxaComissao(){
            return taxaComissao;
        }
        
        public void addVendas(double v){
            totalVendas += v;
        }
        
        public double calcSalBruto(){
            return salBase + (taxaComissao/100 * totalVendas);
        }
        
        public double calcGratificacao(){
            if(totalVendas > 5.000 && totalVendas <= 10.000){
                return 0.03 * calcSalBruto();
            } else if (totalVendas > 10.000){
                return 0.05 * calcSalBruto();
            } else {
                return 0;
            }
            
        }
        
        public double calcSalLiquido(){
            return super.calcSalLiquido() + calcGratificacao();
        }
}
