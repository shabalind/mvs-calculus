  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    std::vector<std::vector<double>> p3;
    std::vector<std::vector<double>> p4;
    std::vector<std::vector<double>> p5;
    std::vector<std::vector<double>> p6;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2, std::vector<std::vector<double>> v3, std::vector<std::vector<double>> v4, std::vector<std::vector<double>> v5, std::vector<std::vector<double>> v6): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4), p5(v5), p6(v6) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    std::vector<s0> p1;
    s1 p2;
    double p3;
    s0 p4;
    s1 p5;
    s2(s0 v0, std::vector<s0> v1, s1 v2, double v3, s0 v4, s1 v5): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4), p5(v5) { }
  };
  struct s3 {
    s0 p0;
    s1 p1;
    s3(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  s1 f30(const s1 &v0) {
    const s0 v6 = v0.p1;
    const s0 v11 = v0.p1;
    const s1 v7(v11, v6);
    const s0 v5 = v0.p1;
    const s0 v9 = v0.p1;
    const std::vector<std::vector<double>> v18 = v9.p0;
    s0 v26 = v5;
    s1 v43 = v7;
    const std::vector<std::vector<double>> v50 = v11.p4;
    const s0 v39 = v0.p0;
    const s1 v31(v26, v39);
    v43.p0 = v6;
    const s0 v33 = v31.p0;
    v26.p0 = v18;
    v26.p4 = v50;
    const s3 v25(v33, v7);
    const s1 v38 = v25.p1;
    s1 v152 = v43;
    s1 v114 = v152;
    v114 = v38;
    return v114;
  }
  s1 f18(const s1 &v0, const s1 &v1) {
    const s0 v5 = v1.p0;
    const s0 v3 = v1.p0;
    const s0 v4 = v0.p1;
    s1 v8 = v1;
    const std::vector<s0> v6 { v4, v4, v4, v4, v5, v4, v3 };
    const s0 v15 = v6[1];
    const s0 v9 = v6[1];
    const s1 v25 = f30(v8);
    const s0 v22 = v6[0];
    v8.p1 = v22;
    s1 v41 = v25;
    v8.p1 = v9;
    v41.p0 = v15;
    const s1 v33 = f30(v41);
    const s0 v73 = v6[5];
    v8.p1 = v73;
    const s0 v97 = v1.p1;
    const s1 v153 = f30(v33);
    v41.p1 = v97;
    const s0 v123 = v1.p0;
    s1 v112 = v153;
    v112.p1 = v123;
    return v112;
  }
  s0 f14(const s0 &v0) {
    const std::vector<std::vector<double>> v3 = v0.p0;
    s0 v7 = v0;
    s0 v2 = v0;
    const std::vector<double> v1 = v3[0];
    std::vector<double> v5 = v1;
    const std::vector<std::vector<double>> v9 { v5 };
    s0 v8 = v0;
    v2.p3 = v9;
    const std::vector<std::vector<double>> v10 = v7.p4;
    const std::vector<std::vector<double>> v11 = v2.p6;
    v2 = v8;
    v7 = v8;
    v2.p0 = v3;
    const std::vector<std::vector<double>> v27 = v7.p3;
    v2.p1 = v10;
    const s0 v23(v3, v10, v3, v27, v10, v3, v11);
    return v23;
  }
  s1 f6(const s0 &v0, const s1 &v1, const s1 &v2, const s1 &v3) {
    const s1 v15 = f30(v3);
    const s1 v34 = f30(v15);
    const s1 v71 = f18(v1, v1);
    const s1 v37 = f30(v34);
    const s1 v32 = f18(v37, v71);
    const s0 v47 = v32.p0;
    const s3 v124(v47, v2);
    s1 v159 = v71;
    const s1 v146 = v124.p1;
    v159.p1 = v47;
    const s1 v136 = f18(v146, v159);
    return v136;
  }
  s1 f4(const s0 &v0, const s1 &v1) {
    const std::vector<std::vector<double>> v4 = v0.p6;
    const s0 v2 = f14(v0);
    const std::vector<double> v3 = v4[1];
    std::vector<std::vector<double>> v7 = v4;
    const std::vector<std::vector<double>> v8 = v2.p3;
    const std::vector<double> v9 = v8[0];
    v7[0] = v3;
    const s1 v14 = f30(v1);
    v7[0] = v9;
    std::vector<double> v5 = v9;
    const s1 v22 = f18(v1, v14);
    const s0 v10 = f14(v2);
    const std::vector<double> v24 = v8[0];
    std::vector<std::vector<double>> v38 = v4;
    const std::vector<std::vector<std::vector<double>>> v30 { v8, v8, v8, v8, v8, v8 };
    const std::vector<std::vector<double>> v17 = v0.p4;
    s1 v43 = v22;
    const s1 v26 = f18(v43, v22);
    v38[0] = v3;
    v7[0] = v9;
    const std::vector<std::vector<double>> v21 = v30[4];
    v38[0] = v5;
    std::vector<std::vector<double>> v44 = v7;
    const s0 v19(v44, v17, v38, v21, v17, v4, v44);
    v43.p0 = v10;
    v7[1] = v24;
    const s0 v40 = f14(v19);
    s1 v28 = v1;
    const s1 v33 = f6(v0, v28, v26, v22);
    v43.p0 = v40;
    v28.p1 = v40;
    return v33;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const std::vector<s2> &v1, const std::vector<std::vector<s0>> &v2, const s1 &v3, const std::vector<s0> &v4, const double &v5) {
    const s1 v24 = f18(v3, v3);
    const s0 v25 = f14(v0);
    const s1 v28 = f4(v25, v24);
    const s0 v31 = v28.p1;
    const std::vector<std::vector<double>> v48 = v31.p4;
    const std::vector<double> v38 = v48[1];
    const double v78 = v38[0];
    const double v70 = v38[0];
    double v141 = v78;
    const double v96 = v141 - v70;
    return v96;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } }, { { 5.0 }, { 6.0 } }, { { 7.0 } }, { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } });
    std::vector<s2> v1({ { { { { 15.0 }, { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } }, { { 20.0 }, { 21.0 } }, { { 22.0 } }, { { 23.0 }, { 24.0 }, { 25.0 } }, { { 26.0 }, { 27.0 } }, { { 28.0 }, { 29.0 } } }, { { { { 30.0 }, { 31.0 } }, { { 32.0 }, { 33.0 }, { 34.0 } }, { { 35.0 }, { 36.0 } }, { { 37.0 } }, { { 38.0 }, { 39.0 }, { 40.0 } }, { { 41.0 }, { 42.0 } }, { { 43.0 }, { 44.0 } } } }, { { { { 45.0 }, { 46.0 } }, { { 47.0 }, { 48.0 }, { 49.0 } }, { { 50.0 }, { 51.0 } }, { { 52.0 } }, { { 53.0 }, { 54.0 }, { 55.0 } }, { { 56.0 }, { 57.0 } }, { { 58.0 }, { 59.0 } } }, { { { 60.0 }, { 61.0 } }, { { 62.0 }, { 63.0 }, { 64.0 } }, { { 65.0 }, { 66.0 } }, { { 67.0 } }, { { 68.0 }, { 69.0 }, { 70.0 } }, { { 71.0 }, { 72.0 } }, { { 73.0 }, { 74.0 } } } }, 75.0, { { { 76.0 }, { 77.0 } }, { { 78.0 }, { 79.0 }, { 80.0 } }, { { 81.0 }, { 82.0 } }, { { 83.0 } }, { { 84.0 }, { 85.0 }, { 86.0 } }, { { 87.0 }, { 88.0 } }, { { 89.0 }, { 90.0 } } }, { { { { 91.0 }, { 92.0 } }, { { 93.0 }, { 94.0 }, { 95.0 } }, { { 96.0 }, { 97.0 } }, { { 98.0 } }, { { 99.0 }, { 100.0 }, { 101.0 } }, { { 102.0 }, { 103.0 } }, { { 104.0 }, { 105.0 } } }, { { { 106.0 }, { 107.0 } }, { { 108.0 }, { 109.0 }, { 110.0 } }, { { 111.0 }, { 112.0 } }, { { 113.0 } }, { { 114.0 }, { 115.0 }, { 116.0 } }, { { 117.0 }, { 118.0 } }, { { 119.0 }, { 120.0 } } } } }, { { { { 121.0 }, { 122.0 } }, { { 123.0 }, { 124.0 }, { 125.0 } }, { { 126.0 }, { 127.0 } }, { { 128.0 } }, { { 129.0 }, { 130.0 }, { 131.0 } }, { { 132.0 }, { 133.0 } }, { { 134.0 }, { 135.0 } } }, { { { { 136.0 }, { 137.0 } }, { { 138.0 }, { 139.0 }, { 140.0 } }, { { 141.0 }, { 142.0 } }, { { 143.0 } }, { { 144.0 }, { 145.0 }, { 146.0 } }, { { 147.0 }, { 148.0 } }, { { 149.0 }, { 150.0 } } } }, { { { { 151.0 }, { 152.0 } }, { { 153.0 }, { 154.0 }, { 155.0 } }, { { 156.0 }, { 157.0 } }, { { 158.0 } }, { { 159.0 }, { 160.0 }, { 161.0 } }, { { 162.0 }, { 163.0 } }, { { 164.0 }, { 165.0 } } }, { { { 166.0 }, { 167.0 } }, { { 168.0 }, { 169.0 }, { 170.0 } }, { { 171.0 }, { 172.0 } }, { { 173.0 } }, { { 174.0 }, { 175.0 }, { 176.0 } }, { { 177.0 }, { 178.0 } }, { { 179.0 }, { 180.0 } } } }, 181.0, { { { 182.0 }, { 183.0 } }, { { 184.0 }, { 185.0 }, { 186.0 } }, { { 187.0 }, { 188.0 } }, { { 189.0 } }, { { 190.0 }, { 191.0 }, { 192.0 } }, { { 193.0 }, { 194.0 } }, { { 195.0 }, { 196.0 } } }, { { { { 197.0 }, { 198.0 } }, { { 199.0 }, { 200.0 }, { 201.0 } }, { { 202.0 }, { 203.0 } }, { { 204.0 } }, { { 205.0 }, { 206.0 }, { 207.0 } }, { { 208.0 }, { 209.0 } }, { { 210.0 }, { 211.0 } } }, { { { 212.0 }, { 213.0 } }, { { 214.0 }, { 215.0 }, { 216.0 } }, { { 217.0 }, { 218.0 } }, { { 219.0 } }, { { 220.0 }, { 221.0 }, { 222.0 } }, { { 223.0 }, { 224.0 } }, { { 225.0 }, { 226.0 } } } } }, { { { { 227.0 }, { 228.0 } }, { { 229.0 }, { 230.0 }, { 231.0 } }, { { 232.0 }, { 233.0 } }, { { 234.0 } }, { { 235.0 }, { 236.0 }, { 237.0 } }, { { 238.0 }, { 239.0 } }, { { 240.0 }, { 241.0 } } }, { { { { 242.0 }, { 243.0 } }, { { 244.0 }, { 245.0 }, { 246.0 } }, { { 247.0 }, { 248.0 } }, { { 249.0 } }, { { 250.0 }, { 251.0 }, { 252.0 } }, { { 253.0 }, { 254.0 } }, { { 255.0 }, { 256.0 } } } }, { { { { 257.0 }, { 258.0 } }, { { 259.0 }, { 260.0 }, { 261.0 } }, { { 262.0 }, { 263.0 } }, { { 264.0 } }, { { 265.0 }, { 266.0 }, { 267.0 } }, { { 268.0 }, { 269.0 } }, { { 270.0 }, { 271.0 } } }, { { { 272.0 }, { 273.0 } }, { { 274.0 }, { 275.0 }, { 276.0 } }, { { 277.0 }, { 278.0 } }, { { 279.0 } }, { { 280.0 }, { 281.0 }, { 282.0 } }, { { 283.0 }, { 284.0 } }, { { 285.0 }, { 286.0 } } } }, 287.0, { { { 288.0 }, { 289.0 } }, { { 290.0 }, { 291.0 }, { 292.0 } }, { { 293.0 }, { 294.0 } }, { { 295.0 } }, { { 296.0 }, { 297.0 }, { 298.0 } }, { { 299.0 }, { 300.0 } }, { { 301.0 }, { 302.0 } } }, { { { { 303.0 }, { 304.0 } }, { { 305.0 }, { 306.0 }, { 307.0 } }, { { 308.0 }, { 309.0 } }, { { 310.0 } }, { { 311.0 }, { 312.0 }, { 313.0 } }, { { 314.0 }, { 315.0 } }, { { 316.0 }, { 317.0 } } }, { { { 318.0 }, { 319.0 } }, { { 320.0 }, { 321.0 }, { 322.0 } }, { { 323.0 }, { 324.0 } }, { { 325.0 } }, { { 326.0 }, { 327.0 }, { 328.0 } }, { { 329.0 }, { 330.0 } }, { { 331.0 }, { 332.0 } } } } } });
    std::vector<std::vector<s0>> v2({ { { { { 333.0 }, { 334.0 } }, { { 335.0 }, { 336.0 }, { 337.0 } }, { { 338.0 }, { 339.0 } }, { { 340.0 } }, { { 341.0 }, { 342.0 }, { 343.0 } }, { { 344.0 }, { 345.0 } }, { { 346.0 }, { 347.0 } } } }, { { { { 348.0 }, { 349.0 } }, { { 350.0 }, { 351.0 }, { 352.0 } }, { { 353.0 }, { 354.0 } }, { { 355.0 } }, { { 356.0 }, { 357.0 }, { 358.0 } }, { { 359.0 }, { 360.0 } }, { { 361.0 }, { 362.0 } } } } });
    s1 v3({ { { { 363.0 }, { 364.0 } }, { { 365.0 }, { 366.0 }, { 367.0 } }, { { 368.0 }, { 369.0 } }, { { 370.0 } }, { { 371.0 }, { 372.0 }, { 373.0 } }, { { 374.0 }, { 375.0 } }, { { 376.0 }, { 377.0 } } }, { { { 378.0 }, { 379.0 } }, { { 380.0 }, { 381.0 }, { 382.0 } }, { { 383.0 }, { 384.0 } }, { { 385.0 } }, { { 386.0 }, { 387.0 }, { 388.0 } }, { { 389.0 }, { 390.0 } }, { { 391.0 }, { 392.0 } } } });
    std::vector<s0> v4({ { { { 393.0 }, { 394.0 } }, { { 395.0 }, { 396.0 }, { 397.0 } }, { { 398.0 }, { 399.0 } }, { { 400.0 } }, { { 401.0 }, { 402.0 }, { 403.0 } }, { { 404.0 }, { 405.0 } }, { { 406.0 }, { 407.0 } } } });
    double v5(408.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4, v5);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
