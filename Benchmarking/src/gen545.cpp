  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s0 p2;
    s0 p3;
    s0 p4;
    s0 p5;
    s0 p6;
    s1(s0 v0, s0 v1, s0 v2, s0 v3, s0 v4, s0 v5, s0 v6): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4), p5(v5), p6(v6) { }
  };
  struct s2 {
    std::vector<s1> p0;
    std::vector<s0> p1;
    s2(std::vector<s1> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s0 p0;
    s0 p1;
    s0 p2;
    s4(s0 v0, s0 v1, s0 v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s6 {
    std::vector<s1> p0;
    s2 p1;
    s6(std::vector<s1> v0, s2 v1): p0(v0), p1(v1) { }
  };
  s4 f85(const s4 &v0) {
    const s0 v19 = v0.p0;
    s4 v33 = v0;
    v33.p2 = v19;
    return v33;
  }
  s2 f82(const s2 &v0) {
    const std::vector<s2> v7 { v0, v0, v0, v0, v0, v0 };
    std::vector<s2> v3 = v7;
    const s2 v8 = v3[5];
    return v8;
  }
  s2 f79(const s2 &v0, const std::vector<s1> &v1) {
    const s2 v7 = f82(v0);
    const s2 v11 = f82(v7);
    const s2 v13 = f82(v11);
    const s2 v33 = f82(v13);
    s2 v93 = v33;
    s2 v171 = v93;
    return v171;
  }
  std::vector<s1> f68(const std::vector<s1> &v0) {
    std::vector<s1> v6 = v0;
    const std::vector<std::vector<s1>> v8 { v0, v6, v6, v0, v0, v0 };
    const std::vector<s1> v5 = v8[2];
    return v5;
  }
  s6 f67(const s6 &v0) {
    s6 v2 = v0;
    s6 v8 = v2;
    s6 v3 = v8;
    s6 v7 = v3;
    const std::vector<s1> v5 = v7.p0;
    const s2 v11 = v0.p1;
    const std::vector<s1> v9 = v11.p0;
    std::vector<s1> v4 = v5;
    const std::vector<s1> v17 = v11.p0;
    s2 v6 = v11;
    const s2 v13 = f82(v11);
    v7.p1 = v13;
    const s1 v15 = v9[1];
    const s2 v16 = f82(v11);
    v3.p1 = v16;
    const s2 v20 = f82(v16);
    const std::vector<s1> v25 = v6.p0;
    v2.p1 = v11;
    const std::vector<s0> v33 = v20.p1;
    const s1 v34 = v17[1];
    v3.p0 = v17;
    v2.p0 = v25;
    v6.p1 = v33;
    v6.p0 = v4;
    v4[0] = v34;
    v7.p1 = v16;
    v4[1] = v15;
    v8.p1 = v6;
    return v7;
  }
  std::vector<s6> f52(const std::vector<s6> &v0) {
    std::vector<s6> v6 = v0;
    const s6 v3 = v0[2];
    s6 v4 = v3;
    v6 = v0;
    const std::vector<std::vector<s6>> v2 { v6, v6, v0, v0 };
    const s6 v7 = f67(v4);
    const s2 v1 = v3.p1;
    s2 v10 = v1;
    v4 = v3;
    const std::vector<s1> v8 = v10.p0;
    const std::vector<s1> v13 = f68(v8);
    v6[0] = v4;
    v10.p0 = v8;
    v6[2] = v7;
    v4.p0 = v13;
    v6[2] = v3;
    std::vector<s6> v9 = v0;
    const s6 v43 = v9[0];
    v9[1] = v7;
    v6[2] = v43;
    const std::vector<s6> v48 = v2[0];
    std::vector<s6> v63 = v48;
    v9 = v48;
    return v63;
  }
  s4 f49(const s4 &v0) {
    const s4 v7 = f85(v0);
    const s4 v6 = f85(v7);
    s4 v1 = v0;
    const s0 v5 = v0.p0;
    v1.p0 = v5;
    v1.p2 = v5;
    s4 v9 = v1;
    s4 v13 = v1;
    const s4 v35 = f85(v7);
    const s4 v20 = f85(v9);
    const s4 v21 = f85(v35);
    const std::vector<s4> v27 { v13, v35, v6, v21, v7, v20, v20 };
    const s4 v73 = v27[1];
    return v73;
  }
  s4 f48(const s4 &v0) {
    s4 v2 = v0;
    s4 v3 = v2;
    const s4 v1 = f85(v3);
    const s0 v9 = v0.p0;
    s4 v5 = v2;
    const s4 v16 = f49(v5);
    v2.p2 = v9;
    v2 = v16;
    s4 v13 = v2;
    const s0 v8 = v13.p0;
    const s4 v14 = f49(v5);
    v13.p2 = v8;
    s4 v18 = v0;
    s4 v36 = v14;
    v18.p1 = v8;
    v36.p0 = v9;
    const s0 v40 = v18.p2;
    v5.p2 = v40;
    v2 = v1;
    v36 = v2;
    v36 = v18;
    return v36;
  }
  s2 f42(const s2 &v0) {
    const s2 v3 = f82(v0);
    const std::vector<s2> v2 { v3, v3, v0, v0, v3, v0, v0 };
    const std::vector<s1> v8 = v0.p0;
    std::vector<s1> v7 = v8;
    const s1 v10 = v8[1];
    std::vector<s1> v24 = v7;
    const s1 v20 = v24[1];
    const s2 v14 = v2[5];
    const s1 v16 = v8[1];
    const std::vector<s1> v37 = v14.p0;
    s1 v30 = v16;
    std::vector<s1> v59 = v37;
    v7[0] = v30;
    std::vector<s1> v49 = v59;
    const s0 v139 = v20.p6;
    v59[0] = v10;
    v30.p0 = v139;
    const s6 v117(v49, v14);
    v49 = v24;
    s6 v245 = v117;
    v245.p0 = v59;
    const s2 v253 = v245.p1;
    v245.p1 = v14;
    return v253;
  }
  s2 f34(const s6 &v0, const s2 &v1) {
    const std::vector<s2> v5 { v1, v1, v1, v1, v1, v1, v1 };
    const s2 v7 = v0.p1;
    s6 v9 = v0;
    const s2 v6 = v9.p1;
    const std::vector<s1> v4 = v9.p0;
    const s2 v21 = f79(v6, v4);
    std::vector<s2> v17 = v5;
    const s2 v25 = f79(v21, v4);
    const s2 v20 = f42(v25);
    v9.p0 = v4;
    const s2 v16 = v17[6];
    v17[5] = v16;
    v17[5] = v20;
    v17[4] = v7;
    const s2 v41 = v17[5];
    return v41;
  }
  s1 f32(const s1 &v0, const s2 &v1) {
    const std::vector<s2> v2 { v1, v1, v1, v1, v1, v1 };
    const s2 v5 = v2[3];
    const s2 v31 = f82(v5);
    const std::vector<s1> v73 = v31.p0;
    const s1 v52 = v73[0];
    return v52;
  }
  s6 f30(const s6 &v0) {
    const std::vector<s1> v1 = v0.p0;
    const s2 v7 = v0.p1;
    const s1 v8 = v1[1];
    const s1 v6 = f32(v8, v7);
    const std::vector<s1> v9 = f68(v1);
    const s2 v15 = f82(v7);
    std::vector<s1> v27 = v9;
    const s2 v59 = f34(v0, v15);
    v27[0] = v6;
    const s6 v58(v27, v59);
    const s6 v110 = f67(v58);
    return v110;
  }
  s1 f21(const s1 &v0) {
    s1 v2 = v0;
    const s0 v1 = v0.p0;
    const s0 v4 = v0.p1;
    const std::vector<std::vector<double>> v6 = v4.p0;
    const s0 v3 = v0.p0;
    v2.p0 = v4;
    v2.p4 = v1;
    const s0 v10 = v2.p4;
    const s0 v14 = v2.p1;
    v2.p0 = v4;
    const s4 v9(v3, v3, v1);
    const s4 v12 = f48(v9);
    const s0 v21 = v9.p1;
    v2.p3 = v10;
    const s0 v20 = v0.p2;
    const s4 v29 = f85(v12);
    v2.p4 = v14;
    s0 v16 = v20;
    const s1 v35(v20, v10, v1, v16, v20, v20, v3);
    v2.p3 = v21;
    const s4 v69 = f85(v29);
    const s0 v75 = v69.p0;
    v2.p5 = v75;
    v16.p0 = v6;
    v2 = v35;
    return v35;
  }
  double f7(const double &v0, const s1 &v1) {
    const s1 v6 = f21(v1);
    double v2 = v0;
    double v12 = v2;
    double v3 = v2;
    const s0 v8 = v6.p6;
    s0 v13 = v8;
    const std::vector<std::vector<double>> v20 = v8.p1;
    const std::vector<double> v17 = v20[0];
    std::vector<double> v15 = v17;
    s0 v14 = v13;
    const std::vector<std::vector<double>> v10 = v13.p0;
    v14.p0 = v10;
    v15[0] = v12;
    v13.p0 = v10;
    v13 = v14;
    const std::vector<double> v42 = v10[2];
    v14.p0 = v10;
    const double v23 = v15[0];
    v14.p1 = v20;
    const std::vector<std::vector<double>> v41 { v42, v42, v15, v17, v15 };
    const s0 v40 = v6.p5;
    const std::vector<std::vector<double>> v31 = v40.p0;
    v15[0] = v23;
    v14.p0 = v31;
    v15[0] = v0;
    std::vector<std::vector<double>> v71 = v41;
    std::vector<std::vector<double>> v82 = v71;
    const std::vector<double> v115 = v82[3];
    v15[0] = v3;
    const double v364 = v115[0];
    return v364;
  }
  __attribute__((noinline))
  double f0(const std::vector<s6> &v0, const double &v1) {
    const std::vector<s6> v2 = f52(v0);
    const s6 v6 = v0[0];
    const s6 v8 = v2[0];
    s6 v5 = v8;
    const std::vector<s1> v17 = v5.p0;
    const s1 v12 = v17[1];
    v5.p0 = v17;
    const std::vector<s1> v9 = f68(v17);
    v5.p0 = v9;
    std::vector<s1> v13 = v9;
    const std::vector<s1> v15 = v6.p0;
    const s1 v14 = v9[0];
    v5.p0 = v13;
    const std::vector<s1> v19 = f68(v9);
    const std::vector<s1> v24 = v8.p0;
    v5.p0 = v19;
    const s1 v28 = v13[0];
    const s6 v21 = v2[2];
    const double v23 = f7(v1, v28);
    const s1 v46 = v24[0];
    v5.p0 = v24;
    const s6 v22 = f30(v21);
    v5.p0 = v17;
    const s1 v86 = v19[1];
    double v65 = v23;
    v13[1] = v12;
    const s2 v53 = v22.p1;
    const double v132 = f7(v65, v46);
    double v56 = v132;
    v5.p0 = v15;
    std::vector<s1> v62 = v9;
    v56 = v65;
    std::vector<s1> v141 = v62;
    const s1 v118 = f32(v14, v53);
    v5.p0 = v141;
    v141[0] = v86;
    double v128 = v56;
    v5.p0 = v141;
    v62[0] = v86;
    v141[1] = v118;
    return v128;
  }
  int main() {
    std::vector<s6> v0({ { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } }, { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } }, { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } }, { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } }, { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } } }, { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 } } } }, { { { { 28.0 }, { 29.0 }, { 30.0 } }, { { 31.0 } } }, { { { 32.0 }, { 33.0 }, { 34.0 } }, { { 35.0 } } }, { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 } } }, { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 } } }, { { { 44.0 }, { 45.0 }, { 46.0 } }, { { 47.0 } } }, { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 } } }, { { { 52.0 }, { 53.0 }, { 54.0 } }, { { 55.0 } } } } }, { { { { { { 56.0 }, { 57.0 }, { 58.0 } }, { { 59.0 } } }, { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 } } }, { { { 64.0 }, { 65.0 }, { 66.0 } }, { { 67.0 } } }, { { { 68.0 }, { 69.0 }, { 70.0 } }, { { 71.0 } } }, { { { 72.0 }, { 73.0 }, { 74.0 } }, { { 75.0 } } }, { { { 76.0 }, { 77.0 }, { 78.0 } }, { { 79.0 } } }, { { { 80.0 }, { 81.0 }, { 82.0 } }, { { 83.0 } } } }, { { { { 84.0 }, { 85.0 }, { 86.0 } }, { { 87.0 } } }, { { { 88.0 }, { 89.0 }, { 90.0 } }, { { 91.0 } } }, { { { 92.0 }, { 93.0 }, { 94.0 } }, { { 95.0 } } }, { { { 96.0 }, { 97.0 }, { 98.0 } }, { { 99.0 } } }, { { { 100.0 }, { 101.0 }, { 102.0 } }, { { 103.0 } } }, { { { 104.0 }, { 105.0 }, { 106.0 } }, { { 107.0 } } }, { { { 108.0 }, { 109.0 }, { 110.0 } }, { { 111.0 } } } } }, { { { { 112.0 }, { 113.0 }, { 114.0 } }, { { 115.0 } } }, { { { 116.0 }, { 117.0 }, { 118.0 } }, { { 119.0 } } }, { { { 120.0 }, { 121.0 }, { 122.0 } }, { { 123.0 } } } } } }, { { { { { { 124.0 }, { 125.0 }, { 126.0 } }, { { 127.0 } } }, { { { 128.0 }, { 129.0 }, { 130.0 } }, { { 131.0 } } }, { { { 132.0 }, { 133.0 }, { 134.0 } }, { { 135.0 } } }, { { { 136.0 }, { 137.0 }, { 138.0 } }, { { 139.0 } } }, { { { 140.0 }, { 141.0 }, { 142.0 } }, { { 143.0 } } }, { { { 144.0 }, { 145.0 }, { 146.0 } }, { { 147.0 } } }, { { { 148.0 }, { 149.0 }, { 150.0 } }, { { 151.0 } } } }, { { { { 152.0 }, { 153.0 }, { 154.0 } }, { { 155.0 } } }, { { { 156.0 }, { 157.0 }, { 158.0 } }, { { 159.0 } } }, { { { 160.0 }, { 161.0 }, { 162.0 } }, { { 163.0 } } }, { { { 164.0 }, { 165.0 }, { 166.0 } }, { { 167.0 } } }, { { { 168.0 }, { 169.0 }, { 170.0 } }, { { 171.0 } } }, { { { 172.0 }, { 173.0 }, { 174.0 } }, { { 175.0 } } }, { { { 176.0 }, { 177.0 }, { 178.0 } }, { { 179.0 } } } } }, { { { { { { 180.0 }, { 181.0 }, { 182.0 } }, { { 183.0 } } }, { { { 184.0 }, { 185.0 }, { 186.0 } }, { { 187.0 } } }, { { { 188.0 }, { 189.0 }, { 190.0 } }, { { 191.0 } } }, { { { 192.0 }, { 193.0 }, { 194.0 } }, { { 195.0 } } }, { { { 196.0 }, { 197.0 }, { 198.0 } }, { { 199.0 } } }, { { { 200.0 }, { 201.0 }, { 202.0 } }, { { 203.0 } } }, { { { 204.0 }, { 205.0 }, { 206.0 } }, { { 207.0 } } } }, { { { { 208.0 }, { 209.0 }, { 210.0 } }, { { 211.0 } } }, { { { 212.0 }, { 213.0 }, { 214.0 } }, { { 215.0 } } }, { { { 216.0 }, { 217.0 }, { 218.0 } }, { { 219.0 } } }, { { { 220.0 }, { 221.0 }, { 222.0 } }, { { 223.0 } } }, { { { 224.0 }, { 225.0 }, { 226.0 } }, { { 227.0 } } }, { { { 228.0 }, { 229.0 }, { 230.0 } }, { { 231.0 } } }, { { { 232.0 }, { 233.0 }, { 234.0 } }, { { 235.0 } } } } }, { { { { 236.0 }, { 237.0 }, { 238.0 } }, { { 239.0 } } }, { { { 240.0 }, { 241.0 }, { 242.0 } }, { { 243.0 } } }, { { { 244.0 }, { 245.0 }, { 246.0 } }, { { 247.0 } } } } } }, { { { { { { 248.0 }, { 249.0 }, { 250.0 } }, { { 251.0 } } }, { { { 252.0 }, { 253.0 }, { 254.0 } }, { { 255.0 } } }, { { { 256.0 }, { 257.0 }, { 258.0 } }, { { 259.0 } } }, { { { 260.0 }, { 261.0 }, { 262.0 } }, { { 263.0 } } }, { { { 264.0 }, { 265.0 }, { 266.0 } }, { { 267.0 } } }, { { { 268.0 }, { 269.0 }, { 270.0 } }, { { 271.0 } } }, { { { 272.0 }, { 273.0 }, { 274.0 } }, { { 275.0 } } } }, { { { { 276.0 }, { 277.0 }, { 278.0 } }, { { 279.0 } } }, { { { 280.0 }, { 281.0 }, { 282.0 } }, { { 283.0 } } }, { { { 284.0 }, { 285.0 }, { 286.0 } }, { { 287.0 } } }, { { { 288.0 }, { 289.0 }, { 290.0 } }, { { 291.0 } } }, { { { 292.0 }, { 293.0 }, { 294.0 } }, { { 295.0 } } }, { { { 296.0 }, { 297.0 }, { 298.0 } }, { { 299.0 } } }, { { { 300.0 }, { 301.0 }, { 302.0 } }, { { 303.0 } } } } }, { { { { { { 304.0 }, { 305.0 }, { 306.0 } }, { { 307.0 } } }, { { { 308.0 }, { 309.0 }, { 310.0 } }, { { 311.0 } } }, { { { 312.0 }, { 313.0 }, { 314.0 } }, { { 315.0 } } }, { { { 316.0 }, { 317.0 }, { 318.0 } }, { { 319.0 } } }, { { { 320.0 }, { 321.0 }, { 322.0 } }, { { 323.0 } } }, { { { 324.0 }, { 325.0 }, { 326.0 } }, { { 327.0 } } }, { { { 328.0 }, { 329.0 }, { 330.0 } }, { { 331.0 } } } }, { { { { 332.0 }, { 333.0 }, { 334.0 } }, { { 335.0 } } }, { { { 336.0 }, { 337.0 }, { 338.0 } }, { { 339.0 } } }, { { { 340.0 }, { 341.0 }, { 342.0 } }, { { 343.0 } } }, { { { 344.0 }, { 345.0 }, { 346.0 } }, { { 347.0 } } }, { { { 348.0 }, { 349.0 }, { 350.0 } }, { { 351.0 } } }, { { { 352.0 }, { 353.0 }, { 354.0 } }, { { 355.0 } } }, { { { 356.0 }, { 357.0 }, { 358.0 } }, { { 359.0 } } } } }, { { { { 360.0 }, { 361.0 }, { 362.0 } }, { { 363.0 } } }, { { { 364.0 }, { 365.0 }, { 366.0 } }, { { 367.0 } } }, { { { 368.0 }, { 369.0 }, { 370.0 } }, { { 371.0 } } } } } } });
    double v1(372.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
