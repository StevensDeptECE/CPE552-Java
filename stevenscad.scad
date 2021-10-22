//polygon([ [0,0], [10,0], [5,7] ]);


//linear_extrude(height=5)
//polygon([ [0,0], [9,0], [11,6], [-2,3], [-5,-11] ]);


module triangular_prism(x1,y1, x2,y2, x3,y3, h) {
    linear_extrude(height=h)
      polygon( [ [x1,y1], [x2,y2], [x3,y3] ]);
}

//triangular_prism(0,0, 10,0, 5,7, 20);

module equilateral_prism(s, h) {
    triangular_prism(0,0, s,0, s/2, 2*sqrt(s), h);
}

equilateral_prism(10, 20);