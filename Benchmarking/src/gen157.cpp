  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    std::vector<s0> p2;
    s1(std::vector<s0> v0, s0 v1, std::vector<s0> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s2 {
    std::vector<std::vector<s0>> p0;
    s1 p1;
    s2(std::vector<std::vector<s0>> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s1 p0;
    std::vector<std::vector<s2>> p1;
    s4(s1 v0, std::vector<std::vector<s2>> v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    std::vector<std::vector<s4>> p0;
    s1 p1;
    s6(std::vector<std::vector<s4>> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s8 {
    std::vector<s1> p0;
    s4 p1;
    s8(std::vector<s1> v0, s4 v1): p0(v0), p1(v1) { }
  };
  struct s10 {
    std::vector<s0> p0;
    std::vector<s6> p1;
    s10(std::vector<s0> v0, std::vector<s6> v1): p0(v0), p1(v1) { }
  };
  s4 f66(const s4 &v0) {
    s4 v8 = v0;
    const s1 v3 = v8.p0;
    s4 v7 = v0;
    v7.p0 = v3;
    const s1 v2 = v8.p0;
    s4 v1 = v7;
    s4 v13 = v7;
    v1.p0 = v3;
    s4 v12 = v1;
    s4 v14 = v7;
    v7.p0 = v2;
    const s1 v40 = v14.p0;
    v12 = v13;
    const std::vector<std::vector<s2>> v72 = v12.p1;
    v12.p0 = v40;
    std::vector<std::vector<s2>> v42 = v72;
    v14.p1 = v42;
    return v12;
  }
  std::vector<double> f44(const std::vector<double> &v0) {
    const double v4 = v0[0];
    const double v7 = v0[0];
    const double v2 = v0[0];
    std::vector<double> v10 = v0;
    double v3 = v7;
    std::vector<double> v6 = v10;
    const double v15 = v6[0];
    const double v1 = v0[0];
    v6[0] = v1;
    std::vector<double> v13 = v6;
    v10[0] = v2;
    v6[0] = v3;
    const double v22 = v10[0];
    v13[0] = v2;
    std::vector<double> v14 = v0;
    double v30 = v3;
    std::vector<double> v18 = v14;
    v18[0] = v22;
    const std::vector<std::vector<double>> v21 { v18, v0 };
    v10[0] = v15;
    std::vector<std::vector<double>> v25 = v21;
    const std::vector<double> v37 = v21[1];
    v10[0] = v30;
    v6[0] = v4;
    v10[0] = v4;
    const std::vector<double> v20 = v25[1];
    std::vector<double> v57 = v14;
    v3 = v7;
    double v41 = v3;
    std::vector<std::vector<double>> v82 = v21;
    std::vector<std::vector<double>> v34 = v82;
    const double v33 = v13[0];
    std::vector<double> v28 = v57;
    std::vector<double> v48 = v28;
    std::vector<std::vector<double>> v29 = v34;
    std::vector<double> v135 = v18;
    v34[0] = v135;
    const double v44 = v10[0];
    double v53 = v41;
    v57[0] = v33;
    const double v156 = v48[0];
    std::vector<std::vector<double>> v62 = v29;
    v30 = v53;
    v10[0] = v41;
    std::vector<std::vector<double>> v98 = v25;
    v34[1] = v37;
    const double v91 = v20[0];
    double v66 = v15;
    const double v139 = v14[0];
    v98[1] = v14;
    double v89 = v139;
    v25 = v34;
    v25 = v98;
    double v138 = v66;
    const std::vector<double> v215 = v62[0];
    std::vector<double> v58 = v215;
    double v114 = v138;
    v48[0] = v44;
    v18[0] = v89;
    v18[0] = v114;
    v48[0] = v91;
    v6[0] = v156;
    return v58;
  }
  double f43(const s8 &v0, const double &v1) {
    s8 v7 = v0;
    const std::vector<s1> v5 = v7.p0;
    const s1 v4 = v5[0];
    const s4 v3 = v7.p1;
    const s4 v8 = f66(v3);
    const s0 v12 = v4.p1;
    const s4 v13 = f66(v8);
    const s4 v22 = f66(v13);
    const std::vector<std::vector<double>> v20 = v12.p1;
    const std::vector<std::vector<std::vector<double>>> v33 { v20, v20, v20, v20 };
    const std::vector<double> v29 = v20[1];
    v7.p0 = v5;
    const std::vector<std::vector<double>> v49 = v33[2];
    const s4 v50 = f66(v22);
    const std::vector<double> v30 = f44(v29);
    v7.p1 = v50;
    std::vector<std::vector<double>> v99 = v49;
    v99 = v49;
    v99[0] = v30;
    const std::vector<double> v72 = v99[0];
    const double v191 = v72[0];
    return v191;
  }
  s8 f22(const s8 &v0) {
    s8 v6 = v0;
    s8 v4 = v0;
    s8 v7 = v4;
    const std::vector<s1> v5 = v0.p0;
    std::vector<s1> v9 = v5;
    s8 v1 = v4;
    const std::vector<s1> v14 = v6.p0;
    std::vector<s1> v2 = v5;
    v6.p0 = v9;
    std::vector<s1> v11 = v2;
    const s1 v13 = v11[0];
    v11[0] = v13;
    v4.p0 = v5;
    const s1 v3 = v5[0];
    const std::vector<s1> v8 = v4.p0;
    s8 v12 = v1;
    v2[0] = v3;
    v11[0] = v3;
    std::vector<s1> v20 = v8;
    s1 v15 = v13;
    v4.p0 = v14;
    const std::vector<s1> v43 = v7.p0;
    v1.p0 = v20;
    v9[0] = v13;
    s1 v33 = v15;
    v4.p0 = v43;
    const std::vector<s0> v26 = v15.p0;
    v11[0] = v33;
    v2[0] = v3;
    v9[0] = v3;
    v33.p0 = v26;
    v6.p0 = v2;
    v6.p0 = v11;
    return v12;
  }
  s1 f20(const s1 &v0, const s4 &v1) {
    const s4 v8 = f66(v1);
    const s4 v2 = f66(v8);
    s4 v39 = v2;
    const s1 v37 = v39.p0;
    return v37;
  }
  s4 f14(const s2 &v0, const s4 &v1) {
    const std::vector<std::vector<s2>> v4 = v1.p1;
    const s4 v7 = f66(v1);
    const std::vector<s2> v8 = v4[0];
    const s1 v6 = v1.p0;
    s4 v13 = v1;
    const std::vector<std::vector<s2>> v14 = v1.p1;
    const s4 v10 = f66(v1);
    v13.p0 = v6;
    v13.p0 = v6;
    std::vector<std::vector<s2>> v30 = v14;
    v13.p1 = v14;
    const s2 v15 = v8[0];
    std::vector<s2> v20 = v8;
    v13.p1 = v4;
    v30[0] = v20;
    v30[0] = v8;
    v13 = v7;
    const s4 v72 = f66(v10);
    v30[0] = v8;
    s4 v44 = v13;
    v13.p0 = v6;
    v30[1] = v20;
    v30[0] = v8;
    const s1 v113 = v15.p1;
    v13.p1 = v14;
    v13.p1 = v30;
    const s1 v115 = f20(v113, v72);
    v13.p0 = v115;
    v44 = v10;
    const s4 v145 = f66(v44);
    return v145;
  }
  s8 f12(const s8 &v0, const s8 &v1) {
    const std::vector<s1> v7 = v0.p0;
    const s1 v3 = v7[0];
    std::vector<s1> v13 = v7;
    const s1 v8 = v13[0];
    v13[0] = v3;
    const s4 v6 = v0.p1;
    v13 = v7;
    const s8 v10(v13, v6);
    v13[0] = v8;
    v13[0] = v8;
    const s8 v67 = f22(v10);
    const s8 v29 = f22(v67);
    s4 v30 = v6;
    const s4 v38 = f66(v30);
    const s4 v56 = v29.p1;
    const std::vector<s1> v59 = v29.p0;
    const s8 v76 = f22(v10);
    const std::vector<s4> v62 { v56 };
    std::vector<s4> v145 = v62;
    const s4 v110 = v145[0];
    const std::vector<std::vector<s2>> v215 = v38.p1;
    const s8 v104(v59, v30);
    const std::vector<s2> v90 = v215[1];
    v30 = v110;
    const s4 v83 = v76.p1;
    v13[0] = v3;
    const s2 v132 = v90[0];
    const s4 v108 = f14(v132, v83);
    v145[0] = v108;
    return v104;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s6>> &v0, const s10 &v1, const std::vector<s1> &v2, const std::vector<s8> &v3, const double &v4) {
    const s8 v9 = v3[1];
    const s4 v8 = v9.p1;
    const s8 v15 = f22(v9);
    const s8 v13 = f22(v15);
    const s8 v10 = f22(v13);
    const s4 v12 = v15.p1;
    const s1 v20 = v8.p0;
    const s1 v26 = f20(v20, v12);
    const s1 v61 = f20(v26, v12);
    const double v46 = v4 + v4;
    const double v32 = v46 - v4;
    const s0 v92 = v61.p1;
    const s8 v111 = f12(v15, v10);
    const std::vector<std::vector<double>> v116 = v92.p0;
    const std::vector<double> v63 = v116[0];
    const double v278 = v63[0];
    const double v219 = f43(v111, v32);
    const double v218 = v219 * v278;
    return v218;
  }
  int main() {
    std::vector<std::vector<s6>> v0({ { { { { { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } } }, { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } }, { { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } } } }, { { { { { { { { 15.0 }, { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } } }, { { { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 }, { 24.0 } } } }, { { { 25.0 }, { 26.0 }, { 27.0 } }, { { 28.0 }, { 29.0 } } }, { { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 } } } } } } }, { { { { { { { 35.0 }, { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } } } }, { { { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 }, { 44.0 } } } }, { { { 45.0 }, { 46.0 }, { 47.0 } }, { { 48.0 }, { 49.0 } } }, { { { { 50.0 }, { 51.0 }, { 52.0 } }, { { 53.0 }, { 54.0 } } } } } } } } } } }, { { { { { 55.0 }, { 56.0 }, { 57.0 } }, { { 58.0 }, { 59.0 } } } }, { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 }, { 64.0 } } }, { { { { 65.0 }, { 66.0 }, { 67.0 } }, { { 68.0 }, { 69.0 } } } } } } }, { { { { { { { { { { 70.0 }, { 71.0 }, { 72.0 } }, { { 73.0 }, { 74.0 } } } }, { { { 75.0 }, { 76.0 }, { 77.0 } }, { { 78.0 }, { 79.0 } } }, { { { { 80.0 }, { 81.0 }, { 82.0 } }, { { 83.0 }, { 84.0 } } } } }, { { { { { { { { 85.0 }, { 86.0 }, { 87.0 } }, { { 88.0 }, { 89.0 } } } } }, { { { { { 90.0 }, { 91.0 }, { 92.0 } }, { { 93.0 }, { 94.0 } } } }, { { { 95.0 }, { 96.0 }, { 97.0 } }, { { 98.0 }, { 99.0 } } }, { { { { 100.0 }, { 101.0 }, { 102.0 } }, { { 103.0 }, { 104.0 } } } } } } }, { { { { { { { 105.0 }, { 106.0 }, { 107.0 } }, { { 108.0 }, { 109.0 } } } } }, { { { { { 110.0 }, { 111.0 }, { 112.0 } }, { { 113.0 }, { 114.0 } } } }, { { { 115.0 }, { 116.0 }, { 117.0 } }, { { 118.0 }, { 119.0 } } }, { { { { 120.0 }, { 121.0 }, { 122.0 } }, { { 123.0 }, { 124.0 } } } } } } } } } } }, { { { { { 125.0 }, { 126.0 }, { 127.0 } }, { { 128.0 }, { 129.0 } } } }, { { { 130.0 }, { 131.0 }, { 132.0 } }, { { 133.0 }, { 134.0 } } }, { { { { 135.0 }, { 136.0 }, { 137.0 } }, { { 138.0 }, { 139.0 } } } } } } } });
    s10 v1({ { { { { 140.0 }, { 141.0 }, { 142.0 } }, { { 143.0 }, { 144.0 } } }, { { { 145.0 }, { 146.0 }, { 147.0 } }, { { 148.0 }, { 149.0 } } }, { { { 150.0 }, { 151.0 }, { 152.0 } }, { { 153.0 }, { 154.0 } } } }, { { { { { { { { { { 155.0 }, { 156.0 }, { 157.0 } }, { { 158.0 }, { 159.0 } } } }, { { { 160.0 }, { 161.0 }, { 162.0 } }, { { 163.0 }, { 164.0 } } }, { { { { 165.0 }, { 166.0 }, { 167.0 } }, { { 168.0 }, { 169.0 } } } } }, { { { { { { { { 170.0 }, { 171.0 }, { 172.0 } }, { { 173.0 }, { 174.0 } } } } }, { { { { { 175.0 }, { 176.0 }, { 177.0 } }, { { 178.0 }, { 179.0 } } } }, { { { 180.0 }, { 181.0 }, { 182.0 } }, { { 183.0 }, { 184.0 } } }, { { { { 185.0 }, { 186.0 }, { 187.0 } }, { { 188.0 }, { 189.0 } } } } } } }, { { { { { { { 190.0 }, { 191.0 }, { 192.0 } }, { { 193.0 }, { 194.0 } } } } }, { { { { { 195.0 }, { 196.0 }, { 197.0 } }, { { 198.0 }, { 199.0 } } } }, { { { 200.0 }, { 201.0 }, { 202.0 } }, { { 203.0 }, { 204.0 } } }, { { { { 205.0 }, { 206.0 }, { 207.0 } }, { { 208.0 }, { 209.0 } } } } } } } } } } }, { { { { { 210.0 }, { 211.0 }, { 212.0 } }, { { 213.0 }, { 214.0 } } } }, { { { 215.0 }, { 216.0 }, { 217.0 } }, { { 218.0 }, { 219.0 } } }, { { { { 220.0 }, { 221.0 }, { 222.0 } }, { { 223.0 }, { 224.0 } } } } } } } });
    std::vector<s1> v2({ { { { { { 225.0 }, { 226.0 }, { 227.0 } }, { { 228.0 }, { 229.0 } } } }, { { { 230.0 }, { 231.0 }, { 232.0 } }, { { 233.0 }, { 234.0 } } }, { { { { 235.0 }, { 236.0 }, { 237.0 } }, { { 238.0 }, { 239.0 } } } } }, { { { { { 240.0 }, { 241.0 }, { 242.0 } }, { { 243.0 }, { 244.0 } } } }, { { { 245.0 }, { 246.0 }, { 247.0 } }, { { 248.0 }, { 249.0 } } }, { { { { 250.0 }, { 251.0 }, { 252.0 } }, { { 253.0 }, { 254.0 } } } } }, { { { { { 255.0 }, { 256.0 }, { 257.0 } }, { { 258.0 }, { 259.0 } } } }, { { { 260.0 }, { 261.0 }, { 262.0 } }, { { 263.0 }, { 264.0 } } }, { { { { 265.0 }, { 266.0 }, { 267.0 } }, { { 268.0 }, { 269.0 } } } } } });
    std::vector<s8> v3({ { { { { { { { 270.0 }, { 271.0 }, { 272.0 } }, { { 273.0 }, { 274.0 } } } }, { { { 275.0 }, { 276.0 }, { 277.0 } }, { { 278.0 }, { 279.0 } } }, { { { { 280.0 }, { 281.0 }, { 282.0 } }, { { 283.0 }, { 284.0 } } } } } }, { { { { { { 285.0 }, { 286.0 }, { 287.0 } }, { { 288.0 }, { 289.0 } } } }, { { { 290.0 }, { 291.0 }, { 292.0 } }, { { 293.0 }, { 294.0 } } }, { { { { 295.0 }, { 296.0 }, { 297.0 } }, { { 298.0 }, { 299.0 } } } } }, { { { { { { { { 300.0 }, { 301.0 }, { 302.0 } }, { { 303.0 }, { 304.0 } } } } }, { { { { { 305.0 }, { 306.0 }, { 307.0 } }, { { 308.0 }, { 309.0 } } } }, { { { 310.0 }, { 311.0 }, { 312.0 } }, { { 313.0 }, { 314.0 } } }, { { { { 315.0 }, { 316.0 }, { 317.0 } }, { { 318.0 }, { 319.0 } } } } } } }, { { { { { { { 320.0 }, { 321.0 }, { 322.0 } }, { { 323.0 }, { 324.0 } } } } }, { { { { { 325.0 }, { 326.0 }, { 327.0 } }, { { 328.0 }, { 329.0 } } } }, { { { 330.0 }, { 331.0 }, { 332.0 } }, { { 333.0 }, { 334.0 } } }, { { { { 335.0 }, { 336.0 }, { 337.0 } }, { { 338.0 }, { 339.0 } } } } } } } } } }, { { { { { { { 340.0 }, { 341.0 }, { 342.0 } }, { { 343.0 }, { 344.0 } } } }, { { { 345.0 }, { 346.0 }, { 347.0 } }, { { 348.0 }, { 349.0 } } }, { { { { 350.0 }, { 351.0 }, { 352.0 } }, { { 353.0 }, { 354.0 } } } } } }, { { { { { { 355.0 }, { 356.0 }, { 357.0 } }, { { 358.0 }, { 359.0 } } } }, { { { 360.0 }, { 361.0 }, { 362.0 } }, { { 363.0 }, { 364.0 } } }, { { { { 365.0 }, { 366.0 }, { 367.0 } }, { { 368.0 }, { 369.0 } } } } }, { { { { { { { { 370.0 }, { 371.0 }, { 372.0 } }, { { 373.0 }, { 374.0 } } } } }, { { { { { 375.0 }, { 376.0 }, { 377.0 } }, { { 378.0 }, { 379.0 } } } }, { { { 380.0 }, { 381.0 }, { 382.0 } }, { { 383.0 }, { 384.0 } } }, { { { { 385.0 }, { 386.0 }, { 387.0 } }, { { 388.0 }, { 389.0 } } } } } } }, { { { { { { { 390.0 }, { 391.0 }, { 392.0 } }, { { 393.0 }, { 394.0 } } } } }, { { { { { 395.0 }, { 396.0 }, { 397.0 } }, { { 398.0 }, { 399.0 } } } }, { { { 400.0 }, { 401.0 }, { 402.0 } }, { { 403.0 }, { 404.0 } } }, { { { { 405.0 }, { 406.0 }, { 407.0 } }, { { 408.0 }, { 409.0 } } } } } } } } } } });
    double v4(410.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
