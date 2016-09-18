/**
 * 
 */

function Guitar (type, brand) {
    this.type = type;
    this.color = "red";
    this.brand = brand;
    this.getInfo = getGuitarInfo;
}
 

function getGuitarInfo() {
    return this.color +" colored " + this.type + " type "  + this.brand;
}