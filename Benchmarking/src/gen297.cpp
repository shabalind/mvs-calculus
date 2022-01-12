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
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    s2(s1 v0): p0(v0) { }
  };
  struct s3 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s3(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s3 p0;
    std::vector<std::vector<s0>> p1;
    s4(s3 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    std::vector<s1> p0;
    std::vector<s4> p1;
    std::vector<s2> p2;
    s1 p3;
    std::vector<s3> p4;
    s5(std::vector<s1> v0, std::vector<s4> v1, std::vector<s2> v2, s1 v3, std::vector<s3> v4): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4) { }
  };
  s3 f120(const s3 &v0) {
    s3 v7 = v0;
    s3 v4 = v0;
    const std::vector<s0> v6 = v0.p0;
    std::vector<s0> v3 = v6;
    const std::vector<s0> v8 = v0.p1;
    v4 = v7;
    v7.p0 = v6;
    const std::vector<s0> v1 = v0.p1;
    const s0 v2 = v3[1];
    v3[1] = v2;
    std::vector<s0> v30 = v6;
    v7.p1 = v1;
    v4.p0 = v30;
    v7.p1 = v8;
    v7.p0 = v6;
    v30[1] = v2;
    v7.p0 = v30;
    s3 v52 = v4;
    const std::vector<s0> v33 = v0.p0;
    const s0 v84 = v30[1];
    std::vector<s0> v67 = v33;
    v7.p0 = v33;
    v52.p0 = v67;
    v4.p1 = v1;
    v30[1] = v84;
    v4.p0 = v30;
    v52 = v4;
    std::vector<s0> v154 = v30;
    v7.p0 = v154;
    return v52;
  }
  s1 f119(const s1 &v0) {
    const s0 v4 = v0.p1;
    const std::vector<std::vector<double>> v8 = v4.p0;
    const s0 v2 = v0.p0;
    const std::vector<double> v7 = v8[0];
    const std::vector<std::vector<double>> v5 = v4.p0;
    const std::vector<std::vector<double>> v9 = v2.p0;
    const double v1 = v7[0];
    const double v15 = v7[0];
    const std::vector<std::vector<double>> v10 = v2.p1;
    s1 v6 = v0;
    std::vector<std::vector<double>> v16 = v10;
    const std::vector<s0> v11 { v2, v2, v4, v2, v4 };
    v6.p1 = v2;
    const s2 v12(v0);
    std::vector<s0> v33 = v11;
    v6.p0 = v4;
    std::vector<double> v14 = v7;
    const s0 v13 = v11[2];
    const s0 v35 = v11[1];
    v33 = v11;
    const s0 v18 = v6.p1;
    const double v52 = v1 * v1;
    std::vector<std::vector<double>> v38 = v10;
    v6.p1 = v4;
    v14[0] = v15;
    v16[0] = v7;
    v33[3] = v35;
    v38[0] = v14;
    s1 v22 = v6;
    const s1 v53 = v12.p0;
    v22.p0 = v18;
    v14[0] = v52;
    const s0 v24 = v22.p1;
    const std::vector<double> v19 = v16[0];
    const std::vector<s1> v23 { v22, v0, v0, v0, v0, v53 };
    v22 = v6;
    v14[0] = v15;
    const std::vector<std::vector<double>> v34 = v35.p0;
    const std::vector<std::vector<double>> v100 = v13.p0;
    const s0 v29 = v33[3];
    std::vector<std::vector<double>> v37 = v16;
    v33[1] = v13;
    const s0 v39 = v22.p1;
    const std::vector<std::vector<std::vector<double>>> v43 { v38 };
    v6.p0 = v13;
    const s0 v58 = v53.p1;
    const s0 v55 = v6.p0;
    const s0 v36(v9, v37);
    v22.p0 = v29;
    v22.p0 = v18;
    v22.p0 = v36;
    const std::vector<double> v62 = v5[1];
    v38 = v37;
    const std::vector<std::vector<double>> v44 = v43[0];
    v14[0] = v52;
    v6.p1 = v58;
    const s1 v101 = v23[0];
    const std::vector<double> v128 = v44[0];
    v22.p1 = v29;
    v16[0] = v62;
    v22.p1 = v18;
    const s2 v175(v101);
    s0 v91 = v24;
    v37[0] = v19;
    const std::vector<std::vector<double>> v83 = v36.p1;
    v33[0] = v35;
    v91.p0 = v8;
    v91.p0 = v100;
    v22.p0 = v39;
    s0 v103 = v39;
    v22.p1 = v103;
    v16[0] = v128;
    const s1 v56 = v175.p0;
    v22.p0 = v91;
    v6.p0 = v55;
    v91.p0 = v34;
    v91.p1 = v83;
    const s0 v216 = v53.p1;
    v6.p0 = v216;
    return v56;
  }
  s0 f114(const s0 &v0) {
    s0 v1 = v0;
    const std::vector<std::vector<double>> v4 = v1.p1;
    const std::vector<std::vector<double>> v8 = v0.p0;
    v1.p0 = v8;
    const std::vector<double> v7 = v4[0];
    v1.p0 = v8;
    const s0 v2(v8, v4);
    const std::vector<std::vector<double>> v10 = v1.p0;
    const std::vector<std::vector<double>> v25 = v1.p1;
    std::vector<std::vector<double>> v11 = v10;
    v11[1] = v7;
    const double v17 = v7[0];
    const std::vector<std::vector<double>> v23 = v2.p1;
    double v13 = v17;
    const std::vector<std::vector<double>> v24 = v1.p1;
    const std::vector<double> v39 = v8[1];
    std::vector<double> v30 = v7;
    v30[0] = v17;
    const s0 v22(v8, v23);
    const std::vector<double> v47 = v24[0];
    const std::vector<std::vector<double>> v29 = v22.p0;
    s0 v41 = v0;
    v41.p1 = v25;
    const s1 v31(v22, v0);
    const s1 v75 = f119(v31);
    v1.p0 = v11;
    v11[0] = v47;
    v1.p0 = v29;
    const s0 v58 = v75.p1;
    double v43 = v13;
    v11[1] = v39;
    v30[0] = v43;
    s1 v135 = v75;
    v135.p1 = v58;
    const std::vector<std::vector<double>> v98 = v41.p0;
    v135.p1 = v41;
    const s0 v84 = v135.p1;
    v1.p1 = v23;
    v11[0] = v30;
    v1.p0 = v98;
    return v84;
  }
  s0 f99(const s0 &v0) {
    const std::vector<std::vector<double>> v5 = v0.p0;
    const std::vector<double> v14 = v5[0];
    std::vector<std::vector<double>> v16 = v5;
    std::vector<double> v2 = v14;
    const std::vector<double> v1 = v16[0];
    const std::vector<std::vector<double>> v18 = v0.p1;
    std::vector<std::vector<double>> v10 = v5;
    const double v15 = v1[0];
    double v19 = v15;
    const std::vector<double> v20 = v18[0];
    v16 = v10;
    v2[0] = v19;
    const std::vector<double> v25 = v18[0];
    v16[1] = v14;
    double v51 = v19;
    std::vector<std::vector<double>> v33 = v18;
    const std::vector<double> v26 = v33[0];
    v16[1] = v26;
    std::vector<std::vector<double>> v38 = v33;
    std::vector<std::vector<double>> v50 = v5;
    const double v45 = v51 / v19;
    const std::vector<std::vector<std::vector<double>>> v70 { v50, v50 };
    const std::vector<double> v66 = v33[0];
    v10[1] = v66;
    const std::vector<std::vector<double>> v65 = v70[1];
    std::vector<std::vector<double>> v58 = v65;
    v16[0] = v1;
    std::vector<std::vector<double>> v75 = v38;
    v16 = v58;
    v33[0] = v25;
    const s0 v71(v65, v75);
    const std::vector<double> v81 = v38[0];
    v75[0] = v20;
    s0 v245 = v71;
    v245.p0 = v16;
    v16[1] = v2;
    v50[0] = v81;
    v75[0] = v81;
    v2[0] = v45;
    return v245;
  }
  s3 f64(const s3 &v0) {
    const std::vector<s0> v7 = v0.p0;
    const std::vector<std::vector<s0>> v5 { v7 };
    const s3 v1 = f120(v0);
    const s3 v6 = f120(v1);
    const s3 v10 = f120(v0);
    const std::vector<s0> v13 = v0.p0;
    const s3 v8 = f120(v6);
    const s3 v12 = f120(v10);
    const s3 v16 = f120(v1);
    const std::vector<s0> v37 = v5[0];
    const s3 v64 = f120(v8);
    const std::vector<s3> v53 { v6, v16, v12, v64, v0, v16, v16 };
    std::vector<std::vector<s0>> v55 = v5;
    v55[0] = v13;
    v55[0] = v37;
    const s3 v84 = v53[6];
    v55[0] = v37;
    const std::vector<s0> v139 = v84.p1;
    const std::vector<s0> v276 = v55[0];
    const s3 v194(v276, v139);
    return v194;
  }
  s0 f42(const s0 &v0) {
    const s0 v2 = f99(v0);
    const s0 v7 = f114(v2);
    const std::vector<std::vector<double>> v6 = v7.p0;
    const s0 v1 = f99(v7);
    const std::vector<std::vector<double>> v3 = v1.p0;
    const s0 v8 = f114(v7);
    const std::vector<std::vector<std::vector<double>>> v11 { v6, v3, v3, v3, v3 };
    const std::vector<std::vector<double>> v20 = v8.p1;
    const std::vector<std::vector<double>> v27 = v8.p0;
    std::vector<std::vector<std::vector<double>>> v23 = v11;
    const std::vector<std::vector<std::vector<std::vector<double>>>> v39 { v23, v11, v11, v23, v23 };
    const std::vector<std::vector<std::vector<double>>> v95 = v39[1];
    v23 = v95;
    std::vector<std::vector<std::vector<double>>> v43 = v95;
    const std::vector<std::vector<double>> v71 = v43[3];
    v43[2] = v27;
    const s0 v77(v71, v20);
    return v77;
  }
  s3 f19(const s3 &v0) {
    s3 v6 = v0;
    s3 v4 = v0;
    const std::vector<s0> v1 = v4.p0;
    s3 v3 = v6;
    const std::vector<s0> v13 = v3.p1;
    v4 = v6;
    v6.p1 = v13;
    const std::vector<s0> v15 = v4.p0;
    const std::vector<s0> v25 = v3.p0;
    v4.p0 = v25;
    const std::vector<s0> v14 = v6.p1;
    const std::vector<std::vector<s0>> v19 { v25, v15, v1 };
    const s3 v38 = f64(v3);
    const std::vector<s0> v48 = v19[2];
    std::vector<s0> v36 = v14;
    v4 = v38;
    const s3 v55(v15, v36);
    v6.p0 = v1;
    v6.p0 = v48;
    return v55;
  }
  double f2(const double &v0, const s0 &v1) {
    const s0 v3 = f42(v1);
    const std::vector<std::vector<double>> v14 = v3.p0;
    const std::vector<double> v5 = v14[1];
    const double v12 = v5[0];
    return v12;
  }
  __attribute__((noinline))
  double f0(const std::vector<s5> &v0, const std::vector<std::vector<s4>> &v1, const std::vector<s4> &v2, const s3 &v3, const double &v4) {
    const s3 v24 = f19(v3);
    const std::vector<s0> v40 = v24.p0;
    const s0 v51 = v40[1];
    const double v23 = f2(v4, v51);
    const double v42 = v4 / v4;
    const double v100 = v42 + v23;
    double v54 = v100;
    return v54;
  }
  int main() {
    std::vector<s5> v0({ { { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { 3.0 }, { 4.0 } }, { { 5.0 } } } } }, { { { { { { { 6.0 }, { 7.0 } }, { { 8.0 } } }, { { { 9.0 }, { 10.0 } }, { { 11.0 } } } }, { { { { 12.0 }, { 13.0 } }, { { 14.0 } } } } }, { { { { { 15.0 }, { 16.0 } }, { { 17.0 } } } }, { { { { 18.0 }, { 19.0 } }, { { 20.0 } } } } } }, { { { { { { 21.0 }, { 22.0 } }, { { 23.0 } } }, { { { 24.0 }, { 25.0 } }, { { 26.0 } } } }, { { { { 27.0 }, { 28.0 } }, { { 29.0 } } } } }, { { { { { 30.0 }, { 31.0 } }, { { 32.0 } } } }, { { { { 33.0 }, { 34.0 } }, { { 35.0 } } } } } }, { { { { { { 36.0 }, { 37.0 } }, { { 38.0 } } }, { { { 39.0 }, { 40.0 } }, { { 41.0 } } } }, { { { { 42.0 }, { 43.0 } }, { { 44.0 } } } } }, { { { { { 45.0 }, { 46.0 } }, { { 47.0 } } } }, { { { { 48.0 }, { 49.0 } }, { { 50.0 } } } } } } }, { { { { { { 51.0 }, { 52.0 } }, { { 53.0 } } }, { { { 54.0 }, { 55.0 } }, { { 56.0 } } } } }, { { { { { 57.0 }, { 58.0 } }, { { 59.0 } } }, { { { 60.0 }, { 61.0 } }, { { 62.0 } } } } }, { { { { { 63.0 }, { 64.0 } }, { { 65.0 } } }, { { { 66.0 }, { 67.0 } }, { { 68.0 } } } } } }, { { { { 69.0 }, { 70.0 } }, { { 71.0 } } }, { { { 72.0 }, { 73.0 } }, { { 74.0 } } } }, { { { { { { 75.0 }, { 76.0 } }, { { 77.0 } } }, { { { 78.0 }, { 79.0 } }, { { 80.0 } } } }, { { { { 81.0 }, { 82.0 } }, { { 83.0 } } } } } } }, { { { { { { 84.0 }, { 85.0 } }, { { 86.0 } } }, { { { 87.0 }, { 88.0 } }, { { 89.0 } } } } }, { { { { { { { 90.0 }, { 91.0 } }, { { 92.0 } } }, { { { 93.0 }, { 94.0 } }, { { 95.0 } } } }, { { { { 96.0 }, { 97.0 } }, { { 98.0 } } } } }, { { { { { 99.0 }, { 100.0 } }, { { 101.0 } } } }, { { { { 102.0 }, { 103.0 } }, { { 104.0 } } } } } }, { { { { { { 105.0 }, { 106.0 } }, { { 107.0 } } }, { { { 108.0 }, { 109.0 } }, { { 110.0 } } } }, { { { { 111.0 }, { 112.0 } }, { { 113.0 } } } } }, { { { { { 114.0 }, { 115.0 } }, { { 116.0 } } } }, { { { { 117.0 }, { 118.0 } }, { { 119.0 } } } } } }, { { { { { { 120.0 }, { 121.0 } }, { { 122.0 } } }, { { { 123.0 }, { 124.0 } }, { { 125.0 } } } }, { { { { 126.0 }, { 127.0 } }, { { 128.0 } } } } }, { { { { { 129.0 }, { 130.0 } }, { { 131.0 } } } }, { { { { 132.0 }, { 133.0 } }, { { 134.0 } } } } } } }, { { { { { { 135.0 }, { 136.0 } }, { { 137.0 } } }, { { { 138.0 }, { 139.0 } }, { { 140.0 } } } } }, { { { { { 141.0 }, { 142.0 } }, { { 143.0 } } }, { { { 144.0 }, { 145.0 } }, { { 146.0 } } } } }, { { { { { 147.0 }, { 148.0 } }, { { 149.0 } } }, { { { 150.0 }, { 151.0 } }, { { 152.0 } } } } } }, { { { { 153.0 }, { 154.0 } }, { { 155.0 } } }, { { { 156.0 }, { 157.0 } }, { { 158.0 } } } }, { { { { { { 159.0 }, { 160.0 } }, { { 161.0 } } }, { { { 162.0 }, { 163.0 } }, { { 164.0 } } } }, { { { { 165.0 }, { 166.0 } }, { { 167.0 } } } } } } }, { { { { { { 168.0 }, { 169.0 } }, { { 170.0 } } }, { { { 171.0 }, { 172.0 } }, { { 173.0 } } } } }, { { { { { { { 174.0 }, { 175.0 } }, { { 176.0 } } }, { { { 177.0 }, { 178.0 } }, { { 179.0 } } } }, { { { { 180.0 }, { 181.0 } }, { { 182.0 } } } } }, { { { { { 183.0 }, { 184.0 } }, { { 185.0 } } } }, { { { { 186.0 }, { 187.0 } }, { { 188.0 } } } } } }, { { { { { { 189.0 }, { 190.0 } }, { { 191.0 } } }, { { { 192.0 }, { 193.0 } }, { { 194.0 } } } }, { { { { 195.0 }, { 196.0 } }, { { 197.0 } } } } }, { { { { { 198.0 }, { 199.0 } }, { { 200.0 } } } }, { { { { 201.0 }, { 202.0 } }, { { 203.0 } } } } } }, { { { { { { 204.0 }, { 205.0 } }, { { 206.0 } } }, { { { 207.0 }, { 208.0 } }, { { 209.0 } } } }, { { { { 210.0 }, { 211.0 } }, { { 212.0 } } } } }, { { { { { 213.0 }, { 214.0 } }, { { 215.0 } } } }, { { { { 216.0 }, { 217.0 } }, { { 218.0 } } } } } } }, { { { { { { 219.0 }, { 220.0 } }, { { 221.0 } } }, { { { 222.0 }, { 223.0 } }, { { 224.0 } } } } }, { { { { { 225.0 }, { 226.0 } }, { { 227.0 } } }, { { { 228.0 }, { 229.0 } }, { { 230.0 } } } } }, { { { { { 231.0 }, { 232.0 } }, { { 233.0 } } }, { { { 234.0 }, { 235.0 } }, { { 236.0 } } } } } }, { { { { 237.0 }, { 238.0 } }, { { 239.0 } } }, { { { 240.0 }, { 241.0 } }, { { 242.0 } } } }, { { { { { { 243.0 }, { 244.0 } }, { { 245.0 } } }, { { { 246.0 }, { 247.0 } }, { { 248.0 } } } }, { { { { 249.0 }, { 250.0 } }, { { 251.0 } } } } } } } });
    std::vector<std::vector<s4>> v1({ { { { { { { { 252.0 }, { 253.0 } }, { { 254.0 } } }, { { { 255.0 }, { 256.0 } }, { { 257.0 } } } }, { { { { 258.0 }, { 259.0 } }, { { 260.0 } } } } }, { { { { { 261.0 }, { 262.0 } }, { { 263.0 } } } }, { { { { 264.0 }, { 265.0 } }, { { 266.0 } } } } } } }, { { { { { { { 267.0 }, { 268.0 } }, { { 269.0 } } }, { { { 270.0 }, { 271.0 } }, { { 272.0 } } } }, { { { { 273.0 }, { 274.0 } }, { { 275.0 } } } } }, { { { { { 276.0 }, { 277.0 } }, { { 278.0 } } } }, { { { { 279.0 }, { 280.0 } }, { { 281.0 } } } } } } } });
    std::vector<s4> v2({ { { { { { { 282.0 }, { 283.0 } }, { { 284.0 } } }, { { { 285.0 }, { 286.0 } }, { { 287.0 } } } }, { { { { 288.0 }, { 289.0 } }, { { 290.0 } } } } }, { { { { { 291.0 }, { 292.0 } }, { { 293.0 } } } }, { { { { 294.0 }, { 295.0 } }, { { 296.0 } } } } } }, { { { { { { 297.0 }, { 298.0 } }, { { 299.0 } } }, { { { 300.0 }, { 301.0 } }, { { 302.0 } } } }, { { { { 303.0 }, { 304.0 } }, { { 305.0 } } } } }, { { { { { 306.0 }, { 307.0 } }, { { 308.0 } } } }, { { { { 309.0 }, { 310.0 } }, { { 311.0 } } } } } } });
    s3 v3({ { { { { 312.0 }, { 313.0 } }, { { 314.0 } } }, { { { 315.0 }, { 316.0 } }, { { 317.0 } } } }, { { { { 318.0 }, { 319.0 } }, { { 320.0 } } } } });
    double v4(321.0);
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
