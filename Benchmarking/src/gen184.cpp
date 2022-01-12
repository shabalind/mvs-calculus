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
    std::vector<s1> p0;
    std::vector<s0> p1;
    s2(std::vector<s1> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s0 f18(const s0 &v0, const s0 &v1, const std::vector<s2> &v2) {
    const std::vector<std::vector<double>> v26 = v1.p0;
    const std::vector<std::vector<double>> v39 = v0.p0;
    s0 v20 = v0;
    const std::vector<std::vector<double>> v18 = v20.p1;
    v20.p1 = v26;
    const std::vector<std::vector<double>> v38 = v20.p0;
    s0 v76 = v0;
    v76.p1 = v38;
    v76 = v1;
    v20.p0 = v26;
    v20.p0 = v39;
    v20.p0 = v18;
    v76.p1 = v26;
    return v76;
  }
  s2 f16(const s2 &v0) {
    s2 v8 = v0;
    return v8;
  }
  s0 f15(const s0 &v0, const std::vector<std::vector<s2>> &v1) {
    const std::vector<std::vector<std::vector<s2>>> v4 { v1, v1, v1, v1, v1 };
    s0 v6 = v0;
    const std::vector<s2> v5 = v1[1];
    const std::vector<std::vector<double>> v2 = v0.p1;
    std::vector<s2> v7 = v5;
    const std::vector<std::vector<double>> v3 = v6.p0;
    const s0 v13 = f18(v0, v6, v7);
    v6.p1 = v2;
    const s0 v11 = f18(v13, v6, v7);
    const s0 v14 = f18(v13, v11, v5);
    const s0 v15 = f18(v11, v0, v7);
    v6.p1 = v2;
    const s0 v19 = f18(v13, v14, v7);
    const std::vector<std::vector<double>> v36 = v19.p1;
    v6.p1 = v36;
    const s2 v20 = v7[0];
    std::vector<std::vector<std::vector<s2>>> v21 = v4;
    const s2 v22 = f16(v20);
    v7[0] = v22;
    s2 v35 = v22;
    const std::vector<s2> v55 = v1[0];
    const std::vector<s1> v30 = v20.p0;
    const std::vector<std::vector<s2>> v24 = v21[4];
    v35.p0 = v30;
    const s0 v32(v2, v36);
    const std::vector<s1> v49 = v35.p0;
    const s1 v23 = v30[1];
    v35.p0 = v49;
    v6.p0 = v36;
    const s0 v50 = v23.p1;
    v6.p0 = v2;
    v6.p0 = v3;
    const s0 v26 = f18(v15, v32, v55);
    v7[0] = v35;
    const std::vector<s2> v68 = v24[0];
    const std::vector<s0> v66 = v20.p1;
    const std::vector<std::vector<s2>> v64 = v21[4];
    const s0 v59 = v66[0];
    v6.p1 = v3;
    const std::vector<s2> v82 = v64[1];
    const s0 v77 = f18(v59, v50, v68);
    v35.p0 = v49;
    const s0 v114 = f18(v26, v77, v82);
    return v114;
  }
  s0 f13(const s0 &v0, const s0 &v1) {
    s0 v5 = v1;
    v5 = v1;
    s0 v4 = v0;
    v5 = v0;
    const std::vector<std::vector<double>> v2 = v5.p1;
    v4.p1 = v2;
    std::vector<std::vector<double>> v13 = v2;
    const std::vector<double> v6 = v2[2];
    std::vector<std::vector<double>> v9 = v13;
    s0 v7 = v5;
    const std::vector<double> v8 = v2[0];
    const std::vector<std::vector<double>> v11 = v5.p1;
    v9[1] = v8;
    s0 v15 = v0;
    std::vector<std::vector<double>> v3 = v13;
    const double v24 = v6[0];
    v5.p0 = v3;
    v4.p1 = v13;
    v9[1] = v6;
    const std::vector<std::vector<double>> v14 = v5.p0;
    const double v31 = v8[0];
    v9[2] = v6;
    const std::vector<double> v16 = v14[0];
    v7.p0 = v11;
    std::vector<std::vector<double>> v22 = v9;
    const std::vector<std::vector<double>> v28 = v0.p1;
    const std::vector<std::vector<double>> v12 = v7.p1;
    v13 = v3;
    std::vector<double> v19 = v6;
    v13[1] = v8;
    const std::vector<double> v18 { v24, v31, v24, v31, v24, v31, v31 };
    v5.p1 = v3;
    double v32 = v31;
    const std::vector<std::vector<double>> v40 = v0.p0;
    v7.p0 = v11;
    const std::vector<std::vector<double>> v25 = v15.p1;
    std::vector<std::vector<double>> v29 = v3;
    std::vector<std::vector<double>> v56 = v29;
    v5.p0 = v28;
    const std::vector<double> v76 = v2[0];
    const double v43 = v18[5];
    v13[0] = v8;
    const std::vector<std::vector<double>> v79 = v4.p1;
    const double v70 = v31 * v43;
    v7.p0 = v79;
    v56[0] = v16;
    v19[0] = v24;
    const std::vector<std::vector<double>> v53 = v0.p0;
    v4.p1 = v56;
    v19 = v76;
    double v48 = v70;
    v56[2] = v8;
    v5 = v4;
    std::vector<double> v81 = v76;
    double v34 = v32;
    v22[1] = v81;
    v5.p1 = v29;
    v4.p1 = v22;
    double v33 = v34;
    v19[0] = v32;
    std::vector<double> v63 = v16;
    double v58 = v32;
    const std::vector<std::vector<std::vector<double>>> v51 { v12, v25, v2, v56, v56, v13, v25 };
    v29[1] = v8;
    v4.p1 = v11;
    v81[0] = v33;
    v56[0] = v16;
    const std::vector<std::vector<double>> v35 = v51[6];
    const std::vector<double> v99 = v35[1];
    const std::vector<std::vector<double>> v41 = v51[0];
    const std::vector<std::vector<double>> v50 = v4.p1;
    v4.p0 = v40;
    const std::vector<double> v122 = v41[1];
    const std::vector<double> v88 = v13[0];
    v19[0] = v33;
    v19[0] = v43;
    v81[0] = v43;
    v13[2] = v88;
    v15.p1 = v79;
    const s0 v100(v56, v41);
    const std::vector<std::vector<double>> v156 = v100.p1;
    std::vector<std::vector<std::vector<double>>> v171 = v51;
    const std::vector<std::vector<double>> v84 = v171[1];
    const std::vector<std::vector<double>> v141 = v0.p1;
    v33 = v58;
    v4.p0 = v50;
    const std::vector<std::vector<double>> v80 = v4.p1;
    v5.p0 = v53;
    v4.p1 = v141;
    const std::vector<std::vector<double>> v123 = v171[0];
    v15.p0 = v84;
    const s0 v125(v156, v123);
    v3[0] = v63;
    v9[2] = v19;
    v4.p1 = v80;
    v22[2] = v99;
    v19[0] = v48;
    std::vector<double> v134 = v122;
    v29[1] = v134;
    return v125;
  }
  s0 f4(const s0 &v0) {
    const s0 v2 = f13(v0, v0);
    const std::vector<std::vector<double>> v5 = v0.p0;
    std::vector<std::vector<double>> v9 = v5;
    const s0 v7(v9, v9);
    s0 v11 = v0;
    const s0 v18 = f13(v7, v11);
    const std::vector<std::vector<double>> v12 = v2.p1;
    const std::vector<std::vector<double>> v21 = v2.p0;
    v11.p0 = v21;
    const std::vector<double> v19 = v5[2];
    const s0 v44 = f13(v0, v18);
    v9[1] = v19;
    const std::vector<double> v34 = v12[2];
    v9[2] = v34;
    const s0 v25 = f13(v44, v7);
    return v25;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const std::vector<std::vector<s2>> &v1, const std::vector<std::vector<double>> &v2, const double &v3) {
    const std::vector<s0> v8 = v0.p1;
    std::vector<std::vector<s2>> v4 = v1;
    v4 = v1;
    const s0 v13 = v8[2];
    const std::vector<std::vector<double>> v11 = v13.p0;
    v4 = v1;
    const std::vector<std::vector<double>> v17 = v13.p1;
    const s0 v28 = f4(v13);
    const s0 v23 = f15(v28, v4);
    std::vector<std::vector<double>> v35 = v11;
    const std::vector<std::vector<double>> v30 = v23.p1;
    const std::vector<double> v21 = v30[1];
    v35 = v17;
    v35[0] = v21;
    v35 = v2;
    v35[0] = v21;
    v35[1] = v21;
    const std::vector<double> v80 = v35[2];
    v35[0] = v21;
    const double v77 = v80[0];
    const double v73 = v3 + v77;
    return v73;
  }
  int main() {
    s2 v0({ { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } }, { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } } }, { { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } }, { { { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } }, { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } }, { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 }, { 40.0 }, { 41.0 } } } }, { { { 42.0 }, { 43.0 }, { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } } } }, { { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 }, { 52.0 }, { 53.0 } } }, { { { 54.0 }, { 55.0 }, { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } }, { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 }, { 64.0 }, { 65.0 } } } } });
    std::vector<std::vector<s2>> v1({ { { { { { { { { 66.0 }, { 67.0 }, { 68.0 } }, { { 69.0 }, { 70.0 }, { 71.0 } } }, { { { 72.0 }, { 73.0 }, { 74.0 } }, { { 75.0 }, { 76.0 }, { 77.0 } } }, { { { 78.0 }, { 79.0 }, { 80.0 } }, { { 81.0 }, { 82.0 }, { 83.0 } } } }, { { { 84.0 }, { 85.0 }, { 86.0 } }, { { 87.0 }, { 88.0 }, { 89.0 } } } }, { { { { { 90.0 }, { 91.0 }, { 92.0 } }, { { 93.0 }, { 94.0 }, { 95.0 } } }, { { { 96.0 }, { 97.0 }, { 98.0 } }, { { 99.0 }, { 100.0 }, { 101.0 } } }, { { { 102.0 }, { 103.0 }, { 104.0 } }, { { 105.0 }, { 106.0 }, { 107.0 } } } }, { { { 108.0 }, { 109.0 }, { 110.0 } }, { { 111.0 }, { 112.0 }, { 113.0 } } } } }, { { { { 114.0 }, { 115.0 }, { 116.0 } }, { { 117.0 }, { 118.0 }, { 119.0 } } }, { { { 120.0 }, { 121.0 }, { 122.0 } }, { { 123.0 }, { 124.0 }, { 125.0 } } }, { { { 126.0 }, { 127.0 }, { 128.0 } }, { { 129.0 }, { 130.0 }, { 131.0 } } } } } }, { { { { { { { { 132.0 }, { 133.0 }, { 134.0 } }, { { 135.0 }, { 136.0 }, { 137.0 } } }, { { { 138.0 }, { 139.0 }, { 140.0 } }, { { 141.0 }, { 142.0 }, { 143.0 } } }, { { { 144.0 }, { 145.0 }, { 146.0 } }, { { 147.0 }, { 148.0 }, { 149.0 } } } }, { { { 150.0 }, { 151.0 }, { 152.0 } }, { { 153.0 }, { 154.0 }, { 155.0 } } } }, { { { { { 156.0 }, { 157.0 }, { 158.0 } }, { { 159.0 }, { 160.0 }, { 161.0 } } }, { { { 162.0 }, { 163.0 }, { 164.0 } }, { { 165.0 }, { 166.0 }, { 167.0 } } }, { { { 168.0 }, { 169.0 }, { 170.0 } }, { { 171.0 }, { 172.0 }, { 173.0 } } } }, { { { 174.0 }, { 175.0 }, { 176.0 } }, { { 177.0 }, { 178.0 }, { 179.0 } } } } }, { { { { 180.0 }, { 181.0 }, { 182.0 } }, { { 183.0 }, { 184.0 }, { 185.0 } } }, { { { 186.0 }, { 187.0 }, { 188.0 } }, { { 189.0 }, { 190.0 }, { 191.0 } } }, { { { 192.0 }, { 193.0 }, { 194.0 } }, { { 195.0 }, { 196.0 }, { 197.0 } } } } } }, { { { { { { { { 198.0 }, { 199.0 }, { 200.0 } }, { { 201.0 }, { 202.0 }, { 203.0 } } }, { { { 204.0 }, { 205.0 }, { 206.0 } }, { { 207.0 }, { 208.0 }, { 209.0 } } }, { { { 210.0 }, { 211.0 }, { 212.0 } }, { { 213.0 }, { 214.0 }, { 215.0 } } } }, { { { 216.0 }, { 217.0 }, { 218.0 } }, { { 219.0 }, { 220.0 }, { 221.0 } } } }, { { { { { 222.0 }, { 223.0 }, { 224.0 } }, { { 225.0 }, { 226.0 }, { 227.0 } } }, { { { 228.0 }, { 229.0 }, { 230.0 } }, { { 231.0 }, { 232.0 }, { 233.0 } } }, { { { 234.0 }, { 235.0 }, { 236.0 } }, { { 237.0 }, { 238.0 }, { 239.0 } } } }, { { { 240.0 }, { 241.0 }, { 242.0 } }, { { 243.0 }, { 244.0 }, { 245.0 } } } } }, { { { { 246.0 }, { 247.0 }, { 248.0 } }, { { 249.0 }, { 250.0 }, { 251.0 } } }, { { { 252.0 }, { 253.0 }, { 254.0 } }, { { 255.0 }, { 256.0 }, { 257.0 } } }, { { { 258.0 }, { 259.0 }, { 260.0 } }, { { 261.0 }, { 262.0 }, { 263.0 } } } } } } });
    std::vector<std::vector<double>> v2({ { 264.0 }, { 265.0 }, { 266.0 } });
    double v3(267.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
