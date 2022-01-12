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
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    s0 p1;
    s2(s1 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s0 p0;
    std::vector<s2> p1;
    s4(s0 v0, std::vector<s2> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    std::vector<s4> p0;
    s2 p1;
    s1 p2;
    s5(std::vector<s4> v0, s2 v1, s1 v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s6 {
    std::vector<std::vector<s0>> p0;
    s5 p1;
    s6(std::vector<std::vector<s0>> v0, s5 v1): p0(v0), p1(v1) { }
  };
  s0 f114(const s0 &v0) {
    s0 v7 = v0;
    const std::vector<s0> v3 { v7 };
    const s0 v10 = v3[0];
    return v10;
  }
  s0 f101(const s0 &v0, const s1 &v1) {
    const s0 v5 = f114(v0);
    const s0 v2 = f114(v5);
    const s0 v30 = f114(v2);
    const s0 v22 = f114(v30);
    return v22;
  }
  s0 f81(const s0 &v0) {
    s0 v7 = v0;
    const std::vector<std::vector<double>> v3 = v7.p0;
    const s0 v1 = f114(v0);
    std::vector<std::vector<double>> v4 = v3;
    const s0 v8 = f114(v1);
    const s0 v6 = f114(v7);
    std::vector<std::vector<double>> v2 = v4;
    v7.p0 = v3;
    const s0 v9 = f114(v1);
    v2 = v3;
    const std::vector<s0> v12 { v6, v9, v0, v6, v7, v8 };
    v7.p0 = v3;
    const s0 v13 = f114(v1);
    const std::vector<std::vector<double>> v11 = v7.p0;
    s0 v16 = v13;
    const s0 v25 = f114(v16);
    const std::vector<std::vector<double>> v42 = v25.p0;
    v7.p0 = v42;
    v7.p0 = v2;
    const s0 v51 = v12[5];
    v7.p0 = v11;
    return v51;
  }
  s1 f80(const s1 &v0) {
    s1 v2 = v0;
    return v2;
  }
  s1 f66(const s1 &v0) {
    s1 v6 = v0;
    const std::vector<s0> v1 = v6.p0;
    const s0 v4 = v1[1];
    const s0 v14 = f101(v4, v0);
    v6.p1 = v14;
    return v6;
  }
  s0 f35(const s0 &v0) {
    const std::vector<std::vector<double>> v1 = v0.p0;
    const s0 v2 = f81(v0);
    const s0 v15 = f81(v2);
    const s0 v8 = f81(v0);
    const s0 v4 = f114(v0);
    const std::vector<std::vector<double>> v11 = v4.p1;
    s0 v21 = v0;
    v21.p1 = v11;
    const s0 v16 = f114(v21);
    v21.p0 = v1;
    const s0 v44 = f114(v15);
    v21.p1 = v11;
    const std::vector<std::vector<double>> v61 = v44.p0;
    v21.p0 = v61;
    const std::vector<std::vector<double>> v96 = v8.p0;
    v21.p0 = v96;
    return v16;
  }
  double f25(const double &v0) {
    double v2 = v0;
    double v3 = v0;
    double v1 = v2;
    const double v6 = v1 / v1;
    double v5 = v2;
    double v10 = v3;
    double v7 = v5;
    v3 = v6;
    double v4 = v1;
    double v8 = v0;
    const double v9 = v2 * v10;
    double v13 = v7;
    v5 = v6;
    double v21 = v5;
    const double v17 = v0 / v21;
    v4 = v17;
    double v29 = v8;
    double v43 = v4;
    double v14 = v9;
    double v19 = v14;
    const std::vector<double> v25 { v6, v43, v10, v29 };
    std::vector<double> v71 = v25;
    const double v32 = v25[1];
    std::vector<double> v37 = v71;
    std::vector<double> v39 = v71;
    v4 = v13;
    double v46 = v32;
    v29 = v3;
    v5 = v10;
    const double v53 = v37[0];
    const double v55 = v39[0];
    v39[0] = v53;
    v71[0] = v19;
    v39[2] = v46;
    v39[1] = v13;
    return v55;
  }
  double f16(const double &v0) {
    const double v1 = f25(v0);
    double v4 = v0;
    const double v7 = f25(v0);
    const double v2 = f25(v0);
    double v5 = v4;
    double v6 = v1;
    double v12 = v1;
    const double v3 = f25(v12);
    double v8 = v6;
    double v9 = v0;
    double v15 = v0;
    const double v11 = f25(v9);
    double v28 = v5;
    double v10 = v0;
    double v13 = v10;
    const double v18 = f25(v10);
    const double v27 = f25(v7);
    double v40 = v15;
    const double v24 = f25(v28);
    const std::vector<double> v21 { v2, v18, v18, v4, v3, v4, v3 };
    std::vector<double> v34 = v21;
    std::vector<double> v16 = v21;
    double v19 = v24;
    double v41 = v8;
    const double v26 = v16[1];
    v5 = v40;
    std::vector<double> v61 = v21;
    v61[5] = v40;
    std::vector<double> v22 = v61;
    v16[2] = v41;
    std::vector<double> v64 = v34;
    v16[5] = v26;
    v10 = v11;
    const std::vector<std::vector<double>> v73 { v34, v61, v64, v34 };
    std::vector<double> v51 = v22;
    std::vector<std::vector<double>> v71 = v73;
    const double v66 = v51[1];
    double v57 = v18;
    v16[0] = v15;
    v71[2] = v16;
    const std::vector<double> v115 = v71[1];
    v61[0] = v27;
    v16[1] = v66;
    const double v94 = v13 - v24;
    v16[3] = v57;
    const double v106 = v115[5];
    v71[0] = v22;
    v22[5] = v18;
    v61[0] = v11;
    v16[1] = v94;
    v51[4] = v9;
    v71[2] = v21;
    v64[5] = v19;
    const double v176 = f25(v106);
    return v176;
  }
  s0 f11(const s0 &v0) {
    s0 v5 = v0;
    s0 v4 = v0;
    const s0 v3 = f114(v0);
    const s0 v6 = f114(v3);
    const std::vector<std::vector<double>> v2 = v5.p0;
    const s0 v7 = f81(v3);
    const s0 v8 = f81(v4);
    const std::vector<std::vector<double>> v12 = v0.p1;
    std::vector<std::vector<double>> v10 = v2;
    v5.p1 = v12;
    const s0 v1 = f114(v0);
    const std::vector<s0> v13 { v7, v8, v5, v0 };
    const s0 v33 = f35(v0);
    v4.p0 = v2;
    const s0 v15 = v13[2];
    const s0 v32 = f114(v5);
    std::vector<s0> v11 = v13;
    const std::vector<double> v18 = v10[0];
    v11[3] = v3;
    const double v16 = v18[0];
    std::vector<std::vector<double>> v22 = v10;
    std::vector<s0> v20 = v13;
    std::vector<std::vector<double>> v26 = v2;
    const std::vector<std::vector<double>> v29 = v4.p0;
    const s0 v17 = f81(v6);
    const std::vector<std::vector<double>> v43 = v7.p1;
    const std::vector<double> v25 = v29[0];
    const std::vector<std::vector<double>> v27 = v7.p1;
    v5.p0 = v26;
    v4 = v15;
    const std::vector<std::vector<double>> v30 = v33.p0;
    const std::vector<double> v28 = v43[1];
    std::vector<std::vector<double>> v34 = v29;
    std::vector<s0> v23 = v11;
    const s0 v59 = v20[1];
    v4 = v17;
    const std::vector<std::vector<double>> v85 = v32.p0;
    const std::vector<double> v49 = v22[1];
    const double v57 = v28[0];
    const double v61 = v25[0];
    const std::vector<std::vector<double>> v44 = v6.p0;
    const s0 v66 = f35(v1);
    v5.p0 = v85;
    v5.p0 = v34;
    v4.p0 = v30;
    const std::vector<std::vector<double>> v51 = v17.p0;
    const double v81 = f16(v61);
    std::vector<std::vector<double>> v53 = v27;
    std::vector<double> v58 = v49;
    v4.p0 = v22;
    const std::vector<double> v102 = v34[0];
    v53[1] = v58;
    std::vector<double> v67 = v102;
    std::vector<std::vector<double>> v100 = v53;
    std::vector<std::vector<double>> v138 = v43;
    std::vector<s0> v63 = v23;
    v67[0] = v81;
    const s0 v113 = f114(v66);
    v11[0] = v8;
    v34[1] = v67;
    v23[3] = v33;
    const std::vector<double> v95 = v100[1];
    v4.p0 = v51;
    const s0 v106 = v63[2];
    v67[0] = v57;
    v5.p0 = v44;
    v23[1] = v113;
    const std::vector<std::vector<double>> v114 = v59.p0;
    v5.p0 = v2;
    v34[2] = v95;
    v67[0] = v16;
    v5.p1 = v138;
    v5.p0 = v114;
    v5.p1 = v12;
    v5.p1 = v53;
    v4.p1 = v53;
    return v106;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s6>> &v0, const double &v1) {
    double v5 = v1;
    v5 = v1;
    const double v2 = f16(v1);
    double v4 = v5;
    const std::vector<s6> v6 = v0[2];
    const double v7 = f16(v2);
    std::vector<std::vector<s6>> v3 = v0;
    v3[0] = v6;
    const std::vector<s6> v11 = v3[2];
    const s6 v13 = v6[0];
    v3[1] = v6;
    const s6 v12 = v11[0];
    const std::vector<s6> v22 = v0[2];
    v3[2] = v22;
    const s5 v46 = v13.p1;
    v3[0] = v11;
    const std::vector<std::vector<s0>> v23 = v12.p0;
    const std::vector<s6> v24 = v3[2];
    v3[1] = v24;
    const s1 v35 = v46.p2;
    const double v44 = f16(v4);
    v3[0] = v11;
    const std::vector<s0> v38 = v35.p0;
    const s1 v36 = f66(v35);
    std::vector<s0> v55 = v38;
    const s1 v87 = f80(v36);
    const std::vector<s0> v54 = v23[0];
    const s0 v62 = v87.p1;
    const s0 v49 = f11(v62);
    v3[1] = v24;
    s0 v34 = v49;
    const s0 v28 = v55[2];
    const s0 v50 = v54[0];
    const std::vector<std::vector<double>> v42 = v34.p0;
    v34.p0 = v42;
    const std::vector<std::vector<double>> v56 = v28.p0;
    const s0 v33 = f81(v50);
    v55[0] = v33;
    v34.p0 = v56;
    v55[2] = v33;
    const std::vector<double> v133 = v56[2];
    const std::vector<double> v98 = v42[1];
    std::vector<double> v76 = v133;
    v76[0] = v7;
    const double v176 = v76[0];
    const double v255 = v44 - v176;
    const double v131 = v98[0];
    v76[0] = v131;
    v3[2] = v24;
    return v255;
  }
  int main() {
    std::vector<std::vector<s6>> v0({ { { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } } } }, { { { { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } }, { { { { { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } }, { { { 15.0 }, { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } }, { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 }, { 24.0 } } } }, { { { 25.0 }, { 26.0 }, { 27.0 } }, { { 28.0 }, { 29.0 } } } }, { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 } } } } } }, { { { { 35.0 }, { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } }, { { { { { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 }, { 44.0 } } }, { { { 45.0 }, { 46.0 }, { 47.0 } }, { { 48.0 }, { 49.0 } } }, { { { 50.0 }, { 51.0 }, { 52.0 } }, { { 53.0 }, { 54.0 } } } }, { { { 55.0 }, { 56.0 }, { 57.0 } }, { { 58.0 }, { 59.0 } } } }, { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 }, { 64.0 } } } } } }, { { { { 65.0 }, { 66.0 }, { 67.0 } }, { { 68.0 }, { 69.0 } } }, { { { { { { { 70.0 }, { 71.0 }, { 72.0 } }, { { 73.0 }, { 74.0 } } }, { { { 75.0 }, { 76.0 }, { 77.0 } }, { { 78.0 }, { 79.0 } } }, { { { 80.0 }, { 81.0 }, { 82.0 } }, { { 83.0 }, { 84.0 } } } }, { { { 85.0 }, { 86.0 }, { 87.0 } }, { { 88.0 }, { 89.0 } } } }, { { { 90.0 }, { 91.0 }, { 92.0 } }, { { 93.0 }, { 94.0 } } } } } } }, { { { { { { 95.0 }, { 96.0 }, { 97.0 } }, { { 98.0 }, { 99.0 } } }, { { { 100.0 }, { 101.0 }, { 102.0 } }, { { 103.0 }, { 104.0 } } }, { { { 105.0 }, { 106.0 }, { 107.0 } }, { { 108.0 }, { 109.0 } } } }, { { { 110.0 }, { 111.0 }, { 112.0 } }, { { 113.0 }, { 114.0 } } } }, { { { 115.0 }, { 116.0 }, { 117.0 } }, { { 118.0 }, { 119.0 } } } }, { { { { { 120.0 }, { 121.0 }, { 122.0 } }, { { 123.0 }, { 124.0 } } }, { { { 125.0 }, { 126.0 }, { 127.0 } }, { { 128.0 }, { 129.0 } } }, { { { 130.0 }, { 131.0 }, { 132.0 } }, { { 133.0 }, { 134.0 } } } }, { { { 135.0 }, { 136.0 }, { 137.0 } }, { { 138.0 }, { 139.0 } } } } } } }, { { { { { { { 140.0 }, { 141.0 }, { 142.0 } }, { { 143.0 }, { 144.0 } } } } }, { { { { { { 145.0 }, { 146.0 }, { 147.0 } }, { { 148.0 }, { 149.0 } } }, { { { { { { { 150.0 }, { 151.0 }, { 152.0 } }, { { 153.0 }, { 154.0 } } }, { { { 155.0 }, { 156.0 }, { 157.0 } }, { { 158.0 }, { 159.0 } } }, { { { 160.0 }, { 161.0 }, { 162.0 } }, { { 163.0 }, { 164.0 } } } }, { { { 165.0 }, { 166.0 }, { 167.0 } }, { { 168.0 }, { 169.0 } } } }, { { { 170.0 }, { 171.0 }, { 172.0 } }, { { 173.0 }, { 174.0 } } } } } }, { { { { 175.0 }, { 176.0 }, { 177.0 } }, { { 178.0 }, { 179.0 } } }, { { { { { { { 180.0 }, { 181.0 }, { 182.0 } }, { { 183.0 }, { 184.0 } } }, { { { 185.0 }, { 186.0 }, { 187.0 } }, { { 188.0 }, { 189.0 } } }, { { { 190.0 }, { 191.0 }, { 192.0 } }, { { 193.0 }, { 194.0 } } } }, { { { 195.0 }, { 196.0 }, { 197.0 } }, { { 198.0 }, { 199.0 } } } }, { { { 200.0 }, { 201.0 }, { 202.0 } }, { { 203.0 }, { 204.0 } } } } } }, { { { { 205.0 }, { 206.0 }, { 207.0 } }, { { 208.0 }, { 209.0 } } }, { { { { { { { 210.0 }, { 211.0 }, { 212.0 } }, { { 213.0 }, { 214.0 } } }, { { { 215.0 }, { 216.0 }, { 217.0 } }, { { 218.0 }, { 219.0 } } }, { { { 220.0 }, { 221.0 }, { 222.0 } }, { { 223.0 }, { 224.0 } } } }, { { { 225.0 }, { 226.0 }, { 227.0 } }, { { 228.0 }, { 229.0 } } } }, { { { 230.0 }, { 231.0 }, { 232.0 } }, { { 233.0 }, { 234.0 } } } } } } }, { { { { { { 235.0 }, { 236.0 }, { 237.0 } }, { { 238.0 }, { 239.0 } } }, { { { 240.0 }, { 241.0 }, { 242.0 } }, { { 243.0 }, { 244.0 } } }, { { { 245.0 }, { 246.0 }, { 247.0 } }, { { 248.0 }, { 249.0 } } } }, { { { 250.0 }, { 251.0 }, { 252.0 } }, { { 253.0 }, { 254.0 } } } }, { { { 255.0 }, { 256.0 }, { 257.0 } }, { { 258.0 }, { 259.0 } } } }, { { { { { 260.0 }, { 261.0 }, { 262.0 } }, { { 263.0 }, { 264.0 } } }, { { { 265.0 }, { 266.0 }, { 267.0 } }, { { 268.0 }, { 269.0 } } }, { { { 270.0 }, { 271.0 }, { 272.0 } }, { { 273.0 }, { 274.0 } } } }, { { { 275.0 }, { 276.0 }, { 277.0 } }, { { 278.0 }, { 279.0 } } } } } } }, { { { { { { { 280.0 }, { 281.0 }, { 282.0 } }, { { 283.0 }, { 284.0 } } } } }, { { { { { { 285.0 }, { 286.0 }, { 287.0 } }, { { 288.0 }, { 289.0 } } }, { { { { { { { 290.0 }, { 291.0 }, { 292.0 } }, { { 293.0 }, { 294.0 } } }, { { { 295.0 }, { 296.0 }, { 297.0 } }, { { 298.0 }, { 299.0 } } }, { { { 300.0 }, { 301.0 }, { 302.0 } }, { { 303.0 }, { 304.0 } } } }, { { { 305.0 }, { 306.0 }, { 307.0 } }, { { 308.0 }, { 309.0 } } } }, { { { 310.0 }, { 311.0 }, { 312.0 } }, { { 313.0 }, { 314.0 } } } } } }, { { { { 315.0 }, { 316.0 }, { 317.0 } }, { { 318.0 }, { 319.0 } } }, { { { { { { { 320.0 }, { 321.0 }, { 322.0 } }, { { 323.0 }, { 324.0 } } }, { { { 325.0 }, { 326.0 }, { 327.0 } }, { { 328.0 }, { 329.0 } } }, { { { 330.0 }, { 331.0 }, { 332.0 } }, { { 333.0 }, { 334.0 } } } }, { { { 335.0 }, { 336.0 }, { 337.0 } }, { { 338.0 }, { 339.0 } } } }, { { { 340.0 }, { 341.0 }, { 342.0 } }, { { 343.0 }, { 344.0 } } } } } }, { { { { 345.0 }, { 346.0 }, { 347.0 } }, { { 348.0 }, { 349.0 } } }, { { { { { { { 350.0 }, { 351.0 }, { 352.0 } }, { { 353.0 }, { 354.0 } } }, { { { 355.0 }, { 356.0 }, { 357.0 } }, { { 358.0 }, { 359.0 } } }, { { { 360.0 }, { 361.0 }, { 362.0 } }, { { 363.0 }, { 364.0 } } } }, { { { 365.0 }, { 366.0 }, { 367.0 } }, { { 368.0 }, { 369.0 } } } }, { { { 370.0 }, { 371.0 }, { 372.0 } }, { { 373.0 }, { 374.0 } } } } } } }, { { { { { { 375.0 }, { 376.0 }, { 377.0 } }, { { 378.0 }, { 379.0 } } }, { { { 380.0 }, { 381.0 }, { 382.0 } }, { { 383.0 }, { 384.0 } } }, { { { 385.0 }, { 386.0 }, { 387.0 } }, { { 388.0 }, { 389.0 } } } }, { { { 390.0 }, { 391.0 }, { 392.0 } }, { { 393.0 }, { 394.0 } } } }, { { { 395.0 }, { 396.0 }, { 397.0 } }, { { 398.0 }, { 399.0 } } } }, { { { { { 400.0 }, { 401.0 }, { 402.0 } }, { { 403.0 }, { 404.0 } } }, { { { 405.0 }, { 406.0 }, { 407.0 } }, { { 408.0 }, { 409.0 } } }, { { { 410.0 }, { 411.0 }, { 412.0 } }, { { 413.0 }, { 414.0 } } } }, { { { 415.0 }, { 416.0 }, { 417.0 } }, { { 418.0 }, { 419.0 } } } } } } } });
    double v1(420.0);
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
