  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    s0(std::vector<std::vector<double>> v0): p0(v0) { }
  };
  struct s1 {
    s0 p0;
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    std::vector<s1> p1;
    s2(s1 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s0 p0;
    s2 p1;
    s3(s0 v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s3 p0;
    s0 p1;
    s4(s3 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    double p0;
    std::vector<s2> p1;
    s6(double v0, std::vector<s2> v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    std::vector<std::vector<s0>> p0;
    std::vector<std::vector<s6>> p1;
    s7(std::vector<std::vector<s0>> v0, std::vector<std::vector<s6>> v1): p0(v0), p1(v1) { }
  };
  struct s10 {
    s4 p0;
    std::vector<s3> p1;
    s10(s4 v0, std::vector<s3> v1): p0(v0), p1(v1) { }
  };
  s10 f121(const s10 &v0, const s1 &v1) {
    return v0;
  }
  s0 f117(const s0 &v0) {
    const std::vector<std::vector<double>> v3 = v0.p0;
    const std::vector<double> v4 = v3[1];
    s0 v7 = v0;
    const double v11 = v4[0];
    v7.p0 = v3;
    double v1 = v11;
    v7.p0 = v3;
    const std::vector<std::vector<double>> v9 = v7.p0;
    double v2 = v1;
    const std::vector<std::vector<double>> v5 = v0.p0;
    const std::vector<std::vector<double>> v14 = v7.p0;
    std::vector<double> v40 = v4;
    const s0 v16(v3);
    v40[0] = v2;
    std::vector<double> v18 = v4;
    v7.p0 = v14;
    const std::vector<std::vector<double>> v15 = v7.p0;
    v40[0] = v1;
    const double v21 = v2 + v11;
    const std::vector<double> v12 { v11, v1, v21 };
    const std::vector<std::vector<double>> v26 = v16.p0;
    v40[0] = v2;
    v7.p0 = v5;
    v40[0] = v11;
    v7.p0 = v3;
    s0 v25 = v0;
    v25.p0 = v9;
    const double v37 = v12[1];
    v7.p0 = v5;
    const std::vector<s0> v35 { v0, v25, v16, v7, v0, v7 };
    v1 = v11;
    const std::vector<std::vector<double>> v43 = v25.p0;
    std::vector<std::vector<double>> v31 = v14;
    const std::vector<std::vector<double>> v19 = v0.p0;
    v7.p0 = v15;
    const std::vector<std::vector<double>> v52 = v0.p0;
    const std::vector<std::vector<double>> v32 = v7.p0;
    v25.p0 = v52;
    std::vector<s0> v34 = v35;
    v40[0] = v37;
    std::vector<s0> v41 = v34;
    std::vector<s0> v85 = v41;
    v25.p0 = v26;
    v31[0] = v40;
    v7.p0 = v19;
    v7.p0 = v5;
    std::vector<std::vector<double>> v42 = v9;
    v7.p0 = v32;
    v7.p0 = v43;
    v7.p0 = v31;
    const s0 v147 = v85[1];
    v25.p0 = v42;
    const std::vector<std::vector<double>> v73 = v147.p0;
    v25.p0 = v15;
    v85 = v35;
    const double v145 = v18[0];
    v85[3] = v147;
    v40[0] = v145;
    const s0 v126(v73);
    return v126;
  }
  s10 f110(const s10 &v0) {
    const std::vector<s3> v8 = v0.p1;
    const s4 v7 = v0.p0;
    const s3 v3 = v8[0];
    const s0 v6 = v7.p1;
    s3 v13 = v3;
    s3 v39 = v3;
    const s2 v15 = v13.p1;
    v39.p0 = v6;
    v13 = v39;
    const s1 v21 = v15.p0;
    v39.p0 = v6;
    v13.p1 = v15;
    const s0 v25 = v21.p0;
    s1 v38 = v21;
    v38.p0 = v25;
    v38 = v21;
    const s10 v70 = f121(v0, v38);
    const std::vector<s1> v48 { v38, v38, v21, v21, v21, v21, v38 };
    const s1 v72 = v48[3];
    const s10 v152 = f121(v70, v72);
    return v152;
  }
  s7 f93(const s7 &v0) {
    s7 v3 = v0;
    s7 v4 = v0;
    s7 v5 = v4;
    s7 v8 = v5;
    const std::vector<std::vector<s6>> v1 = v8.p1;
    const std::vector<std::vector<s0>> v7 = v4.p0;
    v5.p0 = v7;
    const std::vector<std::vector<s6>> v15 = v3.p1;
    v5.p1 = v1;
    v8.p0 = v7;
    v3.p0 = v7;
    const std::vector<std::vector<s6>> v27 = v3.p1;
    const std::vector<std::vector<s0>> v40 = v4.p0;
    v3 = v0;
    const s7 v49(v7, v27);
    v4.p1 = v27;
    const std::vector<std::vector<s0>> v32 = v49.p0;
    const std::vector<std::vector<s0>> v57 = v0.p0;
    const std::vector<s0> v107 = v32[0];
    s7 v45 = v4;
    v4.p1 = v1;
    v8 = v0;
    std::vector<std::vector<s0>> v173 = v57;
    v8.p0 = v57;
    v45.p0 = v40;
    v45.p1 = v27;
    v8.p0 = v173;
    v8.p1 = v15;
    v3.p0 = v7;
    v173[0] = v107;
    return v45;
  }
  s0 f90(const s0 &v0) {
    const s0 v2 = f117(v0);
    return v2;
  }
  s0 f89(const s0 &v0) {
    const std::vector<std::vector<double>> v6 = v0.p0;
    const s0 v8 = f117(v0);
    std::vector<std::vector<double>> v4 = v6;
    const std::vector<std::vector<double>> v11 = v0.p0;
    std::vector<std::vector<double>> v7 = v11;
    s0 v3 = v8;
    v3.p0 = v7;
    v3 = v0;
    s0 v36 = v3;
    v3.p0 = v4;
    const s0 v57 = f117(v36);
    const s0 v95 = f90(v57);
    v36.p0 = v11;
    return v95;
  }
  s3 f87(const s3 &v0) {
    s3 v5 = v0;
    const s0 v2 = v0.p0;
    const s0 v4 = v5.p0;
    s3 v3 = v5;
    const s0 v6 = f117(v2);
    const s0 v29 = f90(v6);
    s3 v16 = v3;
    const s2 v20 = v0.p1;
    const s0 v19 = f117(v29);
    const std::vector<std::vector<double>> v33 = v4.p0;
    v16.p1 = v20;
    s0 v50 = v29;
    const s0 v51 = f90(v50);
    v50.p0 = v33;
    const s0 v92 = f89(v19);
    s3 v75 = v16;
    v5.p0 = v51;
    v75.p0 = v92;
    return v75;
  }
  s10 f86(const s10 &v0) {
    const s10 v7 = f110(v0);
    const s4 v2 = v0.p0;
    const s4 v1 = v0.p0;
    const std::vector<s3> v4 = v7.p1;
    const std::vector<s3> v8 = v7.p1;
    const s10 v5 = f110(v0);
    s10 v10 = v5;
    v10.p0 = v1;
    std::vector<s3> v11 = v4;
    v10.p0 = v2;
    const s10 v23(v1, v8);
    const s3 v13 = v11[1];
    const s3 v18 = f87(v13);
    const s10 v22 = f110(v10);
    const s3 v28 = v1.p0;
    v10.p1 = v11;
    v10.p1 = v4;
    v11[1] = v18;
    v10 = v23;
    v11[2] = v28;
    return v22;
  }
  std::vector<s6> f81(const std::vector<s6> &v0) {
    const s6 v5 = v0[0];
    const s6 v28 = v0[0];
    const s6 v35 = v0[0];
    std::vector<s6> v47 = v0;
    v47[0] = v35;
    v47[0] = v28;
    v47[0] = v5;
    return v47;
  }
  double f69(const double &v0) {
    double v3 = v0;
    double v4 = v0;
    const std::vector<double> v5 { v4, v4, v3 };
    std::vector<double> v2 = v5;
    double v10 = v4;
    std::vector<double> v14 = v2;
    v2[1] = v10;
    v2[2] = v0;
    std::vector<double> v13 = v5;
    std::vector<double> v24 = v5;
    const double v11 = v24[1];
    v24[0] = v3;
    const double v20 = v13[2];
    v13[0] = v10;
    double v16 = v20;
    const double v19 = v5[0];
    v13[1] = v3;
    std::vector<double> v38 = v24;
    double v22 = v16;
    v13[2] = v22;
    v13[1] = v4;
    const double v23 = v14[1];
    v24 = v13;
    v38[1] = v3;
    const double v54 = v24[0];
    v38[1] = v54;
    v38[1] = v10;
    v38[2] = v23;
    std::vector<double> v73 = v38;
    v13[2] = v11;
    v13 = v24;
    const double v87 = v73[2];
    v73[1] = v19;
    v24[1] = v22;
    return v87;
  }
  std::vector<std::vector<s6>> f43(const std::vector<std::vector<s6>> &v0) {
    const std::vector<s6> v3 = v0[0];
    const std::vector<s6> v7 = f81(v3);
    const std::vector<s6> v4 = f81(v7);
    std::vector<std::vector<s6>> v14 = v0;
    v14[0] = v4;
    v14[0] = v7;
    std::vector<std::vector<s6>> v21 = v14;
    std::vector<std::vector<s6>> v18 = v21;
    const std::vector<std::vector<std::vector<s6>>> v32 { v18, v14, v14, v18, v0, v21 };
    const std::vector<std::vector<s6>> v43 = v32[2];
    return v43;
  }
  s7 f36(const s7 &v0) {
    s7 v3 = v0;
    const std::vector<std::vector<s0>> v1 = v0.p0;
    const std::vector<std::vector<s0>> v2 = v0.p0;
    const std::vector<s0> v11 = v1[0];
    const std::vector<std::vector<s6>> v7 = v3.p1;
    v3.p0 = v2;
    const s0 v5 = v11[0];
    const std::vector<std::vector<s0>> v8 { v11, v11, v11, v11, v11, v11, v11 };
    std::vector<std::vector<s0>> v12 = v2;
    v3.p1 = v7;
    s0 v29 = v5;
    const std::vector<s0> v18 = v8[5];
    const s0 v51 = f90(v29);
    const std::vector<std::vector<double>> v42 = v51.p0;
    v29.p0 = v42;
    std::vector<s0> v43 = v18;
    const std::vector<s0> v40 = v12[0];
    v43[0] = v51;
    v12[0] = v40;
    const std::vector<std::vector<s6>> v54 = f43(v7);
    v12[0] = v43;
    v3.p0 = v12;
    const s7 v93(v12, v54);
    return v93;
  }
  double f13(const double &v0) {
    const double v8 = v0 * v0;
    const double v4 = f69(v8);
    double v2 = v4;
    const double v10 = f69(v4);
    const double v1 = f69(v10);
    double v18 = v8;
    double v11 = v4;
    const double v15 = f69(v1);
    v18 = v8;
    const double v9 = f69(v8);
    const std::vector<double> v23 { v8, v11, v1, v18 };
    std::vector<double> v31 = v23;
    const double v29 = f69(v2);
    v31[0] = v15;
    const double v16 = v31[2];
    const double v33 = f69(v16);
    v31[2] = v16;
    std::vector<double> v35 = v23;
    std::vector<double> v44 = v31;
    v2 = v16;
    const double v43 = f69(v10);
    v44[1] = v43;
    const double v41 = v23[3];
    std::vector<double> v64 = v44;
    const double v91 = v64[0];
    const double v49 = v41 - v29;
    const double v60 = f69(v33);
    const double v115 = f69(v9);
    v31[3] = v91;
    std::vector<double> v68 = v35;
    v44 = v68;
    const double v96 = f69(v49);
    v64[3] = v115;
    const double v143 = v35[3];
    std::vector<double> v110 = v64;
    const std::vector<double> v106 { v143, v96 };
    const double v190 = v106[0];
    v31[0] = v60;
    v35 = v110;
    return v190;
  }
  s7 f8(const s10 &v0, const s7 &v1) {
    const s7 v5 = f36(v1);
    s7 v7 = v1;
    const std::vector<std::vector<s6>> v4 = v7.p1;
    const std::vector<std::vector<s6>> v10 = f43(v4);
    const std::vector<std::vector<s0>> v11 = v5.p0;
    s7 v19 = v1;
    s7 v24 = v19;
    v7.p0 = v11;
    const std::vector<std::vector<s0>> v51 = v1.p0;
    const s7 v152 = f93(v24);
    v7.p1 = v10;
    v19.p1 = v10;
    v7.p0 = v51;
    const s7 v128 = f93(v152);
    return v128;
  }
  __attribute__((noinline))
  double f0(const std::vector<s7> &v0, const s10 &v1, const double &v2) {
    std::vector<s7> v4 = v0;
    std::vector<s7> v6 = v4;
    std::vector<s7> v5 = v0;
    const s10 v3 = f86(v1);
    const s7 v13 = v4[1];
    const s7 v10 = f8(v3, v13);
    const std::vector<std::vector<s6>> v20 = v10.p1;
    v6[1] = v10;
    v6[0] = v13;
    v4 = v0;
    const std::vector<s6> v78 = v20[0];
    const double v25 = f69(v2);
    const s6 v45 = v78[0];
    const std::vector<s6> v58 = v20[0];
    const s6 v93 = v58[0];
    std::vector<s6> v43 = v58;
    const double v39 = v25 / v25;
    const s7 v32 = v6[0];
    v43[0] = v45;
    const double v27 = f13(v39);
    v4[0] = v32;
    v4 = v5;
    const s6 v59 = v43[0];
    const std::vector<s6> v97 = v20[0];
    s6 v95 = v93;
    std::vector<s6> v121 = v97;
    v43[0] = v45;
    v121[0] = v95;
    const s6 v146 = v121[0];
    v43[0] = v146;
    v5[0] = v32;
    const double v203 = v59.p0;
    const double v410 = f69(v203);
    const double v242 = v27 - v410;
    return v242;
  }
  int main() {
    std::vector<s7> v0({ { { { { { { 0.0 }, { 1.0 } } } } }, { { { 2.0, { { { { { { 3.0 }, { 4.0 } } }, { { { { 5.0 }, { 6.0 } } }, { { { 7.0 }, { 8.0 } } }, { { { 9.0 }, { 10.0 } } } } }, { { { { { 11.0 }, { 12.0 } } }, { { { { 13.0 }, { 14.0 } } }, { { { 15.0 }, { 16.0 } } }, { { { 17.0 }, { 18.0 } } } } }, { { { { 19.0 }, { 20.0 } } }, { { { { 21.0 }, { 22.0 } } }, { { { 23.0 }, { 24.0 } } }, { { { 25.0 }, { 26.0 } } } } } } }, { { { { { 27.0 }, { 28.0 } } }, { { { { 29.0 }, { 30.0 } } }, { { { 31.0 }, { 32.0 } } }, { { { 33.0 }, { 34.0 } } } } }, { { { { { 35.0 }, { 36.0 } } }, { { { { 37.0 }, { 38.0 } } }, { { { 39.0 }, { 40.0 } } }, { { { 41.0 }, { 42.0 } } } } }, { { { { 43.0 }, { 44.0 } } }, { { { { 45.0 }, { 46.0 } } }, { { { 47.0 }, { 48.0 } } }, { { { 49.0 }, { 50.0 } } } } } } }, { { { { { 51.0 }, { 52.0 } } }, { { { { 53.0 }, { 54.0 } } }, { { { 55.0 }, { 56.0 } } }, { { { 57.0 }, { 58.0 } } } } }, { { { { { 59.0 }, { 60.0 } } }, { { { { 61.0 }, { 62.0 } } }, { { { 63.0 }, { 64.0 } } }, { { { 65.0 }, { 66.0 } } } } }, { { { { 67.0 }, { 68.0 } } }, { { { { 69.0 }, { 70.0 } } }, { { { 71.0 }, { 72.0 } } }, { { { 73.0 }, { 74.0 } } } } } } } } } } } }, { { { { { { 75.0 }, { 76.0 } } } } }, { { { 77.0, { { { { { { 78.0 }, { 79.0 } } }, { { { { 80.0 }, { 81.0 } } }, { { { 82.0 }, { 83.0 } } }, { { { 84.0 }, { 85.0 } } } } }, { { { { { 86.0 }, { 87.0 } } }, { { { { 88.0 }, { 89.0 } } }, { { { 90.0 }, { 91.0 } } }, { { { 92.0 }, { 93.0 } } } } }, { { { { 94.0 }, { 95.0 } } }, { { { { 96.0 }, { 97.0 } } }, { { { 98.0 }, { 99.0 } } }, { { { 100.0 }, { 101.0 } } } } } } }, { { { { { 102.0 }, { 103.0 } } }, { { { { 104.0 }, { 105.0 } } }, { { { 106.0 }, { 107.0 } } }, { { { 108.0 }, { 109.0 } } } } }, { { { { { 110.0 }, { 111.0 } } }, { { { { 112.0 }, { 113.0 } } }, { { { 114.0 }, { 115.0 } } }, { { { 116.0 }, { 117.0 } } } } }, { { { { 118.0 }, { 119.0 } } }, { { { { 120.0 }, { 121.0 } } }, { { { 122.0 }, { 123.0 } } }, { { { 124.0 }, { 125.0 } } } } } } }, { { { { { 126.0 }, { 127.0 } } }, { { { { 128.0 }, { 129.0 } } }, { { { 130.0 }, { 131.0 } } }, { { { 132.0 }, { 133.0 } } } } }, { { { { { 134.0 }, { 135.0 } } }, { { { { 136.0 }, { 137.0 } } }, { { { 138.0 }, { 139.0 } } }, { { { 140.0 }, { 141.0 } } } } }, { { { { 142.0 }, { 143.0 } } }, { { { { 144.0 }, { 145.0 } } }, { { { 146.0 }, { 147.0 } } }, { { { 148.0 }, { 149.0 } } } } } } } } } } } } });
    s10 v1({ { { { { { 150.0 }, { 151.0 } } }, { { { { { 152.0 }, { 153.0 } } }, { { { { 154.0 }, { 155.0 } } }, { { { 156.0 }, { 157.0 } } }, { { { 158.0 }, { 159.0 } } } } }, { { { { { 160.0 }, { 161.0 } } }, { { { { 162.0 }, { 163.0 } } }, { { { 164.0 }, { 165.0 } } }, { { { 166.0 }, { 167.0 } } } } }, { { { { 168.0 }, { 169.0 } } }, { { { { 170.0 }, { 171.0 } } }, { { { 172.0 }, { 173.0 } } }, { { { 174.0 }, { 175.0 } } } } } } } }, { { { 176.0 }, { 177.0 } } } }, { { { { { 178.0 }, { 179.0 } } }, { { { { { 180.0 }, { 181.0 } } }, { { { { 182.0 }, { 183.0 } } }, { { { 184.0 }, { 185.0 } } }, { { { 186.0 }, { 187.0 } } } } }, { { { { { 188.0 }, { 189.0 } } }, { { { { 190.0 }, { 191.0 } } }, { { { 192.0 }, { 193.0 } } }, { { { 194.0 }, { 195.0 } } } } }, { { { { 196.0 }, { 197.0 } } }, { { { { 198.0 }, { 199.0 } } }, { { { 200.0 }, { 201.0 } } }, { { { 202.0 }, { 203.0 } } } } } } } }, { { { { 204.0 }, { 205.0 } } }, { { { { { 206.0 }, { 207.0 } } }, { { { { 208.0 }, { 209.0 } } }, { { { 210.0 }, { 211.0 } } }, { { { 212.0 }, { 213.0 } } } } }, { { { { { 214.0 }, { 215.0 } } }, { { { { 216.0 }, { 217.0 } } }, { { { 218.0 }, { 219.0 } } }, { { { 220.0 }, { 221.0 } } } } }, { { { { 222.0 }, { 223.0 } } }, { { { { 224.0 }, { 225.0 } } }, { { { 226.0 }, { 227.0 } } }, { { { 228.0 }, { 229.0 } } } } } } } }, { { { { 230.0 }, { 231.0 } } }, { { { { { 232.0 }, { 233.0 } } }, { { { { 234.0 }, { 235.0 } } }, { { { 236.0 }, { 237.0 } } }, { { { 238.0 }, { 239.0 } } } } }, { { { { { 240.0 }, { 241.0 } } }, { { { { 242.0 }, { 243.0 } } }, { { { 244.0 }, { 245.0 } } }, { { { 246.0 }, { 247.0 } } } } }, { { { { 248.0 }, { 249.0 } } }, { { { { 250.0 }, { 251.0 } } }, { { { 252.0 }, { 253.0 } } }, { { { 254.0 }, { 255.0 } } } } } } } } } });
    double v2(256.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
