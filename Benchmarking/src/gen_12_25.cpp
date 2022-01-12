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
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<std::vector<s1>> p0;
    s0 p1;
    s2(std::vector<std::vector<s1>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s1 p0;
    std::vector<s0> p1;
    s3(s1 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s2 p0;
    std::vector<std::vector<s1>> p1;
    s4(s2 v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s3 p0;
    s5(s3 v0): p0(v0) { }
  };
  struct s6 {
    s5 p0;
    std::vector<std::vector<s4>> p1;
    s6(s5 v0, std::vector<std::vector<s4>> v1): p0(v0), p1(v1) { }
  };
  std::vector<s2> f55(const std::vector<s2> &v0) {
    std::vector<s2> v2 = v0;
    std::vector<s2> v1 = v0;
    const s2 v7 = v0[0];
    const s2 v6 = v1[0];
    v1[0] = v6;
    v1 = v0;
    v1[0] = v7;
    v2[0] = v6;
    v1 = v2;
    v2 = v1;
    const s2 v35 = v2[0];
    const s2 v29 = v1[0];
    std::vector<s2> v32 = v0;
    const std::vector<s2> v34 { v7, v6 };
    const s2 v26 = v34[1];
    v32[0] = v6;
    v2[0] = v35;
    v2[0] = v26;
    v32[0] = v26;
    v32 = v2;
    v32[0] = v29;
    return v32;
  }
  s0 f38(const s0 &v0) {
    const std::vector<std::vector<double>> v2 = v0.p1;
    const std::vector<double> v3 = v2[0];
    const std::vector<std::vector<double>> v7 = v0.p1;
    const std::vector<std::vector<double>> v6 = v0.p1;
    const std::vector<std::vector<double>> v4 = v0.p0;
    const std::vector<std::vector<double>> v8 = v0.p1;
    std::vector<double> v5 = v3;
    std::vector<std::vector<double>> v14 = v7;
    const std::vector<std::vector<double>> v10 = v0.p1;
    v14[0] = v3;
    std::vector<std::vector<double>> v22 = v8;
    v14[2] = v3;
    const double v1 = v5[0];
    const std::vector<std::vector<double>> v13 = v0.p1;
    const std::vector<std::vector<double>> v9 = v0.p1;
    const std::vector<double> v12 = v13[0];
    const double v15 = v3[0];
    std::vector<std::vector<double>> v21 = v6;
    const double v19 = v1 * v15;
    const std::vector<std::vector<double>> v24 = v0.p1;
    std::vector<double> v32 = v12;
    s0 v26 = v0;
    const std::vector<std::vector<double>> v29 = v0.p1;
    v21[0] = v5;
    std::vector<std::vector<double>> v37 = v24;
    v22 = v9;
    const std::vector<std::vector<double>> v33 = v26.p1;
    v26.p0 = v29;
    v5[0] = v19;
    const std::vector<std::vector<double>> v64 = v26.p0;
    const std::vector<std::vector<double>> v56 = v26.p0;
    const std::vector<double> v34 = v4[0];
    v26.p0 = v56;
    v26.p0 = v7;
    const s0 v45(v37, v22);
    const std::vector<std::vector<double>> v51 = v26.p1;
    v26.p0 = v56;
    v21[0] = v3;
    s0 v53 = v45;
    const std::vector<std::vector<double>> v50 = v53.p0;
    v26.p0 = v6;
    const double v86 = v34[0];
    v21[2] = v5;
    v53.p0 = v21;
    const s0 v75(v33, v10);
    v21[1] = v32;
    v26.p0 = v51;
    v21 = v14;
    v37[0] = v3;
    const s0 v52(v50, v51);
    v53.p0 = v14;
    const std::vector<std::vector<double>> v110 = v75.p1;
    v32[0] = v86;
    v26.p1 = v110;
    v26.p0 = v64;
    return v52;
  }
  s2 f37(const s2 &v0) {
    const s0 v5 = v0.p1;
    s2 v12 = v0;
    const s0 v23 = f38(v5);
    const s0 v34 = f38(v23);
    v12.p1 = v34;
    const std::vector<s2> v87 { v12, v0 };
    const s2 v120 = v87[1];
    return v120;
  }
  s0 f30(const s0 &v0) {
    const s0 v2 = f38(v0);
    const std::vector<std::vector<double>> v5 = v0.p1;
    const s0 v7 = f38(v2);
    const s0 v11 = f38(v2);
    const std::vector<std::vector<double>> v15 = v11.p1;
    const std::vector<std::vector<double>> v14 = v0.p1;
    const s0 v25 = f38(v0);
    s0 v18 = v0;
    v18.p0 = v15;
    const std::vector<std::vector<double>> v27 = v18.p0;
    const s0 v21 = f38(v18);
    const std::vector<std::vector<double>> v33 = v21.p0;
    v18.p1 = v33;
    s0 v92 = v7;
    v18.p0 = v5;
    v92.p1 = v14;
    const s0 v149 = f38(v92);
    const std::vector<s0> v124 { v2, v25, v92, v149, v149 };
    std::vector<s0> v142 = v124;
    std::vector<s0> v126 = v142;
    std::vector<s0> v105 = v126;
    v92.p1 = v27;
    const s0 v243 = v105[3];
    return v243;
  }
  s2 f16(const s2 &v0) {
    const s2 v19 = f37(v0);
    const s2 v32 = f37(v19);
    const s2 v51 = f37(v32);
    return v51;
  }
  s0 f10(const s0 &v0) {
    const s0 v9 = f38(v0);
    const s0 v14 = f30(v9);
    const std::vector<std::vector<double>> v5 = v14.p1;
    const s0 v2(v5, v5);
    const s0 v33 = f30(v2);
    return v33;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s6>> &v0, const std::vector<s2> &v1, const std::vector<s1> &v2, const double &v3) {
    const std::vector<s2> v4 = f55(v1);
    std::vector<s2> v7 = v4;
    const std::vector<s2> v14 = f55(v7);
    const s2 v11 = v7[0];
    s2 v8 = v11;
    s2 v10 = v8;
    const s2 v28 = f16(v10);
    s2 v13 = v10;
    const s0 v24 = v11.p1;
    const s2 v16 = v4[0];
    const std::vector<std::vector<s1>> v9 = v28.p0;
    const std::vector<std::vector<double>> v19 = v24.p1;
    const s2 v33 = v14[0];
    const std::vector<double> v30 = v19[0];
    const s0 v29 = v28.p1;
    const s2 v17 = f37(v10);
    s0 v23 = v29;
    const std::vector<s2> v49 { v13, v13, v33, v33, v16, v17, v17 };
    const s0 v42 = f38(v24);
    v13.p1 = v23;
    const std::vector<std::vector<double>> v65 = v42.p1;
    const double v59 = v30[0];
    v10.p1 = v23;
    v23 = v24;
    std::vector<s2> v36 = v49;
    std::vector<std::vector<double>> v55 = v65;
    const s0 v45 = v33.p1;
    v8.p1 = v45;
    const s0 v73 = f38(v42);
    v10.p1 = v45;
    v13.p0 = v9;
    const s2 v172 = v36[5];
    v23.p0 = v55;
    v13 = v172;
    const s0 v84 = f10(v42);
    v10.p1 = v73;
    const s2 v175 = f37(v172);
    v8.p1 = v84;
    v7[0] = v175;
    return v59;
  }
  int main() {
    std::vector<std::vector<s6>> v0({ { { { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } }, { { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } }, { { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } } }, { { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } }, { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } }, { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 }, { 40.0 }, { 41.0 } } } } } }, { { { { { { { { { { 42.0 }, { 43.0 }, { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } }, { { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 }, { 52.0 }, { 53.0 } } }, { { { 54.0 }, { 55.0 }, { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } }, { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 }, { 64.0 }, { 65.0 } } } } } }, { { { { { 66.0 }, { 67.0 }, { 68.0 } }, { { 69.0 }, { 70.0 }, { 71.0 } } }, { { { { 72.0 }, { 73.0 }, { 74.0 } }, { { 75.0 }, { 76.0 }, { 77.0 } } }, { { { 78.0 }, { 79.0 }, { 80.0 } }, { { 81.0 }, { 82.0 }, { 83.0 } } }, { { { 84.0 }, { 85.0 }, { 86.0 } }, { { 87.0 }, { 88.0 }, { 89.0 } } } } } } }, { { { 90.0 }, { 91.0 }, { 92.0 } }, { { 93.0 }, { 94.0 }, { 95.0 } } } }, { { { { { { 96.0 }, { 97.0 }, { 98.0 } }, { { 99.0 }, { 100.0 }, { 101.0 } } }, { { { { 102.0 }, { 103.0 }, { 104.0 } }, { { 105.0 }, { 106.0 }, { 107.0 } } }, { { { 108.0 }, { 109.0 }, { 110.0 } }, { { 111.0 }, { 112.0 }, { 113.0 } } }, { { { 114.0 }, { 115.0 }, { 116.0 } }, { { 117.0 }, { 118.0 }, { 119.0 } } } } } } } } } } } } });
    std::vector<s2> v1({ { { { { { { { 120.0 }, { 121.0 }, { 122.0 } }, { { 123.0 }, { 124.0 }, { 125.0 } } }, { { { { 126.0 }, { 127.0 }, { 128.0 } }, { { 129.0 }, { 130.0 }, { 131.0 } } }, { { { 132.0 }, { 133.0 }, { 134.0 } }, { { 135.0 }, { 136.0 }, { 137.0 } } }, { { { 138.0 }, { 139.0 }, { 140.0 } }, { { 141.0 }, { 142.0 }, { 143.0 } } } } } }, { { { { { 144.0 }, { 145.0 }, { 146.0 } }, { { 147.0 }, { 148.0 }, { 149.0 } } }, { { { { 150.0 }, { 151.0 }, { 152.0 } }, { { 153.0 }, { 154.0 }, { 155.0 } } }, { { { 156.0 }, { 157.0 }, { 158.0 } }, { { 159.0 }, { 160.0 }, { 161.0 } } }, { { { 162.0 }, { 163.0 }, { 164.0 } }, { { 165.0 }, { 166.0 }, { 167.0 } } } } } } }, { { { 168.0 }, { 169.0 }, { 170.0 } }, { { 171.0 }, { 172.0 }, { 173.0 } } } } });
    std::vector<s1> v2({ { { { { 174.0 }, { 175.0 }, { 176.0 } }, { { 177.0 }, { 178.0 }, { 179.0 } } }, { { { { 180.0 }, { 181.0 }, { 182.0 } }, { { 183.0 }, { 184.0 }, { 185.0 } } }, { { { 186.0 }, { 187.0 }, { 188.0 } }, { { 189.0 }, { 190.0 }, { 191.0 } } }, { { { 192.0 }, { 193.0 }, { 194.0 } }, { { 195.0 }, { 196.0 }, { 197.0 } } } } } });
    double v3(198.0);
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
